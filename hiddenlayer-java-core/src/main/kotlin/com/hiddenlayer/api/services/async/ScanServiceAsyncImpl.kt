// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.services.async.scans.JobServiceAsync
import com.hiddenlayer.api.services.async.scans.JobServiceAsyncImpl
import com.hiddenlayer.api.services.async.scans.ResultServiceAsync
import com.hiddenlayer.api.services.async.scans.ResultServiceAsyncImpl
import com.hiddenlayer.api.services.async.scans.UploadServiceAsync
import com.hiddenlayer.api.services.async.scans.UploadServiceAsyncImpl
import java.util.function.Consumer

class ScanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScanServiceAsync {

    private val withRawResponse: ScanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val results: ResultServiceAsync by lazy { ResultServiceAsyncImpl(clientOptions) }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val upload: UploadServiceAsync by lazy { UploadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ScanServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync =
        ScanServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun results(): ResultServiceAsync = results

    override fun jobs(): JobServiceAsync = jobs

    override fun upload(): UploadServiceAsync = upload

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScanServiceAsync.WithRawResponse {

        private val results: ResultServiceAsync.WithRawResponse by lazy {
            ResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val upload: UploadServiceAsync.WithRawResponse by lazy {
            UploadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScanServiceAsync.WithRawResponse =
            ScanServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun results(): ResultServiceAsync.WithRawResponse = results

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        override fun upload(): UploadServiceAsync.WithRawResponse = upload
    }
}
