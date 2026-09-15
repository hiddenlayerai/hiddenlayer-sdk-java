// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.errors

import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.http.Headers

abstract class HiddenLayerServiceException
protected constructor(message: String, cause: Throwable? = null) :
    HiddenLayerException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
