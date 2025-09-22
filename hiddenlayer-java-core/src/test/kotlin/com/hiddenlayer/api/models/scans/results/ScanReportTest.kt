// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScanReportTest {

    @Test
    fun create() {
        val scanReport =
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
                .schemaVersion("\$schema_version")
                .compliance(
                    ScanReport.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ScanReport.Compliance.Status.COMPLIANT)
                        .build()
                )
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
                                    ScanReport.FileResult.Details.FileTypeDetails.GgufFileAttributes
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
                                .severity(ScanReport.FileResult.Detection.Severity.CRITICAL)
                                .addRuleDetail(
                                    ScanReport.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            ScanReport.FileResult.Detection.RuleDetail.Status
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
                        .status(ScanReport.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .hasGenealogy(true)
                .severity(ScanReport.Severity.CRITICAL)
                .summary(
                    ScanReport.Summary.builder()
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .severity(ScanReport.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .build()

        assertThat(scanReport.detectionCount()).isEqualTo(0L)
        assertThat(scanReport.fileCount()).isEqualTo(0L)
        assertThat(scanReport.filesWithDetectionsCount()).isEqualTo(0L)
        assertThat(scanReport.inventory())
            .isEqualTo(
                ScanReport.Inventory.ofScanModelDetailsV3(
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
            )
        assertThat(scanReport.scanId()).isEqualTo("scan_id")
        assertThat(scanReport.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scanReport.status()).isEqualTo(ScanReport.Status.PENDING)
        assertThat(scanReport.version()).isEqualTo("version")
        assertThat(scanReport.schemaVersion()).contains("\$schema_version")
        assertThat(scanReport.compliance())
            .contains(
                ScanReport.Compliance.builder()
                    .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(ScanReport.Compliance.Status.COMPLIANT)
                    .build()
            )
        assertThat(scanReport.detectionCategories().getOrNull()).containsExactly("string")
        assertThat(scanReport.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scanReport.fileResults().getOrNull())
            .containsExactly(
                ScanReport.FileResult.builder()
                    .details(
                        ScanReport.FileResult.Details.builder()
                            .estimatedTime("estimated_time")
                            .fileType("safetensors")
                            .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                            .fileSize("9 GB")
                            .fileSizeBytes(9663676416L)
                            .fileTypeDetails(
                                ScanReport.FileResult.Details.FileTypeDetails.GgufFileAttributes
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
                            .severity(ScanReport.FileResult.Detection.Severity.CRITICAL)
                            .addRuleDetail(
                                ScanReport.FileResult.Detection.RuleDetail.builder()
                                    .description("description")
                                    .status(
                                        ScanReport.FileResult.Detection.RuleDetail.Status.CREATED
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
                    .status(ScanReport.FileResult.Status.SKIPPED)
                    .addFileError("File not found")
                    .build()
            )
        assertThat(scanReport.hasGenealogy()).contains(true)
        assertThat(scanReport.severity()).contains(ScanReport.Severity.CRITICAL)
        assertThat(scanReport.summary())
            .contains(
                ScanReport.Summary.builder()
                    .addDetectionCategory("string")
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesFailedToScan(0L)
                    .filesWithDetectionsCount(0L)
                    .severity(ScanReport.Summary.Severity.CRITICAL)
                    .unknownFiles(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scanReport =
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
                .schemaVersion("\$schema_version")
                .compliance(
                    ScanReport.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ScanReport.Compliance.Status.COMPLIANT)
                        .build()
                )
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
                                    ScanReport.FileResult.Details.FileTypeDetails.GgufFileAttributes
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
                                .severity(ScanReport.FileResult.Detection.Severity.CRITICAL)
                                .addRuleDetail(
                                    ScanReport.FileResult.Detection.RuleDetail.builder()
                                        .description("description")
                                        .status(
                                            ScanReport.FileResult.Detection.RuleDetail.Status
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
                        .status(ScanReport.FileResult.Status.SKIPPED)
                        .addFileError("File not found")
                        .build()
                )
                .hasGenealogy(true)
                .severity(ScanReport.Severity.CRITICAL)
                .summary(
                    ScanReport.Summary.builder()
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .severity(ScanReport.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .build()

        val roundtrippedScanReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scanReport),
                jacksonTypeRef<ScanReport>(),
            )

        assertThat(roundtrippedScanReport).isEqualTo(scanReport)
    }
}
