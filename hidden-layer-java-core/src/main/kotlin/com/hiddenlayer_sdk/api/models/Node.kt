// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a node in a graph. */
class Node
private constructor(
    private val id: JsonField<String>,
    private val children: JsonField<List<Node>>,
    private val label: JsonField<Label>,
    private val location: JsonField<Location>,
    private val properties: JsonField<Properties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("children")
        @ExcludeMissing
        children: JsonField<List<Node>> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<Label> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
    ) : this(id, children, label, location, properties, mutableMapOf())

    /**
     * A string that uniquely identifies the node within its graph.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Array of child nodes.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun children(): Optional<List<Node>> = children.getOptional("children")

    /**
     * A short description of the node.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<Label> = label.getOptional("label")

    /**
     * A code location associated with the node.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<Location> = location.getOptional("location")

    /**
     * Key/value pairs that provide additional information about the node.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<Properties> = properties.getOptional("properties")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [children].
     *
     * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("children") @ExcludeMissing fun _children(): JsonField<List<Node>> = children

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<Label> = label

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Node].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Node]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var children: JsonField<MutableList<Node>>? = null
        private var label: JsonField<Label> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var properties: JsonField<Properties> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(node: Node) = apply {
            id = node.id
            children = node.children.map { it.toMutableList() }
            label = node.label
            location = node.location
            properties = node.properties
            additionalProperties = node.additionalProperties.toMutableMap()
        }

        /** A string that uniquely identifies the node within its graph. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Array of child nodes. */
        fun children(children: List<Node>) = children(JsonField.of(children))

        /**
         * Sets [Builder.children] to an arbitrary JSON value.
         *
         * You should usually call [Builder.children] with a well-typed `List<Node>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun children(children: JsonField<List<Node>>) = apply {
            this.children = children.map { it.toMutableList() }
        }

        /**
         * Adds a single [Node] to [children].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChild(child: Node) = apply {
            children =
                (children ?: JsonField.of(mutableListOf())).also {
                    checkKnown("children", it).add(child)
                }
        }

        /** A short description of the node. */
        fun label(label: Label) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [Label] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<Label>) = apply { this.label = label }

        /** A code location associated with the node. */
        fun location(location: Location) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /** Key/value pairs that provide additional information about the node. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Node].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Node =
            Node(
                checkRequired("id", id),
                (children ?: JsonMissing.of()).map { it.toImmutable() },
                label,
                location,
                properties,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Node = apply {
        if (validated) {
            return@apply
        }

        id()
        children().ifPresent { it.forEach { it.validate() } }
        label().ifPresent { it.validate() }
        location().ifPresent { it.validate() }
        properties().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HiddenLayerInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (children.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (label.asKnown().getOrNull()?.validity() ?: 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    /** A short description of the node. */
    class Label
    private constructor(
        private val id: JsonField<String>,
        private val arguments: JsonField<List<String>>,
        private val markdown: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("arguments")
            @ExcludeMissing
            arguments: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("markdown")
            @ExcludeMissing
            markdown: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(id, arguments, markdown, properties, text, mutableMapOf())

        /**
         * The identifier for this message.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * An array of strings to substitute into the message string.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

        /**
         * A Markdown message string.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun markdown(): Optional<String> = markdown.getOptional("markdown")

        /**
         * Key/value pairs that provide additional information about the message.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * A plain text message string.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [arguments].
         *
         * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arguments")
        @ExcludeMissing
        fun _arguments(): JsonField<List<String>> = arguments

        /**
         * Returns the raw JSON value of [markdown].
         *
         * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Label]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Label]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var arguments: JsonField<MutableList<String>>? = null
            private var markdown: JsonField<String> = JsonMissing.of()
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(label: Label) = apply {
                id = label.id
                arguments = label.arguments.map { it.toMutableList() }
                markdown = label.markdown
                properties = label.properties
                text = label.text
                additionalProperties = label.additionalProperties.toMutableMap()
            }

            /** The identifier for this message. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** An array of strings to substitute into the message string. */
            fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

            /**
             * Sets [Builder.arguments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arguments] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arguments(arguments: JsonField<List<String>>) = apply {
                this.arguments = arguments.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [arguments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addArgument(argument: String) = apply {
                arguments =
                    (arguments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("arguments", it).add(argument)
                    }
            }

            /** A Markdown message string. */
            fun markdown(markdown: String) = markdown(JsonField.of(markdown))

            /**
             * Sets [Builder.markdown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.markdown] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

            /** Key/value pairs that provide additional information about the message. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** A plain text message string. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Label].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Label =
                Label(
                    id,
                    (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                    markdown,
                    properties,
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Label = apply {
            if (validated) {
                return@apply
            }

            id()
            arguments()
            markdown()
            properties().ifPresent { it.validate() }
            text()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HiddenLayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (arguments.asKnown().getOrNull()?.size ?: 0) +
                (if (markdown.asKnown().isPresent) 1 else 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        /** Key/value pairs that provide additional information about the message. */
        class Properties
        private constructor(
            private val tags: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of()
            ) : this(tags, mutableMapOf())

            /**
             * A set of distinct strings that provide additional information.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var tags: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    tags = properties.tags.map { it.toMutableList() }
                    additionalProperties = properties.additionalProperties.toMutableMap()
                }

                /** A set of distinct strings that provide additional information. */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties =
                    Properties(
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
                if (validated) {
                    return@apply
                }

                tags()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Properties{tags=$tags, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Label && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Label{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
    }

    /** A code location associated with the node. */
    class Location
    private constructor(
        private val id: JsonField<Long>,
        private val annotations: JsonField<List<Annotation>>,
        private val logicalLocations: JsonField<List<LogicalLocation>>,
        private val message: JsonField<Message>,
        private val physicalLocation: JsonField<PhysicalLocation>,
        private val properties: JsonField<Properties>,
        private val relationships: JsonField<List<Relationship>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("annotations")
            @ExcludeMissing
            annotations: JsonField<List<Annotation>> = JsonMissing.of(),
            @JsonProperty("logicalLocations")
            @ExcludeMissing
            logicalLocations: JsonField<List<LogicalLocation>> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
            @JsonProperty("physicalLocation")
            @ExcludeMissing
            physicalLocation: JsonField<PhysicalLocation> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("relationships")
            @ExcludeMissing
            relationships: JsonField<List<Relationship>> = JsonMissing.of(),
        ) : this(
            id,
            annotations,
            logicalLocations,
            message,
            physicalLocation,
            properties,
            relationships,
            mutableMapOf(),
        )

        /**
         * Value that distinguishes this location from all other locations within a single result
         * object.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * A set of regions relevant to the location.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun annotations(): Optional<List<Annotation>> = annotations.getOptional("annotations")

        /**
         * The logical locations associated with the result.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logicalLocations(): Optional<List<LogicalLocation>> =
            logicalLocations.getOptional("logicalLocations")

        /**
         * A message relevant to the location.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun message(): Optional<Message> = message.getOptional("message")

        /**
         * Identifies the artifact and region.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun physicalLocation(): Optional<PhysicalLocation> =
            physicalLocation.getOptional("physicalLocation")

        /**
         * Key/value pairs that provide additional information about the location.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * An array of objects that describe relationships between this location and others.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun relationships(): Optional<List<Relationship>> =
            relationships.getOptional("relationships")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [annotations].
         *
         * Unlike [annotations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("annotations")
        @ExcludeMissing
        fun _annotations(): JsonField<List<Annotation>> = annotations

        /**
         * Returns the raw JSON value of [logicalLocations].
         *
         * Unlike [logicalLocations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("logicalLocations")
        @ExcludeMissing
        fun _logicalLocations(): JsonField<List<LogicalLocation>> = logicalLocations

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

        /**
         * Returns the raw JSON value of [physicalLocation].
         *
         * Unlike [physicalLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("physicalLocation")
        @ExcludeMissing
        fun _physicalLocation(): JsonField<PhysicalLocation> = physicalLocation

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [relationships].
         *
         * Unlike [relationships], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relationships")
        @ExcludeMissing
        fun _relationships(): JsonField<List<Relationship>> = relationships

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Location]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Location]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var annotations: JsonField<MutableList<Annotation>>? = null
            private var logicalLocations: JsonField<MutableList<LogicalLocation>>? = null
            private var message: JsonField<Message> = JsonMissing.of()
            private var physicalLocation: JsonField<PhysicalLocation> = JsonMissing.of()
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var relationships: JsonField<MutableList<Relationship>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(location: Location) = apply {
                id = location.id
                annotations = location.annotations.map { it.toMutableList() }
                logicalLocations = location.logicalLocations.map { it.toMutableList() }
                message = location.message
                physicalLocation = location.physicalLocation
                properties = location.properties
                relationships = location.relationships.map { it.toMutableList() }
                additionalProperties = location.additionalProperties.toMutableMap()
            }

            /**
             * Value that distinguishes this location from all other locations within a single
             * result object.
             */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /** A set of regions relevant to the location. */
            fun annotations(annotations: List<Annotation>) = annotations(JsonField.of(annotations))

            /**
             * Sets [Builder.annotations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annotations] with a well-typed `List<Annotation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun annotations(annotations: JsonField<List<Annotation>>) = apply {
                this.annotations = annotations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Annotation] to [annotations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAnnotation(annotation: Annotation) = apply {
                annotations =
                    (annotations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("annotations", it).add(annotation)
                    }
            }

            /** The logical locations associated with the result. */
            fun logicalLocations(logicalLocations: List<LogicalLocation>) =
                logicalLocations(JsonField.of(logicalLocations))

            /**
             * Sets [Builder.logicalLocations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logicalLocations] with a well-typed
             * `List<LogicalLocation>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun logicalLocations(logicalLocations: JsonField<List<LogicalLocation>>) = apply {
                this.logicalLocations = logicalLocations.map { it.toMutableList() }
            }

            /**
             * Adds a single [LogicalLocation] to [logicalLocations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogicalLocation(logicalLocation: LogicalLocation) = apply {
                logicalLocations =
                    (logicalLocations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logicalLocations", it).add(logicalLocation)
                    }
            }

            /** A message relevant to the location. */
            fun message(message: Message) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Message] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Message>) = apply { this.message = message }

            /** Identifies the artifact and region. */
            fun physicalLocation(physicalLocation: PhysicalLocation) =
                physicalLocation(JsonField.of(physicalLocation))

            /**
             * Sets [Builder.physicalLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.physicalLocation] with a well-typed
             * [PhysicalLocation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun physicalLocation(physicalLocation: JsonField<PhysicalLocation>) = apply {
                this.physicalLocation = physicalLocation
            }

            /** Key/value pairs that provide additional information about the location. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** An array of objects that describe relationships between this location and others. */
            fun relationships(relationships: List<Relationship>) =
                relationships(JsonField.of(relationships))

            /**
             * Sets [Builder.relationships] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationships] with a well-typed
             * `List<Relationship>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun relationships(relationships: JsonField<List<Relationship>>) = apply {
                this.relationships = relationships.map { it.toMutableList() }
            }

            /**
             * Adds a single [Relationship] to [relationships].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRelationship(relationship: Relationship) = apply {
                relationships =
                    (relationships ?: JsonField.of(mutableListOf())).also {
                        checkKnown("relationships", it).add(relationship)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Location].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Location =
                Location(
                    id,
                    (annotations ?: JsonMissing.of()).map { it.toImmutable() },
                    (logicalLocations ?: JsonMissing.of()).map { it.toImmutable() },
                    message,
                    physicalLocation,
                    properties,
                    (relationships ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
            if (validated) {
                return@apply
            }

            id()
            annotations().ifPresent { it.forEach { it.validate() } }
            logicalLocations().ifPresent { it.forEach { it.validate() } }
            message().ifPresent { it.validate() }
            physicalLocation().ifPresent { it.validate() }
            properties().ifPresent { it.validate() }
            relationships().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HiddenLayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (annotations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (logicalLocations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (message.asKnown().getOrNull()?.validity() ?: 0) +
                (physicalLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (relationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** A region within an artifact where a result was detected. */
        class Annotation
        private constructor(
            private val byteLength: JsonField<Long>,
            private val byteOffset: JsonField<Long>,
            private val charLength: JsonField<Long>,
            private val charOffset: JsonField<Long>,
            private val endColumn: JsonField<Long>,
            private val endLine: JsonField<Long>,
            private val message: JsonField<Message>,
            private val properties: JsonField<Properties>,
            private val snippet: JsonField<Snippet>,
            private val sourceLanguage: JsonField<String>,
            private val startColumn: JsonField<Long>,
            private val startLine: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("byteLength")
                @ExcludeMissing
                byteLength: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("byteOffset")
                @ExcludeMissing
                byteOffset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("charLength")
                @ExcludeMissing
                charLength: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("charOffset")
                @ExcludeMissing
                charOffset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("endColumn")
                @ExcludeMissing
                endColumn: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("endLine")
                @ExcludeMissing
                endLine: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<Message> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<Properties> = JsonMissing.of(),
                @JsonProperty("snippet")
                @ExcludeMissing
                snippet: JsonField<Snippet> = JsonMissing.of(),
                @JsonProperty("sourceLanguage")
                @ExcludeMissing
                sourceLanguage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("startColumn")
                @ExcludeMissing
                startColumn: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("startLine")
                @ExcludeMissing
                startLine: JsonField<Long> = JsonMissing.of(),
            ) : this(
                byteLength,
                byteOffset,
                charLength,
                charOffset,
                endColumn,
                endLine,
                message,
                properties,
                snippet,
                sourceLanguage,
                startColumn,
                startLine,
                mutableMapOf(),
            )

            /**
             * The length of the region in bytes.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun byteLength(): Optional<Long> = byteLength.getOptional("byteLength")

            /**
             * The zero-based offset from the beginning of the artifact of the first byte in the
             * region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun byteOffset(): Optional<Long> = byteOffset.getOptional("byteOffset")

            /**
             * The length of the region in characters.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun charLength(): Optional<Long> = charLength.getOptional("charLength")

            /**
             * The zero-based offset from the beginning of the artifact of the first character in
             * the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun charOffset(): Optional<Long> = charOffset.getOptional("charOffset")

            /**
             * The column number of the character following the end of the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endColumn(): Optional<Long> = endColumn.getOptional("endColumn")

            /**
             * The line number of the last character in the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endLine(): Optional<Long> = endLine.getOptional("endLine")

            /**
             * A message relevant to the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun message(): Optional<Message> = message.getOptional("message")

            /**
             * Key/value pairs that provide additional information about the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * The portion of the artifact contents within the specified region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun snippet(): Optional<Snippet> = snippet.getOptional("snippet")

            /**
             * Specifies the source language, if any, of the portion of the artifact specified by
             * the region object.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun sourceLanguage(): Optional<String> = sourceLanguage.getOptional("sourceLanguage")

            /**
             * The column number of the first character in the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun startColumn(): Optional<Long> = startColumn.getOptional("startColumn")

            /**
             * The line number of the first character in the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun startLine(): Optional<Long> = startLine.getOptional("startLine")

            /**
             * Returns the raw JSON value of [byteLength].
             *
             * Unlike [byteLength], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("byteLength")
            @ExcludeMissing
            fun _byteLength(): JsonField<Long> = byteLength

            /**
             * Returns the raw JSON value of [byteOffset].
             *
             * Unlike [byteOffset], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("byteOffset")
            @ExcludeMissing
            fun _byteOffset(): JsonField<Long> = byteOffset

            /**
             * Returns the raw JSON value of [charLength].
             *
             * Unlike [charLength], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charLength")
            @ExcludeMissing
            fun _charLength(): JsonField<Long> = charLength

            /**
             * Returns the raw JSON value of [charOffset].
             *
             * Unlike [charOffset], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charOffset")
            @ExcludeMissing
            fun _charOffset(): JsonField<Long> = charOffset

            /**
             * Returns the raw JSON value of [endColumn].
             *
             * Unlike [endColumn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endColumn") @ExcludeMissing fun _endColumn(): JsonField<Long> = endColumn

            /**
             * Returns the raw JSON value of [endLine].
             *
             * Unlike [endLine], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("endLine") @ExcludeMissing fun _endLine(): JsonField<Long> = endLine

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [snippet].
             *
             * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("snippet") @ExcludeMissing fun _snippet(): JsonField<Snippet> = snippet

            /**
             * Returns the raw JSON value of [sourceLanguage].
             *
             * Unlike [sourceLanguage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sourceLanguage")
            @ExcludeMissing
            fun _sourceLanguage(): JsonField<String> = sourceLanguage

            /**
             * Returns the raw JSON value of [startColumn].
             *
             * Unlike [startColumn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("startColumn")
            @ExcludeMissing
            fun _startColumn(): JsonField<Long> = startColumn

            /**
             * Returns the raw JSON value of [startLine].
             *
             * Unlike [startLine], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("startLine") @ExcludeMissing fun _startLine(): JsonField<Long> = startLine

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Annotation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Annotation]. */
            class Builder internal constructor() {

                private var byteLength: JsonField<Long> = JsonMissing.of()
                private var byteOffset: JsonField<Long> = JsonMissing.of()
                private var charLength: JsonField<Long> = JsonMissing.of()
                private var charOffset: JsonField<Long> = JsonMissing.of()
                private var endColumn: JsonField<Long> = JsonMissing.of()
                private var endLine: JsonField<Long> = JsonMissing.of()
                private var message: JsonField<Message> = JsonMissing.of()
                private var properties: JsonField<Properties> = JsonMissing.of()
                private var snippet: JsonField<Snippet> = JsonMissing.of()
                private var sourceLanguage: JsonField<String> = JsonMissing.of()
                private var startColumn: JsonField<Long> = JsonMissing.of()
                private var startLine: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(annotation: Annotation) = apply {
                    byteLength = annotation.byteLength
                    byteOffset = annotation.byteOffset
                    charLength = annotation.charLength
                    charOffset = annotation.charOffset
                    endColumn = annotation.endColumn
                    endLine = annotation.endLine
                    message = annotation.message
                    properties = annotation.properties
                    snippet = annotation.snippet
                    sourceLanguage = annotation.sourceLanguage
                    startColumn = annotation.startColumn
                    startLine = annotation.startLine
                    additionalProperties = annotation.additionalProperties.toMutableMap()
                }

                /** The length of the region in bytes. */
                fun byteLength(byteLength: Long) = byteLength(JsonField.of(byteLength))

                /**
                 * Sets [Builder.byteLength] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.byteLength] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun byteLength(byteLength: JsonField<Long>) = apply { this.byteLength = byteLength }

                /**
                 * The zero-based offset from the beginning of the artifact of the first byte in the
                 * region.
                 */
                fun byteOffset(byteOffset: Long) = byteOffset(JsonField.of(byteOffset))

                /**
                 * Sets [Builder.byteOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.byteOffset] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun byteOffset(byteOffset: JsonField<Long>) = apply { this.byteOffset = byteOffset }

                /** The length of the region in characters. */
                fun charLength(charLength: Long) = charLength(JsonField.of(charLength))

                /**
                 * Sets [Builder.charLength] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.charLength] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun charLength(charLength: JsonField<Long>) = apply { this.charLength = charLength }

                /**
                 * The zero-based offset from the beginning of the artifact of the first character
                 * in the region.
                 */
                fun charOffset(charOffset: Long) = charOffset(JsonField.of(charOffset))

                /**
                 * Sets [Builder.charOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.charOffset] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun charOffset(charOffset: JsonField<Long>) = apply { this.charOffset = charOffset }

                /** The column number of the character following the end of the region. */
                fun endColumn(endColumn: Long) = endColumn(JsonField.of(endColumn))

                /**
                 * Sets [Builder.endColumn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endColumn] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endColumn(endColumn: JsonField<Long>) = apply { this.endColumn = endColumn }

                /** The line number of the last character in the region. */
                fun endLine(endLine: Long) = endLine(JsonField.of(endLine))

                /**
                 * Sets [Builder.endLine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endLine] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun endLine(endLine: JsonField<Long>) = apply { this.endLine = endLine }

                /** A message relevant to the region. */
                fun message(message: Message) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [Message] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<Message>) = apply { this.message = message }

                /** Key/value pairs that provide additional information about the region. */
                fun properties(properties: Properties) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [Properties] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<Properties>) = apply {
                    this.properties = properties
                }

                /** The portion of the artifact contents within the specified region. */
                fun snippet(snippet: Snippet) = snippet(JsonField.of(snippet))

                /**
                 * Sets [Builder.snippet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.snippet] with a well-typed [Snippet] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun snippet(snippet: JsonField<Snippet>) = apply { this.snippet = snippet }

                /**
                 * Specifies the source language, if any, of the portion of the artifact specified
                 * by the region object.
                 */
                fun sourceLanguage(sourceLanguage: String) =
                    sourceLanguage(JsonField.of(sourceLanguage))

                /**
                 * Sets [Builder.sourceLanguage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceLanguage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceLanguage(sourceLanguage: JsonField<String>) = apply {
                    this.sourceLanguage = sourceLanguage
                }

                /** The column number of the first character in the region. */
                fun startColumn(startColumn: Long) = startColumn(JsonField.of(startColumn))

                /**
                 * Sets [Builder.startColumn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startColumn] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startColumn(startColumn: JsonField<Long>) = apply {
                    this.startColumn = startColumn
                }

                /** The line number of the first character in the region. */
                fun startLine(startLine: Long) = startLine(JsonField.of(startLine))

                /**
                 * Sets [Builder.startLine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startLine] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startLine(startLine: JsonField<Long>) = apply { this.startLine = startLine }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Annotation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Annotation =
                    Annotation(
                        byteLength,
                        byteOffset,
                        charLength,
                        charOffset,
                        endColumn,
                        endLine,
                        message,
                        properties,
                        snippet,
                        sourceLanguage,
                        startColumn,
                        startLine,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Annotation = apply {
                if (validated) {
                    return@apply
                }

                byteLength()
                byteOffset()
                charLength()
                charOffset()
                endColumn()
                endLine()
                message().ifPresent { it.validate() }
                properties().ifPresent { it.validate() }
                snippet().ifPresent { it.validate() }
                sourceLanguage()
                startColumn()
                startLine()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (byteLength.asKnown().isPresent) 1 else 0) +
                    (if (byteOffset.asKnown().isPresent) 1 else 0) +
                    (if (charLength.asKnown().isPresent) 1 else 0) +
                    (if (charOffset.asKnown().isPresent) 1 else 0) +
                    (if (endColumn.asKnown().isPresent) 1 else 0) +
                    (if (endLine.asKnown().isPresent) 1 else 0) +
                    (message.asKnown().getOrNull()?.validity() ?: 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0) +
                    (snippet.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sourceLanguage.asKnown().isPresent) 1 else 0) +
                    (if (startColumn.asKnown().isPresent) 1 else 0) +
                    (if (startLine.asKnown().isPresent) 1 else 0)

            /** A message relevant to the region. */
            class Message
            private constructor(
                private val id: JsonField<String>,
                private val arguments: JsonField<List<String>>,
                private val markdown: JsonField<String>,
                private val properties: JsonField<Properties>,
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    markdown: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                ) : this(id, arguments, markdown, properties, text, mutableMapOf())

                /**
                 * The identifier for this message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * An array of strings to substitute into the message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                /**
                 * A Markdown message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun markdown(): Optional<String> = markdown.getOptional("markdown")

                /**
                 * Key/value pairs that provide additional information about the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * A plain text message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<List<String>> = arguments

                /**
                 * Returns the raw JSON value of [markdown].
                 *
                 * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("markdown")
                @ExcludeMissing
                fun _markdown(): JsonField<String> = markdown

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Message]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var arguments: JsonField<MutableList<String>>? = null
                    private var markdown: JsonField<String> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        id = message.id
                        arguments = message.arguments.map { it.toMutableList() }
                        markdown = message.markdown
                        properties = message.properties
                        text = message.text
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /** The identifier for this message. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** An array of strings to substitute into the message string. */
                    fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun arguments(arguments: JsonField<List<String>>) = apply {
                        this.arguments = arguments.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [arguments].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addArgument(argument: String) = apply {
                        arguments =
                            (arguments ?: JsonField.of(mutableListOf())).also {
                                checkKnown("arguments", it).add(argument)
                            }
                    }

                    /** A Markdown message string. */
                    fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                    /**
                     * Sets [Builder.markdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.markdown] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

                    /** Key/value pairs that provide additional information about the message. */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /** A plain text message string. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Message =
                        Message(
                            id,
                            (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                            markdown,
                            properties,
                            text,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    arguments()
                    markdown()
                    properties().ifPresent { it.validate() }
                    text()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (arguments.asKnown().getOrNull()?.size ?: 0) +
                        (if (markdown.asKnown().isPresent) 1 else 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (text.asKnown().isPresent) 1 else 0)

                /** Key/value pairs that provide additional information about the message. */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Message && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
            }

            /** Key/value pairs that provide additional information about the region. */
            class Properties
            private constructor(
                private val tags: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tags")
                    @ExcludeMissing
                    tags: JsonField<List<String>> = JsonMissing.of()
                ) : this(tags, mutableMapOf())

                /**
                 * A set of distinct strings that provide additional information.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tags(): Optional<List<String>> = tags.getOptional("tags")

                /**
                 * Returns the raw JSON value of [tags].
                 *
                 * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Properties]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Properties]. */
                class Builder internal constructor() {

                    private var tags: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(properties: Properties) = apply {
                        tags = properties.tags.map { it.toMutableList() }
                        additionalProperties = properties.additionalProperties.toMutableMap()
                    }

                    /** A set of distinct strings that provide additional information. */
                    fun tags(tags: List<String>) = tags(JsonField.of(tags))

                    /**
                     * Sets [Builder.tags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tags] with a well-typed `List<String>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tags(tags: JsonField<List<String>>) = apply {
                        this.tags = tags.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tags].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTag(tag: String) = apply {
                        tags =
                            (tags ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tags", it).add(tag)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Properties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Properties =
                        Properties(
                            (tags ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Properties = apply {
                    if (validated) {
                        return@apply
                    }

                    tags()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Properties{tags=$tags, additionalProperties=$additionalProperties}"
            }

            /** The portion of the artifact contents within the specified region. */
            class Snippet
            private constructor(
                private val binary: JsonField<String>,
                private val properties: JsonField<Properties>,
                private val rendered: JsonField<Rendered>,
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("binary")
                    @ExcludeMissing
                    binary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("rendered")
                    @ExcludeMissing
                    rendered: JsonField<Rendered> = JsonMissing.of(),
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                ) : this(binary, properties, rendered, text, mutableMapOf())

                /**
                 * MIME Base64-encoded content from a binary artifact, or from a text artifact in
                 * its original encoding.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun binary(): Optional<String> = binary.getOptional("binary")

                /**
                 * Key/value pairs that provide additional information about the artifact content.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * An alternate rendered representation of the artifact (e.g., a decompiled
                 * representation of a binary region).
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun rendered(): Optional<Rendered> = rendered.getOptional("rendered")

                /**
                 * UTF-8-encoded content from a text artifact.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [binary].
                 *
                 * Unlike [binary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("binary") @ExcludeMissing fun _binary(): JsonField<String> = binary

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [rendered].
                 *
                 * Unlike [rendered], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rendered")
                @ExcludeMissing
                fun _rendered(): JsonField<Rendered> = rendered

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Snippet]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Snippet]. */
                class Builder internal constructor() {

                    private var binary: JsonField<String> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var rendered: JsonField<Rendered> = JsonMissing.of()
                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(snippet: Snippet) = apply {
                        binary = snippet.binary
                        properties = snippet.properties
                        rendered = snippet.rendered
                        text = snippet.text
                        additionalProperties = snippet.additionalProperties.toMutableMap()
                    }

                    /**
                     * MIME Base64-encoded content from a binary artifact, or from a text artifact
                     * in its original encoding.
                     */
                    fun binary(binary: String) = binary(JsonField.of(binary))

                    /**
                     * Sets [Builder.binary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.binary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun binary(binary: JsonField<String>) = apply { this.binary = binary }

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * content.
                     */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /**
                     * An alternate rendered representation of the artifact (e.g., a decompiled
                     * representation of a binary region).
                     */
                    fun rendered(rendered: Rendered) = rendered(JsonField.of(rendered))

                    /**
                     * Sets [Builder.rendered] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rendered] with a well-typed [Rendered] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rendered(rendered: JsonField<Rendered>) = apply { this.rendered = rendered }

                    /** UTF-8-encoded content from a text artifact. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Snippet].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Snippet =
                        Snippet(
                            binary,
                            properties,
                            rendered,
                            text,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Snippet = apply {
                    if (validated) {
                        return@apply
                    }

                    binary()
                    properties().ifPresent { it.validate() }
                    rendered().ifPresent { it.validate() }
                    text()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (binary.asKnown().isPresent) 1 else 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (rendered.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (text.asKnown().isPresent) 1 else 0)

                /**
                 * Key/value pairs that provide additional information about the artifact content.
                 */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                /**
                 * An alternate rendered representation of the artifact (e.g., a decompiled
                 * representation of a binary region).
                 */
                class Rendered
                private constructor(
                    private val text: JsonField<String>,
                    private val markdown: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        markdown: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                    ) : this(text, markdown, properties, mutableMapOf())

                    /**
                     * A plain text message string or format string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun text(): String = text.getRequired("text")

                    /**
                     * A Markdown message string or format string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun markdown(): Optional<String> = markdown.getOptional("markdown")

                    /**
                     * Key/value pairs that provide additional information about the message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    /**
                     * Returns the raw JSON value of [markdown].
                     *
                     * Unlike [markdown], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    fun _markdown(): JsonField<String> = markdown

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Rendered].
                         *
                         * The following fields are required:
                         * ```java
                         * .text()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Rendered]. */
                    class Builder internal constructor() {

                        private var text: JsonField<String>? = null
                        private var markdown: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(rendered: Rendered) = apply {
                            text = rendered.text
                            markdown = rendered.markdown
                            properties = rendered.properties
                            additionalProperties = rendered.additionalProperties.toMutableMap()
                        }

                        /** A plain text message string or format string. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        /** A Markdown message string or format string. */
                        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                        /**
                         * Sets [Builder.markdown] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.markdown] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun markdown(markdown: JsonField<String>) = apply {
                            this.markdown = markdown
                        }

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Rendered].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .text()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Rendered =
                            Rendered(
                                checkRequired("text", text),
                                markdown,
                                properties,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Rendered = apply {
                        if (validated) {
                            return@apply
                        }

                        text()
                        markdown()
                        properties().ifPresent { it.validate() }
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (text.asKnown().isPresent) 1 else 0) +
                            (if (markdown.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0)

                    /** Key/value pairs that provide additional information about the message. */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Rendered && text == other.text && markdown == other.markdown && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(text, markdown, properties, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Rendered{text=$text, markdown=$markdown, properties=$properties, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Snippet && binary == other.binary && properties == other.properties && rendered == other.rendered && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(binary, properties, rendered, text, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Snippet{binary=$binary, properties=$properties, rendered=$rendered, text=$text, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Annotation && byteLength == other.byteLength && byteOffset == other.byteOffset && charLength == other.charLength && charOffset == other.charOffset && endColumn == other.endColumn && endLine == other.endLine && message == other.message && properties == other.properties && snippet == other.snippet && sourceLanguage == other.sourceLanguage && startColumn == other.startColumn && startLine == other.startLine && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(byteLength, byteOffset, charLength, charOffset, endColumn, endLine, message, properties, snippet, sourceLanguage, startColumn, startLine, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Annotation{byteLength=$byteLength, byteOffset=$byteOffset, charLength=$charLength, charOffset=$charOffset, endColumn=$endColumn, endLine=$endLine, message=$message, properties=$properties, snippet=$snippet, sourceLanguage=$sourceLanguage, startColumn=$startColumn, startLine=$startLine, additionalProperties=$additionalProperties}"
        }

        /** A logical location of a construct that produced a result. */
        class LogicalLocation
        private constructor(
            private val decoratedName: JsonField<String>,
            private val fullyQualifiedName: JsonField<String>,
            private val index: JsonField<Long>,
            private val kind: JsonField<String>,
            private val name: JsonField<String>,
            private val parentIndex: JsonField<Long>,
            private val properties: JsonField<Properties>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("decoratedName")
                @ExcludeMissing
                decoratedName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fullyQualifiedName")
                @ExcludeMissing
                fullyQualifiedName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parentIndex")
                @ExcludeMissing
                parentIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<Properties> = JsonMissing.of(),
            ) : this(
                decoratedName,
                fullyQualifiedName,
                index,
                kind,
                name,
                parentIndex,
                properties,
                mutableMapOf(),
            )

            /**
             * The machine-readable name for the logical location, such as a mangled function name
             * provided by a C++ compiler that encodes calling convention, return type and other
             * details along with the function name.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun decoratedName(): Optional<String> = decoratedName.getOptional("decoratedName")

            /**
             * The human-readable fully qualified name of the logical location.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fullyQualifiedName(): Optional<String> =
                fullyQualifiedName.getOptional("fullyQualifiedName")

            /**
             * The index within the logical locations array.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun index(): Optional<Long> = index.getOptional("index")

            /**
             * The type of construct this logical location component refers to. Should be one of
             * 'function', 'member', 'module', 'namespace', 'parameter', 'resource', 'returnType',
             * 'type', 'variable', 'object', 'array', 'property', 'value', 'element', 'text',
             * 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of
             * those accurately describe the construct.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun kind(): Optional<String> = kind.getOptional("kind")

            /**
             * Identifies the construct in which the result occurred. For example, this property
             * might contain the name of a class or a method.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Identifies the index of the immediate parent of the construct in which the result was
             * detected. For example, this property might point to a logical location that
             * represents the namespace that holds a type.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun parentIndex(): Optional<Long> = parentIndex.getOptional("parentIndex")

            /**
             * Key/value pairs that provide additional information about the logical location.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * Returns the raw JSON value of [decoratedName].
             *
             * Unlike [decoratedName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("decoratedName")
            @ExcludeMissing
            fun _decoratedName(): JsonField<String> = decoratedName

            /**
             * Returns the raw JSON value of [fullyQualifiedName].
             *
             * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fullyQualifiedName")
            @ExcludeMissing
            fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parentIndex].
             *
             * Unlike [parentIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parentIndex")
            @ExcludeMissing
            fun _parentIndex(): JsonField<Long> = parentIndex

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [LogicalLocation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LogicalLocation]. */
            class Builder internal constructor() {

                private var decoratedName: JsonField<String> = JsonMissing.of()
                private var fullyQualifiedName: JsonField<String> = JsonMissing.of()
                private var index: JsonField<Long> = JsonMissing.of()
                private var kind: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var parentIndex: JsonField<Long> = JsonMissing.of()
                private var properties: JsonField<Properties> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logicalLocation: LogicalLocation) = apply {
                    decoratedName = logicalLocation.decoratedName
                    fullyQualifiedName = logicalLocation.fullyQualifiedName
                    index = logicalLocation.index
                    kind = logicalLocation.kind
                    name = logicalLocation.name
                    parentIndex = logicalLocation.parentIndex
                    properties = logicalLocation.properties
                    additionalProperties = logicalLocation.additionalProperties.toMutableMap()
                }

                /**
                 * The machine-readable name for the logical location, such as a mangled function
                 * name provided by a C++ compiler that encodes calling convention, return type and
                 * other details along with the function name.
                 */
                fun decoratedName(decoratedName: String) =
                    decoratedName(JsonField.of(decoratedName))

                /**
                 * Sets [Builder.decoratedName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.decoratedName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun decoratedName(decoratedName: JsonField<String>) = apply {
                    this.decoratedName = decoratedName
                }

                /** The human-readable fully qualified name of the logical location. */
                fun fullyQualifiedName(fullyQualifiedName: String) =
                    fullyQualifiedName(JsonField.of(fullyQualifiedName))

                /**
                 * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullyQualifiedName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
                    this.fullyQualifiedName = fullyQualifiedName
                }

                /** The index within the logical locations array. */
                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                /**
                 * The type of construct this logical location component refers to. Should be one of
                 * 'function', 'member', 'module', 'namespace', 'parameter', 'resource',
                 * 'returnType', 'type', 'variable', 'object', 'array', 'property', 'value',
                 * 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or
                 * 'processingInstruction', if any of those accurately describe the construct.
                 */
                fun kind(kind: String) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                /**
                 * Identifies the construct in which the result occurred. For example, this property
                 * might contain the name of a class or a method.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Identifies the index of the immediate parent of the construct in which the result
                 * was detected. For example, this property might point to a logical location that
                 * represents the namespace that holds a type.
                 */
                fun parentIndex(parentIndex: Long) = parentIndex(JsonField.of(parentIndex))

                /**
                 * Sets [Builder.parentIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parentIndex(parentIndex: JsonField<Long>) = apply {
                    this.parentIndex = parentIndex
                }

                /**
                 * Key/value pairs that provide additional information about the logical location.
                 */
                fun properties(properties: Properties) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [Properties] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<Properties>) = apply {
                    this.properties = properties
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LogicalLocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LogicalLocation =
                    LogicalLocation(
                        decoratedName,
                        fullyQualifiedName,
                        index,
                        kind,
                        name,
                        parentIndex,
                        properties,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LogicalLocation = apply {
                if (validated) {
                    return@apply
                }

                decoratedName()
                fullyQualifiedName()
                index()
                kind()
                name()
                parentIndex()
                properties().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (decoratedName.asKnown().isPresent) 1 else 0) +
                    (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
                    (if (index.asKnown().isPresent) 1 else 0) +
                    (if (kind.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (parentIndex.asKnown().isPresent) 1 else 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0)

            /** Key/value pairs that provide additional information about the logical location. */
            class Properties
            private constructor(
                private val tags: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tags")
                    @ExcludeMissing
                    tags: JsonField<List<String>> = JsonMissing.of()
                ) : this(tags, mutableMapOf())

                /**
                 * A set of distinct strings that provide additional information.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tags(): Optional<List<String>> = tags.getOptional("tags")

                /**
                 * Returns the raw JSON value of [tags].
                 *
                 * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Properties]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Properties]. */
                class Builder internal constructor() {

                    private var tags: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(properties: Properties) = apply {
                        tags = properties.tags.map { it.toMutableList() }
                        additionalProperties = properties.additionalProperties.toMutableMap()
                    }

                    /** A set of distinct strings that provide additional information. */
                    fun tags(tags: List<String>) = tags(JsonField.of(tags))

                    /**
                     * Sets [Builder.tags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tags] with a well-typed `List<String>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tags(tags: JsonField<List<String>>) = apply {
                        this.tags = tags.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tags].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTag(tag: String) = apply {
                        tags =
                            (tags ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tags", it).add(tag)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Properties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Properties =
                        Properties(
                            (tags ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Properties = apply {
                    if (validated) {
                        return@apply
                    }

                    tags()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Properties{tags=$tags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LogicalLocation && decoratedName == other.decoratedName && fullyQualifiedName == other.fullyQualifiedName && index == other.index && kind == other.kind && name == other.name && parentIndex == other.parentIndex && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(decoratedName, fullyQualifiedName, index, kind, name, parentIndex, properties, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LogicalLocation{decoratedName=$decoratedName, fullyQualifiedName=$fullyQualifiedName, index=$index, kind=$kind, name=$name, parentIndex=$parentIndex, properties=$properties, additionalProperties=$additionalProperties}"
        }

        /** A message relevant to the location. */
        class Message
        private constructor(
            private val id: JsonField<String>,
            private val arguments: JsonField<List<String>>,
            private val markdown: JsonField<String>,
            private val properties: JsonField<Properties>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("arguments")
                @ExcludeMissing
                arguments: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("markdown")
                @ExcludeMissing
                markdown: JsonField<String> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<Properties> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(id, arguments, markdown, properties, text, mutableMapOf())

            /**
             * The identifier for this message.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * An array of strings to substitute into the message string.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

            /**
             * A Markdown message string.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun markdown(): Optional<String> = markdown.getOptional("markdown")

            /**
             * Key/value pairs that provide additional information about the message.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * A plain text message string.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [arguments].
             *
             * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("arguments")
            @ExcludeMissing
            fun _arguments(): JsonField<List<String>> = arguments

            /**
             * Returns the raw JSON value of [markdown].
             *
             * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Message]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Message]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var arguments: JsonField<MutableList<String>>? = null
                private var markdown: JsonField<String> = JsonMissing.of()
                private var properties: JsonField<Properties> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(message: Message) = apply {
                    id = message.id
                    arguments = message.arguments.map { it.toMutableList() }
                    markdown = message.markdown
                    properties = message.properties
                    text = message.text
                    additionalProperties = message.additionalProperties.toMutableMap()
                }

                /** The identifier for this message. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** An array of strings to substitute into the message string. */
                fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                /**
                 * Sets [Builder.arguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arguments] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun arguments(arguments: JsonField<List<String>>) = apply {
                    this.arguments = arguments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [arguments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addArgument(argument: String) = apply {
                    arguments =
                        (arguments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("arguments", it).add(argument)
                        }
                }

                /** A Markdown message string. */
                fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                /**
                 * Sets [Builder.markdown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.markdown] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

                /** Key/value pairs that provide additional information about the message. */
                fun properties(properties: Properties) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [Properties] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<Properties>) = apply {
                    this.properties = properties
                }

                /** A plain text message string. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Message].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Message =
                    Message(
                        id,
                        (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                        markdown,
                        properties,
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Message = apply {
                if (validated) {
                    return@apply
                }

                id()
                arguments()
                markdown()
                properties().ifPresent { it.validate() }
                text()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (arguments.asKnown().getOrNull()?.size ?: 0) +
                    (if (markdown.asKnown().isPresent) 1 else 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            /** Key/value pairs that provide additional information about the message. */
            class Properties
            private constructor(
                private val tags: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tags")
                    @ExcludeMissing
                    tags: JsonField<List<String>> = JsonMissing.of()
                ) : this(tags, mutableMapOf())

                /**
                 * A set of distinct strings that provide additional information.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tags(): Optional<List<String>> = tags.getOptional("tags")

                /**
                 * Returns the raw JSON value of [tags].
                 *
                 * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Properties]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Properties]. */
                class Builder internal constructor() {

                    private var tags: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(properties: Properties) = apply {
                        tags = properties.tags.map { it.toMutableList() }
                        additionalProperties = properties.additionalProperties.toMutableMap()
                    }

                    /** A set of distinct strings that provide additional information. */
                    fun tags(tags: List<String>) = tags(JsonField.of(tags))

                    /**
                     * Sets [Builder.tags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tags] with a well-typed `List<String>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tags(tags: JsonField<List<String>>) = apply {
                        this.tags = tags.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tags].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTag(tag: String) = apply {
                        tags =
                            (tags ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tags", it).add(tag)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Properties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Properties =
                        Properties(
                            (tags ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Properties = apply {
                    if (validated) {
                        return@apply
                    }

                    tags()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Properties{tags=$tags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Message && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Message{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
        }

        /** Identifies the artifact and region. */
        class PhysicalLocation
        private constructor(
            private val address: JsonField<Address>,
            private val artifactLocation: JsonField<ArtifactLocation>,
            private val contextRegion: JsonField<ContextRegion>,
            private val properties: JsonField<Properties>,
            private val region: JsonField<Region>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("artifactLocation")
                @ExcludeMissing
                artifactLocation: JsonField<ArtifactLocation> = JsonMissing.of(),
                @JsonProperty("contextRegion")
                @ExcludeMissing
                contextRegion: JsonField<ContextRegion> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<Properties> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            ) : this(address, artifactLocation, contextRegion, properties, region, mutableMapOf())

            /**
             * The address of the location.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Optional<Address> = address.getOptional("address")

            /**
             * The location of the artifact.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun artifactLocation(): Optional<ArtifactLocation> =
                artifactLocation.getOptional("artifactLocation")

            /**
             * Specifies a portion of the artifact that encloses the region. Allows a viewer to
             * display additional context around the region.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun contextRegion(): Optional<ContextRegion> =
                contextRegion.getOptional("contextRegion")

            /**
             * Key/value pairs that provide additional information about the physical location.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * Specifies a portion of the artifact.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun region(): Optional<Region> = region.getOptional("region")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /**
             * Returns the raw JSON value of [artifactLocation].
             *
             * Unlike [artifactLocation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("artifactLocation")
            @ExcludeMissing
            fun _artifactLocation(): JsonField<ArtifactLocation> = artifactLocation

            /**
             * Returns the raw JSON value of [contextRegion].
             *
             * Unlike [contextRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contextRegion")
            @ExcludeMissing
            fun _contextRegion(): JsonField<ContextRegion> = contextRegion

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PhysicalLocation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhysicalLocation]. */
            class Builder internal constructor() {

                private var address: JsonField<Address> = JsonMissing.of()
                private var artifactLocation: JsonField<ArtifactLocation> = JsonMissing.of()
                private var contextRegion: JsonField<ContextRegion> = JsonMissing.of()
                private var properties: JsonField<Properties> = JsonMissing.of()
                private var region: JsonField<Region> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(physicalLocation: PhysicalLocation) = apply {
                    address = physicalLocation.address
                    artifactLocation = physicalLocation.artifactLocation
                    contextRegion = physicalLocation.contextRegion
                    properties = physicalLocation.properties
                    region = physicalLocation.region
                    additionalProperties = physicalLocation.additionalProperties.toMutableMap()
                }

                /** The address of the location. */
                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The location of the artifact. */
                fun artifactLocation(artifactLocation: ArtifactLocation) =
                    artifactLocation(JsonField.of(artifactLocation))

                /**
                 * Sets [Builder.artifactLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.artifactLocation] with a well-typed
                 * [ArtifactLocation] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun artifactLocation(artifactLocation: JsonField<ArtifactLocation>) = apply {
                    this.artifactLocation = artifactLocation
                }

                /**
                 * Specifies a portion of the artifact that encloses the region. Allows a viewer to
                 * display additional context around the region.
                 */
                fun contextRegion(contextRegion: ContextRegion) =
                    contextRegion(JsonField.of(contextRegion))

                /**
                 * Sets [Builder.contextRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contextRegion] with a well-typed [ContextRegion]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contextRegion(contextRegion: JsonField<ContextRegion>) = apply {
                    this.contextRegion = contextRegion
                }

                /**
                 * Key/value pairs that provide additional information about the physical location.
                 */
                fun properties(properties: Properties) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [Properties] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<Properties>) = apply {
                    this.properties = properties
                }

                /** Specifies a portion of the artifact. */
                fun region(region: Region) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [Region] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<Region>) = apply { this.region = region }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PhysicalLocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhysicalLocation =
                    PhysicalLocation(
                        address,
                        artifactLocation,
                        contextRegion,
                        properties,
                        region,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PhysicalLocation = apply {
                if (validated) {
                    return@apply
                }

                address().ifPresent { it.validate() }
                artifactLocation().ifPresent { it.validate() }
                contextRegion().ifPresent { it.validate() }
                properties().ifPresent { it.validate() }
                region().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (artifactLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (contextRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0) +
                    (region.asKnown().getOrNull()?.validity() ?: 0)

            /** The address of the location. */
            class Address
            private constructor(
                private val absoluteAddress: JsonField<Long>,
                private val fullyQualifiedName: JsonField<String>,
                private val index: JsonField<Long>,
                private val kind: JsonField<String>,
                private val length: JsonField<Long>,
                private val name: JsonField<String>,
                private val offsetFromParent: JsonField<Long>,
                private val parentIndex: JsonField<Long>,
                private val properties: JsonField<Properties>,
                private val relativeAddress: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("absoluteAddress")
                    @ExcludeMissing
                    absoluteAddress: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("fullyQualifiedName")
                    @ExcludeMissing
                    fullyQualifiedName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("index")
                    @ExcludeMissing
                    index: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("kind")
                    @ExcludeMissing
                    kind: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("offsetFromParent")
                    @ExcludeMissing
                    offsetFromParent: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("parentIndex")
                    @ExcludeMissing
                    parentIndex: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("relativeAddress")
                    @ExcludeMissing
                    relativeAddress: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    absoluteAddress,
                    fullyQualifiedName,
                    index,
                    kind,
                    length,
                    name,
                    offsetFromParent,
                    parentIndex,
                    properties,
                    relativeAddress,
                    mutableMapOf(),
                )

                /**
                 * The address expressed as a byte offset from the start of the addressable region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun absoluteAddress(): Optional<Long> =
                    absoluteAddress.getOptional("absoluteAddress")

                /**
                 * A human-readable fully qualified name that is associated with the address.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fullyQualifiedName(): Optional<String> =
                    fullyQualifiedName.getOptional("fullyQualifiedName")

                /**
                 * The index within run.addresses of the cached object for this address.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Optional<Long> = index.getOptional("index")

                /**
                 * An open-ended string that identifies the address kind. 'data', 'function',
                 * 'header','instruction', 'module', 'page', 'section', 'segment', 'stack',
                 * 'stackFrame', 'table' are well-known values.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun kind(): Optional<String> = kind.getOptional("kind")

                /**
                 * The number of bytes in this range of addresses.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * A name that is associated with the address, e.g., '.text'.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The byte offset of this address from the absolute or relative address of the
                 * parent object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun offsetFromParent(): Optional<Long> =
                    offsetFromParent.getOptional("offsetFromParent")

                /**
                 * The index within run.addresses of the parent object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun parentIndex(): Optional<Long> = parentIndex.getOptional("parentIndex")

                /**
                 * Key/value pairs that provide additional information about the address.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * The address expressed as a byte offset from the absolute address of the top-most
                 * parent object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun relativeAddress(): Optional<Long> =
                    relativeAddress.getOptional("relativeAddress")

                /**
                 * Returns the raw JSON value of [absoluteAddress].
                 *
                 * Unlike [absoluteAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("absoluteAddress")
                @ExcludeMissing
                fun _absoluteAddress(): JsonField<Long> = absoluteAddress

                /**
                 * Returns the raw JSON value of [fullyQualifiedName].
                 *
                 * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fullyQualifiedName")
                @ExcludeMissing
                fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                /**
                 * Returns the raw JSON value of [kind].
                 *
                 * Unlike [kind], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [offsetFromParent].
                 *
                 * Unlike [offsetFromParent], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("offsetFromParent")
                @ExcludeMissing
                fun _offsetFromParent(): JsonField<Long> = offsetFromParent

                /**
                 * Returns the raw JSON value of [parentIndex].
                 *
                 * Unlike [parentIndex], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parentIndex")
                @ExcludeMissing
                fun _parentIndex(): JsonField<Long> = parentIndex

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [relativeAddress].
                 *
                 * Unlike [relativeAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("relativeAddress")
                @ExcludeMissing
                fun _relativeAddress(): JsonField<Long> = relativeAddress

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Address]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Address]. */
                class Builder internal constructor() {

                    private var absoluteAddress: JsonField<Long> = JsonMissing.of()
                    private var fullyQualifiedName: JsonField<String> = JsonMissing.of()
                    private var index: JsonField<Long> = JsonMissing.of()
                    private var kind: JsonField<String> = JsonMissing.of()
                    private var length: JsonField<Long> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var offsetFromParent: JsonField<Long> = JsonMissing.of()
                    private var parentIndex: JsonField<Long> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var relativeAddress: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        absoluteAddress = address.absoluteAddress
                        fullyQualifiedName = address.fullyQualifiedName
                        index = address.index
                        kind = address.kind
                        length = address.length
                        name = address.name
                        offsetFromParent = address.offsetFromParent
                        parentIndex = address.parentIndex
                        properties = address.properties
                        relativeAddress = address.relativeAddress
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /**
                     * The address expressed as a byte offset from the start of the addressable
                     * region.
                     */
                    fun absoluteAddress(absoluteAddress: Long) =
                        absoluteAddress(JsonField.of(absoluteAddress))

                    /**
                     * Sets [Builder.absoluteAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.absoluteAddress] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun absoluteAddress(absoluteAddress: JsonField<Long>) = apply {
                        this.absoluteAddress = absoluteAddress
                    }

                    /**
                     * A human-readable fully qualified name that is associated with the address.
                     */
                    fun fullyQualifiedName(fullyQualifiedName: String) =
                        fullyQualifiedName(JsonField.of(fullyQualifiedName))

                    /**
                     * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullyQualifiedName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
                        this.fullyQualifiedName = fullyQualifiedName
                    }

                    /** The index within run.addresses of the cached object for this address. */
                    fun index(index: Long) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

                    /**
                     * An open-ended string that identifies the address kind. 'data', 'function',
                     * 'header','instruction', 'module', 'page', 'section', 'segment', 'stack',
                     * 'stackFrame', 'table' are well-known values.
                     */
                    fun kind(kind: String) = kind(JsonField.of(kind))

                    /**
                     * Sets [Builder.kind] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kind] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                    /** The number of bytes in this range of addresses. */
                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    /** A name that is associated with the address, e.g., '.text'. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The byte offset of this address from the absolute or relative address of the
                     * parent object.
                     */
                    fun offsetFromParent(offsetFromParent: Long) =
                        offsetFromParent(JsonField.of(offsetFromParent))

                    /**
                     * Sets [Builder.offsetFromParent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.offsetFromParent] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun offsetFromParent(offsetFromParent: JsonField<Long>) = apply {
                        this.offsetFromParent = offsetFromParent
                    }

                    /** The index within run.addresses of the parent object. */
                    fun parentIndex(parentIndex: Long) = parentIndex(JsonField.of(parentIndex))

                    /**
                     * Sets [Builder.parentIndex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parentIndex] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun parentIndex(parentIndex: JsonField<Long>) = apply {
                        this.parentIndex = parentIndex
                    }

                    /** Key/value pairs that provide additional information about the address. */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /**
                     * The address expressed as a byte offset from the absolute address of the
                     * top-most parent object.
                     */
                    fun relativeAddress(relativeAddress: Long) =
                        relativeAddress(JsonField.of(relativeAddress))

                    /**
                     * Sets [Builder.relativeAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.relativeAddress] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun relativeAddress(relativeAddress: JsonField<Long>) = apply {
                        this.relativeAddress = relativeAddress
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Address].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Address =
                        Address(
                            absoluteAddress,
                            fullyQualifiedName,
                            index,
                            kind,
                            length,
                            name,
                            offsetFromParent,
                            parentIndex,
                            properties,
                            relativeAddress,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Address = apply {
                    if (validated) {
                        return@apply
                    }

                    absoluteAddress()
                    fullyQualifiedName()
                    index()
                    kind()
                    length()
                    name()
                    offsetFromParent()
                    parentIndex()
                    properties().ifPresent { it.validate() }
                    relativeAddress()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (absoluteAddress.asKnown().isPresent) 1 else 0) +
                        (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
                        (if (index.asKnown().isPresent) 1 else 0) +
                        (if (kind.asKnown().isPresent) 1 else 0) +
                        (if (length.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (offsetFromParent.asKnown().isPresent) 1 else 0) +
                        (if (parentIndex.asKnown().isPresent) 1 else 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (relativeAddress.asKnown().isPresent) 1 else 0)

                /** Key/value pairs that provide additional information about the address. */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && absoluteAddress == other.absoluteAddress && fullyQualifiedName == other.fullyQualifiedName && index == other.index && kind == other.kind && length == other.length && name == other.name && offsetFromParent == other.offsetFromParent && parentIndex == other.parentIndex && properties == other.properties && relativeAddress == other.relativeAddress && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(absoluteAddress, fullyQualifiedName, index, kind, length, name, offsetFromParent, parentIndex, properties, relativeAddress, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{absoluteAddress=$absoluteAddress, fullyQualifiedName=$fullyQualifiedName, index=$index, kind=$kind, length=$length, name=$name, offsetFromParent=$offsetFromParent, parentIndex=$parentIndex, properties=$properties, relativeAddress=$relativeAddress, additionalProperties=$additionalProperties}"
            }

            /** The location of the artifact. */
            class ArtifactLocation
            private constructor(
                private val description: JsonField<Description>,
                private val index: JsonField<Long>,
                private val properties: JsonField<Properties>,
                private val uri: JsonField<String>,
                private val uriBaseId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<Description> = JsonMissing.of(),
                    @JsonProperty("index")
                    @ExcludeMissing
                    index: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("uriBaseId")
                    @ExcludeMissing
                    uriBaseId: JsonField<String> = JsonMissing.of(),
                ) : this(description, index, properties, uri, uriBaseId, mutableMapOf())

                /**
                 * A short description of the artifact location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<Description> = description.getOptional("description")

                /**
                 * The index within the run artifacts array of the artifact object associated with
                 * the artifact location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Optional<Long> = index.getOptional("index")

                /**
                 * Key/value pairs that provide additional information about the artifact location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * A string containing a valid relative or absolute URI.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun uri(): Optional<String> = uri.getOptional("uri")

                /**
                 * A string which indirectly specifies the absolute URI with respect to which a
                 * relative URI in the "uri" property is interpreted.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun uriBaseId(): Optional<String> = uriBaseId.getOptional("uriBaseId")

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<Description> = description

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [uri].
                 *
                 * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

                /**
                 * Returns the raw JSON value of [uriBaseId].
                 *
                 * Unlike [uriBaseId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("uriBaseId")
                @ExcludeMissing
                fun _uriBaseId(): JsonField<String> = uriBaseId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ArtifactLocation].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ArtifactLocation]. */
                class Builder internal constructor() {

                    private var description: JsonField<Description> = JsonMissing.of()
                    private var index: JsonField<Long> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var uri: JsonField<String> = JsonMissing.of()
                    private var uriBaseId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(artifactLocation: ArtifactLocation) = apply {
                        description = artifactLocation.description
                        index = artifactLocation.index
                        properties = artifactLocation.properties
                        uri = artifactLocation.uri
                        uriBaseId = artifactLocation.uriBaseId
                        additionalProperties = artifactLocation.additionalProperties.toMutableMap()
                    }

                    /** A short description of the artifact location. */
                    fun description(description: Description) =
                        description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [Description]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<Description>) = apply {
                        this.description = description
                    }

                    /**
                     * The index within the run artifacts array of the artifact object associated
                     * with the artifact location.
                     */
                    fun index(index: Long) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * location.
                     */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /** A string containing a valid relative or absolute URI. */
                    fun uri(uri: String) = uri(JsonField.of(uri))

                    /**
                     * Sets [Builder.uri] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.uri] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun uri(uri: JsonField<String>) = apply { this.uri = uri }

                    /**
                     * A string which indirectly specifies the absolute URI with respect to which a
                     * relative URI in the "uri" property is interpreted.
                     */
                    fun uriBaseId(uriBaseId: String) = uriBaseId(JsonField.of(uriBaseId))

                    /**
                     * Sets [Builder.uriBaseId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.uriBaseId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun uriBaseId(uriBaseId: JsonField<String>) = apply {
                        this.uriBaseId = uriBaseId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ArtifactLocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ArtifactLocation =
                        ArtifactLocation(
                            description,
                            index,
                            properties,
                            uri,
                            uriBaseId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ArtifactLocation = apply {
                    if (validated) {
                        return@apply
                    }

                    description().ifPresent { it.validate() }
                    index()
                    properties().ifPresent { it.validate() }
                    uri()
                    uriBaseId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (description.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (index.asKnown().isPresent) 1 else 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (uri.asKnown().isPresent) 1 else 0) +
                        (if (uriBaseId.asKnown().isPresent) 1 else 0)

                /** A short description of the artifact location. */
                class Description
                private constructor(
                    private val id: JsonField<String>,
                    private val arguments: JsonField<List<String>>,
                    private val markdown: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val text: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        arguments: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        markdown: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                    ) : this(id, arguments, markdown, properties, text, mutableMapOf())

                    /**
                     * The identifier for this message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * An array of strings to substitute into the message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                    /**
                     * A Markdown message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun markdown(): Optional<String> = markdown.getOptional("markdown")

                    /**
                     * Key/value pairs that provide additional information about the message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * A plain text message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [arguments].
                     *
                     * Unlike [arguments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun _arguments(): JsonField<List<String>> = arguments

                    /**
                     * Returns the raw JSON value of [markdown].
                     *
                     * Unlike [markdown], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    fun _markdown(): JsonField<String> = markdown

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Description].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Description]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var arguments: JsonField<MutableList<String>>? = null
                        private var markdown: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(description: Description) = apply {
                            id = description.id
                            arguments = description.arguments.map { it.toMutableList() }
                            markdown = description.markdown
                            properties = description.properties
                            text = description.text
                            additionalProperties = description.additionalProperties.toMutableMap()
                        }

                        /** The identifier for this message. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** An array of strings to substitute into the message string. */
                        fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                        /**
                         * Sets [Builder.arguments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arguments] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun arguments(arguments: JsonField<List<String>>) = apply {
                            this.arguments = arguments.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [arguments].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addArgument(argument: String) = apply {
                            arguments =
                                (arguments ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("arguments", it).add(argument)
                                }
                        }

                        /** A Markdown message string. */
                        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                        /**
                         * Sets [Builder.markdown] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.markdown] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun markdown(markdown: JsonField<String>) = apply {
                            this.markdown = markdown
                        }

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        /** A plain text message string. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Description].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Description =
                            Description(
                                id,
                                (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                                markdown,
                                properties,
                                text,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Description = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        arguments()
                        markdown()
                        properties().ifPresent { it.validate() }
                        text()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (arguments.asKnown().getOrNull()?.size ?: 0) +
                            (if (markdown.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0)

                    /** Key/value pairs that provide additional information about the message. */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Description && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Description{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
                }

                /**
                 * Key/value pairs that provide additional information about the artifact location.
                 */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ArtifactLocation && description == other.description && index == other.index && properties == other.properties && uri == other.uri && uriBaseId == other.uriBaseId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(description, index, properties, uri, uriBaseId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ArtifactLocation{description=$description, index=$index, properties=$properties, uri=$uri, uriBaseId=$uriBaseId, additionalProperties=$additionalProperties}"
            }

            /**
             * Specifies a portion of the artifact that encloses the region. Allows a viewer to
             * display additional context around the region.
             */
            class ContextRegion
            private constructor(
                private val byteLength: JsonField<Long>,
                private val byteOffset: JsonField<Long>,
                private val charLength: JsonField<Long>,
                private val charOffset: JsonField<Long>,
                private val endColumn: JsonField<Long>,
                private val endLine: JsonField<Long>,
                private val message: JsonField<Message>,
                private val properties: JsonField<Properties>,
                private val snippet: JsonField<Snippet>,
                private val sourceLanguage: JsonField<String>,
                private val startColumn: JsonField<Long>,
                private val startLine: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("byteLength")
                    @ExcludeMissing
                    byteLength: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("byteOffset")
                    @ExcludeMissing
                    byteOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("charLength")
                    @ExcludeMissing
                    charLength: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("charOffset")
                    @ExcludeMissing
                    charOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("endColumn")
                    @ExcludeMissing
                    endColumn: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("endLine")
                    @ExcludeMissing
                    endLine: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<Message> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("snippet")
                    @ExcludeMissing
                    snippet: JsonField<Snippet> = JsonMissing.of(),
                    @JsonProperty("sourceLanguage")
                    @ExcludeMissing
                    sourceLanguage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("startColumn")
                    @ExcludeMissing
                    startColumn: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("startLine")
                    @ExcludeMissing
                    startLine: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    byteLength,
                    byteOffset,
                    charLength,
                    charOffset,
                    endColumn,
                    endLine,
                    message,
                    properties,
                    snippet,
                    sourceLanguage,
                    startColumn,
                    startLine,
                    mutableMapOf(),
                )

                /**
                 * The length of the region in bytes.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun byteLength(): Optional<Long> = byteLength.getOptional("byteLength")

                /**
                 * The zero-based offset from the beginning of the artifact of the first byte in the
                 * region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun byteOffset(): Optional<Long> = byteOffset.getOptional("byteOffset")

                /**
                 * The length of the region in characters.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun charLength(): Optional<Long> = charLength.getOptional("charLength")

                /**
                 * The zero-based offset from the beginning of the artifact of the first character
                 * in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun charOffset(): Optional<Long> = charOffset.getOptional("charOffset")

                /**
                 * The column number of the character following the end of the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endColumn(): Optional<Long> = endColumn.getOptional("endColumn")

                /**
                 * The line number of the last character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endLine(): Optional<Long> = endLine.getOptional("endLine")

                /**
                 * A message relevant to the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun message(): Optional<Message> = message.getOptional("message")

                /**
                 * Key/value pairs that provide additional information about the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * The portion of the artifact contents within the specified region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun snippet(): Optional<Snippet> = snippet.getOptional("snippet")

                /**
                 * Specifies the source language, if any, of the portion of the artifact specified
                 * by the region object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun sourceLanguage(): Optional<String> =
                    sourceLanguage.getOptional("sourceLanguage")

                /**
                 * The column number of the first character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun startColumn(): Optional<Long> = startColumn.getOptional("startColumn")

                /**
                 * The line number of the first character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun startLine(): Optional<Long> = startLine.getOptional("startLine")

                /**
                 * Returns the raw JSON value of [byteLength].
                 *
                 * Unlike [byteLength], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("byteLength")
                @ExcludeMissing
                fun _byteLength(): JsonField<Long> = byteLength

                /**
                 * Returns the raw JSON value of [byteOffset].
                 *
                 * Unlike [byteOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("byteOffset")
                @ExcludeMissing
                fun _byteOffset(): JsonField<Long> = byteOffset

                /**
                 * Returns the raw JSON value of [charLength].
                 *
                 * Unlike [charLength], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("charLength")
                @ExcludeMissing
                fun _charLength(): JsonField<Long> = charLength

                /**
                 * Returns the raw JSON value of [charOffset].
                 *
                 * Unlike [charOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("charOffset")
                @ExcludeMissing
                fun _charOffset(): JsonField<Long> = charOffset

                /**
                 * Returns the raw JSON value of [endColumn].
                 *
                 * Unlike [endColumn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endColumn")
                @ExcludeMissing
                fun _endColumn(): JsonField<Long> = endColumn

                /**
                 * Returns the raw JSON value of [endLine].
                 *
                 * Unlike [endLine], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endLine") @ExcludeMissing fun _endLine(): JsonField<Long> = endLine

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message")
                @ExcludeMissing
                fun _message(): JsonField<Message> = message

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [snippet].
                 *
                 * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("snippet")
                @ExcludeMissing
                fun _snippet(): JsonField<Snippet> = snippet

                /**
                 * Returns the raw JSON value of [sourceLanguage].
                 *
                 * Unlike [sourceLanguage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sourceLanguage")
                @ExcludeMissing
                fun _sourceLanguage(): JsonField<String> = sourceLanguage

                /**
                 * Returns the raw JSON value of [startColumn].
                 *
                 * Unlike [startColumn], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("startColumn")
                @ExcludeMissing
                fun _startColumn(): JsonField<Long> = startColumn

                /**
                 * Returns the raw JSON value of [startLine].
                 *
                 * Unlike [startLine], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("startLine")
                @ExcludeMissing
                fun _startLine(): JsonField<Long> = startLine

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ContextRegion].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ContextRegion]. */
                class Builder internal constructor() {

                    private var byteLength: JsonField<Long> = JsonMissing.of()
                    private var byteOffset: JsonField<Long> = JsonMissing.of()
                    private var charLength: JsonField<Long> = JsonMissing.of()
                    private var charOffset: JsonField<Long> = JsonMissing.of()
                    private var endColumn: JsonField<Long> = JsonMissing.of()
                    private var endLine: JsonField<Long> = JsonMissing.of()
                    private var message: JsonField<Message> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var snippet: JsonField<Snippet> = JsonMissing.of()
                    private var sourceLanguage: JsonField<String> = JsonMissing.of()
                    private var startColumn: JsonField<Long> = JsonMissing.of()
                    private var startLine: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contextRegion: ContextRegion) = apply {
                        byteLength = contextRegion.byteLength
                        byteOffset = contextRegion.byteOffset
                        charLength = contextRegion.charLength
                        charOffset = contextRegion.charOffset
                        endColumn = contextRegion.endColumn
                        endLine = contextRegion.endLine
                        message = contextRegion.message
                        properties = contextRegion.properties
                        snippet = contextRegion.snippet
                        sourceLanguage = contextRegion.sourceLanguage
                        startColumn = contextRegion.startColumn
                        startLine = contextRegion.startLine
                        additionalProperties = contextRegion.additionalProperties.toMutableMap()
                    }

                    /** The length of the region in bytes. */
                    fun byteLength(byteLength: Long) = byteLength(JsonField.of(byteLength))

                    /**
                     * Sets [Builder.byteLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.byteLength] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun byteLength(byteLength: JsonField<Long>) = apply {
                        this.byteLength = byteLength
                    }

                    /**
                     * The zero-based offset from the beginning of the artifact of the first byte in
                     * the region.
                     */
                    fun byteOffset(byteOffset: Long) = byteOffset(JsonField.of(byteOffset))

                    /**
                     * Sets [Builder.byteOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.byteOffset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun byteOffset(byteOffset: JsonField<Long>) = apply {
                        this.byteOffset = byteOffset
                    }

                    /** The length of the region in characters. */
                    fun charLength(charLength: Long) = charLength(JsonField.of(charLength))

                    /**
                     * Sets [Builder.charLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.charLength] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun charLength(charLength: JsonField<Long>) = apply {
                        this.charLength = charLength
                    }

                    /**
                     * The zero-based offset from the beginning of the artifact of the first
                     * character in the region.
                     */
                    fun charOffset(charOffset: Long) = charOffset(JsonField.of(charOffset))

                    /**
                     * Sets [Builder.charOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.charOffset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun charOffset(charOffset: JsonField<Long>) = apply {
                        this.charOffset = charOffset
                    }

                    /** The column number of the character following the end of the region. */
                    fun endColumn(endColumn: Long) = endColumn(JsonField.of(endColumn))

                    /**
                     * Sets [Builder.endColumn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endColumn] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endColumn(endColumn: JsonField<Long>) = apply { this.endColumn = endColumn }

                    /** The line number of the last character in the region. */
                    fun endLine(endLine: Long) = endLine(JsonField.of(endLine))

                    /**
                     * Sets [Builder.endLine] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endLine] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endLine(endLine: JsonField<Long>) = apply { this.endLine = endLine }

                    /** A message relevant to the region. */
                    fun message(message: Message) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [Message] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<Message>) = apply { this.message = message }

                    /** Key/value pairs that provide additional information about the region. */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /** The portion of the artifact contents within the specified region. */
                    fun snippet(snippet: Snippet) = snippet(JsonField.of(snippet))

                    /**
                     * Sets [Builder.snippet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.snippet] with a well-typed [Snippet] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun snippet(snippet: JsonField<Snippet>) = apply { this.snippet = snippet }

                    /**
                     * Specifies the source language, if any, of the portion of the artifact
                     * specified by the region object.
                     */
                    fun sourceLanguage(sourceLanguage: String) =
                        sourceLanguage(JsonField.of(sourceLanguage))

                    /**
                     * Sets [Builder.sourceLanguage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sourceLanguage] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sourceLanguage(sourceLanguage: JsonField<String>) = apply {
                        this.sourceLanguage = sourceLanguage
                    }

                    /** The column number of the first character in the region. */
                    fun startColumn(startColumn: Long) = startColumn(JsonField.of(startColumn))

                    /**
                     * Sets [Builder.startColumn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startColumn] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun startColumn(startColumn: JsonField<Long>) = apply {
                        this.startColumn = startColumn
                    }

                    /** The line number of the first character in the region. */
                    fun startLine(startLine: Long) = startLine(JsonField.of(startLine))

                    /**
                     * Sets [Builder.startLine] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startLine] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun startLine(startLine: JsonField<Long>) = apply { this.startLine = startLine }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ContextRegion].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ContextRegion =
                        ContextRegion(
                            byteLength,
                            byteOffset,
                            charLength,
                            charOffset,
                            endColumn,
                            endLine,
                            message,
                            properties,
                            snippet,
                            sourceLanguage,
                            startColumn,
                            startLine,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ContextRegion = apply {
                    if (validated) {
                        return@apply
                    }

                    byteLength()
                    byteOffset()
                    charLength()
                    charOffset()
                    endColumn()
                    endLine()
                    message().ifPresent { it.validate() }
                    properties().ifPresent { it.validate() }
                    snippet().ifPresent { it.validate() }
                    sourceLanguage()
                    startColumn()
                    startLine()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (byteLength.asKnown().isPresent) 1 else 0) +
                        (if (byteOffset.asKnown().isPresent) 1 else 0) +
                        (if (charLength.asKnown().isPresent) 1 else 0) +
                        (if (charOffset.asKnown().isPresent) 1 else 0) +
                        (if (endColumn.asKnown().isPresent) 1 else 0) +
                        (if (endLine.asKnown().isPresent) 1 else 0) +
                        (message.asKnown().getOrNull()?.validity() ?: 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (snippet.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (sourceLanguage.asKnown().isPresent) 1 else 0) +
                        (if (startColumn.asKnown().isPresent) 1 else 0) +
                        (if (startLine.asKnown().isPresent) 1 else 0)

                /** A message relevant to the region. */
                class Message
                private constructor(
                    private val id: JsonField<String>,
                    private val arguments: JsonField<List<String>>,
                    private val markdown: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val text: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        arguments: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        markdown: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                    ) : this(id, arguments, markdown, properties, text, mutableMapOf())

                    /**
                     * The identifier for this message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * An array of strings to substitute into the message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                    /**
                     * A Markdown message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun markdown(): Optional<String> = markdown.getOptional("markdown")

                    /**
                     * Key/value pairs that provide additional information about the message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * A plain text message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [arguments].
                     *
                     * Unlike [arguments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun _arguments(): JsonField<List<String>> = arguments

                    /**
                     * Returns the raw JSON value of [markdown].
                     *
                     * Unlike [markdown], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    fun _markdown(): JsonField<String> = markdown

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Message]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Message]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var arguments: JsonField<MutableList<String>>? = null
                        private var markdown: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(message: Message) = apply {
                            id = message.id
                            arguments = message.arguments.map { it.toMutableList() }
                            markdown = message.markdown
                            properties = message.properties
                            text = message.text
                            additionalProperties = message.additionalProperties.toMutableMap()
                        }

                        /** The identifier for this message. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** An array of strings to substitute into the message string. */
                        fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                        /**
                         * Sets [Builder.arguments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arguments] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun arguments(arguments: JsonField<List<String>>) = apply {
                            this.arguments = arguments.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [arguments].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addArgument(argument: String) = apply {
                            arguments =
                                (arguments ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("arguments", it).add(argument)
                                }
                        }

                        /** A Markdown message string. */
                        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                        /**
                         * Sets [Builder.markdown] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.markdown] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun markdown(markdown: JsonField<String>) = apply {
                            this.markdown = markdown
                        }

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        /** A plain text message string. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Message].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Message =
                            Message(
                                id,
                                (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                                markdown,
                                properties,
                                text,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Message = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        arguments()
                        markdown()
                        properties().ifPresent { it.validate() }
                        text()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (arguments.asKnown().getOrNull()?.size ?: 0) +
                            (if (markdown.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0)

                    /** Key/value pairs that provide additional information about the message. */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Message && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Message{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
                }

                /** Key/value pairs that provide additional information about the region. */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                /** The portion of the artifact contents within the specified region. */
                class Snippet
                private constructor(
                    private val binary: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val rendered: JsonField<Rendered>,
                    private val text: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("binary")
                        @ExcludeMissing
                        binary: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                        @JsonProperty("rendered")
                        @ExcludeMissing
                        rendered: JsonField<Rendered> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                    ) : this(binary, properties, rendered, text, mutableMapOf())

                    /**
                     * MIME Base64-encoded content from a binary artifact, or from a text artifact
                     * in its original encoding.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun binary(): Optional<String> = binary.getOptional("binary")

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * content.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * An alternate rendered representation of the artifact (e.g., a decompiled
                     * representation of a binary region).
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun rendered(): Optional<Rendered> = rendered.getOptional("rendered")

                    /**
                     * UTF-8-encoded content from a text artifact.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * Returns the raw JSON value of [binary].
                     *
                     * Unlike [binary], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("binary")
                    @ExcludeMissing
                    fun _binary(): JsonField<String> = binary

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    /**
                     * Returns the raw JSON value of [rendered].
                     *
                     * Unlike [rendered], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("rendered")
                    @ExcludeMissing
                    fun _rendered(): JsonField<Rendered> = rendered

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Snippet]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Snippet]. */
                    class Builder internal constructor() {

                        private var binary: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var rendered: JsonField<Rendered> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(snippet: Snippet) = apply {
                            binary = snippet.binary
                            properties = snippet.properties
                            rendered = snippet.rendered
                            text = snippet.text
                            additionalProperties = snippet.additionalProperties.toMutableMap()
                        }

                        /**
                         * MIME Base64-encoded content from a binary artifact, or from a text
                         * artifact in its original encoding.
                         */
                        fun binary(binary: String) = binary(JsonField.of(binary))

                        /**
                         * Sets [Builder.binary] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.binary] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun binary(binary: JsonField<String>) = apply { this.binary = binary }

                        /**
                         * Key/value pairs that provide additional information about the artifact
                         * content.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        /**
                         * An alternate rendered representation of the artifact (e.g., a decompiled
                         * representation of a binary region).
                         */
                        fun rendered(rendered: Rendered) = rendered(JsonField.of(rendered))

                        /**
                         * Sets [Builder.rendered] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.rendered] with a well-typed [Rendered]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun rendered(rendered: JsonField<Rendered>) = apply {
                            this.rendered = rendered
                        }

                        /** UTF-8-encoded content from a text artifact. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Snippet].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Snippet =
                            Snippet(
                                binary,
                                properties,
                                rendered,
                                text,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Snippet = apply {
                        if (validated) {
                            return@apply
                        }

                        binary()
                        properties().ifPresent { it.validate() }
                        rendered().ifPresent { it.validate() }
                        text()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (binary.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                            (rendered.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0)

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * content.
                     */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * An alternate rendered representation of the artifact (e.g., a decompiled
                     * representation of a binary region).
                     */
                    class Rendered
                    private constructor(
                        private val text: JsonField<String>,
                        private val markdown: JsonField<String>,
                        private val properties: JsonField<Properties>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("markdown")
                            @ExcludeMissing
                            markdown: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("properties")
                            @ExcludeMissing
                            properties: JsonField<Properties> = JsonMissing.of(),
                        ) : this(text, markdown, properties, mutableMapOf())

                        /**
                         * A plain text message string or format string.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * A Markdown message string or format string.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun markdown(): Optional<String> = markdown.getOptional("markdown")

                        /**
                         * Key/value pairs that provide additional information about the message.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun properties(): Optional<Properties> =
                            properties.getOptional("properties")

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        /**
                         * Returns the raw JSON value of [markdown].
                         *
                         * Unlike [markdown], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        fun _markdown(): JsonField<String> = markdown

                        /**
                         * Returns the raw JSON value of [properties].
                         *
                         * Unlike [properties], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("properties")
                        @ExcludeMissing
                        fun _properties(): JsonField<Properties> = properties

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Rendered].
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Rendered]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var markdown: JsonField<String> = JsonMissing.of()
                            private var properties: JsonField<Properties> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(rendered: Rendered) = apply {
                                text = rendered.text
                                markdown = rendered.markdown
                                properties = rendered.properties
                                additionalProperties = rendered.additionalProperties.toMutableMap()
                            }

                            /** A plain text message string or format string. */
                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /** A Markdown message string or format string. */
                            fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                            /**
                             * Sets [Builder.markdown] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.markdown] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun markdown(markdown: JsonField<String>) = apply {
                                this.markdown = markdown
                            }

                            /**
                             * Key/value pairs that provide additional information about the
                             * message.
                             */
                            fun properties(properties: Properties) =
                                properties(JsonField.of(properties))

                            /**
                             * Sets [Builder.properties] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.properties] with a well-typed
                             * [Properties] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun properties(properties: JsonField<Properties>) = apply {
                                this.properties = properties
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Rendered].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Rendered =
                                Rendered(
                                    checkRequired("text", text),
                                    markdown,
                                    properties,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Rendered = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            markdown()
                            properties().ifPresent { it.validate() }
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (text.asKnown().isPresent) 1 else 0) +
                                (if (markdown.asKnown().isPresent) 1 else 0) +
                                (properties.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        class Properties
                        private constructor(
                            private val tags: JsonField<List<String>>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("tags")
                                @ExcludeMissing
                                tags: JsonField<List<String>> = JsonMissing.of()
                            ) : this(tags, mutableMapOf())

                            /**
                             * A set of distinct strings that provide additional information.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun tags(): Optional<List<String>> = tags.getOptional("tags")

                            /**
                             * Returns the raw JSON value of [tags].
                             *
                             * Unlike [tags], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("tags")
                            @ExcludeMissing
                            fun _tags(): JsonField<List<String>> = tags

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [Properties].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Properties]. */
                            class Builder internal constructor() {

                                private var tags: JsonField<MutableList<String>>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(properties: Properties) = apply {
                                    tags = properties.tags.map { it.toMutableList() }
                                    additionalProperties =
                                        properties.additionalProperties.toMutableMap()
                                }

                                /**
                                 * A set of distinct strings that provide additional information.
                                 */
                                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                                /**
                                 * Sets [Builder.tags] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.tags] with a well-typed
                                 * `List<String>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun tags(tags: JsonField<List<String>>) = apply {
                                    this.tags = tags.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [String] to [tags].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addTag(tag: String) = apply {
                                    tags =
                                        (tags ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("tags", it).add(tag)
                                        }
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Properties].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Properties =
                                    Properties(
                                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Properties = apply {
                                if (validated) {
                                    return@apply
                                }

                                tags()
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: HiddenLayerInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Rendered && text == other.text && markdown == other.markdown && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, markdown, properties, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Rendered{text=$text, markdown=$markdown, properties=$properties, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Snippet && binary == other.binary && properties == other.properties && rendered == other.rendered && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(binary, properties, rendered, text, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Snippet{binary=$binary, properties=$properties, rendered=$rendered, text=$text, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ContextRegion && byteLength == other.byteLength && byteOffset == other.byteOffset && charLength == other.charLength && charOffset == other.charOffset && endColumn == other.endColumn && endLine == other.endLine && message == other.message && properties == other.properties && snippet == other.snippet && sourceLanguage == other.sourceLanguage && startColumn == other.startColumn && startLine == other.startLine && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(byteLength, byteOffset, charLength, charOffset, endColumn, endLine, message, properties, snippet, sourceLanguage, startColumn, startLine, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ContextRegion{byteLength=$byteLength, byteOffset=$byteOffset, charLength=$charLength, charOffset=$charOffset, endColumn=$endColumn, endLine=$endLine, message=$message, properties=$properties, snippet=$snippet, sourceLanguage=$sourceLanguage, startColumn=$startColumn, startLine=$startLine, additionalProperties=$additionalProperties}"
            }

            /** Key/value pairs that provide additional information about the physical location. */
            class Properties
            private constructor(
                private val tags: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tags")
                    @ExcludeMissing
                    tags: JsonField<List<String>> = JsonMissing.of()
                ) : this(tags, mutableMapOf())

                /**
                 * A set of distinct strings that provide additional information.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tags(): Optional<List<String>> = tags.getOptional("tags")

                /**
                 * Returns the raw JSON value of [tags].
                 *
                 * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Properties]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Properties]. */
                class Builder internal constructor() {

                    private var tags: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(properties: Properties) = apply {
                        tags = properties.tags.map { it.toMutableList() }
                        additionalProperties = properties.additionalProperties.toMutableMap()
                    }

                    /** A set of distinct strings that provide additional information. */
                    fun tags(tags: List<String>) = tags(JsonField.of(tags))

                    /**
                     * Sets [Builder.tags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tags] with a well-typed `List<String>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tags(tags: JsonField<List<String>>) = apply {
                        this.tags = tags.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tags].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTag(tag: String) = apply {
                        tags =
                            (tags ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tags", it).add(tag)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Properties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Properties =
                        Properties(
                            (tags ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Properties = apply {
                    if (validated) {
                        return@apply
                    }

                    tags()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Properties{tags=$tags, additionalProperties=$additionalProperties}"
            }

            /** Specifies a portion of the artifact. */
            class Region
            private constructor(
                private val byteLength: JsonField<Long>,
                private val byteOffset: JsonField<Long>,
                private val charLength: JsonField<Long>,
                private val charOffset: JsonField<Long>,
                private val endColumn: JsonField<Long>,
                private val endLine: JsonField<Long>,
                private val message: JsonField<Message>,
                private val properties: JsonField<Properties>,
                private val snippet: JsonField<Snippet>,
                private val sourceLanguage: JsonField<String>,
                private val startColumn: JsonField<Long>,
                private val startLine: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("byteLength")
                    @ExcludeMissing
                    byteLength: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("byteOffset")
                    @ExcludeMissing
                    byteOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("charLength")
                    @ExcludeMissing
                    charLength: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("charOffset")
                    @ExcludeMissing
                    charOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("endColumn")
                    @ExcludeMissing
                    endColumn: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("endLine")
                    @ExcludeMissing
                    endLine: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<Message> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("snippet")
                    @ExcludeMissing
                    snippet: JsonField<Snippet> = JsonMissing.of(),
                    @JsonProperty("sourceLanguage")
                    @ExcludeMissing
                    sourceLanguage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("startColumn")
                    @ExcludeMissing
                    startColumn: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("startLine")
                    @ExcludeMissing
                    startLine: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    byteLength,
                    byteOffset,
                    charLength,
                    charOffset,
                    endColumn,
                    endLine,
                    message,
                    properties,
                    snippet,
                    sourceLanguage,
                    startColumn,
                    startLine,
                    mutableMapOf(),
                )

                /**
                 * The length of the region in bytes.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun byteLength(): Optional<Long> = byteLength.getOptional("byteLength")

                /**
                 * The zero-based offset from the beginning of the artifact of the first byte in the
                 * region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun byteOffset(): Optional<Long> = byteOffset.getOptional("byteOffset")

                /**
                 * The length of the region in characters.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun charLength(): Optional<Long> = charLength.getOptional("charLength")

                /**
                 * The zero-based offset from the beginning of the artifact of the first character
                 * in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun charOffset(): Optional<Long> = charOffset.getOptional("charOffset")

                /**
                 * The column number of the character following the end of the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endColumn(): Optional<Long> = endColumn.getOptional("endColumn")

                /**
                 * The line number of the last character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endLine(): Optional<Long> = endLine.getOptional("endLine")

                /**
                 * A message relevant to the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun message(): Optional<Message> = message.getOptional("message")

                /**
                 * Key/value pairs that provide additional information about the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * The portion of the artifact contents within the specified region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun snippet(): Optional<Snippet> = snippet.getOptional("snippet")

                /**
                 * Specifies the source language, if any, of the portion of the artifact specified
                 * by the region object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun sourceLanguage(): Optional<String> =
                    sourceLanguage.getOptional("sourceLanguage")

                /**
                 * The column number of the first character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun startColumn(): Optional<Long> = startColumn.getOptional("startColumn")

                /**
                 * The line number of the first character in the region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun startLine(): Optional<Long> = startLine.getOptional("startLine")

                /**
                 * Returns the raw JSON value of [byteLength].
                 *
                 * Unlike [byteLength], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("byteLength")
                @ExcludeMissing
                fun _byteLength(): JsonField<Long> = byteLength

                /**
                 * Returns the raw JSON value of [byteOffset].
                 *
                 * Unlike [byteOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("byteOffset")
                @ExcludeMissing
                fun _byteOffset(): JsonField<Long> = byteOffset

                /**
                 * Returns the raw JSON value of [charLength].
                 *
                 * Unlike [charLength], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("charLength")
                @ExcludeMissing
                fun _charLength(): JsonField<Long> = charLength

                /**
                 * Returns the raw JSON value of [charOffset].
                 *
                 * Unlike [charOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("charOffset")
                @ExcludeMissing
                fun _charOffset(): JsonField<Long> = charOffset

                /**
                 * Returns the raw JSON value of [endColumn].
                 *
                 * Unlike [endColumn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endColumn")
                @ExcludeMissing
                fun _endColumn(): JsonField<Long> = endColumn

                /**
                 * Returns the raw JSON value of [endLine].
                 *
                 * Unlike [endLine], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endLine") @ExcludeMissing fun _endLine(): JsonField<Long> = endLine

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message")
                @ExcludeMissing
                fun _message(): JsonField<Message> = message

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [snippet].
                 *
                 * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("snippet")
                @ExcludeMissing
                fun _snippet(): JsonField<Snippet> = snippet

                /**
                 * Returns the raw JSON value of [sourceLanguage].
                 *
                 * Unlike [sourceLanguage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sourceLanguage")
                @ExcludeMissing
                fun _sourceLanguage(): JsonField<String> = sourceLanguage

                /**
                 * Returns the raw JSON value of [startColumn].
                 *
                 * Unlike [startColumn], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("startColumn")
                @ExcludeMissing
                fun _startColumn(): JsonField<Long> = startColumn

                /**
                 * Returns the raw JSON value of [startLine].
                 *
                 * Unlike [startLine], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("startLine")
                @ExcludeMissing
                fun _startLine(): JsonField<Long> = startLine

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Region]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Region]. */
                class Builder internal constructor() {

                    private var byteLength: JsonField<Long> = JsonMissing.of()
                    private var byteOffset: JsonField<Long> = JsonMissing.of()
                    private var charLength: JsonField<Long> = JsonMissing.of()
                    private var charOffset: JsonField<Long> = JsonMissing.of()
                    private var endColumn: JsonField<Long> = JsonMissing.of()
                    private var endLine: JsonField<Long> = JsonMissing.of()
                    private var message: JsonField<Message> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var snippet: JsonField<Snippet> = JsonMissing.of()
                    private var sourceLanguage: JsonField<String> = JsonMissing.of()
                    private var startColumn: JsonField<Long> = JsonMissing.of()
                    private var startLine: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(region: Region) = apply {
                        byteLength = region.byteLength
                        byteOffset = region.byteOffset
                        charLength = region.charLength
                        charOffset = region.charOffset
                        endColumn = region.endColumn
                        endLine = region.endLine
                        message = region.message
                        properties = region.properties
                        snippet = region.snippet
                        sourceLanguage = region.sourceLanguage
                        startColumn = region.startColumn
                        startLine = region.startLine
                        additionalProperties = region.additionalProperties.toMutableMap()
                    }

                    /** The length of the region in bytes. */
                    fun byteLength(byteLength: Long) = byteLength(JsonField.of(byteLength))

                    /**
                     * Sets [Builder.byteLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.byteLength] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun byteLength(byteLength: JsonField<Long>) = apply {
                        this.byteLength = byteLength
                    }

                    /**
                     * The zero-based offset from the beginning of the artifact of the first byte in
                     * the region.
                     */
                    fun byteOffset(byteOffset: Long) = byteOffset(JsonField.of(byteOffset))

                    /**
                     * Sets [Builder.byteOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.byteOffset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun byteOffset(byteOffset: JsonField<Long>) = apply {
                        this.byteOffset = byteOffset
                    }

                    /** The length of the region in characters. */
                    fun charLength(charLength: Long) = charLength(JsonField.of(charLength))

                    /**
                     * Sets [Builder.charLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.charLength] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun charLength(charLength: JsonField<Long>) = apply {
                        this.charLength = charLength
                    }

                    /**
                     * The zero-based offset from the beginning of the artifact of the first
                     * character in the region.
                     */
                    fun charOffset(charOffset: Long) = charOffset(JsonField.of(charOffset))

                    /**
                     * Sets [Builder.charOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.charOffset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun charOffset(charOffset: JsonField<Long>) = apply {
                        this.charOffset = charOffset
                    }

                    /** The column number of the character following the end of the region. */
                    fun endColumn(endColumn: Long) = endColumn(JsonField.of(endColumn))

                    /**
                     * Sets [Builder.endColumn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endColumn] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endColumn(endColumn: JsonField<Long>) = apply { this.endColumn = endColumn }

                    /** The line number of the last character in the region. */
                    fun endLine(endLine: Long) = endLine(JsonField.of(endLine))

                    /**
                     * Sets [Builder.endLine] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endLine] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endLine(endLine: JsonField<Long>) = apply { this.endLine = endLine }

                    /** A message relevant to the region. */
                    fun message(message: Message) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [Message] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<Message>) = apply { this.message = message }

                    /** Key/value pairs that provide additional information about the region. */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /** The portion of the artifact contents within the specified region. */
                    fun snippet(snippet: Snippet) = snippet(JsonField.of(snippet))

                    /**
                     * Sets [Builder.snippet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.snippet] with a well-typed [Snippet] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun snippet(snippet: JsonField<Snippet>) = apply { this.snippet = snippet }

                    /**
                     * Specifies the source language, if any, of the portion of the artifact
                     * specified by the region object.
                     */
                    fun sourceLanguage(sourceLanguage: String) =
                        sourceLanguage(JsonField.of(sourceLanguage))

                    /**
                     * Sets [Builder.sourceLanguage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sourceLanguage] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sourceLanguage(sourceLanguage: JsonField<String>) = apply {
                        this.sourceLanguage = sourceLanguage
                    }

                    /** The column number of the first character in the region. */
                    fun startColumn(startColumn: Long) = startColumn(JsonField.of(startColumn))

                    /**
                     * Sets [Builder.startColumn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startColumn] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun startColumn(startColumn: JsonField<Long>) = apply {
                        this.startColumn = startColumn
                    }

                    /** The line number of the first character in the region. */
                    fun startLine(startLine: Long) = startLine(JsonField.of(startLine))

                    /**
                     * Sets [Builder.startLine] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startLine] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun startLine(startLine: JsonField<Long>) = apply { this.startLine = startLine }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Region].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Region =
                        Region(
                            byteLength,
                            byteOffset,
                            charLength,
                            charOffset,
                            endColumn,
                            endLine,
                            message,
                            properties,
                            snippet,
                            sourceLanguage,
                            startColumn,
                            startLine,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Region = apply {
                    if (validated) {
                        return@apply
                    }

                    byteLength()
                    byteOffset()
                    charLength()
                    charOffset()
                    endColumn()
                    endLine()
                    message().ifPresent { it.validate() }
                    properties().ifPresent { it.validate() }
                    snippet().ifPresent { it.validate() }
                    sourceLanguage()
                    startColumn()
                    startLine()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (byteLength.asKnown().isPresent) 1 else 0) +
                        (if (byteOffset.asKnown().isPresent) 1 else 0) +
                        (if (charLength.asKnown().isPresent) 1 else 0) +
                        (if (charOffset.asKnown().isPresent) 1 else 0) +
                        (if (endColumn.asKnown().isPresent) 1 else 0) +
                        (if (endLine.asKnown().isPresent) 1 else 0) +
                        (message.asKnown().getOrNull()?.validity() ?: 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (snippet.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (sourceLanguage.asKnown().isPresent) 1 else 0) +
                        (if (startColumn.asKnown().isPresent) 1 else 0) +
                        (if (startLine.asKnown().isPresent) 1 else 0)

                /** A message relevant to the region. */
                class Message
                private constructor(
                    private val id: JsonField<String>,
                    private val arguments: JsonField<List<String>>,
                    private val markdown: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val text: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        arguments: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        markdown: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                    ) : this(id, arguments, markdown, properties, text, mutableMapOf())

                    /**
                     * The identifier for this message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * An array of strings to substitute into the message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                    /**
                     * A Markdown message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun markdown(): Optional<String> = markdown.getOptional("markdown")

                    /**
                     * Key/value pairs that provide additional information about the message.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * A plain text message string.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [arguments].
                     *
                     * Unlike [arguments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun _arguments(): JsonField<List<String>> = arguments

                    /**
                     * Returns the raw JSON value of [markdown].
                     *
                     * Unlike [markdown], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    fun _markdown(): JsonField<String> = markdown

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Message]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Message]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var arguments: JsonField<MutableList<String>>? = null
                        private var markdown: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(message: Message) = apply {
                            id = message.id
                            arguments = message.arguments.map { it.toMutableList() }
                            markdown = message.markdown
                            properties = message.properties
                            text = message.text
                            additionalProperties = message.additionalProperties.toMutableMap()
                        }

                        /** The identifier for this message. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** An array of strings to substitute into the message string. */
                        fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                        /**
                         * Sets [Builder.arguments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arguments] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun arguments(arguments: JsonField<List<String>>) = apply {
                            this.arguments = arguments.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [arguments].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addArgument(argument: String) = apply {
                            arguments =
                                (arguments ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("arguments", it).add(argument)
                                }
                        }

                        /** A Markdown message string. */
                        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                        /**
                         * Sets [Builder.markdown] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.markdown] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun markdown(markdown: JsonField<String>) = apply {
                            this.markdown = markdown
                        }

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        /** A plain text message string. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Message].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Message =
                            Message(
                                id,
                                (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                                markdown,
                                properties,
                                text,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Message = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        arguments()
                        markdown()
                        properties().ifPresent { it.validate() }
                        text()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (arguments.asKnown().getOrNull()?.size ?: 0) +
                            (if (markdown.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0)

                    /** Key/value pairs that provide additional information about the message. */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Message && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Message{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
                }

                /** Key/value pairs that provide additional information about the region. */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                /** The portion of the artifact contents within the specified region. */
                class Snippet
                private constructor(
                    private val binary: JsonField<String>,
                    private val properties: JsonField<Properties>,
                    private val rendered: JsonField<Rendered>,
                    private val text: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("binary")
                        @ExcludeMissing
                        binary: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<Properties> = JsonMissing.of(),
                        @JsonProperty("rendered")
                        @ExcludeMissing
                        rendered: JsonField<Rendered> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                    ) : this(binary, properties, rendered, text, mutableMapOf())

                    /**
                     * MIME Base64-encoded content from a binary artifact, or from a text artifact
                     * in its original encoding.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun binary(): Optional<String> = binary.getOptional("binary")

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * content.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<Properties> = properties.getOptional("properties")

                    /**
                     * An alternate rendered representation of the artifact (e.g., a decompiled
                     * representation of a binary region).
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun rendered(): Optional<Rendered> = rendered.getOptional("rendered")

                    /**
                     * UTF-8-encoded content from a text artifact.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * Returns the raw JSON value of [binary].
                     *
                     * Unlike [binary], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("binary")
                    @ExcludeMissing
                    fun _binary(): JsonField<String> = binary

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<Properties> = properties

                    /**
                     * Returns the raw JSON value of [rendered].
                     *
                     * Unlike [rendered], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("rendered")
                    @ExcludeMissing
                    fun _rendered(): JsonField<Rendered> = rendered

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Snippet]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Snippet]. */
                    class Builder internal constructor() {

                        private var binary: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<Properties> = JsonMissing.of()
                        private var rendered: JsonField<Rendered> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(snippet: Snippet) = apply {
                            binary = snippet.binary
                            properties = snippet.properties
                            rendered = snippet.rendered
                            text = snippet.text
                            additionalProperties = snippet.additionalProperties.toMutableMap()
                        }

                        /**
                         * MIME Base64-encoded content from a binary artifact, or from a text
                         * artifact in its original encoding.
                         */
                        fun binary(binary: String) = binary(JsonField.of(binary))

                        /**
                         * Sets [Builder.binary] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.binary] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun binary(binary: JsonField<String>) = apply { this.binary = binary }

                        /**
                         * Key/value pairs that provide additional information about the artifact
                         * content.
                         */
                        fun properties(properties: Properties) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [Properties] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<Properties>) = apply {
                            this.properties = properties
                        }

                        /**
                         * An alternate rendered representation of the artifact (e.g., a decompiled
                         * representation of a binary region).
                         */
                        fun rendered(rendered: Rendered) = rendered(JsonField.of(rendered))

                        /**
                         * Sets [Builder.rendered] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.rendered] with a well-typed [Rendered]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun rendered(rendered: JsonField<Rendered>) = apply {
                            this.rendered = rendered
                        }

                        /** UTF-8-encoded content from a text artifact. */
                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Snippet].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Snippet =
                            Snippet(
                                binary,
                                properties,
                                rendered,
                                text,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Snippet = apply {
                        if (validated) {
                            return@apply
                        }

                        binary()
                        properties().ifPresent { it.validate() }
                        rendered().ifPresent { it.validate() }
                        text()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (binary.asKnown().isPresent) 1 else 0) +
                            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                            (rendered.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0)

                    /**
                     * Key/value pairs that provide additional information about the artifact
                     * content.
                     */
                    class Properties
                    private constructor(
                        private val tags: JsonField<List<String>>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("tags")
                            @ExcludeMissing
                            tags: JsonField<List<String>> = JsonMissing.of()
                        ) : this(tags, mutableMapOf())

                        /**
                         * A set of distinct strings that provide additional information.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun tags(): Optional<List<String>> = tags.getOptional("tags")

                        /**
                         * Returns the raw JSON value of [tags].
                         *
                         * Unlike [tags], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tags")
                        @ExcludeMissing
                        fun _tags(): JsonField<List<String>> = tags

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Properties].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Properties]. */
                        class Builder internal constructor() {

                            private var tags: JsonField<MutableList<String>>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(properties: Properties) = apply {
                                tags = properties.tags.map { it.toMutableList() }
                                additionalProperties =
                                    properties.additionalProperties.toMutableMap()
                            }

                            /** A set of distinct strings that provide additional information. */
                            fun tags(tags: List<String>) = tags(JsonField.of(tags))

                            /**
                             * Sets [Builder.tags] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tags] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun tags(tags: JsonField<List<String>>) = apply {
                                this.tags = tags.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [tags].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addTag(tag: String) = apply {
                                tags =
                                    (tags ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("tags", it).add(tag)
                                    }
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Properties].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Properties =
                                Properties(
                                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Properties = apply {
                            if (validated) {
                                return@apply
                            }

                            tags()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * An alternate rendered representation of the artifact (e.g., a decompiled
                     * representation of a binary region).
                     */
                    class Rendered
                    private constructor(
                        private val text: JsonField<String>,
                        private val markdown: JsonField<String>,
                        private val properties: JsonField<Properties>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("markdown")
                            @ExcludeMissing
                            markdown: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("properties")
                            @ExcludeMissing
                            properties: JsonField<Properties> = JsonMissing.of(),
                        ) : this(text, markdown, properties, mutableMapOf())

                        /**
                         * A plain text message string or format string.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * A Markdown message string or format string.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun markdown(): Optional<String> = markdown.getOptional("markdown")

                        /**
                         * Key/value pairs that provide additional information about the message.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun properties(): Optional<Properties> =
                            properties.getOptional("properties")

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        /**
                         * Returns the raw JSON value of [markdown].
                         *
                         * Unlike [markdown], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("markdown")
                        @ExcludeMissing
                        fun _markdown(): JsonField<String> = markdown

                        /**
                         * Returns the raw JSON value of [properties].
                         *
                         * Unlike [properties], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("properties")
                        @ExcludeMissing
                        fun _properties(): JsonField<Properties> = properties

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Rendered].
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Rendered]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var markdown: JsonField<String> = JsonMissing.of()
                            private var properties: JsonField<Properties> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(rendered: Rendered) = apply {
                                text = rendered.text
                                markdown = rendered.markdown
                                properties = rendered.properties
                                additionalProperties = rendered.additionalProperties.toMutableMap()
                            }

                            /** A plain text message string or format string. */
                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /** A Markdown message string or format string. */
                            fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                            /**
                             * Sets [Builder.markdown] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.markdown] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun markdown(markdown: JsonField<String>) = apply {
                                this.markdown = markdown
                            }

                            /**
                             * Key/value pairs that provide additional information about the
                             * message.
                             */
                            fun properties(properties: Properties) =
                                properties(JsonField.of(properties))

                            /**
                             * Sets [Builder.properties] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.properties] with a well-typed
                             * [Properties] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun properties(properties: JsonField<Properties>) = apply {
                                this.properties = properties
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Rendered].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Rendered =
                                Rendered(
                                    checkRequired("text", text),
                                    markdown,
                                    properties,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Rendered = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            markdown()
                            properties().ifPresent { it.validate() }
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HiddenLayerInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (text.asKnown().isPresent) 1 else 0) +
                                (if (markdown.asKnown().isPresent) 1 else 0) +
                                (properties.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * Key/value pairs that provide additional information about the message.
                         */
                        class Properties
                        private constructor(
                            private val tags: JsonField<List<String>>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("tags")
                                @ExcludeMissing
                                tags: JsonField<List<String>> = JsonMissing.of()
                            ) : this(tags, mutableMapOf())

                            /**
                             * A set of distinct strings that provide additional information.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun tags(): Optional<List<String>> = tags.getOptional("tags")

                            /**
                             * Returns the raw JSON value of [tags].
                             *
                             * Unlike [tags], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("tags")
                            @ExcludeMissing
                            fun _tags(): JsonField<List<String>> = tags

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [Properties].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Properties]. */
                            class Builder internal constructor() {

                                private var tags: JsonField<MutableList<String>>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(properties: Properties) = apply {
                                    tags = properties.tags.map { it.toMutableList() }
                                    additionalProperties =
                                        properties.additionalProperties.toMutableMap()
                                }

                                /**
                                 * A set of distinct strings that provide additional information.
                                 */
                                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                                /**
                                 * Sets [Builder.tags] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.tags] with a well-typed
                                 * `List<String>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun tags(tags: JsonField<List<String>>) = apply {
                                    this.tags = tags.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [String] to [tags].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addTag(tag: String) = apply {
                                    tags =
                                        (tags ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("tags", it).add(tag)
                                        }
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Properties].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Properties =
                                    Properties(
                                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Properties = apply {
                                if (validated) {
                                    return@apply
                                }

                                tags()
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: HiddenLayerInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Rendered && text == other.text && markdown == other.markdown && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, markdown, properties, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Rendered{text=$text, markdown=$markdown, properties=$properties, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Snippet && binary == other.binary && properties == other.properties && rendered == other.rendered && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(binary, properties, rendered, text, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Snippet{binary=$binary, properties=$properties, rendered=$rendered, text=$text, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Region && byteLength == other.byteLength && byteOffset == other.byteOffset && charLength == other.charLength && charOffset == other.charOffset && endColumn == other.endColumn && endLine == other.endLine && message == other.message && properties == other.properties && snippet == other.snippet && sourceLanguage == other.sourceLanguage && startColumn == other.startColumn && startLine == other.startLine && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(byteLength, byteOffset, charLength, charOffset, endColumn, endLine, message, properties, snippet, sourceLanguage, startColumn, startLine, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Region{byteLength=$byteLength, byteOffset=$byteOffset, charLength=$charLength, charOffset=$charOffset, endColumn=$endColumn, endLine=$endLine, message=$message, properties=$properties, snippet=$snippet, sourceLanguage=$sourceLanguage, startColumn=$startColumn, startLine=$startLine, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PhysicalLocation && address == other.address && artifactLocation == other.artifactLocation && contextRegion == other.contextRegion && properties == other.properties && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, artifactLocation, contextRegion, properties, region, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhysicalLocation{address=$address, artifactLocation=$artifactLocation, contextRegion=$contextRegion, properties=$properties, region=$region, additionalProperties=$additionalProperties}"
        }

        /** Key/value pairs that provide additional information about the location. */
        class Properties
        private constructor(
            private val tags: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of()
            ) : this(tags, mutableMapOf())

            /**
             * A set of distinct strings that provide additional information.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var tags: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    tags = properties.tags.map { it.toMutableList() }
                    additionalProperties = properties.additionalProperties.toMutableMap()
                }

                /** A set of distinct strings that provide additional information. */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties =
                    Properties(
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
                if (validated) {
                    return@apply
                }

                tags()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Properties{tags=$tags, additionalProperties=$additionalProperties}"
        }

        /** Information about the relation of one location to another. */
        class Relationship
        private constructor(
            private val target: JsonField<Long>,
            private val description: JsonField<Description>,
            private val kinds: JsonField<List<String>>,
            private val properties: JsonField<Properties>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("target") @ExcludeMissing target: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<Description> = JsonMissing.of(),
                @JsonProperty("kinds")
                @ExcludeMissing
                kinds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<Properties> = JsonMissing.of(),
            ) : this(target, description, kinds, properties, mutableMapOf())

            /**
             * A reference to the related location.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun target(): Long = target.getRequired("target")

            /**
             * A description of the location relationship.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<Description> = description.getOptional("description")

            /**
             * A set of distinct strings that categorize the relationship. Well-known kinds include
             * 'includes', 'isIncludedBy' and 'relevant'.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun kinds(): Optional<List<String>> = kinds.getOptional("kinds")

            /**
             * Key/value pairs that provide additional information about the location relationship.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * Returns the raw JSON value of [target].
             *
             * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Long> = target

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<Description> = description

            /**
             * Returns the raw JSON value of [kinds].
             *
             * Unlike [kinds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kinds") @ExcludeMissing fun _kinds(): JsonField<List<String>> = kinds

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Relationship].
                 *
                 * The following fields are required:
                 * ```java
                 * .target()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Relationship]. */
            class Builder internal constructor() {

                private var target: JsonField<Long>? = null
                private var description: JsonField<Description> = JsonMissing.of()
                private var kinds: JsonField<MutableList<String>>? = null
                private var properties: JsonField<Properties> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(relationship: Relationship) = apply {
                    target = relationship.target
                    description = relationship.description
                    kinds = relationship.kinds.map { it.toMutableList() }
                    properties = relationship.properties
                    additionalProperties = relationship.additionalProperties.toMutableMap()
                }

                /** A reference to the related location. */
                fun target(target: Long) = target(JsonField.of(target))

                /**
                 * Sets [Builder.target] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.target] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun target(target: JsonField<Long>) = apply { this.target = target }

                /** A description of the location relationship. */
                fun description(description: Description) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [Description]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun description(description: JsonField<Description>) = apply {
                    this.description = description
                }

                /**
                 * A set of distinct strings that categorize the relationship. Well-known kinds
                 * include 'includes', 'isIncludedBy' and 'relevant'.
                 */
                fun kinds(kinds: List<String>) = kinds(JsonField.of(kinds))

                /**
                 * Sets [Builder.kinds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kinds] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun kinds(kinds: JsonField<List<String>>) = apply {
                    this.kinds = kinds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [kinds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addKind(kind: String) = apply {
                    kinds =
                        (kinds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("kinds", it).add(kind)
                        }
                }

                /**
                 * Key/value pairs that provide additional information about the location
                 * relationship.
                 */
                fun properties(properties: Properties) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [Properties] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<Properties>) = apply {
                    this.properties = properties
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Relationship].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .target()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Relationship =
                    Relationship(
                        checkRequired("target", target),
                        description,
                        (kinds ?: JsonMissing.of()).map { it.toImmutable() },
                        properties,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Relationship = apply {
                if (validated) {
                    return@apply
                }

                target()
                description().ifPresent { it.validate() }
                kinds()
                properties().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HiddenLayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (target.asKnown().isPresent) 1 else 0) +
                    (description.asKnown().getOrNull()?.validity() ?: 0) +
                    (kinds.asKnown().getOrNull()?.size ?: 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0)

            /** A description of the location relationship. */
            class Description
            private constructor(
                private val id: JsonField<String>,
                private val arguments: JsonField<List<String>>,
                private val markdown: JsonField<String>,
                private val properties: JsonField<Properties>,
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    markdown: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<Properties> = JsonMissing.of(),
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                ) : this(id, arguments, markdown, properties, text, mutableMapOf())

                /**
                 * The identifier for this message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * An array of strings to substitute into the message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                /**
                 * A Markdown message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun markdown(): Optional<String> = markdown.getOptional("markdown")

                /**
                 * Key/value pairs that provide additional information about the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<Properties> = properties.getOptional("properties")

                /**
                 * A plain text message string.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<List<String>> = arguments

                /**
                 * Returns the raw JSON value of [markdown].
                 *
                 * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("markdown")
                @ExcludeMissing
                fun _markdown(): JsonField<String> = markdown

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<Properties> = properties

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Description]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Description]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var arguments: JsonField<MutableList<String>>? = null
                    private var markdown: JsonField<String> = JsonMissing.of()
                    private var properties: JsonField<Properties> = JsonMissing.of()
                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(description: Description) = apply {
                        id = description.id
                        arguments = description.arguments.map { it.toMutableList() }
                        markdown = description.markdown
                        properties = description.properties
                        text = description.text
                        additionalProperties = description.additionalProperties.toMutableMap()
                    }

                    /** The identifier for this message. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** An array of strings to substitute into the message string. */
                    fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun arguments(arguments: JsonField<List<String>>) = apply {
                        this.arguments = arguments.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [arguments].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addArgument(argument: String) = apply {
                        arguments =
                            (arguments ?: JsonField.of(mutableListOf())).also {
                                checkKnown("arguments", it).add(argument)
                            }
                    }

                    /** A Markdown message string. */
                    fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                    /**
                     * Sets [Builder.markdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.markdown] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

                    /** Key/value pairs that provide additional information about the message. */
                    fun properties(properties: Properties) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [Properties]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<Properties>) = apply {
                        this.properties = properties
                    }

                    /** A plain text message string. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Description].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Description =
                        Description(
                            id,
                            (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                            markdown,
                            properties,
                            text,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Description = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    arguments()
                    markdown()
                    properties().ifPresent { it.validate() }
                    text()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (arguments.asKnown().getOrNull()?.size ?: 0) +
                        (if (markdown.asKnown().isPresent) 1 else 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (text.asKnown().isPresent) 1 else 0)

                /** Key/value pairs that provide additional information about the message. */
                class Properties
                private constructor(
                    private val tags: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tags")
                        @ExcludeMissing
                        tags: JsonField<List<String>> = JsonMissing.of()
                    ) : this(tags, mutableMapOf())

                    /**
                     * A set of distinct strings that provide additional information.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tags(): Optional<List<String>> = tags.getOptional("tags")

                    /**
                     * Returns the raw JSON value of [tags].
                     *
                     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tags")
                    @ExcludeMissing
                    fun _tags(): JsonField<List<String>> = tags

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Properties].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Properties]. */
                    class Builder internal constructor() {

                        private var tags: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(properties: Properties) = apply {
                            tags = properties.tags.map { it.toMutableList() }
                            additionalProperties = properties.additionalProperties.toMutableMap()
                        }

                        /** A set of distinct strings that provide additional information. */
                        fun tags(tags: List<String>) = tags(JsonField.of(tags))

                        /**
                         * Sets [Builder.tags] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tags] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tags(tags: JsonField<List<String>>) = apply {
                            this.tags = tags.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [tags].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTag(tag: String) = apply {
                            tags =
                                (tags ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tags", it).add(tag)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Properties].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Properties =
                            Properties(
                                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Properties = apply {
                        if (validated) {
                            return@apply
                        }

                        tags()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HiddenLayerInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Properties{tags=$tags, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Description && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Description{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
            }

            /**
             * Key/value pairs that provide additional information about the location relationship.
             */
            class Properties
            private constructor(
                private val tags: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tags")
                    @ExcludeMissing
                    tags: JsonField<List<String>> = JsonMissing.of()
                ) : this(tags, mutableMapOf())

                /**
                 * A set of distinct strings that provide additional information.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tags(): Optional<List<String>> = tags.getOptional("tags")

                /**
                 * Returns the raw JSON value of [tags].
                 *
                 * Unlike [tags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Properties]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Properties]. */
                class Builder internal constructor() {

                    private var tags: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(properties: Properties) = apply {
                        tags = properties.tags.map { it.toMutableList() }
                        additionalProperties = properties.additionalProperties.toMutableMap()
                    }

                    /** A set of distinct strings that provide additional information. */
                    fun tags(tags: List<String>) = tags(JsonField.of(tags))

                    /**
                     * Sets [Builder.tags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tags] with a well-typed `List<String>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tags(tags: JsonField<List<String>>) = apply {
                        this.tags = tags.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tags].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTag(tag: String) = apply {
                        tags =
                            (tags ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tags", it).add(tag)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Properties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Properties =
                        Properties(
                            (tags ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Properties = apply {
                    if (validated) {
                        return@apply
                    }

                    tags()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HiddenLayerInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Properties{tags=$tags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Relationship && target == other.target && description == other.description && kinds == other.kinds && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(target, description, kinds, properties, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Relationship{target=$target, description=$description, kinds=$kinds, properties=$properties, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Location && id == other.id && annotations == other.annotations && logicalLocations == other.logicalLocations && message == other.message && physicalLocation == other.physicalLocation && properties == other.properties && relationships == other.relationships && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, annotations, logicalLocations, message, physicalLocation, properties, relationships, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Location{id=$id, annotations=$annotations, logicalLocations=$logicalLocations, message=$message, physicalLocation=$physicalLocation, properties=$properties, relationships=$relationships, additionalProperties=$additionalProperties}"
    }

    /** Key/value pairs that provide additional information about the node. */
    class Properties
    private constructor(
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of()
        ) : this(tags, mutableMapOf())

        /**
         * A set of distinct strings that provide additional information.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                tags = properties.tags.map { it.toMutableList() }
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            /** A set of distinct strings that provide additional information. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties =
                Properties(
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

            tags()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HiddenLayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Properties && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Node && id == other.id && children == other.children && label == other.label && location == other.location && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, children, label, location, properties, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Node{id=$id, children=$children, label=$label, location=$location, properties=$properties, additionalProperties=$additionalProperties}"
}
