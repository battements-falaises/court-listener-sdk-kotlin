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
import com.court_listener_sdk.api.models.clusters.Cluster
import com.court_listener_sdk.api.models.clusters.ClusterListPageAsync
import com.court_listener_sdk.api.models.clusters.ClusterListPageResponse
import com.court_listener_sdk.api.models.clusters.ClusterListParams
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams

/** Opinion clusters grouping related decisions from a single hearing. */
class ClusterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClusterServiceAsync {

    private val withRawResponse: ClusterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClusterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClusterServiceAsync =
        ClusterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions,
    ): Cluster =
        // get /clusters/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ClusterListParams,
        requestOptions: RequestOptions,
    ): ClusterListPageAsync =
        // get /clusters/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClusterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ClusterServiceAsync.WithRawResponse =
            ClusterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Cluster> =
            jsonHandler<Cluster>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Cluster> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("clusters", params._pathParam(0), "")
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

        private val listHandler: Handler<ClusterListPageResponse> =
            jsonHandler<ClusterListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ClusterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("clusters", "")
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
                        ClusterListPageAsync.builder()
                            .service(ClusterServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
