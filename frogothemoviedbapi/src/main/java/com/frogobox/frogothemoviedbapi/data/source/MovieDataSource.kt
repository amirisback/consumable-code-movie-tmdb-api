package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.base.BaseMovieDataSource
import com.frogobox.frogothemoviedbapi.data.model.*
import com.frogobox.frogothemoviedbapi.data.response.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.source
 *
 */
interface MovieDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationMovie>>
    )

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationTv>>
    )

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsTranslation>
    )

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesImage>
    )

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(apiKey: String, callback: GetRemoteCallback<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationCountry>>
    )

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(apiKey: String, callback: GetRemoteCallback<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationLanguage>>
    )

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(apiKey: String, callback: GetRemoteCallback<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationTimezone>>
    )

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, apiKey: String, callback: GetRemoteCallback<Credits>)

    // DISCOVER
    // Movie Discover
    fun getDiscoverMovie(
        apiKey: String,
        language: String?,
        region: String?,
        sort_by: String?,
        certification_country: String?,
        certification: String?,
        certification_lte: String?,
        certification_gte: String?,
        include_adult: String?,
        include_video: String?,
        page: String?,
        primary_release_year: String?,
        primary_release_date_gte: String?,
        primary_release_date_lte: String?,
        release_date_gte: String?,
        release_date_lte: String?,
        with_release_type: String?,
        year: String?,
        vote_count_gte: String?,
        vote_count_lte: String?,
        vote_average_gte: String?,
        vote_average_lte: String?,
        with_cast: String?,
        with_crew: String?,
        with_people: String?,
        with_companies: String?,
        with_genres: String?,
        without_genres: String?,
        with_keywords: String?,
        without_keywords: String?,
        with_runtime_gte: String?,
        with_runtime_lte: String?,
        with_original_language: String?,
        callback: GetRemoteCallback<Discover<DiscoverMovie>>

    )

    // DISCOVER
    // TV Discover
    fun getDiscoverTv(
        apiKey: String,
        language: String?,
        sort_by: String?,
        air_date_gte: String?,
        air_date_lte: String?,
        first_air_date_gte: String?,
        first_air_date_lte: String?,
        first_air_date_year: String?,
        page: String?,
        timezone: String?,
        vote_average_gte: String?,
        vote_count_gte: String?,
        with_genres: String?,
        with_networks: String?,
        without_genres: String?,
        with_runtime_gte: String?,
        with_runtime_lte: String?,
        include_null_first_air_dates: String?,
        with_original_language: String?,
        without_keywords: String?,
        screened_theatrically: String?,
        with_companies: String?,
        with_keywords: String?,
        callback: GetRemoteCallback<Discover<DiscoverTv>>
    )

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: GetRemoteCallback<Find>
    )

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<Genres>
    )

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: String?,
        callback: GetRemoteCallback<KeywordsMovies>
    )

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: GetRemoteCallback<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: GetRemoteCallback<MovieAccountState>
    )

    // TRENDING
    // Get Trending All
    fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person
    fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingTv>>
    )

    // Response Callback
    interface GetRemoteCallback<T> : BaseMovieDataSource.ResponseCallback<T>

}