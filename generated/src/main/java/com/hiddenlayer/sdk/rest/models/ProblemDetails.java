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
import com.hiddenlayer.sdk.rest.models.ErrorsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ProblemDetails
 */
@JsonPropertyOrder({
  ProblemDetails.JSON_PROPERTY_TYPE,
  ProblemDetails.JSON_PROPERTY_TITLE,
  ProblemDetails.JSON_PROPERTY_DETAIL,
  ProblemDetails.JSON_PROPERTY_INSTANCE,
  ProblemDetails.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class ProblemDetails {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private String instance;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ErrorsInner> errors = new ArrayList<>();

  public ProblemDetails() { 
  }

  public ProblemDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * https://www.rfc-editor.org/rfc/rfc9457.html#name-type
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


  public ProblemDetails title(String title) {
    this.title = title;
    return this;
  }

   /**
   * https://www.rfc-editor.org/rfc/rfc9457.html#name-title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ProblemDetails detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * https://www.rfc-editor.org/rfc/rfc9457.html#name-detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ProblemDetails instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * https://www.rfc-editor.org/rfc/rfc9457.html#name-instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(String instance) {
    this.instance = instance;
  }


  public ProblemDetails errors(List<ErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ProblemDetails addErrorsItem(ErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error details
   * @return errors
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(List<ErrorsInner> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this ProblemDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.type, problemDetails.type) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.instance, problemDetails.instance) &&
        Objects.equals(this.errors, problemDetails.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, instance, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `detail` to the URL query string
    if (getDetail() != null) {
      joiner.add(String.format("%sdetail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDetail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance` to the URL query string
    if (getInstance() != null) {
      joiner.add(String.format("%sinstance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (int i = 0; i < getErrors().size(); i++) {
        if (getErrors().get(i) != null) {
          joiner.add(getErrors().get(i).toUrlQueryString(String.format("%serrors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

