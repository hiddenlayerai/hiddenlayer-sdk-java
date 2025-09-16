package com.hiddenlayer_sdk.api.errors

open class HiddenLayerException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
