// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrArgs Empty = new VpcIpamPoolCidrArgs();

    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @InputImport(name="cidr")
      private final @Nullable Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr == null ? Input.empty() : this.cidr;
    }

    /**
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
     * 
     */
    @InputImport(name="cidrAuthorizationContext")
      private final @Nullable Input<VpcIpamPoolCidrCidrAuthorizationContextArgs> cidrAuthorizationContext;

    public Input<VpcIpamPoolCidrCidrAuthorizationContextArgs> getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext == null ? Input.empty() : this.cidrAuthorizationContext;
    }

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @InputImport(name="ipamPoolId", required=true)
      private final Input<String> ipamPoolId;

    public Input<String> getIpamPoolId() {
        return this.ipamPoolId;
    }

    public VpcIpamPoolCidrArgs(
        @Nullable Input<String> cidr,
        @Nullable Input<VpcIpamPoolCidrCidrAuthorizationContextArgs> cidrAuthorizationContext,
        Input<String> ipamPoolId) {
        this.cidr = cidr;
        this.cidrAuthorizationContext = cidrAuthorizationContext;
        this.ipamPoolId = Objects.requireNonNull(ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
    }

    private VpcIpamPoolCidrArgs() {
        this.cidr = Input.empty();
        this.cidrAuthorizationContext = Input.empty();
        this.ipamPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolCidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidr;
        private @Nullable Input<VpcIpamPoolCidrCidrAuthorizationContextArgs> cidrAuthorizationContext;
        private Input<String> ipamPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolCidrArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.cidrAuthorizationContext = defaults.cidrAuthorizationContext;
    	      this.ipamPoolId = defaults.ipamPoolId;
        }

        public Builder setCidr(@Nullable Input<String> cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder setCidr(@Nullable String cidr) {
            this.cidr = Input.ofNullable(cidr);
            return this;
        }

        public Builder setCidrAuthorizationContext(@Nullable Input<VpcIpamPoolCidrCidrAuthorizationContextArgs> cidrAuthorizationContext) {
            this.cidrAuthorizationContext = cidrAuthorizationContext;
            return this;
        }

        public Builder setCidrAuthorizationContext(@Nullable VpcIpamPoolCidrCidrAuthorizationContextArgs cidrAuthorizationContext) {
            this.cidrAuthorizationContext = Input.ofNullable(cidrAuthorizationContext);
            return this;
        }

        public Builder setIpamPoolId(Input<String> ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }

        public Builder setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = Input.of(Objects.requireNonNull(ipamPoolId));
            return this;
        }
        public VpcIpamPoolCidrArgs build() {
            return new VpcIpamPoolCidrArgs(cidr, cidrAuthorizationContext, ipamPoolId);
        }
    }
}
