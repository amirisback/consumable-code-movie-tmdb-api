package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieUpcomingDates
import com.frogobox.frogothemoviedbapi.data.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: MovieUpcomingDates?,
    val page: Int?,
    val results: List<MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)