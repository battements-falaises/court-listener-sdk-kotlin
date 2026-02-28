// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.ExcludeMissing
import com.court_listener_sdk.api.core.JsonField
import com.court_listener_sdk.api.core.JsonMissing
import com.court_listener_sdk.api.core.JsonValue
import com.court_listener_sdk.api.core.checkKnown
import com.court_listener_sdk.api.core.toImmutable
import com.court_listener_sdk.api.errors.CourtListenerInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Cluster
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val absoluteUrl: JsonField<String>,
    private val blocked: JsonField<Boolean>,
    private val caseName: JsonField<String>,
    private val caseNameFull: JsonField<String>,
    private val caseNameShort: JsonField<String>,
    private val citationCount: JsonField<Long>,
    private val citations: JsonField<List<Citation>>,
    private val correction: JsonField<String>,
    private val crossReference: JsonField<String>,
    private val dateBlocked: JsonField<LocalDate>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateFiled: JsonField<LocalDate>,
    private val dateFiledIsApproximate: JsonField<Boolean>,
    private val dateModified: JsonField<OffsetDateTime>,
    private val disposition: JsonField<String>,
    private val docket: JsonField<String>,
    private val headnotes: JsonField<String>,
    private val history: JsonField<String>,
    private val judges: JsonField<String>,
    private val nonParticipatingJudges: JsonField<List<String>>,
    private val otherDates: JsonField<String>,
    private val panel: JsonField<List<String>>,
    private val precedentialStatus: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val slug: JsonField<String>,
    private val source: JsonField<String>,
    private val subOpinions: JsonField<List<String>>,
    private val summary: JsonField<String>,
    private val syllabus: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("absolute_url")
        @ExcludeMissing
        absoluteUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("case_name") @ExcludeMissing caseName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_name_full")
        @ExcludeMissing
        caseNameFull: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_name_short")
        @ExcludeMissing
        caseNameShort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citation_count")
        @ExcludeMissing
        citationCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<List<Citation>> = JsonMissing.of(),
        @JsonProperty("correction")
        @ExcludeMissing
        correction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cross_reference")
        @ExcludeMissing
        crossReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_blocked")
        @ExcludeMissing
        dateBlocked: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_filed")
        @ExcludeMissing
        dateFiled: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_filed_is_approximate")
        @ExcludeMissing
        dateFiledIsApproximate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("date_modified")
        @ExcludeMissing
        dateModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("disposition")
        @ExcludeMissing
        disposition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("docket") @ExcludeMissing docket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headnotes") @ExcludeMissing headnotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("history") @ExcludeMissing history: JsonField<String> = JsonMissing.of(),
        @JsonProperty("judges") @ExcludeMissing judges: JsonField<String> = JsonMissing.of(),
        @JsonProperty("non_participating_judges")
        @ExcludeMissing
        nonParticipatingJudges: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("other_dates")
        @ExcludeMissing
        otherDates: JsonField<String> = JsonMissing.of(),
        @JsonProperty("panel") @ExcludeMissing panel: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("precedential_status")
        @ExcludeMissing
        precedentialStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sub_opinions")
        @ExcludeMissing
        subOpinions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("syllabus") @ExcludeMissing syllabus: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        absoluteUrl,
        blocked,
        caseName,
        caseNameFull,
        caseNameShort,
        citationCount,
        citations,
        correction,
        crossReference,
        dateBlocked,
        dateCreated,
        dateFiled,
        dateFiledIsApproximate,
        dateModified,
        disposition,
        docket,
        headnotes,
        history,
        judges,
        nonParticipatingJudges,
        otherDates,
        panel,
        precedentialStatus,
        resourceUri,
        slug,
        source,
        subOpinions,
        summary,
        syllabus,
        mutableMapOf(),
    )

    /**
     * Cluster ID — used in CourtListener case law URLs.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * Relative URL path on CourtListener.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun absoluteUrl(): String? = absoluteUrl.getNullable("absolute_url")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun blocked(): Boolean? = blocked.getNullable("blocked")

    /**
     * Case name frozen at decision time (does not change).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun caseName(): String? = caseName.getNullable("case_name")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun caseNameFull(): String? = caseNameFull.getNullable("case_name_full")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun caseNameShort(): String? = caseNameShort.getNullable("case_name_short")

    /**
     * Number of times this cluster has been cited.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun citationCount(): Long? = citationCount.getNullable("citation_count")

    /**
     * List of parallel citation objects for this cluster.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun citations(): List<Citation>? = citations.getNullable("citations")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun correction(): String? = correction.getNullable("correction")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun crossReference(): String? = crossReference.getNullable("cross_reference")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateBlocked(): LocalDate? = dateBlocked.getNullable("date_blocked")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime? = dateCreated.getNullable("date_created")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateFiled(): LocalDate? = dateFiled.getNullable("date_filed")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateFiledIsApproximate(): Boolean? =
        dateFiledIsApproximate.getNullable("date_filed_is_approximate")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateModified(): OffsetDateTime? = dateModified.getNullable("date_modified")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disposition(): String? = disposition.getNullable("disposition")

    /**
     * API URL of the parent docket.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun docket(): String? = docket.getNullable("docket")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun headnotes(): String? = headnotes.getNullable("headnotes")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun history(): String? = history.getNullable("history")

    /**
     * Judge name(s) as a string (not yet normalized).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun judges(): String? = judges.getNullable("judges")

    /**
     * API URLs of non-participating judges.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nonParticipatingJudges(): List<String>? =
        nonParticipatingJudges.getNullable("non_participating_judges")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun otherDates(): String? = otherDates.getNullable("other_dates")

    /**
     * API URLs of judges on the panel (normalized).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun panel(): List<String>? = panel.getNullable("panel")

    /**
     * Whether this cluster is published, unpublished, etc.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun precedentialStatus(): String? = precedentialStatus.getNullable("precedential_status")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): String? = resourceUri.getNullable("resource_uri")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun slug(): String? = slug.getNullable("slug")

    /**
     * Source of this cluster data.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun source(): String? = source.getNullable("source")

    /**
     * API URLs of opinions in this cluster.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subOpinions(): List<String>? = subOpinions.getNullable("sub_opinions")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun summary(): String? = summary.getNullable("summary")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun syllabus(): String? = syllabus.getNullable("syllabus")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [absoluteUrl].
     *
     * Unlike [absoluteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("absolute_url")
    @ExcludeMissing
    fun _absoluteUrl(): JsonField<String> = absoluteUrl

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

    /**
     * Returns the raw JSON value of [caseName].
     *
     * Unlike [caseName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("case_name") @ExcludeMissing fun _caseName(): JsonField<String> = caseName

    /**
     * Returns the raw JSON value of [caseNameFull].
     *
     * Unlike [caseNameFull], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("case_name_full")
    @ExcludeMissing
    fun _caseNameFull(): JsonField<String> = caseNameFull

    /**
     * Returns the raw JSON value of [caseNameShort].
     *
     * Unlike [caseNameShort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("case_name_short")
    @ExcludeMissing
    fun _caseNameShort(): JsonField<String> = caseNameShort

    /**
     * Returns the raw JSON value of [citationCount].
     *
     * Unlike [citationCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citation_count")
    @ExcludeMissing
    fun _citationCount(): JsonField<Long> = citationCount

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations")
    @ExcludeMissing
    fun _citations(): JsonField<List<Citation>> = citations

    /**
     * Returns the raw JSON value of [correction].
     *
     * Unlike [correction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correction") @ExcludeMissing fun _correction(): JsonField<String> = correction

    /**
     * Returns the raw JSON value of [crossReference].
     *
     * Unlike [crossReference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cross_reference")
    @ExcludeMissing
    fun _crossReference(): JsonField<String> = crossReference

    /**
     * Returns the raw JSON value of [dateBlocked].
     *
     * Unlike [dateBlocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_blocked")
    @ExcludeMissing
    fun _dateBlocked(): JsonField<LocalDate> = dateBlocked

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * Returns the raw JSON value of [dateFiled].
     *
     * Unlike [dateFiled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_filed") @ExcludeMissing fun _dateFiled(): JsonField<LocalDate> = dateFiled

    /**
     * Returns the raw JSON value of [dateFiledIsApproximate].
     *
     * Unlike [dateFiledIsApproximate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("date_filed_is_approximate")
    @ExcludeMissing
    fun _dateFiledIsApproximate(): JsonField<Boolean> = dateFiledIsApproximate

    /**
     * Returns the raw JSON value of [dateModified].
     *
     * Unlike [dateModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_modified")
    @ExcludeMissing
    fun _dateModified(): JsonField<OffsetDateTime> = dateModified

    /**
     * Returns the raw JSON value of [disposition].
     *
     * Unlike [disposition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disposition") @ExcludeMissing fun _disposition(): JsonField<String> = disposition

    /**
     * Returns the raw JSON value of [docket].
     *
     * Unlike [docket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docket") @ExcludeMissing fun _docket(): JsonField<String> = docket

    /**
     * Returns the raw JSON value of [headnotes].
     *
     * Unlike [headnotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headnotes") @ExcludeMissing fun _headnotes(): JsonField<String> = headnotes

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<String> = history

    /**
     * Returns the raw JSON value of [judges].
     *
     * Unlike [judges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("judges") @ExcludeMissing fun _judges(): JsonField<String> = judges

    /**
     * Returns the raw JSON value of [nonParticipatingJudges].
     *
     * Unlike [nonParticipatingJudges], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("non_participating_judges")
    @ExcludeMissing
    fun _nonParticipatingJudges(): JsonField<List<String>> = nonParticipatingJudges

    /**
     * Returns the raw JSON value of [otherDates].
     *
     * Unlike [otherDates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("other_dates") @ExcludeMissing fun _otherDates(): JsonField<String> = otherDates

    /**
     * Returns the raw JSON value of [panel].
     *
     * Unlike [panel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("panel") @ExcludeMissing fun _panel(): JsonField<List<String>> = panel

    /**
     * Returns the raw JSON value of [precedentialStatus].
     *
     * Unlike [precedentialStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("precedential_status")
    @ExcludeMissing
    fun _precedentialStatus(): JsonField<String> = precedentialStatus

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [subOpinions].
     *
     * Unlike [subOpinions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub_opinions")
    @ExcludeMissing
    fun _subOpinions(): JsonField<List<String>> = subOpinions

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [syllabus].
     *
     * Unlike [syllabus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("syllabus") @ExcludeMissing fun _syllabus(): JsonField<String> = syllabus

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

        /** Returns a mutable builder for constructing an instance of [Cluster]. */
        fun builder() = Builder()
    }

    /** A builder for [Cluster]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var absoluteUrl: JsonField<String> = JsonMissing.of()
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var caseName: JsonField<String> = JsonMissing.of()
        private var caseNameFull: JsonField<String> = JsonMissing.of()
        private var caseNameShort: JsonField<String> = JsonMissing.of()
        private var citationCount: JsonField<Long> = JsonMissing.of()
        private var citations: JsonField<MutableList<Citation>>? = null
        private var correction: JsonField<String> = JsonMissing.of()
        private var crossReference: JsonField<String> = JsonMissing.of()
        private var dateBlocked: JsonField<LocalDate> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateFiled: JsonField<LocalDate> = JsonMissing.of()
        private var dateFiledIsApproximate: JsonField<Boolean> = JsonMissing.of()
        private var dateModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var disposition: JsonField<String> = JsonMissing.of()
        private var docket: JsonField<String> = JsonMissing.of()
        private var headnotes: JsonField<String> = JsonMissing.of()
        private var history: JsonField<String> = JsonMissing.of()
        private var judges: JsonField<String> = JsonMissing.of()
        private var nonParticipatingJudges: JsonField<MutableList<String>>? = null
        private var otherDates: JsonField<String> = JsonMissing.of()
        private var panel: JsonField<MutableList<String>>? = null
        private var precedentialStatus: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var subOpinions: JsonField<MutableList<String>>? = null
        private var summary: JsonField<String> = JsonMissing.of()
        private var syllabus: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cluster: Cluster) = apply {
            id = cluster.id
            absoluteUrl = cluster.absoluteUrl
            blocked = cluster.blocked
            caseName = cluster.caseName
            caseNameFull = cluster.caseNameFull
            caseNameShort = cluster.caseNameShort
            citationCount = cluster.citationCount
            citations = cluster.citations.map { it.toMutableList() }
            correction = cluster.correction
            crossReference = cluster.crossReference
            dateBlocked = cluster.dateBlocked
            dateCreated = cluster.dateCreated
            dateFiled = cluster.dateFiled
            dateFiledIsApproximate = cluster.dateFiledIsApproximate
            dateModified = cluster.dateModified
            disposition = cluster.disposition
            docket = cluster.docket
            headnotes = cluster.headnotes
            history = cluster.history
            judges = cluster.judges
            nonParticipatingJudges = cluster.nonParticipatingJudges.map { it.toMutableList() }
            otherDates = cluster.otherDates
            panel = cluster.panel.map { it.toMutableList() }
            precedentialStatus = cluster.precedentialStatus
            resourceUri = cluster.resourceUri
            slug = cluster.slug
            source = cluster.source
            subOpinions = cluster.subOpinions.map { it.toMutableList() }
            summary = cluster.summary
            syllabus = cluster.syllabus
            additionalProperties = cluster.additionalProperties.toMutableMap()
        }

        /** Cluster ID — used in CourtListener case law URLs. */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Relative URL path on CourtListener. */
        fun absoluteUrl(absoluteUrl: String) = absoluteUrl(JsonField.of(absoluteUrl))

        /**
         * Sets [Builder.absoluteUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.absoluteUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun absoluteUrl(absoluteUrl: JsonField<String>) = apply { this.absoluteUrl = absoluteUrl }

        fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

        /** Case name frozen at decision time (does not change). */
        fun caseName(caseName: String) = caseName(JsonField.of(caseName))

        /**
         * Sets [Builder.caseName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caseName(caseName: JsonField<String>) = apply { this.caseName = caseName }

        fun caseNameFull(caseNameFull: String) = caseNameFull(JsonField.of(caseNameFull))

        /**
         * Sets [Builder.caseNameFull] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseNameFull] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun caseNameFull(caseNameFull: JsonField<String>) = apply {
            this.caseNameFull = caseNameFull
        }

        fun caseNameShort(caseNameShort: String) = caseNameShort(JsonField.of(caseNameShort))

        /**
         * Sets [Builder.caseNameShort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseNameShort] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun caseNameShort(caseNameShort: JsonField<String>) = apply {
            this.caseNameShort = caseNameShort
        }

        /** Number of times this cluster has been cited. */
        fun citationCount(citationCount: Long) = citationCount(JsonField.of(citationCount))

        /**
         * Sets [Builder.citationCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citationCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun citationCount(citationCount: JsonField<Long>) = apply {
            this.citationCount = citationCount
        }

        /** List of parallel citation objects for this cluster. */
        fun citations(citations: List<Citation>) = citations(JsonField.of(citations))

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed `List<Citation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citations(citations: JsonField<List<Citation>>) = apply {
            this.citations = citations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Citation] to [citations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCitation(citation: Citation) = apply {
            citations =
                (citations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("citations", it).add(citation)
                }
        }

        fun correction(correction: String?) = correction(JsonField.ofNullable(correction))

        /**
         * Sets [Builder.correction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correction(correction: JsonField<String>) = apply { this.correction = correction }

        fun crossReference(crossReference: String?) =
            crossReference(JsonField.ofNullable(crossReference))

        /**
         * Sets [Builder.crossReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crossReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun crossReference(crossReference: JsonField<String>) = apply {
            this.crossReference = crossReference
        }

        fun dateBlocked(dateBlocked: LocalDate?) = dateBlocked(JsonField.ofNullable(dateBlocked))

        /**
         * Sets [Builder.dateBlocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateBlocked] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateBlocked(dateBlocked: JsonField<LocalDate>) = apply {
            this.dateBlocked = dateBlocked
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

        fun dateFiled(dateFiled: LocalDate?) = dateFiled(JsonField.ofNullable(dateFiled))

        /**
         * Sets [Builder.dateFiled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiled] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateFiled(dateFiled: JsonField<LocalDate>) = apply { this.dateFiled = dateFiled }

        fun dateFiledIsApproximate(dateFiledIsApproximate: Boolean) =
            dateFiledIsApproximate(JsonField.of(dateFiledIsApproximate))

        /**
         * Sets [Builder.dateFiledIsApproximate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiledIsApproximate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateFiledIsApproximate(dateFiledIsApproximate: JsonField<Boolean>) = apply {
            this.dateFiledIsApproximate = dateFiledIsApproximate
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

        fun disposition(disposition: String?) = disposition(JsonField.ofNullable(disposition))

        /**
         * Sets [Builder.disposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disposition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disposition(disposition: JsonField<String>) = apply { this.disposition = disposition }

        /** API URL of the parent docket. */
        fun docket(docket: String) = docket(JsonField.of(docket))

        /**
         * Sets [Builder.docket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docket(docket: JsonField<String>) = apply { this.docket = docket }

        fun headnotes(headnotes: String?) = headnotes(JsonField.ofNullable(headnotes))

        /**
         * Sets [Builder.headnotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headnotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headnotes(headnotes: JsonField<String>) = apply { this.headnotes = headnotes }

        fun history(history: String?) = history(JsonField.ofNullable(history))

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun history(history: JsonField<String>) = apply { this.history = history }

        /** Judge name(s) as a string (not yet normalized). */
        fun judges(judges: String?) = judges(JsonField.ofNullable(judges))

        /**
         * Sets [Builder.judges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.judges] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun judges(judges: JsonField<String>) = apply { this.judges = judges }

        /** API URLs of non-participating judges. */
        fun nonParticipatingJudges(nonParticipatingJudges: List<String>) =
            nonParticipatingJudges(JsonField.of(nonParticipatingJudges))

        /**
         * Sets [Builder.nonParticipatingJudges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonParticipatingJudges] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nonParticipatingJudges(nonParticipatingJudges: JsonField<List<String>>) = apply {
            this.nonParticipatingJudges = nonParticipatingJudges.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [nonParticipatingJudges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNonParticipatingJudge(nonParticipatingJudge: String) = apply {
            nonParticipatingJudges =
                (nonParticipatingJudges ?: JsonField.of(mutableListOf())).also {
                    checkKnown("nonParticipatingJudges", it).add(nonParticipatingJudge)
                }
        }

        fun otherDates(otherDates: String?) = otherDates(JsonField.ofNullable(otherDates))

        /**
         * Sets [Builder.otherDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherDates] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun otherDates(otherDates: JsonField<String>) = apply { this.otherDates = otherDates }

        /** API URLs of judges on the panel (normalized). */
        fun panel(panel: List<String>) = panel(JsonField.of(panel))

        /**
         * Sets [Builder.panel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panel] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun panel(panel: JsonField<List<String>>) = apply {
            this.panel = panel.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.panel].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPanel(panel: String) = apply {
            this.panel =
                (this.panel ?: JsonField.of(mutableListOf())).also {
                    checkKnown("panel", it).add(panel)
                }
        }

        /** Whether this cluster is published, unpublished, etc. */
        fun precedentialStatus(precedentialStatus: String) =
            precedentialStatus(JsonField.of(precedentialStatus))

        /**
         * Sets [Builder.precedentialStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precedentialStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun precedentialStatus(precedentialStatus: JsonField<String>) = apply {
            this.precedentialStatus = precedentialStatus
        }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Source of this cluster data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** API URLs of opinions in this cluster. */
        fun subOpinions(subOpinions: List<String>) = subOpinions(JsonField.of(subOpinions))

        /**
         * Sets [Builder.subOpinions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subOpinions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subOpinions(subOpinions: JsonField<List<String>>) = apply {
            this.subOpinions = subOpinions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [subOpinions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubOpinion(subOpinion: String) = apply {
            subOpinions =
                (subOpinions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subOpinions", it).add(subOpinion)
                }
        }

        fun summary(summary: String?) = summary(JsonField.ofNullable(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        fun syllabus(syllabus: String?) = syllabus(JsonField.ofNullable(syllabus))

        /**
         * Sets [Builder.syllabus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syllabus] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun syllabus(syllabus: JsonField<String>) = apply { this.syllabus = syllabus }

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
         * Returns an immutable instance of [Cluster].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Cluster =
            Cluster(
                id,
                absoluteUrl,
                blocked,
                caseName,
                caseNameFull,
                caseNameShort,
                citationCount,
                (citations ?: JsonMissing.of()).map { it.toImmutable() },
                correction,
                crossReference,
                dateBlocked,
                dateCreated,
                dateFiled,
                dateFiledIsApproximate,
                dateModified,
                disposition,
                docket,
                headnotes,
                history,
                judges,
                (nonParticipatingJudges ?: JsonMissing.of()).map { it.toImmutable() },
                otherDates,
                (panel ?: JsonMissing.of()).map { it.toImmutable() },
                precedentialStatus,
                resourceUri,
                slug,
                source,
                (subOpinions ?: JsonMissing.of()).map { it.toImmutable() },
                summary,
                syllabus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Cluster = apply {
        if (validated) {
            return@apply
        }

        id()
        absoluteUrl()
        blocked()
        caseName()
        caseNameFull()
        caseNameShort()
        citationCount()
        citations()?.forEach { it.validate() }
        correction()
        crossReference()
        dateBlocked()
        dateCreated()
        dateFiled()
        dateFiledIsApproximate()
        dateModified()
        disposition()
        docket()
        headnotes()
        history()
        judges()
        nonParticipatingJudges()
        otherDates()
        panel()
        precedentialStatus()
        resourceUri()
        slug()
        source()
        subOpinions()
        summary()
        syllabus()
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
            (if (absoluteUrl.asKnown() == null) 0 else 1) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (caseName.asKnown() == null) 0 else 1) +
            (if (caseNameFull.asKnown() == null) 0 else 1) +
            (if (caseNameShort.asKnown() == null) 0 else 1) +
            (if (citationCount.asKnown() == null) 0 else 1) +
            (citations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (correction.asKnown() == null) 0 else 1) +
            (if (crossReference.asKnown() == null) 0 else 1) +
            (if (dateBlocked.asKnown() == null) 0 else 1) +
            (if (dateCreated.asKnown() == null) 0 else 1) +
            (if (dateFiled.asKnown() == null) 0 else 1) +
            (if (dateFiledIsApproximate.asKnown() == null) 0 else 1) +
            (if (dateModified.asKnown() == null) 0 else 1) +
            (if (disposition.asKnown() == null) 0 else 1) +
            (if (docket.asKnown() == null) 0 else 1) +
            (if (headnotes.asKnown() == null) 0 else 1) +
            (if (history.asKnown() == null) 0 else 1) +
            (if (judges.asKnown() == null) 0 else 1) +
            (nonParticipatingJudges.asKnown()?.size ?: 0) +
            (if (otherDates.asKnown() == null) 0 else 1) +
            (panel.asKnown()?.size ?: 0) +
            (if (precedentialStatus.asKnown() == null) 0 else 1) +
            (if (resourceUri.asKnown() == null) 0 else 1) +
            (if (slug.asKnown() == null) 0 else 1) +
            (if (source.asKnown() == null) 0 else 1) +
            (subOpinions.asKnown()?.size ?: 0) +
            (if (summary.asKnown() == null) 0 else 1) +
            (if (syllabus.asKnown() == null) 0 else 1)

    /** A parallel citation for an opinion cluster. */
    class Citation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val page: JsonField<String>,
        private val reporter: JsonField<String>,
        private val type: JsonField<Long>,
        private val volume: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page") @ExcludeMissing page: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reporter")
            @ExcludeMissing
            reporter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("volume") @ExcludeMissing volume: JsonField<Long> = JsonMissing.of(),
        ) : this(page, reporter, type, volume, mutableMapOf())

        /**
         * The starting page number in the reporter.
         *
         * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun page(): String? = page.getNullable("page")

        /**
         * The reporter abbreviation (e.g. "U.S.", "S. Ct.").
         *
         * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reporter(): String? = reporter.getNullable("reporter")

        /**
         * The citation type identifier.
         *
         * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Long? = type.getNullable("type")

        /**
         * The volume number of the reporter.
         *
         * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun volume(): Long? = volume.getNullable("volume")

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<String> = page

        /**
         * Returns the raw JSON value of [reporter].
         *
         * Unlike [reporter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reporter") @ExcludeMissing fun _reporter(): JsonField<String> = reporter

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Long> = type

        /**
         * Returns the raw JSON value of [volume].
         *
         * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<Long> = volume

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

            /** Returns a mutable builder for constructing an instance of [Citation]. */
            fun builder() = Builder()
        }

        /** A builder for [Citation]. */
        class Builder internal constructor() {

            private var page: JsonField<String> = JsonMissing.of()
            private var reporter: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Long> = JsonMissing.of()
            private var volume: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(citation: Citation) = apply {
                page = citation.page
                reporter = citation.reporter
                type = citation.type
                volume = citation.volume
                additionalProperties = citation.additionalProperties.toMutableMap()
            }

            /** The starting page number in the reporter. */
            fun page(page: String?) = page(JsonField.ofNullable(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<String>) = apply { this.page = page }

            /** The reporter abbreviation (e.g. "U.S.", "S. Ct."). */
            fun reporter(reporter: String) = reporter(JsonField.of(reporter))

            /**
             * Sets [Builder.reporter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reporter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reporter(reporter: JsonField<String>) = apply { this.reporter = reporter }

            /** The citation type identifier. */
            fun type(type: Long) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Long>) = apply { this.type = type }

            /** The volume number of the reporter. */
            fun volume(volume: Long?) = volume(JsonField.ofNullable(volume))

            /**
             * Alias for [Builder.volume].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun volume(volume: Long) = volume(volume as Long?)

            /**
             * Sets [Builder.volume] to an arbitrary JSON value.
             *
             * You should usually call [Builder.volume] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun volume(volume: JsonField<Long>) = apply { this.volume = volume }

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
             * Returns an immutable instance of [Citation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Citation =
                Citation(page, reporter, type, volume, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Citation = apply {
            if (validated) {
                return@apply
            }

            page()
            reporter()
            type()
            volume()
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
        internal fun validity(): Int =
            (if (page.asKnown() == null) 0 else 1) +
                (if (reporter.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1) +
                (if (volume.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Citation &&
                page == other.page &&
                reporter == other.reporter &&
                type == other.type &&
                volume == other.volume &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(page, reporter, type, volume, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Citation{page=$page, reporter=$reporter, type=$type, volume=$volume, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Cluster &&
            id == other.id &&
            absoluteUrl == other.absoluteUrl &&
            blocked == other.blocked &&
            caseName == other.caseName &&
            caseNameFull == other.caseNameFull &&
            caseNameShort == other.caseNameShort &&
            citationCount == other.citationCount &&
            citations == other.citations &&
            correction == other.correction &&
            crossReference == other.crossReference &&
            dateBlocked == other.dateBlocked &&
            dateCreated == other.dateCreated &&
            dateFiled == other.dateFiled &&
            dateFiledIsApproximate == other.dateFiledIsApproximate &&
            dateModified == other.dateModified &&
            disposition == other.disposition &&
            docket == other.docket &&
            headnotes == other.headnotes &&
            history == other.history &&
            judges == other.judges &&
            nonParticipatingJudges == other.nonParticipatingJudges &&
            otherDates == other.otherDates &&
            panel == other.panel &&
            precedentialStatus == other.precedentialStatus &&
            resourceUri == other.resourceUri &&
            slug == other.slug &&
            source == other.source &&
            subOpinions == other.subOpinions &&
            summary == other.summary &&
            syllabus == other.syllabus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            absoluteUrl,
            blocked,
            caseName,
            caseNameFull,
            caseNameShort,
            citationCount,
            citations,
            correction,
            crossReference,
            dateBlocked,
            dateCreated,
            dateFiled,
            dateFiledIsApproximate,
            dateModified,
            disposition,
            docket,
            headnotes,
            history,
            judges,
            nonParticipatingJudges,
            otherDates,
            panel,
            precedentialStatus,
            resourceUri,
            slug,
            source,
            subOpinions,
            summary,
            syllabus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Cluster{id=$id, absoluteUrl=$absoluteUrl, blocked=$blocked, caseName=$caseName, caseNameFull=$caseNameFull, caseNameShort=$caseNameShort, citationCount=$citationCount, citations=$citations, correction=$correction, crossReference=$crossReference, dateBlocked=$dateBlocked, dateCreated=$dateCreated, dateFiled=$dateFiled, dateFiledIsApproximate=$dateFiledIsApproximate, dateModified=$dateModified, disposition=$disposition, docket=$docket, headnotes=$headnotes, history=$history, judges=$judges, nonParticipatingJudges=$nonParticipatingJudges, otherDates=$otherDates, panel=$panel, precedentialStatus=$precedentialStatus, resourceUri=$resourceUri, slug=$slug, source=$source, subOpinions=$subOpinions, summary=$summary, syllabus=$syllabus, additionalProperties=$additionalProperties}"
}
