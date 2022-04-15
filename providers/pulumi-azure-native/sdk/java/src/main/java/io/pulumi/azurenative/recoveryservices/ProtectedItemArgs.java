// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.AzureFileshareProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSClassicComputeVMProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSComputeVMProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSAPAseDatabaseProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSQLDatabaseProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.DPMProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.GenericProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.inputs.MabFileFolderProtectedItemArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectedItemArgs Empty = new ProtectedItemArgs();

    /**
     * Container name associated with the backup item.
     * 
     */
    @Import(name="containerName", required=true)
      private final Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Optional ETag.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> eTag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Fabric name associated with the backup item.
     * 
     */
    @Import(name="fabricName", required=true)
      private final Output<String> fabricName;

    public Output<String> fabricName() {
        return this.fabricName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * ProtectedItemResource properties
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Object> properties;

    public Output<Object> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Item name to be backed up.
     * 
     */
    @Import(name="protectedItemName")
      private final @Nullable Output<String> protectedItemName;

    public Output<String> protectedItemName() {
        return this.protectedItemName == null ? Codegen.empty() : this.protectedItemName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final Output<String> vaultName;

    public Output<String> vaultName() {
        return this.vaultName;
    }

    public ProtectedItemArgs(
        Output<String> containerName,
        @Nullable Output<String> eTag,
        Output<String> fabricName,
        @Nullable Output<String> location,
        @Nullable Output<Object> properties,
        @Nullable Output<String> protectedItemName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vaultName) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.eTag = eTag;
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.location = location;
        this.properties = properties;
        this.protectedItemName = protectedItemName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private ProtectedItemArgs() {
        this.containerName = Codegen.empty();
        this.eTag = Codegen.empty();
        this.fabricName = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.protectedItemName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.vaultName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> containerName;
        private @Nullable Output<String> eTag;
        private Output<String> fabricName;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> properties;
        private @Nullable Output<String> protectedItemName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.eTag = defaults.eTag;
    	      this.fabricName = defaults.fabricName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.protectedItemName = defaults.protectedItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder containerName(Output<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Output.of(Objects.requireNonNull(containerName));
            return this;
        }
        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder fabricName(Output<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder fabricName(String fabricName) {
            this.fabricName = Output.of(Objects.requireNonNull(fabricName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<Object> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Object properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder protectedItemName(@Nullable Output<String> protectedItemName) {
            this.protectedItemName = protectedItemName;
            return this;
        }
        public Builder protectedItemName(@Nullable String protectedItemName) {
            this.protectedItemName = Codegen.ofNullable(protectedItemName);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vaultName(Output<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Output.of(Objects.requireNonNull(vaultName));
            return this;
        }        public ProtectedItemArgs build() {
            return new ProtectedItemArgs(containerName, eTag, fabricName, location, properties, protectedItemName, resourceGroupName, tags, vaultName);
        }
    }
}
