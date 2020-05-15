package com.frogobox.frogothemoviedbapi.data.response

import com.frogobox.frogothemoviedbapi.data.model.TvAccountStatesRated

data class TvAccountStates(
    val favorite: Boolean?,
    val id: Int?,
    val rated: TvAccountStatesRated?,
    val watchlist: Boolean?
)