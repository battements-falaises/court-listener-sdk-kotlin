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
import com.court_listener_sdk.api.models.opinions.Opinion
import com.court_listener_sdk.api.models.opinions.OpinionListPage
import com.court_listener_sdk.api.models.opinions.OpinionListPageResponse
import com.court_listener_sdk.api.models.opinions.OpinionListParams
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams

/** Individual judicial opinions with full text and metadata. */
class OpinionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OpinionService {

    private val withRawResponse: OpinionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OpinionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpinionService =
        OpinionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: OpinionRetrieveParams, requestOptions: RequestOptions): Opinion =
        // get /opinions/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: OpinionListParams, requestOptions: RequestOptions): OpinionListPage =
        // get /opinions/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpinionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OpinionService.WithRawResponse =
            OpinionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Opinion> =
            jsonHandler<Opinion>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<OpinionListPageResponse> =
            jsonHandler<OpinionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OpinionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpinionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("opinions", "")
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
                        OpinionListPage.builder()
                            .service(OpinionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
