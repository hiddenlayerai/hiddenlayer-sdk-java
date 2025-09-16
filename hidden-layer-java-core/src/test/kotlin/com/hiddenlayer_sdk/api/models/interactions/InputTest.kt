// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InputTest {

    @Test
    fun create() {
        val input =
            Input.builder()
                .addMessage(TextContent.builder().content("content").role("role").build())
                .build()

        assertThat(input.messages().getOrNull())
            .containsExactly(TextContent.builder().content("content").role("role").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val input =
            Input.builder()
                .addMessage(TextContent.builder().content("content").role("role").build())
                .build()

        val roundtrippedInput =
            jsonMapper.readValue(jsonMapper.writeValueAsString(input), jacksonTypeRef<Input>())

        assertThat(roundtrippedInput).isEqualTo(input)
    }
}
