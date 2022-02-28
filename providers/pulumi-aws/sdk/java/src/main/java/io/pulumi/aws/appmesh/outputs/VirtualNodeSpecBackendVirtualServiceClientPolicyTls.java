// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTls {
    /**
     * The listener's TLS certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate;
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    private final @Nullable Boolean enforce;
    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    private final @Nullable List<Integer> ports;
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    private final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation;

    @OutputCustomType.Constructor({"certificate","enforce","ports","validation"})
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTls(
        @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate,
        @Nullable Boolean enforce,
        @Nullable List<Integer> ports,
        VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation);
    }

    /**
     * The listener's TLS certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    public Optional<Boolean> getEnforce() {
        return Optional.ofNullable(this.enforce);
    }
    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    public List<Integer> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation getValidation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate;
        private @Nullable Boolean enforce;
        private @Nullable List<Integer> ports;
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder setCertificate(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setEnforce(@Nullable Boolean enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder setPorts(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setValidation(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTls build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTls(certificate, enforce, ports, validation);
        }
    }
}
