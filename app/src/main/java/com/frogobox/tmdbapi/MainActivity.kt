package com.frogobox.tmdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.frogothemoviedbapi.data.model.ConfigurationJob
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.frogothemoviedbapi.callback.MovieResultCallback
import com.frogobox.frogothemoviedbapi.data.model.TrendingMovie
import com.frogobox.frogothemoviedbapi.data.model.TrendingPerson
import com.frogobox.frogothemoviedbapi.data.response.Trending
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY)
        consumeMovieApi.usingChuckInterceptor(this)
        consumeMovieApi.getTrendingPersonWeek(
            object : MovieResultCallback<Trending<TrendingPerson>> {
                override fun getResultData(data: Trending<TrendingPerson>) {
                    textView.text = data.results?.get(0)!!.name
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
