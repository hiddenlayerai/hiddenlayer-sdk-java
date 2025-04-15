// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScanRetrieveResultsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val scanRetrieveResultsResponse = ScanRetrieveResultsResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scanRetrieveResultsResponse = ScanRetrieveResultsResponse.builder().build()

        val roundtrippedScanRetrieveResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scanRetrieveResultsResponse),
                jacksonTypeRef<ScanRetrieveResultsResponse>(),
            )

        assertThat(roundtrippedScanRetrieveResultsResponse).isEqualTo(scanRetrieveResultsResponse)
    }
}
