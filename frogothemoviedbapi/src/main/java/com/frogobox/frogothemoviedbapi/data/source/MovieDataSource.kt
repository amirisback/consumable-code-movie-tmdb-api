package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.CertificationMovie
import com.frogobox.frogothemoviedbapi.data.model.CertificationTv
import com.frogobox.frogothemoviedbapi.data.response.*
import com.frogobox.frogothesportdbapi.base.BaseMovieDataSource

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
interface MovieDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationMovie>>
    )

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationTv>>
    )

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: GetRemoteCallback<Changes>
    )

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        apiKey: String,
        collection_id: Int,
        language: String?,
        callback: GetRemoteCallback<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        apiKey: String,
        collection_id: Int,
        language: String?,
        callback: GetRemoteCallback<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        apiKey: String,
        collection_id: Int,
        language: String?,
        callback: GetRemoteCallback<CollectionsTranslation>
    )

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        apiKey: String,
        company_id: Int,
        callback: GetRemoteCallback<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        apiKey: String,
        company_id: Int,
        callback: GetRemoteCallback<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        apiKey: String,
        company_id: Int,
        callback: GetRemoteCallback<CompaniesImage>
    )

    // Response Callback
    interface GetRemoteCallback<T> : BaseMovieDataSource.ResponseCallback<T>

}