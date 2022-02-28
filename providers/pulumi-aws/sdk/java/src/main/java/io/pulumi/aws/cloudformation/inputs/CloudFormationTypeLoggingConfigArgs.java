// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CloudFormationTypeLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeLoggingConfigArgs Empty = new CloudFormationTypeLoggingConfigArgs();

    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    @InputImport(name="logGroupName", required=true)
      private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    @InputImport(name="logRoleArn", required=true)
      private final Input<String> logRoleArn;

    public Input<String> getLogRoleArn() {
        return this.logRoleArn;
    }

    public CloudFormationTypeLoggingConfigArgs(
        Input<String> logGroupName,
        Input<String> logRoleArn) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.logRoleArn = Objects.requireNonNull(logRoleArn, "expected parameter 'logRoleArn' to be non-null");
    }

    private CloudFormationTypeLoggingConfigArgs() {
        this.logGroupName = Input.empty();
        this.logRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationTypeLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logGroupName;
        private Input<String> logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationTypeLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder setLogGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
            return this;
        }

        public Builder setLogRoleArn(Input<String> logRoleArn) {
            this.logRoleArn = Objects.requireNonNull(logRoleArn);
            return this;
        }

        public Builder setLogRoleArn(String logRoleArn) {
            this.logRoleArn = Input.of(Objects.requireNonNull(logRoleArn));
            return this;
        }
        public CloudFormationTypeLoggingConfigArgs build() {
            return new CloudFormationTypeLoggingConfigArgs(logGroupName, logRoleArn);
        }
    }
}
