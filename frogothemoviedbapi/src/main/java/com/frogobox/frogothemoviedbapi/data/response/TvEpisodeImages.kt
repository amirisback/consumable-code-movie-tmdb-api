package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<TvEpisodeImageStill>?
)