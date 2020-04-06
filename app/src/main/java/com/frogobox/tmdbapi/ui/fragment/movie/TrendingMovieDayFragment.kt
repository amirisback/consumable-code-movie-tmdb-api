package com.frogobox.tmdbapi.ui.fragment.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingMovie
import com.frogobox.frogothemoviedbapi.data.response.Trending
import com.frogobox.recycler.adapter.FrogoRecyclerViewListener
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.ui.adapter.TrendingMovieAdapter
import kotlinx.android.synthetic.main.fragment_trending_child.*

/**
 * A simple [Fragment] subclass.
 */
class TrendingMovieDayFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTrendingMovieDay()
    }

    private fun getTrendingMovieDay() {
        consumeMovieApi().getTrendingMovieDay(object :
            MovieResultCallback<Trending<TrendingMovie>> {
            override fun getResultData(data: Trending<TrendingMovie>) {
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

    private fun setupAdapter(data: List<TrendingMovie>) {
        val adapter = TrendingMovieAdapter()
        adapter.setupRequirement(
            R.layout.content_item,
            data,
            object : FrogoRecyclerViewListener<TrendingMovie> {
                override fun onItemClicked(data: TrendingMovie) {
//                    baseStartActivity<DetailActivity, Article>(DetailActivity.EXTRA_DATA, data)
                }

                override fun onItemLongClicked(data: TrendingMovie) {

                }
            }
        )
        adapter.setupEmptyView(null) // With Custom View
        frogoRecyclerView.adapter = adapter
        frogoRecyclerView.isViewGrid(2)
    }


}
