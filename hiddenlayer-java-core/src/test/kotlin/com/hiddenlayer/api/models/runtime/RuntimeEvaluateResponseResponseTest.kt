// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.runtime

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuntimeEvaluateResponseResponseTest {

    @Test
    fun create() {
        val runtimeEvaluateResponseResponse =
            RuntimeEvaluateResponseResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runtimeEvaluateResponseResponse =
            RuntimeEvaluateResponseResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedRuntimeEvaluateResponseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runtimeEvaluateResponseResponse),
                jacksonTypeRef<RuntimeEvaluateResponseResponse>(),
            )

        assertThat(roundtrippedRuntimeEvaluateResponseResponse)
            .isEqualTo(runtimeEvaluateResponseResponse)
    }
}
