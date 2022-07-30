package ru.tyryshkin.dev.featuremainapi.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieListResponse(
    val status: String,
    val copyright: String,
    @Json(name = "has_more") val hasMore: Boolean,
    @Json(name = "num_result") val numResult: Int?,
    val results: List<MovieDTO>
)
