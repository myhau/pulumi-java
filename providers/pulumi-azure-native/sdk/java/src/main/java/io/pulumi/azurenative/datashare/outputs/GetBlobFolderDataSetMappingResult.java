// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBlobFolderDataSetMappingResult {
    /**
     * Container that has the file path.
     * 
     */
    private final String containerName;
    /**
     * The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set mapping.
     * Expected value is 'BlobFolder'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Prefix for blob folder
     * 
     */
    private final String prefix;
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * Resource group of storage account.
     * 
     */
    private final String resourceGroup;
    /**
     * Storage account name of the source data set.
     * 
     */
    private final String storageAccountName;
    /**
     * Subscription id of storage account.
     * 
     */
    private final String subscriptionId;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBlobFolderDataSetMappingResult(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("dataSetMappingStatus") String dataSetMappingStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.containerName = containerName;
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.prefix = prefix;
        this.provisioningState = provisioningState;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Container that has the file path.
     * 
    */
    public String containerName() {
        return this.containerName;
    }
    /**
     * The id of the source data set.
     * 
    */
    public String dataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
    */
    public String dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'BlobFolder'.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Prefix for blob folder
     * 
    */
    public String prefix() {
        return this.prefix;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource group of storage account.
     * 
    */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
    */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
    */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobFolderDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataSetId;
        private String dataSetMappingStatus;
        private String id;
        private String kind;
        private String name;
        private String prefix;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobFolderDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder dataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetBlobFolderDataSetMappingResult build() {
            return new GetBlobFolderDataSetMappingResult(containerName, dataSetId, dataSetMappingStatus, id, kind, name, prefix, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
