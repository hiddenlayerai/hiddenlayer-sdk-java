// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScanFileResultTest {

    @Test
    fun create() {
        val scanFileResult =
            ScanFileResult.builder()
                .details(
                    ScanFileResult.Details.builder()
                        .estimatedTime("estimated_time")
                        .fileType("safetensors")
                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                        .fileSize("9 GB")
                        .fileSizeBytes(9663676416L)
                        .fileTypeDetails(
                            ScanFileResult.Details.FileTypeDetails.GgufFileAttributes.builder()
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
                    ScanFileResult.Detection.builder()
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
                            ScanFileResult.Detection.MitreAtlas.builder()
                                .tactic("AML.TA0001")
                                .technique("AML.T0003.45")
                                .build()
                        )
                        .addOwasp("LLM21")
                        .risk(ScanFileResult.Detection.Risk.MALICIOUS)
                        .ruleId("PICKLE_0055_202408")
                        .severity(ScanFileResult.Detection.Severity.CRITICAL)
                        .addRuleDetail(
                            ScanFileResult.Detection.RuleDetail.builder()
                                .description("description")
                                .status(ScanFileResult.Detection.RuleDetail.Status.CREATED)
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
                .status(ScanFileResult.Status.SKIPPED)
                .addAdvisory(
                    ScanFileResult.Advisory.builder()
                        .advisoryId("00000000-0000-0000-0000-000000000000")
                        .category("TokenBreak")
                        .description(
                            "Models using the BPE and WordPiece tokenization strategies are vulnerable to TokenBreak"
                        )
                        .ruleId("SAFETENSORS_0001_202512")
                        .build()
                )
                .compliance(
                    ScanFileResult.Compliance.builder()
                        .addRationale("string")
                        .status(ScanFileResult.Compliance.Status.COMPLIANT)
                        .build()
                )
                .addFileError("File not found")
                .build()

        assertThat(scanFileResult.details())
            .isEqualTo(
                ScanFileResult.Details.builder()
                    .estimatedTime("estimated_time")
                    .fileType("safetensors")
                    .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                    .fileSize("9 GB")
                    .fileSizeBytes(9663676416L)
                    .fileTypeDetails(
                        ScanFileResult.Details.FileTypeDetails.GgufFileAttributes.builder()
                            .addSubtype("string")
                            .build()
                    )
                    .md5("ce114e4501d2f4e2dcea3e17b546f339")
                    .tlsh("T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293")
                    .build()
            )
        assertThat(scanFileResult.detections())
            .containsExactly(
                ScanFileResult.Detection.builder()
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
                        ScanFileResult.Detection.MitreAtlas.builder()
                            .tactic("AML.TA0001")
                            .technique("AML.T0003.45")
                            .build()
                    )
                    .addOwasp("LLM21")
                    .risk(ScanFileResult.Detection.Risk.MALICIOUS)
                    .ruleId("PICKLE_0055_202408")
                    .severity(ScanFileResult.Detection.Severity.CRITICAL)
                    .addRuleDetail(
                        ScanFileResult.Detection.RuleDetail.builder()
                            .description("description")
                            .status(ScanFileResult.Detection.RuleDetail.Status.CREATED)
                            .statusAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .technicalBlogHref("technical_blog_href")
                    .addTechnicalBlogHref("string")
                    .build()
            )
        assertThat(scanFileResult.endTime())
            .isEqualTo(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
        assertThat(scanFileResult.fileInstanceId()).isEqualTo("file_instance_id")
        assertThat(scanFileResult.fileLocation()).isEqualTo("file_location")
        assertThat(scanFileResult.seen())
            .isEqualTo(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
        assertThat(scanFileResult.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
        assertThat(scanFileResult.status()).isEqualTo(ScanFileResult.Status.SKIPPED)
        assertThat(scanFileResult.advisories().getOrNull())
            .containsExactly(
                ScanFileResult.Advisory.builder()
                    .advisoryId("00000000-0000-0000-0000-000000000000")
                    .category("TokenBreak")
                    .description(
                        "Models using the BPE and WordPiece tokenization strategies are vulnerable to TokenBreak"
                    )
                    .ruleId("SAFETENSORS_0001_202512")
                    .build()
            )
        assertThat(scanFileResult.compliance())
            .contains(
                ScanFileResult.Compliance.builder()
                    .addRationale("string")
                    .status(ScanFileResult.Compliance.Status.COMPLIANT)
                    .build()
            )
        assertThat(scanFileResult.fileError().getOrNull()).containsExactly("File not found")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scanFileResult =
            ScanFileResult.builder()
                .details(
                    ScanFileResult.Details.builder()
                        .estimatedTime("estimated_time")
                        .fileType("safetensors")
                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                        .fileSize("9 GB")
                        .fileSizeBytes(9663676416L)
                        .fileTypeDetails(
                            ScanFileResult.Details.FileTypeDetails.GgufFileAttributes.builder()
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
                    ScanFileResult.Detection.builder()
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
                            ScanFileResult.Detection.MitreAtlas.builder()
                                .tactic("AML.TA0001")
                                .technique("AML.T0003.45")
                                .build()
                        )
                        .addOwasp("LLM21")
                        .risk(ScanFileResult.Detection.Risk.MALICIOUS)
                        .ruleId("PICKLE_0055_202408")
                        .severity(ScanFileResult.Detection.Severity.CRITICAL)
                        .addRuleDetail(
                            ScanFileResult.Detection.RuleDetail.builder()
                                .description("description")
                                .status(ScanFileResult.Detection.RuleDetail.Status.CREATED)
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
                .status(ScanFileResult.Status.SKIPPED)
                .addAdvisory(
                    ScanFileResult.Advisory.builder()
                        .advisoryId("00000000-0000-0000-0000-000000000000")
                        .category("TokenBreak")
                        .description(
                            "Models using the BPE and WordPiece tokenization strategies are vulnerable to TokenBreak"
                        )
                        .ruleId("SAFETENSORS_0001_202512")
                        .build()
                )
                .compliance(
                    ScanFileResult.Compliance.builder()
                        .addRationale("string")
                        .status(ScanFileResult.Compliance.Status.COMPLIANT)
                        .build()
                )
                .addFileError("File not found")
                .build()

        val roundtrippedScanFileResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scanFileResult),
                jacksonTypeRef<ScanFileResult>(),
            )

        assertThat(roundtrippedScanFileResult).isEqualTo(scanFileResult)
    }
}
