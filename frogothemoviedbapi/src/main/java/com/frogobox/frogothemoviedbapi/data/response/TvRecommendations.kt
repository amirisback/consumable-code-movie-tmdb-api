package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvRecommendationsResult

data class TvRecommendations(
    val page: Int?,
    val results: List<TvRecommendationsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)