package com.frogobox.frogothemoviedbapi.data.model

import com.google.gson.annotations.SerializedName

data class NetworkName(

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("type")
    var type: String? = null

)
