package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<TvVideosResult>?
)