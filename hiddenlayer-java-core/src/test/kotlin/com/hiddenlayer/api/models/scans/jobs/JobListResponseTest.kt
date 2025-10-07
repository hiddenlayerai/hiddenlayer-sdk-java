// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Test
    fun create() {
        val jobListResponse =
            JobListResponse.builder()
                .addItem(
                    JobListResponse.Item.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            JobListResponse.Item.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .requestSource(
                                    JobListResponse.Item.Inventory.RequestSource.HYBRID_UPLOAD
                                )
                                .requestingEntity("requesting_entity")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(JobListResponse.Item.Status.PENDING)
                        .summary(
                            JobListResponse.Item.Summary.builder()
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .highestSeverity(
                                    JobListResponse.Item.Summary.HighestSeverity.NOT_AVAILABLE
                                )
                                .severity(JobListResponse.Item.Summary.Severity.NOT_AVAILABLE)
                                .unknownFiles(0L)
                                .build()
                        )
                        .version("version")
                        .schemaVersion("\$schema_version")
                        .compliance(
                            JobListResponse.Item.Compliance.builder()
                                .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(JobListResponse.Item.Compliance.Status.COMPLIANT)
                                .build()
                        )
                        .addDetectionCategory("string")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hasGenealogy(true)
                        .severity(JobListResponse.Item.Severity.NOT_AVAILABLE)
                        .build()
                )
                .limit(50L)
                .offset(250L)
                .total(0.0)
                .build()

        assertThat(jobListResponse.items())
            .containsExactly(
                JobListResponse.Item.builder()
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesWithDetectionsCount(0L)
                    .inventory(
                        JobListResponse.Item.Inventory.builder()
                            .modelId("00000000-0000-0000-0000-000000000000")
                            .modelName("keras-tf-2025-05-27")
                            .modelVersionId("00000000-0000-0000-0000-000000000000")
                            .requestedScanLocation("/files-to-scan")
                            .modelSource("adhoc")
                            .modelVersion("1.0.0")
                            .origin("Hugging Face")
                            .requestSource(
                                JobListResponse.Item.Inventory.RequestSource.HYBRID_UPLOAD
                            )
                            .requestingEntity("requesting_entity")
                            .build()
                    )
                    .scanId("scan_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(JobListResponse.Item.Status.PENDING)
                    .summary(
                        JobListResponse.Item.Summary.builder()
                            .addDetectionCategory("string")
                            .detectionCount(0L)
                            .fileCount(0L)
                            .filesFailedToScan(0L)
                            .filesWithDetectionsCount(0L)
                            .highestSeverity(
                                JobListResponse.Item.Summary.HighestSeverity.NOT_AVAILABLE
                            )
                            .severity(JobListResponse.Item.Summary.Severity.NOT_AVAILABLE)
                            .unknownFiles(0L)
                            .build()
                    )
                    .version("version")
                    .schemaVersion("\$schema_version")
                    .compliance(
                        JobListResponse.Item.Compliance.builder()
                            .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(JobListResponse.Item.Compliance.Status.COMPLIANT)
                            .build()
                    )
                    .addDetectionCategory("string")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hasGenealogy(true)
                    .severity(JobListResponse.Item.Severity.NOT_AVAILABLE)
                    .build()
            )
        assertThat(jobListResponse.limit()).isEqualTo(50L)
        assertThat(jobListResponse.offset()).isEqualTo(250L)
        assertThat(jobListResponse.total()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListResponse =
            JobListResponse.builder()
                .addItem(
                    JobListResponse.Item.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            JobListResponse.Item.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .requestSource(
                                    JobListResponse.Item.Inventory.RequestSource.HYBRID_UPLOAD
                                )
                                .requestingEntity("requesting_entity")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(JobListResponse.Item.Status.PENDING)
                        .summary(
                            JobListResponse.Item.Summary.builder()
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .highestSeverity(
                                    JobListResponse.Item.Summary.HighestSeverity.NOT_AVAILABLE
                                )
                                .severity(JobListResponse.Item.Summary.Severity.NOT_AVAILABLE)
                                .unknownFiles(0L)
                                .build()
                        )
                        .version("version")
                        .schemaVersion("\$schema_version")
                        .compliance(
                            JobListResponse.Item.Compliance.builder()
                                .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(JobListResponse.Item.Compliance.Status.COMPLIANT)
                                .build()
                        )
                        .addDetectionCategory("string")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hasGenealogy(true)
                        .severity(JobListResponse.Item.Severity.NOT_AVAILABLE)
                        .build()
                )
                .limit(50L)
                .offset(250L)
                .total(0.0)
                .build()

        val roundtrippedJobListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobListResponse),
                jacksonTypeRef<JobListResponse>(),
            )

        assertThat(roundtrippedJobListResponse).isEqualTo(jobListResponse)
    }
}
