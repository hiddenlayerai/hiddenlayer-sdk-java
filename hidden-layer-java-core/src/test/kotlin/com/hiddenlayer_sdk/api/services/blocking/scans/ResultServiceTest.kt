// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.scans.results.FileScanReport
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultPatchParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultStartParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResultServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        val scanReport =
            resultService.retrieve(
                ResultRetrieveParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .hasDetections(true)
                    .build()
            )

        scanReport.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        val results =
            resultService.list(
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
            )

        results.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        val response =
            resultService.patch(
                ResultPatchParams.builder()
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
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
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
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
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun start() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        resultService.start(
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
        )
    }
}
