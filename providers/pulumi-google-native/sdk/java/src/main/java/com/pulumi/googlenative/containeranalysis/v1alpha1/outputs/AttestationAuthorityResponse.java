// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.AttestationAuthorityHintResponse;
import java.util.Objects;

@CustomType
public final class AttestationAuthorityResponse {
    private final AttestationAuthorityHintResponse hint;

    @CustomType.Constructor
    private AttestationAuthorityResponse(@CustomType.Parameter("hint") AttestationAuthorityHintResponse hint) {
        this.hint = hint;
    }

    public AttestationAuthorityHintResponse hint() {
        return this.hint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityHintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder hint(AttestationAuthorityHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }        public AttestationAuthorityResponse build() {
            return new AttestationAuthorityResponse(hint);
        }
    }
}
