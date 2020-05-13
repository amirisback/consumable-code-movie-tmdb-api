package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieKeyword

data class MovieKeywords(
    val id: Int,
    val keywords: List<MovieKeyword>
)