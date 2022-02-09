// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyCertificateAuthorityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyTransportSecurityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyTransportSecurityArgs Empty = new FirewallPolicyTransportSecurityArgs();

    @InputImport(name="certificateAuthority")
    private final @Nullable Input<FirewallPolicyCertificateAuthorityArgs> certificateAuthority;

    public Input<FirewallPolicyCertificateAuthorityArgs> getCertificateAuthority() {
        return this.certificateAuthority == null ? Input.empty() : this.certificateAuthority;
    }

    public FirewallPolicyTransportSecurityArgs(@Nullable Input<FirewallPolicyCertificateAuthorityArgs> certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    private FirewallPolicyTransportSecurityArgs() {
        this.certificateAuthority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyTransportSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirewallPolicyCertificateAuthorityArgs> certificateAuthority;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyTransportSecurityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
        }

        public Builder setCertificateAuthority(@Nullable Input<FirewallPolicyCertificateAuthorityArgs> certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder setCertificateAuthority(@Nullable FirewallPolicyCertificateAuthorityArgs certificateAuthority) {
            this.certificateAuthority = Input.ofNullable(certificateAuthority);
            return this;
        }

        public FirewallPolicyTransportSecurityArgs build() {
            return new FirewallPolicyTransportSecurityArgs(certificateAuthority);
        }
    }
}