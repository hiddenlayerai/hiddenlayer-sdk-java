// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans.upload

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer.api.models.scans.upload.file.FileCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileService = client.scans().upload().file()

        val response =
            fileService.add(
                FileAddParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .fileContentLength(12345L)
                    .fileName("exampleFile.txt")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileService = client.scans().upload().file()

        val response =
            fileService.complete(
                FileCompleteParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        response.validate()
    }
}
