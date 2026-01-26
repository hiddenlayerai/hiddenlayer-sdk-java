// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.evaluations

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
import com.hiddenlayer.api.core.prepareAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RedTeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RedTeamServiceAsync {

    private val withRawResponse: RedTeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RedTeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedTeamServiceAsync =
        RedTeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RedTeamCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamCreateResponse> =
        // post /evaluations/v1-beta/red-team
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        // get /evaluations/v1-beta/red-team/{workflow_id}/next-action
        withRawResponse().retrieveNextAction(params, requestOptions).thenApply { it.parse() }

    override fun retrieveStatus(
        params: RedTeamRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamRetrieveStatusResponse> =
        // get /evaluations/v1-beta/red-team/{workflow_id}/status
        withRawResponse().retrieveStatus(params, requestOptions).thenApply { it.parse() }

    override fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamSubmitTargetResponseResponse> =
        // post /evaluations/v1-beta/red-team/{workflow_id}/target-response
        withRawResponse().submitTargetResponse(params, requestOptions).thenApply { it.parse() }

    override fun terminate(
        params: RedTeamTerminateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<Void>> =
        // post /evaluations/v1-beta/red-team/terminations/{workflow_id}
        withRawResponse().terminate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RedTeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedTeamServiceAsync.WithRawResponse =
            RedTeamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RedTeamCreateResponse> =
            jsonHandler<RedTeamCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RedTeamCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evaluations", "v1-beta", "red-team")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveNextActionHandler: Handler<RedTeamRetrieveNextActionResponse> =
            jsonHandler<RedTeamRetrieveNextActionResponse>(clientOptions.jsonMapper)

        override fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveNextActionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveStatusHandler: Handler<RedTeamRetrieveStatusResponse> =
            jsonHandler<RedTeamRetrieveStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveStatus(
            params: RedTeamRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitTargetResponseHandler: Handler<RedTeamSubmitTargetResponseResponse> =
            jsonHandler<RedTeamSubmitTargetResponseResponse>(clientOptions.jsonMapper)

        override fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamSubmitTargetResponseResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitTargetResponseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val terminateHandler: Handler<Optional<Void>> =
            jsonHandler<Optional<Void>>(clientOptions.jsonMapper)

        override fun terminate(
            params: RedTeamTerminateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<Void>>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { terminateHandler.handle(it) }
                    }
                }
        }
    }
}
