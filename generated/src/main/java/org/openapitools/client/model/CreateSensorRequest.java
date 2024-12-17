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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateSensorRequest
 */
@JsonPropertyOrder({
  CreateSensorRequest.JSON_PROPERTY_PLAINTEXT_NAME,
  CreateSensorRequest.JSON_PROPERTY_VERSION,
  CreateSensorRequest.JSON_PROPERTY_ACTIVE,
  CreateSensorRequest.JSON_PROPERTY_TAGS,
  CreateSensorRequest.JSON_PROPERTY_ADHOC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class CreateSensorRequest {
  public static final String JSON_PROPERTY_PLAINTEXT_NAME = "plaintext_name";
  private String plaintextName;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active = true;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, Object> tags = new HashMap<>();

  public static final String JSON_PROPERTY_ADHOC = "adhoc";
  private Boolean adhoc = false;

  public CreateSensorRequest() { 
  }

  public CreateSensorRequest plaintextName(String plaintextName) {
    this.plaintextName = plaintextName;
    return this;
  }

   /**
   * Get plaintextName
   * @return plaintextName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAINTEXT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlaintextName() {
    return plaintextName;
  }


  @JsonProperty(JSON_PROPERTY_PLAINTEXT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlaintextName(String plaintextName) {
    this.plaintextName = plaintextName;
  }


  public CreateSensorRequest version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public CreateSensorRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateSensorRequest tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public CreateSensorRequest putTagsItem(String key, Object tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }


  public CreateSensorRequest adhoc(Boolean adhoc) {
    this.adhoc = adhoc;
    return this;
  }

   /**
   * Get adhoc
   * @return adhoc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADHOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdhoc() {
    return adhoc;
  }


  @JsonProperty(JSON_PROPERTY_ADHOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdhoc(Boolean adhoc) {
    this.adhoc = adhoc;
  }


  /**
   * Return true if this create_sensor_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSensorRequest createSensorRequest = (CreateSensorRequest) o;
    return Objects.equals(this.plaintextName, createSensorRequest.plaintextName) &&
        Objects.equals(this.version, createSensorRequest.version) &&
        Objects.equals(this.active, createSensorRequest.active) &&
        Objects.equals(this.tags, createSensorRequest.tags) &&
        Objects.equals(this.adhoc, createSensorRequest.adhoc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plaintextName, version, active, tags, adhoc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSensorRequest {\n");
    sb.append("    plaintextName: ").append(toIndentedString(plaintextName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    adhoc: ").append(toIndentedString(adhoc)).append("\n");
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

    // add `plaintext_name` to the URL query string
    if (getPlaintextName() != null) {
      joiner.add(String.format("%splaintext_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlaintextName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(String.valueOf(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `adhoc` to the URL query string
    if (getAdhoc() != null) {
      joiner.add(String.format("%sadhoc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdhoc()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

