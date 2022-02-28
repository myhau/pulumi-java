// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs;
import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigArgs();

    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
     */
    @InputImport(name="fileSystemConfig")
      private final @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig;

    public Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Input.empty() : this.fileSystemConfig;
    }

    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
     */
    @InputImport(name="kernelSpec", required=true)
      private final Input<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec;

    public Input<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> getKernelSpec() {
        return this.kernelSpec;
    }

    public AppImageConfigKernelGatewayImageConfigArgs(
        @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig,
        Input<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpec = Objects.requireNonNull(kernelSpec, "expected parameter 'kernelSpec' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigArgs() {
        this.fileSystemConfig = Input.empty();
        this.kernelSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig;
        private Input<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpec = defaults.kernelSpec;
        }

        public Builder setFileSystemConfig(@Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder setFileSystemConfig(@Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs fileSystemConfig) {
            this.fileSystemConfig = Input.ofNullable(fileSystemConfig);
            return this;
        }

        public Builder setKernelSpec(Input<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }

        public Builder setKernelSpec(AppImageConfigKernelGatewayImageConfigKernelSpecArgs kernelSpec) {
            this.kernelSpec = Input.of(Objects.requireNonNull(kernelSpec));
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigArgs build() {
            return new AppImageConfigKernelGatewayImageConfigArgs(fileSystemConfig, kernelSpec);
        }
    }
}
