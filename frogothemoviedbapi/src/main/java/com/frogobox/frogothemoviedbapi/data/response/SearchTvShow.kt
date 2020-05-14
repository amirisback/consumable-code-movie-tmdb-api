package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SearchTvShowResult

data class SearchTvShow(
    val page: Int?,
    val results: List<SearchTvShowResult>?,
    val total_pages: Int?,
    val total_results: Int?
)