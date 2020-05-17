package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeAccountStateCast
import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeCreditCrew
import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<TvEpisodeAccountStateCast>?,
    val crew: List<TvEpisodeCreditCrew>?,
    val guest_stars: List<TvEpisodeCreditGuestStar>?,
    val id: Int?
)