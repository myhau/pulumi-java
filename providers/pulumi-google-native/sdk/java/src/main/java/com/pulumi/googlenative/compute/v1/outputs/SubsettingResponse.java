// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubsettingResponse {
    private final String policy;

    @CustomType.Constructor
    private SubsettingResponse(@CustomType.Parameter("policy") String policy) {
        this.policy = policy;
    }

    public String policy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubsettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(SubsettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }        public SubsettingResponse build() {
            return new SubsettingResponse(policy);
        }
    }
}
