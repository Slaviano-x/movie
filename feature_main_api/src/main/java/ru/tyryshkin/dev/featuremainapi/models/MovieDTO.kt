package ru.tyryshkin.dev.featuremainapi.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieDTO(
    @Json(name = "display_title") val title: String,
    @Json(name = "mpaa_rating") val rating: String,
    @Json(name = "critics_pick") val critics: Int,
    val byline: String,
    val headline: String,
    @Json(name = "summary_short") val summary: String,
    @Json(name = "publication_date") val publicationDate: String,
    @Json(name = "opening_date") val openingDate: String?,
    @Json(name = "date_updated") val updatedDate: String,
    val link: Link,
    val multimedia: Multimedia
)

@JsonClass(generateAdapter = true)
data class Link(
    var type: String,
    var url: String,
    @Json(name = "suggested_link_text") var linkText: String
)

@JsonClass(generateAdapter = true)
data class Multimedia(
    var type: String,
    var src: String,
    val height: Int,
    val width: Int,
)
