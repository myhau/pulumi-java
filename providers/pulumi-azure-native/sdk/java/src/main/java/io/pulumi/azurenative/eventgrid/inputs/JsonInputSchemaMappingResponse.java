// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.inputs.JsonFieldResponse;
import io.pulumi.azurenative.eventgrid.inputs.JsonFieldWithDefaultResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This enables publishing to Event Grid using a custom input schema. This can be used to map properties from a custom input JSON schema to the Event Grid event schema.
 * 
 */
public final class JsonInputSchemaMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final JsonInputSchemaMappingResponse Empty = new JsonInputSchemaMappingResponse();

    /**
     * The mapping information for the DataVersion property of the Event Grid Event.
     * 
     */
    @Import(name="dataVersion")
      private final @Nullable JsonFieldWithDefaultResponse dataVersion;

    public Optional<JsonFieldWithDefaultResponse> dataVersion() {
        return this.dataVersion == null ? Optional.empty() : Optional.ofNullable(this.dataVersion);
    }

    /**
     * The mapping information for the EventTime property of the Event Grid Event.
     * 
     */
    @Import(name="eventTime")
      private final @Nullable JsonFieldResponse eventTime;

    public Optional<JsonFieldResponse> eventTime() {
        return this.eventTime == null ? Optional.empty() : Optional.ofNullable(this.eventTime);
    }

    /**
     * The mapping information for the EventType property of the Event Grid Event.
     * 
     */
    @Import(name="eventType")
      private final @Nullable JsonFieldWithDefaultResponse eventType;

    public Optional<JsonFieldWithDefaultResponse> eventType() {
        return this.eventType == null ? Optional.empty() : Optional.ofNullable(this.eventType);
    }

    /**
     * The mapping information for the Id property of the Event Grid Event.
     * 
     */
    @Import(name="id")
      private final @Nullable JsonFieldResponse id;

    public Optional<JsonFieldResponse> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Type of the custom mapping
     * Expected value is 'Json'.
     * 
     */
    @Import(name="inputSchemaMappingType", required=true)
      private final String inputSchemaMappingType;

    public String inputSchemaMappingType() {
        return this.inputSchemaMappingType;
    }

    /**
     * The mapping information for the Subject property of the Event Grid Event.
     * 
     */
    @Import(name="subject")
      private final @Nullable JsonFieldWithDefaultResponse subject;

    public Optional<JsonFieldWithDefaultResponse> subject() {
        return this.subject == null ? Optional.empty() : Optional.ofNullable(this.subject);
    }

    /**
     * The mapping information for the Topic property of the Event Grid Event.
     * 
     */
    @Import(name="topic")
      private final @Nullable JsonFieldResponse topic;

    public Optional<JsonFieldResponse> topic() {
        return this.topic == null ? Optional.empty() : Optional.ofNullable(this.topic);
    }

    public JsonInputSchemaMappingResponse(
        @Nullable JsonFieldWithDefaultResponse dataVersion,
        @Nullable JsonFieldResponse eventTime,
        @Nullable JsonFieldWithDefaultResponse eventType,
        @Nullable JsonFieldResponse id,
        String inputSchemaMappingType,
        @Nullable JsonFieldWithDefaultResponse subject,
        @Nullable JsonFieldResponse topic) {
        this.dataVersion = dataVersion;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.id = id;
        this.inputSchemaMappingType = Objects.requireNonNull(inputSchemaMappingType, "expected parameter 'inputSchemaMappingType' to be non-null");
        this.subject = subject;
        this.topic = topic;
    }

    private JsonInputSchemaMappingResponse() {
        this.dataVersion = null;
        this.eventTime = null;
        this.eventType = null;
        this.id = null;
        this.inputSchemaMappingType = null;
        this.subject = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonInputSchemaMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JsonFieldWithDefaultResponse dataVersion;
        private @Nullable JsonFieldResponse eventTime;
        private @Nullable JsonFieldWithDefaultResponse eventType;
        private @Nullable JsonFieldResponse id;
        private String inputSchemaMappingType;
        private @Nullable JsonFieldWithDefaultResponse subject;
        private @Nullable JsonFieldResponse topic;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonInputSchemaMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataVersion = defaults.dataVersion;
    	      this.eventTime = defaults.eventTime;
    	      this.eventType = defaults.eventType;
    	      this.id = defaults.id;
    	      this.inputSchemaMappingType = defaults.inputSchemaMappingType;
    	      this.subject = defaults.subject;
    	      this.topic = defaults.topic;
        }

        public Builder dataVersion(@Nullable JsonFieldWithDefaultResponse dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Builder eventTime(@Nullable JsonFieldResponse eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Builder eventType(@Nullable JsonFieldWithDefaultResponse eventType) {
            this.eventType = eventType;
            return this;
        }
        public Builder id(@Nullable JsonFieldResponse id) {
            this.id = id;
            return this;
        }
        public Builder inputSchemaMappingType(String inputSchemaMappingType) {
            this.inputSchemaMappingType = Objects.requireNonNull(inputSchemaMappingType);
            return this;
        }
        public Builder subject(@Nullable JsonFieldWithDefaultResponse subject) {
            this.subject = subject;
            return this;
        }
        public Builder topic(@Nullable JsonFieldResponse topic) {
            this.topic = topic;
            return this;
        }        public JsonInputSchemaMappingResponse build() {
            return new JsonInputSchemaMappingResponse(dataVersion, eventTime, eventType, id, inputSchemaMappingType, subject, topic);
        }
    }
}
