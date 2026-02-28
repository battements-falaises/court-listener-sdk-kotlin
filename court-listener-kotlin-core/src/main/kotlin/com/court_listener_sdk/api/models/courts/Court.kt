// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.ExcludeMissing
import com.court_listener_sdk.api.core.JsonField
import com.court_listener_sdk.api.core.JsonMissing
import com.court_listener_sdk.api.core.JsonValue
import com.court_listener_sdk.api.errors.CourtListenerInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Court
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val citationString: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<LocalDate>,
    private val fullName: JsonField<String>,
    private val inUse: JsonField<Boolean>,
    private val jurisdiction: JsonField<String>,
    private val position: JsonField<Double>,
    private val resourceUri: JsonField<String>,
    private val shortName: JsonField<String>,
    private val startDate: JsonField<LocalDate>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citation_string")
        @ExcludeMissing
        citationString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_modified")
        @ExcludeMissing
        dateModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("in_use") @ExcludeMissing inUse: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        jurisdiction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_name") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        citationString,
        dateCreated,
        dateModified,
        endDate,
        fullName,
        inUse,
        jurisdiction,
        position,
        resourceUri,
        shortName,
        startDate,
        url,
        mutableMapOf(),
    )

    /**
     * Court identifier (e.g. `scotus`, `ca9`, `dcd`).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * String used for citations from this court.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun citationString(): String? = citationString.getNullable("citation_string")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime? = dateCreated.getNullable("date_created")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateModified(): OffsetDateTime? = dateModified.getNullable("date_modified")

    /**
     * Date the court was dissolved, if applicable.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endDate(): LocalDate? = endDate.getNullable("end_date")

    /**
     * Full name of the court.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fullName(): String? = fullName.getNullable("full_name")

    /**
     * Whether this court is currently active.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inUse(): Boolean? = inUse.getNullable("in_use")

    /**
     * Jurisdiction type code.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jurisdiction(): String? = jurisdiction.getNullable("jurisdiction")

    /**
     * Sort position for display.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun position(): Double? = position.getNullable("position")

    /**
     * Canonical API URL for this court.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): String? = resourceUri.getNullable("resource_uri")

    /**
     * Short/abbreviated name.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shortName(): String? = shortName.getNullable("short_name")

    /**
     * Date the court was founded.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startDate(): LocalDate? = startDate.getNullable("start_date")

    /**
     * Court's website URL.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun url(): String? = url.getNullable("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [citationString].
     *
     * Unlike [citationString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citation_string")
    @ExcludeMissing
    fun _citationString(): JsonField<String> = citationString

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * Returns the raw JSON value of [dateModified].
     *
     * Unlike [dateModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_modified")
    @ExcludeMissing
    fun _dateModified(): JsonField<OffsetDateTime> = dateModified

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [inUse].
     *
     * Unlike [inUse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_use") @ExcludeMissing fun _inUse(): JsonField<Boolean> = inUse

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jurisdiction")
    @ExcludeMissing
    fun _jurisdiction(): JsonField<String> = jurisdiction

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Double> = position

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_name") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Court]. */
        fun builder() = Builder()
    }

    /** A builder for [Court]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var citationString: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<LocalDate> = JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var inUse: JsonField<Boolean> = JsonMissing.of()
        private var jurisdiction: JsonField<String> = JsonMissing.of()
        private var position: JsonField<Double> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var shortName: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<LocalDate> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(court: Court) = apply {
            id = court.id
            citationString = court.citationString
            dateCreated = court.dateCreated
            dateModified = court.dateModified
            endDate = court.endDate
            fullName = court.fullName
            inUse = court.inUse
            jurisdiction = court.jurisdiction
            position = court.position
            resourceUri = court.resourceUri
            shortName = court.shortName
            startDate = court.startDate
            url = court.url
            additionalProperties = court.additionalProperties.toMutableMap()
        }

        /** Court identifier (e.g. `scotus`, `ca9`, `dcd`). */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** String used for citations from this court. */
        fun citationString(citationString: String) = citationString(JsonField.of(citationString))

        /**
         * Sets [Builder.citationString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citationString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citationString(citationString: JsonField<String>) = apply {
            this.citationString = citationString
        }

        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        fun dateModified(dateModified: OffsetDateTime) = dateModified(JsonField.of(dateModified))

        /**
         * Sets [Builder.dateModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateModified(dateModified: JsonField<OffsetDateTime>) = apply {
            this.dateModified = dateModified
        }

        /** Date the court was dissolved, if applicable. */
        fun endDate(endDate: LocalDate?) = endDate(JsonField.ofNullable(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        /** Full name of the court. */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** Whether this court is currently active. */
        fun inUse(inUse: Boolean) = inUse(JsonField.of(inUse))

        /**
         * Sets [Builder.inUse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inUse] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inUse(inUse: JsonField<Boolean>) = apply { this.inUse = inUse }

        /** Jurisdiction type code. */
        fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            this.jurisdiction = jurisdiction
        }

        /** Sort position for display. */
        fun position(position: Double) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<Double>) = apply { this.position = position }

        /** Canonical API URL for this court. */
        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        /** Short/abbreviated name. */
        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        /** Date the court was founded. */
        fun startDate(startDate: LocalDate?) = startDate(JsonField.ofNullable(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        /** Court's website URL. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Court].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Court =
            Court(
                id,
                citationString,
                dateCreated,
                dateModified,
                endDate,
                fullName,
                inUse,
                jurisdiction,
                position,
                resourceUri,
                shortName,
                startDate,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Court = apply {
        if (validated) {
            return@apply
        }

        id()
        citationString()
        dateCreated()
        dateModified()
        endDate()
        fullName()
        inUse()
        jurisdiction()
        position()
        resourceUri()
        shortName()
        startDate()
        url()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (citationString.asKnown() == null) 0 else 1) +
            (if (dateCreated.asKnown() == null) 0 else 1) +
            (if (dateModified.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (fullName.asKnown() == null) 0 else 1) +
            (if (inUse.asKnown() == null) 0 else 1) +
            (if (jurisdiction.asKnown() == null) 0 else 1) +
            (if (position.asKnown() == null) 0 else 1) +
            (if (resourceUri.asKnown() == null) 0 else 1) +
            (if (shortName.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (if (url.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Court &&
            id == other.id &&
            citationString == other.citationString &&
            dateCreated == other.dateCreated &&
            dateModified == other.dateModified &&
            endDate == other.endDate &&
            fullName == other.fullName &&
            inUse == other.inUse &&
            jurisdiction == other.jurisdiction &&
            position == other.position &&
            resourceUri == other.resourceUri &&
            shortName == other.shortName &&
            startDate == other.startDate &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            citationString,
            dateCreated,
            dateModified,
            endDate,
            fullName,
            inUse,
            jurisdiction,
            position,
            resourceUri,
            shortName,
            startDate,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Court{id=$id, citationString=$citationString, dateCreated=$dateCreated, dateModified=$dateModified, endDate=$endDate, fullName=$fullName, inUse=$inUse, jurisdiction=$jurisdiction, position=$position, resourceUri=$resourceUri, shortName=$shortName, startDate=$startDate, url=$url, additionalProperties=$additionalProperties}"
}
