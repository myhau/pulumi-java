// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.RefreshDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetContainerResult {
    /**
     * Current status of the container.
     * 
     */
    private final String containerStatus;
    /**
     * The UTC time when container got created.
     * 
     */
    private final String createdDateTime;
    /**
     * DataFormat for Container
     * 
     */
    private final String dataFormat;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Details of the refresh job on this container.
     * 
     */
    private final RefreshDetailsResponse refreshDetails;
    /**
     * Container in DataBoxEdge Resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"containerStatus","createdDateTime","dataFormat","id","name","refreshDetails","systemData","type"})
    private GetContainerResult(
        String containerStatus,
        String createdDateTime,
        String dataFormat,
        String id,
        String name,
        RefreshDetailsResponse refreshDetails,
        SystemDataResponse systemData,
        String type) {
        this.containerStatus = containerStatus;
        this.createdDateTime = createdDateTime;
        this.dataFormat = dataFormat;
        this.id = id;
        this.name = name;
        this.refreshDetails = refreshDetails;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Current status of the container.
     * 
    */
    public String getContainerStatus() {
        return this.containerStatus;
    }
    /**
     * The UTC time when container got created.
     * 
    */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * DataFormat for Container
     * 
    */
    public String getDataFormat() {
        return this.dataFormat;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Details of the refresh job on this container.
     * 
    */
    public RefreshDetailsResponse getRefreshDetails() {
        return this.refreshDetails;
    }
    /**
     * Container in DataBoxEdge Resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerStatus;
        private String createdDateTime;
        private String dataFormat;
        private String id;
        private String name;
        private RefreshDetailsResponse refreshDetails;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerStatus = defaults.containerStatus;
    	      this.createdDateTime = defaults.createdDateTime;
    	      this.dataFormat = defaults.dataFormat;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.refreshDetails = defaults.refreshDetails;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setContainerStatus(String containerStatus) {
            this.containerStatus = Objects.requireNonNull(containerStatus);
            return this;
        }

        public Builder setCreatedDateTime(String createdDateTime) {
            this.createdDateTime = Objects.requireNonNull(createdDateTime);
            return this;
        }

        public Builder setDataFormat(String dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRefreshDetails(RefreshDetailsResponse refreshDetails) {
            this.refreshDetails = Objects.requireNonNull(refreshDetails);
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
        public GetContainerResult build() {
            return new GetContainerResult(containerStatus, createdDateTime, dataFormat, id, name, refreshDetails, systemData, type);
        }
    }
}
