package com.frogobox.tmdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.frogothemoviedbapi.data.response.Changes
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.frogothesportdbapi.callback.MovieResultCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY)
        consumeMovieApi.usingChuckInterceptor(this)
        consumeMovieApi.getMovieChangeList(
            null,
            null,
            null,
            object : MovieResultCallback<Changes> {
                override fun getResultData(data: Changes) {

                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {

                }

                override fun onShowProgress() {

                }

                override fun onHideProgress() {

                }
            })


    }
}
