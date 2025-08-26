// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListPageResponseTest {

    @Test
    fun create() {
        val cardListPageResponse =
            CardListPageResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    CardListResponse.builder()
                        .createdAt(0L)
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .plaintextName("Resnet-50")
                        .source("azure:datascience-workspace")
                        .activeVersionCount(0L)
                        .attackMonitoringThreatLevel(
                            CardListResponse.AttackMonitoringThreatLevel.SAFE
                        )
                        .hasGenealogy(true)
                        .modelScanThreatLevel(CardListResponse.ModelScanThreatLevel.SAFE)
                        .securityPosture(
                            CardListResponse.SecurityPosture.builder()
                                .attackMonitoring(true)
                                .modelScan(true)
                                .build()
                        )
                        .tags(
                            CardListResponse.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .build()

        assertThat(cardListPageResponse.pageNumber()).isEqualTo(0L)
        assertThat(cardListPageResponse.pageSize()).isEqualTo(0L)
        assertThat(cardListPageResponse.results())
            .containsExactly(
                CardListResponse.builder()
                    .createdAt(0L)
                    .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .plaintextName("Resnet-50")
                    .source("azure:datascience-workspace")
                    .activeVersionCount(0L)
                    .attackMonitoringThreatLevel(CardListResponse.AttackMonitoringThreatLevel.SAFE)
                    .hasGenealogy(true)
                    .modelScanThreatLevel(CardListResponse.ModelScanThreatLevel.SAFE)
                    .securityPosture(
                        CardListResponse.SecurityPosture.builder()
                            .attackMonitoring(true)
                            .modelScan(true)
                            .build()
                    )
                    .tags(
                        CardListResponse.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(cardListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListPageResponse =
            CardListPageResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    CardListResponse.builder()
                        .createdAt(0L)
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .plaintextName("Resnet-50")
                        .source("azure:datascience-workspace")
                        .activeVersionCount(0L)
                        .attackMonitoringThreatLevel(
                            CardListResponse.AttackMonitoringThreatLevel.SAFE
                        )
                        .hasGenealogy(true)
                        .modelScanThreatLevel(CardListResponse.ModelScanThreatLevel.SAFE)
                        .securityPosture(
                            CardListResponse.SecurityPosture.builder()
                                .attackMonitoring(true)
                                .modelScan(true)
                                .build()
                        )
                        .tags(
                            CardListResponse.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .build()

        val roundtrippedCardListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListPageResponse),
                jacksonTypeRef<CardListPageResponse>(),
            )

        assertThat(roundtrippedCardListPageResponse).isEqualTo(cardListPageResponse)
    }
}
