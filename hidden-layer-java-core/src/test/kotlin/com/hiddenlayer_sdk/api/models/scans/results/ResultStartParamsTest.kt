// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultStartParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ResultStartParams.builder()
            .pathScanId("00000000-0000-0000-0000-000000000000")
            .hasDetections(true)
            .scanReport(
                ScanReport.builder()
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesWithDetectionsCount(0L)
                    .inventory(
                        ScanReport.Inventory.builder()
                            .modelId("00000000-0000-0000-0000-000000000000")
                            .modelName("keras-tf-2025-05-27")
                            .modelVersion("1.0.0")
                            .modelVersionId("00000000-0000-0000-0000-000000000000")
                            .requestedScanLocation("/files-to-scan")
                            .modelSource("adhoc")
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
                        FileScanReport.builder()
                            .details(
                                FileScanReport.Details.builder()
                                    .estimatedTime("estimated_time")
                                    .fileType("safetensors")
                                    .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                    .fileSize("9 GB")
                                    .fileSizeBytes(9663676416L)
                                    .fileTypeDetails(
                                        FileScanReport.Details.FileTypeDetails.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                    .tlsh(
                                        "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                    )
                                    .build()
                            )
                            .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                            .fileInstanceId("file_instance_id")
                            .fileLocation("file_location")
                            .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                            .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                            .status(FileScanReport.Status.SKIPPED)
                            .addDetection(
                                FileScanReport.Detection.builder()
                                    .category("Arbitrary Code Execution")
                                    .description(
                                        "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                    )
                                    .detectionId("00000000-0000-0000-0000-000000000000")
                                    .addMitreAtlas(
                                        FileScanReport.Detection.MitreAtlas.builder()
                                            .tactic("AML.TA0001")
                                            .technique("AML.T0003.45")
                                            .build()
                                    )
                                    .addOwasp("LLM21")
                                    .ruleId("PICKLE_0055_202408")
                                    .severity(FileScanReport.Detection.Severity.LOW)
                                    .addCve("CVE-7321-910225")
                                    .cwe("")
                                    .cweHref("cwe_href")
                                    .impact("critical")
                                    .likelihood("medium")
                                    .risk(FileScanReport.Detection.Risk.MALICIOUS)
                                    .addRuleDetail(
                                        FileScanReport.Detection.RuleDetail.builder()
                                            .description("description")
                                            .status(
                                                FileScanReport.Detection.RuleDetail.Status.CREATED
                                            )
                                            .statusAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .technicalBlogHref("technical_blog_href")
                                    .build()
                            )
                            .fileResults(listOf())
                            .build()
                    )
                    .severity(ScanReport.Severity.LOW)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            ResultStartParams.builder()
                .pathScanId("00000000-0000-0000-0000-000000000000")
                .scanReport(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersion("1.0.0")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(ScanReport.Status.PENDING)
                        .version("version")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ResultStartParams.builder()
                .pathScanId("00000000-0000-0000-0000-000000000000")
                .hasDetections(true)
                .scanReport(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersion("1.0.0")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
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
                            FileScanReport.builder()
                                .details(
                                    FileScanReport.Details.builder()
                                        .estimatedTime("estimated_time")
                                        .fileType("safetensors")
                                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                        .fileSize("9 GB")
                                        .fileSizeBytes(9663676416L)
                                        .fileTypeDetails(
                                            FileScanReport.Details.FileTypeDetails.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                        .tlsh(
                                            "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                        )
                                        .build()
                                )
                                .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                                .fileInstanceId("file_instance_id")
                                .fileLocation("file_location")
                                .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                                .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                                .status(FileScanReport.Status.SKIPPED)
                                .addDetection(
                                    FileScanReport.Detection.builder()
                                        .category("Arbitrary Code Execution")
                                        .description(
                                            "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                        )
                                        .detectionId("00000000-0000-0000-0000-000000000000")
                                        .addMitreAtlas(
                                            FileScanReport.Detection.MitreAtlas.builder()
                                                .tactic("AML.TA0001")
                                                .technique("AML.T0003.45")
                                                .build()
                                        )
                                        .addOwasp("LLM21")
                                        .ruleId("PICKLE_0055_202408")
                                        .severity(FileScanReport.Detection.Severity.LOW)
                                        .addCve("CVE-7321-910225")
                                        .cwe("")
                                        .cweHref("cwe_href")
                                        .impact("critical")
                                        .likelihood("medium")
                                        .risk(FileScanReport.Detection.Risk.MALICIOUS)
                                        .addRuleDetail(
                                            FileScanReport.Detection.RuleDetail.builder()
                                                .description("description")
                                                .status(
                                                    FileScanReport.Detection.RuleDetail.Status
                                                        .CREATED
                                                )
                                                .statusAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                        .technicalBlogHref("technical_blog_href")
                                        .build()
                                )
                                .fileResults(listOf())
                                .build()
                        )
                        .severity(ScanReport.Severity.LOW)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("has_detections", "true").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ResultStartParams.builder()
                .pathScanId("00000000-0000-0000-0000-000000000000")
                .scanReport(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersion("1.0.0")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(ScanReport.Status.PENDING)
                        .version("version")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ResultStartParams.builder()
                .pathScanId("00000000-0000-0000-0000-000000000000")
                .hasDetections(true)
                .scanReport(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersion("1.0.0")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .modelSource("adhoc")
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
                            FileScanReport.builder()
                                .details(
                                    FileScanReport.Details.builder()
                                        .estimatedTime("estimated_time")
                                        .fileType("safetensors")
                                        .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                        .fileSize("9 GB")
                                        .fileSizeBytes(9663676416L)
                                        .fileTypeDetails(
                                            FileScanReport.Details.FileTypeDetails.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                        .tlsh(
                                            "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                        )
                                        .build()
                                )
                                .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                                .fileInstanceId("file_instance_id")
                                .fileLocation("file_location")
                                .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                                .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                                .status(FileScanReport.Status.SKIPPED)
                                .addDetection(
                                    FileScanReport.Detection.builder()
                                        .category("Arbitrary Code Execution")
                                        .description(
                                            "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                        )
                                        .detectionId("00000000-0000-0000-0000-000000000000")
                                        .addMitreAtlas(
                                            FileScanReport.Detection.MitreAtlas.builder()
                                                .tactic("AML.TA0001")
                                                .technique("AML.T0003.45")
                                                .build()
                                        )
                                        .addOwasp("LLM21")
                                        .ruleId("PICKLE_0055_202408")
                                        .severity(FileScanReport.Detection.Severity.LOW)
                                        .addCve("CVE-7321-910225")
                                        .cwe("")
                                        .cweHref("cwe_href")
                                        .impact("critical")
                                        .likelihood("medium")
                                        .risk(FileScanReport.Detection.Risk.MALICIOUS)
                                        .addRuleDetail(
                                            FileScanReport.Detection.RuleDetail.builder()
                                                .description("description")
                                                .status(
                                                    FileScanReport.Detection.RuleDetail.Status
                                                        .CREATED
                                                )
                                                .statusAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                        .technicalBlogHref("technical_blog_href")
                                        .build()
                                )
                                .fileResults(listOf())
                                .build()
                        )
                        .severity(ScanReport.Severity.LOW)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ScanReport.builder()
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesWithDetectionsCount(0L)
                    .inventory(
                        ScanReport.Inventory.builder()
                            .modelId("00000000-0000-0000-0000-000000000000")
                            .modelName("keras-tf-2025-05-27")
                            .modelVersion("1.0.0")
                            .modelVersionId("00000000-0000-0000-0000-000000000000")
                            .requestedScanLocation("/files-to-scan")
                            .modelSource("adhoc")
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
                        FileScanReport.builder()
                            .details(
                                FileScanReport.Details.builder()
                                    .estimatedTime("estimated_time")
                                    .fileType("safetensors")
                                    .sha256("a54d88e06612d820bc3be72877c74f257b561b19")
                                    .fileSize("9 GB")
                                    .fileSizeBytes(9663676416L)
                                    .fileTypeDetails(
                                        FileScanReport.Details.FileTypeDetails.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .md5("ce114e4501d2f4e2dcea3e17b546f339")
                                    .tlsh(
                                        "T1C50757F93C74D00C05B70C0793A1D5A9DF3F6D3A2F7AD940F3BFBF07B3BDF5A1D293"
                                    )
                                    .build()
                            )
                            .endTime(OffsetDateTime.parse("2024-10-16T23:38:32.354Z"))
                            .fileInstanceId("file_instance_id")
                            .fileLocation("file_location")
                            .seen(OffsetDateTime.parse("2024-10-22T17:59:12.431Z"))
                            .startTime(OffsetDateTime.parse("2024-10-16T23:38:32.278Z"))
                            .status(FileScanReport.Status.SKIPPED)
                            .addDetection(
                                FileScanReport.Detection.builder()
                                    .category("Arbitrary Code Execution")
                                    .description(
                                        "Found lambda embedded in keras model allowing custom layers that support  arbitrary expression execution"
                                    )
                                    .detectionId("00000000-0000-0000-0000-000000000000")
                                    .addMitreAtlas(
                                        FileScanReport.Detection.MitreAtlas.builder()
                                            .tactic("AML.TA0001")
                                            .technique("AML.T0003.45")
                                            .build()
                                    )
                                    .addOwasp("LLM21")
                                    .ruleId("PICKLE_0055_202408")
                                    .severity(FileScanReport.Detection.Severity.LOW)
                                    .addCve("CVE-7321-910225")
                                    .cwe("")
                                    .cweHref("cwe_href")
                                    .impact("critical")
                                    .likelihood("medium")
                                    .risk(FileScanReport.Detection.Risk.MALICIOUS)
                                    .addRuleDetail(
                                        FileScanReport.Detection.RuleDetail.builder()
                                            .description("description")
                                            .status(
                                                FileScanReport.Detection.RuleDetail.Status.CREATED
                                            )
                                            .statusAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .technicalBlogHref("technical_blog_href")
                                    .build()
                            )
                            .fileResults(listOf())
                            .build()
                    )
                    .severity(ScanReport.Severity.LOW)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResultStartParams.builder()
                .pathScanId("00000000-0000-0000-0000-000000000000")
                .scanReport(
                    ScanReport.builder()
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesWithDetectionsCount(0L)
                        .inventory(
                            ScanReport.Inventory.builder()
                                .modelId("00000000-0000-0000-0000-000000000000")
                                .modelName("keras-tf-2025-05-27")
                                .modelVersion("1.0.0")
                                .modelVersionId("00000000-0000-0000-0000-000000000000")
                                .requestedScanLocation("/files-to-scan")
                                .build()
                        )
                        .scanId("scan_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(ScanReport.Status.PENDING)
                        .version("version")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ScanReport.builder()
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesWithDetectionsCount(0L)
                    .inventory(
                        ScanReport.Inventory.builder()
                            .modelId("00000000-0000-0000-0000-000000000000")
                            .modelName("keras-tf-2025-05-27")
                            .modelVersion("1.0.0")
                            .modelVersionId("00000000-0000-0000-0000-000000000000")
                            .requestedScanLocation("/files-to-scan")
                            .build()
                    )
                    .scanId("scan_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(ScanReport.Status.PENDING)
                    .version("version")
                    .build()
            )
    }
}
