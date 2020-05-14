package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.SearchPeopleResult

data class SearchPeople(
    val page: Int?,
    val results: List<SearchPeopleResult>?,
    val total_pages: Int?,
    val total_results: Int?
)