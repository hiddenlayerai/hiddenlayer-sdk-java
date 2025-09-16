// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextContentTest {

    @Test
    fun create() {
        val textContent = TextContent.builder().content("content").role("role").build()

        assertThat(textContent.content()).isEqualTo("content")
        assertThat(textContent.role()).contains("role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textContent = TextContent.builder().content("content").role("role").build()

        val roundtrippedTextContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textContent),
                jacksonTypeRef<TextContent>(),
            )

        assertThat(roundtrippedTextContent).isEqualTo(textContent)
    }
}
