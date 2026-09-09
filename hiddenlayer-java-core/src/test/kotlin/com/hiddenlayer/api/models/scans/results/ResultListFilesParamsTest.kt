// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.hiddenlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResultListFilesParamsTest {

    @Test
    fun create() {
        ResultListFilesParams.builder()
            .scanId("00000000-0000-0000-0000-000000000000")
            .cursor("cursor")
            .hasDetections(true)
            .pageSize(50L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ResultListFilesParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ResultListFilesParams.builder()
                .scanId("00000000-0000-0000-0000-000000000000")
                .cursor("cursor")
                .hasDetections(true)
                .pageSize(50L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("has_detections", "true")
                    .put("page_size", "50")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ResultListFilesParams.builder().scanId("00000000-0000-0000-0000-000000000000").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
