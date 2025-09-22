// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileScanReportTest {

    @Test
    fun create() {
        val fileScanReport =
            FileScanReport.builder()
                .addFileResult(
                    FileScanReport.FileResult.builder()
                        .details(
                            FileScanReport.FileResult.Details.builder()
                                .estimatedTime("estimated_time")
                                .fileType("safetensors")
                                .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                .fileSize("9 GB")
                                .fileSizeBytes(9663676416L)
                                .fileTypeDetails(
                                    FileScanReport.FileResult.Details.FileTypeDetails
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
                            FileScanReport.FileResult.Detection.builder()
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
                                    FileScanReport.FileResult.Detection.MitreAtlas.builder()
                                        .tactic("AML.TA0001")
                                        .technique("AML.T0003.45")
                                        .build()
                                )
                                .addOwasp("LLM21")
                                .risk(FileScanReport.FileResult.Detection.Risk.MALICIOUS)
                                .ruleId("PICKLE_0055_202408")
                                .severity(FileScanReport.FileResult.Detection.Severity.CRITICAL)
                                .addRuleDetail(
                                    FileScanReport.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            FileScanReport.FileResult.Detection.RuleDetail.Status
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
                        .status(FileScanReport.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .build()

        assertThat(fileScanReport.fileResults().getOrNull())
            .containsExactly(
                FileScanReport.FileResult.builder()
                    .details(
                        FileScanReport.FileResult.Details.builder()
                            .estimatedTime("estimated_time")
                            .fileType("safetensors")
                            .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                            .fileSize("9 GB")
                            .fileSizeBytes(9663676416L)
                            .fileTypeDetails(
                                FileScanReport.FileResult.Details.FileTypeDetails.GgufFileAttributes
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
                        FileScanReport.FileResult.Detection.builder()
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
                                FileScanReport.FileResult.Detection.MitreAtlas.builder()
                                    .tactic("AML.TA0001")
                                    .technique("AML.T0003.45")
                                    .build()
                            )
                            .addOwasp("LLM21")
                            .risk(FileScanReport.FileResult.Detection.Risk.MALICIOUS)
                            .ruleId("PICKLE_0055_202408")
                            .severity(FileScanReport.FileResult.Detection.Severity.CRITICAL)
                            .addRuleDetail(
                                FileScanReport.FileResult.Detection.RuleDetail.builder()
                                    .description("description")
                                    .status(
                                        FileScanReport.FileResult.Detection.RuleDetail.Status
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
                    .status(FileScanReport.FileResult.Status.SKIPPED)
                    .addFileError("File not found")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileScanReport =
            FileScanReport.builder()
                .addFileResult(
                    FileScanReport.FileResult.builder()
                        .details(
                            FileScanReport.FileResult.Details.builder()
                                .estimatedTime("estimated_time")
                                .fileType("safetensors")
                                .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                .fileSize("9 GB")
                                .fileSizeBytes(9663676416L)
                                .fileTypeDetails(
                                    FileScanReport.FileResult.Details.FileTypeDetails
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
                            FileScanReport.FileResult.Detection.builder()
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
                                    FileScanReport.FileResult.Detection.MitreAtlas.builder()
                                        .tactic("AML.TA0001")
                                        .technique("AML.T0003.45")
                                        .build()
                                )
                                .addOwasp("LLM21")
                                .risk(FileScanReport.FileResult.Detection.Risk.MALICIOUS)
                                .ruleId("PICKLE_0055_202408")
                                .severity(FileScanReport.FileResult.Detection.Severity.CRITICAL)
                                .addRuleDetail(
                                    FileScanReport.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            FileScanReport.FileResult.Detection.RuleDetail.Status
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
                        .status(FileScanReport.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .build()

        val roundtrippedFileScanReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileScanReport),
                jacksonTypeRef<FileScanReport>(),
            )

        assertThat(roundtrippedFileScanReport).isEqualTo(fileScanReport)
    }
}
