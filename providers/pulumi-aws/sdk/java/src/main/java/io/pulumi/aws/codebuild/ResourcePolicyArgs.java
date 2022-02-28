// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    /**
     * A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    /**
     * The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public ResourcePolicyArgs(
        Input<String> policy,
        Input<String> resourceArn) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ResourcePolicyArgs() {
        this.policy = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policy;
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(policy, resourceArn);
        }
    }
}
