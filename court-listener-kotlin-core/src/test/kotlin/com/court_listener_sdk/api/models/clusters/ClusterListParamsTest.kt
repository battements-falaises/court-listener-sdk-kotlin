// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterListParamsTest {

    @Test
    fun create() {
        ClusterListParams.builder()
            .id(0L)
            .citation("citation")
            .count(ClusterListParams.Count.ON)
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
            .docket(0L)
            .docketCourt("docket__court")
            .docketDocketNumber("docket__docket_number")
            .fields("fields")
            .format(ClusterListParams.Format.JSON)
            .idGt(0L)
            .idGte(0L)
            .idLt(0L)
            .idLte(0L)
            .idRange("id__range")
            .judges("judges")
            .omit("omit")
            .orderBy("order_by")
            .page(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ClusterListParams.builder()
                .id(0L)
                .citation("citation")
                .count(ClusterListParams.Count.ON)
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
                .docket(0L)
                .docketCourt("docket__court")
                .docketDocketNumber("docket__docket_number")
                .fields("fields")
                .format(ClusterListParams.Format.JSON)
                .idGt(0L)
                .idGte(0L)
                .idLt(0L)
                .idLte(0L)
                .idRange("id__range")
                .judges("judges")
                .omit("omit")
                .orderBy("order_by")
                .page(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "0")
                    .put("citation", "citation")
                    .put("count", "on")
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
                    .put("docket", "0")
                    .put("docket__court", "docket__court")
                    .put("docket__docket_number", "docket__docket_number")
                    .put("fields", "fields")
                    .put("format", "json")
                    .put("id__gt", "0")
                    .put("id__gte", "0")
                    .put("id__lt", "0")
                    .put("id__lte", "0")
                    .put("id__range", "id__range")
                    .put("judges", "judges")
                    .put("omit", "omit")
                    .put("order_by", "order_by")
                    .put("page", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ClusterListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
