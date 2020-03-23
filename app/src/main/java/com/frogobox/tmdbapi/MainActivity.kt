package com.frogobox.tmdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothemoviedbapi.ConsumeMovieApi
import com.frogobox.frogothemoviedbapi.data.model.MovieCertification
import com.frogobox.frogothemoviedbapi.data.response.Certifications
import com.frogobox.frogothemoviedbapi.util.MovieUrl
import com.frogobox.frogothesportdbapi.callback.MovieResultCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY)
        consumeMovieApi.usingChuckInterceptor(this)
        consumeMovieApi.getMovieCertifications(object : MovieResultCallback<Certifications<MovieCertification>>{
            override fun getResultData(data: Certifications<MovieCertification>) {

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
