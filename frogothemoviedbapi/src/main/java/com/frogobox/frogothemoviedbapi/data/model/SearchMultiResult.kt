package com.frogobox.frogothemoviedbapi.data.model

import com.frogobox.frogothemoviedbapi.data.model.SearchMultiKnownFor

data class SearchMultiResult(
    val adult: Boolean?,
    val backdrop_path: Any?,
    val first_air_date: String?,
    val genre_ids: List<Int>?,
    val id: Int?,
    val known_for: List<SearchMultiKnownFor>?,
    val media_type: String?,
    val name: String?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val original_title: String?,
    val overview: String?,
    val popularity: Int?,
    val poster_path: Any?,
    val profile_path: String?,
    val release_date: String?,
    val title: String?,
    val video: Boolean?,
    val vote_average: Int?,
    val vote_count: Int?
)