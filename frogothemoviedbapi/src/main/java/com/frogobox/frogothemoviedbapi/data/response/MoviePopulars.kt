package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MoviePopularResult

data class MoviePopulars(
    val page: Int? = null,
    val results: List<MoviePopularResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)