package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<ResultReleaseDate>? = null
)