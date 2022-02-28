// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ModelContainerImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelContainerImageConfigArgs Empty = new ModelContainerImageConfigArgs();

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    @InputImport(name="repositoryAccessMode", required=true)
      private final Input<String> repositoryAccessMode;

    public Input<String> getRepositoryAccessMode() {
        return this.repositoryAccessMode;
    }

    public ModelContainerImageConfigArgs(Input<String> repositoryAccessMode) {
        this.repositoryAccessMode = Objects.requireNonNull(repositoryAccessMode, "expected parameter 'repositoryAccessMode' to be non-null");
    }

    private ModelContainerImageConfigArgs() {
        this.repositoryAccessMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainerImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> repositoryAccessMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelContainerImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryAccessMode = defaults.repositoryAccessMode;
        }

        public Builder setRepositoryAccessMode(Input<String> repositoryAccessMode) {
            this.repositoryAccessMode = Objects.requireNonNull(repositoryAccessMode);
            return this;
        }

        public Builder setRepositoryAccessMode(String repositoryAccessMode) {
            this.repositoryAccessMode = Input.of(Objects.requireNonNull(repositoryAccessMode));
            return this;
        }
        public ModelContainerImageConfigArgs build() {
            return new ModelContainerImageConfigArgs(repositoryAccessMode);
        }
    }
}
