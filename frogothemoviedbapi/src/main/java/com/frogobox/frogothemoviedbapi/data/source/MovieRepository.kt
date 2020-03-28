package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
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
class MovieRepository(private val remoteDataSource: MovieRemoteDataSource) : MovieDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>>
    ) {
        remoteDataSource.getMovieCertifications(apiKey, callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>>
    ) {
        remoteDataSource.getTvCertifications(apiKey, callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getMovieChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getTvChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getPersonChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsDetail>
    ) {
        remoteDataSource.getCollectionDetails(collection_id, apiKey, language, callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsImage>
    ) {
        remoteDataSource.getCollectionImages(collection_id, apiKey, language, callback)
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsTranslation>
    ) {
        remoteDataSource.getCollectionTranslations(collection_id, apiKey, language, callback)
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesDetail>
    ) {
        remoteDataSource.getCompaniesDetails(company_id, apiKey, callback)
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesAlternateName>
    ) {
        remoteDataSource.getCompaniesAlternativeName(company_id, apiKey, callback)
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesImage>
    ) {
        remoteDataSource.getCompaniesImage(company_id, apiKey, callback)
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<ConfigurationApi>
    ) {
        remoteDataSource.getConfigurationApi(apiKey, callback)
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>>
    ) {
        remoteDataSource.getConfigurationCountries(apiKey, callback)
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationJob>>
    ) {
        remoteDataSource.getConfigurationJobs(apiKey, callback)
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>>
    ) {
        remoteDataSource.getConfigurationLanguages(apiKey, callback)
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<String>>
    ) {
        remoteDataSource.getConfigurationTranslations(apiKey, callback)
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>>
    ) {
        remoteDataSource.getConfigurationTimezones(apiKey, callback)
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Credits>
    ) {
        remoteDataSource.getCreditsDetails(credit_id, apiKey, callback)
    }

    override fun getDiscoverMovie(
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>>
    ) {
        remoteDataSource.getDiscoverMovie(
            apiKey,
            language,
            region,
            sort_by,
            certification_country,
            certification,
            certification_lte,
            certification_gte,
            include_adult,
            include_video,
            page,
            primary_release_year,
            primary_release_date_gte,
            primary_release_date_lte,
            release_date_gte,
            release_date_lte,
            with_release_type,
            year,
            vote_count_gte,
            vote_count_lte,
            vote_average_gte,
            vote_average_lte,
            with_cast,
            with_crew,
            with_people,
            with_companies,
            with_genres,
            without_genres,
            with_keywords,
            without_keywords,
            with_runtime_gte,
            with_runtime_lte,
            with_original_language,
            callback
        )
    }

    override fun getDiscoverTv(
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>>
    ) {
        remoteDataSource.getDiscoverTv(
            apiKey,
            language,
            sort_by,
            air_date_gte,
            air_date_lte,
            first_air_date_gte,
            first_air_date_lte,
            first_air_date_year,
            page,
            timezone,
            vote_average_gte,
            vote_count_gte,
            with_genres,
            with_networks,
            without_genres,
            with_runtime_gte,
            with_runtime_lte,
            include_null_first_air_dates,
            with_original_language,
            without_keywords,
            screened_theatrically,
            with_companies,
            with_keywords,
            callback
        )
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Find>
    ) {
        remoteDataSource.getFindById(external_id, apiKey, external_source, language, callback)
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        remoteDataSource.getGenresMovie(apiKey, language, callback)
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        remoteDataSource.getGenresTv(apiKey, language, callback)
    }
}