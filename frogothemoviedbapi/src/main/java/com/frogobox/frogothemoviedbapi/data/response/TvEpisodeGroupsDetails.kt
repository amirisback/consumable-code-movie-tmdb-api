package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeGroupsDetailGroup
import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeGroupsDetailNetwork

data class TvEpisodeGroupsDetails(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val groups: List<TvEpisodeGroupsDetailGroup>?,
    val id: String?,
    val name: String?,
    val network: TvEpisodeGroupsDetailNetwork?,
    val type: Int?
)