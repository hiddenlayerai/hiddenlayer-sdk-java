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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScanResults
 */
@JsonPropertyOrder({
  ScanResults.JSON_PROPERTY_MD5,
  ScanResults.JSON_PROPERTY_RDS_ENCODING,
  ScanResults.JSON_PROPERTY_RDS_MIN_READER_VERSION,
  ScanResults.JSON_PROPERTY_RDS_VERSION,
  ScanResults.JSON_PROPERTY_RDS_WRITER_VERSION,
  ScanResults.JSON_PROPERTY_SHA256,
  ScanResults.JSON_PROPERTY_TYPE,
  ScanResults.JSON_PROPERTY_SUBTYPE,
  ScanResults.JSON_PROPERTY_TLSH,
  ScanResults.JSON_PROPERTY_PICKLE_MODULES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:00:16.695354Z[GMT]", comments = "Generator version: 7.6.0")
public class ScanResults extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_MD5 = "md5";
  private String md5;

  public static final String JSON_PROPERTY_RDS_ENCODING = "rds_encoding";
  private String rdsEncoding;

  public static final String JSON_PROPERTY_RDS_MIN_READER_VERSION = "rds_min_reader_version";
  private String rdsMinReaderVersion;

  public static final String JSON_PROPERTY_RDS_VERSION = "rds_version";
  private String rdsVersion;

  public static final String JSON_PROPERTY_RDS_WRITER_VERSION = "rds_writer_version";
  private String rdsWriterVersion;

  public static final String JSON_PROPERTY_SHA256 = "sha256";
  private String sha256;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private List<String> subtype = new ArrayList<>();

  public static final String JSON_PROPERTY_TLSH = "tlsh";
  private String tlsh;

  public static final String JSON_PROPERTY_PICKLE_MODULES = "pickle_modules";
  private List<String> pickleModules = new ArrayList<>();

  public ScanResults() { 
  }

  public ScanResults md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd5() {
    return md5;
  }


  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public ScanResults rdsEncoding(String rdsEncoding) {
    this.rdsEncoding = rdsEncoding;
    return this;
  }

   /**
   * Get rdsEncoding
   * @return rdsEncoding
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDS_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRdsEncoding() {
    return rdsEncoding;
  }


  @JsonProperty(JSON_PROPERTY_RDS_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRdsEncoding(String rdsEncoding) {
    this.rdsEncoding = rdsEncoding;
  }


  public ScanResults rdsMinReaderVersion(String rdsMinReaderVersion) {
    this.rdsMinReaderVersion = rdsMinReaderVersion;
    return this;
  }

   /**
   * Get rdsMinReaderVersion
   * @return rdsMinReaderVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDS_MIN_READER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRdsMinReaderVersion() {
    return rdsMinReaderVersion;
  }


  @JsonProperty(JSON_PROPERTY_RDS_MIN_READER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRdsMinReaderVersion(String rdsMinReaderVersion) {
    this.rdsMinReaderVersion = rdsMinReaderVersion;
  }


  public ScanResults rdsVersion(String rdsVersion) {
    this.rdsVersion = rdsVersion;
    return this;
  }

   /**
   * Get rdsVersion
   * @return rdsVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRdsVersion() {
    return rdsVersion;
  }


  @JsonProperty(JSON_PROPERTY_RDS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRdsVersion(String rdsVersion) {
    this.rdsVersion = rdsVersion;
  }


  public ScanResults rdsWriterVersion(String rdsWriterVersion) {
    this.rdsWriterVersion = rdsWriterVersion;
    return this;
  }

   /**
   * Get rdsWriterVersion
   * @return rdsWriterVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDS_WRITER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRdsWriterVersion() {
    return rdsWriterVersion;
  }


  @JsonProperty(JSON_PROPERTY_RDS_WRITER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRdsWriterVersion(String rdsWriterVersion) {
    this.rdsWriterVersion = rdsWriterVersion;
  }


  public ScanResults sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHA256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSha256() {
    return sha256;
  }


  @JsonProperty(JSON_PROPERTY_SHA256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public ScanResults type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ScanResults subtype(List<String> subtype) {
    this.subtype = subtype;
    return this;
  }

  public ScanResults addSubtypeItem(String subtypeItem) {
    if (this.subtype == null) {
      this.subtype = new ArrayList<>();
    }
    this.subtype.add(subtypeItem);
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubtype() {
    return subtype;
  }


  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtype(List<String> subtype) {
    this.subtype = subtype;
  }


  public ScanResults tlsh(String tlsh) {
    this.tlsh = tlsh;
    return this;
  }

   /**
   * Get tlsh
   * @return tlsh
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTlsh() {
    return tlsh;
  }


  @JsonProperty(JSON_PROPERTY_TLSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTlsh(String tlsh) {
    this.tlsh = tlsh;
  }


  public ScanResults pickleModules(List<String> pickleModules) {
    this.pickleModules = pickleModules;
    return this;
  }

  public ScanResults addPickleModulesItem(String pickleModulesItem) {
    if (this.pickleModules == null) {
      this.pickleModules = new ArrayList<>();
    }
    this.pickleModules.add(pickleModulesItem);
    return this;
  }

   /**
   * Get pickleModules
   * @return pickleModules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKLE_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPickleModules() {
    return pickleModules;
  }


  @JsonProperty(JSON_PROPERTY_PICKLE_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickleModules(List<String> pickleModules) {
    this.pickleModules = pickleModules;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public ScanResults putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this Scan_Results object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanResults scanResults = (ScanResults) o;
    return Objects.equals(this.md5, scanResults.md5) &&
        Objects.equals(this.rdsEncoding, scanResults.rdsEncoding) &&
        Objects.equals(this.rdsMinReaderVersion, scanResults.rdsMinReaderVersion) &&
        Objects.equals(this.rdsVersion, scanResults.rdsVersion) &&
        Objects.equals(this.rdsWriterVersion, scanResults.rdsWriterVersion) &&
        Objects.equals(this.sha256, scanResults.sha256) &&
        Objects.equals(this.type, scanResults.type) &&
        Objects.equals(this.subtype, scanResults.subtype) &&
        Objects.equals(this.tlsh, scanResults.tlsh) &&
        Objects.equals(this.pickleModules, scanResults.pickleModules)&&
        Objects.equals(this.additionalProperties, scanResults.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md5, rdsEncoding, rdsMinReaderVersion, rdsVersion, rdsWriterVersion, sha256, type, subtype, tlsh, pickleModules, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanResults {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    rdsEncoding: ").append(toIndentedString(rdsEncoding)).append("\n");
    sb.append("    rdsMinReaderVersion: ").append(toIndentedString(rdsMinReaderVersion)).append("\n");
    sb.append("    rdsVersion: ").append(toIndentedString(rdsVersion)).append("\n");
    sb.append("    rdsWriterVersion: ").append(toIndentedString(rdsWriterVersion)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tlsh: ").append(toIndentedString(tlsh)).append("\n");
    sb.append("    pickleModules: ").append(toIndentedString(pickleModules)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

    // add `md5` to the URL query string
    if (getMd5() != null) {
      joiner.add(String.format("%smd5%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMd5()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rds_encoding` to the URL query string
    if (getRdsEncoding() != null) {
      joiner.add(String.format("%srds_encoding%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRdsEncoding()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rds_min_reader_version` to the URL query string
    if (getRdsMinReaderVersion() != null) {
      joiner.add(String.format("%srds_min_reader_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRdsMinReaderVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rds_version` to the URL query string
    if (getRdsVersion() != null) {
      joiner.add(String.format("%srds_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRdsVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rds_writer_version` to the URL query string
    if (getRdsWriterVersion() != null) {
      joiner.add(String.format("%srds_writer_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRdsWriterVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sha256` to the URL query string
    if (getSha256() != null) {
      joiner.add(String.format("%ssha256%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSha256()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subtype` to the URL query string
    if (getSubtype() != null) {
      for (int i = 0; i < getSubtype().size(); i++) {
        joiner.add(String.format("%ssubtype%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getSubtype().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `tlsh` to the URL query string
    if (getTlsh() != null) {
      joiner.add(String.format("%stlsh%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTlsh()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pickle_modules` to the URL query string
    if (getPickleModules() != null) {
      for (int i = 0; i < getPickleModules().size(); i++) {
        joiner.add(String.format("%spickle_modules%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getPickleModules().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

