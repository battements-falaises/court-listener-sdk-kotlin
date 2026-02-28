// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClientAsync
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CourtServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val courtServiceAsync = client.courts()

        val court =
            courtServiceAsync.retrieve(
                CourtRetrieveParams.builder()
                    .id("id")
                    .fields("fields")
                    .format(CourtRetrieveParams.Format.JSON)
                    .omit("omit")
                    .build()
            )

        court.validate()
    }

    @Test
    suspend fun list() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val courtServiceAsync = client.courts()

        val page = courtServiceAsync.list()

        page.response().validate()
    }
}
