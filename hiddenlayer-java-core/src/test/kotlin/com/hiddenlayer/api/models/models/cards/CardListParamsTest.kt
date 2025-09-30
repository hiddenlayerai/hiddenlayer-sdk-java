// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListParamsTest {

    @Test
    fun create() {
        CardListParams.builder()
            .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
            .aidrStatus(CardListParams.AidrStatus.ENABLED)
            .limit(50L)
            .modelCreated(
                CardListParams.ModelCreated.builder()
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
            .addModscanSeverity(CardListParams.ModscanSeverity.ModelCardScanSafeUnsafe.SAFE)
            .modscanStatus(CardListParams.ModscanStatus.ENABLED)
            .offset(250L)
            .addProvider(CardListParams.Provider.AZURE)
            .sort("-model_name")
            .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CardListParams.builder()
                .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
                .aidrStatus(CardListParams.AidrStatus.ENABLED)
                .limit(50L)
                .modelCreated(
                    CardListParams.ModelCreated.builder()
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModscanSeverity(CardListParams.ModscanSeverity.ModelCardScanSafeUnsafe.SAFE)
                .modscanStatus(CardListParams.ModscanStatus.ENABLED)
                .offset(250L)
                .addProvider(CardListParams.Provider.AZURE)
                .sort("-model_name")
                .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
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
        val params = CardListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
                .addAidrSeverity(CardListParams.AidrSeverity.SAFE)
                .aidrStatus(CardListParams.AidrStatus.ENABLED)
                .limit(50L)
                .modelCreated(
                    CardListParams.ModelCreated.builder()
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .modelName(CardListParams.ModelName.builder().contains("contains").eq("eq").build())
                .addModscanSeverity(CardListParams.ModscanSeverity.ModelCardScanSafeUnsafe.SAFE)
                .modscanStatus(CardListParams.ModscanStatus.ENABLED)
                .offset(250L)
                .addProvider(CardListParams.Provider.AZURE)
                .sort("-model_name")
                .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "aidr_severity",
                        listOf(CardListParams.ModscanSeverity.ModelCardScanSafeUnsafe.SAFE),
                    )
                    .put("aidr_status", "ENABLED")
                    .put("limit", "50")
                    .put("model_created[gte]", "2019-12-27T18:11:19.117Z")
                    .put("model_created[lte]", "2019-12-27T18:11:19.117Z")
                    .put("model_name[contains]", "contains")
                    .put("model_name[eq]", "eq")
                    .put("modscan_severity", listOf("SAFE").joinToString(","))
                    .put("modscan_status", "ENABLED")
                    .put("offset", "250")
                    .put("provider", listOf("AZURE").joinToString(","))
                    .put("sort", "-model_name")
                    .put("source[contains]", "contains")
                    .put("source[eq]", "eq")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
