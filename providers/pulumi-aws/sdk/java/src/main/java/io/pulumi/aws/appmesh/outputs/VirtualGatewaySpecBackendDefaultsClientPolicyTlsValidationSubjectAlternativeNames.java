// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames {
    /**
     * The criteria for determining a SAN's match.
     * 
     */
    private final VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match;

    @OutputCustomType.Constructor({"match"})
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match) {
        this.match = match;
    }

    /**
     * The criteria for determining a SAN's match.
     * 
    */
    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder setMatch(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames(match);
        }
    }
}