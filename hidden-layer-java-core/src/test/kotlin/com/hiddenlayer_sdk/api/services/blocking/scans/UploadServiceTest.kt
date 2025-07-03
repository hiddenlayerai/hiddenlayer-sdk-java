// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun completeAll() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val uploadService = client.scans().upload()

        val response =
            uploadService.completeAll(
                UploadCompleteAllParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun start() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val uploadService = client.scans().upload()

        val response =
            uploadService.start(
                UploadStartParams.builder()
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .modelName("model_name")
                    .modelVersion("model_version")
                    .requestingEntity("requesting_entity")
                    .locationAlias("location_alias")
                    .origin("Hugging Face")
                    .requestSource(UploadStartParams.RequestSource.API_UPLOAD)
                    .build()
            )

        response.validate()
    }
}
