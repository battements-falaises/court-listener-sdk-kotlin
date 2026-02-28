// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClientAsync
import com.court_listener_sdk.api.models.clusters.ClusterRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ClusterServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.clusters()

        val cluster =
            clusterServiceAsync.retrieve(
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
    suspend fun list() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.clusters()

        val page = clusterServiceAsync.list()

        page.response().validate()
    }
}
