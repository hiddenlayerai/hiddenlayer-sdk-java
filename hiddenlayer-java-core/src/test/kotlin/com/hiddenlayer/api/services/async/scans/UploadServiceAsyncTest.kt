// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer.api.models.scans.upload.UploadStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun completeAll() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val uploadServiceAsync = client.scans().upload()

        val responseFuture =
            uploadServiceAsync.completeAll(
                UploadCompleteAllParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val uploadServiceAsync = client.scans().upload()

        val responseFuture =
            uploadServiceAsync.start(
                UploadStartParams.builder()
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .modelName("model_name")
                    .modelVersion("model_version")
                    .requestingEntity("requesting_entity")
                    .locationAlias("location_alias")
                    .origin("Hugging Face")
                    .requestSource(UploadStartParams.RequestSource.HYBRID_UPLOAD)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
