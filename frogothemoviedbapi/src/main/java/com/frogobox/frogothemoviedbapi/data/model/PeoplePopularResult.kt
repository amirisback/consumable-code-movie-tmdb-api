package com.frogobox.frogothemoviedbapi.data.model

import com.frogobox.frogothemoviedbapi.data.model.PeoplePopularKnownFor

data class PeoplePopularResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<PeoplePopularKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)