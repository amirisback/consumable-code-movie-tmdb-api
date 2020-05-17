package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleTvCreditCast
import com.frogobox.frogothemoviedbapi.data.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<PeopleTvCreditCast>?,
    val crew: List<PeopleTvCreditCrew>?,
    val id: Int?
)