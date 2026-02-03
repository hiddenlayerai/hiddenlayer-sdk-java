// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.evaluations

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateResponse
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
     * Start a new red team client workflow. Auto-triggers planning phase. Client should then poll
     * /next-action.
     */
    fun create(params: RedTeamCreateParams): RedTeamCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RedTeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamCreateResponse

    /**
     * Poll for next action - CLIENT'S MAIN POLLING ENDPOINT.
     *
     * This endpoint is designed to be polled repeatedly by the client. Returns immediately with
     * current state:
     * - If attack ready: Returns attack_task with prompt
     * - If processing: Returns processing=true (client continues polling)
     * - If complete: Returns action_type=complete
     */
    fun retrieveNextAction(workflowId: String): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, params, RequestOptions.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveNextActionResponse

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        params: RedTeamRetrieveNextActionParams
    ): RedTeamRetrieveNextActionResponse = retrieveNextAction(params, RequestOptions.none())

    /** @see retrieveNextAction */
    fun retrieveNextAction(
        workflowId: String,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveNextActionResponse =
        retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

    /** Get current status of a red team workflow. */
    fun retrieveStatus(workflowId: String): RedTeamRetrieveStatusResponse =
        retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
    ): RedTeamRetrieveStatusResponse = retrieveStatus(workflowId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: RedTeamRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(params: RedTeamRetrieveStatusParams): RedTeamRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        workflowId: String,
        requestOptions: RequestOptions,
    ): RedTeamRetrieveStatusResponse =
        retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none(), requestOptions)

    /**
     * Submit target's response.
     *
     * This triggers the ProcessTargetResponseWorkflow child workflow for the specified session.
     * Returns immediately.
     */
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
    ): RedTeamSubmitTargetResponseResponse =
        submitTargetResponse(workflowId, params, RequestOptions.none())

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        workflowId: String,
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamSubmitTargetResponseResponse =
        submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams
    ): RedTeamSubmitTargetResponseResponse = submitTargetResponse(params, RequestOptions.none())

    /** @see submitTargetResponse */
    fun submitTargetResponse(
        params: RedTeamSubmitTargetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedTeamSubmitTargetResponseResponse

    /** Terminate a running workflow. */
    fun terminate(workflowId: String) = terminate(workflowId, RedTeamTerminateParams.none())

    /** @see terminate */
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

    /** @see terminate */
    fun terminate(
        workflowId: String,
        params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
    ) = terminate(workflowId, params, RequestOptions.none())

    /** @see terminate */
    fun terminate(
        params: RedTeamTerminateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see terminate */
    fun terminate(params: RedTeamTerminateParams) = terminate(params, RequestOptions.none())

    /** @see terminate */
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
         * Returns a raw HTTP response for `post /evaluations/v1-beta/red-team`, but is otherwise
         * the same as [RedTeamService.create].
         */
        @MustBeClosed
        fun create(params: RedTeamCreateParams): HttpResponseFor<RedTeamCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RedTeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /evaluations/v1-beta/red-team/{workflow_id}/next-action`, but is otherwise the same as
         * [RedTeamService.retrieveNextAction].
         */
        @MustBeClosed
        fun retrieveNextAction(
            workflowId: String
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveNextAction */
        @MustBeClosed
        fun retrieveNextAction(
            workflowId: String,
            params: RedTeamRetrieveNextActionParams = RedTeamRetrieveNextActionParams.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, params, RequestOptions.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse>

        /** @see retrieveNextAction */
        @MustBeClosed
        fun retrieveNextAction(
            params: RedTeamRetrieveNextActionParams
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(params, RequestOptions.none())

        /** @see retrieveNextAction */
        @MustBeClosed
        fun retrieveNextAction(
            workflowId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveNextActionResponse> =
            retrieveNextAction(workflowId, RedTeamRetrieveNextActionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /evaluations/v1-beta/red-team/{workflow_id}/status`,
         * but is otherwise the same as [RedTeamService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(workflowId: String): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            workflowId: String,
            params: RedTeamRetrieveStatusParams = RedTeamRetrieveStatusParams.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: RedTeamRetrieveStatusParams
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            workflowId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedTeamRetrieveStatusResponse> =
            retrieveStatus(workflowId, RedTeamRetrieveStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /evaluations/v1-beta/red-team/{workflow_id}/target-response`, but is otherwise the same
         * as [RedTeamService.submitTargetResponse].
         */
        @MustBeClosed
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(workflowId, params, RequestOptions.none())

        /** @see submitTargetResponse */
        @MustBeClosed
        fun submitTargetResponse(
            workflowId: String,
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see submitTargetResponse */
        @MustBeClosed
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse> =
            submitTargetResponse(params, RequestOptions.none())

        /** @see submitTargetResponse */
        @MustBeClosed
        fun submitTargetResponse(
            params: RedTeamSubmitTargetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedTeamSubmitTargetResponseResponse>

        /**
         * Returns a raw HTTP response for `post
         * /evaluations/v1-beta/red-team/terminations/{workflow_id}`, but is otherwise the same as
         * [RedTeamService.terminate].
         */
        @MustBeClosed
        fun terminate(workflowId: String): HttpResponse =
            terminate(workflowId, RedTeamTerminateParams.none())

        /** @see terminate */
        @MustBeClosed
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            terminate(params.toBuilder().workflowId(workflowId).build(), requestOptions)

        /** @see terminate */
        @MustBeClosed
        fun terminate(
            workflowId: String,
            params: RedTeamTerminateParams = RedTeamTerminateParams.none(),
        ): HttpResponse = terminate(workflowId, params, RequestOptions.none())

        /** @see terminate */
        @MustBeClosed
        fun terminate(
            params: RedTeamTerminateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see terminate */
        @MustBeClosed
        fun terminate(params: RedTeamTerminateParams): HttpResponse =
            terminate(params, RequestOptions.none())

        /** @see terminate */
        @MustBeClosed
        fun terminate(workflowId: String, requestOptions: RequestOptions): HttpResponse =
            terminate(workflowId, RedTeamTerminateParams.none(), requestOptions)
    }
}
