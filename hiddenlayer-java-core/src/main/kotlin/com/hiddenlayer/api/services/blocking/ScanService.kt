// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.services.blocking.scans.JobService
import com.hiddenlayer.api.services.blocking.scans.ResultService
import com.hiddenlayer.api.services.blocking.scans.UploadService
import java.util.function.Consumer

interface ScanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanService

    fun results(): ResultService

    fun jobs(): JobService

    fun upload(): UploadService

    /** A view of [ScanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanService.WithRawResponse

        fun results(): ResultService.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        fun upload(): UploadService.WithRawResponse
    }
}
