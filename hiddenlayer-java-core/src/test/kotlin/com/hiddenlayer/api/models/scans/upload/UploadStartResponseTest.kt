// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.upload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadStartResponseTest {

    @Test
    fun create() {
        val uploadStartResponse =
            UploadStartResponse.builder().scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(uploadStartResponse.scanId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadStartResponse =
            UploadStartResponse.builder().scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val roundtrippedUploadStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadStartResponse),
                jacksonTypeRef<UploadStartResponse>(),
            )

        assertThat(roundtrippedUploadStartResponse).isEqualTo(uploadStartResponse)
    }
}
