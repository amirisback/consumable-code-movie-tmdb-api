package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.MovieChange
import com.frogobox.frogothemoviedbapi.data.model.MovieTitle
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 05/04/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.response
 *
 */
data class MovieChanges(

    @SerializedName("changes")
    var changes: List<MovieChange>? = null

)