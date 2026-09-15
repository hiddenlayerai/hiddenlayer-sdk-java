package com.hiddenlayer.api.errors

open class HiddenLayerException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
