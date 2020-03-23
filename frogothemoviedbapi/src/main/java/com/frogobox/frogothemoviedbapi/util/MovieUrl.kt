package com.frogobox.frogothemoviedbapi.util

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
 * com.frogobox.frogothemoviedbapi.util
 *
 */
class MovieUrl {

    companion object {

        const val BASE_URL = "https://api.themoviedb.org/"
        const val BASE_LANG = "en-US"
        const val API_KEY = "5e922c3d4b1b0e96fffcc6b0b395878f"
        const val VERSION_API = "3"

        const val CERTIFICATION_MOVIE = "$VERSION_API/certification/movie/list"
        const val CERTIFICATION_TV = "$VERSION_API/certification/tv/list"


    }

}