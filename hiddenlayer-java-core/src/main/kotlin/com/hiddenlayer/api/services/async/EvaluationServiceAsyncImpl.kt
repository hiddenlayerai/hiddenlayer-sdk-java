// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.services.async.evaluations.RedTeamServiceAsync
import com.hiddenlayer.api.services.async.evaluations.RedTeamServiceAsyncImpl
import java.util.function.Consumer

class EvaluationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EvaluationServiceAsync {

    private val withRawResponse: EvaluationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redTeam: RedTeamServiceAsync by lazy { RedTeamServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EvaluationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluationServiceAsync =
        EvaluationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun redTeam(): RedTeamServiceAsync = redTeam

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvaluationServiceAsync.WithRawResponse {

        private val redTeam: RedTeamServiceAsync.WithRawResponse by lazy {
            RedTeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvaluationServiceAsync.WithRawResponse =
            EvaluationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun redTeam(): RedTeamServiceAsync.WithRawResponse = redTeam
    }
}
