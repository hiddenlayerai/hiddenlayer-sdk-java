// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.reports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ReportCreateParams.builder()
            .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .location("location")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            ReportCreateParams.builder()
                .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .location("location")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ReportCreateParams.builder()
                .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .location("location")
                .build()

        val body = params._body()

        assertThat(body.location()).isEqualTo("location")
    }
}
