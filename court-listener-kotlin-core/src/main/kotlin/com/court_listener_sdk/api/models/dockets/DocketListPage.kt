// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.dockets

import com.court_listener_sdk.api.core.AutoPager
import com.court_listener_sdk.api.core.Page
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.blocking.DocketService
import java.util.Objects

/** @see DocketService.list */
class DocketListPage
private constructor(
    private val service: DocketService,
    private val params: DocketListParams,
    private val response: DocketListPageResponse,
) : Page<Docket> {

    /**
     * Delegates to [DocketListPageResponse], but gracefully handles missing data.
     *
     * @see DocketListPageResponse.results
     */
    fun results(): List<Docket> = response._results().getNullable("results") ?: emptyList()

    /**
     * Delegates to [DocketListPageResponse], but gracefully handles missing data.
     *
     * @see DocketListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    override fun items(): List<Docket> = results()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DocketListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): DocketListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Docket> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DocketListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocketListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocketListPage].
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

    /** A builder for [DocketListPage]. */
    class Builder internal constructor() {

        private var service: DocketService? = null
        private var params: DocketListParams? = null
        private var response: DocketListPageResponse? = null

        internal fun from(docketListPage: DocketListPage) = apply {
            service = docketListPage.service
            params = docketListPage.params
            response = docketListPage.response
        }

        fun service(service: DocketService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocketListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocketListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocketListPage].
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
        fun build(): DocketListPage =
            DocketListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocketListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DocketListPage{service=$service, params=$params, response=$response}"
}
