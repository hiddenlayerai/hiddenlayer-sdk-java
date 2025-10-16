// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRequestParamsTest {

    @Test
    fun create() {
        JobRequestParams.builder()
            .access(
                JobRequestParams.Access.builder()
                    .source(JobRequestParams.Access.Source.HUGGING_FACE)
                    .build()
            )
            .inventory(
                JobRequestParams.Inventory.builder()
                    .modelName("some-model")
                    .modelVersion("")
                    .requestingEntity("some-user@example.com")
                    .origin("Hugging Face")
                    .requestSource(JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD)
                    .requestedScanLocation("owner/repo")
                    .scanTarget(
                        JobRequestParams.Inventory.ScanTarget.builder()
                            .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                            .providerModel(
                                JobRequestParams.Inventory.ScanTarget.ProviderModel.builder()
                                    .modelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                    .provider(
                                        JobRequestParams.Inventory.ScanTarget.ProviderModel.Provider
                                            .AWS_BEDROCK
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
            .status(JobRequestParams.Status.PENDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            JobRequestParams.builder()
                .access(
                    JobRequestParams.Access.builder()
                        .source(JobRequestParams.Access.Source.HUGGING_FACE)
                        .build()
                )
                .inventory(
                    JobRequestParams.Inventory.builder()
                        .modelName("some-model")
                        .modelVersion("")
                        .requestingEntity("some-user@example.com")
                        .origin("Hugging Face")
                        .requestSource(JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestedScanLocation("owner/repo")
                        .scanTarget(
                            JobRequestParams.Inventory.ScanTarget.builder()
                                .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                                .providerModel(
                                    JobRequestParams.Inventory.ScanTarget.ProviderModel.builder()
                                        .modelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                        .provider(
                                            JobRequestParams.Inventory.ScanTarget.ProviderModel
                                                .Provider
                                                .AWS_BEDROCK
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
                .status(JobRequestParams.Status.PENDING)
                .build()

        val body = params._body()

        assertThat(body.access())
            .isEqualTo(
                JobRequestParams.Access.builder()
                    .source(JobRequestParams.Access.Source.HUGGING_FACE)
                    .build()
            )
        assertThat(body.inventory())
            .isEqualTo(
                JobRequestParams.Inventory.builder()
                    .modelName("some-model")
                    .modelVersion("")
                    .requestingEntity("some-user@example.com")
                    .origin("Hugging Face")
                    .requestSource(JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD)
                    .requestedScanLocation("owner/repo")
                    .scanTarget(
                        JobRequestParams.Inventory.ScanTarget.builder()
                            .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                            .providerModel(
                                JobRequestParams.Inventory.ScanTarget.ProviderModel.builder()
                                    .modelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                    .provider(
                                        JobRequestParams.Inventory.ScanTarget.ProviderModel.Provider
                                            .AWS_BEDROCK
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
        assertThat(body.scanId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.status()).contains(JobRequestParams.Status.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobRequestParams.builder()
                .access(JobRequestParams.Access.builder().build())
                .inventory(
                    JobRequestParams.Inventory.builder()
                        .modelName("some-model")
                        .modelVersion("")
                        .requestingEntity("some-user@example.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.access()).isEqualTo(JobRequestParams.Access.builder().build())
        assertThat(body.inventory())
            .isEqualTo(
                JobRequestParams.Inventory.builder()
                    .modelName("some-model")
                    .modelVersion("")
                    .requestingEntity("some-user@example.com")
                    .build()
            )
    }
}
