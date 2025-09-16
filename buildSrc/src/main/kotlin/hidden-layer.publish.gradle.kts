plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("HiddenLayer Platform API")
                description.set("HiddenLayer Platform API")
                url.set("https://dev.hiddenlayer.ai")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Hidden Layer")
                        email.set("dev-feedback@hiddenlayer-sdk.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/hiddenlayer-engineering/hiddenlayer-sdk-java.git")
                    developerConnection.set("scm:git:git://github.com/hiddenlayer-engineering/hiddenlayer-sdk-java.git")
                    url.set("https://github.com/hiddenlayer-engineering/hiddenlayer-sdk-java")
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
        // JFrog repository for internal publishing
        maven {
            name = "JFrog"
            url = uri("https://hiddenlayer.jfrog.io/artifactory/internal-java-sdk")
            credentials {
                username = System.getenv("JFROG_USER")
                password = System.getenv("JFROG_TOKEN")
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
