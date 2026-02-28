// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.clusters.Cluster
import com.court_listener_sdk.api.models.clusters.ClusterListPage
import com.court_listener_sdk.api.models.clusters.ClusterListParams
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Opinion clusters grouping related decisions from a single hearing. */
interface ClusterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClusterService

    /**
     * Look up a cluster by its ID. The cluster ID matches the ID used in CourtListener case law
     * URLs (e.g. `/opinion/2812209/obergefell-v-hodges/` corresponds to cluster ID `2812209`).
     */
    fun retrieve(
        id: Long,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Cluster = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Cluster

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): Cluster =
        retrieve(id, ClusterRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of opinion clusters. Each cluster groups together opinions from the
     * same panel hearing (e.g. majority, dissent, concurrence). The cluster `id` is used in
     * CourtListener case law URLs.
     */
    fun list(
        params: ClusterListParams = ClusterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ClusterListPage =
        list(ClusterListParams.none(), requestOptions)

    /** A view of [ClusterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClusterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /clusters/{id}/`, but is otherwise the same as
         * [ClusterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Cluster> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Cluster>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Cluster> =
            retrieve(id, ClusterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /clusters/`, but is otherwise the same as
         * [ClusterService.list].
         */
        @MustBeClosed
        fun list(
            params: ClusterListParams = ClusterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ClusterListPage> =
            list(ClusterListParams.none(), requestOptions)
    }
}
