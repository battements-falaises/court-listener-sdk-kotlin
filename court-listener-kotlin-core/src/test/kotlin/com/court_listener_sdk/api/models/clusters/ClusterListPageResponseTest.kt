// File generated from our OpenAPI spec by Stainless.

package com.court_listener_sdk.api.models.clusters

import com.court_listener_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterListPageResponseTest {

    @Test
    fun create() {
        val clusterListPageResponse =
            ClusterListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
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
                )
                .build()

        assertThat(clusterListPageResponse.count()).isEqualTo("count")
        assertThat(clusterListPageResponse.next()).isEqualTo("https://example.com")
        assertThat(clusterListPageResponse.previous()).isEqualTo("https://example.com")
        assertThat(clusterListPageResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterListPageResponse =
            ClusterListPageResponse.builder()
                .count("count")
                .next("https://example.com")
                .previous("https://example.com")
                .addResult(
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
                )
                .build()

        val roundtrippedClusterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterListPageResponse),
                jacksonTypeRef<ClusterListPageResponse>(),
            )

        assertThat(roundtrippedClusterListPageResponse).isEqualTo(clusterListPageResponse)
    }
}
