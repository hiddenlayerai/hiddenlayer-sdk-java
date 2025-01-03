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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FileDetailsV3
 */
@JsonPropertyOrder({
  FileDetailsV3.JSON_PROPERTY_ESTIMATED_TIME,
  FileDetailsV3.JSON_PROPERTY_MD5,
  FileDetailsV3.JSON_PROPERTY_SHA256,
  FileDetailsV3.JSON_PROPERTY_TLSH,
  FileDetailsV3.JSON_PROPERTY_FILE_SIZE,
  FileDetailsV3.JSON_PROPERTY_FILE_SIZE_BYTES,
  FileDetailsV3.JSON_PROPERTY_FILE_TYPE,
  FileDetailsV3.JSON_PROPERTY_FILE_TYPE_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class FileDetailsV3 {
  public static final String JSON_PROPERTY_ESTIMATED_TIME = "estimated_time";
  private String estimatedTime;

  public static final String JSON_PROPERTY_MD5 = "md5";
  private String md5;

  public static final String JSON_PROPERTY_SHA256 = "sha256";
  private String sha256;

  public static final String JSON_PROPERTY_TLSH = "tlsh";
  private String tlsh;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private String fileSize;

  public static final String JSON_PROPERTY_FILE_SIZE_BYTES = "file_size_bytes";
  private Integer fileSizeBytes;

  /**
   * type of the file
   */
  public enum FileTypeEnum {
    SAFETENSORS("safetensors"),
    
    RDS("RDS"),
    
    ONNX("onnx"),
    
    TENSORFLOW("tensorflow"),
    
    KERAS("keras"),
    
    PYTORCH("pytorch"),
    
    PICKLE("pickle"),
    
    NEMO("NEMO"),
    
    NUMPY("numpy"),
    
    UNKNOWN("unknown"),
    
    ZIP("ZIP"),
    
    TAR("TAR"),
    
    GGUF("gguf");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FileTypeEnum fromValue(String value) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FILE_TYPE = "file_type";
  private FileTypeEnum fileType;

  public static final String JSON_PROPERTY_FILE_TYPE_DETAILS = "file_type_details";
  private Map<String, Object> fileTypeDetails = new HashMap<>();

  public FileDetailsV3() { 
  }

  public FileDetailsV3 estimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * estimated time to scan the file
   * @return estimatedTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEstimatedTime() {
    return estimatedTime;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
  }


  public FileDetailsV3 md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * hexadecimal md5 hash of file
   * @return md5
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMd5() {
    return md5;
  }


  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public FileDetailsV3 sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * hexadecimal sha256 hash of file
   * @return sha256
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHA256)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSha256() {
    return sha256;
  }


  @JsonProperty(JSON_PROPERTY_SHA256)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public FileDetailsV3 tlsh(String tlsh) {
    this.tlsh = tlsh;
    return this;
  }

   /**
   * TLSH hash of file
   * @return tlsh
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TLSH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTlsh() {
    return tlsh;
  }


  @JsonProperty(JSON_PROPERTY_TLSH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTlsh(String tlsh) {
    this.tlsh = tlsh;
  }


  public FileDetailsV3 fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * size of the file in human readable format
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }


  public FileDetailsV3 fileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }

   /**
   * size of the file in bytes
   * @return fileSizeBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileSizeBytes() {
    return fileSizeBytes;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
  }


  public FileDetailsV3 fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * type of the file
   * @return fileType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileTypeEnum getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  public FileDetailsV3 fileTypeDetails(Map<String, Object> fileTypeDetails) {
    this.fileTypeDetails = fileTypeDetails;
    return this;
  }

  public FileDetailsV3 putFileTypeDetailsItem(String key, Object fileTypeDetailsItem) {
    if (this.fileTypeDetails == null) {
      this.fileTypeDetails = new HashMap<>();
    }
    this.fileTypeDetails.put(key, fileTypeDetailsItem);
    return this;
  }

   /**
   * Get fileTypeDetails
   * @return fileTypeDetails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_TYPE_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getFileTypeDetails() {
    return fileTypeDetails;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileTypeDetails(Map<String, Object> fileTypeDetails) {
    this.fileTypeDetails = fileTypeDetails;
  }


  /**
   * Return true if this FileDetailsV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDetailsV3 fileDetailsV3 = (FileDetailsV3) o;
    return Objects.equals(this.estimatedTime, fileDetailsV3.estimatedTime) &&
        Objects.equals(this.md5, fileDetailsV3.md5) &&
        Objects.equals(this.sha256, fileDetailsV3.sha256) &&
        Objects.equals(this.tlsh, fileDetailsV3.tlsh) &&
        Objects.equals(this.fileSize, fileDetailsV3.fileSize) &&
        Objects.equals(this.fileSizeBytes, fileDetailsV3.fileSizeBytes) &&
        Objects.equals(this.fileType, fileDetailsV3.fileType) &&
        Objects.equals(this.fileTypeDetails, fileDetailsV3.fileTypeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedTime, md5, sha256, tlsh, fileSize, fileSizeBytes, fileType, fileTypeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDetailsV3 {\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    tlsh: ").append(toIndentedString(tlsh)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileTypeDetails: ").append(toIndentedString(fileTypeDetails)).append("\n");
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

    // add `estimated_time` to the URL query string
    if (getEstimatedTime() != null) {
      joiner.add(String.format("%sestimated_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEstimatedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `md5` to the URL query string
    if (getMd5() != null) {
      joiner.add(String.format("%smd5%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMd5()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sha256` to the URL query string
    if (getSha256() != null) {
      joiner.add(String.format("%ssha256%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSha256()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tlsh` to the URL query string
    if (getTlsh() != null) {
      joiner.add(String.format("%stlsh%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTlsh()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `file_size` to the URL query string
    if (getFileSize() != null) {
      joiner.add(String.format("%sfile_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `file_size_bytes` to the URL query string
    if (getFileSizeBytes() != null) {
      joiner.add(String.format("%sfile_size_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSizeBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `file_type` to the URL query string
    if (getFileType() != null) {
      joiner.add(String.format("%sfile_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `file_type_details` to the URL query string
    if (getFileTypeDetails() != null) {
      for (String _key : getFileTypeDetails().keySet()) {
        joiner.add(String.format("%sfile_type_details%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getFileTypeDetails().get(_key), URLEncoder.encode(String.valueOf(getFileTypeDetails().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

