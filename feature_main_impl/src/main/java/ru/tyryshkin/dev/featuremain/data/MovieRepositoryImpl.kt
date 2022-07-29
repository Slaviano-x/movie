package ru.tyryshkin.dev.featuremain.data

import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository
import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse

class MovieRepositoryImpl: MovieRepository {
    override fun getAllMovies(): MovieListResponse {
        TODO("Not yet implemented")
    }
}
