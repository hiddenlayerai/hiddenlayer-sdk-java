// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun completeAll() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val uploadServiceAsync = client.scans().upload()

        val responseFuture = uploadServiceAsync.completeAll("00000000-0000-0000-0000-000000000000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
                    .modelName("model_name")
                    .modelVersion("model_version")
                    .requestingEntity("requesting_entity")
                    .locationAlias("location_alias")
                    .origin("Hugging Face")
                    .requestSource(UploadStartParams.RequestSource.API_UPLOAD)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
