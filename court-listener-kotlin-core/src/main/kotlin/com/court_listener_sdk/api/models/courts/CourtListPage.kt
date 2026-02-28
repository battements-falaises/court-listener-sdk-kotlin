// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.AutoPager
import com.court_listener_sdk.api.core.Page
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.blocking.CourtService
import java.util.Objects

/** @see CourtService.list */
class CourtListPage
private constructor(
    private val service: CourtService,
    private val params: CourtListParams,
    private val response: CourtListPageResponse,
) : Page<Court> {

    /**
     * Delegates to [CourtListPageResponse], but gracefully handles missing data.
     *
     * @see CourtListPageResponse.results
     */
    fun results(): List<Court> = response._results().getNullable("results") ?: emptyList()

    /**
     * Delegates to [CourtListPageResponse], but gracefully handles missing data.
     *
     * @see CourtListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    override fun items(): List<Court> = results()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CourtListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CourtListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Court> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CourtListParams = params

    /** The response that this page was parsed from. */
    fun response(): CourtListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CourtListPage].
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

    /** A builder for [CourtListPage]. */
    class Builder internal constructor() {

        private var service: CourtService? = null
        private var params: CourtListParams? = null
        private var response: CourtListPageResponse? = null

        internal fun from(courtListPage: CourtListPage) = apply {
            service = courtListPage.service
            params = courtListPage.params
            response = courtListPage.response
        }

        fun service(service: CourtService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CourtListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CourtListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CourtListPage].
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
        fun build(): CourtListPage =
            CourtListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CourtListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CourtListPage{service=$service, params=$params, response=$response}"
}
