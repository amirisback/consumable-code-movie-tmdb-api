package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.*
import com.frogobox.frogothemoviedbapi.data.response.*
import com.frogobox.frogothemoviedbapi.data.source.MovieDataSource
import com.frogobox.frogothemoviedbapi.data.source.MovieRemoteDataSource
import com.frogobox.frogothemoviedbapi.data.source.MovieRepository
import com.frogobox.frogothesportdbapi.callback.MovieResultCallback

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
}