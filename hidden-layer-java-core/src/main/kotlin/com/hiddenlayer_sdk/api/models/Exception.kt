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

/** Describes a runtime exception encountered during the execution of an analysis tool. */
class Exception
private constructor(
    private val innerExceptions: JsonField<List<Exception>>,
    private val kind: JsonField<String>,
    private val message: JsonField<String>,
    private val properties: JsonField<PropertyBag>,
    private val stack: JsonField<Stack>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("innerExceptions")
        @ExcludeMissing
        innerExceptions: JsonField<List<Exception>> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<PropertyBag> = JsonMissing.of(),
        @JsonProperty("stack") @ExcludeMissing stack: JsonField<Stack> = JsonMissing.of(),
    ) : this(innerExceptions, kind, message, properties, stack, mutableMapOf())

    /**
     * An array of exception objects each of which is considered a cause of this exception.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun innerExceptions(): Optional<List<Exception>> =
        innerExceptions.getOptional("innerExceptions")

    /**
     * A string that identifies the kind of exception, for example, the fully qualified type name of
     * an object that was thrown, or the symbolic name of a signal.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kind(): Optional<String> = kind.getOptional("kind")

    /**
     * A message that describes the exception.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Key/value pairs that provide additional information about the exception.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

    /**
     * The sequence of function calls leading to the exception.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stack(): Optional<Stack> = stack.getOptional("stack")

    /**
     * Returns the raw JSON value of [innerExceptions].
     *
     * Unlike [innerExceptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("innerExceptions")
    @ExcludeMissing
    fun _innerExceptions(): JsonField<List<Exception>> = innerExceptions

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<PropertyBag> = properties

    /**
     * Returns the raw JSON value of [stack].
     *
     * Unlike [stack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stack") @ExcludeMissing fun _stack(): JsonField<Stack> = stack

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

        /** Returns a mutable builder for constructing an instance of [Exception]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Exception]. */
    class Builder internal constructor() {

        private var innerExceptions: JsonField<MutableList<Exception>>? = null
        private var kind: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<PropertyBag> = JsonMissing.of()
        private var stack: JsonField<Stack> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exception: Exception) = apply {
            innerExceptions = exception.innerExceptions.map { it.toMutableList() }
            kind = exception.kind
            message = exception.message
            properties = exception.properties
            stack = exception.stack
            additionalProperties = exception.additionalProperties.toMutableMap()
        }

        /** An array of exception objects each of which is considered a cause of this exception. */
        fun innerExceptions(innerExceptions: List<Exception>) =
            innerExceptions(JsonField.of(innerExceptions))

        /**
         * Sets [Builder.innerExceptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.innerExceptions] with a well-typed `List<Exception>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun innerExceptions(innerExceptions: JsonField<List<Exception>>) = apply {
            this.innerExceptions = innerExceptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Exception] to [innerExceptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInnerException(innerException: Exception) = apply {
            innerExceptions =
                (innerExceptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("innerExceptions", it).add(innerException)
                }
        }

        /**
         * A string that identifies the kind of exception, for example, the fully qualified type
         * name of an object that was thrown, or the symbolic name of a signal.
         */
        fun kind(kind: String) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<String>) = apply { this.kind = kind }

        /** A message that describes the exception. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Key/value pairs that provide additional information about the exception. */
        fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [PropertyBag] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<PropertyBag>) = apply { this.properties = properties }

        /** The sequence of function calls leading to the exception. */
        fun stack(stack: Stack) = stack(JsonField.of(stack))

        /**
         * Sets [Builder.stack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stack] with a well-typed [Stack] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stack(stack: JsonField<Stack>) = apply { this.stack = stack }

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
         * Returns an immutable instance of [Exception].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Exception =
            Exception(
                (innerExceptions ?: JsonMissing.of()).map { it.toImmutable() },
                kind,
                message,
                properties,
                stack,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Exception = apply {
        if (validated) {
            return@apply
        }

        innerExceptions().ifPresent { it.forEach { it.validate() } }
        kind()
        message()
        properties().ifPresent { it.validate() }
        stack().ifPresent { it.validate() }
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
        (innerExceptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (kind.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (stack.asKnown().getOrNull()?.validity() ?: 0)

    /** The sequence of function calls leading to the exception. */
    class Stack
    private constructor(
        private val frames: JsonField<List<Frame>>,
        private val message: JsonField<Message>,
        private val properties: JsonField<PropertyBag>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("frames")
            @ExcludeMissing
            frames: JsonField<List<Frame>> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<PropertyBag> = JsonMissing.of(),
        ) : this(frames, message, properties, mutableMapOf())

        /**
         * An array of stack frames that represents a sequence of calls, rendered in reverse
         * chronological order, that comprise the call stack.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frames(): List<Frame> = frames.getRequired("frames")

        /**
         * A message relevant to this call stack.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun message(): Optional<Message> = message.getOptional("message")

        /**
         * Key/value pairs that provide additional information about the stack.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

        /**
         * Returns the raw JSON value of [frames].
         *
         * Unlike [frames], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frames") @ExcludeMissing fun _frames(): JsonField<List<Frame>> = frames

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<PropertyBag> = properties

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
             * Returns a mutable builder for constructing an instance of [Stack].
             *
             * The following fields are required:
             * ```java
             * .frames()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stack]. */
        class Builder internal constructor() {

            private var frames: JsonField<MutableList<Frame>>? = null
            private var message: JsonField<Message> = JsonMissing.of()
            private var properties: JsonField<PropertyBag> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stack: Stack) = apply {
                frames = stack.frames.map { it.toMutableList() }
                message = stack.message
                properties = stack.properties
                additionalProperties = stack.additionalProperties.toMutableMap()
            }

            /**
             * An array of stack frames that represents a sequence of calls, rendered in reverse
             * chronological order, that comprise the call stack.
             */
            fun frames(frames: List<Frame>) = frames(JsonField.of(frames))

            /**
             * Sets [Builder.frames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frames] with a well-typed `List<Frame>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frames(frames: JsonField<List<Frame>>) = apply {
                this.frames = frames.map { it.toMutableList() }
            }

            /**
             * Adds a single [Frame] to [frames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFrame(frame: Frame) = apply {
                frames =
                    (frames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("frames", it).add(frame)
                    }
            }

            /** A message relevant to this call stack. */
            fun message(message: Message) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Message] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Message>) = apply { this.message = message }

            /** Key/value pairs that provide additional information about the stack. */
            fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [PropertyBag] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<PropertyBag>) = apply {
                this.properties = properties
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
             * Returns an immutable instance of [Stack].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .frames()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Stack =
                Stack(
                    checkRequired("frames", frames).map { it.toImmutable() },
                    message,
                    properties,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Stack = apply {
            if (validated) {
                return@apply
            }

            frames().forEach { it.validate() }
            message().ifPresent { it.validate() }
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
            (frames.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (message.asKnown().getOrNull()?.validity() ?: 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0)

        /** A function call within a stack trace. */
        class Frame
        private constructor(
            private val location: JsonField<Location>,
            private val module: JsonField<String>,
            private val parameters: JsonField<List<String>>,
            private val properties: JsonField<PropertyBag>,
            private val threadId: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<Location> = JsonMissing.of(),
                @JsonProperty("module")
                @ExcludeMissing
                module: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<PropertyBag> = JsonMissing.of(),
                @JsonProperty("threadId")
                @ExcludeMissing
                threadId: JsonField<Long> = JsonMissing.of(),
            ) : this(location, module, parameters, properties, threadId, mutableMapOf())

            /**
             * The location to which this stack frame refers.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun location(): Optional<Location> = location.getOptional("location")

            /**
             * The name of the module that contains the code of this stack frame.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun module(): Optional<String> = module.getOptional("module")

            /**
             * The parameters of the call that is executing.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun parameters(): Optional<List<String>> = parameters.getOptional("parameters")

            /**
             * Key/value pairs that provide additional information about the stack frame.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

            /**
             * The thread identifier of the stack frame.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun threadId(): Optional<Long> = threadId.getOptional("threadId")

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<Location> = location

            /**
             * Returns the raw JSON value of [module].
             *
             * Unlike [module], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("module") @ExcludeMissing fun _module(): JsonField<String> = module

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<List<String>> = parameters

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<PropertyBag> = properties

            /**
             * Returns the raw JSON value of [threadId].
             *
             * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("threadId") @ExcludeMissing fun _threadId(): JsonField<Long> = threadId

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

                /** Returns a mutable builder for constructing an instance of [Frame]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Frame]. */
            class Builder internal constructor() {

                private var location: JsonField<Location> = JsonMissing.of()
                private var module: JsonField<String> = JsonMissing.of()
                private var parameters: JsonField<MutableList<String>>? = null
                private var properties: JsonField<PropertyBag> = JsonMissing.of()
                private var threadId: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(frame: Frame) = apply {
                    location = frame.location
                    module = frame.module
                    parameters = frame.parameters.map { it.toMutableList() }
                    properties = frame.properties
                    threadId = frame.threadId
                    additionalProperties = frame.additionalProperties.toMutableMap()
                }

                /** The location to which this stack frame refers. */
                fun location(location: Location) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [Location] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<Location>) = apply { this.location = location }

                /** The name of the module that contains the code of this stack frame. */
                fun module(module: String) = module(JsonField.of(module))

                /**
                 * Sets [Builder.module] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.module] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun module(module: JsonField<String>) = apply { this.module = module }

                /** The parameters of the call that is executing. */
                fun parameters(parameters: List<String>) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun parameters(parameters: JsonField<List<String>>) = apply {
                    this.parameters = parameters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [parameters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addParameter(parameter: String) = apply {
                    parameters =
                        (parameters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("parameters", it).add(parameter)
                        }
                }

                /** Key/value pairs that provide additional information about the stack frame. */
                fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [PropertyBag]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun properties(properties: JsonField<PropertyBag>) = apply {
                    this.properties = properties
                }

                /** The thread identifier of the stack frame. */
                fun threadId(threadId: Long) = threadId(JsonField.of(threadId))

                /**
                 * Sets [Builder.threadId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.threadId] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun threadId(threadId: JsonField<Long>) = apply { this.threadId = threadId }

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
                 * Returns an immutable instance of [Frame].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Frame =
                    Frame(
                        location,
                        module,
                        (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                        properties,
                        threadId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Frame = apply {
                if (validated) {
                    return@apply
                }

                location().ifPresent { it.validate() }
                module()
                parameters()
                properties().ifPresent { it.validate() }
                threadId()
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
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (module.asKnown().isPresent) 1 else 0) +
                    (parameters.asKnown().getOrNull()?.size ?: 0) +
                    (properties.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (threadId.asKnown().isPresent) 1 else 0)

            /** The location to which this stack frame refers. */
            class Location
            private constructor(
                private val id: JsonField<Long>,
                private val annotations: JsonField<List<Region>>,
                private val logicalLocations: JsonField<List<LogicalLocation>>,
                private val message: JsonField<Message>,
                private val physicalLocation: JsonField<PhysicalLocation>,
                private val properties: JsonField<PropertyBag>,
                private val relationships: JsonField<List<Relationship>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("annotations")
                    @ExcludeMissing
                    annotations: JsonField<List<Region>> = JsonMissing.of(),
                    @JsonProperty("logicalLocations")
                    @ExcludeMissing
                    logicalLocations: JsonField<List<LogicalLocation>> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<Message> = JsonMissing.of(),
                    @JsonProperty("physicalLocation")
                    @ExcludeMissing
                    physicalLocation: JsonField<PhysicalLocation> = JsonMissing.of(),
                    @JsonProperty("properties")
                    @ExcludeMissing
                    properties: JsonField<PropertyBag> = JsonMissing.of(),
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
                 * Value that distinguishes this location from all other locations within a single
                 * result object.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<Long> = id.getOptional("id")

                /**
                 * A set of regions relevant to the location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun annotations(): Optional<List<Region>> = annotations.getOptional("annotations")

                /**
                 * The logical locations associated with the result.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun logicalLocations(): Optional<List<LogicalLocation>> =
                    logicalLocations.getOptional("logicalLocations")

                /**
                 * A message relevant to the location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun message(): Optional<Message> = message.getOptional("message")

                /**
                 * Identifies the artifact and region.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun physicalLocation(): Optional<PhysicalLocation> =
                    physicalLocation.getOptional("physicalLocation")

                /**
                 * Key/value pairs that provide additional information about the location.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

                /**
                 * An array of objects that describe relationships between this location and others.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
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
                 * Unlike [annotations], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("annotations")
                @ExcludeMissing
                fun _annotations(): JsonField<List<Region>> = annotations

                /**
                 * Returns the raw JSON value of [logicalLocations].
                 *
                 * Unlike [logicalLocations], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("logicalLocations")
                @ExcludeMissing
                fun _logicalLocations(): JsonField<List<LogicalLocation>> = logicalLocations

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
                 * Returns the raw JSON value of [physicalLocation].
                 *
                 * Unlike [physicalLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("physicalLocation")
                @ExcludeMissing
                fun _physicalLocation(): JsonField<PhysicalLocation> = physicalLocation

                /**
                 * Returns the raw JSON value of [properties].
                 *
                 * Unlike [properties], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("properties")
                @ExcludeMissing
                fun _properties(): JsonField<PropertyBag> = properties

                /**
                 * Returns the raw JSON value of [relationships].
                 *
                 * Unlike [relationships], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                    private var annotations: JsonField<MutableList<Region>>? = null
                    private var logicalLocations: JsonField<MutableList<LogicalLocation>>? = null
                    private var message: JsonField<Message> = JsonMissing.of()
                    private var physicalLocation: JsonField<PhysicalLocation> = JsonMissing.of()
                    private var properties: JsonField<PropertyBag> = JsonMissing.of()
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
                     * Value that distinguishes this location from all other locations within a
                     * single result object.
                     */
                    fun id(id: Long) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun id(id: JsonField<Long>) = apply { this.id = id }

                    /** A set of regions relevant to the location. */
                    fun annotations(annotations: List<Region>) =
                        annotations(JsonField.of(annotations))

                    /**
                     * Sets [Builder.annotations] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.annotations] with a well-typed
                     * `List<Region>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun annotations(annotations: JsonField<List<Region>>) = apply {
                        this.annotations = annotations.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Region] to [annotations].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAnnotation(annotation: Region) = apply {
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
                     * `List<LogicalLocation>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun logicalLocations(logicalLocations: JsonField<List<LogicalLocation>>) =
                        apply {
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
                     * You should usually call [Builder.message] with a well-typed [Message] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<Message>) = apply { this.message = message }

                    /** Identifies the artifact and region. */
                    fun physicalLocation(physicalLocation: PhysicalLocation) =
                        physicalLocation(JsonField.of(physicalLocation))

                    /**
                     * Sets [Builder.physicalLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.physicalLocation] with a well-typed
                     * [PhysicalLocation] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun physicalLocation(physicalLocation: JsonField<PhysicalLocation>) = apply {
                        this.physicalLocation = physicalLocation
                    }

                    /** Key/value pairs that provide additional information about the location. */
                    fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

                    /**
                     * Sets [Builder.properties] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.properties] with a well-typed [PropertyBag]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun properties(properties: JsonField<PropertyBag>) = apply {
                        this.properties = properties
                    }

                    /**
                     * An array of objects that describe relationships between this location and
                     * others.
                     */
                    fun relationships(relationships: List<Relationship>) =
                        relationships(JsonField.of(relationships))

                    /**
                     * Sets [Builder.relationships] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.relationships] with a well-typed
                     * `List<Relationship>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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
                        (logicalLocations.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (message.asKnown().getOrNull()?.validity() ?: 0) +
                        (physicalLocation.asKnown().getOrNull()?.validity() ?: 0) +
                        (properties.asKnown().getOrNull()?.validity() ?: 0) +
                        (relationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** A logical location of a construct that produced a result. */
                class LogicalLocation
                private constructor(
                    private val decoratedName: JsonField<String>,
                    private val fullyQualifiedName: JsonField<String>,
                    private val index: JsonField<Long>,
                    private val kind: JsonField<String>,
                    private val name: JsonField<String>,
                    private val parentIndex: JsonField<Long>,
                    private val properties: JsonField<PropertyBag>,
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
                        @JsonProperty("index")
                        @ExcludeMissing
                        index: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("kind")
                        @ExcludeMissing
                        kind: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("parentIndex")
                        @ExcludeMissing
                        parentIndex: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<PropertyBag> = JsonMissing.of(),
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
                     * The machine-readable name for the logical location, such as a mangled
                     * function name provided by a C++ compiler that encodes calling convention,
                     * return type and other details along with the function name.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun decoratedName(): Optional<String> =
                        decoratedName.getOptional("decoratedName")

                    /**
                     * The human-readable fully qualified name of the logical location.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun fullyQualifiedName(): Optional<String> =
                        fullyQualifiedName.getOptional("fullyQualifiedName")

                    /**
                     * The index within the logical locations array.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun index(): Optional<Long> = index.getOptional("index")

                    /**
                     * The type of construct this logical location component refers to. Should be
                     * one of 'function', 'member', 'module', 'namespace', 'parameter', 'resource',
                     * 'returnType', 'type', 'variable', 'object', 'array', 'property', 'value',
                     * 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or
                     * 'processingInstruction', if any of those accurately describe the construct.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun kind(): Optional<String> = kind.getOptional("kind")

                    /**
                     * Identifies the construct in which the result occurred. For example, this
                     * property might contain the name of a class or a method.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = name.getOptional("name")

                    /**
                     * Identifies the index of the immediate parent of the construct in which the
                     * result was detected. For example, this property might point to a logical
                     * location that represents the namespace that holds a type.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun parentIndex(): Optional<Long> = parentIndex.getOptional("parentIndex")

                    /**
                     * Key/value pairs that provide additional information about the logical
                     * location.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

                    /**
                     * Returns the raw JSON value of [decoratedName].
                     *
                     * Unlike [decoratedName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("decoratedName")
                    @ExcludeMissing
                    fun _decoratedName(): JsonField<String> = decoratedName

                    /**
                     * Returns the raw JSON value of [fullyQualifiedName].
                     *
                     * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has
                     * an unexpected type.
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
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                    fun _properties(): JsonField<PropertyBag> = properties

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
                         * [LogicalLocation].
                         */
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
                        private var properties: JsonField<PropertyBag> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(logicalLocation: LogicalLocation) = apply {
                            decoratedName = logicalLocation.decoratedName
                            fullyQualifiedName = logicalLocation.fullyQualifiedName
                            index = logicalLocation.index
                            kind = logicalLocation.kind
                            name = logicalLocation.name
                            parentIndex = logicalLocation.parentIndex
                            properties = logicalLocation.properties
                            additionalProperties =
                                logicalLocation.additionalProperties.toMutableMap()
                        }

                        /**
                         * The machine-readable name for the logical location, such as a mangled
                         * function name provided by a C++ compiler that encodes calling convention,
                         * return type and other details along with the function name.
                         */
                        fun decoratedName(decoratedName: String) =
                            decoratedName(JsonField.of(decoratedName))

                        /**
                         * Sets [Builder.decoratedName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.decoratedName] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
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
                         * You should usually call [Builder.fullyQualifiedName] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
                            this.fullyQualifiedName = fullyQualifiedName
                        }

                        /** The index within the logical locations array. */
                        fun index(index: Long) = index(JsonField.of(index))

                        /**
                         * Sets [Builder.index] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.index] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun index(index: JsonField<Long>) = apply { this.index = index }

                        /**
                         * The type of construct this logical location component refers to. Should
                         * be one of 'function', 'member', 'module', 'namespace', 'parameter',
                         * 'resource', 'returnType', 'type', 'variable', 'object', 'array',
                         * 'property', 'value', 'element', 'text', 'attribute', 'comment',
                         * 'declaration', 'dtd' or 'processingInstruction', if any of those
                         * accurately describe the construct.
                         */
                        fun kind(kind: String) = kind(JsonField.of(kind))

                        /**
                         * Sets [Builder.kind] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.kind] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                        /**
                         * Identifies the construct in which the result occurred. For example, this
                         * property might contain the name of a class or a method.
                         */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /**
                         * Identifies the index of the immediate parent of the construct in which
                         * the result was detected. For example, this property might point to a
                         * logical location that represents the namespace that holds a type.
                         */
                        fun parentIndex(parentIndex: Long) = parentIndex(JsonField.of(parentIndex))

                        /**
                         * Sets [Builder.parentIndex] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.parentIndex] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun parentIndex(parentIndex: JsonField<Long>) = apply {
                            this.parentIndex = parentIndex
                        }

                        /**
                         * Key/value pairs that provide additional information about the logical
                         * location.
                         */
                        fun properties(properties: PropertyBag) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [PropertyBag] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<PropertyBag>) = apply {
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

                /** Identifies the artifact and region. */
                class PhysicalLocation
                private constructor(
                    private val address: JsonField<Address>,
                    private val artifactLocation: JsonField<ArtifactLocation>,
                    private val contextRegion: JsonField<Region>,
                    private val properties: JsonField<PropertyBag>,
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
                        contextRegion: JsonField<Region> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<PropertyBag> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<Region> = JsonMissing.of(),
                    ) : this(
                        address,
                        artifactLocation,
                        contextRegion,
                        properties,
                        region,
                        mutableMapOf(),
                    )

                    /**
                     * The address of the location.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun address(): Optional<Address> = address.getOptional("address")

                    /**
                     * The location of the artifact.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun artifactLocation(): Optional<ArtifactLocation> =
                        artifactLocation.getOptional("artifactLocation")

                    /**
                     * Specifies a portion of the artifact that encloses the region. Allows a viewer
                     * to display additional context around the region.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun contextRegion(): Optional<Region> =
                        contextRegion.getOptional("contextRegion")

                    /**
                     * Key/value pairs that provide additional information about the physical
                     * location.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

                    /**
                     * Specifies a portion of the artifact.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun region(): Optional<Region> = region.getOptional("region")

                    /**
                     * Returns the raw JSON value of [address].
                     *
                     * Unlike [address], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun _address(): JsonField<Address> = address

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
                     * Unlike [contextRegion], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("contextRegion")
                    @ExcludeMissing
                    fun _contextRegion(): JsonField<Region> = contextRegion

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<PropertyBag> = properties

                    /**
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<Region> = region

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
                         * [PhysicalLocation].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PhysicalLocation]. */
                    class Builder internal constructor() {

                        private var address: JsonField<Address> = JsonMissing.of()
                        private var artifactLocation: JsonField<ArtifactLocation> = JsonMissing.of()
                        private var contextRegion: JsonField<Region> = JsonMissing.of()
                        private var properties: JsonField<PropertyBag> = JsonMissing.of()
                        private var region: JsonField<Region> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(physicalLocation: PhysicalLocation) = apply {
                            address = physicalLocation.address
                            artifactLocation = physicalLocation.artifactLocation
                            contextRegion = physicalLocation.contextRegion
                            properties = physicalLocation.properties
                            region = physicalLocation.region
                            additionalProperties =
                                physicalLocation.additionalProperties.toMutableMap()
                        }

                        /** The address of the location. */
                        fun address(address: Address) = address(JsonField.of(address))

                        /**
                         * Sets [Builder.address] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address] with a well-typed [Address]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address(address: JsonField<Address>) = apply { this.address = address }

                        /** The location of the artifact. */
                        fun artifactLocation(artifactLocation: ArtifactLocation) =
                            artifactLocation(JsonField.of(artifactLocation))

                        /**
                         * Sets [Builder.artifactLocation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.artifactLocation] with a well-typed
                         * [ArtifactLocation] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun artifactLocation(artifactLocation: JsonField<ArtifactLocation>) =
                            apply {
                                this.artifactLocation = artifactLocation
                            }

                        /**
                         * Specifies a portion of the artifact that encloses the region. Allows a
                         * viewer to display additional context around the region.
                         */
                        fun contextRegion(contextRegion: Region) =
                            contextRegion(JsonField.of(contextRegion))

                        /**
                         * Sets [Builder.contextRegion] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.contextRegion] with a well-typed
                         * [Region] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun contextRegion(contextRegion: JsonField<Region>) = apply {
                            this.contextRegion = contextRegion
                        }

                        /**
                         * Key/value pairs that provide additional information about the physical
                         * location.
                         */
                        fun properties(properties: PropertyBag) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [PropertyBag] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<PropertyBag>) = apply {
                            this.properties = properties
                        }

                        /** Specifies a portion of the artifact. */
                        fun region(region: Region) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [Region] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<Region>) = apply { this.region = region }

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
                        private val properties: JsonField<PropertyBag>,
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
                            properties: JsonField<PropertyBag> = JsonMissing.of(),
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
                         * The address expressed as a byte offset from the start of the addressable
                         * region.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun absoluteAddress(): Optional<Long> =
                            absoluteAddress.getOptional("absoluteAddress")

                        /**
                         * A human-readable fully qualified name that is associated with the
                         * address.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun fullyQualifiedName(): Optional<String> =
                            fullyQualifiedName.getOptional("fullyQualifiedName")

                        /**
                         * The index within run.addresses of the cached object for this address.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun index(): Optional<Long> = index.getOptional("index")

                        /**
                         * An open-ended string that identifies the address kind. 'data',
                         * 'function', 'header','instruction', 'module', 'page', 'section',
                         * 'segment', 'stack', 'stackFrame', 'table' are well-known values.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun kind(): Optional<String> = kind.getOptional("kind")

                        /**
                         * The number of bytes in this range of addresses.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun length(): Optional<Long> = length.getOptional("length")

                        /**
                         * A name that is associated with the address, e.g., '.text'.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun name(): Optional<String> = name.getOptional("name")

                        /**
                         * The byte offset of this address from the absolute or relative address of
                         * the parent object.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun offsetFromParent(): Optional<Long> =
                            offsetFromParent.getOptional("offsetFromParent")

                        /**
                         * The index within run.addresses of the parent object.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun parentIndex(): Optional<Long> = parentIndex.getOptional("parentIndex")

                        /**
                         * Key/value pairs that provide additional information about the address.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun properties(): Optional<PropertyBag> =
                            properties.getOptional("properties")

                        /**
                         * The address expressed as a byte offset from the absolute address of the
                         * top-most parent object.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun relativeAddress(): Optional<Long> =
                            relativeAddress.getOptional("relativeAddress")

                        /**
                         * Returns the raw JSON value of [absoluteAddress].
                         *
                         * Unlike [absoluteAddress], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("absoluteAddress")
                        @ExcludeMissing
                        fun _absoluteAddress(): JsonField<Long> = absoluteAddress

                        /**
                         * Returns the raw JSON value of [fullyQualifiedName].
                         *
                         * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("fullyQualifiedName")
                        @ExcludeMissing
                        fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

                        /**
                         * Returns the raw JSON value of [index].
                         *
                         * Unlike [index], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                        /**
                         * Returns the raw JSON value of [kind].
                         *
                         * Unlike [kind], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

                        /**
                         * Returns the raw JSON value of [length].
                         *
                         * Unlike [length], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("length")
                        @ExcludeMissing
                        fun _length(): JsonField<Long> = length

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [offsetFromParent].
                         *
                         * Unlike [offsetFromParent], this method doesn't throw if the JSON field
                         * has an unexpected type.
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
                        fun _properties(): JsonField<PropertyBag> = properties

                        /**
                         * Returns the raw JSON value of [relativeAddress].
                         *
                         * Unlike [relativeAddress], this method doesn't throw if the JSON field has
                         * an unexpected type.
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

                            /**
                             * Returns a mutable builder for constructing an instance of [Address].
                             */
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
                            private var properties: JsonField<PropertyBag> = JsonMissing.of()
                            private var relativeAddress: JsonField<Long> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * The address expressed as a byte offset from the start of the
                             * addressable region.
                             */
                            fun absoluteAddress(absoluteAddress: Long) =
                                absoluteAddress(JsonField.of(absoluteAddress))

                            /**
                             * Sets [Builder.absoluteAddress] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.absoluteAddress] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun absoluteAddress(absoluteAddress: JsonField<Long>) = apply {
                                this.absoluteAddress = absoluteAddress
                            }

                            /**
                             * A human-readable fully qualified name that is associated with the
                             * address.
                             */
                            fun fullyQualifiedName(fullyQualifiedName: String) =
                                fullyQualifiedName(JsonField.of(fullyQualifiedName))

                            /**
                             * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fullyQualifiedName] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
                                this.fullyQualifiedName = fullyQualifiedName
                            }

                            /**
                             * The index within run.addresses of the cached object for this address.
                             */
                            fun index(index: Long) = index(JsonField.of(index))

                            /**
                             * Sets [Builder.index] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.index] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun index(index: JsonField<Long>) = apply { this.index = index }

                            /**
                             * An open-ended string that identifies the address kind. 'data',
                             * 'function', 'header','instruction', 'module', 'page', 'section',
                             * 'segment', 'stack', 'stackFrame', 'table' are well-known values.
                             */
                            fun kind(kind: String) = kind(JsonField.of(kind))

                            /**
                             * Sets [Builder.kind] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.kind] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                            /** The number of bytes in this range of addresses. */
                            fun length(length: Long) = length(JsonField.of(length))

                            /**
                             * Sets [Builder.length] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.length] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun length(length: JsonField<Long>) = apply { this.length = length }

                            /** A name that is associated with the address, e.g., '.text'. */
                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            /**
                             * The byte offset of this address from the absolute or relative address
                             * of the parent object.
                             */
                            fun offsetFromParent(offsetFromParent: Long) =
                                offsetFromParent(JsonField.of(offsetFromParent))

                            /**
                             * Sets [Builder.offsetFromParent] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.offsetFromParent] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun offsetFromParent(offsetFromParent: JsonField<Long>) = apply {
                                this.offsetFromParent = offsetFromParent
                            }

                            /** The index within run.addresses of the parent object. */
                            fun parentIndex(parentIndex: Long) =
                                parentIndex(JsonField.of(parentIndex))

                            /**
                             * Sets [Builder.parentIndex] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.parentIndex] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun parentIndex(parentIndex: JsonField<Long>) = apply {
                                this.parentIndex = parentIndex
                            }

                            /**
                             * Key/value pairs that provide additional information about the
                             * address.
                             */
                            fun properties(properties: PropertyBag) =
                                properties(JsonField.of(properties))

                            /**
                             * Sets [Builder.properties] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.properties] with a well-typed
                             * [PropertyBag] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun properties(properties: JsonField<PropertyBag>) = apply {
                                this.properties = properties
                            }

                            /**
                             * The address expressed as a byte offset from the absolute address of
                             * the top-most parent object.
                             */
                            fun relativeAddress(relativeAddress: Long) =
                                relativeAddress(JsonField.of(relativeAddress))

                            /**
                             * Sets [Builder.relativeAddress] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.relativeAddress] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun relativeAddress(relativeAddress: JsonField<Long>) = apply {
                                this.relativeAddress = relativeAddress
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
                             * Returns an immutable instance of [Address].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                        private val description: JsonField<Message>,
                        private val index: JsonField<Long>,
                        private val properties: JsonField<PropertyBag>,
                        private val uri: JsonField<String>,
                        private val uriBaseId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("description")
                            @ExcludeMissing
                            description: JsonField<Message> = JsonMissing.of(),
                            @JsonProperty("index")
                            @ExcludeMissing
                            index: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("properties")
                            @ExcludeMissing
                            properties: JsonField<PropertyBag> = JsonMissing.of(),
                            @JsonProperty("uri")
                            @ExcludeMissing
                            uri: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("uriBaseId")
                            @ExcludeMissing
                            uriBaseId: JsonField<String> = JsonMissing.of(),
                        ) : this(description, index, properties, uri, uriBaseId, mutableMapOf())

                        /**
                         * A short description of the artifact location.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun description(): Optional<Message> =
                            description.getOptional("description")

                        /**
                         * The index within the run artifacts array of the artifact object
                         * associated with the artifact location.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun index(): Optional<Long> = index.getOptional("index")

                        /**
                         * Key/value pairs that provide additional information about the artifact
                         * location.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun properties(): Optional<PropertyBag> =
                            properties.getOptional("properties")

                        /**
                         * A string containing a valid relative or absolute URI.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun uri(): Optional<String> = uri.getOptional("uri")

                        /**
                         * A string which indirectly specifies the absolute URI with respect to
                         * which a relative URI in the "uri" property is interpreted.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
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
                        fun _description(): JsonField<Message> = description

                        /**
                         * Returns the raw JSON value of [index].
                         *
                         * Unlike [index], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                        fun _properties(): JsonField<PropertyBag> = properties

                        /**
                         * Returns the raw JSON value of [uri].
                         *
                         * Unlike [uri], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

                        /**
                         * Returns the raw JSON value of [uriBaseId].
                         *
                         * Unlike [uriBaseId], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [ArtifactLocation].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ArtifactLocation]. */
                        class Builder internal constructor() {

                            private var description: JsonField<Message> = JsonMissing.of()
                            private var index: JsonField<Long> = JsonMissing.of()
                            private var properties: JsonField<PropertyBag> = JsonMissing.of()
                            private var uri: JsonField<String> = JsonMissing.of()
                            private var uriBaseId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(artifactLocation: ArtifactLocation) = apply {
                                description = artifactLocation.description
                                index = artifactLocation.index
                                properties = artifactLocation.properties
                                uri = artifactLocation.uri
                                uriBaseId = artifactLocation.uriBaseId
                                additionalProperties =
                                    artifactLocation.additionalProperties.toMutableMap()
                            }

                            /** A short description of the artifact location. */
                            fun description(description: Message) =
                                description(JsonField.of(description))

                            /**
                             * Sets [Builder.description] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.description] with a well-typed
                             * [Message] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun description(description: JsonField<Message>) = apply {
                                this.description = description
                            }

                            /**
                             * The index within the run artifacts array of the artifact object
                             * associated with the artifact location.
                             */
                            fun index(index: Long) = index(JsonField.of(index))

                            /**
                             * Sets [Builder.index] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.index] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun index(index: JsonField<Long>) = apply { this.index = index }

                            /**
                             * Key/value pairs that provide additional information about the
                             * artifact location.
                             */
                            fun properties(properties: PropertyBag) =
                                properties(JsonField.of(properties))

                            /**
                             * Sets [Builder.properties] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.properties] with a well-typed
                             * [PropertyBag] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun properties(properties: JsonField<PropertyBag>) = apply {
                                this.properties = properties
                            }

                            /** A string containing a valid relative or absolute URI. */
                            fun uri(uri: String) = uri(JsonField.of(uri))

                            /**
                             * Sets [Builder.uri] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.uri] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

                            /**
                             * A string which indirectly specifies the absolute URI with respect to
                             * which a relative URI in the "uri" property is interpreted.
                             */
                            fun uriBaseId(uriBaseId: String) = uriBaseId(JsonField.of(uriBaseId))

                            /**
                             * Sets [Builder.uriBaseId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.uriBaseId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun uriBaseId(uriBaseId: JsonField<String>) = apply {
                                this.uriBaseId = uriBaseId
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
                             * Returns an immutable instance of [ArtifactLocation].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

                /** Information about the relation of one location to another. */
                class Relationship
                private constructor(
                    private val target: JsonField<Long>,
                    private val description: JsonField<Message>,
                    private val kinds: JsonField<List<String>>,
                    private val properties: JsonField<PropertyBag>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("target")
                        @ExcludeMissing
                        target: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<Message> = JsonMissing.of(),
                        @JsonProperty("kinds")
                        @ExcludeMissing
                        kinds: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<PropertyBag> = JsonMissing.of(),
                    ) : this(target, description, kinds, properties, mutableMapOf())

                    /**
                     * A reference to the related location.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun target(): Long = target.getRequired("target")

                    /**
                     * A description of the location relationship.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): Optional<Message> = description.getOptional("description")

                    /**
                     * A set of distinct strings that categorize the relationship. Well-known kinds
                     * include 'includes', 'isIncludedBy' and 'relevant'.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun kinds(): Optional<List<String>> = kinds.getOptional("kinds")

                    /**
                     * Key/value pairs that provide additional information about the location
                     * relationship.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

                    /**
                     * Returns the raw JSON value of [target].
                     *
                     * Unlike [target], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Long> = target

                    /**
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<Message> = description

                    /**
                     * Returns the raw JSON value of [kinds].
                     *
                     * Unlike [kinds], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("kinds")
                    @ExcludeMissing
                    fun _kinds(): JsonField<List<String>> = kinds

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<PropertyBag> = properties

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
                        private var description: JsonField<Message> = JsonMissing.of()
                        private var kinds: JsonField<MutableList<String>>? = null
                        private var properties: JsonField<PropertyBag> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * You should usually call [Builder.target] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun target(target: JsonField<Long>) = apply { this.target = target }

                        /** A description of the location relationship. */
                        fun description(description: Message) =
                            description(JsonField.of(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [Message]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<Message>) = apply {
                            this.description = description
                        }

                        /**
                         * A set of distinct strings that categorize the relationship. Well-known
                         * kinds include 'includes', 'isIncludedBy' and 'relevant'.
                         */
                        fun kinds(kinds: List<String>) = kinds(JsonField.of(kinds))

                        /**
                         * Sets [Builder.kinds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.kinds] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun kinds(kinds: JsonField<List<String>>) = apply {
                            this.kinds = kinds.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [kinds].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
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
                        fun properties(properties: PropertyBag) =
                            properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed
                         * [PropertyBag] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<PropertyBag>) = apply {
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Frame && location == other.location && module == other.module && parameters == other.parameters && properties == other.properties && threadId == other.threadId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(location, module, parameters, properties, threadId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Frame{location=$location, module=$module, parameters=$parameters, properties=$properties, threadId=$threadId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stack && frames == other.frames && message == other.message && properties == other.properties && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(frames, message, properties, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stack{frames=$frames, message=$message, properties=$properties, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Exception && innerExceptions == other.innerExceptions && kind == other.kind && message == other.message && properties == other.properties && stack == other.stack && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(innerExceptions, kind, message, properties, stack, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Exception{innerExceptions=$innerExceptions, kind=$kind, message=$message, properties=$properties, stack=$stack, additionalProperties=$additionalProperties}"
}
