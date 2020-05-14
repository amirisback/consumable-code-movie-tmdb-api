package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SearchMultiResult

data class SearchMulti(
    val page: Int?,
    val results: List<SearchMultiResult>?,
    val total_pages: Int?,
    val total_results: Int?
)