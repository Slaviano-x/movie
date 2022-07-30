package ru.tyryshkin.dev.featuremain.presentation.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import ru.tyryshkin.dev.featuremain.presentation.view.adapter.delegate.movieDelegate
import ru.tyryshkin.dev.uikit.presentation.delegate.errorViewObjectDelegate
import ru.tyryshkin.dev.uikit.presentation.delegate.loadingViewObjectDelegate
import ru.tyryshkin.dev.uikit.presentation.viewobject.ViewObject

class MovieAdapter(
    onRetryClickListener: () -> Unit,
) : AsyncListDifferDelegationAdapter<ViewObject>(Companion) {

    init {
        delegatesManager.apply {
            addDelegate(movieDelegate())
            addDelegate(loadingViewObjectDelegate())
            addDelegate(errorViewObjectDelegate(onRetryClickListener))
        }
    }

    private companion object : DiffUtil.ItemCallback<ViewObject>() {
        override fun areItemsTheSame(
            oldItem: ViewObject,
            newItem: ViewObject
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: ViewObject,
            newItem: ViewObject
        ): Boolean {
            return areItemsTheSame(oldItem, newItem)
        }
    }
}
