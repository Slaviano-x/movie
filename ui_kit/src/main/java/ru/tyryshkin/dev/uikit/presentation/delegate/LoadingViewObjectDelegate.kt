package ru.tyryshkin.dev.uikit.presentation.delegate

import ru.tyryshkin.dev.uikit.databinding.ItemLoadingBinding
import ru.tyryshkin.dev.uikit.presentation.viewobject.LoadingViewObject

fun loadingViewObjectDelegate() =
    baseAdapterDelegate<LoadingViewObject, ItemLoadingBinding>(
        { layoutInflater, parent ->
            ItemLoadingBinding.inflate(layoutInflater, parent, false)
        }
    ) {
    }
