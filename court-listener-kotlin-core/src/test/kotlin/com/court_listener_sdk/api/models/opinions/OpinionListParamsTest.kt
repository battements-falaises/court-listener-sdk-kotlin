// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpinionListParamsTest {

    @Test
    fun create() {
        OpinionListParams.builder()
            .id(0L)
            .citedOpinion(0L)
            .cluster(0L)
            .clusterDocketCourt("cluster__docket__court")
            .clusterDocketDocketNumber("cluster__docket__docket_number")
            .count(OpinionListParams.Count.ON)
            .cursor("cursor")
            .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateCreatedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateCreatedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fields("fields")
            .format(OpinionListParams.Format.JSON)
            .idGt(0L)
            .idGte(0L)
            .idLt(0L)
            .idLte(0L)
            .idRange("id__range")
            .omit("omit")
            .orderBy("order_by")
            .page(1L)
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OpinionListParams.builder()
                .id(0L)
                .citedOpinion(0L)
                .cluster(0L)
                .clusterDocketCourt("cluster__docket__court")
                .clusterDocketDocketNumber("cluster__docket__docket_number")
                .count(OpinionListParams.Count.ON)
                .cursor("cursor")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateCreatedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateCreatedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fields("fields")
                .format(OpinionListParams.Format.JSON)
                .idGt(0L)
                .idGte(0L)
                .idLt(0L)
                .idLte(0L)
                .idRange("id__range")
                .omit("omit")
                .orderBy("order_by")
                .page(1L)
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "0")
                    .put("cited_opinion", "0")
                    .put("cluster", "0")
                    .put("cluster__docket__court", "cluster__docket__court")
                    .put("cluster__docket__docket_number", "cluster__docket__docket_number")
                    .put("count", "on")
                    .put("cursor", "cursor")
                    .put("date_created", "2019-12-27T18:11:19.117Z")
                    .put("date_created__gte", "2019-12-27T18:11:19.117Z")
                    .put("date_created__lte", "2019-12-27T18:11:19.117Z")
                    .put("date_modified", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__gte", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__lte", "2019-12-27T18:11:19.117Z")
                    .put("fields", "fields")
                    .put("format", "json")
                    .put("id__gt", "0")
                    .put("id__gte", "0")
                    .put("id__lt", "0")
                    .put("id__lte", "0")
                    .put("id__range", "id__range")
                    .put("omit", "omit")
                    .put("order_by", "order_by")
                    .put("page", "1")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OpinionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
