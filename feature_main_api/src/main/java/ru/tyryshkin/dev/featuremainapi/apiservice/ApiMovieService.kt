package ru.tyryshkin.dev.featuremainapi.apiservice

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse

interface ApiMovieService {
    @GET("all.json")
    fun getAllMovies(
        @Query("api-key") apiKey: String,
    ): Single<MovieListResponse>
}
