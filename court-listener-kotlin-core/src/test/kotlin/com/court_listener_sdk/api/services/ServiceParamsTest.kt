// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.services

import com.court_listener_sdk.api.client.CourtListenerClient
import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.models.courts.CourtListParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: CourtListenerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            CourtListenerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun list() {
        val courtService = client.courts()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        courtService.list(
            CourtListParams.builder()
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
