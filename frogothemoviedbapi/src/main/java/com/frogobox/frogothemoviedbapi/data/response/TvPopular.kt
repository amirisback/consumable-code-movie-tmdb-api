package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvPopularResult

data class TvPopular(
    val page: Int?,
    val results: List<TvPopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)