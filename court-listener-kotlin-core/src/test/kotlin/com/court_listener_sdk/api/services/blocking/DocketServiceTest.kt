// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.models.dockets.DocketRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocketServiceTest {

    @Test
    fun retrieve() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val docketService = client.dockets()

        val docket =
            docketService.retrieve(
                DocketRetrieveParams.builder()
                    .id(0L)
                    .fields("fields")
                    .format(DocketRetrieveParams.Format.JSON)
                    .omit("omit")
                    .build()
            )

        docket.validate()
    }

    @Test
    fun list() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val docketService = client.dockets()

        val page = docketService.list()

        page.response().validate()
    }
}
