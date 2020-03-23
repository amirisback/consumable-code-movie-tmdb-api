# consumable-code-movie-tmdb-api By AmirIsBack
- v1.0.0 - Development
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

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(callback: MovieResultCallback<Certifications<MovieCertification>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(callback: MovieResultCallback<Certifications<TvCertification>>)

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
        callback: MovieResultCallback<CollectionTranslation>
    )

# Android Library Version (build.gradle)
- ext.kotlin_version = '1.3.70'
- classpath 'com.android.tools.build:gradle:3.6.1'
- compileSdkVersion 29
- buildToolsVersion "29.0.3"
- minSdkVersion 21

# Version Release
This Is Latest Release

    $version_release = 1.0.0

What's New??

    * consumable-code-movie-tmdb-api *

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
	
<h3>Step 3. Declaration ConsumeTheSportDbApi</h3>

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