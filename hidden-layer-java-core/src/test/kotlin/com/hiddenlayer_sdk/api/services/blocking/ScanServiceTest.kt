// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.scans.ScanCreateReportParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScanServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkHealth() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanService = client.scans()

        scanService.checkHealth()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkReadiness() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanService = client.scans()

        scanService.checkReadiness()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createReport() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanService = client.scans()

        scanService.createReport(
            ScanCreateReportParams.builder()
                .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .location("location")
                .build()
        )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveResults() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanService = client.scans()

        val response =
            scanService.retrieveResults(
                ScanRetrieveResultsParams.builder()
                    .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .pageSize(1L)
                    .build()
            )

        response.validate()
    }
}
