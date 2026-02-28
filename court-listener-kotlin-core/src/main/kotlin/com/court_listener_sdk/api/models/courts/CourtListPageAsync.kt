// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.AutoPagerAsync
import com.court_listener_sdk.api.core.PageAsync
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.async.CourtServiceAsync
import java.util.Objects

/** @see CourtServiceAsync.list */
class CourtListPageAsync
private constructor(
    private val service: CourtServiceAsync,
    private val params: CourtListParams,
    private val response: CourtListPageResponse,
) : PageAsync<Court> {

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

    override suspend fun nextPage(): CourtListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Court> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CourtListParams = params

    /** The response that this page was parsed from. */
    fun response(): CourtListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CourtListPageAsync].
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

    /** A builder for [CourtListPageAsync]. */
    class Builder internal constructor() {

        private var service: CourtServiceAsync? = null
        private var params: CourtListParams? = null
        private var response: CourtListPageResponse? = null

        internal fun from(courtListPageAsync: CourtListPageAsync) = apply {
            service = courtListPageAsync.service
            params = courtListPageAsync.params
            response = courtListPageAsync.response
        }

        fun service(service: CourtServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CourtListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CourtListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CourtListPageAsync].
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
        fun build(): CourtListPageAsync =
            CourtListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CourtListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CourtListPageAsync{service=$service, params=$params, response=$response}"
}
