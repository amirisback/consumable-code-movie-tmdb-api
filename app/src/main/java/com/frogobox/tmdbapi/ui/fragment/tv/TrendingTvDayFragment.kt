package com.frogobox.tmdbapi.ui.fragment.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingTv
import com.frogobox.frogothemoviedbapi.data.response.Trending
import com.frogobox.recycler.adapter.FrogoRecyclerViewListener

import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.ui.adapter.TrendingTvAdapter
import kotlinx.android.synthetic.main.fragment_trending_child.*


class TrendingTvDayFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTrendingTvDay()
    }

    private fun getTrendingTvDay() {
        consumeMovieApi().getTrendingTvDay(object :
            MovieResultCallback<Trending<TrendingTv>> {
            override fun getResultData(data: Trending<TrendingTv>) {
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

    private fun setupAdapter(data: List<TrendingTv>) {
        val adapter = TrendingTvAdapter()
        adapter.setupRequirement(
            R.layout.content_item,
            data,
            object : FrogoRecyclerViewListener<TrendingTv> {
                override fun onItemClicked(data: TrendingTv) {
//                    baseStartActivity<DetailActivity, Article>(DetailActivity.EXTRA_DATA, data)
                }

                override fun onItemLongClicked(data: TrendingTv) {

                }
            }
        )
        adapter.setupEmptyView(null) // With Custom View
        frogoRecyclerView.adapter = adapter
        frogoRecyclerView.isViewGrid(2)
    }

}
