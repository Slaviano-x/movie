package ru.tyryshkin.dev.featuremain.domain.repository

import io.reactivex.Single
import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse

interface MovieRepository {
    fun getAllMovies(): Single<MovieListResponse>
}
