// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.AutoPagerAsync
import com.court_listener_sdk.api.core.PageAsync
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.async.ClusterServiceAsync
import java.util.Objects

/** @see ClusterServiceAsync.list */
class ClusterListPageAsync
private constructor(
    private val service: ClusterServiceAsync,
    private val params: ClusterListParams,
    private val response: ClusterListPageResponse,
) : PageAsync<Cluster> {

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.results
     */
    fun results(): List<Cluster> = response._results().getNullable("results") ?: emptyList()

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    override fun items(): List<Cluster> = results()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ClusterListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): ClusterListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Cluster> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ClusterListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClusterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClusterListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ClusterListPageAsync]. */
    class Builder internal constructor() {

        private var service: ClusterServiceAsync? = null
        private var params: ClusterListParams? = null
        private var response: ClusterListPageResponse? = null

        internal fun from(clusterListPageAsync: ClusterListPageAsync) = apply {
            service = clusterListPageAsync.service
            params = clusterListPageAsync.params
            response = clusterListPageAsync.response
        }

        fun service(service: ClusterServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ClusterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClusterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClusterListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClusterListPageAsync =
            ClusterListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ClusterListPageAsync{service=$service, params=$params, response=$response}"
}
