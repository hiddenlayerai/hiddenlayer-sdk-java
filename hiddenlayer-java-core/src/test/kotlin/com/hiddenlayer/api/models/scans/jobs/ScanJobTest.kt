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
                        .requestedScanLocation("/files-to-scan")
                        .requestingEntity("requesting_entity")
                        .origin("Hugging Face")
                        .requestSource(ScanJob.Inventory.RequestSource.API_UPLOAD)
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
                    .requestedScanLocation("/files-to-scan")
                    .requestingEntity("requesting_entity")
                    .origin("Hugging Face")
                    .requestSource(ScanJob.Inventory.RequestSource.API_UPLOAD)
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
                        .requestedScanLocation("/files-to-scan")
                        .requestingEntity("requesting_entity")
                        .origin("Hugging Face")
                        .requestSource(ScanJob.Inventory.RequestSource.API_UPLOAD)
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
