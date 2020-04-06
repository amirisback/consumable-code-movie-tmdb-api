package com.frogobox.tmdbapi.ui.activity

import android.os.Bundle
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseActivity
import com.frogobox.tmdbapi.ui.fragment.TrendingMovieFragment
import com.frogobox.tmdbapi.ui.fragment.TrendingPersonFragment
import com.frogobox.tmdbapi.ui.fragment.TrendingTvFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNav(R.id.framelayout_main_container)
        setupFragment(savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar(){
        supportActionBar?.elevation = 0f
    }

    private fun setupFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            bottom_nav_main_menu.selectedItemId = R.id.bottom_menu_tv
        }
    }


    private fun setupBottomNav(frameLayout: Int) {
        bottom_nav_main_menu.clearAnimation()
        bottom_nav_main_menu.itemIconTintList = null
        bottom_nav_main_menu.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.bottom_menu_movie -> {
                    setupCustomTitleToolbar(R.string.title_movie)
                    setupChildFragment(
                        frameLayout,
                        TrendingMovieFragment()
                    )
                }

                R.id.bottom_menu_person -> {
                    setupCustomTitleToolbar(R.string.title_person)
                    setupChildFragment(
                        frameLayout,
                        TrendingPersonFragment()
                    )
                }

                R.id.bottom_menu_tv -> {
                    setupCustomTitleToolbar(R.string.title_tv)
                    setupChildFragment(
                        frameLayout,
                        TrendingTvFragment()
                    )
                }
            }

            true
        }

    }

}
