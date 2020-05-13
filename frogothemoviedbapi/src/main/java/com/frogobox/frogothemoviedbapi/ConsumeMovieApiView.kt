package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
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
 * com.frogobox.frogothemoviedbapi
 *
 */
interface ConsumeMovieApiView {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(callback: MovieResultCallback<Certifications<CertificationMovie>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(callback: MovieResultCallback<Certifications<CertificationTv>>)

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    )

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsTranslation>
    )

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        callback: MovieResultCallback<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        callback: MovieResultCallback<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        callback: MovieResultCallback<CompaniesImage>
    )

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(callback: MovieResultCallback<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(callback: MovieResultCallback<List<ConfigurationCountry>>)

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(callback: MovieResultCallback<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(callback: MovieResultCallback<List<ConfigurationLanguage>>)

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(callback: MovieResultCallback<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(callback: MovieResultCallback<List<ConfigurationTimezone>>)

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, callback: MovieResultCallback<Credits>)

    // DISCOVER
    // Movie Discover
    fun getDiscoverMovie(
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
        callback: MovieResultCallback<Discover<DiscoverMovie>>

    )

    // DISCOVER
    // TV Discover
    fun getDiscoverTv(
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
        callback: MovieResultCallback<Discover<DiscoverTv>>
    )

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: MovieResultCallback<Find>
    )

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        language: String?,
        callback: MovieResultCallback<Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        language: String?,
        callback: MovieResultCallback<Genres>
    )

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        callback: MovieResultCallback<KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: String?,
        callback: MovieResultCallback<KeywordsMovies>
    )

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: MovieResultCallback<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: MovieResultCallback<MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: MovieResultCallback<MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: MovieResultCallback<MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        callback: MovieResultCallback<MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        callback: MovieResultCallback<MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: MovieResultCallback<MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        callback: MovieResultCallback<MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        callback: MovieResultCallback<MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: MovieResultCallback<MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        callback: MovieResultCallback<MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        language: String?,
        callback: MovieResultCallback<MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieUpcoming>
    )

    // TRENDING
    // Get Trending All Day
    fun getTrendingAllDay(
        callback: MovieResultCallback<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending All Week
    fun getTrendingAllWeek(
        callback: MovieResultCallback<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie Day
    fun getTrendingMovieDay(
        callback: MovieResultCallback<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Movie Week
    fun getTrendingMovieWeek(
        callback: MovieResultCallback<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person Day
    fun getTrendingPersonDay(
        callback: MovieResultCallback<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending Person Week
    fun getTrendingPersonWeek(
        callback: MovieResultCallback<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending TV Day
    fun getTrendingTvDay(
        callback: MovieResultCallback<Trending<TrendingTv>>
    )

    // TRENDING
    // Get Trending TV Week
    fun getTrendingTvWeek(
        callback: MovieResultCallback<Trending<TrendingTv>>
    )

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        callback: MovieResultCallback<Reviews>
    )

    // NETWORKS
    // Get Details
    fun getNetworkDetail(
        network_id: Int,
        callback: MovieResultCallback<NetworkDetail>
    )

    // NETWORKS
    // Get Alternative Names
    fun getNetworkAlternativeName(
        network_id: Int,
        callback: MovieResultCallback<NetworkAlternativeName>
    )

    // NETWORKS
    // Get Images
    fun getNetworkImage(
        network_id: Int,
        callback: MovieResultCallback<NetworkImage>
    )

}