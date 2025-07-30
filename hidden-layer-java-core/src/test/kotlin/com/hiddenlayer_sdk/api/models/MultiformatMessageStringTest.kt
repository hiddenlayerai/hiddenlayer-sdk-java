// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiformatMessageStringTest {

    @Test
    fun create() {
        val multiformatMessageString =
            MultiformatMessageString.builder()
                .text("text")
                .markdown("markdown")
                .properties(PropertyBag.builder().addTag("string").build())
                .build()

        assertThat(multiformatMessageString.text()).isEqualTo("text")
        assertThat(multiformatMessageString.markdown()).contains("markdown")
        assertThat(multiformatMessageString.properties())
            .contains(PropertyBag.builder().addTag("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multiformatMessageString =
            MultiformatMessageString.builder()
                .text("text")
                .markdown("markdown")
                .properties(PropertyBag.builder().addTag("string").build())
                .build()

        val roundtrippedMultiformatMessageString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multiformatMessageString),
                jacksonTypeRef<MultiformatMessageString>(),
            )

        assertThat(roundtrippedMultiformatMessageString).isEqualTo(multiformatMessageString)
    }
}
