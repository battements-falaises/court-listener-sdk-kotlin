// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClientAsync
import com.court_listener_sdk.api.models.opinions.OpinionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OpinionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val opinionServiceAsync = client.opinions()

        val opinion =
            opinionServiceAsync.retrieve(
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
    suspend fun list() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val opinionServiceAsync = client.opinions()

        val page = opinionServiceAsync.list()

        page.response().validate()
    }
}
