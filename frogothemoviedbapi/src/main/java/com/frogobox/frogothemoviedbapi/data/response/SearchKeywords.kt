package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SeacrhKeywordResult

data class SearchKeywords(
    val page: Int?,
    val results: List<SeacrhKeywordResult>?,
    val total_pages: Int?,
    val total_results: Int?
)