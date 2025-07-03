// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PropertyBagTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val propertyBag = PropertyBag.builder().addTag("string").build()

        assertThat(propertyBag.tags().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyBag = PropertyBag.builder().addTag("string").build()

        val roundtrippedPropertyBag =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyBag),
                jacksonTypeRef<PropertyBag>(),
            )

        assertThat(roundtrippedPropertyBag).isEqualTo(propertyBag)
    }
}
