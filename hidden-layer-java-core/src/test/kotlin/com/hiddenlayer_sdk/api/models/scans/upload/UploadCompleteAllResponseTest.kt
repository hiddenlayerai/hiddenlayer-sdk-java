// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.upload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadCompleteAllResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val uploadCompleteAllResponse =
            UploadCompleteAllResponse.builder()
                .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(uploadCompleteAllResponse.scanId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCompleteAllResponse =
            UploadCompleteAllResponse.builder()
                .scanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedUploadCompleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCompleteAllResponse),
                jacksonTypeRef<UploadCompleteAllResponse>(),
            )

        assertThat(roundtrippedUploadCompleteAllResponse).isEqualTo(uploadCompleteAllResponse)
    }
}
