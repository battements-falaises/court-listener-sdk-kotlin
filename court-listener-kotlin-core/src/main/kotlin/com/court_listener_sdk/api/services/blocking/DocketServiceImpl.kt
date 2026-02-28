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
import com.court_listener_sdk.api.models.dockets.Docket
import com.court_listener_sdk.api.models.dockets.DocketListPage
import com.court_listener_sdk.api.models.dockets.DocketListPageResponse
import com.court_listener_sdk.api.models.dockets.DocketListParams
import com.court_listener_sdk.api.models.dockets.DocketRetrieveParams

/** Case-level metadata sitting at the top of the object hierarchy. */
class DocketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocketService {

    private val withRawResponse: DocketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocketService =
        DocketServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: DocketRetrieveParams, requestOptions: RequestOptions): Docket =
        // get /dockets/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: DocketListParams, requestOptions: RequestOptions): DocketListPage =
        // get /dockets/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocketService.WithRawResponse =
            DocketServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<Docket> = jsonHandler<Docket>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<DocketListPageResponse> =
            jsonHandler<DocketListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocketListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocketListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dockets", "")
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
                        DocketListPage.builder()
                            .service(DocketServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
