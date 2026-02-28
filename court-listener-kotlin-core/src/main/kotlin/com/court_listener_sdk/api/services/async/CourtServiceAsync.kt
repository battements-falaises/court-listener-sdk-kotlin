// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.courts.Court
import com.court_listener_sdk.api.models.courts.CourtListPageAsync
import com.court_listener_sdk.api.models.courts.CourtListParams
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Metadata about courts in the CourtListener database. */
interface CourtServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtServiceAsync

    /** Retrieve a single court */
    suspend fun retrieve(
        id: String,
        params: CourtRetrieveParams = CourtRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Court = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CourtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Court

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Court =
        retrieve(id, CourtRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of courts. Results can generally be cached as court data changes
     * infrequently.
     */
    suspend fun list(
        params: CourtListParams = CourtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CourtListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CourtListPageAsync =
        list(CourtListParams.none(), requestOptions)

    /** A view of [CourtServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CourtServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /courts/{id}/`, but is otherwise the same as
         * [CourtServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: CourtRetrieveParams = CourtRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Court> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CourtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Court>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Court> =
            retrieve(id, CourtRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /courts/`, but is otherwise the same as
         * [CourtServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CourtListParams = CourtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CourtListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CourtListPageAsync> =
            list(CourtListParams.none(), requestOptions)
    }
}
