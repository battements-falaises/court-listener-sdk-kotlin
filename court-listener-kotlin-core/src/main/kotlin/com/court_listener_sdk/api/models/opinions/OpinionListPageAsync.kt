// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.AutoPagerAsync
import com.court_listener_sdk.api.core.PageAsync
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.async.OpinionServiceAsync
import java.util.Objects

/** @see OpinionServiceAsync.list */
class OpinionListPageAsync
private constructor(
    private val service: OpinionServiceAsync,
    private val params: OpinionListParams,
    private val response: OpinionListPageResponse,
) : PageAsync<Opinion> {

    /**
     * Delegates to [OpinionListPageResponse], but gracefully handles missing data.
     *
     * @see OpinionListPageResponse.results
     */
    fun results(): List<Opinion> = response._results().getNullable("results") ?: emptyList()

    /**
     * Delegates to [OpinionListPageResponse], but gracefully handles missing data.
     *
     * @see OpinionListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    override fun items(): List<Opinion> = results()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OpinionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): OpinionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Opinion> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OpinionListParams = params

    /** The response that this page was parsed from. */
    fun response(): OpinionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OpinionListPageAsync].
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

    /** A builder for [OpinionListPageAsync]. */
    class Builder internal constructor() {

        private var service: OpinionServiceAsync? = null
        private var params: OpinionListParams? = null
        private var response: OpinionListPageResponse? = null

        internal fun from(opinionListPageAsync: OpinionListPageAsync) = apply {
            service = opinionListPageAsync.service
            params = opinionListPageAsync.params
            response = opinionListPageAsync.response
        }

        fun service(service: OpinionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OpinionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OpinionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OpinionListPageAsync].
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
        fun build(): OpinionListPageAsync =
            OpinionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpinionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OpinionListPageAsync{service=$service, params=$params, response=$response}"
}
