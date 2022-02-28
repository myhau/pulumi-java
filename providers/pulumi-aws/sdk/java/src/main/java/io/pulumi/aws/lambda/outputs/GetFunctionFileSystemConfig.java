// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFunctionFileSystemConfig {
    /**
     * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
     * 
     */
    private final String arn;
    private final String localMountPath;

    @OutputCustomType.Constructor({"arn","localMountPath"})
    private GetFunctionFileSystemConfig(
        String arn,
        String localMountPath) {
        this.arn = Objects.requireNonNull(arn);
        this.localMountPath = Objects.requireNonNull(localMountPath);
    }

    /**
     * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    public String getLocalMountPath() {
        return this.localMountPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionFileSystemConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String localMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionFileSystemConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.localMountPath = defaults.localMountPath;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setLocalMountPath(String localMountPath) {
            this.localMountPath = Objects.requireNonNull(localMountPath);
            return this;
        }
        public GetFunctionFileSystemConfig build() {
            return new GetFunctionFileSystemConfig(arn, localMountPath);
        }
    }
}
