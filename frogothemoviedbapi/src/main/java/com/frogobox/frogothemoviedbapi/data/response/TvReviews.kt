package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvReviewsResult

data class TvReviews(
    val id: Int?,
    val page: Int?,
    val results: List<TvReviewsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)