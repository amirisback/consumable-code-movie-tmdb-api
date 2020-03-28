package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.*
import com.frogobox.frogothemoviedbapi.data.response.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.source
 *
 */
object MovieRemoteDataSource : MovieDataSource {

    private val movieApiService = MovieApiService

    override fun usingChuckInterceptor(context: Context) {
        movieApiService.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>>
    ) {
        movieApiService.getApiService
            .getMovieCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Certifications<CertificationMovie>>() {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>>
    ) {
        movieApiService.getApiService
            .getTvCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Certifications<CertificationTv>>() {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getMovieChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getTvChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getPersonChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsDetail>
    ) {
        movieApiService.getApiService
            .getCollectionDetails(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsDetail>() {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsImage>
    ) {
        movieApiService.getApiService
            .getCollectionImages(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsImage>() {
                override fun onSuccess(data: CollectionsImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsTranslation>
    ) {
        movieApiService.getApiService
            .getCollectionTranslations(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsTranslation>() {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesDetail>
    ) {
        movieApiService.getApiService
            .getCompaniesDetails(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesDetail>() {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesAlternateName>
    ) {
        movieApiService.getApiService
            .getCompaniesAlternativeName(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesAlternateName>() {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesImage>
    ) {
        movieApiService.getApiService
            .getCompaniesImage(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesImage>() {
                override fun onSuccess(data: CompaniesImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<ConfigurationApi>
    ) {
        movieApiService.getApiService
            .getConfigurationApi(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<ConfigurationApi>() {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>>
    ) {
        movieApiService.getApiService
            .getConfigurationCountries(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationCountry>>() {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationJob>>
    ) {
        movieApiService.getApiService
            .getConfigurationJobs(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationJob>>() {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>>
    ) {
        movieApiService.getApiService
            .getConfigurationLanguages(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationLanguage>>() {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<String>>
    ) {
        movieApiService.getApiService
            .getConfigurationTranslations(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<String>>() {
                override fun onSuccess(data: List<String>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>>
    ) {
        movieApiService.getApiService
            .getConfigurationTimezones(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationTimezone>>() {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Credits>
    ) {
        movieApiService.getApiService
            .getCreditsDetails(credit_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Credits>() {
                override fun onSuccess(data: Credits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getDiscoverMovie(
        apiKey: String,
        language: String?,
        region: String?,
        sort_by: String?,
        certification_country: String?,
        certification: String?,
        certification_lte: String?,
        certification_gte: String?,
        include_adult: String?,
        include_video: String?,
        page: String?,
        primary_release_year: String?,
        primary_release_date_gte: String?,
        primary_release_date_lte: String?,
        release_date_gte: String?,
        release_date_lte: String?,
        with_release_type: String?,
        year: String?,
        vote_count_gte: String?,
        vote_count_lte: String?,
        vote_average_gte: String?,
        vote_average_lte: String?,
        with_cast: String?,
        with_crew: String?,
        with_people: String?,
        with_companies: String?,
        with_genres: String?,
        without_genres: String?,
        with_keywords: String?,
        without_keywords: String?,
        with_runtime_gte: String?,
        with_runtime_lte: String?,
        with_original_language: String?,
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>>
    ) {
        movieApiService.getApiService
            .getDiscoverMovie(
                apiKey,
                language,
                region,
                sort_by,
                certification_country,
                certification,
                certification_lte,
                certification_gte,
                include_adult,
                include_video,
                page,
                primary_release_year,
                primary_release_date_gte,
                primary_release_date_lte,
                release_date_gte,
                release_date_lte,
                with_release_type,
                year,
                vote_count_gte,
                vote_count_lte,
                vote_average_gte,
                vote_average_lte,
                with_cast,
                with_crew,
                with_people,
                with_companies,
                with_genres,
                without_genres,
                with_keywords,
                without_keywords,
                with_runtime_gte,
                with_runtime_lte,
                with_original_language
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Discover<DiscoverMovie>>() {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getDiscoverTv(
        apiKey: String,
        language: String?,
        sort_by: String?,
        air_date_gte: String?,
        air_date_lte: String?,
        first_air_date_gte: String?,
        first_air_date_lte: String?,
        first_air_date_year: String?,
        page: String?,
        timezone: String?,
        vote_average_gte: String?,
        vote_count_gte: String?,
        with_genres: String?,
        with_networks: String?,
        without_genres: String?,
        with_runtime_gte: String?,
        with_runtime_lte: String?,
        include_null_first_air_dates: String?,
        with_original_language: String?,
        without_keywords: String?,
        screened_theatrically: String?,
        with_companies: String?,
        with_keywords: String?,
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>>
    ) {
        movieApiService.getApiService
            .getDiscoverTv(
                apiKey,
                language,
                sort_by,
                air_date_gte,
                air_date_lte,
                first_air_date_gte,
                first_air_date_lte,
                first_air_date_year,
                page,
                timezone,
                vote_average_gte,
                vote_count_gte,
                with_genres,
                with_networks,
                without_genres,
                with_runtime_gte,
                with_runtime_lte,
                include_null_first_air_dates,
                with_original_language,
                without_keywords,
                screened_theatrically,
                with_companies,
                with_keywords
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Discover<DiscoverTv>>() {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Find>
    ) {
        movieApiService.getApiService
            .getFindById(external_id, apiKey, external_source, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Find>() {
                override fun onSuccess(data: Find) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }
}