// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val message =
            Message.builder()
                .id("id")
                .addArgument("string")
                .markdown("markdown")
                .properties(PropertyBag.builder().addTag("string").build())
                .text("text")
                .build()

        assertThat(message.id()).contains("id")
        assertThat(message.arguments().getOrNull()).containsExactly("string")
        assertThat(message.markdown()).contains("markdown")
        assertThat(message.properties()).contains(PropertyBag.builder().addTag("string").build())
        assertThat(message.text()).contains("text")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.builder()
                .id("id")
                .addArgument("string")
                .markdown("markdown")
                .properties(PropertyBag.builder().addTag("string").build())
                .text("text")
                .build()

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }
}
