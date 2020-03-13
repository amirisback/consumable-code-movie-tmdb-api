package com.frogobox.frogothemoviedbapi.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 13/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.model
 *
 */
data class Image (

    @SerializedName("")
    var aspect_ratio: Int? = null,

    @SerializedName("")
    var file_path: String? = null,

    @SerializedName("")
    var height: Int? = null,

    @SerializedName("")
    var iso_639_1: Int? = null,

    @SerializedName("")
    var vote_average: Int? = null,

    @SerializedName("")
    var vote_count: Int? = null,

    @SerializedName("")
    var width: Int? = null

)