// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorServiceAsync = client.sensors()

        val sensorFuture =
            sensorServiceAsync.create(
                SensorCreateParams.builder()
                    .plaintextName("plaintext_name")
                    .active(true)
                    .adhoc(true)
                    .tags(
                        SensorCreateParams.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val sensor = sensorFuture.get()
        sensor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorServiceAsync = client.sensors()

        val sensorFuture = sensorServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val sensor = sensorFuture.get()
        sensor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorServiceAsync = client.sensors()

        val sensorFuture =
            sensorServiceAsync.update(
                SensorUpdateParams.builder()
                    .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .active(true)
                    .plaintextName("plaintext_name")
                    .tags(
                        SensorUpdateParams.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val sensor = sensorFuture.get()
        sensor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorServiceAsync = client.sensors()

        val future = sensorServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun query() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorServiceAsync = client.sensors()

        val responseFuture =
            sensorServiceAsync.query(
                SensorQueryParams.builder()
                    .filter(
                        SensorQueryParams.Filter.builder()
                            .active(true)
                            .createdAtStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdAtStop(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .plaintextName("plaintext_name")
                            .source(SensorQueryParams.Filter.Source.ADHOC)
                            .version(0L)
                            .build()
                    )
                    .orderBy("order_by")
                    .orderDir(SensorQueryParams.OrderDir.ASC)
                    .pageNumber(0L)
                    .pageSize(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
