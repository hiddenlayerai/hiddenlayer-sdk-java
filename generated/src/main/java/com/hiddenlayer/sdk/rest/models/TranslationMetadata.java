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
import com.hiddenlayer.sdk.rest.models.MultiformatMessageString;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import java.net.URI;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Provides additional metadata related to translation.
 */
@JsonPropertyOrder({
  TranslationMetadata.JSON_PROPERTY_NAME,
  TranslationMetadata.JSON_PROPERTY_FULL_NAME,
  TranslationMetadata.JSON_PROPERTY_SHORT_DESCRIPTION,
  TranslationMetadata.JSON_PROPERTY_FULL_DESCRIPTION,
  TranslationMetadata.JSON_PROPERTY_DOWNLOAD_URI,
  TranslationMetadata.JSON_PROPERTY_INFORMATION_URI,
  TranslationMetadata.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:20:36.233399Z[GMT]", comments = "Generator version: 7.6.0")
public class TranslationMetadata {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "shortDescription";
  private MultiformatMessageString shortDescription;

  public static final String JSON_PROPERTY_FULL_DESCRIPTION = "fullDescription";
  private MultiformatMessageString fullDescription;

  public static final String JSON_PROPERTY_DOWNLOAD_URI = "downloadUri";
  private URI downloadUri;

  public static final String JSON_PROPERTY_INFORMATION_URI = "informationUri";
  private URI informationUri;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public TranslationMetadata() { 
  }

  public TranslationMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name associated with the translation metadata.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TranslationMetadata fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name associated with the translation metadata.
   * @return fullName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public TranslationMetadata shortDescription(MultiformatMessageString shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultiformatMessageString getShortDescription() {
    return shortDescription;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortDescription(MultiformatMessageString shortDescription) {
    this.shortDescription = shortDescription;
  }


  public TranslationMetadata fullDescription(MultiformatMessageString fullDescription) {
    this.fullDescription = fullDescription;
    return this;
  }

   /**
   * Get fullDescription
   * @return fullDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultiformatMessageString getFullDescription() {
    return fullDescription;
  }


  @JsonProperty(JSON_PROPERTY_FULL_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullDescription(MultiformatMessageString fullDescription) {
    this.fullDescription = fullDescription;
  }


  public TranslationMetadata downloadUri(URI downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }

   /**
   * The absolute URI from which the translation metadata can be downloaded.
   * @return downloadUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getDownloadUri() {
    return downloadUri;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUri(URI downloadUri) {
    this.downloadUri = downloadUri;
  }


  public TranslationMetadata informationUri(URI informationUri) {
    this.informationUri = informationUri;
    return this;
  }

   /**
   * The absolute URI from which information related to the translation metadata can be downloaded.
   * @return informationUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFORMATION_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getInformationUri() {
    return informationUri;
  }


  @JsonProperty(JSON_PROPERTY_INFORMATION_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformationUri(URI informationUri) {
    this.informationUri = informationUri;
  }


  public TranslationMetadata properties(PropertyBag properties) {
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
   * Return true if this translationMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationMetadata translationMetadata = (TranslationMetadata) o;
    return Objects.equals(this.name, translationMetadata.name) &&
        Objects.equals(this.fullName, translationMetadata.fullName) &&
        Objects.equals(this.shortDescription, translationMetadata.shortDescription) &&
        Objects.equals(this.fullDescription, translationMetadata.fullDescription) &&
        Objects.equals(this.downloadUri, translationMetadata.downloadUri) &&
        Objects.equals(this.informationUri, translationMetadata.informationUri) &&
        Objects.equals(this.properties, translationMetadata.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fullName, shortDescription, fullDescription, downloadUri, informationUri, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    informationUri: ").append(toIndentedString(informationUri)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(String.format("%sfullName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFullName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shortDescription` to the URL query string
    if (getShortDescription() != null) {
      joiner.add(getShortDescription().toUrlQueryString(prefix + "shortDescription" + suffix));
    }

    // add `fullDescription` to the URL query string
    if (getFullDescription() != null) {
      joiner.add(getFullDescription().toUrlQueryString(prefix + "fullDescription" + suffix));
    }

    // add `downloadUri` to the URL query string
    if (getDownloadUri() != null) {
      joiner.add(String.format("%sdownloadUri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownloadUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `informationUri` to the URL query string
    if (getInformationUri() != null) {
      joiner.add(String.format("%sinformationUri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInformationUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

