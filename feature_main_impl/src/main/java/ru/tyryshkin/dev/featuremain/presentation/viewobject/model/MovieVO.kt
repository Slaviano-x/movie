package ru.tyryshkin.dev.featuremain.presentation.viewobject.model

import ru.tyryshkin.dev.uikit.presentation.viewobject.ViewObject

data class MovieVO(
    val name: String,
    val image: String,
    val description: String
) : ViewObject
