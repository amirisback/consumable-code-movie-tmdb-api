package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.MovieCertification
import com.frogobox.frogothemoviedbapi.data.model.TvCertification
import com.frogobox.frogothemoviedbapi.data.response.Certifications

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
object MovieRemoteDataSource : MovieDataSource {

    private val movieApiService = MovieApiService

    override fun usingChuckInterceptor(context: Context) {
        movieApiService.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<MovieCertification>>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<TvCertification>>
    ) {
        TODO("Not yet implemented")
    }
}