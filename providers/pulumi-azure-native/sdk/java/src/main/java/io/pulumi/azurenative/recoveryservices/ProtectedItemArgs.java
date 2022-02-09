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
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectedItemArgs Empty = new ProtectedItemArgs();

    @InputImport(name="containerName", required=true)
    private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    @InputImport(name="eTag")
    private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    @InputImport(name="fabricName", required=true)
    private final Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties")
    private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="protectedItemName")
    private final @Nullable Input<String> protectedItemName;

    public Input<String> getProtectedItemName() {
        return this.protectedItemName == null ? Input.empty() : this.protectedItemName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vaultName", required=true)
    private final Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName;
    }

    public ProtectedItemArgs(
        Input<String> containerName,
        @Nullable Input<String> eTag,
        Input<String> fabricName,
        @Nullable Input<String> location,
        @Nullable Input<Object> properties,
        @Nullable Input<String> protectedItemName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vaultName) {
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
        this.containerName = Input.empty();
        this.eTag = Input.empty();
        this.fabricName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.protectedItemName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> containerName;
        private @Nullable Input<String> eTag;
        private Input<String> fabricName;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> properties;
        private @Nullable Input<String> protectedItemName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vaultName;

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

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setFabricName(Input<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Input.of(Objects.requireNonNull(fabricName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setProtectedItemName(@Nullable Input<String> protectedItemName) {
            this.protectedItemName = protectedItemName;
            return this;
        }

        public Builder setProtectedItemName(@Nullable String protectedItemName) {
            this.protectedItemName = Input.ofNullable(protectedItemName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVaultName(Input<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Input.of(Objects.requireNonNull(vaultName));
            return this;
        }

        public ProtectedItemArgs build() {
            return new ProtectedItemArgs(containerName, eTag, fabricName, location, properties, protectedItemName, resourceGroupName, tags, vaultName);
        }
    }
}