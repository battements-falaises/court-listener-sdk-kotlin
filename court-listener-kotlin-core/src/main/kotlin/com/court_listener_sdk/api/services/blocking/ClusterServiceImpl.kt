// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

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
import com.court_listener_sdk.api.core.prepare
import com.court_listener_sdk.api.models.clusters.Cluster
import com.court_listener_sdk.api.models.clusters.ClusterListPage
import com.court_listener_sdk.api.models.clusters.ClusterListPageResponse
import com.court_listener_sdk.api.models.clusters.ClusterListParams
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams

/** Opinion clusters grouping related decisions from a single hearing. */
class ClusterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClusterService {

    private val withRawResponse: ClusterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClusterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClusterService =
        ClusterServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: ClusterRetrieveParams, requestOptions: RequestOptions): Cluster =
        // get /clusters/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ClusterListParams, requestOptions: RequestOptions): ClusterListPage =
        // get /clusters/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClusterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ClusterService.WithRawResponse =
            ClusterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Cluster> =
            jsonHandler<Cluster>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: ClusterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("clusters", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ClusterListPage.builder()
                            .service(ClusterServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
