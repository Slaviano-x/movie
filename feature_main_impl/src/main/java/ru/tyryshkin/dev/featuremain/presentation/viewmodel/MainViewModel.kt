package ru.tyryshkin.dev.featuremain.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository
import ru.tyryshkin.dev.featuremain.presentation.viewobject.mapper.toMovieVO
import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MovieRepository
): ViewModel() {

    @Inject
    lateinit var router: Router

    val state = MutableLiveData<List<MovieVO>>()

    init {
        loadData()
    }

    private fun loadData() {
        state.postValue(
            repository.getAllMovies().list.map { movieDTO ->
                movieDTO.toMovieVO()
            }
        )
    }

    fun onBackPressed() {
        router.exit()
    }
}
