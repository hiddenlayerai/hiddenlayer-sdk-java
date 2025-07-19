// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.HttpClient
import com.hiddenlayer_sdk.api.core.http.PhantomReachableClosingHttpClient
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.core.http.RetryingHttpClient
import java.time.Clock
import java.time.Duration
import java.util.Optional
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.ThreadFactory
import java.util.concurrent.atomic.AtomicLong
import kotlin.jvm.optionals.getOrNull

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    @get:JvmName("httpClient") val httpClient: HttpClient,
    /**
     * Whether to throw an exception if any of the Jackson versions detected at runtime are
     * incompatible with the SDK's minimum supported Jackson version (2.13.4).
     *
     * Defaults to true. Use extreme caution when disabling this option. There is no guarantee that
     * the SDK will work correctly when using an incompatible Jackson version.
     */
    @get:JvmName("checkJacksonVersionCompatibility") val checkJacksonVersionCompatibility: Boolean,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("streamHandlerExecutor") val streamHandlerExecutor: Executor,
    @get:JvmName("clock") val clock: Clock,
    private val baseUrl: String?,
    @get:JvmName("headers") val headers: Headers,
    @get:JvmName("queryParams") val queryParams: QueryParams,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    @get:JvmName("timeout") val timeout: Timeout,
    @get:JvmName("maxRetries") val maxRetries: Int,
    private val bearerToken: String?,
    private val clientId: String?,
    private val clientSecret: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    fun baseUrl(): String = baseUrl ?: PROD_US_URL

    fun bearerToken(): Optional<String> = Optional.ofNullable(bearerToken)

    fun clientId(): Optional<String> = Optional.ofNullable(clientId)

    fun clientSecret(): Optional<String> = Optional.ofNullable(clientSecret)

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PROD_US_URL = "https://api.hiddenlayer.ai"

        const val PROD_EU_URL = "https://api.eu.hiddenlayer.ai"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         */
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var streamHandlerExecutor: Executor? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var bearerToken: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            streamHandlerExecutor = clientOptions.streamHandlerExecutor
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            bearerToken = clientOptions.bearerToken
            clientId = clientOptions.clientId
            clientSecret = clientOptions.clientSecret
        }

        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        fun prodEu() = baseUrl(PROD_EU_URL)

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun bearerToken(bearerToken: String?) = apply { this.bearerToken = bearerToken }

        /** Alias for calling [Builder.bearerToken] with `bearerToken.orElse(null)`. */
        fun bearerToken(bearerToken: Optional<String>) = bearerToken(bearerToken.getOrNull())

        fun clientId(clientId: String?) = apply { this.clientId = clientId }

        /** Alias for calling [Builder.clientId] with `clientId.orElse(null)`. */
        fun clientId(clientId: Optional<String>) = clientId(clientId.getOrNull())

        fun clientSecret(clientSecret: String?) = apply { this.clientSecret = clientSecret }

        /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
        fun clientSecret(clientSecret: Optional<String>) = clientSecret(clientSecret.getOrNull())

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun timeout(): Timeout = timeout

        fun fromEnv() = apply {
            System.getenv("HIDDEN_LAYER_BASE_URL")?.let { baseUrl(it) }
            System.getenv("HIDDENLAYER_TOKEN")?.let { bearerToken(it) }
            System.getenv("HIDDENLAYER_CLIENT_ID")?.let { clientId(it) }
            System.getenv("HIDDENLAYER_CLIENT_SECRET")?.let { clientSecret(it) }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            bearerToken?.let {
                if (!it.isEmpty()) {
                    headers.put("Authorization", "Bearer $it")
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(httpClient)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                streamHandlerExecutor
                    ?: Executors.newCachedThreadPool(
                        object : ThreadFactory {

                            private val threadFactory: ThreadFactory =
                                Executors.defaultThreadFactory()
                            private val count = AtomicLong(0)

                            override fun newThread(runnable: Runnable): Thread =
                                threadFactory.newThread(runnable).also {
                                    it.name =
                                        "hidden-layer-stream-handler-thread-${count.getAndIncrement()}"
                                }
                        }
                    ),
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                bearerToken,
                clientId,
                clientSecret,
            )
        }
    }
}
