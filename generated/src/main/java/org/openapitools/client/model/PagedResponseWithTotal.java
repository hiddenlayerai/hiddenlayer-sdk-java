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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PagedResponseWithTotal
 */
@JsonPropertyOrder({
  PagedResponseWithTotal.JSON_PROPERTY_ITEMS,
  PagedResponseWithTotal.JSON_PROPERTY_TOTAL,
  PagedResponseWithTotal.JSON_PROPERTY_LIMIT,
  PagedResponseWithTotal.JSON_PROPERTY_OFFSET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class PagedResponseWithTotal {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<String> items = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 25;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset = 0;

  public PagedResponseWithTotal() { 
  }

  public PagedResponseWithTotal items(List<String> items) {
    this.items = items;
    return this;
  }

  public PagedResponseWithTotal addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items. If no matching items are found, then &#x60;[]&#x60; will be returned.
   * @return items
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<String> items) {
    this.items = items;
  }


  public PagedResponseWithTotal total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available based on the query criteria.
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public PagedResponseWithTotal limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Maximum number of items to return
   * minimum: 1
   * maximum: 100
   * @return limit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PagedResponseWithTotal offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Begin returning the results from this offset
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  /**
   * Return true if this PagedResponseWithTotal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponseWithTotal pagedResponseWithTotal = (PagedResponseWithTotal) o;
    return Objects.equals(this.items, pagedResponseWithTotal.items) &&
        Objects.equals(this.total, pagedResponseWithTotal.total) &&
        Objects.equals(this.limit, pagedResponseWithTotal.limit) &&
        Objects.equals(this.offset, pagedResponseWithTotal.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponseWithTotal {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        joiner.add(String.format("%sitems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getItems().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `total` to the URL query string
    if (getTotal() != null) {
      joiner.add(String.format("%stotal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `offset` to the URL query string
    if (getOffset() != null) {
      joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

