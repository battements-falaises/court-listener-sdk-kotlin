// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.dockets

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

class Docket
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val absoluteUrl: JsonField<String>,
    private val appealFrom: JsonField<String>,
    private val appealFromStr: JsonField<String>,
    private val appellateCaseTypeInformation: JsonField<String>,
    private val appellateFeeStatus: JsonField<String>,
    private val assignedTo: JsonField<String>,
    private val assignedToStr: JsonField<String>,
    private val audioFiles: JsonField<List<String>>,
    private val bankruptcyInformation: JsonField<BankruptcyInformation>,
    private val blocked: JsonField<Boolean>,
    private val caseName: JsonField<String>,
    private val caseNameFull: JsonField<String>,
    private val caseNameShort: JsonField<String>,
    private val cause: JsonField<String>,
    private val clusters: JsonField<List<String>>,
    private val court: JsonField<String>,
    private val courtId: JsonField<String>,
    private val dateArgued: JsonField<LocalDate>,
    private val dateBlocked: JsonField<LocalDate>,
    private val dateCertDenied: JsonField<LocalDate>,
    private val dateCertGranted: JsonField<LocalDate>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateFiled: JsonField<LocalDate>,
    private val dateLastFiling: JsonField<LocalDate>,
    private val dateLastIndex: JsonField<OffsetDateTime>,
    private val dateModified: JsonField<OffsetDateTime>,
    private val dateReargued: JsonField<LocalDate>,
    private val dateReargumentDenied: JsonField<LocalDate>,
    private val dateTerminated: JsonField<LocalDate>,
    private val docketNumber: JsonField<String>,
    private val docketNumberCore: JsonField<String>,
    private val filepathIa: JsonField<String>,
    private val filepathIaJson: JsonField<String>,
    private val iaDateFirstChange: JsonField<OffsetDateTime>,
    private val iaNeedsUpload: JsonField<Boolean>,
    private val iaUploadFailureCount: JsonField<Long>,
    private val idbData: JsonField<IdbData>,
    private val jurisdictionType: JsonField<String>,
    private val juryDemand: JsonField<String>,
    private val mdlStatus: JsonField<String>,
    private val natureOfSuit: JsonField<String>,
    private val originalCourtInfo: JsonField<OriginalCourtInfo>,
    private val pacerCaseId: JsonField<String>,
    private val panel: JsonField<List<String>>,
    private val panelStr: JsonField<String>,
    private val referredTo: JsonField<String>,
    private val referredToStr: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val slug: JsonField<String>,
    private val source: JsonField<Long>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("absolute_url")
        @ExcludeMissing
        absoluteUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appeal_from")
        @ExcludeMissing
        appealFrom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appeal_from_str")
        @ExcludeMissing
        appealFromStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appellate_case_type_information")
        @ExcludeMissing
        appellateCaseTypeInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appellate_fee_status")
        @ExcludeMissing
        appellateFeeStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assigned_to")
        @ExcludeMissing
        assignedTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assigned_to_str")
        @ExcludeMissing
        assignedToStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_files")
        @ExcludeMissing
        audioFiles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("bankruptcy_information")
        @ExcludeMissing
        bankruptcyInformation: JsonField<BankruptcyInformation> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("case_name") @ExcludeMissing caseName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_name_full")
        @ExcludeMissing
        caseNameFull: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_name_short")
        @ExcludeMissing
        caseNameShort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cause") @ExcludeMissing cause: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clusters")
        @ExcludeMissing
        clusters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
        @JsonProperty("court_id") @ExcludeMissing courtId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_argued")
        @ExcludeMissing
        dateArgued: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_blocked")
        @ExcludeMissing
        dateBlocked: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_cert_denied")
        @ExcludeMissing
        dateCertDenied: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_cert_granted")
        @ExcludeMissing
        dateCertGranted: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_filed")
        @ExcludeMissing
        dateFiled: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_last_filing")
        @ExcludeMissing
        dateLastFiling: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_last_index")
        @ExcludeMissing
        dateLastIndex: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_modified")
        @ExcludeMissing
        dateModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_reargued")
        @ExcludeMissing
        dateReargued: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_reargument_denied")
        @ExcludeMissing
        dateReargumentDenied: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_terminated")
        @ExcludeMissing
        dateTerminated: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("docket_number")
        @ExcludeMissing
        docketNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("docket_number_core")
        @ExcludeMissing
        docketNumberCore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filepath_ia")
        @ExcludeMissing
        filepathIa: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filepath_ia_json")
        @ExcludeMissing
        filepathIaJson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ia_date_first_change")
        @ExcludeMissing
        iaDateFirstChange: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ia_needs_upload")
        @ExcludeMissing
        iaNeedsUpload: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ia_upload_failure_count")
        @ExcludeMissing
        iaUploadFailureCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idb_data") @ExcludeMissing idbData: JsonField<IdbData> = JsonMissing.of(),
        @JsonProperty("jurisdiction_type")
        @ExcludeMissing
        jurisdictionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jury_demand")
        @ExcludeMissing
        juryDemand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mdl_status") @ExcludeMissing mdlStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nature_of_suit")
        @ExcludeMissing
        natureOfSuit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_court_info")
        @ExcludeMissing
        originalCourtInfo: JsonField<OriginalCourtInfo> = JsonMissing.of(),
        @JsonProperty("pacer_case_id")
        @ExcludeMissing
        pacerCaseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("panel") @ExcludeMissing panel: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("panel_str") @ExcludeMissing panelStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referred_to")
        @ExcludeMissing
        referredTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referred_to_str")
        @ExcludeMissing
        referredToStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        absoluteUrl,
        appealFrom,
        appealFromStr,
        appellateCaseTypeInformation,
        appellateFeeStatus,
        assignedTo,
        assignedToStr,
        audioFiles,
        bankruptcyInformation,
        blocked,
        caseName,
        caseNameFull,
        caseNameShort,
        cause,
        clusters,
        court,
        courtId,
        dateArgued,
        dateBlocked,
        dateCertDenied,
        dateCertGranted,
        dateCreated,
        dateFiled,
        dateLastFiling,
        dateLastIndex,
        dateModified,
        dateReargued,
        dateReargumentDenied,
        dateTerminated,
        docketNumber,
        docketNumberCore,
        filepathIa,
        filepathIaJson,
        iaDateFirstChange,
        iaNeedsUpload,
        iaUploadFailureCount,
        idbData,
        jurisdictionType,
        juryDemand,
        mdlStatus,
        natureOfSuit,
        originalCourtInfo,
        pacerCaseId,
        panel,
        panelStr,
        referredTo,
        referredToStr,
        resourceUri,
        slug,
        source,
        tags,
        mutableMapOf(),
    )

    /**
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
     * API URL of the court this case was appealed from.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appealFrom(): String? = appealFrom.getNullable("appeal_from")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appealFromStr(): String? = appealFromStr.getNullable("appeal_from_str")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appellateCaseTypeInformation(): String? =
        appellateCaseTypeInformation.getNullable("appellate_case_type_information")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appellateFeeStatus(): String? = appellateFeeStatus.getNullable("appellate_fee_status")

    /**
     * API URL of the assigned judge.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun assignedTo(): String? = assignedTo.getNullable("assigned_to")

    /**
     * Name of the assigned judge (string, not normalized).
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun assignedToStr(): String? = assignedToStr.getNullable("assigned_to_str")

    /**
     * API URLs of related oral argument audio files.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun audioFiles(): List<String>? = audioFiles.getNullable("audio_files")

    /**
     * Bankruptcy-specific information, if applicable.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankruptcyInformation(): BankruptcyInformation? =
        bankruptcyInformation.getNullable("bankruptcy_information")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun blocked(): Boolean? = blocked.getNullable("blocked")

    /**
     * Current case name. May change over time (e.g. if a named party changes). See also the
     * cluster's case_name which is frozen at decision time.
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
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cause(): String? = cause.getNullable("cause")

    /**
     * API URLs of related opinion clusters.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clusters(): List<String>? = clusters.getNullable("clusters")

    /**
     * API URL of the court.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun court(): String? = court.getNullable("court")

    /**
     * Court identifier string.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun courtId(): String? = courtId.getNullable("court_id")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateArgued(): LocalDate? = dateArgued.getNullable("date_argued")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateBlocked(): LocalDate? = dateBlocked.getNullable("date_blocked")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateCertDenied(): LocalDate? = dateCertDenied.getNullable("date_cert_denied")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateCertGranted(): LocalDate? = dateCertGranted.getNullable("date_cert_granted")

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
    fun dateLastFiling(): LocalDate? = dateLastFiling.getNullable("date_last_filing")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateLastIndex(): OffsetDateTime? = dateLastIndex.getNullable("date_last_index")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateModified(): OffsetDateTime? = dateModified.getNullable("date_modified")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateReargued(): LocalDate? = dateReargued.getNullable("date_reargued")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateReargumentDenied(): LocalDate? =
        dateReargumentDenied.getNullable("date_reargument_denied")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateTerminated(): LocalDate? = dateTerminated.getNullable("date_terminated")

    /**
     * The docket number assigned by the court.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun docketNumber(): String? = docketNumber.getNullable("docket_number")

    /**
     * Normalized core docket number.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun docketNumberCore(): String? = docketNumberCore.getNullable("docket_number_core")

    /**
     * URL to the Internet Archive docket file.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filepathIa(): String? = filepathIa.getNullable("filepath_ia")

    /**
     * URL to the Internet Archive JSON docket file.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filepathIaJson(): String? = filepathIaJson.getNullable("filepath_ia_json")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun iaDateFirstChange(): OffsetDateTime? = iaDateFirstChange.getNullable("ia_date_first_change")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun iaNeedsUpload(): Boolean? = iaNeedsUpload.getNullable("ia_needs_upload")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun iaUploadFailureCount(): Long? = iaUploadFailureCount.getNullable("ia_upload_failure_count")

    /**
     * Integrated database data, if available.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idbData(): IdbData? = idbData.getNullable("idb_data")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jurisdictionType(): String? = jurisdictionType.getNullable("jurisdiction_type")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun juryDemand(): String? = juryDemand.getNullable("jury_demand")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mdlStatus(): String? = mdlStatus.getNullable("mdl_status")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun natureOfSuit(): String? = natureOfSuit.getNullable("nature_of_suit")

    /**
     * Original court information, if available.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originalCourtInfo(): OriginalCourtInfo? =
        originalCourtInfo.getNullable("original_court_info")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pacerCaseId(): String? = pacerCaseId.getNullable("pacer_case_id")

    /**
     * API URLs of judges on the panel.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun panel(): List<String>? = panel.getNullable("panel")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun panelStr(): String? = panelStr.getNullable("panel_str")

    /**
     * API URL of the referred judge.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referredTo(): String? = referredTo.getNullable("referred_to")

    /**
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referredToStr(): String? = referredToStr.getNullable("referred_to_str")

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
     * Numeric source identifier.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun source(): Long? = source.getNullable("source")

    /**
     * API URLs of tags on this docket.
     *
     * @throws CourtListenerInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): List<String>? = tags.getNullable("tags")

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
     * Returns the raw JSON value of [appealFrom].
     *
     * Unlike [appealFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appeal_from") @ExcludeMissing fun _appealFrom(): JsonField<String> = appealFrom

    /**
     * Returns the raw JSON value of [appealFromStr].
     *
     * Unlike [appealFromStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appeal_from_str")
    @ExcludeMissing
    fun _appealFromStr(): JsonField<String> = appealFromStr

    /**
     * Returns the raw JSON value of [appellateCaseTypeInformation].
     *
     * Unlike [appellateCaseTypeInformation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("appellate_case_type_information")
    @ExcludeMissing
    fun _appellateCaseTypeInformation(): JsonField<String> = appellateCaseTypeInformation

    /**
     * Returns the raw JSON value of [appellateFeeStatus].
     *
     * Unlike [appellateFeeStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("appellate_fee_status")
    @ExcludeMissing
    fun _appellateFeeStatus(): JsonField<String> = appellateFeeStatus

    /**
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assigned_to") @ExcludeMissing fun _assignedTo(): JsonField<String> = assignedTo

    /**
     * Returns the raw JSON value of [assignedToStr].
     *
     * Unlike [assignedToStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assigned_to_str")
    @ExcludeMissing
    fun _assignedToStr(): JsonField<String> = assignedToStr

    /**
     * Returns the raw JSON value of [audioFiles].
     *
     * Unlike [audioFiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_files")
    @ExcludeMissing
    fun _audioFiles(): JsonField<List<String>> = audioFiles

    /**
     * Returns the raw JSON value of [bankruptcyInformation].
     *
     * Unlike [bankruptcyInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bankruptcy_information")
    @ExcludeMissing
    fun _bankruptcyInformation(): JsonField<BankruptcyInformation> = bankruptcyInformation

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
     * Returns the raw JSON value of [cause].
     *
     * Unlike [cause], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cause") @ExcludeMissing fun _cause(): JsonField<String> = cause

    /**
     * Returns the raw JSON value of [clusters].
     *
     * Unlike [clusters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clusters") @ExcludeMissing fun _clusters(): JsonField<List<String>> = clusters

    /**
     * Returns the raw JSON value of [court].
     *
     * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

    /**
     * Returns the raw JSON value of [courtId].
     *
     * Unlike [courtId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("court_id") @ExcludeMissing fun _courtId(): JsonField<String> = courtId

    /**
     * Returns the raw JSON value of [dateArgued].
     *
     * Unlike [dateArgued], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_argued")
    @ExcludeMissing
    fun _dateArgued(): JsonField<LocalDate> = dateArgued

    /**
     * Returns the raw JSON value of [dateBlocked].
     *
     * Unlike [dateBlocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_blocked")
    @ExcludeMissing
    fun _dateBlocked(): JsonField<LocalDate> = dateBlocked

    /**
     * Returns the raw JSON value of [dateCertDenied].
     *
     * Unlike [dateCertDenied], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_cert_denied")
    @ExcludeMissing
    fun _dateCertDenied(): JsonField<LocalDate> = dateCertDenied

    /**
     * Returns the raw JSON value of [dateCertGranted].
     *
     * Unlike [dateCertGranted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_cert_granted")
    @ExcludeMissing
    fun _dateCertGranted(): JsonField<LocalDate> = dateCertGranted

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
     * Returns the raw JSON value of [dateLastFiling].
     *
     * Unlike [dateLastFiling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_last_filing")
    @ExcludeMissing
    fun _dateLastFiling(): JsonField<LocalDate> = dateLastFiling

    /**
     * Returns the raw JSON value of [dateLastIndex].
     *
     * Unlike [dateLastIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_last_index")
    @ExcludeMissing
    fun _dateLastIndex(): JsonField<OffsetDateTime> = dateLastIndex

    /**
     * Returns the raw JSON value of [dateModified].
     *
     * Unlike [dateModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_modified")
    @ExcludeMissing
    fun _dateModified(): JsonField<OffsetDateTime> = dateModified

    /**
     * Returns the raw JSON value of [dateReargued].
     *
     * Unlike [dateReargued], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_reargued")
    @ExcludeMissing
    fun _dateReargued(): JsonField<LocalDate> = dateReargued

    /**
     * Returns the raw JSON value of [dateReargumentDenied].
     *
     * Unlike [dateReargumentDenied], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("date_reargument_denied")
    @ExcludeMissing
    fun _dateReargumentDenied(): JsonField<LocalDate> = dateReargumentDenied

    /**
     * Returns the raw JSON value of [dateTerminated].
     *
     * Unlike [dateTerminated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_terminated")
    @ExcludeMissing
    fun _dateTerminated(): JsonField<LocalDate> = dateTerminated

    /**
     * Returns the raw JSON value of [docketNumber].
     *
     * Unlike [docketNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docket_number")
    @ExcludeMissing
    fun _docketNumber(): JsonField<String> = docketNumber

    /**
     * Returns the raw JSON value of [docketNumberCore].
     *
     * Unlike [docketNumberCore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("docket_number_core")
    @ExcludeMissing
    fun _docketNumberCore(): JsonField<String> = docketNumberCore

    /**
     * Returns the raw JSON value of [filepathIa].
     *
     * Unlike [filepathIa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filepath_ia") @ExcludeMissing fun _filepathIa(): JsonField<String> = filepathIa

    /**
     * Returns the raw JSON value of [filepathIaJson].
     *
     * Unlike [filepathIaJson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filepath_ia_json")
    @ExcludeMissing
    fun _filepathIaJson(): JsonField<String> = filepathIaJson

    /**
     * Returns the raw JSON value of [iaDateFirstChange].
     *
     * Unlike [iaDateFirstChange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ia_date_first_change")
    @ExcludeMissing
    fun _iaDateFirstChange(): JsonField<OffsetDateTime> = iaDateFirstChange

    /**
     * Returns the raw JSON value of [iaNeedsUpload].
     *
     * Unlike [iaNeedsUpload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ia_needs_upload")
    @ExcludeMissing
    fun _iaNeedsUpload(): JsonField<Boolean> = iaNeedsUpload

    /**
     * Returns the raw JSON value of [iaUploadFailureCount].
     *
     * Unlike [iaUploadFailureCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ia_upload_failure_count")
    @ExcludeMissing
    fun _iaUploadFailureCount(): JsonField<Long> = iaUploadFailureCount

    /**
     * Returns the raw JSON value of [idbData].
     *
     * Unlike [idbData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idb_data") @ExcludeMissing fun _idbData(): JsonField<IdbData> = idbData

    /**
     * Returns the raw JSON value of [jurisdictionType].
     *
     * Unlike [jurisdictionType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("jurisdiction_type")
    @ExcludeMissing
    fun _jurisdictionType(): JsonField<String> = jurisdictionType

    /**
     * Returns the raw JSON value of [juryDemand].
     *
     * Unlike [juryDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jury_demand") @ExcludeMissing fun _juryDemand(): JsonField<String> = juryDemand

    /**
     * Returns the raw JSON value of [mdlStatus].
     *
     * Unlike [mdlStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mdl_status") @ExcludeMissing fun _mdlStatus(): JsonField<String> = mdlStatus

    /**
     * Returns the raw JSON value of [natureOfSuit].
     *
     * Unlike [natureOfSuit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nature_of_suit")
    @ExcludeMissing
    fun _natureOfSuit(): JsonField<String> = natureOfSuit

    /**
     * Returns the raw JSON value of [originalCourtInfo].
     *
     * Unlike [originalCourtInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("original_court_info")
    @ExcludeMissing
    fun _originalCourtInfo(): JsonField<OriginalCourtInfo> = originalCourtInfo

    /**
     * Returns the raw JSON value of [pacerCaseId].
     *
     * Unlike [pacerCaseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pacer_case_id")
    @ExcludeMissing
    fun _pacerCaseId(): JsonField<String> = pacerCaseId

    /**
     * Returns the raw JSON value of [panel].
     *
     * Unlike [panel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("panel") @ExcludeMissing fun _panel(): JsonField<List<String>> = panel

    /**
     * Returns the raw JSON value of [panelStr].
     *
     * Unlike [panelStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("panel_str") @ExcludeMissing fun _panelStr(): JsonField<String> = panelStr

    /**
     * Returns the raw JSON value of [referredTo].
     *
     * Unlike [referredTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referred_to") @ExcludeMissing fun _referredTo(): JsonField<String> = referredTo

    /**
     * Returns the raw JSON value of [referredToStr].
     *
     * Unlike [referredToStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referred_to_str")
    @ExcludeMissing
    fun _referredToStr(): JsonField<String> = referredToStr

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
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Long> = source

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

        /** Returns a mutable builder for constructing an instance of [Docket]. */
        fun builder() = Builder()
    }

    /** A builder for [Docket]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var absoluteUrl: JsonField<String> = JsonMissing.of()
        private var appealFrom: JsonField<String> = JsonMissing.of()
        private var appealFromStr: JsonField<String> = JsonMissing.of()
        private var appellateCaseTypeInformation: JsonField<String> = JsonMissing.of()
        private var appellateFeeStatus: JsonField<String> = JsonMissing.of()
        private var assignedTo: JsonField<String> = JsonMissing.of()
        private var assignedToStr: JsonField<String> = JsonMissing.of()
        private var audioFiles: JsonField<MutableList<String>>? = null
        private var bankruptcyInformation: JsonField<BankruptcyInformation> = JsonMissing.of()
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var caseName: JsonField<String> = JsonMissing.of()
        private var caseNameFull: JsonField<String> = JsonMissing.of()
        private var caseNameShort: JsonField<String> = JsonMissing.of()
        private var cause: JsonField<String> = JsonMissing.of()
        private var clusters: JsonField<MutableList<String>>? = null
        private var court: JsonField<String> = JsonMissing.of()
        private var courtId: JsonField<String> = JsonMissing.of()
        private var dateArgued: JsonField<LocalDate> = JsonMissing.of()
        private var dateBlocked: JsonField<LocalDate> = JsonMissing.of()
        private var dateCertDenied: JsonField<LocalDate> = JsonMissing.of()
        private var dateCertGranted: JsonField<LocalDate> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateFiled: JsonField<LocalDate> = JsonMissing.of()
        private var dateLastFiling: JsonField<LocalDate> = JsonMissing.of()
        private var dateLastIndex: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateReargued: JsonField<LocalDate> = JsonMissing.of()
        private var dateReargumentDenied: JsonField<LocalDate> = JsonMissing.of()
        private var dateTerminated: JsonField<LocalDate> = JsonMissing.of()
        private var docketNumber: JsonField<String> = JsonMissing.of()
        private var docketNumberCore: JsonField<String> = JsonMissing.of()
        private var filepathIa: JsonField<String> = JsonMissing.of()
        private var filepathIaJson: JsonField<String> = JsonMissing.of()
        private var iaDateFirstChange: JsonField<OffsetDateTime> = JsonMissing.of()
        private var iaNeedsUpload: JsonField<Boolean> = JsonMissing.of()
        private var iaUploadFailureCount: JsonField<Long> = JsonMissing.of()
        private var idbData: JsonField<IdbData> = JsonMissing.of()
        private var jurisdictionType: JsonField<String> = JsonMissing.of()
        private var juryDemand: JsonField<String> = JsonMissing.of()
        private var mdlStatus: JsonField<String> = JsonMissing.of()
        private var natureOfSuit: JsonField<String> = JsonMissing.of()
        private var originalCourtInfo: JsonField<OriginalCourtInfo> = JsonMissing.of()
        private var pacerCaseId: JsonField<String> = JsonMissing.of()
        private var panel: JsonField<MutableList<String>>? = null
        private var panelStr: JsonField<String> = JsonMissing.of()
        private var referredTo: JsonField<String> = JsonMissing.of()
        private var referredToStr: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var source: JsonField<Long> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(docket: Docket) = apply {
            id = docket.id
            absoluteUrl = docket.absoluteUrl
            appealFrom = docket.appealFrom
            appealFromStr = docket.appealFromStr
            appellateCaseTypeInformation = docket.appellateCaseTypeInformation
            appellateFeeStatus = docket.appellateFeeStatus
            assignedTo = docket.assignedTo
            assignedToStr = docket.assignedToStr
            audioFiles = docket.audioFiles.map { it.toMutableList() }
            bankruptcyInformation = docket.bankruptcyInformation
            blocked = docket.blocked
            caseName = docket.caseName
            caseNameFull = docket.caseNameFull
            caseNameShort = docket.caseNameShort
            cause = docket.cause
            clusters = docket.clusters.map { it.toMutableList() }
            court = docket.court
            courtId = docket.courtId
            dateArgued = docket.dateArgued
            dateBlocked = docket.dateBlocked
            dateCertDenied = docket.dateCertDenied
            dateCertGranted = docket.dateCertGranted
            dateCreated = docket.dateCreated
            dateFiled = docket.dateFiled
            dateLastFiling = docket.dateLastFiling
            dateLastIndex = docket.dateLastIndex
            dateModified = docket.dateModified
            dateReargued = docket.dateReargued
            dateReargumentDenied = docket.dateReargumentDenied
            dateTerminated = docket.dateTerminated
            docketNumber = docket.docketNumber
            docketNumberCore = docket.docketNumberCore
            filepathIa = docket.filepathIa
            filepathIaJson = docket.filepathIaJson
            iaDateFirstChange = docket.iaDateFirstChange
            iaNeedsUpload = docket.iaNeedsUpload
            iaUploadFailureCount = docket.iaUploadFailureCount
            idbData = docket.idbData
            jurisdictionType = docket.jurisdictionType
            juryDemand = docket.juryDemand
            mdlStatus = docket.mdlStatus
            natureOfSuit = docket.natureOfSuit
            originalCourtInfo = docket.originalCourtInfo
            pacerCaseId = docket.pacerCaseId
            panel = docket.panel.map { it.toMutableList() }
            panelStr = docket.panelStr
            referredTo = docket.referredTo
            referredToStr = docket.referredToStr
            resourceUri = docket.resourceUri
            slug = docket.slug
            source = docket.source
            tags = docket.tags.map { it.toMutableList() }
            additionalProperties = docket.additionalProperties.toMutableMap()
        }

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

        /** API URL of the court this case was appealed from. */
        fun appealFrom(appealFrom: String?) = appealFrom(JsonField.ofNullable(appealFrom))

        /**
         * Sets [Builder.appealFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appealFrom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appealFrom(appealFrom: JsonField<String>) = apply { this.appealFrom = appealFrom }

        fun appealFromStr(appealFromStr: String) = appealFromStr(JsonField.of(appealFromStr))

        /**
         * Sets [Builder.appealFromStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appealFromStr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appealFromStr(appealFromStr: JsonField<String>) = apply {
            this.appealFromStr = appealFromStr
        }

        fun appellateCaseTypeInformation(appellateCaseTypeInformation: String) =
            appellateCaseTypeInformation(JsonField.of(appellateCaseTypeInformation))

        /**
         * Sets [Builder.appellateCaseTypeInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appellateCaseTypeInformation] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun appellateCaseTypeInformation(appellateCaseTypeInformation: JsonField<String>) = apply {
            this.appellateCaseTypeInformation = appellateCaseTypeInformation
        }

        fun appellateFeeStatus(appellateFeeStatus: String) =
            appellateFeeStatus(JsonField.of(appellateFeeStatus))

        /**
         * Sets [Builder.appellateFeeStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appellateFeeStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appellateFeeStatus(appellateFeeStatus: JsonField<String>) = apply {
            this.appellateFeeStatus = appellateFeeStatus
        }

        /** API URL of the assigned judge. */
        fun assignedTo(assignedTo: String?) = assignedTo(JsonField.ofNullable(assignedTo))

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

        /** Name of the assigned judge (string, not normalized). */
        fun assignedToStr(assignedToStr: String) = assignedToStr(JsonField.of(assignedToStr))

        /**
         * Sets [Builder.assignedToStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedToStr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedToStr(assignedToStr: JsonField<String>) = apply {
            this.assignedToStr = assignedToStr
        }

        /** API URLs of related oral argument audio files. */
        fun audioFiles(audioFiles: List<String>) = audioFiles(JsonField.of(audioFiles))

        /**
         * Sets [Builder.audioFiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioFiles] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audioFiles(audioFiles: JsonField<List<String>>) = apply {
            this.audioFiles = audioFiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [audioFiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAudioFile(audioFile: String) = apply {
            audioFiles =
                (audioFiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("audioFiles", it).add(audioFile)
                }
        }

        /** Bankruptcy-specific information, if applicable. */
        fun bankruptcyInformation(bankruptcyInformation: BankruptcyInformation?) =
            bankruptcyInformation(JsonField.ofNullable(bankruptcyInformation))

        /**
         * Sets [Builder.bankruptcyInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankruptcyInformation] with a well-typed
         * [BankruptcyInformation] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun bankruptcyInformation(bankruptcyInformation: JsonField<BankruptcyInformation>) = apply {
            this.bankruptcyInformation = bankruptcyInformation
        }

        fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

        /**
         * Current case name. May change over time (e.g. if a named party changes). See also the
         * cluster's case_name which is frozen at decision time.
         */
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

        fun cause(cause: String?) = cause(JsonField.ofNullable(cause))

        /**
         * Sets [Builder.cause] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cause] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cause(cause: JsonField<String>) = apply { this.cause = cause }

        /** API URLs of related opinion clusters. */
        fun clusters(clusters: List<String>) = clusters(JsonField.of(clusters))

        /**
         * Sets [Builder.clusters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusters] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clusters(clusters: JsonField<List<String>>) = apply {
            this.clusters = clusters.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [clusters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCluster(cluster: String) = apply {
            clusters =
                (clusters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clusters", it).add(cluster)
                }
        }

        /** API URL of the court. */
        fun court(court: String) = court(JsonField.of(court))

        /**
         * Sets [Builder.court] to an arbitrary JSON value.
         *
         * You should usually call [Builder.court] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun court(court: JsonField<String>) = apply { this.court = court }

        /** Court identifier string. */
        fun courtId(courtId: String) = courtId(JsonField.of(courtId))

        /**
         * Sets [Builder.courtId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.courtId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun courtId(courtId: JsonField<String>) = apply { this.courtId = courtId }

        fun dateArgued(dateArgued: LocalDate?) = dateArgued(JsonField.ofNullable(dateArgued))

        /**
         * Sets [Builder.dateArgued] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateArgued] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateArgued(dateArgued: JsonField<LocalDate>) = apply { this.dateArgued = dateArgued }

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

        fun dateCertDenied(dateCertDenied: LocalDate?) =
            dateCertDenied(JsonField.ofNullable(dateCertDenied))

        /**
         * Sets [Builder.dateCertDenied] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCertDenied] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCertDenied(dateCertDenied: JsonField<LocalDate>) = apply {
            this.dateCertDenied = dateCertDenied
        }

        fun dateCertGranted(dateCertGranted: LocalDate?) =
            dateCertGranted(JsonField.ofNullable(dateCertGranted))

        /**
         * Sets [Builder.dateCertGranted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCertGranted] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCertGranted(dateCertGranted: JsonField<LocalDate>) = apply {
            this.dateCertGranted = dateCertGranted
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

        fun dateLastFiling(dateLastFiling: LocalDate?) =
            dateLastFiling(JsonField.ofNullable(dateLastFiling))

        /**
         * Sets [Builder.dateLastFiling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastFiling] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLastFiling(dateLastFiling: JsonField<LocalDate>) = apply {
            this.dateLastFiling = dateLastFiling
        }

        fun dateLastIndex(dateLastIndex: OffsetDateTime?) =
            dateLastIndex(JsonField.ofNullable(dateLastIndex))

        /**
         * Sets [Builder.dateLastIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastIndex] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLastIndex(dateLastIndex: JsonField<OffsetDateTime>) = apply {
            this.dateLastIndex = dateLastIndex
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

        fun dateReargued(dateReargued: LocalDate?) =
            dateReargued(JsonField.ofNullable(dateReargued))

        /**
         * Sets [Builder.dateReargued] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateReargued] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateReargued(dateReargued: JsonField<LocalDate>) = apply {
            this.dateReargued = dateReargued
        }

        fun dateReargumentDenied(dateReargumentDenied: LocalDate?) =
            dateReargumentDenied(JsonField.ofNullable(dateReargumentDenied))

        /**
         * Sets [Builder.dateReargumentDenied] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateReargumentDenied] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateReargumentDenied(dateReargumentDenied: JsonField<LocalDate>) = apply {
            this.dateReargumentDenied = dateReargumentDenied
        }

        fun dateTerminated(dateTerminated: LocalDate?) =
            dateTerminated(JsonField.ofNullable(dateTerminated))

        /**
         * Sets [Builder.dateTerminated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateTerminated] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateTerminated(dateTerminated: JsonField<LocalDate>) = apply {
            this.dateTerminated = dateTerminated
        }

        /** The docket number assigned by the court. */
        fun docketNumber(docketNumber: String) = docketNumber(JsonField.of(docketNumber))

        /**
         * Sets [Builder.docketNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docketNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun docketNumber(docketNumber: JsonField<String>) = apply {
            this.docketNumber = docketNumber
        }

        /** Normalized core docket number. */
        fun docketNumberCore(docketNumberCore: String) =
            docketNumberCore(JsonField.of(docketNumberCore))

        /**
         * Sets [Builder.docketNumberCore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docketNumberCore] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun docketNumberCore(docketNumberCore: JsonField<String>) = apply {
            this.docketNumberCore = docketNumberCore
        }

        /** URL to the Internet Archive docket file. */
        fun filepathIa(filepathIa: String?) = filepathIa(JsonField.ofNullable(filepathIa))

        /**
         * Sets [Builder.filepathIa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filepathIa] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filepathIa(filepathIa: JsonField<String>) = apply { this.filepathIa = filepathIa }

        /** URL to the Internet Archive JSON docket file. */
        fun filepathIaJson(filepathIaJson: String?) =
            filepathIaJson(JsonField.ofNullable(filepathIaJson))

        /**
         * Sets [Builder.filepathIaJson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filepathIaJson] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filepathIaJson(filepathIaJson: JsonField<String>) = apply {
            this.filepathIaJson = filepathIaJson
        }

        fun iaDateFirstChange(iaDateFirstChange: OffsetDateTime?) =
            iaDateFirstChange(JsonField.ofNullable(iaDateFirstChange))

        /**
         * Sets [Builder.iaDateFirstChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iaDateFirstChange] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun iaDateFirstChange(iaDateFirstChange: JsonField<OffsetDateTime>) = apply {
            this.iaDateFirstChange = iaDateFirstChange
        }

        fun iaNeedsUpload(iaNeedsUpload: Boolean?) =
            iaNeedsUpload(JsonField.ofNullable(iaNeedsUpload))

        /**
         * Alias for [Builder.iaNeedsUpload].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun iaNeedsUpload(iaNeedsUpload: Boolean) = iaNeedsUpload(iaNeedsUpload as Boolean?)

        /**
         * Sets [Builder.iaNeedsUpload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iaNeedsUpload] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun iaNeedsUpload(iaNeedsUpload: JsonField<Boolean>) = apply {
            this.iaNeedsUpload = iaNeedsUpload
        }

        fun iaUploadFailureCount(iaUploadFailureCount: Long?) =
            iaUploadFailureCount(JsonField.ofNullable(iaUploadFailureCount))

        /**
         * Alias for [Builder.iaUploadFailureCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun iaUploadFailureCount(iaUploadFailureCount: Long) =
            iaUploadFailureCount(iaUploadFailureCount as Long?)

        /**
         * Sets [Builder.iaUploadFailureCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iaUploadFailureCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun iaUploadFailureCount(iaUploadFailureCount: JsonField<Long>) = apply {
            this.iaUploadFailureCount = iaUploadFailureCount
        }

        /** Integrated database data, if available. */
        fun idbData(idbData: IdbData?) = idbData(JsonField.ofNullable(idbData))

        /**
         * Sets [Builder.idbData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idbData] with a well-typed [IdbData] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idbData(idbData: JsonField<IdbData>) = apply { this.idbData = idbData }

        fun jurisdictionType(jurisdictionType: String?) =
            jurisdictionType(JsonField.ofNullable(jurisdictionType))

        /**
         * Sets [Builder.jurisdictionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdictionType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jurisdictionType(jurisdictionType: JsonField<String>) = apply {
            this.jurisdictionType = jurisdictionType
        }

        fun juryDemand(juryDemand: String?) = juryDemand(JsonField.ofNullable(juryDemand))

        /**
         * Sets [Builder.juryDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.juryDemand] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun juryDemand(juryDemand: JsonField<String>) = apply { this.juryDemand = juryDemand }

        fun mdlStatus(mdlStatus: String) = mdlStatus(JsonField.of(mdlStatus))

        /**
         * Sets [Builder.mdlStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mdlStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mdlStatus(mdlStatus: JsonField<String>) = apply { this.mdlStatus = mdlStatus }

        fun natureOfSuit(natureOfSuit: String?) = natureOfSuit(JsonField.ofNullable(natureOfSuit))

        /**
         * Sets [Builder.natureOfSuit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.natureOfSuit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun natureOfSuit(natureOfSuit: JsonField<String>) = apply {
            this.natureOfSuit = natureOfSuit
        }

        /** Original court information, if available. */
        fun originalCourtInfo(originalCourtInfo: OriginalCourtInfo?) =
            originalCourtInfo(JsonField.ofNullable(originalCourtInfo))

        /**
         * Sets [Builder.originalCourtInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalCourtInfo] with a well-typed [OriginalCourtInfo]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originalCourtInfo(originalCourtInfo: JsonField<OriginalCourtInfo>) = apply {
            this.originalCourtInfo = originalCourtInfo
        }

        fun pacerCaseId(pacerCaseId: String?) = pacerCaseId(JsonField.ofNullable(pacerCaseId))

        /**
         * Sets [Builder.pacerCaseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pacerCaseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pacerCaseId(pacerCaseId: JsonField<String>) = apply { this.pacerCaseId = pacerCaseId }

        /** API URLs of judges on the panel. */
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

        fun panelStr(panelStr: String) = panelStr(JsonField.of(panelStr))

        /**
         * Sets [Builder.panelStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panelStr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun panelStr(panelStr: JsonField<String>) = apply { this.panelStr = panelStr }

        /** API URL of the referred judge. */
        fun referredTo(referredTo: String?) = referredTo(JsonField.ofNullable(referredTo))

        /**
         * Sets [Builder.referredTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredTo(referredTo: JsonField<String>) = apply { this.referredTo = referredTo }

        fun referredToStr(referredToStr: String) = referredToStr(JsonField.of(referredToStr))

        /**
         * Sets [Builder.referredToStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredToStr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredToStr(referredToStr: JsonField<String>) = apply {
            this.referredToStr = referredToStr
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

        /** Numeric source identifier. */
        fun source(source: Long) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Long>) = apply { this.source = source }

        /** API URLs of tags on this docket. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

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
         * Returns an immutable instance of [Docket].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Docket =
            Docket(
                id,
                absoluteUrl,
                appealFrom,
                appealFromStr,
                appellateCaseTypeInformation,
                appellateFeeStatus,
                assignedTo,
                assignedToStr,
                (audioFiles ?: JsonMissing.of()).map { it.toImmutable() },
                bankruptcyInformation,
                blocked,
                caseName,
                caseNameFull,
                caseNameShort,
                cause,
                (clusters ?: JsonMissing.of()).map { it.toImmutable() },
                court,
                courtId,
                dateArgued,
                dateBlocked,
                dateCertDenied,
                dateCertGranted,
                dateCreated,
                dateFiled,
                dateLastFiling,
                dateLastIndex,
                dateModified,
                dateReargued,
                dateReargumentDenied,
                dateTerminated,
                docketNumber,
                docketNumberCore,
                filepathIa,
                filepathIaJson,
                iaDateFirstChange,
                iaNeedsUpload,
                iaUploadFailureCount,
                idbData,
                jurisdictionType,
                juryDemand,
                mdlStatus,
                natureOfSuit,
                originalCourtInfo,
                pacerCaseId,
                (panel ?: JsonMissing.of()).map { it.toImmutable() },
                panelStr,
                referredTo,
                referredToStr,
                resourceUri,
                slug,
                source,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): Docket = apply {
        if (validated) {
            return@apply
        }

        id()
        absoluteUrl()
        appealFrom()
        appealFromStr()
        appellateCaseTypeInformation()
        appellateFeeStatus()
        assignedTo()
        assignedToStr()
        audioFiles()
        bankruptcyInformation()?.validate()
        blocked()
        caseName()
        caseNameFull()
        caseNameShort()
        cause()
        clusters()
        court()
        courtId()
        dateArgued()
        dateBlocked()
        dateCertDenied()
        dateCertGranted()
        dateCreated()
        dateFiled()
        dateLastFiling()
        dateLastIndex()
        dateModified()
        dateReargued()
        dateReargumentDenied()
        dateTerminated()
        docketNumber()
        docketNumberCore()
        filepathIa()
        filepathIaJson()
        iaDateFirstChange()
        iaNeedsUpload()
        iaUploadFailureCount()
        idbData()?.validate()
        jurisdictionType()
        juryDemand()
        mdlStatus()
        natureOfSuit()
        originalCourtInfo()?.validate()
        pacerCaseId()
        panel()
        panelStr()
        referredTo()
        referredToStr()
        resourceUri()
        slug()
        source()
        tags()
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
            (if (appealFrom.asKnown() == null) 0 else 1) +
            (if (appealFromStr.asKnown() == null) 0 else 1) +
            (if (appellateCaseTypeInformation.asKnown() == null) 0 else 1) +
            (if (appellateFeeStatus.asKnown() == null) 0 else 1) +
            (if (assignedTo.asKnown() == null) 0 else 1) +
            (if (assignedToStr.asKnown() == null) 0 else 1) +
            (audioFiles.asKnown()?.size ?: 0) +
            (bankruptcyInformation.asKnown()?.validity() ?: 0) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (caseName.asKnown() == null) 0 else 1) +
            (if (caseNameFull.asKnown() == null) 0 else 1) +
            (if (caseNameShort.asKnown() == null) 0 else 1) +
            (if (cause.asKnown() == null) 0 else 1) +
            (clusters.asKnown()?.size ?: 0) +
            (if (court.asKnown() == null) 0 else 1) +
            (if (courtId.asKnown() == null) 0 else 1) +
            (if (dateArgued.asKnown() == null) 0 else 1) +
            (if (dateBlocked.asKnown() == null) 0 else 1) +
            (if (dateCertDenied.asKnown() == null) 0 else 1) +
            (if (dateCertGranted.asKnown() == null) 0 else 1) +
            (if (dateCreated.asKnown() == null) 0 else 1) +
            (if (dateFiled.asKnown() == null) 0 else 1) +
            (if (dateLastFiling.asKnown() == null) 0 else 1) +
            (if (dateLastIndex.asKnown() == null) 0 else 1) +
            (if (dateModified.asKnown() == null) 0 else 1) +
            (if (dateReargued.asKnown() == null) 0 else 1) +
            (if (dateReargumentDenied.asKnown() == null) 0 else 1) +
            (if (dateTerminated.asKnown() == null) 0 else 1) +
            (if (docketNumber.asKnown() == null) 0 else 1) +
            (if (docketNumberCore.asKnown() == null) 0 else 1) +
            (if (filepathIa.asKnown() == null) 0 else 1) +
            (if (filepathIaJson.asKnown() == null) 0 else 1) +
            (if (iaDateFirstChange.asKnown() == null) 0 else 1) +
            (if (iaNeedsUpload.asKnown() == null) 0 else 1) +
            (if (iaUploadFailureCount.asKnown() == null) 0 else 1) +
            (idbData.asKnown()?.validity() ?: 0) +
            (if (jurisdictionType.asKnown() == null) 0 else 1) +
            (if (juryDemand.asKnown() == null) 0 else 1) +
            (if (mdlStatus.asKnown() == null) 0 else 1) +
            (if (natureOfSuit.asKnown() == null) 0 else 1) +
            (originalCourtInfo.asKnown()?.validity() ?: 0) +
            (if (pacerCaseId.asKnown() == null) 0 else 1) +
            (panel.asKnown()?.size ?: 0) +
            (if (panelStr.asKnown() == null) 0 else 1) +
            (if (referredTo.asKnown() == null) 0 else 1) +
            (if (referredToStr.asKnown() == null) 0 else 1) +
            (if (resourceUri.asKnown() == null) 0 else 1) +
            (if (slug.asKnown() == null) 0 else 1) +
            (if (source.asKnown() == null) 0 else 1) +
            (tags.asKnown()?.size ?: 0)

    /** Bankruptcy-specific information, if applicable. */
    class BankruptcyInformation
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [BankruptcyInformation].
             */
            fun builder() = Builder()
        }

        /** A builder for [BankruptcyInformation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bankruptcyInformation: BankruptcyInformation) = apply {
                additionalProperties = bankruptcyInformation.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [BankruptcyInformation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BankruptcyInformation =
                BankruptcyInformation(additionalProperties.toImmutable())
        }

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
        fun validate(): BankruptcyInformation = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BankruptcyInformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BankruptcyInformation{additionalProperties=$additionalProperties}"
    }

    /** Integrated database data, if available. */
    class IdbData
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [IdbData]. */
            fun builder() = Builder()
        }

        /** A builder for [IdbData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(idbData: IdbData) = apply {
                additionalProperties = idbData.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [IdbData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IdbData = IdbData(additionalProperties.toImmutable())
        }

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
        fun validate(): IdbData = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdbData && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "IdbData{additionalProperties=$additionalProperties}"
    }

    /** Original court information, if available. */
    class OriginalCourtInfo
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OriginalCourtInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [OriginalCourtInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(originalCourtInfo: OriginalCourtInfo) = apply {
                additionalProperties = originalCourtInfo.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [OriginalCourtInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OriginalCourtInfo = OriginalCourtInfo(additionalProperties.toImmutable())
        }

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
        fun validate(): OriginalCourtInfo = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OriginalCourtInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OriginalCourtInfo{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Docket &&
            id == other.id &&
            absoluteUrl == other.absoluteUrl &&
            appealFrom == other.appealFrom &&
            appealFromStr == other.appealFromStr &&
            appellateCaseTypeInformation == other.appellateCaseTypeInformation &&
            appellateFeeStatus == other.appellateFeeStatus &&
            assignedTo == other.assignedTo &&
            assignedToStr == other.assignedToStr &&
            audioFiles == other.audioFiles &&
            bankruptcyInformation == other.bankruptcyInformation &&
            blocked == other.blocked &&
            caseName == other.caseName &&
            caseNameFull == other.caseNameFull &&
            caseNameShort == other.caseNameShort &&
            cause == other.cause &&
            clusters == other.clusters &&
            court == other.court &&
            courtId == other.courtId &&
            dateArgued == other.dateArgued &&
            dateBlocked == other.dateBlocked &&
            dateCertDenied == other.dateCertDenied &&
            dateCertGranted == other.dateCertGranted &&
            dateCreated == other.dateCreated &&
            dateFiled == other.dateFiled &&
            dateLastFiling == other.dateLastFiling &&
            dateLastIndex == other.dateLastIndex &&
            dateModified == other.dateModified &&
            dateReargued == other.dateReargued &&
            dateReargumentDenied == other.dateReargumentDenied &&
            dateTerminated == other.dateTerminated &&
            docketNumber == other.docketNumber &&
            docketNumberCore == other.docketNumberCore &&
            filepathIa == other.filepathIa &&
            filepathIaJson == other.filepathIaJson &&
            iaDateFirstChange == other.iaDateFirstChange &&
            iaNeedsUpload == other.iaNeedsUpload &&
            iaUploadFailureCount == other.iaUploadFailureCount &&
            idbData == other.idbData &&
            jurisdictionType == other.jurisdictionType &&
            juryDemand == other.juryDemand &&
            mdlStatus == other.mdlStatus &&
            natureOfSuit == other.natureOfSuit &&
            originalCourtInfo == other.originalCourtInfo &&
            pacerCaseId == other.pacerCaseId &&
            panel == other.panel &&
            panelStr == other.panelStr &&
            referredTo == other.referredTo &&
            referredToStr == other.referredToStr &&
            resourceUri == other.resourceUri &&
            slug == other.slug &&
            source == other.source &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            absoluteUrl,
            appealFrom,
            appealFromStr,
            appellateCaseTypeInformation,
            appellateFeeStatus,
            assignedTo,
            assignedToStr,
            audioFiles,
            bankruptcyInformation,
            blocked,
            caseName,
            caseNameFull,
            caseNameShort,
            cause,
            clusters,
            court,
            courtId,
            dateArgued,
            dateBlocked,
            dateCertDenied,
            dateCertGranted,
            dateCreated,
            dateFiled,
            dateLastFiling,
            dateLastIndex,
            dateModified,
            dateReargued,
            dateReargumentDenied,
            dateTerminated,
            docketNumber,
            docketNumberCore,
            filepathIa,
            filepathIaJson,
            iaDateFirstChange,
            iaNeedsUpload,
            iaUploadFailureCount,
            idbData,
            jurisdictionType,
            juryDemand,
            mdlStatus,
            natureOfSuit,
            originalCourtInfo,
            pacerCaseId,
            panel,
            panelStr,
            referredTo,
            referredToStr,
            resourceUri,
            slug,
            source,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Docket{id=$id, absoluteUrl=$absoluteUrl, appealFrom=$appealFrom, appealFromStr=$appealFromStr, appellateCaseTypeInformation=$appellateCaseTypeInformation, appellateFeeStatus=$appellateFeeStatus, assignedTo=$assignedTo, assignedToStr=$assignedToStr, audioFiles=$audioFiles, bankruptcyInformation=$bankruptcyInformation, blocked=$blocked, caseName=$caseName, caseNameFull=$caseNameFull, caseNameShort=$caseNameShort, cause=$cause, clusters=$clusters, court=$court, courtId=$courtId, dateArgued=$dateArgued, dateBlocked=$dateBlocked, dateCertDenied=$dateCertDenied, dateCertGranted=$dateCertGranted, dateCreated=$dateCreated, dateFiled=$dateFiled, dateLastFiling=$dateLastFiling, dateLastIndex=$dateLastIndex, dateModified=$dateModified, dateReargued=$dateReargued, dateReargumentDenied=$dateReargumentDenied, dateTerminated=$dateTerminated, docketNumber=$docketNumber, docketNumberCore=$docketNumberCore, filepathIa=$filepathIa, filepathIaJson=$filepathIaJson, iaDateFirstChange=$iaDateFirstChange, iaNeedsUpload=$iaNeedsUpload, iaUploadFailureCount=$iaUploadFailureCount, idbData=$idbData, jurisdictionType=$jurisdictionType, juryDemand=$juryDemand, mdlStatus=$mdlStatus, natureOfSuit=$natureOfSuit, originalCourtInfo=$originalCourtInfo, pacerCaseId=$pacerCaseId, panel=$panel, panelStr=$panelStr, referredTo=$referredTo, referredToStr=$referredToStr, resourceUri=$resourceUri, slug=$slug, source=$source, tags=$tags, additionalProperties=$additionalProperties}"
}
