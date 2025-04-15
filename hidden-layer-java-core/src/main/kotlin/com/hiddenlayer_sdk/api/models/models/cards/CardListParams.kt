// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Model Cards */
class CardListParams
private constructor(
    private val limit: Long?,
    private val modelNameContains: String?,
    private val modelNameEq: String?,
    private val offset: Long?,
    private val sort: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** substring match on model name */
    fun modelNameContains(): Optional<String> = Optional.ofNullable(modelNameContains)

    /** substring match on model name */
    fun modelNameEq(): Optional<String> = Optional.ofNullable(modelNameEq)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /**
     * allow sorting by model name or created at timestamp, ascending (+) or the default descending
     * (-)
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardListParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var modelNameContains: String? = null
        private var modelNameEq: String? = null
        private var offset: Long? = null
        private var sort: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardListParams: CardListParams) = apply {
            limit = cardListParams.limit
            modelNameContains = cardListParams.modelNameContains
            modelNameEq = cardListParams.modelNameEq
            offset = cardListParams.offset
            sort = cardListParams.sort
            additionalHeaders = cardListParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardListParams.additionalQueryParams.toBuilder()
        }

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** substring match on model name */
        fun modelNameContains(modelNameContains: String?) = apply {
            this.modelNameContains = modelNameContains
        }

        /** Alias for calling [Builder.modelNameContains] with `modelNameContains.orElse(null)`. */
        fun modelNameContains(modelNameContains: Optional<String>) =
            modelNameContains(modelNameContains.getOrNull())

        /** substring match on model name */
        fun modelNameEq(modelNameEq: String?) = apply { this.modelNameEq = modelNameEq }

        /** Alias for calling [Builder.modelNameEq] with `modelNameEq.orElse(null)`. */
        fun modelNameEq(modelNameEq: Optional<String>) = modelNameEq(modelNameEq.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /**
         * allow sorting by model name or created at timestamp, ascending (+) or the default
         * descending (-)
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CardListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardListParams =
            CardListParams(
                limit,
                modelNameContains,
                modelNameEq,
                offset,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                modelNameContains?.let { put("model_name[contains]", it) }
                modelNameEq?.let { put("model_name[eq]", it) }
                offset?.let { put("offset", it.toString()) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListParams && limit == other.limit && modelNameContains == other.modelNameContains && modelNameEq == other.modelNameEq && offset == other.offset && sort == other.sort && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, modelNameContains, modelNameEq, offset, sort, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardListParams{limit=$limit, modelNameContains=$modelNameContains, modelNameEq=$modelNameEq, offset=$offset, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
