// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.GcsDestinationConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DestinationConfigResponse {
    /**
     * @return Destination connection profile identifier.
     * 
     */
    private final String destinationConnectionProfileName;
    /**
     * @return GCS destination configuration.
     * 
     */
    private final GcsDestinationConfigResponse gcsDestinationConfig;

    @CustomType.Constructor
    private DestinationConfigResponse(
        @CustomType.Parameter("destinationConnectionProfileName") String destinationConnectionProfileName,
        @CustomType.Parameter("gcsDestinationConfig") GcsDestinationConfigResponse gcsDestinationConfig) {
        this.destinationConnectionProfileName = destinationConnectionProfileName;
        this.gcsDestinationConfig = gcsDestinationConfig;
    }

    /**
     * @return Destination connection profile identifier.
     * 
     */
    public String destinationConnectionProfileName() {
        return this.destinationConnectionProfileName;
    }
    /**
     * @return GCS destination configuration.
     * 
     */
    public GcsDestinationConfigResponse gcsDestinationConfig() {
        return this.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationConnectionProfileName;
        private GcsDestinationConfigResponse gcsDestinationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationConnectionProfileName = defaults.destinationConnectionProfileName;
    	      this.gcsDestinationConfig = defaults.gcsDestinationConfig;
        }

        public Builder destinationConnectionProfileName(String destinationConnectionProfileName) {
            this.destinationConnectionProfileName = Objects.requireNonNull(destinationConnectionProfileName);
            return this;
        }
        public Builder gcsDestinationConfig(GcsDestinationConfigResponse gcsDestinationConfig) {
            this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
            return this;
        }        public DestinationConfigResponse build() {
            return new DestinationConfigResponse(destinationConnectionProfileName, gcsDestinationConfig);
        }
    }
}
