package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)