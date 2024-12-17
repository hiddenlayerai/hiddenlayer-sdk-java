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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.PhysicalLocation;
import org.openapitools.client.model.PropertyBag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains information about how and when a result was detected.
 */
@JsonPropertyOrder({
  ResultProvenance.JSON_PROPERTY_FIRST_DETECTION_TIME_UTC,
  ResultProvenance.JSON_PROPERTY_LAST_DETECTION_TIME_UTC,
  ResultProvenance.JSON_PROPERTY_FIRST_DETECTION_RUN_GUID,
  ResultProvenance.JSON_PROPERTY_LAST_DETECTION_RUN_GUID,
  ResultProvenance.JSON_PROPERTY_INVOCATION_INDEX,
  ResultProvenance.JSON_PROPERTY_CONVERSION_SOURCES,
  ResultProvenance.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class ResultProvenance {
  public static final String JSON_PROPERTY_FIRST_DETECTION_TIME_UTC = "firstDetectionTimeUtc";
  private OffsetDateTime firstDetectionTimeUtc;

  public static final String JSON_PROPERTY_LAST_DETECTION_TIME_UTC = "lastDetectionTimeUtc";
  private OffsetDateTime lastDetectionTimeUtc;

  public static final String JSON_PROPERTY_FIRST_DETECTION_RUN_GUID = "firstDetectionRunGuid";
  private String firstDetectionRunGuid;

  public static final String JSON_PROPERTY_LAST_DETECTION_RUN_GUID = "lastDetectionRunGuid";
  private String lastDetectionRunGuid;

  public static final String JSON_PROPERTY_INVOCATION_INDEX = "invocationIndex";
  private Integer invocationIndex = -1;

  public static final String JSON_PROPERTY_CONVERSION_SOURCES = "conversionSources";
  private Set<PhysicalLocation> conversionSources = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ResultProvenance() { 
  }

  public ResultProvenance firstDetectionTimeUtc(OffsetDateTime firstDetectionTimeUtc) {
    this.firstDetectionTimeUtc = firstDetectionTimeUtc;
    return this;
  }

   /**
   * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format.
   * @return firstDetectionTimeUtc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_DETECTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFirstDetectionTimeUtc() {
    return firstDetectionTimeUtc;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_DETECTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstDetectionTimeUtc(OffsetDateTime firstDetectionTimeUtc) {
    this.firstDetectionTimeUtc = firstDetectionTimeUtc;
  }


  public ResultProvenance lastDetectionTimeUtc(OffsetDateTime lastDetectionTimeUtc) {
    this.lastDetectionTimeUtc = lastDetectionTimeUtc;
    return this;
  }

   /**
   * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format.
   * @return lastDetectionTimeUtc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_DETECTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastDetectionTimeUtc() {
    return lastDetectionTimeUtc;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DETECTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastDetectionTimeUtc(OffsetDateTime lastDetectionTimeUtc) {
    this.lastDetectionTimeUtc = lastDetectionTimeUtc;
  }


  public ResultProvenance firstDetectionRunGuid(String firstDetectionRunGuid) {
    this.firstDetectionRunGuid = firstDetectionRunGuid;
    return this;
  }

   /**
   * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first detected.
   * @return firstDetectionRunGuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_DETECTION_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstDetectionRunGuid() {
    return firstDetectionRunGuid;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_DETECTION_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstDetectionRunGuid(String firstDetectionRunGuid) {
    this.firstDetectionRunGuid = firstDetectionRunGuid;
  }


  public ResultProvenance lastDetectionRunGuid(String lastDetectionRunGuid) {
    this.lastDetectionRunGuid = lastDetectionRunGuid;
    return this;
  }

   /**
   * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most recently detected.
   * @return lastDetectionRunGuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_DETECTION_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastDetectionRunGuid() {
    return lastDetectionRunGuid;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DETECTION_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastDetectionRunGuid(String lastDetectionRunGuid) {
    this.lastDetectionRunGuid = lastDetectionRunGuid;
  }


  public ResultProvenance invocationIndex(Integer invocationIndex) {
    this.invocationIndex = invocationIndex;
    return this;
  }

   /**
   * The index within the run.invocations array of the invocation object which describes the tool invocation that detected the result.
   * minimum: -1
   * @return invocationIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInvocationIndex() {
    return invocationIndex;
  }


  @JsonProperty(JSON_PROPERTY_INVOCATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvocationIndex(Integer invocationIndex) {
    this.invocationIndex = invocationIndex;
  }


  public ResultProvenance conversionSources(Set<PhysicalLocation> conversionSources) {
    this.conversionSources = conversionSources;
    return this;
  }

  public ResultProvenance addConversionSourcesItem(PhysicalLocation conversionSourcesItem) {
    if (this.conversionSources == null) {
      this.conversionSources = new LinkedHashSet<>();
    }
    this.conversionSources.add(conversionSourcesItem);
    return this;
  }

   /**
   * An array of physicalLocation objects which specify the portions of an analysis tool&#39;s output that a converter transformed into the result.
   * @return conversionSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PhysicalLocation> getConversionSources() {
    return conversionSources;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_CONVERSION_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionSources(Set<PhysicalLocation> conversionSources) {
    this.conversionSources = conversionSources;
  }


  public ResultProvenance properties(PropertyBag properties) {
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
   * Return true if this resultProvenance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultProvenance resultProvenance = (ResultProvenance) o;
    return Objects.equals(this.firstDetectionTimeUtc, resultProvenance.firstDetectionTimeUtc) &&
        Objects.equals(this.lastDetectionTimeUtc, resultProvenance.lastDetectionTimeUtc) &&
        Objects.equals(this.firstDetectionRunGuid, resultProvenance.firstDetectionRunGuid) &&
        Objects.equals(this.lastDetectionRunGuid, resultProvenance.lastDetectionRunGuid) &&
        Objects.equals(this.invocationIndex, resultProvenance.invocationIndex) &&
        Objects.equals(this.conversionSources, resultProvenance.conversionSources) &&
        Objects.equals(this.properties, resultProvenance.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDetectionTimeUtc, lastDetectionTimeUtc, firstDetectionRunGuid, lastDetectionRunGuid, invocationIndex, conversionSources, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultProvenance {\n");
    sb.append("    firstDetectionTimeUtc: ").append(toIndentedString(firstDetectionTimeUtc)).append("\n");
    sb.append("    lastDetectionTimeUtc: ").append(toIndentedString(lastDetectionTimeUtc)).append("\n");
    sb.append("    firstDetectionRunGuid: ").append(toIndentedString(firstDetectionRunGuid)).append("\n");
    sb.append("    lastDetectionRunGuid: ").append(toIndentedString(lastDetectionRunGuid)).append("\n");
    sb.append("    invocationIndex: ").append(toIndentedString(invocationIndex)).append("\n");
    sb.append("    conversionSources: ").append(toIndentedString(conversionSources)).append("\n");
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

    // add `firstDetectionTimeUtc` to the URL query string
    if (getFirstDetectionTimeUtc() != null) {
      joiner.add(String.format("%sfirstDetectionTimeUtc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstDetectionTimeUtc()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastDetectionTimeUtc` to the URL query string
    if (getLastDetectionTimeUtc() != null) {
      joiner.add(String.format("%slastDetectionTimeUtc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastDetectionTimeUtc()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `firstDetectionRunGuid` to the URL query string
    if (getFirstDetectionRunGuid() != null) {
      joiner.add(String.format("%sfirstDetectionRunGuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstDetectionRunGuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastDetectionRunGuid` to the URL query string
    if (getLastDetectionRunGuid() != null) {
      joiner.add(String.format("%slastDetectionRunGuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastDetectionRunGuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `invocationIndex` to the URL query string
    if (getInvocationIndex() != null) {
      joiner.add(String.format("%sinvocationIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvocationIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `conversionSources` to the URL query string
    if (getConversionSources() != null) {
      int i = 0;
      for (PhysicalLocation _item : getConversionSources()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sconversionSources%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

