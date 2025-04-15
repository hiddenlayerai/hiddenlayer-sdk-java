// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.vectors

import com.hiddenlayer_sdk.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VectorSubmitVectorsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        VectorSubmitVectorsParams.builder()
            .inputLayer("input_layer")
            .inputLayerDtype("input_layer_dtype")
            .addInputLayerShape(0.0)
            .outputLayer("output_layer")
            .outputLayerDtype("output_layer_dtype")
            .addOutputLayerShape(0.0)
            .sensorId("sensor_id")
            .eventTime("event_time")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .addPrediction(0.0)
            .requesterId("requester_id")
            .addTag("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            VectorSubmitVectorsParams.builder()
                .inputLayer("input_layer")
                .inputLayerDtype("input_layer_dtype")
                .addInputLayerShape(0.0)
                .outputLayer("output_layer")
                .outputLayerDtype("output_layer_dtype")
                .addOutputLayerShape(0.0)
                .sensorId("sensor_id")
                .eventTime("event_time")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .addPrediction(0.0)
                .requesterId("requester_id")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.inputLayer()).isEqualTo("input_layer")
        assertThat(body.inputLayerDtype()).isEqualTo("input_layer_dtype")
        assertThat(body.inputLayerShape()).containsExactly(0.0)
        assertThat(body.outputLayer()).isEqualTo("output_layer")
        assertThat(body.outputLayerDtype()).isEqualTo("output_layer_dtype")
        assertThat(body.outputLayerShape()).containsExactly(0.0)
        assertThat(body.sensorId()).isEqualTo("sensor_id")
        assertThat(body.eventTime()).contains("event_time")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.predictions().getOrNull()).containsExactly(0.0)
        assertThat(body.requesterId()).contains("requester_id")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VectorSubmitVectorsParams.builder()
                .inputLayer("input_layer")
                .inputLayerDtype("input_layer_dtype")
                .addInputLayerShape(0.0)
                .outputLayer("output_layer")
                .outputLayerDtype("output_layer_dtype")
                .addOutputLayerShape(0.0)
                .sensorId("sensor_id")
                .build()

        val body = params._body()

        assertThat(body.inputLayer()).isEqualTo("input_layer")
        assertThat(body.inputLayerDtype()).isEqualTo("input_layer_dtype")
        assertThat(body.inputLayerShape()).containsExactly(0.0)
        assertThat(body.outputLayer()).isEqualTo("output_layer")
        assertThat(body.outputLayerDtype()).isEqualTo("output_layer_dtype")
        assertThat(body.outputLayerShape()).containsExactly(0.0)
        assertThat(body.sensorId()).isEqualTo("sensor_id")
    }
}
