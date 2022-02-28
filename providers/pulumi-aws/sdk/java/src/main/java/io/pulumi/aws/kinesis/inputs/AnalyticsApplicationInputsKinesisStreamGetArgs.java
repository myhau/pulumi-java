// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationInputsKinesisStreamGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsKinesisStreamGetArgs Empty = new AnalyticsApplicationInputsKinesisStreamGetArgs();

    /**
     * The ARN of the Kinesis Stream.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The ARN of the IAM Role used to access the stream.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public AnalyticsApplicationInputsKinesisStreamGetArgs(
        Input<String> resourceArn,
        Input<String> roleArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnalyticsApplicationInputsKinesisStreamGetArgs() {
        this.resourceArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsKinesisStreamGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsKinesisStreamGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public AnalyticsApplicationInputsKinesisStreamGetArgs build() {
            return new AnalyticsApplicationInputsKinesisStreamGetArgs(resourceArn, roleArn);
        }
    }
}
