// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterTest {

    @Test
    fun create() {
        val cluster =
            Cluster.builder()
                .id(0L)
                .absoluteUrl("absolute_url")
                .blocked(true)
                .caseName("case_name")
                .caseNameFull("case_name_full")
                .caseNameShort("case_name_short")
                .citationCount(0L)
                .addCitation(
                    Cluster.Citation.builder()
                        .page("page")
                        .reporter("reporter")
                        .type(0L)
                        .volume(0L)
                        .build()
                )
                .correction("correction")
                .crossReference("cross_reference")
                .dateBlocked(LocalDate.parse("2019-12-27"))
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateFiled(LocalDate.parse("2019-12-27"))
                .dateFiledIsApproximate(true)
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disposition("disposition")
                .docket("https://example.com")
                .headnotes("headnotes")
                .history("history")
                .judges("judges")
                .addNonParticipatingJudge("https://example.com")
                .otherDates("other_dates")
                .addPanel("https://example.com")
                .precedentialStatus("precedential_status")
                .resourceUri("https://example.com")
                .slug("slug")
                .source("source")
                .addSubOpinion("https://example.com")
                .summary("summary")
                .syllabus("syllabus")
                .build()

        assertThat(cluster.id()).isEqualTo(0L)
        assertThat(cluster.absoluteUrl()).isEqualTo("absolute_url")
        assertThat(cluster.blocked()).isEqualTo(true)
        assertThat(cluster.caseName()).isEqualTo("case_name")
        assertThat(cluster.caseNameFull()).isEqualTo("case_name_full")
        assertThat(cluster.caseNameShort()).isEqualTo("case_name_short")
        assertThat(cluster.citationCount()).isEqualTo(0L)
        assertThat(cluster.citations())
            .containsExactly(
                Cluster.Citation.builder()
                    .page("page")
                    .reporter("reporter")
                    .type(0L)
                    .volume(0L)
                    .build()
            )
        assertThat(cluster.correction()).isEqualTo("correction")
        assertThat(cluster.crossReference()).isEqualTo("cross_reference")
        assertThat(cluster.dateBlocked()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(cluster.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cluster.dateFiled()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(cluster.dateFiledIsApproximate()).isEqualTo(true)
        assertThat(cluster.dateModified())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cluster.disposition()).isEqualTo("disposition")
        assertThat(cluster.docket()).isEqualTo("https://example.com")
        assertThat(cluster.headnotes()).isEqualTo("headnotes")
        assertThat(cluster.history()).isEqualTo("history")
        assertThat(cluster.judges()).isEqualTo("judges")
        assertThat(cluster.nonParticipatingJudges()).containsExactly("https://example.com")
        assertThat(cluster.otherDates()).isEqualTo("other_dates")
        assertThat(cluster.panel()).containsExactly("https://example.com")
        assertThat(cluster.precedentialStatus()).isEqualTo("precedential_status")
        assertThat(cluster.resourceUri()).isEqualTo("https://example.com")
        assertThat(cluster.slug()).isEqualTo("slug")
        assertThat(cluster.source()).isEqualTo("source")
        assertThat(cluster.subOpinions()).containsExactly("https://example.com")
        assertThat(cluster.summary()).isEqualTo("summary")
        assertThat(cluster.syllabus()).isEqualTo("syllabus")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cluster =
            Cluster.builder()
                .id(0L)
                .absoluteUrl("absolute_url")
                .blocked(true)
                .caseName("case_name")
                .caseNameFull("case_name_full")
                .caseNameShort("case_name_short")
                .citationCount(0L)
                .addCitation(
                    Cluster.Citation.builder()
                        .page("page")
                        .reporter("reporter")
                        .type(0L)
                        .volume(0L)
                        .build()
                )
                .correction("correction")
                .crossReference("cross_reference")
                .dateBlocked(LocalDate.parse("2019-12-27"))
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateFiled(LocalDate.parse("2019-12-27"))
                .dateFiledIsApproximate(true)
                .dateModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disposition("disposition")
                .docket("https://example.com")
                .headnotes("headnotes")
                .history("history")
                .judges("judges")
                .addNonParticipatingJudge("https://example.com")
                .otherDates("other_dates")
                .addPanel("https://example.com")
                .precedentialStatus("precedential_status")
                .resourceUri("https://example.com")
                .slug("slug")
                .source("source")
                .addSubOpinion("https://example.com")
                .summary("summary")
                .syllabus("syllabus")
                .build()

        val roundtrippedCluster =
            jsonMapper.readValue(jsonMapper.writeValueAsString(cluster), jacksonTypeRef<Cluster>())

        assertThat(roundtrippedCluster).isEqualTo(cluster)
    }
}
