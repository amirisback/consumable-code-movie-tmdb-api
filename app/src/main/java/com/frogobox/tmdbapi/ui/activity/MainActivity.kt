package com.frogobox.tmdbapi.ui.activity

import android.os.Bundle
import android.view.LayoutInflater
import com.frogobox.tmdbapi.R
import com.frogobox.tmdbapi.base.ui.BaseActivity
import com.frogobox.tmdbapi.databinding.ActivityMainBinding
import com.frogobox.tmdbapi.ui.fragment.movie.TrendingMovieFragment
import com.frogobox.tmdbapi.ui.fragment.person.TrendingPersonFragment
import com.frogobox.tmdbapi.ui.fragment.tv.TrendingTvFragment

class MainActivity : BaseActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupBottomNav(R.id.framelayout_main_container)
        setupFragment(savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar() {
        supportActionBar?.elevation = 0f
    }

    private fun setupFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            binding.bottomNavMainMenu.selectedItemId = R.id.bottom_menu_tv
        }
    }


    private fun setupBottomNav(frameLayout: Int) {
        binding.bottomNavMainMenu.apply {
            clearAnimation()
            itemIconTintList = null

            setOnNavigationItemSelectedListener {
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

}
