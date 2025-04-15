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
    mainClass = "com.hiddenlayer_sdk.api.example.Main"
}
