package ru.tyryshkin.dev.featuremain.data

import io.reactivex.Single
import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository
import ru.tyryshkin.dev.featuremainapi.apiservice.ApiMovieService
import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse
import javax.inject.Inject

private const val apiKey = "JIclpvKLZAKHrCSSpLFcijWaCYzdAsbk"

class MovieRepositoryImpl @Inject constructor(
    private val apiMovieService: ApiMovieService
) : MovieRepository {
    override fun getAllMovies(): Single<MovieListResponse> =
        apiMovieService.getAllMovies(apiKey)
}
