package com.hiddenlayer.api.errors

class HiddenLayerIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    HiddenLayerException(message, cause)
