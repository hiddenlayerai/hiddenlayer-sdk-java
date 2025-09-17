// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

import com.hiddenlayer.api.core.AutoPagerAsync
import com.hiddenlayer.api.core.PageAsync
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.services.async.models.CardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CardServiceAsync.list */
class CardListPageAsync
private constructor(
    private val service: CardServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) : PageAsync<CardListResponse> {

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.results
     */
    fun results(): List<CardListResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.pageSize
     */
    fun pageSize(): Optional<Long> = response._pageSize().getOptional("page_size")

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.pageNumber
     */
    fun pageNumber(): Optional<Long> = response._pageNumber().getOptional("page_number")

    override fun items(): List<CardListResponse> = results()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = params.offset().getOrDefault(0)
        val totalCount = totalCount().getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): CardListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CardListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardListPageAsync].
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

    /** A builder for [CardListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardListParams? = null
        private var response: CardListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardListPageAsync: CardListPageAsync) = apply {
            service = cardListPageAsync.service
            streamHandlerExecutor = cardListPageAsync.streamHandlerExecutor
            params = cardListPageAsync.params
            response = cardListPageAsync.response
        }

        fun service(service: CardServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardListPageAsync].
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
        fun build(): CardListPageAsync =
            CardListPageAsync(
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

        return other is CardListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CardListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
