package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<PeopleTranslation>?
)