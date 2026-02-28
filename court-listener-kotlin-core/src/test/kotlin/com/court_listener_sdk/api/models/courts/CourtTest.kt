// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CourtTest {

    @Test
    fun create() {
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

        assertThat(court.id()).isEqualTo("id")
        assertThat(court.citationString()).isEqualTo("citation_string")
        assertThat(court.dateCreated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(court.dateModified()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(court.endDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(court.fullName()).isEqualTo("full_name")
        assertThat(court.inUse()).isEqualTo(true)
        assertThat(court.jurisdiction()).isEqualTo("jurisdiction")
        assertThat(court.position()).isEqualTo(0.0)
        assertThat(court.resourceUri()).isEqualTo("https://example.com")
        assertThat(court.shortName()).isEqualTo("short_name")
        assertThat(court.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(court.url()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
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
