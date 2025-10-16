// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRetrieveResponseTest {

    @Test
    fun create() {
        val jobRetrieveResponse =
            JobRetrieveResponse.builder()
                .detectionCount(0L)
                .fileCount(0L)
                .filesWithDetectionsCount(0L)
                .inventory(
                    JobRetrieveResponse.Inventory.builder()
                        .modelId("00000000-0000-0000-0000-000000000000")
                        .modelName("keras-tf-2025-05-27")
                        .modelVersionId("00000000-0000-0000-0000-000000000000")
                        .requestedScanLocation("/files-to-scan")
                        .modelSource("adhoc")
                        .modelVersion("1.0.0")
                        .origin("Hugging Face")
                        .requestSource(JobRetrieveResponse.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestingEntity("requesting_entity")
                        .build()
                )
                .scanId("scan_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(JobRetrieveResponse.Status.PENDING)
                .summary(
                    JobRetrieveResponse.Summary.builder()
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .highestSeverity(JobRetrieveResponse.Summary.HighestSeverity.CRITICAL)
                        .severity(JobRetrieveResponse.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .version("version")
                .schemaVersion("\$schema_version")
                .compliance(
                    JobRetrieveResponse.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(JobRetrieveResponse.Compliance.Status.COMPLIANT)
                        .build()
                )
                .addDetectionCategory("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFileResult(
                    JobRetrieveResponse.FileResult.builder()
                        .details(
                            JobRetrieveResponse.FileResult.Details.builder()
                                .estimatedTime("estimated_time")
                                .fileType("safetensors")
                                .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                .fileSize("9 GB")
                                .fileSizeBytes(9663676416L)
                                .fileTypeDetails(
                                    JobRetrieveResponse.FileResult.Details.FileTypeDetails
                                        .GgufFileAttributes
                                        .builder()
                                        .addSubtype("string")
                                        .build()
                                )
                                .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                .tlsh(
                                    "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                )
                                .build()
                        )
                        .addDetection(
                            JobRetrieveResponse.FileResult.Detection.builder()
                                .category("Arbitrary Code Execution")
                                .addCve("CVE-7321-910225")
                                .cwe("")
                                .cweHref("cwe_href")
                                .description(
                                    "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                )
                                .detectionId("00000000-0000-0000-0000-000000000000")
                                .impact("critical")
                                .likelihood("medium")
                                .addMitreAtlas(
                                    JobRetrieveResponse.FileResult.Detection.MitreAtlas.builder()
                                        .tactic("AML.TA0001")
                                        .technique("AML.T0003.45")
                                        .build()
                                )
                                .addOwasp("LLM21")
                                .risk(JobRetrieveResponse.FileResult.Detection.Risk.MALICIOUS)
                                .ruleId("PICKLE_0055_202408")
                                .severity(
                                    JobRetrieveResponse.FileResult.Detection.Severity.CRITICAL
                                )
                                .addRuleDetail(
                                    JobRetrieveResponse.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            JobRetrieveResponse.FileResult.Detection.RuleDetail
                                                .Status
                                                .CREATED
                                        )
                                        .statusAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .technicalBlogHref("technical_blog_href")
                                .addTechnicalBlogHref("string")
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                        .fileInstanceId("file_instance_id")
                        .fileLocation("file_location")
                        .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                        .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                        .status(JobRetrieveResponse.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .hasGenealogy(true)
                .severity(JobRetrieveResponse.Severity.CRITICAL)
                .build()

        assertThat(jobRetrieveResponse.detectionCount()).isEqualTo(0L)
        assertThat(jobRetrieveResponse.fileCount()).isEqualTo(0L)
        assertThat(jobRetrieveResponse.filesWithDetectionsCount()).isEqualTo(0L)
        assertThat(jobRetrieveResponse.inventory())
            .isEqualTo(
                JobRetrieveResponse.Inventory.builder()
                    .modelId("00000000-0000-0000-0000-000000000000")
                    .modelName("keras-tf-2025-05-27")
                    .modelVersionId("00000000-0000-0000-0000-000000000000")
                    .requestedScanLocation("/files-to-scan")
                    .modelSource("adhoc")
                    .modelVersion("1.0.0")
                    .origin("Hugging Face")
                    .requestSource(JobRetrieveResponse.Inventory.RequestSource.HYBRID_UPLOAD)
                    .requestingEntity("requesting_entity")
                    .build()
            )
        assertThat(jobRetrieveResponse.scanId()).isEqualTo("scan_id")
        assertThat(jobRetrieveResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jobRetrieveResponse.status()).isEqualTo(JobRetrieveResponse.Status.PENDING)
        assertThat(jobRetrieveResponse.summary())
            .isEqualTo(
                JobRetrieveResponse.Summary.builder()
                    .addDetectionCategory("string")
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesFailedToScan(0L)
                    .filesWithDetectionsCount(0L)
                    .highestSeverity(JobRetrieveResponse.Summary.HighestSeverity.CRITICAL)
                    .severity(JobRetrieveResponse.Summary.Severity.CRITICAL)
                    .unknownFiles(0L)
                    .build()
            )
        assertThat(jobRetrieveResponse.version()).isEqualTo("version")
        assertThat(jobRetrieveResponse.schemaVersion()).contains("\$schema_version")
        assertThat(jobRetrieveResponse.compliance())
            .contains(
                JobRetrieveResponse.Compliance.builder()
                    .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(JobRetrieveResponse.Compliance.Status.COMPLIANT)
                    .build()
            )
        assertThat(jobRetrieveResponse.detectionCategories().getOrNull()).containsExactly("string")
        assertThat(jobRetrieveResponse.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jobRetrieveResponse.fileResults().getOrNull())
            .containsExactly(
                JobRetrieveResponse.FileResult.builder()
                    .details(
                        JobRetrieveResponse.FileResult.Details.builder()
                            .estimatedTime("estimated_time")
                            .fileType("safetensors")
                            .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                            .fileSize("9 GB")
                            .fileSizeBytes(9663676416L)
                            .fileTypeDetails(
                                JobRetrieveResponse.FileResult.Details.FileTypeDetails
                                    .GgufFileAttributes
                                    .builder()
                                    .addSubtype("string")
                                    .build()
                            )
                            .md5("ce114e4501d2f4e2dcea3e17b546f339")
                            .tlsh(
                                "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                            )
                            .build()
                    )
                    .addDetection(
                        JobRetrieveResponse.FileResult.Detection.builder()
                            .category("Arbitrary Code Execution")
                            .addCve("CVE-7321-910225")
                            .cwe("")
                            .cweHref("cwe_href")
                            .description(
                                "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                            )
                            .detectionId("00000000-0000-0000-0000-000000000000")
                            .impact("critical")
                            .likelihood("medium")
                            .addMitreAtlas(
                                JobRetrieveResponse.FileResult.Detection.MitreAtlas.builder()
                                    .tactic("AML.TA0001")
                                    .technique("AML.T0003.45")
                                    .build()
                            )
                            .addOwasp("LLM21")
                            .risk(JobRetrieveResponse.FileResult.Detection.Risk.MALICIOUS)
                            .ruleId("PICKLE_0055_202408")
                            .severity(JobRetrieveResponse.FileResult.Detection.Severity.CRITICAL)
                            .addRuleDetail(
                                JobRetrieveResponse.FileResult.Detection.RuleDetail.builder()
                                    .description("description")
                                    .status(
                                        JobRetrieveResponse.FileResult.Detection.RuleDetail.Status
                                            .CREATED
                                    )
                                    .statusAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .technicalBlogHref("technical_blog_href")
                            .addTechnicalBlogHref("string")
                            .build()
                    )
                    .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                    .fileInstanceId("file_instance_id")
                    .fileLocation("file_location")
                    .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                    .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                    .status(JobRetrieveResponse.FileResult.Status.SKIPPED)
                    .addFileError("File not found")
                    .build()
            )
        assertThat(jobRetrieveResponse.hasGenealogy()).contains(true)
        assertThat(jobRetrieveResponse.severity()).contains(JobRetrieveResponse.Severity.CRITICAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobRetrieveResponse =
            JobRetrieveResponse.builder()
                .detectionCount(0L)
                .fileCount(0L)
                .filesWithDetectionsCount(0L)
                .inventory(
                    JobRetrieveResponse.Inventory.builder()
                        .modelId("00000000-0000-0000-0000-000000000000")
                        .modelName("keras-tf-2025-05-27")
                        .modelVersionId("00000000-0000-0000-0000-000000000000")
                        .requestedScanLocation("/files-to-scan")
                        .modelSource("adhoc")
                        .modelVersion("1.0.0")
                        .origin("Hugging Face")
                        .requestSource(JobRetrieveResponse.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestingEntity("requesting_entity")
                        .build()
                )
                .scanId("scan_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(JobRetrieveResponse.Status.PENDING)
                .summary(
                    JobRetrieveResponse.Summary.builder()
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .highestSeverity(JobRetrieveResponse.Summary.HighestSeverity.CRITICAL)
                        .severity(JobRetrieveResponse.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .version("version")
                .schemaVersion("\$schema_version")
                .compliance(
                    JobRetrieveResponse.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(JobRetrieveResponse.Compliance.Status.COMPLIANT)
                        .build()
                )
                .addDetectionCategory("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFileResult(
                    JobRetrieveResponse.FileResult.builder()
                        .details(
                            JobRetrieveResponse.FileResult.Details.builder()
                                .estimatedTime("estimated_time")
                                .fileType("safetensors")
                                .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                .fileSize("9 GB")
                                .fileSizeBytes(9663676416L)
                                .fileTypeDetails(
                                    JobRetrieveResponse.FileResult.Details.FileTypeDetails
                                        .GgufFileAttributes
                                        .builder()
                                        .addSubtype("string")
                                        .build()
                                )
                                .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                .tlsh(
                                    "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                )
                                .build()
                        )
                        .addDetection(
                            JobRetrieveResponse.FileResult.Detection.builder()
                                .category("Arbitrary Code Execution")
                                .addCve("CVE-7321-910225")
                                .cwe("")
                                .cweHref("cwe_href")
                                .description(
                                    "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                )
                                .detectionId("00000000-0000-0000-0000-000000000000")
                                .impact("critical")
                                .likelihood("medium")
                                .addMitreAtlas(
                                    JobRetrieveResponse.FileResult.Detection.MitreAtlas.builder()
                                        .tactic("AML.TA0001")
                                        .technique("AML.T0003.45")
                                        .build()
                                )
                                .addOwasp("LLM21")
                                .risk(JobRetrieveResponse.FileResult.Detection.Risk.MALICIOUS)
                                .ruleId("PICKLE_0055_202408")
                                .severity(
                                    JobRetrieveResponse.FileResult.Detection.Severity.CRITICAL
                                )
                                .addRuleDetail(
                                    JobRetrieveResponse.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            JobRetrieveResponse.FileResult.Detection.RuleDetail
                                                .Status
                                                .CREATED
                                        )
                                        .statusAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .technicalBlogHref("technical_blog_href")
                                .addTechnicalBlogHref("string")
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                        .fileInstanceId("file_instance_id")
                        .fileLocation("file_location")
                        .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                        .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                        .status(JobRetrieveResponse.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .hasGenealogy(true)
                .severity(JobRetrieveResponse.Severity.CRITICAL)
                .build()

        val roundtrippedJobRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobRetrieveResponse),
                jacksonTypeRef<JobRetrieveResponse>(),
            )

        assertThat(roundtrippedJobRetrieveResponse).isEqualTo(jobRetrieveResponse)
    }
}
