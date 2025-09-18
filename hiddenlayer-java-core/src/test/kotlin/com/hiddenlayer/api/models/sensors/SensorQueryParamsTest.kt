// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

import com.hiddenlayer.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorQueryParamsTest {

    @Test
    fun create() {
        SensorQueryParams.builder()
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
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
    }

    @Test
    fun headers() {
        val params =
            SensorQueryParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SensorQueryParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SensorQueryParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
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

        val body = params._body()

        assertThat(body.filter())
            .contains(
                SensorQueryParams.Filter.builder()
                    .active(true)
                    .createdAtStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAtStop(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plaintextName("plaintext_name")
                    .source(SensorQueryParams.Filter.Source.ADHOC)
                    .version(0L)
                    .build()
            )
        assertThat(body.orderBy()).contains("order_by")
        assertThat(body.orderDir()).contains(SensorQueryParams.OrderDir.ASC)
        assertThat(body.pageNumber()).contains(0L)
        assertThat(body.pageSize()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SensorQueryParams.builder().build()

        val body = params._body()
    }
}
