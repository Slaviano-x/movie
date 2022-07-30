package ru.tyryshkin.dev.featuremain.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.disposables.Disposable
import ru.tyryshkin.dev.base.BaseFragment
import ru.tyryshkin.dev.featuremain.R
import ru.tyryshkin.dev.featuremain.databinding.FragmentMainBinding
import ru.tyryshkin.dev.featuremain.presentation.view.adapter.MovieAdapter
import ru.tyryshkin.dev.featuremain.presentation.viewmodel.MainViewModel

@AndroidEntryPoint
class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val viewModel by viewModels<MainViewModel>()
    private val binding by viewBinding<FragmentMainBinding>()

    private val adapter by lazy { MovieAdapter(::onRetryClick,) }

    private var disposable: Disposable? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.state.observe(viewLifecycleOwner, adapter::setItems)
        disposable = viewModel.loadData()
        initViews()
    }

    override fun onPause() {
        super.onPause()
        disposable?.dispose()
    }

    override fun onBackPressed() {
        viewModel.onBackPressed()
    }

    private fun initViews() {
        binding.movieList.adapter = adapter
    }

    private fun onRetryClick() {
        viewModel.loadData()
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
