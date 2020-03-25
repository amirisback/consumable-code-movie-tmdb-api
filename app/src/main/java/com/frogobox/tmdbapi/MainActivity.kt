package com.frogobox.tmdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.frogothemoviedbapi.data.model.ConfigurationJob
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.frogothesportdbapi.callback.MovieResultCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY)
        consumeMovieApi.usingChuckInterceptor(this)
        consumeMovieApi.getConfigurationJobs(
            object : MovieResultCallback<List<ConfigurationJob>> {
                override fun getResultData(data: List<ConfigurationJob>) {
                    textView.text = data[0].department
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
