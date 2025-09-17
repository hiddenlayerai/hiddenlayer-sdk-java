// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

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
            .sort("-model_name")
            .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
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
                .sort("-model_name")
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
