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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the contents of an artifact.
 */
@JsonPropertyOrder({
  ArtifactContent.JSON_PROPERTY_TEXT,
  ArtifactContent.JSON_PROPERTY_BINARY,
  ArtifactContent.JSON_PROPERTY_RENDERED,
  ArtifactContent.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class ArtifactContent {
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_BINARY = "binary";
  private String binary;

  public static final String JSON_PROPERTY_RENDERED = "rendered";
  private MultiformatMessageString rendered;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ArtifactContent() { 
  }

  public ArtifactContent text(String text) {
    this.text = text;
    return this;
  }

   /**
   * UTF-8-encoded content from a text artifact.
   * @return text
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public ArtifactContent binary(String binary) {
    this.binary = binary;
    return this;
  }

   /**
   * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
   * @return binary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinary() {
    return binary;
  }


  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinary(String binary) {
    this.binary = binary;
  }


  public ArtifactContent rendered(MultiformatMessageString rendered) {
    this.rendered = rendered;
    return this;
  }

   /**
   * Get rendered
   * @return rendered
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultiformatMessageString getRendered() {
    return rendered;
  }


  @JsonProperty(JSON_PROPERTY_RENDERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRendered(MultiformatMessageString rendered) {
    this.rendered = rendered;
  }


  public ArtifactContent properties(PropertyBag properties) {
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
   * Return true if this artifactContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactContent artifactContent = (ArtifactContent) o;
    return Objects.equals(this.text, artifactContent.text) &&
        Objects.equals(this.binary, artifactContent.binary) &&
        Objects.equals(this.rendered, artifactContent.rendered) &&
        Objects.equals(this.properties, artifactContent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, binary, rendered, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactContent {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    rendered: ").append(toIndentedString(rendered)).append("\n");
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

    // add `text` to the URL query string
    if (getText() != null) {
      joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `binary` to the URL query string
    if (getBinary() != null) {
      joiner.add(String.format("%sbinary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBinary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rendered` to the URL query string
    if (getRendered() != null) {
      joiner.add(getRendered().toUrlQueryString(prefix + "rendered" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

