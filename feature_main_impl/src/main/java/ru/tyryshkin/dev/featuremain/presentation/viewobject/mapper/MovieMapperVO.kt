package ru.tyryshkin.dev.featuremain.presentation.viewobject.mapper

import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO
import ru.tyryshkin.dev.featuremainapi.models.MovieDTO

fun MovieDTO.toMovieVO() =
    MovieVO(
        id = id,
        name = name,
        image = image,
        description = description
    )
