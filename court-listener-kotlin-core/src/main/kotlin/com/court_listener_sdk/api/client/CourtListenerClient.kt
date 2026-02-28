// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.client

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.services.blocking.ClusterService
import com.court_listener_sdk.api.services.blocking.CourtService
import com.court_listener_sdk.api.services.blocking.DocketService
import com.court_listener_sdk.api.services.blocking.OpinionService

/**
 * A client for interacting with the Court Listener REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface CourtListenerClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): CourtListenerClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtListenerClient

    /** Metadata about courts in the CourtListener database. */
    fun courts(): CourtService

    /** Case-level metadata sitting at the top of the object hierarchy. */
    fun dockets(): DocketService

    /** Opinion clusters grouping related decisions from a single hearing. */
    fun clusters(): ClusterService

    /** Individual judicial opinions with full text and metadata. */
    fun opinions(): OpinionService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [CourtListenerClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtListenerClient.WithRawResponse

        /** Metadata about courts in the CourtListener database. */
        fun courts(): CourtService.WithRawResponse

        /** Case-level metadata sitting at the top of the object hierarchy. */
        fun dockets(): DocketService.WithRawResponse

        /** Opinion clusters grouping related decisions from a single hearing. */
        fun clusters(): ClusterService.WithRawResponse

        /** Individual judicial opinions with full text and metadata. */
        fun opinions(): OpinionService.WithRawResponse
    }
}
