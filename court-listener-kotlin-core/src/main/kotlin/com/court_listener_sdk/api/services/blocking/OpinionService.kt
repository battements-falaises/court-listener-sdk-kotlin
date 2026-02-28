// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.core.ClientOptions
import com.court_listener_sdk.api.core.RequestOptions
import com.court_listener_sdk.api.core.http.HttpResponseFor
import com.court_listener_sdk.api.models.opinions.Opinion
import com.court_listener_sdk.api.models.opinions.OpinionListPage
import com.court_listener_sdk.api.models.opinions.OpinionListParams
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/** Individual judicial opinions with full text and metadata. */
interface OpinionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpinionService

    /**
     * Look up an opinion by its ID. Note that opinion IDs do **not** reliably match cluster IDs. If
     * you have a CourtListener case URL, use the cluster API to look it up.
     */
    fun retrieve(
        id: Long,
        params: OpinionRetrieveParams = OpinionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Opinion = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: OpinionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Opinion

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): Opinion =
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
    fun list(
        params: OpinionListParams = OpinionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpinionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): OpinionListPage =
        list(OpinionListParams.none(), requestOptions)

    /** A view of [OpinionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpinionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /opinions/{id}/`, but is otherwise the same as
         * [OpinionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: OpinionRetrieveParams = OpinionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Opinion> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OpinionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Opinion>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Opinion> =
            retrieve(id, OpinionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /opinions/`, but is otherwise the same as
         * [OpinionService.list].
         */
        @MustBeClosed
        fun list(
            params: OpinionListParams = OpinionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpinionListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OpinionListPage> =
            list(OpinionListParams.none(), requestOptions)
    }
}
