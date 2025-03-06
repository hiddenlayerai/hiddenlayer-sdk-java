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
import com.hiddenlayer.sdk.rest.models.ArtifactContent;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the response to an HTTP request.
 */
@JsonPropertyOrder({
  WebResponse.JSON_PROPERTY_INDEX,
  WebResponse.JSON_PROPERTY_PROTOCOL,
  WebResponse.JSON_PROPERTY_VERSION,
  WebResponse.JSON_PROPERTY_STATUS_CODE,
  WebResponse.JSON_PROPERTY_REASON_PHRASE,
  WebResponse.JSON_PROPERTY_HEADERS,
  WebResponse.JSON_PROPERTY_BODY,
  WebResponse.JSON_PROPERTY_NO_RESPONSE_RECEIVED,
  WebResponse.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class WebResponse {
  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = -1;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_REASON_PHRASE = "reasonPhrase";
  private String reasonPhrase;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = new HashMap<>();

  public static final String JSON_PROPERTY_BODY = "body";
  private ArtifactContent body;

  public static final String JSON_PROPERTY_NO_RESPONSE_RECEIVED = "noResponseReceived";
  private Boolean noResponseReceived = false;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public WebResponse() { 
  }

  public WebResponse index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index within the run.webResponses array of the response object associated with this result.
   * minimum: -1
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public WebResponse protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The response protocol. Example: &#39;http&#39;.
   * @return protocol
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public WebResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The response version. Example: &#39;1.1&#39;.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public WebResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The response status code. Example: 451.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public WebResponse reasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
    return this;
  }

   /**
   * The response reason. Example: &#39;Not found&#39;.
   * @return reasonPhrase
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonPhrase() {
    return reasonPhrase;
  }


  @JsonProperty(JSON_PROPERTY_REASON_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
  }


  public WebResponse headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public WebResponse putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * The response headers.
   * @return headers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public WebResponse body(ArtifactContent body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtifactContent getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(ArtifactContent body) {
    this.body = body;
  }


  public WebResponse noResponseReceived(Boolean noResponseReceived) {
    this.noResponseReceived = noResponseReceived;
    return this;
  }

   /**
   * Specifies whether a response was received from the server.
   * @return noResponseReceived
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_RESPONSE_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNoResponseReceived() {
    return noResponseReceived;
  }


  @JsonProperty(JSON_PROPERTY_NO_RESPONSE_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoResponseReceived(Boolean noResponseReceived) {
    this.noResponseReceived = noResponseReceived;
  }


  public WebResponse properties(PropertyBag properties) {
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
   * Return true if this webResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebResponse webResponse = (WebResponse) o;
    return Objects.equals(this.index, webResponse.index) &&
        Objects.equals(this.protocol, webResponse.protocol) &&
        Objects.equals(this.version, webResponse.version) &&
        Objects.equals(this.statusCode, webResponse.statusCode) &&
        Objects.equals(this.reasonPhrase, webResponse.reasonPhrase) &&
        Objects.equals(this.headers, webResponse.headers) &&
        Objects.equals(this.body, webResponse.body) &&
        Objects.equals(this.noResponseReceived, webResponse.noResponseReceived) &&
        Objects.equals(this.properties, webResponse.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, protocol, version, statusCode, reasonPhrase, headers, body, noResponseReceived, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebResponse {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reasonPhrase: ").append(toIndentedString(reasonPhrase)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    noResponseReceived: ").append(toIndentedString(noResponseReceived)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `protocol` to the URL query string
    if (getProtocol() != null) {
      joiner.add(String.format("%sprotocol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtocol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `statusCode` to the URL query string
    if (getStatusCode() != null) {
      joiner.add(String.format("%sstatusCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reasonPhrase` to the URL query string
    if (getReasonPhrase() != null) {
      joiner.add(String.format("%sreasonPhrase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasonPhrase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (String _key : getHeaders().keySet()) {
        joiner.add(String.format("%sheaders%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getHeaders().get(_key), URLEncoder.encode(String.valueOf(getHeaders().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `body` to the URL query string
    if (getBody() != null) {
      joiner.add(getBody().toUrlQueryString(prefix + "body" + suffix));
    }

    // add `noResponseReceived` to the URL query string
    if (getNoResponseReceived() != null) {
      joiner.add(String.format("%snoResponseReceived%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNoResponseReceived()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

