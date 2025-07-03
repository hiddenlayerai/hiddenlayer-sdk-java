// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobRequestParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                    .requestedScanLocation("owner/repo")
                    .requestingEntity("some-user@example.com")
                    .origin("Hugging Face")
                    .requestSource(JobRequestParams.Inventory.RequestSource.API_UPLOAD)
                    .build()
            )
            .scanId("00000000-0000-0000-0000-000000000000")
            .status(JobRequestParams.Status.PENDING)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
                        .requestedScanLocation("owner/repo")
                        .requestingEntity("some-user@example.com")
                        .origin("Hugging Face")
                        .requestSource(JobRequestParams.Inventory.RequestSource.API_UPLOAD)
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
                    .requestedScanLocation("owner/repo")
                    .requestingEntity("some-user@example.com")
                    .origin("Hugging Face")
                    .requestSource(JobRequestParams.Inventory.RequestSource.API_UPLOAD)
                    .build()
            )
        assertThat(body.scanId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.status()).contains(JobRequestParams.Status.PENDING)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobRequestParams.builder()
                .access(JobRequestParams.Access.builder().build())
                .inventory(
                    JobRequestParams.Inventory.builder()
                        .modelName("some-model")
                        .modelVersion("")
                        .requestedScanLocation("owner/repo")
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
                    .requestedScanLocation("owner/repo")
                    .requestingEntity("some-user@example.com")
                    .build()
            )
    }
}
