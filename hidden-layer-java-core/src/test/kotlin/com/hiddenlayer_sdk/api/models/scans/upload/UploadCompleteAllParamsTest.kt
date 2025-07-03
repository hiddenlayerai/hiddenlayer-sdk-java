// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.upload

import com.hiddenlayer_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadCompleteAllParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UploadCompleteAllParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            UploadCompleteAllParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            UploadCompleteAllParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }
}
