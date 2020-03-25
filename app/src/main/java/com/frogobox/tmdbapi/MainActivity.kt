package com.frogobox.tmdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.frogothemoviedbapi.data.response.Changes
import com.frogobox.frogothemoviedbapi.data.response.CollectionsDetail
import com.frogobox.frogothemoviedbapi.data.response.CompaniesDetail
import com.frogobox.frogothemoviedbapi.data.response.ConfigurationApi
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.frogothesportdbapi.callback.MovieResultCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY)
        consumeMovieApi.usingChuckInterceptor(this)
        consumeMovieApi.getConfigurationApi(
            object : MovieResultCallback<ConfigurationApi> {
                override fun getResultData(data: ConfigurationApi) {

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
