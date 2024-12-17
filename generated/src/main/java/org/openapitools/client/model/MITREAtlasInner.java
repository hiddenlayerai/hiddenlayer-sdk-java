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


package org.openapitools.client.model;

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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MITREAtlasInner
 */
@JsonPropertyOrder({
  MITREAtlasInner.JSON_PROPERTY_TECHNIQUE,
  MITREAtlasInner.JSON_PROPERTY_TACTIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class MITREAtlasInner {
  public static final String JSON_PROPERTY_TECHNIQUE = "technique";
  private String technique;

  public static final String JSON_PROPERTY_TACTIC = "tactic";
  private String tactic;

  public MITREAtlasInner() { 
  }

  public MITREAtlasInner technique(String technique) {
    this.technique = technique;
    return this;
  }

   /**
   * MITRE Atlas Technique
   * @return technique
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNIQUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTechnique() {
    return technique;
  }


  @JsonProperty(JSON_PROPERTY_TECHNIQUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnique(String technique) {
    this.technique = technique;
  }


  public MITREAtlasInner tactic(String tactic) {
    this.tactic = tactic;
    return this;
  }

   /**
   * MITRE Atlas Tactic
   * @return tactic
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TACTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTactic() {
    return tactic;
  }


  @JsonProperty(JSON_PROPERTY_TACTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTactic(String tactic) {
    this.tactic = tactic;
  }


  /**
   * Return true if this MITRE_Atlas_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MITREAtlasInner miTREAtlasInner = (MITREAtlasInner) o;
    return Objects.equals(this.technique, miTREAtlasInner.technique) &&
        Objects.equals(this.tactic, miTREAtlasInner.tactic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technique, tactic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MITREAtlasInner {\n");
    sb.append("    technique: ").append(toIndentedString(technique)).append("\n");
    sb.append("    tactic: ").append(toIndentedString(tactic)).append("\n");
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

    // add `technique` to the URL query string
    if (getTechnique() != null) {
      joiner.add(String.format("%stechnique%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTechnique()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tactic` to the URL query string
    if (getTactic() != null) {
      joiner.add(String.format("%stactic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTactic()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

