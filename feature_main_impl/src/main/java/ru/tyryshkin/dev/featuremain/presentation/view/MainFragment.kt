package ru.tyryshkin.dev.featuremain.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import ru.tyryshkin.dev.base.BaseFragment
import ru.tyryshkin.dev.featuremain.R
import ru.tyryshkin.dev.featuremain.databinding.FragmentMainBinding
import ru.tyryshkin.dev.featuremain.presentation.view.adapter.MovieAdapter
import ru.tyryshkin.dev.featuremain.presentation.viewmodel.MainViewModel

@AndroidEntryPoint
class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val viewModel by viewModels<MainViewModel>()
    private val binding by viewBinding<FragmentMainBinding>()

    private val adapter by lazy {
        MovieAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.state.observe(viewLifecycleOwner, adapter::setItems)
        initViews()
    }

    private fun initViews() {
        binding.movieList.adapter = adapter
    }

    override fun onBackPressed() {
        viewModel.onBackPressed()
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
