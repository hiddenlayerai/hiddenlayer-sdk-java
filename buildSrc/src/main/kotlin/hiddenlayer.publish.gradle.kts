import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

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
                name.set("HiddenLayer")
                email.set("dev-feedback@hiddenlayer-sdk.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/hiddenlayerai/hiddenlayer-sdk-java.git")
            developerConnection.set("scm:git:git://github.com/hiddenlayerai/hiddenlayer-sdk-java.git")
            url.set("https://github.com/hiddenlayerai/hiddenlayer-sdk-java")
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

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
