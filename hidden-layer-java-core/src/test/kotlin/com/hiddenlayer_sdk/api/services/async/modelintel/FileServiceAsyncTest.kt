// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.modelintel

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.modelintel.files.FileRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileServiceAsync = client.modelIntel().files()

        val fileFuture =
            fileServiceAsync.retrieve(
                FileRetrieveParams.builder()
                    .sha256("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
                    .cursor("cursor")
                    .pageSize(50L)
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getMetadata() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileServiceAsync = client.modelIntel().files()

        val responseFuture =
            fileServiceAsync.getMetadata(
                "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
            )

        val response = responseFuture.get()
        response.validate()
    }
}
