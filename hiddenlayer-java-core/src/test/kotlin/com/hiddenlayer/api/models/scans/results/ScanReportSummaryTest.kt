// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScanReportSummaryTest {

    @Test
    fun create() {
        val scanReportSummary =
            ScanReportSummary.builder()
                .inventory(
                    ScanReportSummary.Inventory.builder()
                        .modelId("00000000-0000-0000-0000-000000000000")
                        .modelName("keras-tf-2025-05-27")
                        .modelVersionId("00000000-0000-0000-0000-000000000000")
                        .requestedScanLocation("/files-to-scan")
                        .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                        .assetRegion("asset_region")
                        .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                        .modelSource("adhoc")
                        .modelVersion("1.0.0")
                        .origin("Hugging Face")
                        .providerDetails(
                            ScanReportSummary.Inventory.ProviderDetails.builder()
                                .provider(
                                    ScanReportSummary.Inventory.ProviderDetails.Provider.AWS_BEDROCK
                                )
                                .providerModelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                .country("US")
                                .modelArn(
                                    "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                )
                                .build()
                        )
                        .requestSource(ScanReportSummary.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestingEntity("requesting_entity")
                        .build()
                )
                .scanId("scan_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ScanReportSummary.Status.PENDING)
                .summary(
                    ScanReportSummary.Summary.builder()
                        .addAdvisoryCategory("string")
                        .advisoryCount(0L)
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .highestSeverity(ScanReportSummary.Summary.HighestSeverity.CRITICAL)
                        .addMitreAtlas(
                            ScanReportSummary.Summary.MitreAtlas.builder()
                                .tactic("AML.TA0001")
                                .technique("AML.T0003.45")
                                .build()
                        )
                        .severity(ScanReportSummary.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .version("version")
                .schemaVersion("\$schema_version")
                .compliance(
                    ScanReportSummary.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ScanReportSummary.Compliance.Status.COMPLIANT)
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hasGenealogy(true)
                .intelligence(
                    ScanReportSummary.Intelligence.builder()
                        .contributorTrustLevel("high")
                        .countryOfOrigin("US")
                        .addGeographicFootprint("US")
                        .addGeographicFootprint("GB")
                        .addLicense(
                            ScanReportSummary.Intelligence.License.builder()
                                .name("Apache-2.0")
                                .sha256("abc123...")
                                .build()
                        )
                        .addUsagePolicy(
                            ScanReportSummary.Intelligence.UsagePolicy.builder()
                                .name("Commercial Use Allowed")
                                .sha256("def456...")
                                .build()
                        )
                        .build()
                )
                .addReferencedModel("https://example.com")
                .addScanError("string")
                .build()

        assertThat(scanReportSummary.inventory())
            .isEqualTo(
                ScanReportSummary.Inventory.builder()
                    .modelId("00000000-0000-0000-0000-000000000000")
                    .modelName("keras-tf-2025-05-27")
                    .modelVersionId("00000000-0000-0000-0000-000000000000")
                    .requestedScanLocation("/files-to-scan")
                    .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                    .assetRegion("asset_region")
                    .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                    .modelSource("adhoc")
                    .modelVersion("1.0.0")
                    .origin("Hugging Face")
                    .providerDetails(
                        ScanReportSummary.Inventory.ProviderDetails.builder()
                            .provider(
                                ScanReportSummary.Inventory.ProviderDetails.Provider.AWS_BEDROCK
                            )
                            .providerModelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                            .country("US")
                            .modelArn(
                                "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                            )
                            .build()
                    )
                    .requestSource(ScanReportSummary.Inventory.RequestSource.HYBRID_UPLOAD)
                    .requestingEntity("requesting_entity")
                    .build()
            )
        assertThat(scanReportSummary.scanId()).isEqualTo("scan_id")
        assertThat(scanReportSummary.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scanReportSummary.status()).isEqualTo(ScanReportSummary.Status.PENDING)
        assertThat(scanReportSummary.summary())
            .isEqualTo(
                ScanReportSummary.Summary.builder()
                    .addAdvisoryCategory("string")
                    .advisoryCount(0L)
                    .addDetectionCategory("string")
                    .detectionCount(0L)
                    .fileCount(0L)
                    .filesFailedToScan(0L)
                    .filesWithDetectionsCount(0L)
                    .highestSeverity(ScanReportSummary.Summary.HighestSeverity.CRITICAL)
                    .addMitreAtlas(
                        ScanReportSummary.Summary.MitreAtlas.builder()
                            .tactic("AML.TA0001")
                            .technique("AML.T0003.45")
                            .build()
                    )
                    .severity(ScanReportSummary.Summary.Severity.CRITICAL)
                    .unknownFiles(0L)
                    .build()
            )
        assertThat(scanReportSummary.version()).isEqualTo("version")
        assertThat(scanReportSummary.schemaVersion()).contains("\$schema_version")
        assertThat(scanReportSummary.compliance())
            .contains(
                ScanReportSummary.Compliance.builder()
                    .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(ScanReportSummary.Compliance.Status.COMPLIANT)
                    .build()
            )
        assertThat(scanReportSummary.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scanReportSummary.hasGenealogy()).contains(true)
        assertThat(scanReportSummary.intelligence())
            .contains(
                ScanReportSummary.Intelligence.builder()
                    .contributorTrustLevel("high")
                    .countryOfOrigin("US")
                    .addGeographicFootprint("US")
                    .addGeographicFootprint("GB")
                    .addLicense(
                        ScanReportSummary.Intelligence.License.builder()
                            .name("Apache-2.0")
                            .sha256("abc123...")
                            .build()
                    )
                    .addUsagePolicy(
                        ScanReportSummary.Intelligence.UsagePolicy.builder()
                            .name("Commercial Use Allowed")
                            .sha256("def456...")
                            .build()
                    )
                    .build()
            )
        assertThat(scanReportSummary.referencedModels().getOrNull())
            .containsExactly("https://example.com")
        assertThat(scanReportSummary.scanError().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scanReportSummary =
            ScanReportSummary.builder()
                .inventory(
                    ScanReportSummary.Inventory.builder()
                        .modelId("00000000-0000-0000-0000-000000000000")
                        .modelName("keras-tf-2025-05-27")
                        .modelVersionId("00000000-0000-0000-0000-000000000000")
                        .requestedScanLocation("/files-to-scan")
                        .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                        .assetRegion("asset_region")
                        .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                        .modelSource("adhoc")
                        .modelVersion("1.0.0")
                        .origin("Hugging Face")
                        .providerDetails(
                            ScanReportSummary.Inventory.ProviderDetails.builder()
                                .provider(
                                    ScanReportSummary.Inventory.ProviderDetails.Provider.AWS_BEDROCK
                                )
                                .providerModelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                .country("US")
                                .modelArn(
                                    "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                )
                                .build()
                        )
                        .requestSource(ScanReportSummary.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestingEntity("requesting_entity")
                        .build()
                )
                .scanId("scan_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ScanReportSummary.Status.PENDING)
                .summary(
                    ScanReportSummary.Summary.builder()
                        .addAdvisoryCategory("string")
                        .advisoryCount(0L)
                        .addDetectionCategory("string")
                        .detectionCount(0L)
                        .fileCount(0L)
                        .filesFailedToScan(0L)
                        .filesWithDetectionsCount(0L)
                        .highestSeverity(ScanReportSummary.Summary.HighestSeverity.CRITICAL)
                        .addMitreAtlas(
                            ScanReportSummary.Summary.MitreAtlas.builder()
                                .tactic("AML.TA0001")
                                .technique("AML.T0003.45")
                                .build()
                        )
                        .severity(ScanReportSummary.Summary.Severity.CRITICAL)
                        .unknownFiles(0L)
                        .build()
                )
                .version("version")
                .schemaVersion("\$schema_version")
                .compliance(
                    ScanReportSummary.Compliance.builder()
                        .evaluatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRuleSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ScanReportSummary.Compliance.Status.COMPLIANT)
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hasGenealogy(true)
                .intelligence(
                    ScanReportSummary.Intelligence.builder()
                        .contributorTrustLevel("high")
                        .countryOfOrigin("US")
                        .addGeographicFootprint("US")
                        .addGeographicFootprint("GB")
                        .addLicense(
                            ScanReportSummary.Intelligence.License.builder()
                                .name("Apache-2.0")
                                .sha256("abc123...")
                                .build()
                        )
                        .addUsagePolicy(
                            ScanReportSummary.Intelligence.UsagePolicy.builder()
                                .name("Commercial Use Allowed")
                                .sha256("def456...")
                                .build()
                        )
                        .build()
                )
                .addReferencedModel("https://example.com")
                .addScanError("string")
                .build()

        val roundtrippedScanReportSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scanReportSummary),
                jacksonTypeRef<ScanReportSummary>(),
            )

        assertThat(roundtrippedScanReportSummary).isEqualTo(scanReportSummary)
    }
}
