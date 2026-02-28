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
import com.court_listener_sdk.api.models.dockets.Docket
import com.court_listener_sdk.api.models.dockets.DocketListPageAsync
import com.court_listener_sdk.api.models.dockets.DocketListPageResponse
import com.court_listener_sdk.api.models.dockets.DocketListParams
import com.court_listener_sdk.api.models.dockets.DocketRetrieveParams

/** Case-level metadata sitting at the top of the object hierarchy. */
class DocketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocketServiceAsync {

    private val withRawResponse: DocketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocketServiceAsync =
        DocketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: DocketRetrieveParams,
        requestOptions: RequestOptions,
    ): Docket =
        // get /dockets/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: DocketListParams,
        requestOptions: RequestOptions,
    ): DocketListPageAsync =
        // get /dockets/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocketServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocketServiceAsync.WithRawResponse =
            DocketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Docket> = jsonHandler<Docket>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DocketRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Docket> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dockets", params._pathParam(0), "")
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

        private val listHandler: Handler<DocketListPageResponse> =
            jsonHandler<DocketListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DocketListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocketListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dockets", "")
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
                        DocketListPageAsync.builder()
                            .service(DocketServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
