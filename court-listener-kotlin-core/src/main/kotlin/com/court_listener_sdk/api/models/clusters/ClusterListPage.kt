// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.AutoPager
import com.court_listener_sdk.api.core.Page
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.blocking.ClusterService
import java.util.Objects

/** @see ClusterService.list */
class ClusterListPage
private constructor(
    private val service: ClusterService,
    private val params: ClusterListParams,
    private val response: ClusterListPageResponse,
) : Page<Cluster> {

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

    override fun nextPage(): ClusterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Cluster> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ClusterListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClusterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClusterListPage].
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

    /** A builder for [ClusterListPage]. */
    class Builder internal constructor() {

        private var service: ClusterService? = null
        private var params: ClusterListParams? = null
        private var response: ClusterListPageResponse? = null

        internal fun from(clusterListPage: ClusterListPage) = apply {
            service = clusterListPage.service
            params = clusterListPage.params
            response = clusterListPage.response
        }

        fun service(service: ClusterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ClusterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClusterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClusterListPage].
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
        fun build(): ClusterListPage =
            ClusterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ClusterListPage{service=$service, params=$params, response=$response}"
}
