// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.models

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.models.cards.CardListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.models().cards()

        val cards =
            cardService.list(
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
                    .modelName(
                        CardListParams.ModelName.builder().contains("contains").eq("eq").build()
                    )
                    .addModscanSeverity(CardListParams.ModscanSeverity.SAFE)
                    .modscanStatus(CardListParams.ModscanStatus.ENABLED)
                    .offset(0L)
                    .addProvider(CardListParams.Provider.AZURE)
                    .sort("sort")
                    .source(CardListParams.Source.builder().contains("contains").eq("eq").build())
                    .build()
            )

        cards.validate()
    }
}
