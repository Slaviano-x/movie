package ru.tyryshkin.dev.featuremain.data

import javax.inject.Inject
import javax.inject.Singleton
import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository
import ru.tyryshkin.dev.featuremainapi.models.MovieDTO
import ru.tyryshkin.dev.featuremainapi.models.MovieListResponse

@Singleton
class MockMovieRepositoryImpl @Inject constructor() : MovieRepository {
    override fun getAllMovies(): MovieListResponse {
        return MovieListResponse(
            listOf(
                MovieDTO(
                    1,
                    "Зеленая миля",
                    "https://irecommend.ru/sites/default/files/imagecache/copyright1/user-images/240977/GUXNlN2cx0IdeIkkWLhEdA.jpg",
                    ""
                ),
                MovieDTO(
                    2,
                    "Список Шиндлера",
                    "https://upload.wikimedia.org/wikipedia/ru/3/38/Schindler%27s_List_movie.jpg",
                    ""
                ),
                MovieDTO(
                    3,
                    "Побег из шоушенка",
                    "https://upload.wikimedia.org/wikipedia/ru/d/de/Movie_poster_the_shawshank_redemption.jpg",
                    ""
                )
            )
        )
    }
}
