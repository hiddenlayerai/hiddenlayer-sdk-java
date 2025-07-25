// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.modelintel.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .first("first")
                .next("next")
                .prev("prev")
                .addFileInstance(
                    FileRetrieveResponse.FileInstance.builder()
                        .instance(
                            FileRetrieveResponse.FileInstance.Instance.builder()
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .path("onnx_files/model.onnx")
                                .revisionId("550e8400-e29b-41d4-a716-446655440000")
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .source("github")
                                .addTag("code")
                                .addTag("onnx")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .build()
                        )
                        .addLicense(
                            FileRetrieveResponse.FileInstance.License.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .name("MIT License")
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://opensource.org/licenses/MIT")
                                .version("1.0")
                                .description("A permissive license that allows for commercial use")
                                .spdxId("MIT")
                                .build()
                        )
                        .repoOwner(
                            FileRetrieveResponse.FileInstance.RepoOwner.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .country("US")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .handle("john_doe")
                                .homepageUrl("https://johndoe.com")
                                .kind("user")
                                .metadata(
                                    FileRetrieveResponse.FileInstance.RepoOwner.Metadata.builder()
                                        .putAdditionalProperty(
                                            "github_followers",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("company", JsonValue.from("bar"))
                                        .build()
                                )
                                .source("github")
                                .addTag("developer")
                                .addTag("ml-engineer")
                                .trustLevel("verified")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .displayName("John Doe")
                                .build()
                        )
                        .repoRevision(
                            FileRetrieveResponse.FileInstance.RepoRevision.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .commitHash("a1b2c3d4e5f6789012345678901234567890abcd")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .fetchedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .metadata(
                                    FileRetrieveResponse.FileInstance.RepoRevision.Metadata
                                        .builder()
                                        .putAdditionalProperty("branch", JsonValue.from("bar"))
                                        .putAdditionalProperty("author", JsonValue.from("bar"))
                                        .build()
                                )
                                .repositoryId("550e8400-e29b-41d4-a716-446655440001")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .build()
                        )
                        .repository(
                            FileRetrieveResponse.FileInstance.Repository.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .addArchitecture("transformer")
                                .addArchitecture("cnn")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .metadata(
                                    FileRetrieveResponse.FileInstance.Repository.Metadata.builder()
                                        .putAdditionalProperty("language", JsonValue.from("bar"))
                                        .putAdditionalProperty("framework", JsonValue.from("bar"))
                                        .build()
                                )
                                .addModality("text")
                                .addModality("image")
                                .ownerId("550e8400-e29b-41d4-a716-446655440001")
                                .addTag("machine-learning")
                                .addTag("nlp")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://github.com/user/my-awesome-project")
                                .description("An awesome project for doing awesome things")
                                .name("my-awesome-project")
                                .build()
                        )
                        .addUsePolicy(
                            FileRetrieveResponse.FileInstance.UsePolicy.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .title("Commercial Use Policy")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://example.com/use-policy")
                                .description("Policy governing commercial use of the content")
                                .build()
                        )
                        .build()
                )
                .last("last")
                .build()

        assertThat(fileRetrieveResponse.first()).isEqualTo("first")
        assertThat(fileRetrieveResponse.next()).isEqualTo("next")
        assertThat(fileRetrieveResponse.prev()).isEqualTo("prev")
        assertThat(fileRetrieveResponse.fileInstances().getOrNull())
            .containsExactly(
                FileRetrieveResponse.FileInstance.builder()
                    .instance(
                        FileRetrieveResponse.FileInstance.Instance.builder()
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .path("onnx_files/model.onnx")
                            .revisionId("550e8400-e29b-41d4-a716-446655440000")
                            .sha256(
                                "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                            )
                            .source("github")
                            .addTag("code")
                            .addTag("onnx")
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .build()
                    )
                    .addLicense(
                        FileRetrieveResponse.FileInstance.License.builder()
                            .id("550e8400-e29b-41d4-a716-446655440000")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .name("MIT License")
                            .sha256(
                                "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                            )
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .url("https://opensource.org/licenses/MIT")
                            .version("1.0")
                            .description("A permissive license that allows for commercial use")
                            .spdxId("MIT")
                            .build()
                    )
                    .repoOwner(
                        FileRetrieveResponse.FileInstance.RepoOwner.builder()
                            .id("550e8400-e29b-41d4-a716-446655440000")
                            .country("US")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .handle("john_doe")
                            .homepageUrl("https://johndoe.com")
                            .kind("user")
                            .metadata(
                                FileRetrieveResponse.FileInstance.RepoOwner.Metadata.builder()
                                    .putAdditionalProperty(
                                        "github_followers",
                                        JsonValue.from("bar"),
                                    )
                                    .putAdditionalProperty("company", JsonValue.from("bar"))
                                    .build()
                            )
                            .source("github")
                            .addTag("developer")
                            .addTag("ml-engineer")
                            .trustLevel("verified")
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .displayName("John Doe")
                            .build()
                    )
                    .repoRevision(
                        FileRetrieveResponse.FileInstance.RepoRevision.builder()
                            .id("550e8400-e29b-41d4-a716-446655440000")
                            .commitHash("a1b2c3d4e5f6789012345678901234567890abcd")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .fetchedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .metadata(
                                FileRetrieveResponse.FileInstance.RepoRevision.Metadata.builder()
                                    .putAdditionalProperty("branch", JsonValue.from("bar"))
                                    .putAdditionalProperty("author", JsonValue.from("bar"))
                                    .build()
                            )
                            .repositoryId("550e8400-e29b-41d4-a716-446655440001")
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .build()
                    )
                    .repository(
                        FileRetrieveResponse.FileInstance.Repository.builder()
                            .id("550e8400-e29b-41d4-a716-446655440000")
                            .addArchitecture("transformer")
                            .addArchitecture("cnn")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .metadata(
                                FileRetrieveResponse.FileInstance.Repository.Metadata.builder()
                                    .putAdditionalProperty("language", JsonValue.from("bar"))
                                    .putAdditionalProperty("framework", JsonValue.from("bar"))
                                    .build()
                            )
                            .addModality("text")
                            .addModality("image")
                            .ownerId("550e8400-e29b-41d4-a716-446655440001")
                            .addTag("machine-learning")
                            .addTag("nlp")
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .url("https://github.com/user/my-awesome-project")
                            .description("An awesome project for doing awesome things")
                            .name("my-awesome-project")
                            .build()
                    )
                    .addUsePolicy(
                        FileRetrieveResponse.FileInstance.UsePolicy.builder()
                            .id("550e8400-e29b-41d4-a716-446655440000")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .sha256(
                                "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                            )
                            .title("Commercial Use Policy")
                            .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .url("https://example.com/use-policy")
                            .description("Policy governing commercial use of the content")
                            .build()
                    )
                    .build()
            )
        assertThat(fileRetrieveResponse.last()).contains("last")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .first("first")
                .next("next")
                .prev("prev")
                .addFileInstance(
                    FileRetrieveResponse.FileInstance.builder()
                        .instance(
                            FileRetrieveResponse.FileInstance.Instance.builder()
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .path("onnx_files/model.onnx")
                                .revisionId("550e8400-e29b-41d4-a716-446655440000")
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .source("github")
                                .addTag("code")
                                .addTag("onnx")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .build()
                        )
                        .addLicense(
                            FileRetrieveResponse.FileInstance.License.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .name("MIT License")
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://opensource.org/licenses/MIT")
                                .version("1.0")
                                .description("A permissive license that allows for commercial use")
                                .spdxId("MIT")
                                .build()
                        )
                        .repoOwner(
                            FileRetrieveResponse.FileInstance.RepoOwner.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .country("US")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .handle("john_doe")
                                .homepageUrl("https://johndoe.com")
                                .kind("user")
                                .metadata(
                                    FileRetrieveResponse.FileInstance.RepoOwner.Metadata.builder()
                                        .putAdditionalProperty(
                                            "github_followers",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("company", JsonValue.from("bar"))
                                        .build()
                                )
                                .source("github")
                                .addTag("developer")
                                .addTag("ml-engineer")
                                .trustLevel("verified")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .displayName("John Doe")
                                .build()
                        )
                        .repoRevision(
                            FileRetrieveResponse.FileInstance.RepoRevision.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .commitHash("a1b2c3d4e5f6789012345678901234567890abcd")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .fetchedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .metadata(
                                    FileRetrieveResponse.FileInstance.RepoRevision.Metadata
                                        .builder()
                                        .putAdditionalProperty("branch", JsonValue.from("bar"))
                                        .putAdditionalProperty("author", JsonValue.from("bar"))
                                        .build()
                                )
                                .repositoryId("550e8400-e29b-41d4-a716-446655440001")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .build()
                        )
                        .repository(
                            FileRetrieveResponse.FileInstance.Repository.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .addArchitecture("transformer")
                                .addArchitecture("cnn")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .metadata(
                                    FileRetrieveResponse.FileInstance.Repository.Metadata.builder()
                                        .putAdditionalProperty("language", JsonValue.from("bar"))
                                        .putAdditionalProperty("framework", JsonValue.from("bar"))
                                        .build()
                                )
                                .addModality("text")
                                .addModality("image")
                                .ownerId("550e8400-e29b-41d4-a716-446655440001")
                                .addTag("machine-learning")
                                .addTag("nlp")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://github.com/user/my-awesome-project")
                                .description("An awesome project for doing awesome things")
                                .name("my-awesome-project")
                                .build()
                        )
                        .addUsePolicy(
                            FileRetrieveResponse.FileInstance.UsePolicy.builder()
                                .id("550e8400-e29b-41d4-a716-446655440000")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .sha256(
                                    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                                )
                                .title("Commercial Use Policy")
                                .updatedAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .url("https://example.com/use-policy")
                                .description("Policy governing commercial use of the content")
                                .build()
                        )
                        .build()
                )
                .last("last")
                .build()

        val roundtrippedFileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRetrieveResponse),
                jacksonTypeRef<FileRetrieveResponse>(),
            )

        assertThat(roundtrippedFileRetrieveResponse).isEqualTo(fileRetrieveResponse)
    }
}
