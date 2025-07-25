// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.modelintel.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileGetMetadataResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val fileGetMetadataResponse =
            FileGetMetadataResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .sha256("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
                .sizeBytes(1024L)
                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .extension(".txt")
                .fileType("text")
                .mimeType("text/plain")
                .build()

        assertThat(fileGetMetadataResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(fileGetMetadataResponse.sha256())
            .isEqualTo("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
        assertThat(fileGetMetadataResponse.sizeBytes()).isEqualTo(1024L)
        assertThat(fileGetMetadataResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(fileGetMetadataResponse.extension()).contains(".txt")
        assertThat(fileGetMetadataResponse.fileType()).contains("text")
        assertThat(fileGetMetadataResponse.mimeType()).contains("text/plain")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileGetMetadataResponse =
            FileGetMetadataResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .sha256("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
                .sizeBytes(1024L)
                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .extension(".txt")
                .fileType("text")
                .mimeType("text/plain")
                .build()

        val roundtrippedFileGetMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileGetMetadataResponse),
                jacksonTypeRef<FileGetMetadataResponse>(),
            )

        assertThat(roundtrippedFileGetMetadataResponse).isEqualTo(fileGetMetadataResponse)
    }
}
