// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.scans.ScanCreateReportParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScanServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkHealth() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanServiceAsync = client.scans()

        val future = scanServiceAsync.checkHealth()

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkReadiness() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanServiceAsync = client.scans()

        val future = scanServiceAsync.checkReadiness()

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createReport() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanServiceAsync = client.scans()

        val future =
            scanServiceAsync.createReport(
                ScanCreateReportParams.builder()
                    .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .location("location")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveResults() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val scanServiceAsync = client.scans()

        val responseFuture =
            scanServiceAsync.retrieveResults(
                ScanRetrieveResultsParams.builder()
                    .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .pageSize(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
