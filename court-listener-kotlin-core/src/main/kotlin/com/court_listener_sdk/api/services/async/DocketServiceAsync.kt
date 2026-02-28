// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.dockets.Docket
import com.court_listener_sdk.api.models.dockets.DocketListPageAsync
import com.court_listener_sdk.api.models.dockets.DocketListParams
import com.court_listener_sdk.api.models.dockets.DocketRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Case-level metadata sitting at the top of the object hierarchy. */
interface DocketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocketServiceAsync

    /** Retrieve a single docket */
    suspend fun retrieve(
        id: Long,
        params: DocketRetrieveParams = DocketRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Docket = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DocketRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Docket

    /** @see retrieve */
    suspend fun retrieve(id: Long, requestOptions: RequestOptions): Docket =
        retrieve(id, DocketRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of dockets. Dockets sit at the top of the case law hierarchy,
     * linking to clusters of opinions.
     *
     * **Note**: The response does not inline docket entries, parties, or attorneys (this does not
     * scale). Use the PACER/RECAP APIs for those.
     */
    suspend fun list(
        params: DocketListParams = DocketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocketListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DocketListPageAsync =
        list(DocketListParams.none(), requestOptions)

    /**
     * A view of [DocketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dockets/{id}/`, but is otherwise the same as
         * [DocketServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: Long,
            params: DocketRetrieveParams = DocketRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Docket> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DocketRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Docket>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Docket> =
            retrieve(id, DocketRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dockets/`, but is otherwise the same as
         * [DocketServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DocketListParams = DocketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocketListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DocketListPageAsync> =
            list(DocketListParams.none(), requestOptions)
    }
}
