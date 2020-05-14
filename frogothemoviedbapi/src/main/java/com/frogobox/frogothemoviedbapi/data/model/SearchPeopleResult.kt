package com.frogobox.frogothemoviedbapi.data.model

import com.frogobox.frogothemoviedbapi.data.model.SearchPeopleKnownFor

data class SearchPeopleResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<SearchPeopleKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)