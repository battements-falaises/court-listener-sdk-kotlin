// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.clusters.Cluster
import com.court_listener_sdk.api.models.clusters.ClusterListPageAsync
import com.court_listener_sdk.api.models.clusters.ClusterListParams
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Opinion clusters grouping related decisions from a single hearing. */
interface ClusterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClusterServiceAsync

    /**
     * Look up a cluster by its ID. The cluster ID matches the ID used in CourtListener case law
     * URLs (e.g. `/opinion/2812209/obergefell-v-hodges/` corresponds to cluster ID `2812209`).
     */
    suspend fun retrieve(
        id: Long,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Cluster = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Cluster

    /** @see retrieve */
    suspend fun retrieve(id: Long, requestOptions: RequestOptions): Cluster =
        retrieve(id, ClusterRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of opinion clusters. Each cluster groups together opinions from the
     * same panel hearing (e.g. majority, dissent, concurrence). The cluster `id` is used in
     * CourtListener case law URLs.
     */
    suspend fun list(
        params: ClusterListParams = ClusterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ClusterListPageAsync =
        list(ClusterListParams.none(), requestOptions)

    /**
     * A view of [ClusterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ClusterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /clusters/{id}/`, but is otherwise the same as
         * [ClusterServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: Long,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Cluster> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Cluster>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Cluster> =
            retrieve(id, ClusterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /clusters/`, but is otherwise the same as
         * [ClusterServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ClusterListParams = ClusterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ClusterListPageAsync> =
            list(ClusterListParams.none(), requestOptions)
    }
}
