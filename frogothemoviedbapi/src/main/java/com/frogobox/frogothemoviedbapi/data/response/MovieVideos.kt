package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<MovieVideo>? = null
)