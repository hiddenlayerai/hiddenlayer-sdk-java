// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun submitVectors() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val vectorService = client.vectors()

        val response =
            vectorService.submitVectors(
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
            )

        response.validate()
    }
}
