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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines locations of special significance to SARIF consumers.
 */
@JsonPropertyOrder({
  SpecialLocations.JSON_PROPERTY_DISPLAY_BASE,
  SpecialLocations.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:00:16.695354Z[GMT]", comments = "Generator version: 7.6.0")
public class SpecialLocations {
  public static final String JSON_PROPERTY_DISPLAY_BASE = "displayBase";
  private ArtifactLocation displayBase;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public SpecialLocations() { 
  }

  public SpecialLocations displayBase(ArtifactLocation displayBase) {
    this.displayBase = displayBase;
    return this;
  }

   /**
   * Get displayBase
   * @return displayBase
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_BASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtifactLocation getDisplayBase() {
    return displayBase;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_BASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayBase(ArtifactLocation displayBase) {
    this.displayBase = displayBase;
  }


  public SpecialLocations properties(PropertyBag properties) {
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
   * Return true if this specialLocations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialLocations specialLocations = (SpecialLocations) o;
    return Objects.equals(this.displayBase, specialLocations.displayBase) &&
        Objects.equals(this.properties, specialLocations.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayBase, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialLocations {\n");
    sb.append("    displayBase: ").append(toIndentedString(displayBase)).append("\n");
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

    // add `displayBase` to the URL query string
    if (getDisplayBase() != null) {
      joiner.add(getDisplayBase().toUrlQueryString(prefix + "displayBase" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

