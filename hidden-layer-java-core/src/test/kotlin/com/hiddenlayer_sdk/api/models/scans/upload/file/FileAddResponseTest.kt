// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.upload.file

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileAddResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val fileAddResponse =
            FileAddResponse.builder()
                .addPart(
                    FileAddResponse.Part.builder()
                        .endOffset(0L)
                        .partNumber(0L)
                        .startOffset(0L)
                        .uploadUrl("https://example.com")
                        .build()
                )
                .uploadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(fileAddResponse.parts())
            .containsExactly(
                FileAddResponse.Part.builder()
                    .endOffset(0L)
                    .partNumber(0L)
                    .startOffset(0L)
                    .uploadUrl("https://example.com")
                    .build()
            )
        assertThat(fileAddResponse.uploadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileAddResponse =
            FileAddResponse.builder()
                .addPart(
                    FileAddResponse.Part.builder()
                        .endOffset(0L)
                        .partNumber(0L)
                        .startOffset(0L)
                        .uploadUrl("https://example.com")
                        .build()
                )
                .uploadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedFileAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileAddResponse),
                jacksonTypeRef<FileAddResponse>(),
            )

        assertThat(roundtrippedFileAddResponse).isEqualTo(fileAddResponse)
    }
}
