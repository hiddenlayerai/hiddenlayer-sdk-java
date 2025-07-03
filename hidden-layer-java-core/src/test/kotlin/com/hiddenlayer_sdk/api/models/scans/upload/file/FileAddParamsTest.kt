// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.upload.file

import com.hiddenlayer_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileAddParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        FileAddParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .fileContentLength(12345L)
            .fileName("exampleFile.txt")
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            FileAddParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .fileContentLength(12345L)
                .fileName("exampleFile.txt")
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
            FileAddParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .fileContentLength(12345L)
                .fileName("exampleFile.txt")
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("file-content-length", "12345")
                    .put("file-name", "exampleFile.txt")
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }
}
