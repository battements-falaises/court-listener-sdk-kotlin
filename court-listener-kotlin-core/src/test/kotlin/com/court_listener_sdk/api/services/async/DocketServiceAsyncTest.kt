// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services.async

import com.court_listener_sdk.api.TestServerExtension
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClientAsync
import com.court_listener_sdk.api.models.dockets.DocketRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocketServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val docketServiceAsync = client.dockets()

        val docket =
            docketServiceAsync.retrieve(
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
    suspend fun list() {
        val client =
            CourtListenerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val docketServiceAsync = client.dockets()

        val page = docketServiceAsync.list()

        page.response().validate()
    }
}
