// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.client

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.getPackageVersion
import com.court_listener_sdk.api.services.async.ClusterServiceAsync
import com.court_listener_sdk.api.services.async.ClusterServiceAsyncImpl
import com.court_listener_sdk.api.services.async.CourtServiceAsync
import com.court_listener_sdk.api.services.async.CourtServiceAsyncImpl
import com.court_listener_sdk.api.services.async.DocketServiceAsync
import com.court_listener_sdk.api.services.async.DocketServiceAsyncImpl
import com.court_listener_sdk.api.services.async.OpinionServiceAsync
import com.court_listener_sdk.api.services.async.OpinionServiceAsyncImpl

class CourtListenerClientAsyncImpl(private val clientOptions: ClientOptions) :
    CourtListenerClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: CourtListenerClient by lazy { CourtListenerClientImpl(clientOptions) }

    private val withRawResponse: CourtListenerClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val courts: CourtServiceAsync by lazy {
        CourtServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dockets: DocketServiceAsync by lazy {
        DocketServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val clusters: ClusterServiceAsync by lazy {
        ClusterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val opinions: OpinionServiceAsync by lazy {
        OpinionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): CourtListenerClient = sync

    override fun withRawResponse(): CourtListenerClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtListenerClientAsync =
        CourtListenerClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Metadata about courts in the CourtListener database. */
    override fun courts(): CourtServiceAsync = courts

    /** Case-level metadata sitting at the top of the object hierarchy. */
    override fun dockets(): DocketServiceAsync = dockets

    /** Opinion clusters grouping related decisions from a single hearing. */
    override fun clusters(): ClusterServiceAsync = clusters

    /** Individual judicial opinions with full text and metadata. */
    override fun opinions(): OpinionServiceAsync = opinions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourtListenerClientAsync.WithRawResponse {

        private val courts: CourtServiceAsync.WithRawResponse by lazy {
            CourtServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dockets: DocketServiceAsync.WithRawResponse by lazy {
            DocketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val clusters: ClusterServiceAsync.WithRawResponse by lazy {
            ClusterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val opinions: OpinionServiceAsync.WithRawResponse by lazy {
            OpinionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtListenerClientAsync.WithRawResponse =
            CourtListenerClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Metadata about courts in the CourtListener database. */
        override fun courts(): CourtServiceAsync.WithRawResponse = courts

        /** Case-level metadata sitting at the top of the object hierarchy. */
        override fun dockets(): DocketServiceAsync.WithRawResponse = dockets

        /** Opinion clusters grouping related decisions from a single hearing. */
        override fun clusters(): ClusterServiceAsync.WithRawResponse = clusters

        /** Individual judicial opinions with full text and metadata. */
        override fun opinions(): OpinionServiceAsync.WithRawResponse = opinions
    }
}
