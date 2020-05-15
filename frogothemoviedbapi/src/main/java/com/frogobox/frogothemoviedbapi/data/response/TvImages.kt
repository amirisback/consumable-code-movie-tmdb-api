package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvImagesBackdrop
import com.frogobox.frogothemoviedbapi.data.model.TvImagesPoster

data class TvImages(
    val backdrops: List<TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<TvImagesPoster>?
)