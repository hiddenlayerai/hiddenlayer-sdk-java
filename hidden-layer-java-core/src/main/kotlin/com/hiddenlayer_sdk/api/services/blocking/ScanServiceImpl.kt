// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.services.blocking.scans.JobService
import com.hiddenlayer_sdk.api.services.blocking.scans.JobServiceImpl
import com.hiddenlayer_sdk.api.services.blocking.scans.ResultService
import com.hiddenlayer_sdk.api.services.blocking.scans.ResultServiceImpl
import com.hiddenlayer_sdk.api.services.blocking.scans.UploadService
import com.hiddenlayer_sdk.api.services.blocking.scans.UploadServiceImpl
import java.util.function.Consumer

class ScanServiceImpl internal constructor(private val clientOptions: ClientOptions) : ScanService {

    private val withRawResponse: ScanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val results: ResultService by lazy { ResultServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val upload: UploadService by lazy { UploadServiceImpl(clientOptions) }

    override fun withRawResponse(): ScanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanService =
        ScanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun results(): ResultService = results

    override fun jobs(): JobService = jobs

    override fun upload(): UploadService = upload

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScanService.WithRawResponse {

        private val results: ResultService.WithRawResponse by lazy {
            ResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val upload: UploadService.WithRawResponse by lazy {
            UploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScanService.WithRawResponse =
            ScanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun results(): ResultService.WithRawResponse = results

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun upload(): UploadService.WithRawResponse = upload
    }
}
