package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SearchCollectionResult

data class SearchCollections(
    val page: Int?,
    val results: List<SearchCollectionResult>?,
    val total_pages: Int?,
    val total_results: Int?
)