// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @InputImport(name="tls")
      private final @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyArgs(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls) {
        this.tls = tls;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyArgs() {
        this.tls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder setTls(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyArgs(tls);
        }
    }
}
