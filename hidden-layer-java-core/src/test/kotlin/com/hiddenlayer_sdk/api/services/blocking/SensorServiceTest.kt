// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorService = client.sensors()

        val sensor =
            sensorService.create(
                SensorCreateParams.builder()
                    .plaintextName("example_model")
                    .active(true)
                    .adhoc(true)
                    .tags(
                        SensorCreateParams.Tags.builder()
                            .putAdditionalProperty("0", JsonValue.from("bar"))
                            .build()
                    )
                    .version(1L)
                    .build()
            )

        sensor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorService = client.sensors()

        val sensor =
            sensorService.retrieve(
                SensorRetrieveParams.builder()
                    .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        sensor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorService = client.sensors()

        sensorService.delete(
            SensorDeleteParams.builder().sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun query() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sensorService = client.sensors()

        val response =
            sensorService.query(
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

        response.validate()
    }
}
