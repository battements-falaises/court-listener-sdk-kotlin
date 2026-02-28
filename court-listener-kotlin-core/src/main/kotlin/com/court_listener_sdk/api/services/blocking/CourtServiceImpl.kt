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
import com.court_listener_sdk.api.models.courts.Court
import com.court_listener_sdk.api.models.courts.CourtListPage
import com.court_listener_sdk.api.models.courts.CourtListPageResponse
import com.court_listener_sdk.api.models.courts.CourtListParams
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams

/** Metadata about courts in the CourtListener database. */
class CourtServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CourtService {

    private val withRawResponse: CourtService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CourtService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtService =
        CourtServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: CourtRetrieveParams, requestOptions: RequestOptions): Court =
        // get /courts/{id}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: CourtListParams, requestOptions: RequestOptions): CourtListPage =
        // get /courts/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourtService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtService.WithRawResponse =
            CourtServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<Court> = jsonHandler<Court>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<CourtListPageResponse> =
            jsonHandler<CourtListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CourtListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CourtListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("courts", "")
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
                        CourtListPage.builder()
                            .service(CourtServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
