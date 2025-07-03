// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CardListParams.builder()
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
            .aidrStatus(CardListParams.AidrStatus.ENABLED)
            .limit(1L)
            .modelCreated(
                CardListParams.ModelCreated.builder()
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
            .addModscanSeverity(CardListParams.ModscanSeverity.SAFE)
            .modscanStatus(CardListParams.ModscanStatus.ENABLED)
            .offset(0L)
            .addProvider(CardListParams.Provider.AZURE)
            .sort("sort")
            .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            CardListParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
                .aidrStatus(CardListParams.AidrStatus.ENABLED)
                .limit(1L)
                .modelCreated(
                    CardListParams.ModelCreated.builder()
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModscanSeverity(CardListParams.ModscanSeverity.SAFE)
                .modscanStatus(CardListParams.ModscanStatus.ENABLED)
                .offset(0L)
                .addProvider(CardListParams.Provider.AZURE)
                .sort("sort")
                .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CardListParams.builder().xCorrelationId("00000000-0000-0000-0000-000000000000").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
                .aidrStatus(CardListParams.AidrStatus.ENABLED)
                .limit(1L)
                .modelCreated(
                    CardListParams.ModelCreated.builder()
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModscanSeverity(CardListParams.ModscanSeverity.SAFE)
                .modscanStatus(CardListParams.ModscanStatus.ENABLED)
                .offset(0L)
                .addProvider(CardListParams.Provider.AZURE)
                .sort("sort")
                .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("aidr_severity", listOf("SAFE").joinToString(","))
                    .put("aidr_status", "ENABLED")
                    .put("limit", "1")
                    .put("model_created[gte]", "2019-12-27T18:11:19.117Z")
                    .put("model_created[lte]", "2019-12-27T18:11:19.117Z")
                    .put("model_name[contains]", "contains")
                    .put("model_name[eq]", "eq")
                    .put("modscan_severity", listOf("SAFE").joinToString(","))
                    .put("modscan_status", "ENABLED")
                    .put("offset", "0")
                    .put("provider", listOf("AZURE").joinToString(","))
                    .put("sort", "sort")
                    .put("source[contains]", "contains")
                    .put("source[eq]", "eq")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CardListParams.builder().xCorrelationId("00000000-0000-0000-0000-000000000000").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
