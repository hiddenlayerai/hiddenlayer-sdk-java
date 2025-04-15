// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.errors

import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.http.Headers

abstract class HiddenLayerServiceException
protected constructor(message: String, cause: Throwable? = null) :
    HiddenLayerException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
