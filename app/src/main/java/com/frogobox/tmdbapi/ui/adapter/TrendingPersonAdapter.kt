package com.frogobox.tmdbapi.ui.adapter

import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.frogothemoviedbapi.data.model.TrendingPerson
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recycler.adapter.FrogoRecyclerViewHolder
import kotlinx.android.synthetic.main.content_item.view.*

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
class TrendingPersonAdapter() : FrogoRecyclerViewAdapter<TrendingPerson>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<TrendingPerson> {
        return TrendingMovieViewHolder(viewLayout(parent))
    }

    inner class TrendingMovieViewHolder(view: View) :
        FrogoRecyclerViewHolder<TrendingPerson>(view) {

        private val ivPoster = view.iv_poster
        private val tvTitle = view.tv_title
        private val tvOverview = view.tv_overview

        override fun initComponent(data: TrendingPerson) {
            super.initComponent(data)

            tvTitle.text = data.name
            tvOverview.text = data.known_for_department
            Glide.with(itemView.context)
                .load("${MovieUrl.BASE_URL_IMAGE_ORIGNAL}${data.profile_path}")
                .into(ivPoster)

        }

    }

}