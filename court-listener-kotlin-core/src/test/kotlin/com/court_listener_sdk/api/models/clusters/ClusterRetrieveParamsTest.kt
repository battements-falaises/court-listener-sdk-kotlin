// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterRetrieveParamsTest {

    @Test
    fun create() {
        ClusterRetrieveParams.builder()
            .id(0L)
            .fields("fields")
            .format(ClusterRetrieveParams.Format.JSON)
            .omit("omit")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ClusterRetrieveParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ClusterRetrieveParams.builder()
                .id(0L)
                .fields("fields")
                .format(ClusterRetrieveParams.Format.JSON)
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
        val params = ClusterRetrieveParams.builder().id(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
