package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeoplePopularResult

data class PeoplePopular(
    val page: Int?,
    val results: List<PeoplePopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)