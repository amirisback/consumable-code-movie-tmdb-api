package com.frogobox.tmdbapi.ui.fragment.tv

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingTv
import com.frogobox.frogothemoviedbapi.data.response.Trending
import com.frogobox.recycler.core.FrogoRecyclerViewListener
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.databinding.FragmentTrendingChildBinding
import com.frogobox.tmdbapi.ui.adapter.TrendingTvAdapter


/**
 * A simple [Fragment] subclass.
 */
class TrendingTvWeekFragment : BaseFragment() {

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

        getTrendingTvWeek()
    }

    private fun getTrendingTvWeek() {
        fragmentTrendingChildBinding?.apply {
            consumeMovieApi().getTrendingTvWeek(object :
                MovieResultCallback<Trending<TrendingTv>> {
                override fun getResultData(data: Trending<TrendingTv>) {
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

    private fun setupAdapter(data: List<TrendingTv>) {
        val adapter = TrendingTvAdapter()
        adapter.setupRequirement(
            R.layout.content_item,
            data,
            object : FrogoRecyclerViewListener<TrendingTv> {
                override fun onItemClicked(data: TrendingTv) {
                    data.original_name?.let { showToast(it) }
                }

                override fun onItemLongClicked(data: TrendingTv) {

                }
            }
        )
        adapter.setupEmptyView(null) // With Custom View
        fragmentTrendingChildBinding?.frogoRecyclerView?.adapter = adapter
        fragmentTrendingChildBinding?.frogoRecyclerView?.isViewGrid(2)
    }

}
