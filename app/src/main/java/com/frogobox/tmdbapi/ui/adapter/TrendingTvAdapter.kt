package com.frogobox.tmdbapi.ui.adapter

import android.view.View
import android.view.ViewGroup
import com.frogobox.frogothemoviedbapi.data.model.TrendingTv
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recycler.adapter.FrogoRecyclerViewHolder

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 06/04/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.tmdbapi.ui.adapter
 *
 */
class TrendingTvAdapter() : FrogoRecyclerViewAdapter<TrendingTv>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<TrendingTv> {
        return TrendingMovieViewHolder(viewLayout(parent))
    }

    inner class TrendingMovieViewHolder(view: View) : FrogoRecyclerViewHolder<TrendingTv>(view) {

        override fun initComponent(data: TrendingTv) {
            super.initComponent(data)


        }

    }

}