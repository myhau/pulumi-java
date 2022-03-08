// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSynapseWorkspaceSqlPoolTableDataSetMappingResult {
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
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    private final String synapseWorkspaceSqlPoolTableResourceId;
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

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","id","kind","name","provisioningState","synapseWorkspaceSqlPoolTableResourceId","systemData","type"})
    private GetSynapseWorkspaceSqlPoolTableDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String id,
        String kind,
        String name,
        String provisioningState,
        String synapseWorkspaceSqlPoolTableResourceId,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.provisioningState = provisioningState;
        this.synapseWorkspaceSqlPoolTableResourceId = synapseWorkspaceSqlPoolTableResourceId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The id of the source data set.
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
    */
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
    */
    public String getSynapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSynapseWorkspaceSqlPoolTableDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String synapseWorkspaceSqlPoolTableResourceId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSynapseWorkspaceSqlPoolTableDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSynapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSynapseWorkspaceSqlPoolTableDataSetMappingResult build() {
            return new GetSynapseWorkspaceSqlPoolTableDataSetMappingResult(dataSetId, dataSetMappingStatus, id, kind, name, provisioningState, synapseWorkspaceSqlPoolTableResourceId, systemData, type);
        }
    }
}
