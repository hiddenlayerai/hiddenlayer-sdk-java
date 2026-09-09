// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFiles() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val resultServiceAsync = client.scans().results()

        val pageFuture = resultServiceAsync.listFiles("00000000-0000-0000-0000-000000000000")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val resultServiceAsync = client.scans().results()

        val scanReportSummaryFuture =
            resultServiceAsync.retrieveSummary("00000000-0000-0000-0000-000000000000")

        val scanReportSummary = scanReportSummaryFuture.get()
        scanReportSummary.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sarif() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val resultServiceAsync = client.scans().results()

        val responseFuture = resultServiceAsync.sarif("00000000-0000-0000-0000-000000000000")

        val response = responseFuture.get()
    }
}
