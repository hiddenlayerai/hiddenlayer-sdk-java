// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsInputTest {

    @Test
    fun create() {
        val interactionsInput =
            InteractionsInput.builder()
                .addMessage(
                    InteractionsTextContent.builder().content("content").role("role").build()
                )
                .build()

        assertThat(interactionsInput.messages().getOrNull())
            .containsExactly(
                InteractionsTextContent.builder().content("content").role("role").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsInput =
            InteractionsInput.builder()
                .addMessage(
                    InteractionsTextContent.builder().content("content").role("role").build()
                )
                .build()

        val roundtrippedInteractionsInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsInput),
                jacksonTypeRef<InteractionsInput>(),
            )

        assertThat(roundtrippedInteractionsInput).isEqualTo(interactionsInput)
    }
}
