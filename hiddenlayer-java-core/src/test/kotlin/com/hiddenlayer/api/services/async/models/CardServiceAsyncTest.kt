// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.models

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val cardServiceAsync = client.models().cards()

        val pageFuture = cardServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
