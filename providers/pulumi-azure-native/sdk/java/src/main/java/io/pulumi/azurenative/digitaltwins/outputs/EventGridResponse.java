// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventGridResponse {
    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    private final String accessKey1;
    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    private final @Nullable String accessKey2;
    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    private final String createdTime;
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String deadLetterSecret;
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    private final @Nullable String deadLetterUri;
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventGrid'.
     * 
     */
    private final String endpointType;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * EventGrid Topic Endpoint
     * 
     */
    private final String topicEndpoint;

    @OutputCustomType.Constructor({"accessKey1","accessKey2","authenticationType","createdTime","deadLetterSecret","deadLetterUri","endpointType","provisioningState","topicEndpoint"})
    private EventGridResponse(
        String accessKey1,
        @Nullable String accessKey2,
        @Nullable String authenticationType,
        String createdTime,
        @Nullable String deadLetterSecret,
        @Nullable String deadLetterUri,
        String endpointType,
        String provisioningState,
        String topicEndpoint) {
        this.accessKey1 = accessKey1;
        this.accessKey2 = accessKey2;
        this.authenticationType = authenticationType;
        this.createdTime = createdTime;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = endpointType;
        this.provisioningState = provisioningState;
        this.topicEndpoint = topicEndpoint;
    }

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
    */
    public String getAccessKey1() {
        return this.accessKey1;
    }
    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
    */
    public Optional<String> getAccessKey2() {
        return Optional.ofNullable(this.accessKey2);
    }
    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> getDeadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
    */
    public Optional<String> getDeadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventGrid'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * EventGrid Topic Endpoint
     * 
    */
    public String getTopicEndpoint() {
        return this.topicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey1;
        private @Nullable String accessKey2;
        private @Nullable String authenticationType;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private String provisioningState;
        private String topicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey1 = defaults.accessKey1;
    	      this.accessKey2 = defaults.accessKey2;
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.topicEndpoint = defaults.topicEndpoint;
        }

        public Builder setAccessKey1(String accessKey1) {
            this.accessKey1 = Objects.requireNonNull(accessKey1);
            return this;
        }

        public Builder setAccessKey2(@Nullable String accessKey2) {
            this.accessKey2 = accessKey2;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder setDeadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTopicEndpoint(String topicEndpoint) {
            this.topicEndpoint = Objects.requireNonNull(topicEndpoint);
            return this;
        }
        public EventGridResponse build() {
            return new EventGridResponse(accessKey1, accessKey2, authenticationType, createdTime, deadLetterSecret, deadLetterUri, endpointType, provisioningState, topicEndpoint);
        }
    }
}
