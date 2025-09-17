package com.hiddenlayer.api.errors

class HiddenLayerInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    HiddenLayerException(message, cause)
