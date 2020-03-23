package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.MovieCertification
import com.frogobox.frogothemoviedbapi.data.model.TvCertification
import com.frogobox.frogothemoviedbapi.data.response.Certifications
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

    override fun getMovieCertifications(callback: MovieResultCallback<Certifications<MovieCertification>>) {
        movieRepository.getMovieCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<MovieCertification>> {
                override fun onSuccess(data: Certifications<MovieCertification>) {
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

    override fun getTvCertifications(callback: MovieResultCallback<Certifications<TvCertification>>) {
        movieRepository.getTvCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<TvCertification>> {
                override fun onSuccess(data: Certifications<TvCertification>) {
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