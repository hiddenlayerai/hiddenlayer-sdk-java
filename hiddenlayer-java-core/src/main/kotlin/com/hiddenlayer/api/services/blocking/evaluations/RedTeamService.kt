// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.evaluations

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.lib.BetaApi
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
import java.util.function.Consumer

interface RedTeamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedTeamService

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Start a new red team client workflow. Auto-triggers planning phase. Client should then poll
     * /next-action.
     */
    @BetaApi
    fun create(params: RedTeamCreateParams): RedTeamCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    @BetaApi
    fun create(
        params: RedTeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamCreateResponse

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Get the complete result of a red team workflow.
     */
    @BetaApi
    fun retrieveEvaluationResults(workflowId: String): RedTeamRetrieveEvaluationResultsResponse =
        retrieveEvaluationResults(workflowId, RedTeamRetrieveEvaluationResultsParams.none())

    /** @see retrieveEvaluationResults */
    @BetaApi
    fun retrieveEvaluationResults(
        workflowId: String,
        params: RedTeamRetrieveEvaluationResultsParams =
            RedTeamRetrieveEvaluationResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveEvaluationResultsResponse =
        retrieveEvaluationResults(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveEvaluationResults */
    @BetaApi
    fun retrieveEvaluationResults(
        workflowId: String,
        params: RedTeamRetrieveEvaluationResultsParams =
            RedTeamRetrieveEvaluationResultsParams.none(),
    ): RedTeamRetrieveEvaluationResultsResponse =
        retrieveEvaluationResults(workflowId, params, RequestOptions.none())

    /** @see retrieveEvaluationResults */
    @BetaApi
    fun retrieveEvaluationResults(
        params: RedTeamRetrieveEvaluationResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveEvaluationResultsResponse

    /** @see retrieveEvaluationResults */
    @BetaApi
    fun retrieveEvaluationResults(
        params: RedTeamRetrieveEvaluationResultsParams
    ): RedTeamRetrieveEvaluationResultsResponse =
        retrieveEvaluationResults(params, RequestOptions.none())

    /** @see retrieveEvaluationResults */
    @BetaApi
    fun retrieveEvaluationResults(
        workflowId: String,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveEvaluationResultsResponse =
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
    @BetaApi
    fun retrieveNextAction(workflowId: String): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

    /** @see retrieveNextAction */
    @BetaApi
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveNextAction */
    @BetaApi
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, params, RequestOptions.none())

    /** @see retrieveNextAction */
    @BetaApi
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveNextActionResponse

    /** @see retrieveNextAction */
    @BetaApi
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams
    ): RedTeamRetrieveNextActionResponse = retrieveNextAction(params, RequestOptions.none())

    /** @see retrieveNextAction */
    @BetaApi
    fun retrieveNextAction(
        workflowId: String,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Get current status of a red team workflow.
     */
    @BetaApi
    fun retrieveStatus(workflowId: String): RedTeamRetrieveStatusResponse =
        retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

    /** @see retrieveStatus */
    @BetaApi
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveStatus */
    @BetaApi
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
    ): RedTeamRetrieveStatusResponse = retrieveStatus(workflowId, params, RequestOptions.none())

    /** @see retrieveStatus */
    @BetaApi
    fun retrieveStatus(
        params: RedTeamRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveStatusResponse

    /** @see retrieveStatus */
    @BetaApi
    fun retrieveStatus(params: RedTeamRetrieveStatusParams): RedTeamRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    @BetaApi
    fun retrieveStatus(
        workflowId: String,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveStatusResponse =
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
    @BetaApi
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
    ): RedTeamSubmitTargetResponseResponse =
        submitTargetResponse(workflowId, params, RequestOptions.none())

    /** @see submitTargetResponse */
    @BetaApi
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamSubmitTargetResponseResponse =
        submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see submitTargetResponse */
    @BetaApi
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams
    ): RedTeamSubmitTargetResponseResponse = submitTargetResponse(params, RequestOptions.none())

    /** @see submitTargetResponse */
    @BetaApi
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamSubmitTargetResponseResponse

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Terminate a running workflow job.
     */
    @BetaApi
    fun terminate(workflowId: String) = terminate(workflowId, RedTeamTerminateParams.none())

    /** @see terminate */
    @BetaApi
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see terminate */
    @BetaApi
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
    ) = terminate(workflowId, params, RequestOptions.none())

    /** @see terminate */
    @BetaApi
    fun terminate(
        params: RedTeamTerminateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see terminate */
    @BetaApi
    fun terminate(params: RedTeamTerminateParams) = terminate(params, RequestOptions.none())

    /** @see terminate */
    @BetaApi
    fun terminate(workflowId: String, requestOptions: RequestOptions) =
        terminate(workflowId, RedTeamTerminateParams.none(), requestOptions)

    /** A view of [RedTeamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedTeamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /evaluations/v1/red-team`, but is otherwise the
         * same as [RedTeamService.create].
         */
        @MustBeClosed
        fun create(params: RedTeamCreateParams): HttpResponseFor<RedTeamCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        @BetaApi
        fun create(
            params: RedTeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamCreateResponse>

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}`, but is
         * otherwise the same as [RedTeamService.retrieveEvaluationResults].
         */
        @MustBeClosed
        fun retrieveEvaluationResults(
            workflowId: String
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse> =
            retrieveEvaluationResults(workflowId, RedTeamRetrieveEvaluationResultsParams.none())

        /** @see retrieveEvaluationResults */
        @MustBeClosed
        @BetaApi
        fun retrieveEvaluationResults(
            workflowId: String,
            params: RedTeamRetrieveEvaluationResultsParams =
                RedTeamRetrieveEvaluationResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse> =
            retrieveEvaluationResults(
                params.toBuilder().workflowId(workflowId).build(),
                requestOptions,
            )

        /** @see retrieveEvaluationResults */
        @MustBeClosed
        @BetaApi
        fun retrieveEvaluationResults(
            workflowId: String,
            params: RedTeamRetrieveEvaluationResultsParams =
                RedTeamRetrieveEvaluationResultsParams.none(),
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse> =
            retrieveEvaluationResults(workflowId, params, RequestOptions.none())

        /** @see retrieveEvaluationResults */
        @MustBeClosed
        @BetaApi
        fun retrieveEvaluationResults(
            params: RedTeamRetrieveEvaluationResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse>

        /** @see retrieveEvaluationResults */
        @MustBeClosed
        @BetaApi
        fun retrieveEvaluationResults(
            params: RedTeamRetrieveEvaluationResultsParams
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse> =
            retrieveEvaluationResults(params, RequestOptions.none())

        /** @see retrieveEvaluationResults */
        @MustBeClosed
        @BetaApi
        fun retrieveEvaluationResults(
            workflowId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveEvaluationResultsResponse> =
            retrieveEvaluationResults(
                workflowId,
                RedTeamRetrieveEvaluationResultsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}/next-action`,
         * but is otherwise the same as [RedTeamService.retrieveNextAction].
         */
        @MustBeClosed
        fun retrieveNextAction(
            workflowId: String
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        @BetaApi
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveNextAction */
        @MustBeClosed
        @BetaApi
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, params, RequestOptions.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        @BetaApi
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse>

        /** @see retrieveNextAction */
        @MustBeClosed
        @BetaApi
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(params, RequestOptions.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        @BetaApi
        fun retrieveNextAction(
            workflowId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /evaluations/v1/red-team/{workflow_id}/status`, but
         * is otherwise the same as [RedTeamService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(workflowId: String): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        @BetaApi
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        @BetaApi
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        @BetaApi
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        @BetaApi
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        @BetaApi
        fun retrieveStatus(
            workflowId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /evaluations/v1/red-team/{workflow_id}/target-response`, but is otherwise the same as
         * [RedTeamService.submitTargetResponse].
         */
        @MustBeClosed
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(workflowId, params, RequestOptions.none())

        /** @see submitTargetResponse */
        @MustBeClosed
        @BetaApi
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see submitTargetResponse */
        @MustBeClosed
        @BetaApi
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(params, RequestOptions.none())

        /** @see submitTargetResponse */
        @MustBeClosed
        @BetaApi
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse>

        /**
         * Returns a raw HTTP response for `post /evaluations/v1/jobs/{workflow_id}/termination`,
         * but is otherwise the same as [RedTeamService.terminate].
         */
        @MustBeClosed
        fun terminate(workflowId: String): HttpResponse =
            terminate(workflowId, RedTeamTerminateParams.none())

        /** @see terminate */
        @MustBeClosed
        @BetaApi
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see terminate */
        @MustBeClosed
        @BetaApi
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        ): HttpResponse = terminate(workflowId, params, RequestOptions.none())

        /** @see terminate */
        @MustBeClosed
        @BetaApi
        fun terminate(
            params: RedTeamTerminateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see terminate */
        @MustBeClosed
        @BetaApi
        fun terminate(params: RedTeamTerminateParams): HttpResponse =
            terminate(params, RequestOptions.none())

        /** @see terminate */
        @MustBeClosed
        @BetaApi
        fun terminate(workflowId: String, requestOptions: RequestOptions): HttpResponse =
            terminate(workflowId, RedTeamTerminateParams.none(), requestOptions)
    }
}
