// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverEndpointArgs Empty = new ResolverEndpointArgs();

    /**
     * The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    @InputImport(name="direction", required=true)
      private final Input<String> direction;

    public Input<String> getDirection() {
        return this.direction;
    }

    /**
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    @InputImport(name="ipAddresses", required=true)
      private final Input<List<ResolverEndpointIpAddressArgs>> ipAddresses;

    public Input<List<ResolverEndpointIpAddressArgs>> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResolverEndpointArgs(
        Input<String> direction,
        Input<List<ResolverEndpointIpAddressArgs>> ipAddresses,
        @Nullable Input<String> name,
        Input<List<String>> securityGroupIds,
        @Nullable Input<Map<String,String>> tags) {
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.ipAddresses = Objects.requireNonNull(ipAddresses, "expected parameter 'ipAddresses' to be non-null");
        this.name = name;
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.tags = tags;
    }

    private ResolverEndpointArgs() {
        this.direction = Input.empty();
        this.ipAddresses = Input.empty();
        this.name = Input.empty();
        this.securityGroupIds = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> direction;
        private Input<List<ResolverEndpointIpAddressArgs>> ipAddresses;
        private @Nullable Input<String> name;
        private Input<List<String>> securityGroupIds;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.name = defaults.name;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.tags = defaults.tags;
        }

        public Builder setDirection(Input<String> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder setIpAddresses(Input<List<ResolverEndpointIpAddressArgs>> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setIpAddresses(List<ResolverEndpointIpAddressArgs> ipAddresses) {
            this.ipAddresses = Input.of(Objects.requireNonNull(ipAddresses));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSecurityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ResolverEndpointArgs build() {
            return new ResolverEndpointArgs(direction, ipAddresses, name, securityGroupIds, tags);
        }
    }
}
