// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans.upload

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun add() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileServiceAsync = client.scans().upload().file()

        val responseFuture =
            fileServiceAsync.add(
                FileAddParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .fileContentLength(12345L)
                    .fileName("exampleFile.txt")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun complete() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileServiceAsync = client.scans().upload().file()

        val responseFuture =
            fileServiceAsync.complete(
                FileCompleteParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
