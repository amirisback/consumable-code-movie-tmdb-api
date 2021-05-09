package com.frogobox.tmdbapi.ui.fragment.person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingPerson
import com.frogobox.frogothemoviedbapi.data.response.Trending
import com.frogobox.recycler.core.FrogoRecyclerViewListener

import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment
import com.frogobox.tmdbapi.databinding.FragmentTrendingChildBinding
import com.frogobox.tmdbapi.ui.adapter.TrendingPersonAdapter


class TrendingPersonWeekFragment : BaseFragment() {

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

        getTrendingPersonWeek()
    }

    private fun getTrendingPersonWeek() {
        fragmentTrendingChildBinding?.apply {
            consumeMovieApi().getTrendingPersonWeek(object :
                MovieResultCallback<Trending<TrendingPerson>> {
                override fun getResultData(data: Trending<TrendingPerson>) {
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
        fragmentTrendingChildBinding?.frogoRecyclerView?.adapter = adapter
        fragmentTrendingChildBinding?.frogoRecyclerView?.isViewGrid(2)
    }

}
