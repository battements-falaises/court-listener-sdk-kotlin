// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ClusterServiceTest {

    @Test
    fun retrieve() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.clusters()

        val cluster =
            clusterService.retrieve(
                ClusterRetrieveParams.builder()
                    .id(0L)
                    .fields("fields")
                    .format(ClusterRetrieveParams.Format.JSON)
                    .omit("omit")
                    .build()
            )

        cluster.validate()
    }

    @Test
    fun list() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.clusters()

        val page = clusterService.list()

        page.response().validate()
    }
}
