package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context

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
class MovieRepository(private val movieRemoteDataSource: MovieDataSource) : MovieDataSource {

    override fun usingChuckInterceptor(context: Context) {
        movieRemoteDataSource.usingChuckInterceptor(context)
    }

}