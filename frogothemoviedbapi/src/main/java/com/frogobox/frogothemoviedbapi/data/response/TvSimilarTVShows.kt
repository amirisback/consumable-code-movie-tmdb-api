package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvSimilarTVShowsResult

data class TvSimilarTVShows(
    val page: Int?,
    val results: List<TvSimilarTVShowsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)