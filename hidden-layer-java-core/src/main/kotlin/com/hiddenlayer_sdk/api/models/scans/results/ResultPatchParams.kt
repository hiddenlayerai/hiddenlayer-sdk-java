// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Indicate part (file or files) of a model scan has completed */
class ResultPatchParams
private constructor(
    private val pathScanId: String,
    private val hasDetections: Boolean?,
    private val scanReport: ScanReport,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathScanId(): String = pathScanId

    /** Filter file_results to only those that have detections (and parents) */
    fun hasDetections(): Optional<Boolean> = Optional.ofNullable(hasDetections)

    fun scanReport(): ScanReport = scanReport

    fun _additionalBodyProperties(): Map<String, JsonValue> = scanReport._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResultPatchParams].
         *
         * The following fields are required:
         * ```java
         * .pathScanId()
         * .scanReport()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultPatchParams]. */
    class Builder internal constructor() {

        private var pathScanId: String? = null
        private var hasDetections: Boolean? = null
        private var scanReport: ScanReport? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(resultPatchParams: ResultPatchParams) = apply {
            pathScanId = resultPatchParams.pathScanId
            hasDetections = resultPatchParams.hasDetections
            scanReport = resultPatchParams.scanReport
            additionalHeaders = resultPatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = resultPatchParams.additionalQueryParams.toBuilder()
        }

        fun pathScanId(pathScanId: String) = apply { this.pathScanId = pathScanId }

        /** Filter file_results to only those that have detections (and parents) */
        fun hasDetections(hasDetections: Boolean?) = apply { this.hasDetections = hasDetections }

        /**
         * Alias for [Builder.hasDetections].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasDetections(hasDetections: Boolean) = hasDetections(hasDetections as Boolean?)

        /** Alias for calling [Builder.hasDetections] with `hasDetections.orElse(null)`. */
        fun hasDetections(hasDetections: Optional<Boolean>) =
            hasDetections(hasDetections.getOrNull())

        fun scanReport(scanReport: ScanReport) = apply { this.scanReport = scanReport }

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
         * Returns an immutable instance of [ResultPatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pathScanId()
         * .scanReport()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResultPatchParams =
            ResultPatchParams(
                checkRequired("pathScanId", pathScanId),
                hasDetections,
                checkRequired("scanReport", scanReport),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ScanReport = scanReport

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathScanId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                hasDetections?.let { put("has_detections", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResultPatchParams && pathScanId == other.pathScanId && hasDetections == other.hasDetections && scanReport == other.scanReport && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pathScanId, hasDetections, scanReport, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ResultPatchParams{pathScanId=$pathScanId, hasDetections=$hasDetections, scanReport=$scanReport, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
