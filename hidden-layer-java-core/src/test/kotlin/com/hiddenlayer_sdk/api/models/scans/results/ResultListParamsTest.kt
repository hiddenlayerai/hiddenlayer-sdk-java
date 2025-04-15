// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ResultListParams.builder()
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .latestPerModelVersionOnly(true)
            .limit(1L)
            .addModelId("string")
            .addModelVersionId("string")
            .offset(0L)
            .addSeverity("string")
            .sort("sort")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addStatus("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ResultListParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestPerModelVersionOnly(true)
                .limit(1L)
                .addModelId("string")
                .addModelVersionId("string")
                .offset(0L)
                .addSeverity("string")
                .sort("sort")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStatus("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("latest_per_model_version_only", "true")
                    .put("limit", "1")
                    .put("model_ids", listOf("string").joinToString(","))
                    .put("model_version_ids", listOf("string").joinToString(","))
                    .put("offset", "0")
                    .put("severity", listOf("string").joinToString(","))
                    .put("sort", "sort")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("status", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ResultListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
