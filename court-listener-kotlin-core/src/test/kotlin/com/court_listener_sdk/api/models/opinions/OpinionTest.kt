// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.opinions

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpinionTest {

    @Test
    fun create() {
        val opinion =
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

        assertThat(opinion.id()).isEqualTo(0L)
        assertThat(opinion.author()).isEqualTo("https://example.com")
        assertThat(opinion.authorStr()).isEqualTo("author_str")
        assertThat(opinion.cluster()).isEqualTo("https://example.com")
        assertThat(opinion.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(opinion.dateModified())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(opinion.downloadUrl()).isEqualTo("https://example.com")
        assertThat(opinion.extractedByOcr()).isEqualTo(true)
        assertThat(opinion.html()).isEqualTo("html")
        assertThat(opinion.htmlAnon2020()).isEqualTo("html_anon_2020")
        assertThat(opinion.htmlColumbia()).isEqualTo("html_columbia")
        assertThat(opinion.htmlLawbox()).isEqualTo("html_lawbox")
        assertThat(opinion.htmlWithCitations()).isEqualTo("html_with_citations")
        assertThat(opinion.joinedBy()).containsExactly("https://example.com")
        assertThat(opinion.localPath()).isEqualTo("local_path")
        assertThat(opinion.opinionsCited()).containsExactly("https://example.com")
        assertThat(opinion.orderingKey()).isEqualTo(0.0)
        assertThat(opinion.perCuriam()).isEqualTo(true)
        assertThat(opinion.plainText()).isEqualTo("plain_text")
        assertThat(opinion.resourceUri()).isEqualTo("https://example.com")
        assertThat(opinion.sha1()).isEqualTo("sha1")
        assertThat(opinion.type()).isEqualTo("type")
        assertThat(opinion.xmlHarvard()).isEqualTo("xml_harvard")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val opinion =
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

        val roundtrippedOpinion =
            jsonMapper.readValue(jsonMapper.writeValueAsString(opinion), jacksonTypeRef<Opinion>())

        assertThat(roundtrippedOpinion).isEqualTo(opinion)
    }
}
