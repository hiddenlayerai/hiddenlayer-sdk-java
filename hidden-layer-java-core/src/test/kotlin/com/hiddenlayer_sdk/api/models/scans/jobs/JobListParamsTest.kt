// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.jobs

import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        JobListParams.builder()
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .detectionCategory("detection_category")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .latestPerModelVersionOnly(true)
            .limit(1L)
            .addModelId("string")
            .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
            .addModelVersionId("string")
            .offset(0L)
            .scannerVersion("scanner_version")
            .addSeverity("string")
            .sort("sort")
            .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addStatus("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            JobListParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .detectionCategory("detection_category")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestPerModelVersionOnly(true)
                .limit(1L)
                .addModelId("string")
                .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModelVersionId("string")
                .offset(0L)
                .scannerVersion("scanner_version")
                .addSeverity("string")
                .sort("sort")
                .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStatus("string")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params =
            JobListParams.builder().xCorrelationId("00000000-0000-0000-0000-000000000000").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            JobListParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .detectionCategory("detection_category")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestPerModelVersionOnly(true)
                .limit(1L)
                .addModelId("string")
                .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModelVersionId("string")
                .offset(0L)
                .scannerVersion("scanner_version")
                .addSeverity("string")
                .sort("sort")
                .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStatus("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("detection_category", "detection_category")
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("latest_per_model_version_only", "true")
                    .put("limit", "1")
                    .put("model_ids", listOf("string").joinToString(","))
                    .put("model_name[contains]", "contains")
                    .put("model_name[eq]", "eq")
                    .put("model_version_ids", listOf("string").joinToString(","))
                    .put("offset", "0")
                    .put("scanner_version", "scanner_version")
                    .put("severity", listOf("string").joinToString(","))
                    .put("sort", "sort")
                    .put("source[eq]", "adhoc")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("status", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobListParams.builder().xCorrelationId("00000000-0000-0000-0000-000000000000").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
