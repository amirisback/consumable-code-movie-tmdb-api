package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.PeopleChange

data class PeopleChanges(
    val changes: List<PeopleChange>?
)