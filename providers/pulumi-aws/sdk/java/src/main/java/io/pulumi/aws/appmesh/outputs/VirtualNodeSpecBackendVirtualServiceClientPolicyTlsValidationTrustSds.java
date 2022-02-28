// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds {
    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    private final String secretName;

    @OutputCustomType.Constructor({"secretName"})
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds(String secretName) {
        this.secretName = Objects.requireNonNull(secretName);
    }

    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds(secretName);
        }
    }
}
