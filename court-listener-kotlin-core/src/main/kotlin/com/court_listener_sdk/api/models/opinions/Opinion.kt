// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Opinion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val author: JsonField<String>,
    private val authorStr: JsonField<String>,
    private val cluster: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateModified: JsonField<OffsetDateTime>,
    private val downloadUrl: JsonField<String>,
    private val extractedByOcr: JsonField<Boolean>,
    private val html: JsonField<String>,
    private val htmlAnon2020: JsonField<String>,
    private val htmlColumbia: JsonField<String>,
    private val htmlLawbox: JsonField<String>,
    private val htmlWithCitations: JsonField<String>,
    private val joinedBy: JsonField<List<String>>,
    private val localPath: JsonField<String>,
    private val opinionsCited: JsonField<List<String>>,
    private val orderingKey: JsonField<Double>,
    private val perCuriam: JsonField<Boolean>,
    private val plainText: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val sha1: JsonField<String>,
    private val type: JsonField<String>,
    private val xmlHarvard: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("author") @ExcludeMissing author: JsonField<String> = JsonMissing.of(),
        @JsonProperty("author_str") @ExcludeMissing authorStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cluster") @ExcludeMissing cluster: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_modified")
        @ExcludeMissing
        dateModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extracted_by_ocr")
        @ExcludeMissing
        extractedByOcr: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_anon_2020")
        @ExcludeMissing
        htmlAnon2020: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_columbia")
        @ExcludeMissing
        htmlColumbia: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_lawbox")
        @ExcludeMissing
        htmlLawbox: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_with_citations")
        @ExcludeMissing
        htmlWithCitations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("joined_by")
        @ExcludeMissing
        joinedBy: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("local_path") @ExcludeMissing localPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opinions_cited")
        @ExcludeMissing
        opinionsCited: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ordering_key")
        @ExcludeMissing
        orderingKey: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("per_curiam")
        @ExcludeMissing
        perCuriam: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("plain_text") @ExcludeMissing plainText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sha1") @ExcludeMissing sha1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("xml_harvard")
        @ExcludeMissing
        xmlHarvard: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        author,
        authorStr,
        cluster,
        dateCreated,
        dateModified,
        downloadUrl,
        extractedByOcr,
        html,
        htmlAnon2020,
        htmlColumbia,
        htmlLawbox,
        htmlWithCitations,
        joinedBy,
        localPath,
        opinionsCited,
        orderingKey,
        perCuriam,
        plainText,
        resourceUri,
        sha1,
        type,
        xmlHarvard,
        mutableMapOf(),
    )

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * API URL of the authoring judge (normalized).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun author(): String? = author.getNullable("author")

    /**
     * Author name as a string (not normalized).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun authorStr(): String? = authorStr.getNullable("author_str")

    /**
     * API URL of the parent cluster.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cluster(): String? = cluster.getNullable("cluster")

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
     * Original URL where the opinion was scraped from. Often unreliable as many courts do not
     * maintain stable URIs.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun downloadUrl(): String? = downloadUrl.getNullable("download_url")

    /**
     * Whether the text was extracted via OCR.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun extractedByOcr(): Boolean? = extractedByOcr.getNullable("extracted_by_ocr")

    /**
     * HTML content from court websites (Word Perfect or HTML documents) or Resource.org.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun html(): String? = html.getNullable("html")

    /**
     * HTML content from the anonymous 2020 source.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun htmlAnon2020(): String? = htmlAnon2020.getNullable("html_anon_2020")

    /**
     * HTML content from the Columbia collaboration.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun htmlColumbia(): String? = htmlColumbia.getNullable("html_columbia")

    /**
     * HTML content from the Lawbox donation.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun htmlLawbox(): String? = htmlLawbox.getNullable("html_lawbox")

    /**
     * **Recommended field.** HTML with citations identified and linked. This is the field used on
     * the CourtListener website.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun htmlWithCitations(): String? = htmlWithCitations.getNullable("html_with_citations")

    /**
     * API URLs of judges who joined this opinion.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun joinedBy(): List<String>? = joinedBy.getNullable("joined_by")

    /**
     * Path to the binary file for the decision, if available.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun localPath(): String? = localPath.getNullable("local_path")

    /**
     * API URLs of other opinions cited by this one.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun opinionsCited(): List<String>? = opinionsCited.getNullable("opinions_cited")

    /**
     * Sort order within the cluster. Only populated for opinions ingested from Harvard or Columbia
     * sources.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun orderingKey(): Double? = orderingKey.getNullable("ordering_key")

    /**
     * Whether this is a per curiam opinion.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun perCuriam(): Boolean? = perCuriam.getNullable("per_curiam")

    /**
     * Plain text of the opinion. Populated when sourced from a court website as PDF or Microsoft
     * Word document.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun plainText(): String? = plainText.getNullable("plain_text")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): String? = resourceUri.getNullable("resource_uri")

    /**
     * SHA-1 hash of the opinion content.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sha1(): String? = sha1.getNullable("sha1")

    /**
     * Opinion type (e.g. combined opinion, lead opinion, concurrence, dissent). Values are
     * number-prefixed for sort priority.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * XML content from Harvard's Caselaw Access Project. Contains rich data but may have OCR
     * artifacts.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun xmlHarvard(): String? = xmlHarvard.getNullable("xml_harvard")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [author].
     *
     * Unlike [author], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author") @ExcludeMissing fun _author(): JsonField<String> = author

    /**
     * Returns the raw JSON value of [authorStr].
     *
     * Unlike [authorStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_str") @ExcludeMissing fun _authorStr(): JsonField<String> = authorStr

    /**
     * Returns the raw JSON value of [cluster].
     *
     * Unlike [cluster], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cluster") @ExcludeMissing fun _cluster(): JsonField<String> = cluster

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
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [extractedByOcr].
     *
     * Unlike [extractedByOcr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extracted_by_ocr")
    @ExcludeMissing
    fun _extractedByOcr(): JsonField<Boolean> = extractedByOcr

    /**
     * Returns the raw JSON value of [html].
     *
     * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

    /**
     * Returns the raw JSON value of [htmlAnon2020].
     *
     * Unlike [htmlAnon2020], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_anon_2020")
    @ExcludeMissing
    fun _htmlAnon2020(): JsonField<String> = htmlAnon2020

    /**
     * Returns the raw JSON value of [htmlColumbia].
     *
     * Unlike [htmlColumbia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_columbia")
    @ExcludeMissing
    fun _htmlColumbia(): JsonField<String> = htmlColumbia

    /**
     * Returns the raw JSON value of [htmlLawbox].
     *
     * Unlike [htmlLawbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_lawbox") @ExcludeMissing fun _htmlLawbox(): JsonField<String> = htmlLawbox

    /**
     * Returns the raw JSON value of [htmlWithCitations].
     *
     * Unlike [htmlWithCitations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("html_with_citations")
    @ExcludeMissing
    fun _htmlWithCitations(): JsonField<String> = htmlWithCitations

    /**
     * Returns the raw JSON value of [joinedBy].
     *
     * Unlike [joinedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("joined_by") @ExcludeMissing fun _joinedBy(): JsonField<List<String>> = joinedBy

    /**
     * Returns the raw JSON value of [localPath].
     *
     * Unlike [localPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("local_path") @ExcludeMissing fun _localPath(): JsonField<String> = localPath

    /**
     * Returns the raw JSON value of [opinionsCited].
     *
     * Unlike [opinionsCited], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opinions_cited")
    @ExcludeMissing
    fun _opinionsCited(): JsonField<List<String>> = opinionsCited

    /**
     * Returns the raw JSON value of [orderingKey].
     *
     * Unlike [orderingKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ordering_key")
    @ExcludeMissing
    fun _orderingKey(): JsonField<Double> = orderingKey

    /**
     * Returns the raw JSON value of [perCuriam].
     *
     * Unlike [perCuriam], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("per_curiam") @ExcludeMissing fun _perCuriam(): JsonField<Boolean> = perCuriam

    /**
     * Returns the raw JSON value of [plainText].
     *
     * Unlike [plainText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plain_text") @ExcludeMissing fun _plainText(): JsonField<String> = plainText

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [sha1].
     *
     * Unlike [sha1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sha1") @ExcludeMissing fun _sha1(): JsonField<String> = sha1

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [xmlHarvard].
     *
     * Unlike [xmlHarvard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xml_harvard") @ExcludeMissing fun _xmlHarvard(): JsonField<String> = xmlHarvard

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

        /** Returns a mutable builder for constructing an instance of [Opinion]. */
        fun builder() = Builder()
    }

    /** A builder for [Opinion]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var author: JsonField<String> = JsonMissing.of()
        private var authorStr: JsonField<String> = JsonMissing.of()
        private var cluster: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var extractedByOcr: JsonField<Boolean> = JsonMissing.of()
        private var html: JsonField<String> = JsonMissing.of()
        private var htmlAnon2020: JsonField<String> = JsonMissing.of()
        private var htmlColumbia: JsonField<String> = JsonMissing.of()
        private var htmlLawbox: JsonField<String> = JsonMissing.of()
        private var htmlWithCitations: JsonField<String> = JsonMissing.of()
        private var joinedBy: JsonField<MutableList<String>>? = null
        private var localPath: JsonField<String> = JsonMissing.of()
        private var opinionsCited: JsonField<MutableList<String>>? = null
        private var orderingKey: JsonField<Double> = JsonMissing.of()
        private var perCuriam: JsonField<Boolean> = JsonMissing.of()
        private var plainText: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var sha1: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var xmlHarvard: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(opinion: Opinion) = apply {
            id = opinion.id
            author = opinion.author
            authorStr = opinion.authorStr
            cluster = opinion.cluster
            dateCreated = opinion.dateCreated
            dateModified = opinion.dateModified
            downloadUrl = opinion.downloadUrl
            extractedByOcr = opinion.extractedByOcr
            html = opinion.html
            htmlAnon2020 = opinion.htmlAnon2020
            htmlColumbia = opinion.htmlColumbia
            htmlLawbox = opinion.htmlLawbox
            htmlWithCitations = opinion.htmlWithCitations
            joinedBy = opinion.joinedBy.map { it.toMutableList() }
            localPath = opinion.localPath
            opinionsCited = opinion.opinionsCited.map { it.toMutableList() }
            orderingKey = opinion.orderingKey
            perCuriam = opinion.perCuriam
            plainText = opinion.plainText
            resourceUri = opinion.resourceUri
            sha1 = opinion.sha1
            type = opinion.type
            xmlHarvard = opinion.xmlHarvard
            additionalProperties = opinion.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** API URL of the authoring judge (normalized). */
        fun author(author: String?) = author(JsonField.ofNullable(author))

        /**
         * Sets [Builder.author] to an arbitrary JSON value.
         *
         * You should usually call [Builder.author] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun author(author: JsonField<String>) = apply { this.author = author }

        /** Author name as a string (not normalized). */
        fun authorStr(authorStr: String?) = authorStr(JsonField.ofNullable(authorStr))

        /**
         * Sets [Builder.authorStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorStr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorStr(authorStr: JsonField<String>) = apply { this.authorStr = authorStr }

        /** API URL of the parent cluster. */
        fun cluster(cluster: String) = cluster(JsonField.of(cluster))

        /**
         * Sets [Builder.cluster] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cluster] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cluster(cluster: JsonField<String>) = apply { this.cluster = cluster }

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

        /**
         * Original URL where the opinion was scraped from. Often unreliable as many courts do not
         * maintain stable URIs.
         */
        fun downloadUrl(downloadUrl: String?) = downloadUrl(JsonField.ofNullable(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** Whether the text was extracted via OCR. */
        fun extractedByOcr(extractedByOcr: Boolean) = extractedByOcr(JsonField.of(extractedByOcr))

        /**
         * Sets [Builder.extractedByOcr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractedByOcr] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extractedByOcr(extractedByOcr: JsonField<Boolean>) = apply {
            this.extractedByOcr = extractedByOcr
        }

        /** HTML content from court websites (Word Perfect or HTML documents) or Resource.org. */
        fun html(html: String?) = html(JsonField.ofNullable(html))

        /**
         * Sets [Builder.html] to an arbitrary JSON value.
         *
         * You should usually call [Builder.html] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun html(html: JsonField<String>) = apply { this.html = html }

        /** HTML content from the anonymous 2020 source. */
        fun htmlAnon2020(htmlAnon2020: String?) = htmlAnon2020(JsonField.ofNullable(htmlAnon2020))

        /**
         * Sets [Builder.htmlAnon2020] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlAnon2020] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun htmlAnon2020(htmlAnon2020: JsonField<String>) = apply {
            this.htmlAnon2020 = htmlAnon2020
        }

        /** HTML content from the Columbia collaboration. */
        fun htmlColumbia(htmlColumbia: String?) = htmlColumbia(JsonField.ofNullable(htmlColumbia))

        /**
         * Sets [Builder.htmlColumbia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlColumbia] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun htmlColumbia(htmlColumbia: JsonField<String>) = apply {
            this.htmlColumbia = htmlColumbia
        }

        /** HTML content from the Lawbox donation. */
        fun htmlLawbox(htmlLawbox: String?) = htmlLawbox(JsonField.ofNullable(htmlLawbox))

        /**
         * Sets [Builder.htmlLawbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlLawbox] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun htmlLawbox(htmlLawbox: JsonField<String>) = apply { this.htmlLawbox = htmlLawbox }

        /**
         * **Recommended field.** HTML with citations identified and linked. This is the field used
         * on the CourtListener website.
         */
        fun htmlWithCitations(htmlWithCitations: String?) =
            htmlWithCitations(JsonField.ofNullable(htmlWithCitations))

        /**
         * Sets [Builder.htmlWithCitations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlWithCitations] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun htmlWithCitations(htmlWithCitations: JsonField<String>) = apply {
            this.htmlWithCitations = htmlWithCitations
        }

        /** API URLs of judges who joined this opinion. */
        fun joinedBy(joinedBy: List<String>) = joinedBy(JsonField.of(joinedBy))

        /**
         * Sets [Builder.joinedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joinedBy] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun joinedBy(joinedBy: JsonField<List<String>>) = apply {
            this.joinedBy = joinedBy.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.joinedBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addJoinedBy(joinedBy: String) = apply {
            this.joinedBy =
                (this.joinedBy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("joinedBy", it).add(joinedBy)
                }
        }

        /** Path to the binary file for the decision, if available. */
        fun localPath(localPath: String?) = localPath(JsonField.ofNullable(localPath))

        /**
         * Sets [Builder.localPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun localPath(localPath: JsonField<String>) = apply { this.localPath = localPath }

        /** API URLs of other opinions cited by this one. */
        fun opinionsCited(opinionsCited: List<String>) = opinionsCited(JsonField.of(opinionsCited))

        /**
         * Sets [Builder.opinionsCited] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opinionsCited] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun opinionsCited(opinionsCited: JsonField<List<String>>) = apply {
            this.opinionsCited = opinionsCited.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.opinionsCited].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOpinionsCited(opinionsCited: String) = apply {
            this.opinionsCited =
                (this.opinionsCited ?: JsonField.of(mutableListOf())).also {
                    checkKnown("opinionsCited", it).add(opinionsCited)
                }
        }

        /**
         * Sort order within the cluster. Only populated for opinions ingested from Harvard or
         * Columbia sources.
         */
        fun orderingKey(orderingKey: Double?) = orderingKey(JsonField.ofNullable(orderingKey))

        /**
         * Alias for [Builder.orderingKey].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun orderingKey(orderingKey: Double) = orderingKey(orderingKey as Double?)

        /**
         * Sets [Builder.orderingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderingKey] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orderingKey(orderingKey: JsonField<Double>) = apply { this.orderingKey = orderingKey }

        /** Whether this is a per curiam opinion. */
        fun perCuriam(perCuriam: Boolean) = perCuriam(JsonField.of(perCuriam))

        /**
         * Sets [Builder.perCuriam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perCuriam] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun perCuriam(perCuriam: JsonField<Boolean>) = apply { this.perCuriam = perCuriam }

        /**
         * Plain text of the opinion. Populated when sourced from a court website as PDF or
         * Microsoft Word document.
         */
        fun plainText(plainText: String?) = plainText(JsonField.ofNullable(plainText))

        /**
         * Sets [Builder.plainText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plainText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun plainText(plainText: JsonField<String>) = apply { this.plainText = plainText }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        /** SHA-1 hash of the opinion content. */
        fun sha1(sha1: String?) = sha1(JsonField.ofNullable(sha1))

        /**
         * Sets [Builder.sha1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sha1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sha1(sha1: JsonField<String>) = apply { this.sha1 = sha1 }

        /**
         * Opinion type (e.g. combined opinion, lead opinion, concurrence, dissent). Values are
         * number-prefixed for sort priority.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * XML content from Harvard's Caselaw Access Project. Contains rich data but may have OCR
         * artifacts.
         */
        fun xmlHarvard(xmlHarvard: String?) = xmlHarvard(JsonField.ofNullable(xmlHarvard))

        /**
         * Sets [Builder.xmlHarvard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xmlHarvard] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun xmlHarvard(xmlHarvard: JsonField<String>) = apply { this.xmlHarvard = xmlHarvard }

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
         * Returns an immutable instance of [Opinion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Opinion =
            Opinion(
                id,
                author,
                authorStr,
                cluster,
                dateCreated,
                dateModified,
                downloadUrl,
                extractedByOcr,
                html,
                htmlAnon2020,
                htmlColumbia,
                htmlLawbox,
                htmlWithCitations,
                (joinedBy ?: JsonMissing.of()).map { it.toImmutable() },
                localPath,
                (opinionsCited ?: JsonMissing.of()).map { it.toImmutable() },
                orderingKey,
                perCuriam,
                plainText,
                resourceUri,
                sha1,
                type,
                xmlHarvard,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourtListenerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Opinion = apply {
        if (validated) {
            return@apply
        }

        id()
        author()
        authorStr()
        cluster()
        dateCreated()
        dateModified()
        downloadUrl()
        extractedByOcr()
        html()
        htmlAnon2020()
        htmlColumbia()
        htmlLawbox()
        htmlWithCitations()
        joinedBy()
        localPath()
        opinionsCited()
        orderingKey()
        perCuriam()
        plainText()
        resourceUri()
        sha1()
        type()
        xmlHarvard()
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
            (if (author.asKnown() == null) 0 else 1) +
            (if (authorStr.asKnown() == null) 0 else 1) +
            (if (cluster.asKnown() == null) 0 else 1) +
            (if (dateCreated.asKnown() == null) 0 else 1) +
            (if (dateModified.asKnown() == null) 0 else 1) +
            (if (downloadUrl.asKnown() == null) 0 else 1) +
            (if (extractedByOcr.asKnown() == null) 0 else 1) +
            (if (html.asKnown() == null) 0 else 1) +
            (if (htmlAnon2020.asKnown() == null) 0 else 1) +
            (if (htmlColumbia.asKnown() == null) 0 else 1) +
            (if (htmlLawbox.asKnown() == null) 0 else 1) +
            (if (htmlWithCitations.asKnown() == null) 0 else 1) +
            (joinedBy.asKnown()?.size ?: 0) +
            (if (localPath.asKnown() == null) 0 else 1) +
            (opinionsCited.asKnown()?.size ?: 0) +
            (if (orderingKey.asKnown() == null) 0 else 1) +
            (if (perCuriam.asKnown() == null) 0 else 1) +
            (if (plainText.asKnown() == null) 0 else 1) +
            (if (resourceUri.asKnown() == null) 0 else 1) +
            (if (sha1.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (xmlHarvard.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Opinion &&
            id == other.id &&
            author == other.author &&
            authorStr == other.authorStr &&
            cluster == other.cluster &&
            dateCreated == other.dateCreated &&
            dateModified == other.dateModified &&
            downloadUrl == other.downloadUrl &&
            extractedByOcr == other.extractedByOcr &&
            html == other.html &&
            htmlAnon2020 == other.htmlAnon2020 &&
            htmlColumbia == other.htmlColumbia &&
            htmlLawbox == other.htmlLawbox &&
            htmlWithCitations == other.htmlWithCitations &&
            joinedBy == other.joinedBy &&
            localPath == other.localPath &&
            opinionsCited == other.opinionsCited &&
            orderingKey == other.orderingKey &&
            perCuriam == other.perCuriam &&
            plainText == other.plainText &&
            resourceUri == other.resourceUri &&
            sha1 == other.sha1 &&
            type == other.type &&
            xmlHarvard == other.xmlHarvard &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            author,
            authorStr,
            cluster,
            dateCreated,
            dateModified,
            downloadUrl,
            extractedByOcr,
            html,
            htmlAnon2020,
            htmlColumbia,
            htmlLawbox,
            htmlWithCitations,
            joinedBy,
            localPath,
            opinionsCited,
            orderingKey,
            perCuriam,
            plainText,
            resourceUri,
            sha1,
            type,
            xmlHarvard,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Opinion{id=$id, author=$author, authorStr=$authorStr, cluster=$cluster, dateCreated=$dateCreated, dateModified=$dateModified, downloadUrl=$downloadUrl, extractedByOcr=$extractedByOcr, html=$html, htmlAnon2020=$htmlAnon2020, htmlColumbia=$htmlColumbia, htmlLawbox=$htmlLawbox, htmlWithCitations=$htmlWithCitations, joinedBy=$joinedBy, localPath=$localPath, opinionsCited=$opinionsCited, orderingKey=$orderingKey, perCuriam=$perCuriam, plainText=$plainText, resourceUri=$resourceUri, sha1=$sha1, type=$type, xmlHarvard=$xmlHarvard, additionalProperties=$additionalProperties}"
}
