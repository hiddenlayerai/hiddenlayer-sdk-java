// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultPatchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val resultPatchResponse = ResultPatchResponse.builder().message("message").build()

        assertThat(resultPatchResponse.message()).isEqualTo("message")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resultPatchResponse = ResultPatchResponse.builder().message("message").build()

        val roundtrippedResultPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resultPatchResponse),
                jacksonTypeRef<ResultPatchResponse>(),
            )

        assertThat(roundtrippedResultPatchResponse).isEqualTo(resultPatchResponse)
    }
}
