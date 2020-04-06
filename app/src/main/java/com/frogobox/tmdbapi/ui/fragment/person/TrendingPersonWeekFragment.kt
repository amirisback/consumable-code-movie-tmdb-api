package com.frogobox.tmdbapi.ui.fragment.person

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingPerson
import com.frogobox.frogothemoviedbapi.data.response.Trending
import com.frogobox.recycler.adapter.FrogoRecyclerViewListener

import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.ui.adapter.TrendingPersonAdapter
import kotlinx.android.synthetic.main.fragment_trending_child.*

class TrendingPersonWeekFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTrendingPersonWeek()
    }

    private fun getTrendingPersonWeek() {
        consumeMovieApi().getTrendingPersonWeek(object :
            MovieResultCallback<Trending<TrendingPerson>> {
            override fun getResultData(data: Trending<TrendingPerson>) {
                data.results?.let { setupAdapter(it) }
            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {
                errorMessage?.let { showToast(it) }
            }

            override fun onShowProgress() {
                showProgressThread(progress_view)
            }

            override fun onHideProgress() {
                hideProgressThread(progress_view)
            }
        })
    }

    private fun setupAdapter(data: List<TrendingPerson>) {
        val adapter = TrendingPersonAdapter()
        adapter.setupRequirement(
            R.layout.content_item,
            data,
            object : FrogoRecyclerViewListener<TrendingPerson> {
                override fun onItemClicked(data: TrendingPerson) {
                    data.name?.let { showToast(it) }
                }

                override fun onItemLongClicked(data: TrendingPerson) {

                }
            }
        )
        adapter.setupEmptyView(null) // With Custom View
        frogoRecyclerView.adapter = adapter
        frogoRecyclerView.isViewGrid(2)
    }

}
