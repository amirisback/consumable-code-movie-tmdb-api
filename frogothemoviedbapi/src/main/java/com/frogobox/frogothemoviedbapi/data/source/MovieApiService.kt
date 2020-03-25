package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.*
import com.frogobox.frogothemoviedbapi.data.response.*
import com.frogobox.frogothemoviedbapi.util.MovieConstant
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.readystatesoftware.chuck.ChuckInterceptor
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

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
interface MovieApiService {

    // CERTIFICATIONS
    // Get Movie Certifications
    @GET(MovieUrl.CERTIFICATION_GET_MOVIE)
    fun getMovieCertifications(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Certifications<CertificationMovie>>

    // CERTIFICATIONS
    // Get TV Certifications
    @GET(MovieUrl.CERTIFICATION_GET_TV)
    fun getTvCertifications(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Certifications<CertificationTv>>

    // CHANGES
    // Get Movie Change List
    @GET(MovieUrl.CHANGES_GET_MOVIE)
    fun getMovieChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: String?
    ): Observable<Changes>

    // CHANGES
    // Get TV Change List
    @GET(MovieUrl.CHANGES_GET_TV)
    fun getTvChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: String?
    ): Observable<Changes>

    // CHANGES
    // Get Person Change List
    @GET(MovieUrl.CHANGES_GET_PERSON)
    fun getPersonChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: String?
    ): Observable<Changes>

    // COLLECTION
    // Get Details
    @GET(MovieUrl.COLLECTION_GET_DETAIL)
    fun getCollectionDetails(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsDetail>

    // COLLECTION
    // Get Images
    @GET(MovieUrl.COLLECTION_GET_IMAGES)
    fun getCollectionImages(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsImage>

    // COLLECTION
    // Get Translations
    @GET(MovieUrl.COLLECTION_GET_TRANSLATTIONS)
    fun getCollectionTranslations(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsTranslation>

    // COMPANIES
    // Get Details
    @GET(MovieUrl.COMPANY_GET_DETAIL)
    fun getCompaniesDetails(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesDetail>

    // COMPANIES
    // Get Alternative Names
    @GET(MovieUrl.COMPANY_GET_ALTERNATIVE_NAME)
    fun getCompaniesAlternativeName(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesAlternateName>

    // COMPANIES
    // Get Images
    @GET(MovieUrl.COMPANY_GET_IMAGE)
    fun getCompaniesImage(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesImage>

    // CONFIGURATION
    // Get API Configuration
    @GET(MovieUrl.CONFIGURATION_GET_API_CONFIGURATION)
    fun getConfigurationApi(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<ConfigurationApi>

    // CONFIGURATION
    // Get Countries
    @GET(MovieUrl.CONFIGURATION_GET_COUNTRIES)
    fun getConfigurationCountries(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationCountry>>

    // CONFIGURATION
    // Get Jobs
    @GET(MovieUrl.CONFIGURATION_GET_JOBS)
    fun getConfigurationJobs(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationJob>>

    // CONFIGURATION
    // Get Languages
    @GET(MovieUrl.CONFIGURATION_GET_LANGUAGES)
    fun getConfigurationLanguages(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationLanguage>>

    // CONFIGURATION
    // Get Primary Translations
    @GET(MovieUrl.CONFIGURATION_GET_PRIMARY_TRANSLATIONS)
    fun getConfigurationTranslations(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<String>>

    // CONFIGURATION
    // Get Timezones
    @GET(MovieUrl.CONFIGURATION_GET_TIMEZONES)
    fun getConfigurationTimezones(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationTimezone>>

    companion object Factory {

        private var isUsingChuckInterceptor = false
        private lateinit var context: Context

        fun usingChuckInterceptor(context: Context) {
            isUsingChuckInterceptor = true
            this.context = context
        }

        val getApiService: MovieApiService by lazy {
            val mLoggingInterceptor = HttpLoggingInterceptor()
            mLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val mClient = if (isUsingChuckInterceptor) {
                OkHttpClient.Builder()
                    .addInterceptor(mLoggingInterceptor)
                    .addInterceptor(ChuckInterceptor(context))
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            } else {
                OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            }

            val mRetrofit = Retrofit.Builder()
                .baseUrl(MovieUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mClient)
                .build()

            mRetrofit.create(MovieApiService::class.java)
        }
    }

}