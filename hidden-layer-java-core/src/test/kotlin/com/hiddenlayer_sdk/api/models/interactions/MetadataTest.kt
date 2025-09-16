// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataTest {

    @Test
    fun create() {
        val metadata =
            Metadata.builder()
                .model("model")
                .requesterId("requester_id")
                .provider("provider")
                .build()

        assertThat(metadata.model()).isEqualTo("model")
        assertThat(metadata.requesterId()).isEqualTo("requester_id")
        assertThat(metadata.provider()).contains("provider")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadata =
            Metadata.builder()
                .model("model")
                .requesterId("requester_id")
                .provider("provider")
                .build()

        val roundtrippedMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadata),
                jacksonTypeRef<Metadata>(),
            )

        assertThat(roundtrippedMetadata).isEqualTo(metadata)
    }
}
