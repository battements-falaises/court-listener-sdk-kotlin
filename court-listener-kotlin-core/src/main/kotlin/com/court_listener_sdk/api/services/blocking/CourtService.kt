// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.courts.Court
import com.court_listener_sdk.api.models.courts.CourtListPage
import com.court_listener_sdk.api.models.courts.CourtListParams
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Metadata about courts in the CourtListener database. */
interface CourtService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtService

    /** Retrieve a single court */
    fun retrieve(
        id: String,
        params: CourtRetrieveParams = CourtRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Court = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CourtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Court

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Court =
        retrieve(id, CourtRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of courts. Results can generally be cached as court data changes
     * infrequently.
     */
    fun list(
        params: CourtListParams = CourtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CourtListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CourtListPage =
        list(CourtListParams.none(), requestOptions)

    /** A view of [CourtService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CourtService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /courts/{id}/`, but is otherwise the same as
         * [CourtService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CourtRetrieveParams = CourtRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Court> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CourtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Court>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Court> =
            retrieve(id, CourtRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /courts/`, but is otherwise the same as
         * [CourtService.list].
         */
        @MustBeClosed
        fun list(
            params: CourtListParams = CourtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CourtListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CourtListPage> =
            list(CourtListParams.none(), requestOptions)
    }
}
