// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.scans.results.ResultSarifParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResultServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun sarif() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        resultService.sarif(
            ResultSarifParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()
        )
    }
}
