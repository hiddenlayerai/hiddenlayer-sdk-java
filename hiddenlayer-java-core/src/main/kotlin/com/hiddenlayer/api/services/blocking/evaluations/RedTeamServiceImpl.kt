// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.evaluations

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.handlers.errorBodyHandler
import com.hiddenlayer.api.core.handlers.errorHandler
import com.hiddenlayer.api.core.handlers.jsonHandler
import com.hiddenlayer.api.core.http.HttpMethod
import com.hiddenlayer.api.core.http.HttpRequest
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponse.Handler
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.core.http.json
import com.hiddenlayer.api.core.http.parseable
import com.hiddenlayer.api.core.prepare
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveNextActionParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveNextActionResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveStatusParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveStatusResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamTerminateParams
import java.util.Optional
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RedTeamServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RedTeamService {

    private val withRawResponse: RedTeamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RedTeamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedTeamService =
        RedTeamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RedTeamCreateParams,
        requestOptions: RequestOptions,
    ): RedTeamCreateResponse =
        // post /evaluations/v1-beta/red-team
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveNextActionResponse =
        // get /evaluations/v1-beta/red-team/{workflow_id}/next-action
        withRawResponse().retrieveNextAction(params, requestOptions).parse()

    override fun retrieveStatus(
        params: RedTeamRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveStatusResponse =
        // get /evaluations/v1-beta/red-team/{workflow_id}/status
        withRawResponse().retrieveStatus(params, requestOptions).parse()

    override fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions,
    ): RedTeamSubmitTargetResponseResponse =
        // post /evaluations/v1-beta/red-team/{workflow_id}/target-response
        withRawResponse().submitTargetResponse(params, requestOptions).parse()

    override fun terminate(
        params: RedTeamTerminateParams,
        requestOptions: RequestOptions,
    ): Optional<Void> =
        // post /evaluations/v1-beta/red-team/terminations/{workflow_id}
        withRawResponse().terminate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RedTeamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedTeamService.WithRawResponse =
            RedTeamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RedTeamCreateResponse> =
            jsonHandler<RedTeamCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RedTeamCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evaluations", "v1-beta", "red-team")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveNextActionHandler: Handler<RedTeamRetrieveNextActionResponse> =
            jsonHandler<RedTeamRetrieveNextActionResponse>(clientOptions.jsonMapper)

        override fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workflowId", params.workflowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "evaluations",
                        "v1-beta",
                        "red-team",
                        params._pathParam(0),
                        "next-action",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveNextActionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveStatusHandler: Handler<RedTeamRetrieveStatusResponse> =
            jsonHandler<RedTeamRetrieveStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveStatus(
            params: RedTeamRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workflowId", params.workflowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "evaluations",
                        "v1-beta",
                        "red-team",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitTargetResponseHandler: Handler<RedTeamSubmitTargetResponseResponse> =
            jsonHandler<RedTeamSubmitTargetResponseResponse>(clientOptions.jsonMapper)

        override fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workflowId", params.workflowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "evaluations",
                        "v1-beta",
                        "red-team",
                        params._pathParam(0),
                        "target-response",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitTargetResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val terminateHandler: Handler<Optional<Void>> =
            jsonHandler<Optional<Void>>(clientOptions.jsonMapper)

        override fun terminate(
            params: RedTeamTerminateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Optional<Void>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workflowId", params.workflowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "evaluations",
                        "v1-beta",
                        "red-team",
                        "terminations",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { terminateHandler.handle(it) }
            }
        }
    }
}
