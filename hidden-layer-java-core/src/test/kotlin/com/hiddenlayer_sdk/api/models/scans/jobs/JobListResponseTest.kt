// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val jobListResponse =
            JobListResponse.builder()
                .addItem(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.ScanModelDetailsV3.builder()
                                .modelName("keras-tf-2025-05-27")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .requestSource(
                                    ScanReport.Inventory.ScanModelDetailsV3.RequestSource.API_UPLOAD
                                )
                                .requestingEntity("requesting_entity")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(ScanReport.Status.PENDING)
                        .version("version")
                        .addDetectionCategory("string")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFileResult(
                            ScanReport.FileResult.builder()
                                .details(
                                    ScanReport.FileResult.Details.builder()
                                        .estimatedTime("estimated_time")
                                        .fileType("safetensors")
                                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                        .fileSize("9 GB")
                                        .fileSizeBytes(9663676416L)
                                        .fileTypeDetails(
                                            ScanReport.FileResult.Details.FileTypeDetails
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
                                    ScanReport.FileResult.Detection.builder()
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
                                            ScanReport.FileResult.Detection.MitreAtlas.builder()
                                                .tactic("AML.TA0001")
                                                .technique("AML.T0003.45")
                                                .build()
                                        )
                                        .addOwasp("LLM21")
                                        .risk(ScanReport.FileResult.Detection.Risk.MALICIOUS)
                                        .ruleId("PICKLE_0055_202408")
                                        .severity(ScanReport.FileResult.Detection.Severity.LOW)
                                        .addRuleDetail(
                                            ScanReport.FileResult.Detection.RuleDetail.builder()
                                                .description("description")
                                                .status(
                                                    ScanReport.FileResult.Detection.RuleDetail
                                                        .Status
                                                        .CREATED
                                                )
                                                .statusAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
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
                                .status(ScanReport.FileResult.Status.SKIPPED)
                                .addFileError("File not found")
                                .build()
                        )
                        .hasGenealogy(true)
                        .severity(ScanReport.Severity.LOW)
                        .summary(
                            ScanReport.Summary.builder()
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .severity(ScanReport.Summary.Severity.LOW)
                                .unknownFiles(0L)
                                .build()
                        )
                        .build()
                )
                .limit(50L)
                .offset(250L)
                .total(0.0)
                .build()

        assertThat(jobListResponse.items())
            .containsExactly(
                ScanReport.builder()
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesWithDetectionsCount(0L)
                    .inventory(
                        ScanReport.Inventory.ScanModelDetailsV3.builder()
                            .modelName("keras-tf-2025-05-27")
                            .requestedScanLocation("/files-to-scan")
                            .modelSource("adhoc")
                            .modelVersion("1.0.0")
                            .origin("Hugging Face")
                            .requestSource(
                                ScanReport.Inventory.ScanModelDetailsV3.RequestSource.API_UPLOAD
                            )
                            .requestingEntity("requesting_entity")
                            .build()
                    )
                    .scanId("scan_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(ScanReport.Status.PENDING)
                    .version("version")
                    .addDetectionCategory("string")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFileResult(
                        ScanReport.FileResult.builder()
                            .details(
                                ScanReport.FileResult.Details.builder()
                                    .estimatedTime("estimated_time")
                                    .fileType("safetensors")
                                    .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                    .fileSize("9 GB")
                                    .fileSizeBytes(9663676416L)
                                    .fileTypeDetails(
                                        ScanReport.FileResult.Details.FileTypeDetails
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
                                ScanReport.FileResult.Detection.builder()
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
                                        ScanReport.FileResult.Detection.MitreAtlas.builder()
                                            .tactic("AML.TA0001")
                                            .technique("AML.T0003.45")
                                            .build()
                                    )
                                    .addOwasp("LLM21")
                                    .risk(ScanReport.FileResult.Detection.Risk.MALICIOUS)
                                    .ruleId("PICKLE_0055_202408")
                                    .severity(ScanReport.FileResult.Detection.Severity.LOW)
                                    .addRuleDetail(
                                        ScanReport.FileResult.Detection.RuleDetail.builder()
                                            .description("description")
                                            .status(
                                                ScanReport.FileResult.Detection.RuleDetail.Status
                                                    .CREATED
                                            )
                                            .statusAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                            .status(ScanReport.FileResult.Status.SKIPPED)
                            .addFileError("File not found")
                            .build()
                    )
                    .hasGenealogy(true)
                    .severity(ScanReport.Severity.LOW)
                    .summary(
                        ScanReport.Summary.builder()
                            .addDetectionCategory("string")
                            .detectionCount(0L)
                            .fileCount(0L)
                            .filesFailedToScan(0L)
                            .filesWithDetectionsCount(0L)
                            .severity(ScanReport.Summary.Severity.LOW)
                            .unknownFiles(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(jobListResponse.limit()).isEqualTo(50L)
        assertThat(jobListResponse.offset()).isEqualTo(250L)
        assertThat(jobListResponse.total()).isEqualTo(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListResponse =
            JobListResponse.builder()
                .addItem(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.ScanModelDetailsV3.builder()
                                .modelName("keras-tf-2025-05-27")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .requestSource(
                                    ScanReport.Inventory.ScanModelDetailsV3.RequestSource.API_UPLOAD
                                )
                                .requestingEntity("requesting_entity")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(ScanReport.Status.PENDING)
                        .version("version")
                        .addDetectionCategory("string")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFileResult(
                            ScanReport.FileResult.builder()
                                .details(
                                    ScanReport.FileResult.Details.builder()
                                        .estimatedTime("estimated_time")
                                        .fileType("safetensors")
                                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                        .fileSize("9 GB")
                                        .fileSizeBytes(9663676416L)
                                        .fileTypeDetails(
                                            ScanReport.FileResult.Details.FileTypeDetails
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
                                    ScanReport.FileResult.Detection.builder()
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
                                            ScanReport.FileResult.Detection.MitreAtlas.builder()
                                                .tactic("AML.TA0001")
                                                .technique("AML.T0003.45")
                                                .build()
                                        )
                                        .addOwasp("LLM21")
                                        .risk(ScanReport.FileResult.Detection.Risk.MALICIOUS)
                                        .ruleId("PICKLE_0055_202408")
                                        .severity(ScanReport.FileResult.Detection.Severity.LOW)
                                        .addRuleDetail(
                                            ScanReport.FileResult.Detection.RuleDetail.builder()
                                                .description("description")
                                                .status(
                                                    ScanReport.FileResult.Detection.RuleDetail
                                                        .Status
                                                        .CREATED
                                                )
                                                .statusAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
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
                                .status(ScanReport.FileResult.Status.SKIPPED)
                                .addFileError("File not found")
                                .build()
                        )
                        .hasGenealogy(true)
                        .severity(ScanReport.Severity.LOW)
                        .summary(
                            ScanReport.Summary.builder()
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .severity(ScanReport.Summary.Severity.LOW)
                                .unknownFiles(0L)
                                .build()
                        )
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
