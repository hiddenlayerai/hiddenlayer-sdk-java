// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScanJobTest {

    @Test
    fun create() {
        val scanJob =
            ScanJob.builder()
                .inventory(
                    ScanJob.Inventory.builder()
                        .modelName("keras-tf-2025-05-27")
                        .modelVersion("1.0.0")
                        .requestingEntity("requesting_entity")
                        .origin("Hugging Face")
                        .requestSource(ScanJob.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestedScanLocation("/files-to-scan")
                        .scanTarget(
                            ScanJob.Inventory.ScanTarget.builder()
                                .assetRegion("us-east-1")
                                .deepScan(
                                    ScanJob.Inventory.ScanTarget.DeepScan.builder()
                                        .fileLocation(
                                            "https://huggingface.co/meta-llama/Llama-3.1-8B"
                                        )
                                        .addFile(
                                            ScanJob.Inventory.ScanTarget.DeepScan.File.builder()
                                                .fileLocation(
                                                    "https://huggingface.co/meta-llama/Llama-3.1-8B/resolve/main/config.json"
                                                )
                                                .fileNameAlias("model-config.json")
                                                .build()
                                        )
                                        .build()
                                )
                                .providerDetails(
                                    ScanJob.Inventory.ScanTarget.ProviderDetails.builder()
                                        .provider(
                                            ScanJob.Inventory.ScanTarget.ProviderDetails.Provider
                                                .AWS_BEDROCK
                                        )
                                        .providerModelId(
                                            "anthropic.claude-3-5-sonnet-20241022-v2:0"
                                        )
                                        .modelArn(
                                            "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .scanId("00000000-0000-0000-0000-000000000000")
                .status(ScanJob.Status.PENDING)
                .build()

        assertThat(scanJob.inventory())
            .isEqualTo(
                ScanJob.Inventory.builder()
                    .modelName("keras-tf-2025-05-27")
                    .modelVersion("1.0.0")
                    .requestingEntity("requesting_entity")
                    .origin("Hugging Face")
                    .requestSource(ScanJob.Inventory.RequestSource.HYBRID_UPLOAD)
                    .requestedScanLocation("/files-to-scan")
                    .scanTarget(
                        ScanJob.Inventory.ScanTarget.builder()
                            .assetRegion("us-east-1")
                            .deepScan(
                                ScanJob.Inventory.ScanTarget.DeepScan.builder()
                                    .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                                    .addFile(
                                        ScanJob.Inventory.ScanTarget.DeepScan.File.builder()
                                            .fileLocation(
                                                "https://huggingface.co/meta-llama/Llama-3.1-8B/resolve/main/config.json"
                                            )
                                            .fileNameAlias("model-config.json")
                                            .build()
                                    )
                                    .build()
                            )
                            .providerDetails(
                                ScanJob.Inventory.ScanTarget.ProviderDetails.builder()
                                    .provider(
                                        ScanJob.Inventory.ScanTarget.ProviderDetails.Provider
                                            .AWS_BEDROCK
                                    )
                                    .providerModelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                    .modelArn(
                                        "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(scanJob.scanId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(scanJob.status()).contains(ScanJob.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scanJob =
            ScanJob.builder()
                .inventory(
                    ScanJob.Inventory.builder()
                        .modelName("keras-tf-2025-05-27")
                        .modelVersion("1.0.0")
                        .requestingEntity("requesting_entity")
                        .origin("Hugging Face")
                        .requestSource(ScanJob.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestedScanLocation("/files-to-scan")
                        .scanTarget(
                            ScanJob.Inventory.ScanTarget.builder()
                                .assetRegion("us-east-1")
                                .deepScan(
                                    ScanJob.Inventory.ScanTarget.DeepScan.builder()
                                        .fileLocation(
                                            "https://huggingface.co/meta-llama/Llama-3.1-8B"
                                        )
                                        .addFile(
                                            ScanJob.Inventory.ScanTarget.DeepScan.File.builder()
                                                .fileLocation(
                                                    "https://huggingface.co/meta-llama/Llama-3.1-8B/resolve/main/config.json"
                                                )
                                                .fileNameAlias("model-config.json")
                                                .build()
                                        )
                                        .build()
                                )
                                .providerDetails(
                                    ScanJob.Inventory.ScanTarget.ProviderDetails.builder()
                                        .provider(
                                            ScanJob.Inventory.ScanTarget.ProviderDetails.Provider
                                                .AWS_BEDROCK
                                        )
                                        .providerModelId(
                                            "anthropic.claude-3-5-sonnet-20241022-v2:0"
                                        )
                                        .modelArn(
                                            "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .scanId("00000000-0000-0000-0000-000000000000")
                .status(ScanJob.Status.PENDING)
                .build()

        val roundtrippedScanJob =
            jsonMapper.readValue(jsonMapper.writeValueAsString(scanJob), jacksonTypeRef<ScanJob>())

        assertThat(roundtrippedScanJob).isEqualTo(scanJob)
    }
}
