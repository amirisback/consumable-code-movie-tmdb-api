package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvSeasonsCreditsCast
import com.frogobox.frogothemoviedbapi.data.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<TvSeasonsCreditsCast>?,
    val crew: List<TvSeasonsCreditsCrew>?,
    val id: Int?
)