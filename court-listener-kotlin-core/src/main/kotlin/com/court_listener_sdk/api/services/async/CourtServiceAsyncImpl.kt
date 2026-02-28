// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.core.handlers.errorBodyHandler
import com.court_listener_sdk.api.core.handlers.errorHandler
import com.court_listener_sdk.api.core.handlers.jsonHandler
import com.court_listener_sdk.api.core.http.HttpMethod
import com.court_listener_sdk.api.core.http.HttpRequest
import com.court_listener_sdk.api.core.http.HttpResponse
import com.court_listener_sdk.api.core.http.HttpResponse.Handler
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.core.http.parseable
import com.court_listener_sdk.api.core.prepareAsync
import com.court_listener_sdk.api.models.courts.Court
import com.court_listener_sdk.api.models.courts.CourtListPageAsync
import com.court_listener_sdk.api.models.courts.CourtListPageResponse
import com.court_listener_sdk.api.models.courts.CourtListParams
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams

/** Metadata about courts in the CourtListener database. */
class CourtServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CourtServiceAsync {

    private val withRawResponse: CourtServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CourtServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtServiceAsync =
        CourtServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: CourtRetrieveParams,
        requestOptions: RequestOptions,
    ): Court =
        // get /courts/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CourtListParams,
        requestOptions: RequestOptions,
    ): CourtListPageAsync =
        // get /courts/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourtServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtServiceAsync.WithRawResponse =
            CourtServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Court> = jsonHandler<Court>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CourtRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Court> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("courts", params._pathParam(0), "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CourtListPageResponse> =
            jsonHandler<CourtListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CourtListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CourtListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("courts", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CourtListPageAsync.builder()
                            .service(CourtServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
