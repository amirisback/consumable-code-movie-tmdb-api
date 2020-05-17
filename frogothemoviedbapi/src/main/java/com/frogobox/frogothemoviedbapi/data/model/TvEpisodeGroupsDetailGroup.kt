package com.frogobox.frogothemoviedbapi.data.model

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeGroupsDetailEpisode

data class TvEpisodeGroupsDetailGroup(
    val episodes: List<TvEpisodeGroupsDetailEpisode>?,
    val id: String?,
    val locked: Boolean?,
    val name: String?,
    val order: Int?
)