package com.frogobox.tmdbapi.ui.fragment.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingMovie
import com.frogobox.frogothemoviedbapi.data.response.Trending

import com.frogobox.recycler.core.FrogoRecyclerViewListener
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.databinding.FragmentTrendingChildBinding
import com.frogobox.tmdbapi.ui.adapter.TrendingMovieAdapter

/**
 * A simple [Fragment] subclass.
 */
class TrendingMovieDayFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTrendingChildBinding = FragmentTrendingChildBinding.inflate(inflater, container, false)
        return fragmentTrendingChildBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTrendingMovieDay()
    }

    private fun getTrendingMovieDay() {
        fragmentTrendingChildBinding?.apply {
            consumeMovieApi().getTrendingMovieDay(object :
                MovieResultCallback<Trending<TrendingMovie>> {
                override fun getResultData(data: Trending<TrendingMovie>) {
                    data.results?.let { setupAdapter(it) }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {
                    errorMessage?.let { showToast(it) }
                }

                override fun onShowProgress() {
                    showProgressThread(progressView)
                }

                override fun onHideProgress() {
                    hideProgressThread(progressView)
                }
            })
        }
    }

    private fun setupAdapter(data: List<TrendingMovie>) {
        val trendingMovieAdapter = TrendingMovieAdapter()
        trendingMovieAdapter.setupRequirement(
            R.layout.content_item,
            data,
            object : FrogoRecyclerViewListener<TrendingMovie> {
                override fun onItemClicked(data: TrendingMovie) {
                    data.original_title?.let { showToast(it) }
                }

                override fun onItemLongClicked(data: TrendingMovie) {

                }
            }
        )
        trendingMovieAdapter.setupEmptyView(null) // With Custom View
        fragmentTrendingChildBinding?.frogoRecyclerView?.apply {
            adapter = trendingMovieAdapter
            isViewGrid(2)
        }
    }


}
