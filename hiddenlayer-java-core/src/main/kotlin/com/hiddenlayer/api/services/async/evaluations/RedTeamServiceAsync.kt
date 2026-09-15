// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.evaluations

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveEvaluationResultsParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveEvaluationResultsResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveNextActionParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveNextActionResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveStatusParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamRetrieveStatusResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseResponse
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamTerminateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RedTeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedTeamServiceAsync

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Start a new red team client workflow. Auto-triggers planning phase. Client should then poll
     * /next-action.
     */
    fun create(params: RedTeamCreateParams): CompletableFuture<RedTeamCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RedTeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamCreateResponse>

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Get the complete result of a red team workflow.
     */
    fun retrieveEvaluationResults(
        workflowId: String
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse> =
        retrieveEvaluationResults(workflowId, RedTeamRetrieveEvaluationResultsParams.none())

    /** @see retrieveEvaluationResults */
    fun retrieveEvaluationResults(
        workflowId: String,
        params: RedTeamRetrieveEvaluationResultsParams =
            RedTeamRetrieveEvaluationResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse> =
        retrieveEvaluationResults(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveEvaluationResults */
    fun retrieveEvaluationResults(
        workflowId: String,
        params: RedTeamRetrieveEvaluationResultsParams =
            RedTeamRetrieveEvaluationResultsParams.none(),
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse> =
        retrieveEvaluationResults(workflowId, params, RequestOptions.none())

    /** @see retrieveEvaluationResults */
    fun retrieveEvaluationResults(
        params: RedTeamRetrieveEvaluationResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse>

    /** @see retrieveEvaluationResults */
    fun retrieveEvaluationResults(
        params: RedTeamRetrieveEvaluationResultsParams
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse> =
        retrieveEvaluationResults(params, RequestOptions.none())

    /** @see retrieveEvaluationResults */
    fun retrieveEvaluationResults(
        workflowId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamRetrieveEvaluationResultsResponse> =
        retrieveEvaluationResults(
            workflowId,
            RedTeamRetrieveEvaluationResultsParams.none(),
            requestOptions,
        )

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Poll for next action - CLIENT'S MAIN POLLING ENDPOINT.
     *
     * This endpoint is designed to be polled repeatedly by the client. Returns immediately with
     * current state:
     * - If attack ready: Returns attack_task with prompt
     * - If processing: Returns processing=true (client continues polling)
     * - If complete: Returns action_type=complete
     */
    fun retrieveNextAction(
        workflowId: String
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        retrieveNextAction(workflowId, params, RequestOptions.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveNextActionResponse>

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        retrieveNextAction(params, RequestOptions.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamRetrieveNextActionResponse> =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Get current status of a red team workflow.
     */
    fun retrieveStatus(workflowId: String): CompletableFuture<RedTeamRetrieveStatusResponse> =
        retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveStatusResponse> =
        retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
    ): CompletableFuture<RedTeamRetrieveStatusResponse> =
        retrieveStatus(workflowId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: RedTeamRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamRetrieveStatusResponse>

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: RedTeamRetrieveStatusParams
    ): CompletableFuture<RedTeamRetrieveStatusResponse> =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedTeamRetrieveStatusResponse> =
        retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none(), requestOptions)

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Submit target's response.
     *
     * This triggers the ProcessTargetResponseWorkflow child workflow for the specified session.
     * Returns immediately.
     */
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
    ): CompletableFuture<RedTeamSubmitTargetResponseResponse> =
        submitTargetResponse(workflowId, params, RequestOptions.none())

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamSubmitTargetResponseResponse> =
        submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams
    ): CompletableFuture<RedTeamSubmitTargetResponseResponse> =
        submitTargetResponse(params, RequestOptions.none())

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedTeamSubmitTargetResponseResponse>

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Terminate a running workflow job.
     */
    fun terminate(workflowId: String): CompletableFuture<Void?> =
        terminate(workflowId, RedTeamTerminateParams.none())

    /** @see terminate */
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see terminate */
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
    ): CompletableFuture<Void?> = terminate(workflowId, params, RequestOptions.none())

    /** @see terminate */
    fun terminate(
        params: RedTeamTerminateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see terminate */
    fun terminate(params: RedTeamTerminateParams): CompletableFuture<Void?> =
        terminate(params, RequestOptions.none())

    /** @see terminate */
    fun terminate(workflowId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        terminate(workflowId, RedTeamTerminateParams.none(), requestOptions)

    /**
     * A view of [RedTeamServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedTeamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /evaluations/v1/red-team`, but is otherwise the
         * same as [RedTeamServiceAsync.create].
         */
        fun create(
            params: RedTeamCreateParams
        ): CompletableFuture<HttpResponseFor<RedTeamCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RedTeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}`, but is
         * otherwise the same as [RedTeamServiceAsync.retrieveEvaluationResults].
         */
        fun retrieveEvaluationResults(
            workflowId: String
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>> =
            retrieveEvaluationResults(workflowId, RedTeamRetrieveEvaluationResultsParams.none())

        /** @see retrieveEvaluationResults */
        fun retrieveEvaluationResults(
            workflowId: String,
            params: RedTeamRetrieveEvaluationResultsParams =
                RedTeamRetrieveEvaluationResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>> =
            retrieveEvaluationResults(
                params.toBuilder().workflowId(workflowId).build(),
                requestOptions,
            )

        /** @see retrieveEvaluationResults */
        fun retrieveEvaluationResults(
            workflowId: String,
            params: RedTeamRetrieveEvaluationResultsParams =
                RedTeamRetrieveEvaluationResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>> =
            retrieveEvaluationResults(workflowId, params, RequestOptions.none())

        /** @see retrieveEvaluationResults */
        fun retrieveEvaluationResults(
            params: RedTeamRetrieveEvaluationResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>>

        /** @see retrieveEvaluationResults */
        fun retrieveEvaluationResults(
            params: RedTeamRetrieveEvaluationResultsParams
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>> =
            retrieveEvaluationResults(params, RequestOptions.none())

        /** @see retrieveEvaluationResults */
        fun retrieveEvaluationResults(
            workflowId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>> =
            retrieveEvaluationResults(
                workflowId,
                RedTeamRetrieveEvaluationResultsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}/next-action`,
         * but is otherwise the same as [RedTeamServiceAsync.retrieveNextAction].
         */
        fun retrieveNextAction(
            workflowId: String
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

        /** @see retrieveNextAction */
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> =
            retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveNextAction */
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> =
            retrieveNextAction(workflowId, params, RequestOptions.none())

        /** @see retrieveNextAction */
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>>

        /** @see retrieveNextAction */
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> =
            retrieveNextAction(params, RequestOptions.none())

        /** @see retrieveNextAction */
        fun retrieveNextAction(
            workflowId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveNextActionResponse>> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}/status`, but
         * is otherwise the same as [RedTeamServiceAsync.retrieveStatus].
         */
        fun retrieveStatus(
            workflowId: String
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> =
            retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveStatus */
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> =
            retrieveStatus(workflowId, params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>>

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            workflowId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedTeamRetrieveStatusResponse>> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /evaluations/v1/red-team/{workflow_id}/target-response`, but is otherwise the same as
         * [RedTeamServiceAsync.submitTargetResponse].
         */
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
        ): CompletableFuture<HttpResponseFor<RedTeamSubmitTargetResponseResponse>> =
            submitTargetResponse(workflowId, params, RequestOptions.none())

        /** @see submitTargetResponse */
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamSubmitTargetResponseResponse>> =
            submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see submitTargetResponse */
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams
        ): CompletableFuture<HttpResponseFor<RedTeamSubmitTargetResponseResponse>> =
            submitTargetResponse(params, RequestOptions.none())

        /** @see submitTargetResponse */
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedTeamSubmitTargetResponseResponse>>

        /**
         * Returns a raw HTTP response for `post /evaluations/v1/jobs/{workflow_id}/termination`,
         * but is otherwise the same as [RedTeamServiceAsync.terminate].
         */
        fun terminate(workflowId: String): CompletableFuture<HttpResponse> =
            terminate(workflowId, RedTeamTerminateParams.none())

        /** @see terminate */
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see terminate */
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        ): CompletableFuture<HttpResponse> = terminate(workflowId, params, RequestOptions.none())

        /** @see terminate */
        fun terminate(
            params: RedTeamTerminateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see terminate */
        fun terminate(params: RedTeamTerminateParams): CompletableFuture<HttpResponse> =
            terminate(params, RequestOptions.none())

        /** @see terminate */
        fun terminate(
            workflowId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            terminate(workflowId, RedTeamTerminateParams.none(), requestOptions)
    }
}
