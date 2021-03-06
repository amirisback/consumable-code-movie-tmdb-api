package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<MovieTranslation>? = null
)