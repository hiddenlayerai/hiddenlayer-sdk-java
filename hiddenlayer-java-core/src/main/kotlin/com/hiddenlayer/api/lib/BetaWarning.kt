package com.hiddenlayer.api.lib

import java.util.concurrent.ConcurrentHashMap
import java.util.logging.Logger

/**
 * Runtime beta warning utility.
 *
 * Emits a one-time warning per method name when a beta endpoint is called, so SDK consumers know
 * the method is not yet GA.
 */
object BetaWarning {

    private val logger = Logger.getLogger(BetaWarning::class.java.name)

    private val warned: MutableSet<String> = ConcurrentHashMap.newKeySet()

    /**
     * Emit a one-time warning that a beta endpoint was called.
     *
     * @param qualifiedName Fully qualified method name, e.g. "JobService.request"
     */
    @JvmStatic
    fun warnBeta(qualifiedName: String) {
        if (warned.add(qualifiedName)) {
            logger.warning(
                "[BETA] $qualifiedName: This endpoint is not GA or Production ready and is" +
                    " subject to changes at any time. Breaking changes may occur."
            )
        }
    }

    /**
     * Emit a one-time beta warning if [pathSegments] matches a registered beta endpoint.
     *
     * Matching is segment-based so endpoints with path parameters (e.g.
     * `/evaluations/v1/red-team/{workflowId}/status`) are recognized even though the request path
     * has the parameter value substituted in. A `null` pattern segment is a wildcard matching any
     * single segment.
     *
     * @param pathSegments The request's path segments, e.g. `["detection", "v2",
     *   "request-evaluations"]`.
     */
    @JvmStatic
    fun checkBetaEndpoint(pathSegments: List<String>) {
        matchBetaEndpoint(pathSegments)?.let { warnBeta(it) }
    }

    /**
     * Return the qualified method name of the beta endpoint whose pattern matches [pathSegments],
     * or null if none matches. Matching compares segment counts and literal positions; a `null`
     * pattern segment is a wildcard. Pure (no logging or dedup state) so it is safe to unit test
     * directly.
     */
    @JvmStatic
    internal fun matchBetaEndpoint(pathSegments: List<String>): String? {
        for ((pattern, qualifiedName) in BetaEndpoints.REGISTRY) {
            if (pattern.size != pathSegments.size) continue
            if (pattern.indices.all { pattern[it] == null || pattern[it] == pathSegments[it] }) {
                return qualifiedName
            }
        }
        return null
    }
}
