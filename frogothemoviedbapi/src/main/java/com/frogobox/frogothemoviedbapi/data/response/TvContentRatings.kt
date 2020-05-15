package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<TvContentRatingsResult>?
)