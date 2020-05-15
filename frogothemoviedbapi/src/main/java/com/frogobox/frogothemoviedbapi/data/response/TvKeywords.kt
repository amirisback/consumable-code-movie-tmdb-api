package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<TvKeywordsResult>?
)