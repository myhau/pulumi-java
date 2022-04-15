// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PipelineSourceTriggerPropertiesResponse {
    /**
     * The current status of the source trigger.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private PipelineSourceTriggerPropertiesResponse(@CustomType.Parameter("status") String status) {
        this.status = status;
    }

    /**
     * The current status of the source trigger.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSourceTriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSourceTriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public PipelineSourceTriggerPropertiesResponse build() {
            return new PipelineSourceTriggerPropertiesResponse(status);
        }
    }
}
