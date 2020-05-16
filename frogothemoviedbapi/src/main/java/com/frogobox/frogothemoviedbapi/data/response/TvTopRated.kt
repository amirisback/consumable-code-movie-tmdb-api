package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvTopRatedResult

data class TvTopRated(
    val page: Int?,
    val results: List<TvTopRatedResult>?,
    val total_pages: Int?,
    val total_results: Int?
)