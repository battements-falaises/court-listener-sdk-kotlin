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
import com.court_listener_sdk.api.models.opinions.Opinion
import com.court_listener_sdk.api.models.opinions.OpinionListPageAsync
import com.court_listener_sdk.api.models.opinions.OpinionListPageResponse
import com.court_listener_sdk.api.models.opinions.OpinionListParams
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams

/** Individual judicial opinions with full text and metadata. */
class OpinionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OpinionServiceAsync {

    private val withRawResponse: OpinionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OpinionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpinionServiceAsync =
        OpinionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: OpinionRetrieveParams,
        requestOptions: RequestOptions,
    ): Opinion =
        // get /opinions/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: OpinionListParams,
        requestOptions: RequestOptions,
    ): OpinionListPageAsync =
        // get /opinions/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpinionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OpinionServiceAsync.WithRawResponse =
            OpinionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Opinion> =
            jsonHandler<Opinion>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: OpinionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Opinion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("opinions", params._pathParam(0), "")
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

        private val listHandler: Handler<OpinionListPageResponse> =
            jsonHandler<OpinionListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: OpinionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpinionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("opinions", "")
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
                        OpinionListPageAsync.builder()
                            .service(OpinionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
