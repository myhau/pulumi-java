// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.enums.DataStoreTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for Operational-Tier DataStore
 * 
 */
public final class AzureOperationalStoreParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureOperationalStoreParametersArgs Empty = new AzureOperationalStoreParametersArgs();

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    @Import(name="dataStoreType", required=true)
      private final Output<Either<String,DataStoreTypes>> dataStoreType;

    public Output<Either<String,DataStoreTypes>> dataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureOperationalStoreParameters'.
     * 
     */
    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    @Import(name="resourceGroupId")
      private final @Nullable Output<String> resourceGroupId;

    public Output<String> resourceGroupId() {
        return this.resourceGroupId == null ? Codegen.empty() : this.resourceGroupId;
    }

    public AzureOperationalStoreParametersArgs(
        Output<Either<String,DataStoreTypes>> dataStoreType,
        Output<String> objectType,
        @Nullable Output<String> resourceGroupId) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.resourceGroupId = resourceGroupId;
    }

    private AzureOperationalStoreParametersArgs() {
        this.dataStoreType = Codegen.empty();
        this.objectType = Codegen.empty();
        this.resourceGroupId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureOperationalStoreParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,DataStoreTypes>> dataStoreType;
        private Output<String> objectType;
        private @Nullable Output<String> resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureOperationalStoreParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder dataStoreType(Output<Either<String,DataStoreTypes>> dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }
        public Builder dataStoreType(Either<String,DataStoreTypes> dataStoreType) {
            this.dataStoreType = Output.of(Objects.requireNonNull(dataStoreType));
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Codegen.ofNullable(resourceGroupId);
            return this;
        }        public AzureOperationalStoreParametersArgs build() {
            return new AzureOperationalStoreParametersArgs(dataStoreType, objectType, resourceGroupId);
        }
    }
}
