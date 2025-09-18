// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.upload.file

import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCompleteParamsTest {

    @Test
    fun create() {
        FileCompleteParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FileCompleteParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            FileCompleteParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            FileCompleteParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
