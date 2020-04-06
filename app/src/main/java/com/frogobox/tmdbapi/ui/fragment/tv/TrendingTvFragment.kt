package com.frogobox.tmdbapi.ui.fragment.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.helper.BasePagerAdapter
import com.frogobox.tmdbapi.base.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_trending.*

/**
 * A simple [Fragment] subclass.
 */
class TrendingTvFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val pagerAdapter = BasePagerAdapter(childFragmentManager)
        pagerAdapter.setupPagerFragment(
            TrendingTvDayFragment(),
            resources.getString(R.string.title_day)
        )
        pagerAdapter.setupPagerFragment(
            TrendingTvWeekFragment(),
            resources.getString(R.string.title_week)
        )
        viewpager.adapter = pagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }

}
