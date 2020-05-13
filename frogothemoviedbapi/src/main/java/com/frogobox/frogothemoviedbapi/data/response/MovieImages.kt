package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieBackdrop
import com.frogobox.frogothemoviedbapi.data.model.MoviePoster

data class MovieImages(
    val backdrops: List<MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<MoviePoster>? = null
)