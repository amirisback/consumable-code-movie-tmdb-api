package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleCombinedCreditCast
import com.frogobox.frogothemoviedbapi.data.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<PeopleCombinedCreditCast>?,
    val crew: List<PeopleCombinedCreditCrew>?,
    val id: Int?
)