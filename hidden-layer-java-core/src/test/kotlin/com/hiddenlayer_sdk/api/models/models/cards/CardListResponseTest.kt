// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListResponseTest {

    @Test
    fun create() {
        val cardListResponse =
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

        assertThat(cardListResponse.createdAt()).isEqualTo(0L)
        assertThat(cardListResponse.modelId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cardListResponse.plaintextName()).isEqualTo("Resnet-50")
        assertThat(cardListResponse.source()).isEqualTo("azure:datascience-workspace")
        assertThat(cardListResponse.activeVersionCount()).contains(0L)
        assertThat(cardListResponse.attackMonitoringThreatLevel())
            .contains(CardListResponse.AttackMonitoringThreatLevel.SAFE)
        assertThat(cardListResponse.hasGenealogy()).contains(true)
        assertThat(cardListResponse.modelScanThreatLevel())
            .contains(CardListResponse.ModelScanThreatLevel.SAFE)
        assertThat(cardListResponse.securityPosture())
            .contains(
                CardListResponse.SecurityPosture.builder()
                    .attackMonitoring(true)
                    .modelScan(true)
                    .build()
            )
        assertThat(cardListResponse.tags())
            .contains(
                CardListResponse.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListResponse =
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

        val roundtrippedCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListResponse),
                jacksonTypeRef<CardListResponse>(),
            )

        assertThat(roundtrippedCardListResponse).isEqualTo(cardListResponse)
    }
}
