// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.client

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.getPackageVersion
import com.court_listener_sdk.api.services.blocking.ClusterService
import com.court_listener_sdk.api.services.blocking.ClusterServiceImpl
import com.court_listener_sdk.api.services.blocking.CourtService
import com.court_listener_sdk.api.services.blocking.CourtServiceImpl
import com.court_listener_sdk.api.services.blocking.DocketService
import com.court_listener_sdk.api.services.blocking.DocketServiceImpl
import com.court_listener_sdk.api.services.blocking.OpinionService
import com.court_listener_sdk.api.services.blocking.OpinionServiceImpl

class CourtListenerClientImpl(private val clientOptions: ClientOptions) : CourtListenerClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: CourtListenerClientAsync by lazy {
        CourtListenerClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: CourtListenerClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val courts: CourtService by lazy { CourtServiceImpl(clientOptionsWithUserAgent) }

    private val dockets: DocketService by lazy { DocketServiceImpl(clientOptionsWithUserAgent) }

    private val clusters: ClusterService by lazy { ClusterServiceImpl(clientOptionsWithUserAgent) }

    private val opinions: OpinionService by lazy { OpinionServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): CourtListenerClientAsync = async

    override fun withRawResponse(): CourtListenerClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtListenerClient =
        CourtListenerClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Metadata about courts in the CourtListener database. */
    override fun courts(): CourtService = courts

    /** Case-level metadata sitting at the top of the object hierarchy. */
    override fun dockets(): DocketService = dockets

    /** Opinion clusters grouping related decisions from a single hearing. */
    override fun clusters(): ClusterService = clusters

    /** Individual judicial opinions with full text and metadata. */
    override fun opinions(): OpinionService = opinions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourtListenerClient.WithRawResponse {

        private val courts: CourtService.WithRawResponse by lazy {
            CourtServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dockets: DocketService.WithRawResponse by lazy {
            DocketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val clusters: ClusterService.WithRawResponse by lazy {
            ClusterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val opinions: OpinionService.WithRawResponse by lazy {
            OpinionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtListenerClient.WithRawResponse =
            CourtListenerClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Metadata about courts in the CourtListener database. */
        override fun courts(): CourtService.WithRawResponse = courts

        /** Case-level metadata sitting at the top of the object hierarchy. */
        override fun dockets(): DocketService.WithRawResponse = dockets

        /** Opinion clusters grouping related decisions from a single hearing. */
        override fun clusters(): ClusterService.WithRawResponse = clusters

        /** Individual judicial opinions with full text and metadata. */
        override fun opinions(): OpinionService.WithRawResponse = opinions
    }
}
