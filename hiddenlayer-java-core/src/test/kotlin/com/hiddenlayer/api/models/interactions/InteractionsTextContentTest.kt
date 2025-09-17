// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsTextContentTest {

    @Test
    fun create() {
        val interactionsTextContent =
            InteractionsTextContent.builder().content("content").role("role").build()

        assertThat(interactionsTextContent.content()).isEqualTo("content")
        assertThat(interactionsTextContent.role()).contains("role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsTextContent =
            InteractionsTextContent.builder().content("content").role("role").build()

        val roundtrippedInteractionsTextContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsTextContent),
                jacksonTypeRef<InteractionsTextContent>(),
            )

        assertThat(roundtrippedInteractionsTextContent).isEqualTo(interactionsTextContent)
    }
}
