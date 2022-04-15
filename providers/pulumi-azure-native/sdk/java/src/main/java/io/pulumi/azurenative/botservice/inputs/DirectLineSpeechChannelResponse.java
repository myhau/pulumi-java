// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.DirectLineSpeechChannelPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DirectLine Speech channel definition
 * 
 */
public final class DirectLineSpeechChannelResponse extends io.pulumi.resources.InvokeArgs {

    public static final DirectLineSpeechChannelResponse Empty = new DirectLineSpeechChannelResponse();

    /**
     * The channel name
     * Expected value is 'DirectLineSpeechChannel'.
     * 
     */
    @Import(name="channelName", required=true)
      private final String channelName;

    public String channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
      private final @Nullable String etag;

    public Optional<String> etag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to DirectLine Speech channel resource
     * 
     */
    @Import(name="properties")
      private final @Nullable DirectLineSpeechChannelPropertiesResponse properties;

    public Optional<DirectLineSpeechChannelPropertiesResponse> properties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public DirectLineSpeechChannelResponse(
        String channelName,
        @Nullable String etag,
        @Nullable String location,
        @Nullable DirectLineSpeechChannelPropertiesResponse properties,
        String provisioningState) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? "global" : location;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private DirectLineSpeechChannelResponse() {
        this.channelName = null;
        this.etag = null;
        this.location = null;
        this.properties = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSpeechChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable DirectLineSpeechChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSpeechChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder properties(@Nullable DirectLineSpeechChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public DirectLineSpeechChannelResponse build() {
            return new DirectLineSpeechChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}
