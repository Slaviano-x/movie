package ru.tyryshkin.dev.featuremain.domain.repository

import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse

interface MovieRepository {
    fun getAllMovies(): MovieListResponse
}
