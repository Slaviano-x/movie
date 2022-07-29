package ru.tyryshkin.dev.featuremain.presentation.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import ru.tyryshkin.dev.featuremain.presentation.view.adapter.delegate.movieDelegate
import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO

class MovieAdapter : AsyncListDifferDelegationAdapter<MovieVO>(Companion) {

    init {
        delegatesManager.apply {
            addDelegate(movieDelegate())
        }
    }

    private companion object : DiffUtil.ItemCallback<MovieVO>() {
        override fun areItemsTheSame(
            oldItem: MovieVO,
            newItem: MovieVO
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: MovieVO,
            newItem: MovieVO
        ): Boolean {
            return areItemsTheSame(oldItem, newItem) // TODO
        }
    }
}
