// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

import com.hiddenlayer.api.core.AutoPager
import com.hiddenlayer.api.core.Page
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.services.blocking.scans.ResultService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ResultService.listFiles */
class ResultListFilesPage
private constructor(
    private val service: ResultService,
    private val params: ResultListFilesParams,
    private val response: ResultListFilesPageResponse,
) : Page<ScanFileResult> {

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
     * @see ResultListFilesPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [ResultListFilesPageResponse], but gracefully handles missing data.
     *
     * @see ResultListFilesPageResponse.prev
     */
    fun prev(): Optional<String> = response._prev().getOptional("prev")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && next().isPresent

    fun nextPageParams(): ResultListFilesParams {
        val nextCursor =
            next().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ResultListFilesPage = service.listFiles(nextPageParams())

    fun autoPager(): AutoPager<ScanFileResult> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ResultListFilesParams = params

    /** The response that this page was parsed from. */
    fun response(): ResultListFilesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResultListFilesPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListFilesPage]. */
    class Builder internal constructor() {

        private var service: ResultService? = null
        private var params: ResultListFilesParams? = null
        private var response: ResultListFilesPageResponse? = null

        @JvmSynthetic
        internal fun from(resultListFilesPage: ResultListFilesPage) = apply {
            service = resultListFilesPage.service
            params = resultListFilesPage.params
            response = resultListFilesPage.response
        }

        fun service(service: ResultService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResultListFilesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResultListFilesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ResultListFilesPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResultListFilesPage =
            ResultListFilesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResultListFilesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ResultListFilesPage{service=$service, params=$params, response=$response}"
}
