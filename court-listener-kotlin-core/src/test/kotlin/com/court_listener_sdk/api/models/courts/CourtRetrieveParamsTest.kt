// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CourtRetrieveParamsTest {

    @Test
    fun create() {
        CourtRetrieveParams.builder()
            .id("id")
            .fields("fields")
            .format(CourtRetrieveParams.Format.JSON)
            .omit("omit")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CourtRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CourtRetrieveParams.builder()
                .id("id")
                .fields("fields")
                .format(CourtRetrieveParams.Format.JSON)
                .omit("omit")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("fields", "fields")
                    .put("format", "json")
                    .put("omit", "omit")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CourtRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
