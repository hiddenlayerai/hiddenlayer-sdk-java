/*
 * HiddenLayer ModelScan V2
 * HiddenLayer ModelScan API for scanning of models
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hiddenlayer.sdk.rest.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenlayer.sdk.rest.models.ArtifactLocation;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Specifies the information necessary to retrieve a desired revision from a version control system.
 */
@JsonPropertyOrder({
  VersionControlDetails.JSON_PROPERTY_REPOSITORY_URI,
  VersionControlDetails.JSON_PROPERTY_REVISION_ID,
  VersionControlDetails.JSON_PROPERTY_BRANCH,
  VersionControlDetails.JSON_PROPERTY_REVISION_TAG,
  VersionControlDetails.JSON_PROPERTY_AS_OF_TIME_UTC,
  VersionControlDetails.JSON_PROPERTY_MAPPED_TO,
  VersionControlDetails.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class VersionControlDetails {
  public static final String JSON_PROPERTY_REPOSITORY_URI = "repositoryUri";
  private URI repositoryUri;

  public static final String JSON_PROPERTY_REVISION_ID = "revisionId";
  private String revisionId;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_REVISION_TAG = "revisionTag";
  private String revisionTag;

  public static final String JSON_PROPERTY_AS_OF_TIME_UTC = "asOfTimeUtc";
  private OffsetDateTime asOfTimeUtc;

  public static final String JSON_PROPERTY_MAPPED_TO = "mappedTo";
  private ArtifactLocation mappedTo;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public VersionControlDetails() { 
  }

  public VersionControlDetails repositoryUri(URI repositoryUri) {
    this.repositoryUri = repositoryUri;
    return this;
  }

   /**
   * The absolute URI of the repository.
   * @return repositoryUri
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getRepositoryUri() {
    return repositoryUri;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepositoryUri(URI repositoryUri) {
    this.repositoryUri = repositoryUri;
  }


  public VersionControlDetails revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

   /**
   * A string that uniquely and permanently identifies the revision within the repository.
   * @return revisionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevisionId() {
    return revisionId;
  }


  @JsonProperty(JSON_PROPERTY_REVISION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }


  public VersionControlDetails branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * The name of a branch containing the revision.
   * @return branch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(String branch) {
    this.branch = branch;
  }


  public VersionControlDetails revisionTag(String revisionTag) {
    this.revisionTag = revisionTag;
    return this;
  }

   /**
   * A tag that has been applied to the revision.
   * @return revisionTag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevisionTag() {
    return revisionTag;
  }


  @JsonProperty(JSON_PROPERTY_REVISION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevisionTag(String revisionTag) {
    this.revisionTag = revisionTag;
  }


  public VersionControlDetails asOfTimeUtc(OffsetDateTime asOfTimeUtc) {
    this.asOfTimeUtc = asOfTimeUtc;
    return this;
  }

   /**
   * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of the repository at that time.
   * @return asOfTimeUtc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_OF_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAsOfTimeUtc() {
    return asOfTimeUtc;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfTimeUtc(OffsetDateTime asOfTimeUtc) {
    this.asOfTimeUtc = asOfTimeUtc;
  }


  public VersionControlDetails mappedTo(ArtifactLocation mappedTo) {
    this.mappedTo = mappedTo;
    return this;
  }

   /**
   * Get mappedTo
   * @return mappedTo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtifactLocation getMappedTo() {
    return mappedTo;
  }


  @JsonProperty(JSON_PROPERTY_MAPPED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMappedTo(ArtifactLocation mappedTo) {
    this.mappedTo = mappedTo;
  }


  public VersionControlDetails properties(PropertyBag properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyBag getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(PropertyBag properties) {
    this.properties = properties;
  }


  /**
   * Return true if this versionControlDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionControlDetails versionControlDetails = (VersionControlDetails) o;
    return Objects.equals(this.repositoryUri, versionControlDetails.repositoryUri) &&
        Objects.equals(this.revisionId, versionControlDetails.revisionId) &&
        Objects.equals(this.branch, versionControlDetails.branch) &&
        Objects.equals(this.revisionTag, versionControlDetails.revisionTag) &&
        Objects.equals(this.asOfTimeUtc, versionControlDetails.asOfTimeUtc) &&
        Objects.equals(this.mappedTo, versionControlDetails.mappedTo) &&
        Objects.equals(this.properties, versionControlDetails.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryUri, revisionId, branch, revisionTag, asOfTimeUtc, mappedTo, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlDetails {\n");
    sb.append("    repositoryUri: ").append(toIndentedString(repositoryUri)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    revisionTag: ").append(toIndentedString(revisionTag)).append("\n");
    sb.append("    asOfTimeUtc: ").append(toIndentedString(asOfTimeUtc)).append("\n");
    sb.append("    mappedTo: ").append(toIndentedString(mappedTo)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `repositoryUri` to the URL query string
    if (getRepositoryUri() != null) {
      joiner.add(String.format("%srepositoryUri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRepositoryUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revisionId` to the URL query string
    if (getRevisionId() != null) {
      joiner.add(String.format("%srevisionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevisionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `branch` to the URL query string
    if (getBranch() != null) {
      joiner.add(String.format("%sbranch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBranch()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revisionTag` to the URL query string
    if (getRevisionTag() != null) {
      joiner.add(String.format("%srevisionTag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevisionTag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `asOfTimeUtc` to the URL query string
    if (getAsOfTimeUtc() != null) {
      joiner.add(String.format("%sasOfTimeUtc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAsOfTimeUtc()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mappedTo` to the URL query string
    if (getMappedTo() != null) {
      joiner.add(getMappedTo().toUrlQueryString(prefix + "mappedTo" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

