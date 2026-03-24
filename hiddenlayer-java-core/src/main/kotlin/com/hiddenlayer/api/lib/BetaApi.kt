package com.hiddenlayer.api.lib

/**
 * Marks an API as beta. Beta APIs are not GA or production ready and are subject to breaking
 * changes at any time.
 *
 * Kotlin consumers will see a compile-time warning when calling beta methods unless they
 * explicitly opt in with `@OptIn(BetaApi::class)`.
 */
@RequiresOptIn(
    message = "This API is beta and subject to breaking changes at any time.",
    level = RequiresOptIn.Level.WARNING,
)
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
annotation class BetaApi
