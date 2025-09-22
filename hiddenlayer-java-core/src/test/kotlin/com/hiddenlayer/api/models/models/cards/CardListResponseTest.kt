// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListResponseTest {

    @Test
    fun create() {
        val cardListResponse =
            CardListResponse.builder()
                .activeVersionCount(0L)
                .attackMonitoringThreatLevel(CardListResponse.AttackMonitoringThreatLevel.SAFE)
                .createdAt(0L)
                .hasGenealogy(true)
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modelScanThreatLevel(CardListResponse.ModelScanThreatLevel.SAFE)
                .plaintextName("Resnet-50")
                .source("azure:datascience-workspace")
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

        assertThat(cardListResponse.activeVersionCount()).isEqualTo(0L)
        assertThat(cardListResponse.attackMonitoringThreatLevel())
            .isEqualTo(CardListResponse.AttackMonitoringThreatLevel.SAFE)
        assertThat(cardListResponse.createdAt()).isEqualTo(0L)
        assertThat(cardListResponse.hasGenealogy()).isEqualTo(true)
        assertThat(cardListResponse.modelId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cardListResponse.modelScanThreatLevel())
            .isEqualTo(CardListResponse.ModelScanThreatLevel.SAFE)
        assertThat(cardListResponse.plaintextName()).isEqualTo("Resnet-50")
        assertThat(cardListResponse.source()).isEqualTo("azure:datascience-workspace")
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
                .activeVersionCount(0L)
                .attackMonitoringThreatLevel(CardListResponse.AttackMonitoringThreatLevel.SAFE)
                .createdAt(0L)
                .hasGenealogy(true)
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modelScanThreatLevel(CardListResponse.ModelScanThreatLevel.SAFE)
                .plaintextName("Resnet-50")
                .source("azure:datascience-workspace")
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
