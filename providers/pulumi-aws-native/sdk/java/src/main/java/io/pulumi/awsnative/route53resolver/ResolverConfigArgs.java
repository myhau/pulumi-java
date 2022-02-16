// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.enums.ResolverConfigAutodefinedReverseFlag;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResolverConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverConfigArgs Empty = new ResolverConfigArgs();

    @InputImport(name="autodefinedReverseFlag", required=true)
    private final Input<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag;

    public Input<ResolverConfigAutodefinedReverseFlag> getAutodefinedReverseFlag() {
        return this.autodefinedReverseFlag;
    }

    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public ResolverConfigArgs(
        Input<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag,
        Input<String> resourceId) {
        this.autodefinedReverseFlag = Objects.requireNonNull(autodefinedReverseFlag, "expected parameter 'autodefinedReverseFlag' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ResolverConfigArgs() {
        this.autodefinedReverseFlag = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodefinedReverseFlag = defaults.autodefinedReverseFlag;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAutodefinedReverseFlag(Input<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag) {
            this.autodefinedReverseFlag = Objects.requireNonNull(autodefinedReverseFlag);
            return this;
        }

        public Builder setAutodefinedReverseFlag(ResolverConfigAutodefinedReverseFlag autodefinedReverseFlag) {
            this.autodefinedReverseFlag = Input.of(Objects.requireNonNull(autodefinedReverseFlag));
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

        public ResolverConfigArgs build() {
            return new ResolverConfigArgs(autodefinedReverseFlag, resourceId);
        }
    }
}