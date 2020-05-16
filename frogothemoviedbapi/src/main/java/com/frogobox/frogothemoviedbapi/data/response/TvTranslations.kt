package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<TvTranslation>?
)