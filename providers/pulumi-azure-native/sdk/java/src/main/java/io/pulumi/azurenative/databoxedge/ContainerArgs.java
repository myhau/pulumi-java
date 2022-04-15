// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.AzureContainerDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The container name.
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * DataFormat for Container
     * 
     */
    @Import(name="dataFormat", required=true)
      private final Output<Either<String,AzureContainerDataFormat>> dataFormat;

    public Output<Either<String,AzureContainerDataFormat>> dataFormat() {
        return this.dataFormat;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Storage Account Name
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    public ContainerArgs(
        @Nullable Output<String> containerName,
        Output<Either<String,AzureContainerDataFormat>> dataFormat,
        Output<String> deviceName,
        Output<String> resourceGroupName,
        Output<String> storageAccountName) {
        this.containerName = containerName;
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private ContainerArgs() {
        this.containerName = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.storageAccountName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private Output<Either<String,AzureContainerDataFormat>> dataFormat;
        private Output<String> deviceName;
        private Output<String> resourceGroupName;
        private Output<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder dataFormat(Output<Either<String,AzureContainerDataFormat>> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }
        public Builder dataFormat(Either<String,AzureContainerDataFormat> dataFormat) {
            this.dataFormat = Output.of(Objects.requireNonNull(dataFormat));
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder storageAccountName(Output<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Output.of(Objects.requireNonNull(storageAccountName));
            return this;
        }        public ContainerArgs build() {
            return new ContainerArgs(containerName, dataFormat, deviceName, resourceGroupName, storageAccountName);
        }
    }
}
