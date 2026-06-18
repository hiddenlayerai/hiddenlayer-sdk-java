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
                                .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                                .assetRegion("asset_region")
                                .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .providerDetails(
                                    JobListResponse.Item.Inventory.ProviderDetails.builder()
                                        .provider(
                                            JobListResponse.Item.Inventory.ProviderDetails.Provider
                                                .AWS_BEDROCK
                                        )
                                        .providerModelId(
                                            "anthropic.claude-3-5-sonnet-20241022-v2:0"
                                        )
                                        .country("US")
                                        .modelArn(
                                            "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                        )
                                        .build()
                                )
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
                                .addAdvisoryCategory("string")
                                .advisoryCount(0L)
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .highestSeverity(
                                    JobListResponse.Item.Summary.HighestSeverity.CRITICAL
                                )
                                .severity(JobListResponse.Item.Summary.Severity.CRITICAL)
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
                        .severity(JobListResponse.Item.Severity.CRITICAL)
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
                            .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                            .assetRegion("asset_region")
                            .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                            .modelSource("adhoc")
                            .modelVersion("1.0.0")
                            .origin("Hugging Face")
                            .providerDetails(
                                JobListResponse.Item.Inventory.ProviderDetails.builder()
                                    .provider(
                                        JobListResponse.Item.Inventory.ProviderDetails.Provider
                                            .AWS_BEDROCK
                                    )
                                    .providerModelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                    .country("US")
                                    .modelArn(
                                        "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                    )
                                    .build()
                            )
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
                            .addAdvisoryCategory("string")
                            .advisoryCount(0L)
                            .addDetectionCategory("string")
                            .detectionCount(0L)
                            .fileCount(0L)
                            .filesFailedToScan(0L)
                            .filesWithDetectionsCount(0L)
                            .highestSeverity(JobListResponse.Item.Summary.HighestSeverity.CRITICAL)
                            .severity(JobListResponse.Item.Summary.Severity.CRITICAL)
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
                    .severity(JobListResponse.Item.Severity.CRITICAL)
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
                                .assetId("a1b2c3d4-5e6f-4a7b-8c9d-0e1f2a3b4c5d")
                                .assetRegion("asset_region")
                                .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                                .modelSource("adhoc")
                                .modelVersion("1.0.0")
                                .origin("Hugging Face")
                                .providerDetails(
                                    JobListResponse.Item.Inventory.ProviderDetails.builder()
                                        .provider(
                                            JobListResponse.Item.Inventory.ProviderDetails.Provider
                                                .AWS_BEDROCK
                                        )
                                        .providerModelId(
                                            "anthropic.claude-3-5-sonnet-20241022-v2:0"
                                        )
                                        .country("US")
                                        .modelArn(
                                            "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                        )
                                        .build()
                                )
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
                                .addAdvisoryCategory("string")
                                .advisoryCount(0L)
                                .addDetectionCategory("string")
                                .detectionCount(0L)
                                .fileCount(0L)
                                .filesFailedToScan(0L)
                                .filesWithDetectionsCount(0L)
                                .highestSeverity(
                                    JobListResponse.Item.Summary.HighestSeverity.CRITICAL
                                )
                                .severity(JobListResponse.Item.Summary.Severity.CRITICAL)
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
                        .severity(JobListResponse.Item.Severity.CRITICAL)
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
