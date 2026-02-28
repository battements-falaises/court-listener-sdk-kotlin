// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CourtListParamsTest {

    @Test
    fun create() {
        CourtListParams.builder()
            .id("id")
            .count(CourtListParams.Count.ON)
            .cursor("cursor")
            .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fields("fields")
            .format(CourtListParams.Format.JSON)
            .fullName("full_name")
            .fullNameStartswith("full_name__startswith")
            .idIn("id__in")
            .jurisdiction("jurisdiction")
            .omit("omit")
            .orderBy("order_by")
            .page(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CourtListParams.builder()
                .id("id")
                .count(CourtListParams.Count.ON)
                .cursor("cursor")
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModifiedLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fields("fields")
                .format(CourtListParams.Format.JSON)
                .fullName("full_name")
                .fullNameStartswith("full_name__startswith")
                .idIn("id__in")
                .jurisdiction("jurisdiction")
                .omit("omit")
                .orderBy("order_by")
                .page(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("count", "on")
                    .put("cursor", "cursor")
                    .put("date_modified", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__gte", "2019-12-27T18:11:19.117Z")
                    .put("date_modified__lte", "2019-12-27T18:11:19.117Z")
                    .put("fields", "fields")
                    .put("format", "json")
                    .put("full_name", "full_name")
                    .put("full_name__startswith", "full_name__startswith")
                    .put("id__in", "id__in")
                    .put("jurisdiction", "jurisdiction")
                    .put("omit", "omit")
                    .put("order_by", "order_by")
                    .put("page", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CourtListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
