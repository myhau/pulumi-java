// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.DataTransferRegionalServiceResourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for DataTransferServiceResource.
 * 
 */
public final class DataTransferServiceResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataTransferServiceResourcePropertiesResponse Empty = new DataTransferServiceResourcePropertiesResponse();

    /**
     * Time of the last state change (ISO-8601 format).
     * 
     */
    @Import(name="creationTime", required=true)
      private final String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * Instance count for the service.
     * 
     */
    @Import(name="instanceCount")
      private final @Nullable Integer instanceCount;

    public Optional<Integer> instanceCount() {
        return this.instanceCount == null ? Optional.empty() : Optional.ofNullable(this.instanceCount);
    }

    /**
     * Instance type for the service.
     * 
     */
    @Import(name="instanceSize")
      private final @Nullable String instanceSize;

    public Optional<String> instanceSize() {
        return this.instanceSize == null ? Optional.empty() : Optional.ofNullable(this.instanceSize);
    }

    /**
     * An array that contains all of the locations for the service.
     * 
     */
    @Import(name="locations", required=true)
      private final List<DataTransferRegionalServiceResourceResponse> locations;

    public List<DataTransferRegionalServiceResourceResponse> locations() {
        return this.locations;
    }

    /**
     * ServiceType for the service.
     * Expected value is 'DataTransfer'.
     * 
     */
    @Import(name="serviceType", required=true)
      private final String serviceType;

    public String serviceType() {
        return this.serviceType;
    }

    /**
     * Describes the status of a service.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public DataTransferServiceResourcePropertiesResponse(
        String creationTime,
        @Nullable Integer instanceCount,
        @Nullable String instanceSize,
        List<DataTransferRegionalServiceResourceResponse> locations,
        String serviceType,
        String status) {
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.instanceCount = instanceCount;
        this.instanceSize = instanceSize;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.serviceType = Objects.requireNonNull(serviceType, "expected parameter 'serviceType' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DataTransferServiceResourcePropertiesResponse() {
        this.creationTime = null;
        this.instanceCount = null;
        this.instanceSize = null;
        this.locations = List.of();
        this.serviceType = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferServiceResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSize;
        private List<DataTransferRegionalServiceResourceResponse> locations;
        private String serviceType;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferServiceResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSize = defaults.instanceSize;
    	      this.locations = defaults.locations;
    	      this.serviceType = defaults.serviceType;
    	      this.status = defaults.status;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceSize(@Nullable String instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public Builder locations(List<DataTransferRegionalServiceResourceResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(DataTransferRegionalServiceResourceResponse... locations) {
            return locations(List.of(locations));
        }
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public DataTransferServiceResourcePropertiesResponse build() {
            return new DataTransferServiceResourcePropertiesResponse(creationTime, instanceCount, instanceSize, locations, serviceType, status);
        }
    }
}
