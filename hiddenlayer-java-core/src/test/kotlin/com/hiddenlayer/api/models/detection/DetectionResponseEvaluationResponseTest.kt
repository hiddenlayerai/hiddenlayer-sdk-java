// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.detection

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetectionResponseEvaluationResponseTest {

    @Test
    fun create() {
        val detectionResponseEvaluationResponse =
            DetectionResponseEvaluationResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detectionResponseEvaluationResponse =
            DetectionResponseEvaluationResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedDetectionResponseEvaluationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detectionResponseEvaluationResponse),
                jacksonTypeRef<DetectionResponseEvaluationResponse>(),
            )

        assertThat(roundtrippedDetectionResponseEvaluationResponse)
            .isEqualTo(detectionResponseEvaluationResponse)
    }
}
