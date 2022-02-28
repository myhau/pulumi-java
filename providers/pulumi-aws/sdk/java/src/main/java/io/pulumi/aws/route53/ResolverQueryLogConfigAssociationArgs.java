// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResolverQueryLogConfigAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigAssociationArgs Empty = new ResolverQueryLogConfigAssociationArgs();

    /**
     * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    @InputImport(name="resolverQueryLogConfigId", required=true)
      private final Input<String> resolverQueryLogConfigId;

    public Input<String> getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }

    /**
     * The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public ResolverQueryLogConfigAssociationArgs(
        Input<String> resolverQueryLogConfigId,
        Input<String> resourceId) {
        this.resolverQueryLogConfigId = Objects.requireNonNull(resolverQueryLogConfigId, "expected parameter 'resolverQueryLogConfigId' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ResolverQueryLogConfigAssociationArgs() {
        this.resolverQueryLogConfigId = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resolverQueryLogConfigId;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverQueryLogConfigId = defaults.resolverQueryLogConfigId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResolverQueryLogConfigId(Input<String> resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = Objects.requireNonNull(resolverQueryLogConfigId);
            return this;
        }

        public Builder setResolverQueryLogConfigId(String resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = Input.of(Objects.requireNonNull(resolverQueryLogConfigId));
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public ResolverQueryLogConfigAssociationArgs build() {
            return new ResolverQueryLogConfigAssociationArgs(resolverQueryLogConfigId, resourceId);
        }
    }
}
