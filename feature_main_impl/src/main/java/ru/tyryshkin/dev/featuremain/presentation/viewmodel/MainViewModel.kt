package ru.tyryshkin.dev.featuremain.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository
import ru.tyryshkin.dev.featuremain.presentation.viewobject.mapper.toMovieVO
import ru.tyryshkin.dev.uikit.presentation.viewobject.ErrorViewObject
import ru.tyryshkin.dev.uikit.presentation.viewobject.LoadingViewObject
import ru.tyryshkin.dev.uikit.presentation.viewobject.ViewObject
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    @Inject
    lateinit var router: Router

    val state = MutableLiveData<List<ViewObject>>()

    fun loadData(): Disposable =
        repository.getAllMovies()
            .doOnSubscribe {
                state.postValue(listOf(LoadingViewObject()))
            }
            .toObservable()
            .map { response ->
                response.results.map { movie ->
                    movie.toMovieVO()
                }
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = { state.postValue(it) },
                onError = { state.postValue(listOf(ErrorViewObject())) }
            )

    fun onBackPressed() {
        router.exit()
    }
}
