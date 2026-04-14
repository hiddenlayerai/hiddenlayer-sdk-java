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
}
