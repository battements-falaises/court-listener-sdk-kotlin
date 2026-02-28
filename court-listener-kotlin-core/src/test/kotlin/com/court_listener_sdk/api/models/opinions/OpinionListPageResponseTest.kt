// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpinionListPageResponseTest {

    @Test
    fun create() {
        val opinionListPageResponse =
            OpinionListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
                    Opinion.builder()
                        .id(0L)
                        .author("https://example.com")
                        .authorStr("author_str")
                        .cluster("https://example.com")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("https://example.com")
                        .extractedByOcr(true)
                        .html("html")
                        .htmlAnon2020("html_anon_2020")
                        .htmlColumbia("html_columbia")
                        .htmlLawbox("html_lawbox")
                        .htmlWithCitations("html_with_citations")
                        .addJoinedBy("https://example.com")
                        .localPath("local_path")
                        .addOpinionsCited("https://example.com")
                        .orderingKey(0.0)
                        .perCuriam(true)
                        .plainText("plain_text")
                        .resourceUri("https://example.com")
                        .sha1("sha1")
                        .type("type")
                        .xmlHarvard("xml_harvard")
                        .build()
                )
                .build()

        assertThat(opinionListPageResponse.count()).isEqualTo("count")
        assertThat(opinionListPageResponse.next()).isEqualTo("https://example.com")
        assertThat(opinionListPageResponse.previous()).isEqualTo("https://example.com")
        assertThat(opinionListPageResponse.results())
            .containsExactly(
                Opinion.builder()
                    .id(0L)
                    .author("https://example.com")
                    .authorStr("author_str")
                    .cluster("https://example.com")
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .downloadUrl("https://example.com")
                    .extractedByOcr(true)
                    .html("html")
                    .htmlAnon2020("html_anon_2020")
                    .htmlColumbia("html_columbia")
                    .htmlLawbox("html_lawbox")
                    .htmlWithCitations("html_with_citations")
                    .addJoinedBy("https://example.com")
                    .localPath("local_path")
                    .addOpinionsCited("https://example.com")
                    .orderingKey(0.0)
                    .perCuriam(true)
                    .plainText("plain_text")
                    .resourceUri("https://example.com")
                    .sha1("sha1")
                    .type("type")
                    .xmlHarvard("xml_harvard")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val opinionListPageResponse =
            OpinionListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
                    Opinion.builder()
                        .id(0L)
                        .author("https://example.com")
                        .authorStr("author_str")
                        .cluster("https://example.com")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("https://example.com")
                        .extractedByOcr(true)
                        .html("html")
                        .htmlAnon2020("html_anon_2020")
                        .htmlColumbia("html_columbia")
                        .htmlLawbox("html_lawbox")
                        .htmlWithCitations("html_with_citations")
                        .addJoinedBy("https://example.com")
                        .localPath("local_path")
                        .addOpinionsCited("https://example.com")
                        .orderingKey(0.0)
                        .perCuriam(true)
                        .plainText("plain_text")
                        .resourceUri("https://example.com")
                        .sha1("sha1")
                        .type("type")
                        .xmlHarvard("xml_harvard")
                        .build()
                )
                .build()

        val roundtrippedOpinionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(opinionListPageResponse),
                jacksonTypeRef<OpinionListPageResponse>(),
            )

        assertThat(roundtrippedOpinionListPageResponse).isEqualTo(opinionListPageResponse)
    }
}
