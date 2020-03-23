package com.frogobox.frogothemoviedbapi.util

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
 * com.frogobox.frogothemoviedbapi.util
 *
 */
class MovieUrl {

    companion object {

        const val BASE_URL = "https://api.themoviedb.org/"
        const val BASE_LANG = "en-US"
        const val API_KEY = "5e922c3d4b1b0e96fffcc6b0b395878f"
        const val VERSION_API_3 = "3"
        const val VERSION_API_4 = "4"

        // CERTIFICATION
        const val CERTIFICATION_MOVIE = "$VERSION_API_3/certification/movie/list"
        const val CERTIFICATION_TV = "$VERSION_API_3/certification/tv/list"

        // CHANGES
        const val CHANGES_MOVIE = "$VERSION_API_3/movie/changes"
        const val CHANGES_TV = "$VERSION_API_3/tv/changes"
        const val CHANGES_PERSON = "$VERSION_API_3/person/changes"

        // COLLECTION
        const val COLLECTION_DETAIL = "$VERSION_API_3/collection/{collection_id}"
        const val COLLECTION_IMAGES = "$VERSION_API_3/collection/{collection_id}/images"
        const val COLLECTION_TRANSLATTIONS =
            "$VERSION_API_3/collection/{collection_id}/translations"

        // COMPANIES
        const val COMPANY_DETAIL = "$VERSION_API_3/company/{company_id}"
        const val COMPANY_ALTERNATIVE_NAME = "$VERSION_API_3/company/{company_id}/alternative_names"
        const val COMPANY_IMAGE = "$VERSION_API_3/company/{company_id}/images"

        // CONFIGURATION
        const val CONFIGURATION_API_CONFIGURATION = "$VERSION_API_3/configuration"
        const val CONFIGURATION_COUNTRIES = "$VERSION_API_3/configuration/countries"
        const val CONFIGURATION_JOBS = "$VERSION_API_3/configuration/jobs"
        const val CONFIGURATION_LANGUAGES = "$VERSION_API_3/configuration/languages"
        const val CONFIGURATION_PRIMARY_TRANSLATIONS =
            "$VERSION_API_3/configuration/primary_translations"
        const val CONFIGURATION_TIMEZONES = "$VERSION_API_3/configuration/timezones"

        // CREDITS
        const val CREDITS_DETAILS = "$VERSION_API_3/credit/{credit_id}"

        // DISCOVER
        const val DISCOVER_MOVIE = "$VERSION_API_3/discover/movie"
        const val DISCOVER_TV = "$VERSION_API_3/discover/tv"

        // FIND
        const val FIND_ID = "$VERSION_API_3/find/{external_id}"

        // GENRES
        const val GENRES_MOVIES = "$VERSION_API_3/genre/movie/list"
        const val GENRES_TV = "$VERSION_API_3/genre/tv/list"

        // GUEST SESSIONS
        const val GUEST_SESSIONS_RATED_MOVIES =
            "$VERSION_API_3/guest_session/{guest_session_id}/rated/movies"
        const val GUEST_SESSIONS_RATED_TV_SHOWS =
            "$VERSION_API_3/guest_session/{guest_session_id}/rated/tv"
        const val GUEST_SESSIONS_RATED_TV_EPISODE =
            "$VERSION_API_3/guest_session/{guest_session_id}/rated/tv/episodes"

        // KEYWORDS
        const val KEYWORDS_DETAILS = "$VERSION_API_3/keyword/{keyword_id}"
        const val KEYWORDS_MOVIES = "$VERSION_API_3/keyword/{keyword_id}/movies"

        // LISTS
        const val LISTS_DETAILS = "$VERSION_API_3/list/{list_id}"
        const val LISTS_ITEM_STATUS = "$VERSION_API_3/list/{list_id}/item_status"

        // MOVIES
        const val MOVIES_DETAILS = "$VERSION_API_3/movie/{movie_id}"
        const val MOVIES_ACCOUNT_STATES = "$VERSION_API_3/movie/{movie_id}/account_states"
        const val MOVIES_ALTERNATIVE_TITLE = "$VERSION_API_3/movie/{movie_id}/alternative_titles"
        const val MOVIES_CHANGES = "$VERSION_API_3/movie/{movie_id}/changes"
        const val MOVIES_CREDITS = "$VERSION_API_3/movie/{movie_id}/credits"
        const val MOVIES_EXTERNAL_IDS = "$VERSION_API_3/movie/{movie_id}/external_ids"
        const val MOVIES_IMAGES = "$VERSION_API_3/movie/{movie_id}/images"
        const val MOVIES_KEYWORDS = "$VERSION_API_3/movie/{movie_id}/keywords"
        const val MOVIES_RELEASE_DATE = "$VERSION_API_3/movie/{movie_id}/release_dates"
        const val MOVIES_VIDEOS = "$VERSION_API_3/movie/{movie_id}/videos"
        const val MOVIES_TRANSLATIONS = "$VERSION_API_3/movie/{movie_id}/translations"
        const val MOVIES_RECOMENDATIONS = "$VERSION_API_3/movie/{movie_id}/recommendations"
        const val MOVIES_SIMILAR_MOVIES = "$VERSION_API_3/movie/{movie_id}/similar"
        const val MOVIES_REVIEWS = "$VERSION_API_3/movie/{movie_id}/reviews"
        const val MOVIES_LIST = "$VERSION_API_3/movie/{movie_id}/lists"
        const val MOVIES_RATE_MOVIE = "$VERSION_API_3/movie/{movie_id}/rating"
        const val MOVIES_DELETE_RATING = "$VERSION_API_3/movie/{movie_id}/rating"
        const val MOVIES_LATEST = "$VERSION_API_3/movie/latest"
        const val MOVIES_NOW_PLAYING = "$VERSION_API_3/movie/now_playing"
        const val MOVIES_POPULAR = "$VERSION_API_3/movie/popular"
        const val MOVIES_TOP_RATED = "$VERSION_API_3/movie/top_rated"
        const val MOVIES_UPCOMING = "$VERSION_API_3/movie/upcoming"

        // NETWORKS
        const val NETWORKS_DETAILS = "$VERSION_API_3/network/{network_id}"
        const val NETWORKS_ALTERNATIVE_NAMES = "$VERSION_API_3/network/{network_id}/alternative_names"
        const val NETWORKS_IMAGES = "$VERSION_API_3/network/{network_id}/images"

        // TRENDING
        const val TRENDING = "$VERSION_API_3/trending/{media_type}/{time_window}"

        // PEOPLE
        const val PEOPLE_ = "$VERSION_API_3"


        // REVIEWS
        const val REVIEWS_DETAILS = "$VERSION_API_3/review/{review_id}"

        // SEARCH
        const val SEARCH_ = "$VERSION_API_3"

        // TV
        const val TV_ = "$VERSION_API_3"

        // TV SEASONS
        const val TV_SEASONS_ = "$VERSION_API_3"

        // TV EPISODES
        const val TV_EPISODES_ = "$VERSION_API_3"

        // TV EPISODES GROUPS
        const val TV_EPISODES_GROUPS_DETAIL = "$VERSION_API_3/tv/episode_group/{id}"

    }

}