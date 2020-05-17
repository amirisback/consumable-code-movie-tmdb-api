package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeChange

data class TvEpisodeChanges(
    val changes: List<TvEpisodeChange>?
)