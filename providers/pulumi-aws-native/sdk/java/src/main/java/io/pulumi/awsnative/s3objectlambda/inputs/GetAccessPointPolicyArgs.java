// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPointPolicyArgs Empty = new GetAccessPointPolicyArgs();

    @InputImport(name="objectLambdaAccessPoint", required=true)
    private final String objectLambdaAccessPoint;

    public String getObjectLambdaAccessPoint() {
        return this.objectLambdaAccessPoint;
    }

    public GetAccessPointPolicyArgs(String objectLambdaAccessPoint) {
        this.objectLambdaAccessPoint = Objects.requireNonNull(objectLambdaAccessPoint, "expected parameter 'objectLambdaAccessPoint' to be non-null");
    }

    private GetAccessPointPolicyArgs() {
        this.objectLambdaAccessPoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectLambdaAccessPoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectLambdaAccessPoint = defaults.objectLambdaAccessPoint;
        }

        public Builder setObjectLambdaAccessPoint(String objectLambdaAccessPoint) {
            this.objectLambdaAccessPoint = Objects.requireNonNull(objectLambdaAccessPoint);
            return this;
        }

        public GetAccessPointPolicyArgs build() {
            return new GetAccessPointPolicyArgs(objectLambdaAccessPoint);
        }
    }
}