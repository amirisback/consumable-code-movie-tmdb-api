package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieNowPlayingDates
import com.frogobox.frogothemoviedbapi.data.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)