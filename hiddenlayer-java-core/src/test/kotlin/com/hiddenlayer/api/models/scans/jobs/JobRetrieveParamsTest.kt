// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.hiddenlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRetrieveParamsTest {

    @Test
    fun create() {
        JobRetrieveParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .hasDetections(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            JobRetrieveParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            JobRetrieveParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .hasDetections(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("has_detections", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobRetrieveParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
