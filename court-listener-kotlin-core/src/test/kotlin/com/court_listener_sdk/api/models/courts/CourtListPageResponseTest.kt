// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.courts

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CourtListPageResponseTest {

    @Test
    fun create() {
        val courtListPageResponse =
            CourtListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
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
                )
                .build()

        assertThat(courtListPageResponse.count()).isEqualTo("count")
        assertThat(courtListPageResponse.next()).isEqualTo("https://example.com")
        assertThat(courtListPageResponse.previous()).isEqualTo("https://example.com")
        assertThat(courtListPageResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val courtListPageResponse =
            CourtListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
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
                )
                .build()

        val roundtrippedCourtListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(courtListPageResponse),
                jacksonTypeRef<CourtListPageResponse>(),
            )

        assertThat(roundtrippedCourtListPageResponse).isEqualTo(courtListPageResponse)
    }
}
