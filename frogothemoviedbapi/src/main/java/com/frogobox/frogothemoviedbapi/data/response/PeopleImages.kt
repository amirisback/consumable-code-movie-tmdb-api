package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<PeopleImageProfile>?
)