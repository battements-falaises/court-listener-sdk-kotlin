// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.dockets

import com.court_listener_sdk.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocketListParamsTest {

    @Test
    fun create() {
        DocketListParams.builder()
            .id(0L)
            .blocked(true)
            .caseName("case_name")
            .cause("cause")
            .count(DocketListParams.Count.ON)
            .court("court")
            .queryCourtJurisdiction1("court__jurisdiction")
            .queryCourtJurisdiction2("court__jurisdiction!")
            .cursor("cursor")
            .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateCreatedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateCreatedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateFiled(LocalDate.parse("2019-12-27"))
            .dateFiledGte(LocalDate.parse("2019-12-27"))
            .dateFiledLte(LocalDate.parse("2019-12-27"))
            .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateTerminated(LocalDate.parse("2019-12-27"))
            .dateTerminatedGte(LocalDate.parse("2019-12-27"))
            .dateTerminatedLte(LocalDate.parse("2019-12-27"))
            .docketNumber("docket_number")
            .fields("fields")
            .format(DocketListParams.Format.JSON)
            .idGt(0L)
            .idGte(0L)
            .idLt(0L)
            .idLte(0L)
            .idRange("id__range")
            .natureOfSuit("nature_of_suit")
            .omit("omit")
            .orderBy("order_by")
            .page(1L)
            .source(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocketListParams.builder()
                .id(0L)
                .blocked(true)
                .caseName("case_name")
                .cause("cause")
                .count(DocketListParams.Count.ON)
                .court("court")
                .queryCourtJurisdiction1("court__jurisdiction")
                .queryCourtJurisdiction2("court__jurisdiction!")
                .cursor("cursor")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateCreatedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateCreatedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateFiled(LocalDate.parse("2019-12-27"))
                .dateFiledGte(LocalDate.parse("2019-12-27"))
                .dateFiledLte(LocalDate.parse("2019-12-27"))
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateTerminated(LocalDate.parse("2019-12-27"))
                .dateTerminatedGte(LocalDate.parse("2019-12-27"))
                .dateTerminatedLte(LocalDate.parse("2019-12-27"))
                .docketNumber("docket_number")
                .fields("fields")
                .format(DocketListParams.Format.JSON)
                .idGt(0L)
                .idGte(0L)
                .idLt(0L)
                .idLte(0L)
                .idRange("id__range")
                .natureOfSuit("nature_of_suit")
                .omit("omit")
                .orderBy("order_by")
                .page(1L)
                .source(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "0")
                    .put("blocked", "true")
                    .put("case_name", "case_name")
                    .put("cause", "cause")
                    .put("count", "on")
                    .put("court", "court")
                    .put("court__jurisdiction", "court__jurisdiction")
                    .put("court__jurisdiction!", "court__jurisdiction!")
                    .put("cursor", "cursor")
                    .put("date_created", "2019-12-27T18:11:19.117Z")
                    .put("date_created__gte", "2019-12-27T18:11:19.117Z")
                    .put("date_created__lte", "2019-12-27T18:11:19.117Z")
                    .put("date_filed", "2019-12-27")
                    .put("date_filed__gte", "2019-12-27")
                    .put("date_filed__lte", "2019-12-27")
                    .put("date_modified", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__gte", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__lte", "2019-12-27T18:11:19.117Z")
                    .put("date_terminated", "2019-12-27")
                    .put("date_terminated__gte", "2019-12-27")
                    .put("date_terminated__lte", "2019-12-27")
                    .put("docket_number", "docket_number")
                    .put("fields", "fields")
                    .put("format", "json")
                    .put("id__gt", "0")
                    .put("id__gte", "0")
                    .put("id__lt", "0")
                    .put("id__lte", "0")
                    .put("id__range", "id__range")
                    .put("nature_of_suit", "nature_of_suit")
                    .put("omit", "omit")
                    .put("order_by", "order_by")
                    .put("page", "1")
                    .put("source", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocketListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
