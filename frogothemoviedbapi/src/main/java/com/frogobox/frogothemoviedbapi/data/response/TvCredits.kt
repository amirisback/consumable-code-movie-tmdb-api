package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvCreditsCast
import com.frogobox.frogothemoviedbapi.data.model.TvCreditsCrew

data class TvCredits(
    val cast: List<TvCreditsCast>?,
    val crew: List<TvCreditsCrew>?,
    val id: Int?
)