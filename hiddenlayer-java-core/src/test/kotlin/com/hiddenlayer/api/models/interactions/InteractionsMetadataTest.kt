// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsMetadataTest {

    @Test
    fun create() {
        val interactionsMetadata =
            InteractionsMetadata.builder()
                .model("model")
                .requesterId("requester_id")
                .provider("provider")
                .build()

        assertThat(interactionsMetadata.model()).isEqualTo("model")
        assertThat(interactionsMetadata.requesterId()).isEqualTo("requester_id")
        assertThat(interactionsMetadata.provider()).contains("provider")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsMetadata =
            InteractionsMetadata.builder()
                .model("model")
                .requesterId("requester_id")
                .provider("provider")
                .build()

        val roundtrippedInteractionsMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsMetadata),
                jacksonTypeRef<InteractionsMetadata>(),
            )

        assertThat(roundtrippedInteractionsMetadata).isEqualTo(interactionsMetadata)
    }
}
