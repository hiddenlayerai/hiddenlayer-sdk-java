// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.scans.upload.UploadStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun completeAll() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val uploadService = client.scans().upload()

        val response = uploadService.completeAll("00000000-0000-0000-0000-000000000000")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val uploadService = client.scans().upload()

        val response =
            uploadService.start(
                UploadStartParams.builder()
                    .modelName("model_name")
                    .modelVersion("model_version")
                    .requestingEntity("requesting_entity")
                    .locationAlias("location_alias")
                    .origin("Hugging Face")
                    .requestSource(UploadStartParams.RequestSource.HYBRID_UPLOAD)
                    .build()
            )

        response.validate()
    }
}
