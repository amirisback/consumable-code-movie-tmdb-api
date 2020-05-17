package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleTaggedImageResult

data class PeopleTaggedImages(
    val id: Int?,
    val page: Int?,
    val results: List<PeopleTaggedImageResult>?,
    val total_pages: Int?,
    val total_results: Int?
)