package ru.tyryshkin.dev.featuremainapi.models

data class MovieDTO(
    val id: Long,
    val name: String,
    val image: String,
    val description: String
)
