package com.frogobox.tmdbapi.ui.fragment.person

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class TrendingPersonDayFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending_child, container, false)
    }

}
