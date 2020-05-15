package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvDetailsCreatedBy
import com.frogobox.frogothemoviedbapi.data.model.TvDetailsGenre
import com.frogobox.frogothemoviedbapi.data.model.TvDetailsLastEpisodeToAir
import com.frogobox.frogothemoviedbapi.data.model.TvDetailsNetwork
import com.frogobox.frogothemoviedbapi.data.model.TvDetailsProductionCompany
import com.frogobox.frogothemoviedbapi.data.model.TvDetailsSeason

data class TvDetails(
    val backdrop_path: String?,
    val created_by: List<TvDetailsCreatedBy>?,
    val episode_run_time: List<Int>?,
    val first_air_date: String?,
    val genres: List<TvDetailsGenre>?,
    val homepage: String?,
    val id: Int?,
    val in_production: Boolean?,
    val languages: List<String>?,
    val last_air_date: String?,
    val last_episode_to_air: TvDetailsLastEpisodeToAir?,
    val name: String?,
    val networks: List<TvDetailsNetwork>?,
    val next_episode_to_air: Any?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val production_companies: List<TvDetailsProductionCompany>?,
    val seasons: List<TvDetailsSeason>?,
    val status: String?,
    val type: String?,
    val vote_average: Double?,
    val vote_count: Int?
)