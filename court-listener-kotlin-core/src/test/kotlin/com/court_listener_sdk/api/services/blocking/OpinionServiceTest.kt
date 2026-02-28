// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.blocking

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OpinionServiceTest {

    @Test
    fun retrieve() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val opinionService = client.opinions()

        val opinion =
            opinionService.retrieve(
                OpinionRetrieveParams.builder()
                    .id(0L)
                    .fields("fields")
                    .format(OpinionRetrieveParams.Format.JSON)
                    .omit("omit")
                    .build()
            )

        opinion.validate()
    }

    @Test
    fun list() {
        val client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val opinionService = client.opinions()

        val page = opinionService.list()

        page.response().validate()
    }
}
