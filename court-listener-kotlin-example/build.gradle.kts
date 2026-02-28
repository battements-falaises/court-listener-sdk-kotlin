plugins {
    id("court-listener.kotlin")
    application
}

dependencies {
    implementation(project(":court-listener-kotlin-core"))
    implementation(project(":court-listener-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :court-listener-kotlin-example:run` to run `Main`
    // Use `./gradlew :court-listener-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.court_listener_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
