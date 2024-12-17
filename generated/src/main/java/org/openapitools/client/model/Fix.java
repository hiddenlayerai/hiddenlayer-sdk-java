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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.ArtifactChange;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.PropertyBag;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A proposed fix for the problem represented by a result object. A fix specifies a set of artifacts to modify. For each artifact, it specifies a set of bytes to remove, and provides a set of new bytes to replace them.
 */
@JsonPropertyOrder({
  Fix.JSON_PROPERTY_DESCRIPTION,
  Fix.JSON_PROPERTY_ARTIFACT_CHANGES,
  Fix.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class Fix {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Message> description = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_ARTIFACT_CHANGES = "artifactChanges";
  private Set<ArtifactChange> artifactChanges = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Fix() { 
  }

  public Fix description(Message description) {
    this.description = JsonNullable.<Message>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Message getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Message> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<Message> description) {
    this.description = description;
  }

  public void setDescription(Message description) {
    this.description = JsonNullable.<Message>of(description);
  }


  public Fix artifactChanges(Set<ArtifactChange> artifactChanges) {
    this.artifactChanges = artifactChanges;
    return this;
  }

  public Fix addArtifactChangesItem(ArtifactChange artifactChangesItem) {
    if (this.artifactChanges == null) {
      this.artifactChanges = new LinkedHashSet<>();
    }
    this.artifactChanges.add(artifactChangesItem);
    return this;
  }

   /**
   * One or more artifact changes that comprise a fix for a result.
   * @return artifactChanges
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARTIFACT_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<ArtifactChange> getArtifactChanges() {
    return artifactChanges;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ARTIFACT_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArtifactChanges(Set<ArtifactChange> artifactChanges) {
    this.artifactChanges = artifactChanges;
  }


  public Fix properties(PropertyBag properties) {
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
   * Return true if this fix object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fix fix = (Fix) o;
    return equalsNullable(this.description, fix.description) &&
        Objects.equals(this.artifactChanges, fix.artifactChanges) &&
        Objects.equals(this.properties, fix.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), artifactChanges, properties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fix {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    artifactChanges: ").append(toIndentedString(artifactChanges)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(getDescription().toUrlQueryString(prefix + "description" + suffix));
    }

    // add `artifactChanges` to the URL query string
    if (getArtifactChanges() != null) {
      int i = 0;
      for (ArtifactChange _item : getArtifactChanges()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sartifactChanges%s%s", prefix, suffix,
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

