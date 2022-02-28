// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserPoolLambdaConfigCustomEmailSender {
    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     * 
     */
    private final String lambdaArn;
    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     * 
     */
    private final String lambdaVersion;

    @OutputCustomType.Constructor({"lambdaArn","lambdaVersion"})
    private UserPoolLambdaConfigCustomEmailSender(
        String lambdaArn,
        String lambdaVersion) {
        this.lambdaArn = Objects.requireNonNull(lambdaArn);
        this.lambdaVersion = Objects.requireNonNull(lambdaVersion);
    }

    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     * 
     */
    public String getLambdaArn() {
        return this.lambdaArn;
    }
    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     * 
     */
    public String getLambdaVersion() {
        return this.lambdaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigCustomEmailSender defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lambdaArn;
        private String lambdaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfigCustomEmailSender defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.lambdaVersion = defaults.lambdaVersion;
        }

        public Builder setLambdaArn(String lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }

        public Builder setLambdaVersion(String lambdaVersion) {
            this.lambdaVersion = Objects.requireNonNull(lambdaVersion);
            return this;
        }
        public UserPoolLambdaConfigCustomEmailSender build() {
            return new UserPoolLambdaConfigCustomEmailSender(lambdaArn, lambdaVersion);
        }
    }
}
