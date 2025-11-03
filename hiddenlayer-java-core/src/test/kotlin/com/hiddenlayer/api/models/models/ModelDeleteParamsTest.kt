// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models

import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelDeleteParamsTest {

    @Test
    fun create() {
        ModelDeleteParams.builder()
            .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ModelDeleteParams.builder().modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ModelDeleteParams.builder()
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "6f22d397-6ca2-4359-8074-3318ab471fdf")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            ModelDeleteParams.builder().modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
