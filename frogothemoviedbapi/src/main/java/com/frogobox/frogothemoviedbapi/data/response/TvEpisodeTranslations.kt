package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvEpisodeTranslation

data class TvEpisodeTranslations(
    val id: Int?,
    val translations: List<TvEpisodeTranslation>?
)