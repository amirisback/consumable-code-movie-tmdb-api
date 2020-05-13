package com.frogobox.frogothemoviedbapi.data.model

data class MovieTranslation(
    val `data`: MovieTranslationData,
    val english_name: String,
    val iso_3166_1: String,
    val iso_639_1: String,
    val name: String
)