// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.proguard

import com.court_listener_sdk.api.client.okhttp.CourtListenerOkHttpClient
import com.court_listener_sdk.api.core.jsonMapper
import com.court_listener_sdk.api.models.courts.Court
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/court-listener-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = CourtListenerOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.courts()).isNotNull()
        assertThat(client.dockets()).isNotNull()
        assertThat(client.clusters()).isNotNull()
        assertThat(client.opinions()).isNotNull()
    }

    @Test
    fun courtRoundtrip() {
        val jsonMapper = jsonMapper()
        val court =
            Court.builder()
                .id("id")
                .citationString("citation_string")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(LocalDate.parse("2019-12-27"))
                .fullName("full_name")
                .inUse(true)
                .jurisdiction("jurisdiction")
                .position(0.0)
                .resourceUri("https://example.com")
                .shortName("short_name")
                .startDate(LocalDate.parse("2019-12-27"))
                .url("https://example.com")
                .build()

        val roundtrippedCourt =
            jsonMapper.readValue(jsonMapper.writeValueAsString(court), jacksonTypeRef<Court>())

        assertThat(roundtrippedCourt).isEqualTo(court)
    }
}
