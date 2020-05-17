package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeVideoResult

data class TvEpisodeVideos(
    val id: Int?,
    val results: List<TvEpisodeVideoResult>?
)