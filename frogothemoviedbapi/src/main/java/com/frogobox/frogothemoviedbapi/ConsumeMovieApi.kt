package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.*
import com.frogobox.frogothemoviedbapi.data.response.*
import com.frogobox.frogothemoviedbapi.data.source.MovieDataSource
import com.frogobox.frogothemoviedbapi.data.source.MovieRemoteDataSource
import com.frogobox.frogothemoviedbapi.data.source.MovieRepository
import com.frogobox.frogothemoviedbapi.util.MovieConstant

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
class ConsumeMovieApi(private val apiKey: String) : ConsumeMovieApiView {

    private val movieRepository = MovieRepository(MovieRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        movieRepository.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(callback: MovieResultCallback<Certifications<CertificationMovie>>) {
        movieRepository.getMovieCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>> {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvCertifications(callback: MovieResultCallback<Certifications<CertificationTv>>) {
        movieRepository.getTvCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>> {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getMovieChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getTvChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getPersonChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsDetail>
    ) {
        movieRepository.getCollectionDetails(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsDetail> {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsImage>
    ) {
        movieRepository.getCollectionImages(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsImage> {
                override fun onSuccess(data: CollectionsImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: MovieResultCallback<CollectionsTranslation>
    ) {
        movieRepository.getCollectionTranslations(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsTranslation> {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesDetails(
        company_id: Int,
        callback: MovieResultCallback<CompaniesDetail>
    ) {
        movieRepository.getCompaniesDetails(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesDetail> {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        callback: MovieResultCallback<CompaniesAlternateName>
    ) {
        movieRepository.getCompaniesAlternativeName(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesAlternateName> {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesImage(company_id: Int, callback: MovieResultCallback<CompaniesImage>) {
        movieRepository.getCompaniesImage(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesImage> {
                override fun onSuccess(data: CompaniesImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationApi(callback: MovieResultCallback<ConfigurationApi>) {
        movieRepository.getConfigurationApi(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<ConfigurationApi> {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationCountries(callback: MovieResultCallback<List<ConfigurationCountry>>) {
        movieRepository.getConfigurationCountries(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>> {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationJobs(callback: MovieResultCallback<List<ConfigurationJob>>) {
        movieRepository.getConfigurationJobs(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationJob>> {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationLanguages(callback: MovieResultCallback<List<ConfigurationLanguage>>) {
        movieRepository.getConfigurationLanguages(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>> {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTranslations(callback: MovieResultCallback<List<String>>) {
        movieRepository.getConfigurationTranslations(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<String>> {
                override fun onSuccess(data: List<String>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTimezones(callback: MovieResultCallback<List<ConfigurationTimezone>>) {
        movieRepository.getConfigurationTimezones(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>> {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCreditsDetails(credit_id: String, callback: MovieResultCallback<Credits>) {
        movieRepository.getCreditsDetails(
            credit_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Credits> {
                override fun onSuccess(data: Credits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getDiscoverMovie(
        language: String?,
        region: String?,
        sort_by: String?,
        certification_country: String?,
        certification: String?,
        certification_lte: String?,
        certification_gte: String?,
        include_adult: Boolean?,
        include_video: String?,
        page: String?,
        primary_release_year: Int?,
        primary_release_date_gte: String?,
        primary_release_date_lte: String?,
        release_date_gte: String?,
        release_date_lte: String?,
        with_release_type: String?,
        year: Int?,
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
    ) {
        movieRepository.getDiscoverMovie(
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
            object : MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>> {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            }
        )
    }

    override fun getDiscoverTv(
        language: String?,
        sort_by: String?,
        air_date_gte: String?,
        air_date_lte: String?,
        first_air_date_gte: String?,
        first_air_date_lte: String?,
        first_air_date_year: Int?,
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
    ) {
        movieRepository.getDiscoverTv(
            apiKey, language,
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
            object : MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>> {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            }
        )
    }

    override fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: MovieResultCallback<Find>
    ) {
        movieRepository.getFindById(
            external_id,
            apiKey,
            external_source,
            language,
            object : MovieDataSource.GetRemoteCallback<Find> {
                override fun onSuccess(data: Find) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresMovie(language: String?, callback: MovieResultCallback<Genres>) {
        movieRepository.getGenresMovie(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresTv(language: String?, callback: MovieResultCallback<Genres>) {
        movieRepository.getGenresTv(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: MovieResultCallback<KeywordsDetail>) {
        movieRepository.getKeywordsDetail(
            keyword_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<KeywordsDetail> {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: MovieResultCallback<KeywordsMovies>
    ) {
        movieRepository.getKeywordsMovie(
            keyword_id,
            apiKey,
            language,
            include_adult,
            object : MovieDataSource.GetRemoteCallback<KeywordsMovies> {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: MovieResultCallback<MovieDetail>
    ) {
        movieRepository.getMoviesDetails(
            movie_id,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<MovieDetail> {
                override fun onSuccess(data: MovieDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: MovieResultCallback<MovieAccountState>
    ) {
        movieRepository.getMoviesAccountState(
            movie_id,
            apiKey,
            session_id,
            guest_session_id,
            object : MovieDataSource.GetRemoteCallback<MovieAccountState> {
                override fun onSuccess(data: MovieAccountState) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: MovieResultCallback<MovieAlternativeTitle>
    ) {
        movieRepository.getMoviesAlternativeTitles(
            movie_id,
            apiKey,
            country,
            object : MovieDataSource.GetRemoteCallback<MovieAlternativeTitle> {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: MovieResultCallback<MovieChanges>
    ) {
        movieRepository.getMoviesChanges(
            movie_id,
            apiKey,
            start_date,
            end_date,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieChanges> {
                override fun onSuccess(data: MovieChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesCredits(movie_id: Int, callback: MovieResultCallback<MovieCredit>) {
        movieRepository.getMoviesCredits(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieCredit> {
                override fun onSuccess(data: MovieCredit) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        callback: MovieResultCallback<MovieExternalId>
    ) {
        movieRepository.getMoviesExternalIds(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieExternalId> {
                override fun onSuccess(data: MovieExternalId) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: MovieResultCallback<MovieImages>
    ) {
        movieRepository.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language,
            object : MovieDataSource.GetRemoteCallback<MovieImages> {
                override fun onSuccess(data: MovieImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesKeywords(movie_id: Int, callback: MovieResultCallback<MovieKeywords>) {
        movieRepository.getMoviesKeywords(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieKeywords> {
                override fun onSuccess(data: MovieKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        callback: MovieResultCallback<MovieReleaseDates>
    ) {
        movieRepository.getMoviesReleaseDates(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieReleaseDates> {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: MovieResultCallback<MovieVideos>
    ) {
        movieRepository.getMoviesVideos(
            movie_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<MovieVideos> {
                override fun onSuccess(data: MovieVideos) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        callback: MovieResultCallback<MovieTranslations>
    ) {
        movieRepository.getMoviesTranslations(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieTranslations> {
                override fun onSuccess(data: MovieTranslations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieRecommendations>
    ) {
        movieRepository.getMoviesRecommendations(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieRecommendations> {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieSimilarMovies>
    ) {
        movieRepository.getMoviesSimilarMovies(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieSimilarMovies> {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieReviews>
    ) {
        movieRepository.getMoviesReviews(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieReviews> {
                override fun onSuccess(data: MovieReviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<MovieLists>
    ) {
        movieRepository.getMoviesLists(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieLists> {
                override fun onSuccess(data: MovieLists) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLatest(language: String?, callback: MovieResultCallback<MovieLatest>) {
        movieRepository.getMoviesLatest(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<MovieLatest> {
                override fun onSuccess(data: MovieLatest) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieNowPlayings>
    ) {
        movieRepository.getMoviesNowPlaying(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieNowPlayings> {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MoviePopulars>
    ) {
        movieRepository.getMoviesPopular(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MoviePopulars> {
                override fun onSuccess(data: MoviePopulars) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieTopRated>
    ) {
        movieRepository.getMoviesTopRated(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieTopRated> {
                override fun onSuccess(data: MovieTopRated) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieResultCallback<MovieUpcoming>
    ) {
        movieRepository.getMoviesUpcoming(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieUpcoming> {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllDay(callback: MovieResultCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllWeek(callback: MovieResultCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieDay(callback: MovieResultCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieWeek(callback: MovieResultCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonDay(callback: MovieResultCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonWeek(callback: MovieResultCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvDay(callback: MovieResultCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvWeek(callback: MovieResultCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getReviews(review_id: String, callback: MovieResultCallback<Reviews>) {
        movieRepository.getReviews(
            review_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Reviews> {
                override fun onSuccess(data: Reviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkDetail(network_id: Int, callback: MovieResultCallback<NetworkDetail>) {
        movieRepository.getNetworkDetail(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkDetail> {
                override fun onSuccess(data: NetworkDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        callback: MovieResultCallback<NetworkAlternativeName>
    ) {
        movieRepository.getNetworkAlternativeName(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkAlternativeName> {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkImage(network_id: Int, callback: MovieResultCallback<NetworkImage>) {
        movieRepository.getNetworkImage(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkImage> {
                override fun onSuccess(data: NetworkImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchCompanies(
        query: String,
        page: Int?,
        callback: MovieResultCallback<SearchCompanies>
    ) {
        movieRepository.searchCompanies(
            apiKey,
            query,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchCompanies> {
                override fun onSuccess(data: SearchCompanies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<SearchCollections>
    ) {
        movieRepository.searchCollections(
            apiKey,
            query,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchCollections> {
                override fun onSuccess(data: SearchCollections) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchKeywords(
        query: String,
        page: Int?,
        callback: MovieResultCallback<SearchKeywords>
    ) {
        movieRepository.searchKeywords(
            apiKey,
            query,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchKeywords> {
                override fun onSuccess(data: SearchKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchMovies(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: MovieResultCallback<SearchMovies>
    ) {
        movieRepository.searchMovies(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year,
            object : MovieDataSource.GetRemoteCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchMultiSearch(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieResultCallback<SearchMulti>
    ) {
        movieRepository.searchMultiSearch(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : MovieDataSource.GetRemoteCallback<SearchMulti> {
                override fun onSuccess(data: SearchMulti) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieResultCallback<SearchPeople>
    ) {
        movieRepository.searchPeople(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : MovieDataSource.GetRemoteCallback<SearchPeople> {
                override fun onSuccess(data: SearchPeople) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: MovieResultCallback<SearchMovies>
    ) {
        movieRepository.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year,
            object : MovieDataSource.GetRemoteCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: MovieResultCallback<TvDetails>
    ) {
        movieRepository.tvGetDetails(
            tv_id,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<TvDetails> {
                override fun onSuccess(data: TvDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieResultCallback<TvAccountStates>
    ) {
        movieRepository.tvGetAccountStates(
            tv_id,
            apiKey,
            language,
            guest_session_id,
            session_id,
            object : MovieDataSource.GetRemoteCallback<TvAccountStates> {
                override fun onSuccess(data: TvAccountStates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvAlternativeTitles>
    ) {
        movieRepository.tvGetAlternativeTitles(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvAlternativeTitles> {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieResultCallback<TvChanges>
    ) {
        movieRepository.tvGetChanges(
            tv_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : MovieDataSource.GetRemoteCallback<TvChanges> {
                override fun onSuccess(data: TvChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetContentRatings(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvContentRatings>
    ) {
        movieRepository.tvGetContentRatings(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvContentRatings> {
                override fun onSuccess(data: TvContentRatings) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetCredits(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvCredits>
    ) {
        movieRepository.tvGetCredits(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvCredits> {
                override fun onSuccess(data: TvCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvEpisodeGroups>
    ) {
        movieRepository.tvGetEpisodeGroups(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeGroups> {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetExternalIds(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvExternalIds>
    ) {
        movieRepository.tvGetExternalIds(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvExternalIds> {
                override fun onSuccess(data: TvExternalIds) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetImages(
        tv_id: Int,
        language: String?,
        callback: MovieResultCallback<TvImages>
    ) {
        movieRepository.tvGetImages(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvImages> {
                override fun onSuccess(data: TvImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetKeyword(tv_id: Int, callback: MovieResultCallback<TvKeywords>) {
        movieRepository.tvGetKeyword(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvKeywords> {
                override fun onSuccess(data: TvKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: MovieResultCallback<TvRecommendations>
    ) {
        movieRepository.tvGetRecommendations(
            tv_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvRecommendations> {
                override fun onSuccess(data: TvRecommendations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun tvGetReviews(tv_id: Int, callback: MovieResultCallback<TvReviews>) {
        movieRepository.tvGetReviews(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvReviews> {
                override fun onSuccess(data: TvReviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }
}