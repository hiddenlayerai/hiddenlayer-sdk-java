// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.hiddenlayer_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ResultRetrieveParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .hasDetections(true)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            ResultRetrieveParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ResultRetrieveParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .hasDetections(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("has_detections", "true").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ResultRetrieveParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
