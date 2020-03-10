package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
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


    // Response Callback
    interface GetRemoteCallback<T> : BaseMovieDataSource.ResponseCallback<T>

}