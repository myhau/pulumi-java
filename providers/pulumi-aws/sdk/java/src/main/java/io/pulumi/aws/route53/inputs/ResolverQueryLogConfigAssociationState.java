// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverQueryLogConfigAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigAssociationState Empty = new ResolverQueryLogConfigAssociationState();

    /**
     * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    @InputImport(name="resolverQueryLogConfigId")
      private final @Nullable Input<String> resolverQueryLogConfigId;

    public Input<String> getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId == null ? Input.empty() : this.resolverQueryLogConfigId;
    }

    /**
     * The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public ResolverQueryLogConfigAssociationState(
        @Nullable Input<String> resolverQueryLogConfigId,
        @Nullable Input<String> resourceId) {
        this.resolverQueryLogConfigId = resolverQueryLogConfigId;
        this.resourceId = resourceId;
    }

    private ResolverQueryLogConfigAssociationState() {
        this.resolverQueryLogConfigId = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resolverQueryLogConfigId;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverQueryLogConfigId = defaults.resolverQueryLogConfigId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResolverQueryLogConfigId(@Nullable Input<String> resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = resolverQueryLogConfigId;
            return this;
        }

        public Builder setResolverQueryLogConfigId(@Nullable String resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = Input.ofNullable(resolverQueryLogConfigId);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }
        public ResolverQueryLogConfigAssociationState build() {
            return new ResolverQueryLogConfigAssociationState(resolverQueryLogConfigId, resourceId);
        }
    }
}
