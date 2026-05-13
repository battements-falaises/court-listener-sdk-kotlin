// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.dockets

import com.court_listener_sdk.api.core.Enum
import com.court_listener_sdk.api.core.JsonField
import com.court_listener_sdk.api.core.Params
import com.court_listener_sdk.api.core.http.Headers
import com.court_listener_sdk.api.core.http.QueryParams
import com.court_listener_sdk.api.errors.CourtListenerInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * Returns a paginated list of dockets. Dockets sit at the top of the case law hierarchy, linking to
 * clusters of opinions.
 *
 * **Note**: The response does not inline docket entries, parties, or attorneys (this does not
 * scale). Use the PACER/RECAP APIs for those.
 */
class DocketListParams
private constructor(
    private val id: Long?,
    private val blocked: Boolean?,
    private val caseName: String?,
    private val cause: String?,
    private val count: Count?,
    private val court: String?,
    private val queryCourtJurisdiction1: String?,
    private val queryCourtJurisdiction2: String?,
    private val cursor: String?,
    private val dateCreated: OffsetDateTime?,
    private val dateCreatedGte: OffsetDateTime?,
    private val dateCreatedLte: OffsetDateTime?,
    private val dateFiled: LocalDate?,
    private val dateFiledGte: LocalDate?,
    private val dateFiledLte: LocalDate?,
    private val dateModified: OffsetDateTime?,
    private val dateModifiedGte: OffsetDateTime?,
    private val dateModifiedLte: OffsetDateTime?,
    private val dateTerminated: LocalDate?,
    private val dateTerminatedGte: LocalDate?,
    private val dateTerminatedLte: LocalDate?,
    private val docketNumber: String?,
    private val fields: String?,
    private val format: Format?,
    private val idGt: Long?,
    private val idGte: Long?,
    private val idLt: Long?,
    private val idLte: Long?,
    private val idRange: String?,
    private val natureOfSuit: String?,
    private val omit: String?,
    private val orderBy: String?,
    private val page: Long?,
    private val source: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by docket ID (exact). */
    fun id(): Long? = id

    /** Filter for blocked/unblocked dockets. */
    fun blocked(): Boolean? = blocked

    /** Filter by case name. */
    fun caseName(): String? = caseName

    /** Filter by cause. */
    fun cause(): String? = cause

    /**
     * Set to `on` to return only the total count of matching items without result data. When
     * enabled, pagination parameters are ignored.
     */
    fun count(): Count? = count

    /**
     * Filter by court identifier (e.g. `scotus`). Supports related court filters via `court__`
     * prefix.
     */
    fun court(): String? = court

    /** Filter by the court's jurisdiction type (e.g. `F`, `FD`, `S`). */
    fun queryCourtJurisdiction1(): String? = queryCourtJurisdiction1

    /** Exclude dockets from this jurisdiction type. */
    fun queryCourtJurisdiction2(): String? = queryCourtJurisdiction2

    /**
     * Cursor token for deep pagination. Returned in the `next` / `previous` fields of paginated
     * responses. Available when ordering by `id`, `date_modified`, or `date_created`.
     */
    fun cursor(): String? = cursor

    /** Filter by exact creation date. */
    fun dateCreated(): OffsetDateTime? = dateCreated

    /** Created on or after this date. */
    fun dateCreatedGte(): OffsetDateTime? = dateCreatedGte

    /** Created on or before this date. */
    fun dateCreatedLte(): OffsetDateTime? = dateCreatedLte

    /** Filter by filing date. */
    fun dateFiled(): LocalDate? = dateFiled

    /** Filed on or after this date. */
    fun dateFiledGte(): LocalDate? = dateFiledGte

    /** Filed on or before this date. */
    fun dateFiledLte(): LocalDate? = dateFiledLte

    /** Filter by exact modification date. */
    fun dateModified(): OffsetDateTime? = dateModified

    /** Modified on or after this date. */
    fun dateModifiedGte(): OffsetDateTime? = dateModifiedGte

    /** Modified on or before this date. */
    fun dateModifiedLte(): OffsetDateTime? = dateModifiedLte

    /** Filter by termination date. */
    fun dateTerminated(): LocalDate? = dateTerminated

    fun dateTerminatedGte(): LocalDate? = dateTerminatedGte

    fun dateTerminatedLte(): LocalDate? = dateTerminatedLte

    /** Filter by exact docket number (e.g. `23A994`). */
    fun docketNumber(): String? = docketNumber

    /**
     * Comma-separated list of fields to include. Supports nested fields via double-underscore
     * notation (e.g. `educations__id`).
     */
    fun fields(): String? = fields

    /** Response serialization format. JSON is default when no `Accept` header is provided. */
    fun format(): Format? = format

    /** Docket IDs greater than this value. */
    fun idGt(): Long? = idGt

    /** Docket IDs greater than or equal to this value. */
    fun idGte(): Long? = idGte

    /** Docket IDs less than this value. */
    fun idLt(): Long? = idLt

    /** Docket IDs less than or equal to this value. */
    fun idLte(): Long? = idLte

    /** Docket IDs within an inclusive range (e.g. `500,1000`). */
    fun idRange(): String? = idRange

    /** Filter by nature of suit. */
    fun natureOfSuit(): String? = natureOfSuit

    /**
     * Comma-separated list of fields to exclude. Supports nested fields via double-underscore
     * notation.
     */
    fun omit(): String? = omit

    /**
     * Comma-separated list of fields to order by. Prefix with `-` for descending order. Use a
     * secondary field as a tie-breaker for deterministic ordering (e.g. `date_filed,id`).
     */
    fun orderBy(): String? = orderBy

    /** Page number for standard pagination (limited to 100 pages). */
    fun page(): Long? = page

    /** Filter by docket source. */
    fun source(): Long? = source

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DocketListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocketListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DocketListParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var blocked: Boolean? = null
        private var caseName: String? = null
        private var cause: String? = null
        private var count: Count? = null
        private var court: String? = null
        private var queryCourtJurisdiction1: String? = null
        private var queryCourtJurisdiction2: String? = null
        private var cursor: String? = null
        private var dateCreated: OffsetDateTime? = null
        private var dateCreatedGte: OffsetDateTime? = null
        private var dateCreatedLte: OffsetDateTime? = null
        private var dateFiled: LocalDate? = null
        private var dateFiledGte: LocalDate? = null
        private var dateFiledLte: LocalDate? = null
        private var dateModified: OffsetDateTime? = null
        private var dateModifiedGte: OffsetDateTime? = null
        private var dateModifiedLte: OffsetDateTime? = null
        private var dateTerminated: LocalDate? = null
        private var dateTerminatedGte: LocalDate? = null
        private var dateTerminatedLte: LocalDate? = null
        private var docketNumber: String? = null
        private var fields: String? = null
        private var format: Format? = null
        private var idGt: Long? = null
        private var idGte: Long? = null
        private var idLt: Long? = null
        private var idLte: Long? = null
        private var idRange: String? = null
        private var natureOfSuit: String? = null
        private var omit: String? = null
        private var orderBy: String? = null
        private var page: Long? = null
        private var source: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(docketListParams: DocketListParams) = apply {
            id = docketListParams.id
            blocked = docketListParams.blocked
            caseName = docketListParams.caseName
            cause = docketListParams.cause
            count = docketListParams.count
            court = docketListParams.court
            queryCourtJurisdiction1 = docketListParams.queryCourtJurisdiction1
            queryCourtJurisdiction2 = docketListParams.queryCourtJurisdiction2
            cursor = docketListParams.cursor
            dateCreated = docketListParams.dateCreated
            dateCreatedGte = docketListParams.dateCreatedGte
            dateCreatedLte = docketListParams.dateCreatedLte
            dateFiled = docketListParams.dateFiled
            dateFiledGte = docketListParams.dateFiledGte
            dateFiledLte = docketListParams.dateFiledLte
            dateModified = docketListParams.dateModified
            dateModifiedGte = docketListParams.dateModifiedGte
            dateModifiedLte = docketListParams.dateModifiedLte
            dateTerminated = docketListParams.dateTerminated
            dateTerminatedGte = docketListParams.dateTerminatedGte
            dateTerminatedLte = docketListParams.dateTerminatedLte
            docketNumber = docketListParams.docketNumber
            fields = docketListParams.fields
            format = docketListParams.format
            idGt = docketListParams.idGt
            idGte = docketListParams.idGte
            idLt = docketListParams.idLt
            idLte = docketListParams.idLte
            idRange = docketListParams.idRange
            natureOfSuit = docketListParams.natureOfSuit
            omit = docketListParams.omit
            orderBy = docketListParams.orderBy
            page = docketListParams.page
            source = docketListParams.source
            additionalHeaders = docketListParams.additionalHeaders.toBuilder()
            additionalQueryParams = docketListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by docket ID (exact). */
        fun id(id: Long?) = apply { this.id = id }

        /**
         * Alias for [Builder.id].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun id(id: Long) = id(id as Long?)

        /** Filter for blocked/unblocked dockets. */
        fun blocked(blocked: Boolean?) = apply { this.blocked = blocked }

        /**
         * Alias for [Builder.blocked].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

        /** Filter by case name. */
        fun caseName(caseName: String?) = apply { this.caseName = caseName }

        /** Filter by cause. */
        fun cause(cause: String?) = apply { this.cause = cause }

        /**
         * Set to `on` to return only the total count of matching items without result data. When
         * enabled, pagination parameters are ignored.
         */
        fun count(count: Count?) = apply { this.count = count }

        /**
         * Filter by court identifier (e.g. `scotus`). Supports related court filters via `court__`
         * prefix.
         */
        fun court(court: String?) = apply { this.court = court }

        /** Filter by the court's jurisdiction type (e.g. `F`, `FD`, `S`). */
        fun queryCourtJurisdiction1(queryCourtJurisdiction1: String?) = apply {
            this.queryCourtJurisdiction1 = queryCourtJurisdiction1
        }

        /** Exclude dockets from this jurisdiction type. */
        fun queryCourtJurisdiction2(queryCourtJurisdiction2: String?) = apply {
            this.queryCourtJurisdiction2 = queryCourtJurisdiction2
        }

        /**
         * Cursor token for deep pagination. Returned in the `next` / `previous` fields of paginated
         * responses. Available when ordering by `id`, `date_modified`, or `date_created`.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Filter by exact creation date. */
        fun dateCreated(dateCreated: OffsetDateTime?) = apply { this.dateCreated = dateCreated }

        /** Created on or after this date. */
        fun dateCreatedGte(dateCreatedGte: OffsetDateTime?) = apply {
            this.dateCreatedGte = dateCreatedGte
        }

        /** Created on or before this date. */
        fun dateCreatedLte(dateCreatedLte: OffsetDateTime?) = apply {
            this.dateCreatedLte = dateCreatedLte
        }

        /** Filter by filing date. */
        fun dateFiled(dateFiled: LocalDate?) = apply { this.dateFiled = dateFiled }

        /** Filed on or after this date. */
        fun dateFiledGte(dateFiledGte: LocalDate?) = apply { this.dateFiledGte = dateFiledGte }

        /** Filed on or before this date. */
        fun dateFiledLte(dateFiledLte: LocalDate?) = apply { this.dateFiledLte = dateFiledLte }

        /** Filter by exact modification date. */
        fun dateModified(dateModified: OffsetDateTime?) = apply { this.dateModified = dateModified }

        /** Modified on or after this date. */
        fun dateModifiedGte(dateModifiedGte: OffsetDateTime?) = apply {
            this.dateModifiedGte = dateModifiedGte
        }

        /** Modified on or before this date. */
        fun dateModifiedLte(dateModifiedLte: OffsetDateTime?) = apply {
            this.dateModifiedLte = dateModifiedLte
        }

        /** Filter by termination date. */
        fun dateTerminated(dateTerminated: LocalDate?) = apply {
            this.dateTerminated = dateTerminated
        }

        fun dateTerminatedGte(dateTerminatedGte: LocalDate?) = apply {
            this.dateTerminatedGte = dateTerminatedGte
        }

        fun dateTerminatedLte(dateTerminatedLte: LocalDate?) = apply {
            this.dateTerminatedLte = dateTerminatedLte
        }

        /** Filter by exact docket number (e.g. `23A994`). */
        fun docketNumber(docketNumber: String?) = apply { this.docketNumber = docketNumber }

        /**
         * Comma-separated list of fields to include. Supports nested fields via double-underscore
         * notation (e.g. `educations__id`).
         */
        fun fields(fields: String?) = apply { this.fields = fields }

        /** Response serialization format. JSON is default when no `Accept` header is provided. */
        fun format(format: Format?) = apply { this.format = format }

        /** Docket IDs greater than this value. */
        fun idGt(idGt: Long?) = apply { this.idGt = idGt }

        /**
         * Alias for [Builder.idGt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGt(idGt: Long) = idGt(idGt as Long?)

        /** Docket IDs greater than or equal to this value. */
        fun idGte(idGte: Long?) = apply { this.idGte = idGte }

        /**
         * Alias for [Builder.idGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGte(idGte: Long) = idGte(idGte as Long?)

        /** Docket IDs less than this value. */
        fun idLt(idLt: Long?) = apply { this.idLt = idLt }

        /**
         * Alias for [Builder.idLt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idLt(idLt: Long) = idLt(idLt as Long?)

        /** Docket IDs less than or equal to this value. */
        fun idLte(idLte: Long?) = apply { this.idLte = idLte }

        /**
         * Alias for [Builder.idLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idLte(idLte: Long) = idLte(idLte as Long?)

        /** Docket IDs within an inclusive range (e.g. `500,1000`). */
        fun idRange(idRange: String?) = apply { this.idRange = idRange }

        /** Filter by nature of suit. */
        fun natureOfSuit(natureOfSuit: String?) = apply { this.natureOfSuit = natureOfSuit }

        /**
         * Comma-separated list of fields to exclude. Supports nested fields via double-underscore
         * notation.
         */
        fun omit(omit: String?) = apply { this.omit = omit }

        /**
         * Comma-separated list of fields to order by. Prefix with `-` for descending order. Use a
         * secondary field as a tie-breaker for deterministic ordering (e.g. `date_filed,id`).
         */
        fun orderBy(orderBy: String?) = apply { this.orderBy = orderBy }

        /** Page number for standard pagination (limited to 100 pages). */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Filter by docket source. */
        fun source(source: Long?) = apply { this.source = source }

        /**
         * Alias for [Builder.source].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun source(source: Long) = source(source as Long?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DocketListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocketListParams =
            DocketListParams(
                id,
                blocked,
                caseName,
                cause,
                count,
                court,
                queryCourtJurisdiction1,
                queryCourtJurisdiction2,
                cursor,
                dateCreated,
                dateCreatedGte,
                dateCreatedLte,
                dateFiled,
                dateFiledGte,
                dateFiledLte,
                dateModified,
                dateModifiedGte,
                dateModifiedLte,
                dateTerminated,
                dateTerminatedGte,
                dateTerminatedLte,
                docketNumber,
                fields,
                format,
                idGt,
                idGte,
                idLt,
                idLte,
                idRange,
                natureOfSuit,
                omit,
                orderBy,
                page,
                source,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.toString()) }
                blocked?.let { put("blocked", it.toString()) }
                caseName?.let { put("case_name", it) }
                cause?.let { put("cause", it) }
                count?.let { put("count", it.toString()) }
                court?.let { put("court", it) }
                queryCourtJurisdiction1?.let { put("court__jurisdiction", it) }
                queryCourtJurisdiction2?.let { put("court__jurisdiction!", it) }
                cursor?.let { put("cursor", it) }
                dateCreated?.let {
                    put("date_created", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateCreatedGte?.let {
                    put("date_created__gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateCreatedLte?.let {
                    put("date_created__lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateFiled?.let { put("date_filed", it.toString()) }
                dateFiledGte?.let { put("date_filed__gte", it.toString()) }
                dateFiledLte?.let { put("date_filed__lte", it.toString()) }
                dateModified?.let {
                    put("date_modified", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateModifiedGte?.let {
                    put("date_modified__gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateModifiedLte?.let {
                    put("date_modified__lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateTerminated?.let { put("date_terminated", it.toString()) }
                dateTerminatedGte?.let { put("date_terminated__gte", it.toString()) }
                dateTerminatedLte?.let { put("date_terminated__lte", it.toString()) }
                docketNumber?.let { put("docket_number", it) }
                fields?.let { put("fields", it) }
                format?.let { put("format", it.toString()) }
                idGt?.let { put("id__gt", it.toString()) }
                idGte?.let { put("id__gte", it.toString()) }
                idLt?.let { put("id__lt", it.toString()) }
                idLte?.let { put("id__lte", it.toString()) }
                idRange?.let { put("id__range", it) }
                natureOfSuit?.let { put("nature_of_suit", it) }
                omit?.let { put("omit", it) }
                orderBy?.let { put("order_by", it) }
                page?.let { put("page", it.toString()) }
                source?.let { put("source", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Set to `on` to return only the total count of matching items without result data. When
     * enabled, pagination parameters are ignored.
     */
    class Count @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ON = of("on")

            fun of(value: String) = Count(JsonField.of(value))
        }

        /** An enum containing [Count]'s known values. */
        enum class Known {
            ON
        }

        /**
         * An enum containing [Count]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Count] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ON,
            /** An enum member indicating that [Count] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ON -> Value.ON
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourtListenerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ON -> Known.ON
                else -> throw CourtListenerInvalidDataException("Unknown Count: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourtListenerInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw CourtListenerInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourtListenerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Count = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourtListenerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Count && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Response serialization format. JSON is default when no `Accept` header is provided. */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val JSON = of("json")

            val XML = of("xml")

            val HTML = of("html")

            fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            JSON,
            XML,
            HTML,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            XML,
            HTML,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                XML -> Value.XML
                HTML -> Value.HTML
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourtListenerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                XML -> Known.XML
                HTML -> Known.HTML
                else -> throw CourtListenerInvalidDataException("Unknown Format: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourtListenerInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw CourtListenerInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourtListenerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Format = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourtListenerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocketListParams &&
            id == other.id &&
            blocked == other.blocked &&
            caseName == other.caseName &&
            cause == other.cause &&
            count == other.count &&
            court == other.court &&
            queryCourtJurisdiction1 == other.queryCourtJurisdiction1 &&
            queryCourtJurisdiction2 == other.queryCourtJurisdiction2 &&
            cursor == other.cursor &&
            dateCreated == other.dateCreated &&
            dateCreatedGte == other.dateCreatedGte &&
            dateCreatedLte == other.dateCreatedLte &&
            dateFiled == other.dateFiled &&
            dateFiledGte == other.dateFiledGte &&
            dateFiledLte == other.dateFiledLte &&
            dateModified == other.dateModified &&
            dateModifiedGte == other.dateModifiedGte &&
            dateModifiedLte == other.dateModifiedLte &&
            dateTerminated == other.dateTerminated &&
            dateTerminatedGte == other.dateTerminatedGte &&
            dateTerminatedLte == other.dateTerminatedLte &&
            docketNumber == other.docketNumber &&
            fields == other.fields &&
            format == other.format &&
            idGt == other.idGt &&
            idGte == other.idGte &&
            idLt == other.idLt &&
            idLte == other.idLte &&
            idRange == other.idRange &&
            natureOfSuit == other.natureOfSuit &&
            omit == other.omit &&
            orderBy == other.orderBy &&
            page == other.page &&
            source == other.source &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            blocked,
            caseName,
            cause,
            count,
            court,
            queryCourtJurisdiction1,
            queryCourtJurisdiction2,
            cursor,
            dateCreated,
            dateCreatedGte,
            dateCreatedLte,
            dateFiled,
            dateFiledGte,
            dateFiledLte,
            dateModified,
            dateModifiedGte,
            dateModifiedLte,
            dateTerminated,
            dateTerminatedGte,
            dateTerminatedLte,
            docketNumber,
            fields,
            format,
            idGt,
            idGte,
            idLt,
            idLte,
            idRange,
            natureOfSuit,
            omit,
            orderBy,
            page,
            source,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DocketListParams{id=$id, blocked=$blocked, caseName=$caseName, cause=$cause, count=$count, court=$court, queryCourtJurisdiction1=$queryCourtJurisdiction1, queryCourtJurisdiction2=$queryCourtJurisdiction2, cursor=$cursor, dateCreated=$dateCreated, dateCreatedGte=$dateCreatedGte, dateCreatedLte=$dateCreatedLte, dateFiled=$dateFiled, dateFiledGte=$dateFiledGte, dateFiledLte=$dateFiledLte, dateModified=$dateModified, dateModifiedGte=$dateModifiedGte, dateModifiedLte=$dateModifiedLte, dateTerminated=$dateTerminated, dateTerminatedGte=$dateTerminatedGte, dateTerminatedLte=$dateTerminatedLte, docketNumber=$docketNumber, fields=$fields, format=$format, idGt=$idGt, idGte=$idGte, idLt=$idLt, idLte=$idLte, idRange=$idRange, natureOfSuit=$natureOfSuit, omit=$omit, orderBy=$orderBy, page=$page, source=$source, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
