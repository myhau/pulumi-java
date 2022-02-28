// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionDeadLetterConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionDeadLetterConfig Empty = new GetFunctionDeadLetterConfig();

    @InputImport(name="targetArn", required=true)
      private final String targetArn;

    public String getTargetArn() {
        return this.targetArn;
    }

    public GetFunctionDeadLetterConfig(String targetArn) {
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private GetFunctionDeadLetterConfig() {
        this.targetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public GetFunctionDeadLetterConfig build() {
            return new GetFunctionDeadLetterConfig(targetArn);
        }
    }
}
