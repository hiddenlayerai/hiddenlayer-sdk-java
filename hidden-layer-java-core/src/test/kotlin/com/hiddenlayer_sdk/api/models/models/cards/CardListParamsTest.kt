// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.hiddenlayer_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CardListParams.builder()
            .limit(1L)
            .modelNameContains("model_name[contains]")
            .modelNameEq("model_name[eq]")
            .offset(0L)
            .sort("sort")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
                .limit(1L)
                .modelNameContains("model_name[contains]")
                .modelNameEq("model_name[eq]")
                .offset(0L)
                .sort("sort")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("model_name[contains]", "model_name[contains]")
                    .put("model_name[eq]", "model_name[eq]")
                    .put("offset", "0")
                    .put("sort", "sort")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
