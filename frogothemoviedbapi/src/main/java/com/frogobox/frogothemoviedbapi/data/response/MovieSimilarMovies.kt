package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieSimilarMovieResult

data class MovieSimilarMovies(
    val page: Int? = null,
    val results: List<MovieSimilarMovieResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)