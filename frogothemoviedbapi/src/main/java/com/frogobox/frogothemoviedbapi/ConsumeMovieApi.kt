package com.frogobox.frogothemoviedbapi

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.source.MovieRemoteDataSource
import com.frogobox.frogothemoviedbapi.data.source.MovieRepository

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
}