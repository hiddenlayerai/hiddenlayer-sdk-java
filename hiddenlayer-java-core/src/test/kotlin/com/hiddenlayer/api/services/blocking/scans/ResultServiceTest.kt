// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFiles() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val resultService = client.scans().results()

        val page = resultService.listFiles("00000000-0000-0000-0000-000000000000")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val resultService = client.scans().results()

        val scanReportSummary =
            resultService.retrieveSummary("00000000-0000-0000-0000-000000000000")

        scanReportSummary.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sarif() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val resultService = client.scans().results()

        resultService.sarif("00000000-0000-0000-0000-000000000000")
    }
}
