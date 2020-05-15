package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<TvEpisodeGroupsResult>?
)