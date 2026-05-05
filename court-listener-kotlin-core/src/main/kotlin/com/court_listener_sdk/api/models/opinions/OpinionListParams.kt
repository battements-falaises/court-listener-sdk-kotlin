// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.Enum
import com.court_listener_sdk.api.core.JsonField
import com.court_listener_sdk.api.core.Params
import com.court_listener_sdk.api.core.http.Headers
import com.court_listener_sdk.api.core.http.QueryParams
import com.court_listener_sdk.api.errors.CourtListenerInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * Returns a paginated list of opinions. Each opinion contains the text of a judicial decision and
 * metadata about the authoring judge.
 *
 * **Tip**: Prefer the `html_with_citations` field for opinion text — it contains the raw text with
 * identified and linked citations, and is the field used on the CourtListener website.
 *
 * Use `fields` / `omit` parameters to exclude large text fields you don't need.
 */
class OpinionListParams
private constructor(
    private val id: Long?,
    private val citedOpinion: Long?,
    private val cluster: Long?,
    private val clusterDocketCourt: String?,
    private val clusterDocketDocketNumber: String?,
    private val count: Count?,
    private val cursor: String?,
    private val dateCreated: OffsetDateTime?,
    private val dateCreatedGte: OffsetDateTime?,
    private val dateCreatedLte: OffsetDateTime?,
    private val dateModified: OffsetDateTime?,
    private val dateModifiedGte: OffsetDateTime?,
    private val dateModifiedLte: OffsetDateTime?,
    private val fields: String?,
    private val format: Format?,
    private val idGt: Long?,
    private val idGte: Long?,
    private val idLt: Long?,
    private val idLte: Long?,
    private val idRange: String?,
    private val omit: String?,
    private val orderBy: String?,
    private val page: Long?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by opinion ID. */
    fun id(): Long? = id

    /** Filter opinions that cite this opinion ID. */
    fun citedOpinion(): Long? = citedOpinion

    /** Filter by parent cluster ID. */
    fun cluster(): Long? = cluster

    /** Filter by court via the cluster's docket (e.g. `scotus`). */
    fun clusterDocketCourt(): String? = clusterDocketCourt

    /** Filter by docket number via the cluster's docket. */
    fun clusterDocketDocketNumber(): String? = clusterDocketDocketNumber

    /**
     * Set to `on` to return only the total count of matching items without result data. When
     * enabled, pagination parameters are ignored.
     */
    fun count(): Count? = count

    /**
     * Cursor token for deep pagination. Returned in the `next` / `previous` fields of paginated
     * responses. Available when ordering by `id`, `date_modified`, or `date_created`.
     */
    fun cursor(): String? = cursor

    fun dateCreated(): OffsetDateTime? = dateCreated

    fun dateCreatedGte(): OffsetDateTime? = dateCreatedGte

    fun dateCreatedLte(): OffsetDateTime? = dateCreatedLte

    fun dateModified(): OffsetDateTime? = dateModified

    fun dateModifiedGte(): OffsetDateTime? = dateModifiedGte

    fun dateModifiedLte(): OffsetDateTime? = dateModifiedLte

    /**
     * Comma-separated list of fields to include. Supports nested fields via double-underscore
     * notation (e.g. `educations__id`).
     */
    fun fields(): String? = fields

    /** Response serialization format. JSON is default when no `Accept` header is provided. */
    fun format(): Format? = format

    fun idGt(): Long? = idGt

    fun idGte(): Long? = idGte

    fun idLt(): Long? = idLt

    fun idLte(): Long? = idLte

    fun idRange(): String? = idRange

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

    /**
     * Filter by opinion type. Values are prefixed with numbers for sort order. Common types include
     * combined opinion, lead opinion, concurrence, dissent, etc.
     */
    fun type(): String? = type

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): OpinionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OpinionListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [OpinionListParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var citedOpinion: Long? = null
        private var cluster: Long? = null
        private var clusterDocketCourt: String? = null
        private var clusterDocketDocketNumber: String? = null
        private var count: Count? = null
        private var cursor: String? = null
        private var dateCreated: OffsetDateTime? = null
        private var dateCreatedGte: OffsetDateTime? = null
        private var dateCreatedLte: OffsetDateTime? = null
        private var dateModified: OffsetDateTime? = null
        private var dateModifiedGte: OffsetDateTime? = null
        private var dateModifiedLte: OffsetDateTime? = null
        private var fields: String? = null
        private var format: Format? = null
        private var idGt: Long? = null
        private var idGte: Long? = null
        private var idLt: Long? = null
        private var idLte: Long? = null
        private var idRange: String? = null
        private var omit: String? = null
        private var orderBy: String? = null
        private var page: Long? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(opinionListParams: OpinionListParams) = apply {
            id = opinionListParams.id
            citedOpinion = opinionListParams.citedOpinion
            cluster = opinionListParams.cluster
            clusterDocketCourt = opinionListParams.clusterDocketCourt
            clusterDocketDocketNumber = opinionListParams.clusterDocketDocketNumber
            count = opinionListParams.count
            cursor = opinionListParams.cursor
            dateCreated = opinionListParams.dateCreated
            dateCreatedGte = opinionListParams.dateCreatedGte
            dateCreatedLte = opinionListParams.dateCreatedLte
            dateModified = opinionListParams.dateModified
            dateModifiedGte = opinionListParams.dateModifiedGte
            dateModifiedLte = opinionListParams.dateModifiedLte
            fields = opinionListParams.fields
            format = opinionListParams.format
            idGt = opinionListParams.idGt
            idGte = opinionListParams.idGte
            idLt = opinionListParams.idLt
            idLte = opinionListParams.idLte
            idRange = opinionListParams.idRange
            omit = opinionListParams.omit
            orderBy = opinionListParams.orderBy
            page = opinionListParams.page
            type = opinionListParams.type
            additionalHeaders = opinionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = opinionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by opinion ID. */
        fun id(id: Long?) = apply { this.id = id }

        /**
         * Alias for [Builder.id].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun id(id: Long) = id(id as Long?)

        /** Filter opinions that cite this opinion ID. */
        fun citedOpinion(citedOpinion: Long?) = apply { this.citedOpinion = citedOpinion }

        /**
         * Alias for [Builder.citedOpinion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun citedOpinion(citedOpinion: Long) = citedOpinion(citedOpinion as Long?)

        /** Filter by parent cluster ID. */
        fun cluster(cluster: Long?) = apply { this.cluster = cluster }

        /**
         * Alias for [Builder.cluster].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cluster(cluster: Long) = cluster(cluster as Long?)

        /** Filter by court via the cluster's docket (e.g. `scotus`). */
        fun clusterDocketCourt(clusterDocketCourt: String?) = apply {
            this.clusterDocketCourt = clusterDocketCourt
        }

        /** Filter by docket number via the cluster's docket. */
        fun clusterDocketDocketNumber(clusterDocketDocketNumber: String?) = apply {
            this.clusterDocketDocketNumber = clusterDocketDocketNumber
        }

        /**
         * Set to `on` to return only the total count of matching items without result data. When
         * enabled, pagination parameters are ignored.
         */
        fun count(count: Count?) = apply { this.count = count }

        /**
         * Cursor token for deep pagination. Returned in the `next` / `previous` fields of paginated
         * responses. Available when ordering by `id`, `date_modified`, or `date_created`.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        fun dateCreated(dateCreated: OffsetDateTime?) = apply { this.dateCreated = dateCreated }

        fun dateCreatedGte(dateCreatedGte: OffsetDateTime?) = apply {
            this.dateCreatedGte = dateCreatedGte
        }

        fun dateCreatedLte(dateCreatedLte: OffsetDateTime?) = apply {
            this.dateCreatedLte = dateCreatedLte
        }

        fun dateModified(dateModified: OffsetDateTime?) = apply { this.dateModified = dateModified }

        fun dateModifiedGte(dateModifiedGte: OffsetDateTime?) = apply {
            this.dateModifiedGte = dateModifiedGte
        }

        fun dateModifiedLte(dateModifiedLte: OffsetDateTime?) = apply {
            this.dateModifiedLte = dateModifiedLte
        }

        /**
         * Comma-separated list of fields to include. Supports nested fields via double-underscore
         * notation (e.g. `educations__id`).
         */
        fun fields(fields: String?) = apply { this.fields = fields }

        /** Response serialization format. JSON is default when no `Accept` header is provided. */
        fun format(format: Format?) = apply { this.format = format }

        fun idGt(idGt: Long?) = apply { this.idGt = idGt }

        /**
         * Alias for [Builder.idGt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGt(idGt: Long) = idGt(idGt as Long?)

        fun idGte(idGte: Long?) = apply { this.idGte = idGte }

        /**
         * Alias for [Builder.idGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGte(idGte: Long) = idGte(idGte as Long?)

        fun idLt(idLt: Long?) = apply { this.idLt = idLt }

        /**
         * Alias for [Builder.idLt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idLt(idLt: Long) = idLt(idLt as Long?)

        fun idLte(idLte: Long?) = apply { this.idLte = idLte }

        /**
         * Alias for [Builder.idLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idLte(idLte: Long) = idLte(idLte as Long?)

        fun idRange(idRange: String?) = apply { this.idRange = idRange }

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

        /**
         * Filter by opinion type. Values are prefixed with numbers for sort order. Common types
         * include combined opinion, lead opinion, concurrence, dissent, etc.
         */
        fun type(type: String?) = apply { this.type = type }

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
         * Returns an immutable instance of [OpinionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OpinionListParams =
            OpinionListParams(
                id,
                citedOpinion,
                cluster,
                clusterDocketCourt,
                clusterDocketDocketNumber,
                count,
                cursor,
                dateCreated,
                dateCreatedGte,
                dateCreatedLte,
                dateModified,
                dateModifiedGte,
                dateModifiedLte,
                fields,
                format,
                idGt,
                idGte,
                idLt,
                idLte,
                idRange,
                omit,
                orderBy,
                page,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.toString()) }
                citedOpinion?.let { put("cited_opinion", it.toString()) }
                cluster?.let { put("cluster", it.toString()) }
                clusterDocketCourt?.let { put("cluster__docket__court", it) }
                clusterDocketDocketNumber?.let { put("cluster__docket__docket_number", it) }
                count?.let { put("count", it.toString()) }
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
                dateModified?.let {
                    put("date_modified", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateModifiedGte?.let {
                    put("date_modified__gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateModifiedLte?.let {
                    put("date_modified__lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                fields?.let { put("fields", it) }
                format?.let { put("format", it.toString()) }
                idGt?.let { put("id__gt", it.toString()) }
                idGte?.let { put("id__gte", it.toString()) }
                idLt?.let { put("id__lt", it.toString()) }
                idLte?.let { put("id__lte", it.toString()) }
                idRange?.let { put("id__range", it) }
                omit?.let { put("omit", it) }
                orderBy?.let { put("order_by", it) }
                page?.let { put("page", it.toString()) }
                type?.let { put("type", it) }
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

        return other is OpinionListParams &&
            id == other.id &&
            citedOpinion == other.citedOpinion &&
            cluster == other.cluster &&
            clusterDocketCourt == other.clusterDocketCourt &&
            clusterDocketDocketNumber == other.clusterDocketDocketNumber &&
            count == other.count &&
            cursor == other.cursor &&
            dateCreated == other.dateCreated &&
            dateCreatedGte == other.dateCreatedGte &&
            dateCreatedLte == other.dateCreatedLte &&
            dateModified == other.dateModified &&
            dateModifiedGte == other.dateModifiedGte &&
            dateModifiedLte == other.dateModifiedLte &&
            fields == other.fields &&
            format == other.format &&
            idGt == other.idGt &&
            idGte == other.idGte &&
            idLt == other.idLt &&
            idLte == other.idLte &&
            idRange == other.idRange &&
            omit == other.omit &&
            orderBy == other.orderBy &&
            page == other.page &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            citedOpinion,
            cluster,
            clusterDocketCourt,
            clusterDocketDocketNumber,
            count,
            cursor,
            dateCreated,
            dateCreatedGte,
            dateCreatedLte,
            dateModified,
            dateModifiedGte,
            dateModifiedLte,
            fields,
            format,
            idGt,
            idGte,
            idLt,
            idLte,
            idRange,
            omit,
            orderBy,
            page,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OpinionListParams{id=$id, citedOpinion=$citedOpinion, cluster=$cluster, clusterDocketCourt=$clusterDocketCourt, clusterDocketDocketNumber=$clusterDocketDocketNumber, count=$count, cursor=$cursor, dateCreated=$dateCreated, dateCreatedGte=$dateCreatedGte, dateCreatedLte=$dateCreatedLte, dateModified=$dateModified, dateModifiedGte=$dateModifiedGte, dateModifiedLte=$dateModifiedLte, fields=$fields, format=$format, idGt=$idGt, idGte=$idGte, idLt=$idLt, idLte=$idLte, idRange=$idRange, omit=$omit, orderBy=$orderBy, page=$page, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
