// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.hiddenlayer.api.core.AutoPagerAsync
import com.hiddenlayer.api.core.PageAsync
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.services.async.scans.ResultServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ResultServiceAsync.listFiles */
class ResultListFilesPageAsync
private constructor(
    private val service: ResultServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ResultListFilesParams,
    private val response: ResultListFilesPageResponse,
) : PageAsync<ScanFileResult> {

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.items
     */
    override fun items(): List<ScanFileResult> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.first
     */
    fun first(): Optional<String> = response._first().getOptional("first")

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.prev
     */
    fun prev(): Optional<String> = response._prev().getOptional("prev")

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.last
     */
    fun last(): Optional<String> = response._last().getOptional("last")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && next().isPresent

    fun nextPageParams(): ResultListFilesParams {
        val nextCursor =
            next().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ResultListFilesPageAsync> =
        service.listFiles(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScanFileResult> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ResultListFilesParams = params

    /** The response that this page was parsed from. */
    fun response(): ResultListFilesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResultListFilesPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListFilesPageAsync]. */
    class Builder internal constructor() {

        private var service: ResultServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ResultListFilesParams? = null
        private var response: ResultListFilesPageResponse? = null

        @JvmSynthetic
        internal fun from(resultListFilesPageAsync: ResultListFilesPageAsync) = apply {
            service = resultListFilesPageAsync.service
            streamHandlerExecutor = resultListFilesPageAsync.streamHandlerExecutor
            params = resultListFilesPageAsync.params
            response = resultListFilesPageAsync.response
        }

        fun service(service: ResultServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ResultListFilesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResultListFilesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ResultListFilesPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResultListFilesPageAsync =
            ResultListFilesPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResultListFilesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ResultListFilesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
