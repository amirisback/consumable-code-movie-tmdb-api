package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvAiringTodayResult

data class TvAiringToday(
    val page: Int?,
    val results: List<TvAiringTodayResult>?,
    val total_pages: Int?,
    val total_results: Int?
)