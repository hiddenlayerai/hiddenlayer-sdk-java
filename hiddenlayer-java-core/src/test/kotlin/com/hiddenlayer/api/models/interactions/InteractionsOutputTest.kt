// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsOutputTest {

    @Test
    fun create() {
        val interactionsOutput =
            InteractionsOutput.builder()
                .addMessage(
                    InteractionsTextContent.builder().content("content").role("role").build()
                )
                .build()

        assertThat(interactionsOutput.messages().getOrNull())
            .containsExactly(
                InteractionsTextContent.builder().content("content").role("role").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsOutput =
            InteractionsOutput.builder()
                .addMessage(
                    InteractionsTextContent.builder().content("content").role("role").build()
                )
                .build()

        val roundtrippedInteractionsOutput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsOutput),
                jacksonTypeRef<InteractionsOutput>(),
            )

        assertThat(roundtrippedInteractionsOutput).isEqualTo(interactionsOutput)
    }
}
