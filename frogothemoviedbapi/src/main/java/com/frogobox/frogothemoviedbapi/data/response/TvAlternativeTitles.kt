package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvAlternativeTitlesResult

data class TvAlternativeTitles(
    val id: Int?,
    val results: List<TvAlternativeTitlesResult>?
)