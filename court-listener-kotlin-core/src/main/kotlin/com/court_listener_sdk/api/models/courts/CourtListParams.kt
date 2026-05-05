// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

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
 * Returns a paginated list of courts. Results can generally be cached as court data changes
 * infrequently.
 */
class CourtListParams
private constructor(
    private val id: String?,
    private val count: Count?,
    private val cursor: String?,
    private val dateModified: OffsetDateTime?,
    private val dateModifiedGte: OffsetDateTime?,
    private val dateModifiedLte: OffsetDateTime?,
    private val fields: String?,
    private val format: Format?,
    private val fullName: String?,
    private val fullNameStartswith: String?,
    private val idIn: String?,
    private val jurisdiction: String?,
    private val omit: String?,
    private val orderBy: String?,
    private val page: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by court identifier (e.g. `scotus`, `ca9`, `dcd`). */
    fun id(): String? = id

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

    /** Filter by exact date modified (ISO-8601). */
    fun dateModified(): OffsetDateTime? = dateModified

    /** Filter courts modified on or after this date. */
    fun dateModifiedGte(): OffsetDateTime? = dateModifiedGte

    /** Filter courts modified on or before this date. */
    fun dateModifiedLte(): OffsetDateTime? = dateModifiedLte

    /**
     * Comma-separated list of fields to include. Supports nested fields via double-underscore
     * notation (e.g. `educations__id`).
     */
    fun fields(): String? = fields

    /** Response serialization format. JSON is default when no `Accept` header is provided. */
    fun format(): Format? = format

    /** Filter by the full name of the court. */
    fun fullName(): String? = fullName

    /** Filter courts whose full name starts with the given value. */
    fun fullNameStartswith(): String? = fullNameStartswith

    /** Filter by multiple court identifiers (comma-separated). */
    fun idIn(): String? = idIn

    /**
     * Filter by jurisdiction type. Common values: `F` (Federal Appellate), `FD` (Federal District),
     * `FB` (Federal Bankruptcy), `FBP` (Federal Bankruptcy Panel), `FS` (Federal Special), `S`
     * (State Supreme), `SA` (State Appellate), `ST` (State Trial), `SS` (State Special), `SAG`
     * (State Attorney General), `T` (Tribal), `I` (International), `C` (Committee), `TES`
     * (Testing).
     */
    fun jurisdiction(): String? = jurisdiction

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CourtListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CourtListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CourtListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var count: Count? = null
        private var cursor: String? = null
        private var dateModified: OffsetDateTime? = null
        private var dateModifiedGte: OffsetDateTime? = null
        private var dateModifiedLte: OffsetDateTime? = null
        private var fields: String? = null
        private var format: Format? = null
        private var fullName: String? = null
        private var fullNameStartswith: String? = null
        private var idIn: String? = null
        private var jurisdiction: String? = null
        private var omit: String? = null
        private var orderBy: String? = null
        private var page: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(courtListParams: CourtListParams) = apply {
            id = courtListParams.id
            count = courtListParams.count
            cursor = courtListParams.cursor
            dateModified = courtListParams.dateModified
            dateModifiedGte = courtListParams.dateModifiedGte
            dateModifiedLte = courtListParams.dateModifiedLte
            fields = courtListParams.fields
            format = courtListParams.format
            fullName = courtListParams.fullName
            fullNameStartswith = courtListParams.fullNameStartswith
            idIn = courtListParams.idIn
            jurisdiction = courtListParams.jurisdiction
            omit = courtListParams.omit
            orderBy = courtListParams.orderBy
            page = courtListParams.page
            additionalHeaders = courtListParams.additionalHeaders.toBuilder()
            additionalQueryParams = courtListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by court identifier (e.g. `scotus`, `ca9`, `dcd`). */
        fun id(id: String?) = apply { this.id = id }

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

        /** Filter by exact date modified (ISO-8601). */
        fun dateModified(dateModified: OffsetDateTime?) = apply { this.dateModified = dateModified }

        /** Filter courts modified on or after this date. */
        fun dateModifiedGte(dateModifiedGte: OffsetDateTime?) = apply {
            this.dateModifiedGte = dateModifiedGte
        }

        /** Filter courts modified on or before this date. */
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

        /** Filter by the full name of the court. */
        fun fullName(fullName: String?) = apply { this.fullName = fullName }

        /** Filter courts whose full name starts with the given value. */
        fun fullNameStartswith(fullNameStartswith: String?) = apply {
            this.fullNameStartswith = fullNameStartswith
        }

        /** Filter by multiple court identifiers (comma-separated). */
        fun idIn(idIn: String?) = apply { this.idIn = idIn }

        /**
         * Filter by jurisdiction type. Common values: `F` (Federal Appellate), `FD` (Federal
         * District), `FB` (Federal Bankruptcy), `FBP` (Federal Bankruptcy Panel), `FS` (Federal
         * Special), `S` (State Supreme), `SA` (State Appellate), `ST` (State Trial), `SS` (State
         * Special), `SAG` (State Attorney General), `T` (Tribal), `I` (International), `C`
         * (Committee), `TES` (Testing).
         */
        fun jurisdiction(jurisdiction: String?) = apply { this.jurisdiction = jurisdiction }

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
         * Returns an immutable instance of [CourtListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CourtListParams =
            CourtListParams(
                id,
                count,
                cursor,
                dateModified,
                dateModifiedGte,
                dateModifiedLte,
                fields,
                format,
                fullName,
                fullNameStartswith,
                idIn,
                jurisdiction,
                omit,
                orderBy,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it) }
                count?.let { put("count", it.toString()) }
                cursor?.let { put("cursor", it) }
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
                fullName?.let { put("full_name", it) }
                fullNameStartswith?.let { put("full_name__startswith", it) }
                idIn?.let { put("id__in", it) }
                jurisdiction?.let { put("jurisdiction", it) }
                omit?.let { put("omit", it) }
                orderBy?.let { put("order_by", it) }
                page?.let { put("page", it.toString()) }
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

        return other is CourtListParams &&
            id == other.id &&
            count == other.count &&
            cursor == other.cursor &&
            dateModified == other.dateModified &&
            dateModifiedGte == other.dateModifiedGte &&
            dateModifiedLte == other.dateModifiedLte &&
            fields == other.fields &&
            format == other.format &&
            fullName == other.fullName &&
            fullNameStartswith == other.fullNameStartswith &&
            idIn == other.idIn &&
            jurisdiction == other.jurisdiction &&
            omit == other.omit &&
            orderBy == other.orderBy &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            count,
            cursor,
            dateModified,
            dateModifiedGte,
            dateModifiedLte,
            fields,
            format,
            fullName,
            fullNameStartswith,
            idIn,
            jurisdiction,
            omit,
            orderBy,
            page,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CourtListParams{id=$id, count=$count, cursor=$cursor, dateModified=$dateModified, dateModifiedGte=$dateModifiedGte, dateModifiedLte=$dateModifiedLte, fields=$fields, format=$format, fullName=$fullName, fullNameStartswith=$fullNameStartswith, idIn=$idIn, jurisdiction=$jurisdiction, omit=$omit, orderBy=$orderBy, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
