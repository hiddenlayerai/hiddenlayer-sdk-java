// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.services.async.scans.JobServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.ResultServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.UploadServiceAsync
import java.util.function.Consumer

interface ScanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync

    fun results(): ResultServiceAsync

    fun jobs(): JobServiceAsync

    fun upload(): UploadServiceAsync

    /** A view of [ScanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync.WithRawResponse

        fun results(): ResultServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        fun upload(): UploadServiceAsync.WithRawResponse
    }
}
