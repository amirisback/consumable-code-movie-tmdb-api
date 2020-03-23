package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.MovieCertification
import com.frogobox.frogothemoviedbapi.data.model.TvCertification
import com.frogobox.frogothemoviedbapi.data.response.Certifications
import com.frogobox.frogothesportdbapi.base.BaseMovieDataSource

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
interface MovieDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(apiKey: String, callback: GetRemoteCallback<Certifications<MovieCertification>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(apiKey: String, callback: GetRemoteCallback<Certifications<TvCertification>>)


    // Response Callback
    interface GetRemoteCallback<T> : BaseMovieDataSource.ResponseCallback<T>

}