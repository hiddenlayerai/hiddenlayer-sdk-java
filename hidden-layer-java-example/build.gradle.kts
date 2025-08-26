plugins {
    id("hidden-layer.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":hidden-layer-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :hidden-layer-java-example:run` to run `Main`
    // Use `./gradlew :hidden-layer-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.hiddenlayer_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
