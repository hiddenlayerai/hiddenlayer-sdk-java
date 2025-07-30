// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelCreateResponseTest {

    @Test
    fun create() {
        val modelCreateResponse = ModelCreateResponse.builder().details("details").build()

        assertThat(modelCreateResponse.details()).contains("details")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelCreateResponse = ModelCreateResponse.builder().details("details").build()

        val roundtrippedModelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelCreateResponse),
                jacksonTypeRef<ModelCreateResponse>(),
            )

        assertThat(roundtrippedModelCreateResponse).isEqualTo(modelCreateResponse)
    }
}
