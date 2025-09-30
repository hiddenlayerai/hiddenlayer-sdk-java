// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Test
    fun create() {
        JobListParams.builder()
            .addComplianceStatus(JobListParams.ComplianceStatus.COMPLIANT)
            .detectionCategory("detection_category")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .latestPerModelVersionOnly(true)
            .limit(1L)
            .addModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
            .addModelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .offset(0L)
            .addRequestSource(JobListParams.RequestSource.API_UPLOAD)
            .scannerVersion("891.0.97194")
            .severity(JobListParams.Severity.CRITICAL)
            .sort("-start_time")
            .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addStatus("string")
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Test
    fun headers() {
        val params =
            JobListParams.builder()
                .addComplianceStatus(JobListParams.ComplianceStatus.COMPLIANT)
                .detectionCategory("detection_category")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestPerModelVersionOnly(true)
                .limit(1L)
                .addModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .offset(0L)
                .addRequestSource(JobListParams.RequestSource.API_UPLOAD)
                .scannerVersion("891.0.97194")
                .severity(JobListParams.Severity.CRITICAL)
                .sort("-start_time")
                .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStatus("string")
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
        val params = JobListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            JobListParams.builder()
                .addComplianceStatus(JobListParams.ComplianceStatus.COMPLIANT)
                .detectionCategory("detection_category")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestPerModelVersionOnly(true)
                .limit(1L)
                .addModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modelName(JobListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .offset(0L)
                .addRequestSource(JobListParams.RequestSource.API_UPLOAD)
                .scannerVersion("891.0.97194")
                .severity(JobListParams.Severity.CRITICAL)
                .sort("-start_time")
                .source(JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build())
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStatus("string")
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("compliance_status", listOf("COMPLIANT").joinToString(","))
                    .put("detection_category", "detection_category")
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("latest_per_model_version_only", "true")
                    .put("limit", "1")
                    .put(
                        "model_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("model_name[contains]", "contains")
                    .put("model_name[eq]", "eq")
                    .put(
                        "model_version_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("offset", "0")
                    .put("request_source", listOf("API Upload").joinToString(","))
                    .put("scanner_version", "891.0.97194")
                    .put("severity", "critical")
                    .put("sort", "-start_time")
                    .put("source[eq]", "adhoc")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("status", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JobListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
