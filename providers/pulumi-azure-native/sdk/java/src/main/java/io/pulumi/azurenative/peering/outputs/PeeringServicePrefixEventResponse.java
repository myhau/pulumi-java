// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PeeringServicePrefixEventResponse {
    private final String eventDescription;
    private final String eventLevel;
    private final String eventSummary;
    private final String eventTimestamp;
    private final String eventType;

    @OutputCustomType.Constructor({"eventDescription","eventLevel","eventSummary","eventTimestamp","eventType"})
    private PeeringServicePrefixEventResponse(
        String eventDescription,
        String eventLevel,
        String eventSummary,
        String eventTimestamp,
        String eventType) {
        this.eventDescription = Objects.requireNonNull(eventDescription);
        this.eventLevel = Objects.requireNonNull(eventLevel);
        this.eventSummary = Objects.requireNonNull(eventSummary);
        this.eventTimestamp = Objects.requireNonNull(eventTimestamp);
        this.eventType = Objects.requireNonNull(eventType);
    }

    public String getEventDescription() {
        return this.eventDescription;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }
    public String getEventSummary() {
        return this.eventSummary;
    }
    public String getEventTimestamp() {
        return this.eventTimestamp;
    }
    public String getEventType() {
        return this.eventType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringServicePrefixEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventDescription;
        private String eventLevel;
        private String eventSummary;
        private String eventTimestamp;
        private String eventType;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringServicePrefixEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventDescription = defaults.eventDescription;
    	      this.eventLevel = defaults.eventLevel;
    	      this.eventSummary = defaults.eventSummary;
    	      this.eventTimestamp = defaults.eventTimestamp;
    	      this.eventType = defaults.eventType;
        }

        public Builder setEventDescription(String eventDescription) {
            this.eventDescription = Objects.requireNonNull(eventDescription);
            return this;
        }

        public Builder setEventLevel(String eventLevel) {
            this.eventLevel = Objects.requireNonNull(eventLevel);
            return this;
        }

        public Builder setEventSummary(String eventSummary) {
            this.eventSummary = Objects.requireNonNull(eventSummary);
            return this;
        }

        public Builder setEventTimestamp(String eventTimestamp) {
            this.eventTimestamp = Objects.requireNonNull(eventTimestamp);
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public PeeringServicePrefixEventResponse build() {
            return new PeeringServicePrefixEventResponse(eventDescription, eventLevel, eventSummary, eventTimestamp, eventType);
        }
    }
}