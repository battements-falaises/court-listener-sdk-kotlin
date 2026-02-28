package com.court_listener_sdk.api.errors

open class CourtListenerException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
