// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkehub.v1alpha.outputs.AnthosObservabilityMembershipSpecResponse;
import java.util.Objects;

@CustomType
public final class AnthosObservabilityFeatureSpecResponse {
    /**
     * @return default membership spec for unconfigured memberships
     * 
     */
    private final AnthosObservabilityMembershipSpecResponse defaultMembershipSpec;

    @CustomType.Constructor
    private AnthosObservabilityFeatureSpecResponse(@CustomType.Parameter("defaultMembershipSpec") AnthosObservabilityMembershipSpecResponse defaultMembershipSpec) {
        this.defaultMembershipSpec = defaultMembershipSpec;
    }

    /**
     * @return default membership spec for unconfigured memberships
     * 
     */
    public AnthosObservabilityMembershipSpecResponse defaultMembershipSpec() {
        return this.defaultMembershipSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnthosObservabilityFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnthosObservabilityMembershipSpecResponse defaultMembershipSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AnthosObservabilityFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMembershipSpec = defaults.defaultMembershipSpec;
        }

        public Builder defaultMembershipSpec(AnthosObservabilityMembershipSpecResponse defaultMembershipSpec) {
            this.defaultMembershipSpec = Objects.requireNonNull(defaultMembershipSpec);
            return this;
        }        public AnthosObservabilityFeatureSpecResponse build() {
            return new AnthosObservabilityFeatureSpecResponse(defaultMembershipSpec);
        }
    }
}
