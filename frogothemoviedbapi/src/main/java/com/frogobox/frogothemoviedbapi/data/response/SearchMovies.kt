package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)