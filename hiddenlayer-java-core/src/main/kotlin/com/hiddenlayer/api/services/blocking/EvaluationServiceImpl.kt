// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.services.blocking.evaluations.RedTeamService
import com.hiddenlayer.api.services.blocking.evaluations.RedTeamServiceImpl
import java.util.function.Consumer

class EvaluationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EvaluationService {

    private val withRawResponse: EvaluationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redTeam: RedTeamService by lazy { RedTeamServiceImpl(clientOptions) }

    override fun withRawResponse(): EvaluationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluationService =
        EvaluationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun redTeam(): RedTeamService = redTeam

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvaluationService.WithRawResponse {

        private val redTeam: RedTeamService.WithRawResponse by lazy {
            RedTeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvaluationService.WithRawResponse =
            EvaluationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun redTeam(): RedTeamService.WithRawResponse = redTeam
    }
}
