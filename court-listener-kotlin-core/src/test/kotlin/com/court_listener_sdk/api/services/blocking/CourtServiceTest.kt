// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.models.courts.CourtRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CourtServiceTest {

    @Test
    fun retrieve() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val courtService = client.courts()

        val court =
            courtService.retrieve(
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
    fun list() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val courtService = client.courts()

        val page = courtService.list()

        page.response().validate()
    }
}
