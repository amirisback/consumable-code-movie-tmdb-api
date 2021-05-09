package com.frogobox.tmdbapi.base.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.tmdbapi.base.helper.BaseHelper
import com.frogobox.tmdbapi.databinding.FragmentTrendingBinding
import com.frogobox.tmdbapi.databinding.FragmentTrendingChildBinding

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FaisalAmirProfile
 * Copyright (C) 26/07/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.tmdbapi.base
 *
 */
open class BaseFragment : Fragment() {

    lateinit var mActivity: BaseActivity

    protected var fragmentTrendingBinding : FragmentTrendingBinding? = null
    protected var fragmentTrendingChildBinding : FragmentTrendingChildBinding? = null

    override fun onDestroy() {
        fragmentTrendingBinding = null
        fragmentTrendingChildBinding = null
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = (activity as BaseActivity)
    }

    protected fun consumeMovieApi(): ConsumeMovieApi {
        return mActivity.consumeMovieApi()
    }

    protected fun setupChildFragment(frameId: Int, fragment: Fragment) {
        childFragmentManager.beginTransaction().apply {
            replace(frameId, fragment)
            commit()
        }
    }

    fun <Model> baseNewInstance(argsKey: String, data: Model) {
        val argsData = BaseHelper().baseToJson(data)
        val bundleArgs = Bundle().apply {
            putString(argsKey, argsData)
        }
        this.arguments = bundleArgs
    }

    protected inline fun <reified Model> baseGetInstance(argsKey: String): Model {
        val argsData = this.arguments?.getString(argsKey)
        val instaceData = BaseHelper()
            .baseFromJson<Model>(argsData)
        return instaceData
    }

    protected fun checkArgument(argsKey: String): Boolean {
        return arguments!!.containsKey(argsKey)
    }

    protected fun setupEventEmptyView(view: View, isEmpty: Boolean) {
        if (isEmpty) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    protected fun setupEventProgressView(view: View, progress: Boolean) {
        if (progress) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    protected fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    protected inline fun <reified ClassActivity> baseStartActivity() {
        context?.startActivity(Intent(context, ClassActivity::class.java))
    }

    protected inline fun <reified ClassActivity, Model> baseStartActivity(
        extraKey: String,
        data: Model
    ) {
        val intent = Intent(context, ClassActivity::class.java)
        val extraData = BaseHelper().baseToJson(data)
        intent.putExtra(extraKey, extraData)
        this.startActivity(intent)
    }

    protected fun showProgressThread(progressView : ProgressBar) {
        mActivity.runOnUiThread {
            progressView.visibility = View.VISIBLE
        }
    }

    protected fun hideProgressThread(progressView : ProgressBar) {
        mActivity.runOnUiThread {
            progressView.visibility = View.GONE
        }
    }


}