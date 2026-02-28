// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.AutoPager
import com.court_listener_sdk.api.core.Page
import com.court_listener_sdk.api.core.checkRequired
import com.court_listener_sdk.api.services.blocking.OpinionService
import java.util.Objects

/** @see OpinionService.list */
class OpinionListPage
private constructor(
    private val service: OpinionService,
    private val params: OpinionListParams,
    private val response: OpinionListPageResponse,
) : Page<Opinion> {

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

    override fun nextPage(): OpinionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Opinion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OpinionListParams = params

    /** The response that this page was parsed from. */
    fun response(): OpinionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OpinionListPage].
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

    /** A builder for [OpinionListPage]. */
    class Builder internal constructor() {

        private var service: OpinionService? = null
        private var params: OpinionListParams? = null
        private var response: OpinionListPageResponse? = null

        internal fun from(opinionListPage: OpinionListPage) = apply {
            service = opinionListPage.service
            params = opinionListPage.params
            response = opinionListPage.response
        }

        fun service(service: OpinionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OpinionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OpinionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OpinionListPage].
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
        fun build(): OpinionListPage =
            OpinionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpinionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OpinionListPage{service=$service, params=$params, response=$response}"
}
