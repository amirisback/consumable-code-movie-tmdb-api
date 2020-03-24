package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.CertificationMovie
import com.frogobox.frogothemoviedbapi.data.model.CertificationTv
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
            apiKey,
            collection_id,
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
            apiKey,
            collection_id,
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
            apiKey,
            collection_id,
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
}