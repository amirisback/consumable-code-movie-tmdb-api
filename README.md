# consumable-code-movie-tmdb-api By AmirIsBack
- v1.0.7 - Development
- Stable Version

# About This Project
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

# Special From This Project
Simple code and reusable data

# Fecthing Data Library
- Retrofit
- RxJava
- OkHttp
- Chuck Interceptor

# Documentation The Movie DB API
https://developers.themoviedb.org/3/getting-started/introduction

# Function Main From This Project

## CHUCK INTERCEPTOR

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

## CERTIFICATIONS

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(callback: MovieResultCallback<Certifications<CertificationMovie>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(callback: MovieResultCallback<Certifications<CertificationTv>>)

## CHANGES

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

## COLLECTION

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

## COMPANIES

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

## CONFIGURATION

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

## CREDITS

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, callback: MovieResultCallback<Credits>)
    
## DISCOVER
    
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
    
## FIND    
  
    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: MovieResultCallback<Find>
    )

## GENRES

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

## KEYWORDS
    
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
    
## REVIEWS

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        callback: MovieResultCallback<Reviews>
    )
    
## TRENDING

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

## NETWORKS

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


# Development ---------
    
## MOVIES
    
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
    
## LIST
## PEOPLE
## SEARCH
## TV
## TV SEASONS
## TV EPISODES
## TV EPISODE GROUPS 
    
# Android Library Version (build.gradle)
- ext.kotlin_version = '1.3.71'
- classpath 'com.android.tools.build:gradle:3.6.1'
- compileSdkVersion 29
- buildToolsVersion "29.0.3"
- minSdkVersion 21

# Automatically Using This Permission
    
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />


# Version Release
This Is Latest Release

    $version_release = 1.0.7

What's New??

    * Add: Keyword, Bug Fixed *

# How To Use This Project
<h3>Step 1. Add the JitPack repository to your build file</h3>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
<h3>Step 2. Add the dependency</h3>

	dependencies {
	        // library consumable code movie tmdb api
            implementation 'com.github.amirisback:consumable-code-movie-tmdb-api:$version_release'
	}
	
<h3>Step 3. Declaration ConsumeMovieApi</h3>

    val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY) // your api_key
    consumeMovieApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
    consumeMovieApi.getMovieChangeList(
        null,
        null,
        null,
        object : MovieResultCallback<Changes> {
            override fun getResultData(data: Changes) {
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *
            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {
                // failed result
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hiding your progress view
            }
        })
	


# Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

# Attention !!!
Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account
- If you like this library, please help me / you can donate to buy patreon services