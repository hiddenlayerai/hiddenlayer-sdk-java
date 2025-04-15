// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get condensed reports for a Model Scan */
class ResultListParams
private constructor(
    private val endTime: OffsetDateTime?,
    private val latestPerModelVersionOnly: Boolean?,
    private val limit: Long?,
    private val modelIds: List<String>?,
    private val modelVersionIds: List<String>?,
    private val offset: Long?,
    private val severity: List<String>?,
    private val sort: String?,
    private val startTime: OffsetDateTime?,
    private val status: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** End Time */
    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    /** only return latest result per model version */
    fun latestPerModelVersionOnly(): Optional<Boolean> =
        Optional.ofNullable(latestPerModelVersionOnly)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Model ID */
    fun modelIds(): Optional<List<String>> = Optional.ofNullable(modelIds)

    /** Model Version ID */
    fun modelVersionIds(): Optional<List<String>> = Optional.ofNullable(modelVersionIds)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Severities */
    fun severity(): Optional<List<String>> = Optional.ofNullable(severity)

    /**
     * allow sorting by status, severity or created at, ascending (+) or the default descending (-)
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** Start Time */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Statuses */
    fun status(): Optional<List<String>> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ResultListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ResultListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListParams]. */
    class Builder internal constructor() {

        private var endTime: OffsetDateTime? = null
        private var latestPerModelVersionOnly: Boolean? = null
        private var limit: Long? = null
        private var modelIds: MutableList<String>? = null
        private var modelVersionIds: MutableList<String>? = null
        private var offset: Long? = null
        private var severity: MutableList<String>? = null
        private var sort: String? = null
        private var startTime: OffsetDateTime? = null
        private var status: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(resultListParams: ResultListParams) = apply {
            endTime = resultListParams.endTime
            latestPerModelVersionOnly = resultListParams.latestPerModelVersionOnly
            limit = resultListParams.limit
            modelIds = resultListParams.modelIds?.toMutableList()
            modelVersionIds = resultListParams.modelVersionIds?.toMutableList()
            offset = resultListParams.offset
            severity = resultListParams.severity?.toMutableList()
            sort = resultListParams.sort
            startTime = resultListParams.startTime
            status = resultListParams.status?.toMutableList()
            additionalHeaders = resultListParams.additionalHeaders.toBuilder()
            additionalQueryParams = resultListParams.additionalQueryParams.toBuilder()
        }

        /** End Time */
        fun endTime(endTime: OffsetDateTime?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /** only return latest result per model version */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Boolean?) = apply {
            this.latestPerModelVersionOnly = latestPerModelVersionOnly
        }

        /**
         * Alias for [Builder.latestPerModelVersionOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Boolean) =
            latestPerModelVersionOnly(latestPerModelVersionOnly as Boolean?)

        /**
         * Alias for calling [Builder.latestPerModelVersionOnly] with
         * `latestPerModelVersionOnly.orElse(null)`.
         */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Optional<Boolean>) =
            latestPerModelVersionOnly(latestPerModelVersionOnly.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Model ID */
        fun modelIds(modelIds: List<String>?) = apply { this.modelIds = modelIds?.toMutableList() }

        /** Alias for calling [Builder.modelIds] with `modelIds.orElse(null)`. */
        fun modelIds(modelIds: Optional<List<String>>) = modelIds(modelIds.getOrNull())

        /**
         * Adds a single [String] to [modelIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModelId(modelId: String) = apply {
            modelIds = (modelIds ?: mutableListOf()).apply { add(modelId) }
        }

        /** Model Version ID */
        fun modelVersionIds(modelVersionIds: List<String>?) = apply {
            this.modelVersionIds = modelVersionIds?.toMutableList()
        }

        /** Alias for calling [Builder.modelVersionIds] with `modelVersionIds.orElse(null)`. */
        fun modelVersionIds(modelVersionIds: Optional<List<String>>) =
            modelVersionIds(modelVersionIds.getOrNull())

        /**
         * Adds a single [String] to [modelVersionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModelVersionId(modelVersionId: String) = apply {
            modelVersionIds = (modelVersionIds ?: mutableListOf()).apply { add(modelVersionId) }
        }

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Severities */
        fun severity(severity: List<String>?) = apply { this.severity = severity?.toMutableList() }

        /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
        fun severity(severity: Optional<List<String>>) = severity(severity.getOrNull())

        /**
         * Adds a single [String] to [Builder.severity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeverity(severity: String) = apply {
            this.severity = (this.severity ?: mutableListOf()).apply { add(severity) }
        }

        /**
         * allow sorting by status, severity or created at, ascending (+) or the default descending
         * (-)
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        /** Start Time */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /** Statuses */
        fun status(status: List<String>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<String>>) = status(status.getOrNull())

        /**
         * Adds a single [String] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: String) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

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
         * Returns an immutable instance of [ResultListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResultListParams =
            ResultListParams(
                endTime,
                latestPerModelVersionOnly,
                limit,
                modelIds?.toImmutable(),
                modelVersionIds?.toImmutable(),
                offset,
                severity?.toImmutable(),
                sort,
                startTime,
                status?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endTime?.let { put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                latestPerModelVersionOnly?.let {
                    put("latest_per_model_version_only", it.toString())
                }
                limit?.let { put("limit", it.toString()) }
                modelIds?.let { put("model_ids", it.joinToString(",")) }
                modelVersionIds?.let { put("model_version_ids", it.joinToString(",")) }
                offset?.let { put("offset", it.toString()) }
                severity?.let { put("severity", it.joinToString(",")) }
                sort?.let { put("sort", it) }
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                status?.let { put("status", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResultListParams && endTime == other.endTime && latestPerModelVersionOnly == other.latestPerModelVersionOnly && limit == other.limit && modelIds == other.modelIds && modelVersionIds == other.modelVersionIds && offset == other.offset && severity == other.severity && sort == other.sort && startTime == other.startTime && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endTime, latestPerModelVersionOnly, limit, modelIds, modelVersionIds, offset, severity, sort, startTime, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ResultListParams{endTime=$endTime, latestPerModelVersionOnly=$latestPerModelVersionOnly, limit=$limit, modelIds=$modelIds, modelVersionIds=$modelVersionIds, offset=$offset, severity=$severity, sort=$sort, startTime=$startTime, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
