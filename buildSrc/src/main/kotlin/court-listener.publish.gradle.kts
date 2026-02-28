plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("CourtListener Case Law API")
                description.set("APIs for accessing CourtListener's database of case law. This specification only\ncovers the four primary case law endpoints: Courts, Dockets, Clusters, and\nOpinions.\n\n**Data Model**: Dockets are filed in particular Courts and contain Clusters of\nOpinions.\n\n- **Court** — metadata about a court (name, abbreviation, founding date, etc.)\n- **Docket** — metadata about a case (docket number, dates, parties, etc.)\n- **Cluster** — groups opinions from the same panel hearing (e.g. majority,\n  dissent, concurrence)\n- **Opinion** — the text of a single decision and metadata about its author\n\n**Filtering**: Most fields support Django-style double-underscore lookups\n(`__exact`, `__gte`, `__gt`, `__lte`, `__lt`, `__range`, `__startswith`, etc.).\nRelated filters allow cross-API joins (e.g. `cluster__docket__court=scotus`).\nPrepend `!` to any filter to negate it (e.g. `court__jurisdiction!=F`).\n\n**Field Selection**: Use `fields` and `omit` query parameters with\ncomma-separated field names. Nested fields use double-underscore notation.\n\n**Pagination**: Cursor-based deep pagination is available when ordering by `id`,\n`date_modified`, or `date_created`. Standard page-based pagination is limited to\n100 pages.\n\n**Rate Limits**: 5,000 requests per hour for authenticated users.\n\nFor full documentation see:\nhttps://www.courtlistener.com/help/api/rest/case-law/")
                url.set("https://www.courtlistener.com/contact/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Court Listener")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/court-listener-sdk-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/court-listener-sdk-kotlin.git")
                    url.set("https://github.com/stainless-sdks/court-listener-sdk-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
