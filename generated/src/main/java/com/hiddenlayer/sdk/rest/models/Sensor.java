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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sensor
 */
@JsonPropertyOrder({
  Sensor.JSON_PROPERTY_SENSOR_ID,
  Sensor.JSON_PROPERTY_CREATED_AT,
  Sensor.JSON_PROPERTY_TENANT_ID,
  Sensor.JSON_PROPERTY_PLAINTEXT_NAME,
  Sensor.JSON_PROPERTY_ACTIVE,
  Sensor.JSON_PROPERTY_VERSION,
  Sensor.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class Sensor {
  public static final String JSON_PROPERTY_SENSOR_ID = "sensor_id";
  private UUID sensorId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private UUID tenantId;

  public static final String JSON_PROPERTY_PLAINTEXT_NAME = "plaintext_name";
  private String plaintextName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, Object> tags = new HashMap<>();

  public Sensor() { 
  }

  public Sensor sensorId(UUID sensorId) {
    this.sensorId = sensorId;
    return this;
  }

   /**
   * Get sensorId
   * @return sensorId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENSOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSensorId() {
    return sensorId;
  }


  @JsonProperty(JSON_PROPERTY_SENSOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSensorId(UUID sensorId) {
    this.sensorId = sensorId;
  }


  public Sensor createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Sensor tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public Sensor plaintextName(String plaintextName) {
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


  public Sensor active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public Sensor version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public Sensor tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public Sensor putTagsItem(String key, Object tagsItem) {
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


  /**
   * Return true if this Sensor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sensor sensor = (Sensor) o;
    return Objects.equals(this.sensorId, sensor.sensorId) &&
        Objects.equals(this.createdAt, sensor.createdAt) &&
        Objects.equals(this.tenantId, sensor.tenantId) &&
        Objects.equals(this.plaintextName, sensor.plaintextName) &&
        Objects.equals(this.active, sensor.active) &&
        Objects.equals(this.version, sensor.version) &&
        Objects.equals(this.tags, sensor.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sensorId, createdAt, tenantId, plaintextName, active, version, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sensor {\n");
    sb.append("    sensorId: ").append(toIndentedString(sensorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    plaintextName: ").append(toIndentedString(plaintextName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `sensor_id` to the URL query string
    if (getSensorId() != null) {
      joiner.add(String.format("%ssensor_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSensorId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created_at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tenant_id` to the URL query string
    if (getTenantId() != null) {
      joiner.add(String.format("%stenant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plaintext_name` to the URL query string
    if (getPlaintextName() != null) {
      joiner.add(String.format("%splaintext_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlaintextName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(String.valueOf(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

