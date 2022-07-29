package ru.tyryshkin.dev.featuremain.presentation.view.adapter.delegate

import com.bumptech.glide.Glide
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import ru.tyryshkin.dev.featuremain.databinding.ItemMovieBinding
import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO

fun movieDelegate() = adapterDelegateViewBinding<MovieVO, MovieVO, ItemMovieBinding>(
{ inflater, parent ->
    ItemMovieBinding.inflate(inflater, parent, false)
}
) {
    bind {
        with(binding) {
            Glide.with(context).load(item.image).into(image)
            title.text = item.name
        }
    }
}
