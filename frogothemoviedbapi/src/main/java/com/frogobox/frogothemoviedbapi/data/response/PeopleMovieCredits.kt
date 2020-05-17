package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleMovieCreditCast
import com.frogobox.frogothemoviedbapi.data.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<PeopleMovieCreditCast>?,
    val crew: List<PeopleMovieCreditCrew>?,
    val id: Int?
)