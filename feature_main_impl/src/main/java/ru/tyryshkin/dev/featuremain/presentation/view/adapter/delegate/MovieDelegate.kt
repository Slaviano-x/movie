package ru.tyryshkin.dev.featuremain.presentation.view.adapter.delegate

import com.bumptech.glide.Glide
import ru.tyryshkin.dev.featuremain.databinding.ItemMovieBinding
import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO
import ru.tyryshkin.dev.uikit.presentation.delegate.baseAdapterDelegate

fun movieDelegate() = baseAdapterDelegate<MovieVO, ItemMovieBinding>(
    { inflater, parent ->
        ItemMovieBinding.inflate(inflater, parent, false)
    }
) {
    bind {
        with(binding) {
            Glide.with(context).load(item.image).into(image)
            title.text = item.name
            summary.text = item.description
        }
    }
}
