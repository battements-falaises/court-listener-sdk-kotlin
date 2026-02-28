// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.errors

import com.court_listener_sdk.api.core.JsonValue
import com.court_listener_sdk.api.core.http.Headers

abstract class CourtListenerServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CourtListenerException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
