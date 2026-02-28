// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.opinions.Opinion
import com.court_listener_sdk.api.models.opinions.OpinionListPageAsync
import com.court_listener_sdk.api.models.opinions.OpinionListParams
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Individual judicial opinions with full text and metadata. */
interface OpinionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpinionServiceAsync

    /**
     * Look up an opinion by its ID. Note that opinion IDs do **not** reliably match cluster IDs. If
     * you have a CourtListener case URL, use the cluster API to look it up.
     */
    suspend fun retrieve(
        id: Long,
        params: OpinionRetrieveParams = OpinionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Opinion = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: OpinionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Opinion

    /** @see retrieve */
    suspend fun retrieve(id: Long, requestOptions: RequestOptions): Opinion =
        retrieve(id, OpinionRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of opinions. Each opinion contains the text of a judicial decision
     * and metadata about the authoring judge.
     *
     * **Tip**: Prefer the `html_with_citations` field for opinion text — it contains the raw text
     * with identified and linked citations, and is the field used on the CourtListener website.
     *
     * Use `fields` / `omit` parameters to exclude large text fields you don't need.
     */
    suspend fun list(
        params: OpinionListParams = OpinionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpinionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): OpinionListPageAsync =
        list(OpinionListParams.none(), requestOptions)

    /**
     * A view of [OpinionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OpinionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /opinions/{id}/`, but is otherwise the same as
         * [OpinionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: Long,
            params: OpinionRetrieveParams = OpinionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Opinion> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: OpinionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Opinion>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Opinion> =
            retrieve(id, OpinionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /opinions/`, but is otherwise the same as
         * [OpinionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: OpinionListParams = OpinionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpinionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<OpinionListPageAsync> =
            list(OpinionListParams.none(), requestOptions)
    }
}
