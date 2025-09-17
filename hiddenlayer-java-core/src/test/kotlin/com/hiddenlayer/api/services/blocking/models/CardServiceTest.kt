// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.models

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.models().cards()

        val page = cardService.list()

        page.response().validate()
    }
}
