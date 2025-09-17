@file:JvmName("JsonHandler")

package com.hiddenlayer.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponse.Handler
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw HiddenLayerInvalidDataException("Error reading response", e)
            }
    }
