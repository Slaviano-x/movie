package ru.tyryshkin.dev.featuremain.presentation.viewobject.mapper

import ru.tyryshkin.dev.featuremain.presentation.viewobject.model.MovieVO
import ru.tyryshkin.dev.featuremainapi.models.MovieDTO

fun MovieDTO.toMovieVO() =
    MovieVO(
        name = title,
        image = multimedia.src,
        description = this.summary
    )
