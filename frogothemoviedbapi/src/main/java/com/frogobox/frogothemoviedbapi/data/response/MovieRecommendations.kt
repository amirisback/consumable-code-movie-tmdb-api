package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieRecommendationResult

data class MovieRecommendations(
    val page: Int? = null,
    val results: List<MovieRecommendationResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)