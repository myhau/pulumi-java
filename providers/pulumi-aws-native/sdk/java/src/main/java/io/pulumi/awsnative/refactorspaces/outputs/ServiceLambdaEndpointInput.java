// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceLambdaEndpointInput {
    private final String arn;

    @OutputCustomType.Constructor({"arn"})
    private ServiceLambdaEndpointInput(String arn) {
        this.arn = arn;
    }

    public String getArn() {
        return this.arn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLambdaEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLambdaEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public ServiceLambdaEndpointInput build() {
            return new ServiceLambdaEndpointInput(arn);
        }
    }
}
