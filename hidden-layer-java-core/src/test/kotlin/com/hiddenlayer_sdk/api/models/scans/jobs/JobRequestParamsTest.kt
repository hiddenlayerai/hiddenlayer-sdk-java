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
            .scanJob(
                ScanJob.builder()
                    .access(
                        ScanJob.Access.builder().source(ScanJob.Access.Source.HUGGING_FACE).build()
                    )
                    .inventory(
                        ScanJob.Inventory.builder()
                            .modelName("some-model")
                            .modelVersion("main")
                            .requestedScanLocation("owner/repo")
                            .requestingEntity("some-user@example.com")
                            .build()
                    )
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .status(ScanJob.Status.PENDING)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            JobRequestParams.builder()
                .scanJob(
                    ScanJob.builder()
                        .access(
                            ScanJob.Access.builder()
                                .source(ScanJob.Access.Source.HUGGING_FACE)
                                .build()
                        )
                        .inventory(
                            ScanJob.Inventory.builder()
                                .modelName("some-model")
                                .modelVersion("main")
                                .requestedScanLocation("owner/repo")
                                .requestingEntity("some-user@example.com")
                                .build()
                        )
                        .scanId("00000000-0000-0000-0000-000000000000")
                        .status(ScanJob.Status.PENDING)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ScanJob.builder()
                    .access(
                        ScanJob.Access.builder().source(ScanJob.Access.Source.HUGGING_FACE).build()
                    )
                    .inventory(
                        ScanJob.Inventory.builder()
                            .modelName("some-model")
                            .modelVersion("main")
                            .requestedScanLocation("owner/repo")
                            .requestingEntity("some-user@example.com")
                            .build()
                    )
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .status(ScanJob.Status.PENDING)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = JobRequestParams.builder().scanJob(ScanJob.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(ScanJob.builder().build())
    }
}
