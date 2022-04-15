// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DataStoreResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RetentionVolumeResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VersionDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of a Master Target Server.
 * 
 */
public final class MasterTargetServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final MasterTargetServerResponse Empty = new MasterTargetServerResponse();

    /**
     * Agent expiry date.
     * 
     */
    @Import(name="agentExpiryDate")
      private final @Nullable String agentExpiryDate;

    public Optional<String> agentExpiryDate() {
        return this.agentExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.agentExpiryDate);
    }

    /**
     * The version of the scout component on the server.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> agentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * Agent version details.
     * 
     */
    @Import(name="agentVersionDetails")
      private final @Nullable VersionDetailsResponse agentVersionDetails;

    public Optional<VersionDetailsResponse> agentVersionDetails() {
        return this.agentVersionDetails == null ? Optional.empty() : Optional.ofNullable(this.agentVersionDetails);
    }

    /**
     * The list of data stores in the fabric.
     * 
     */
    @Import(name="dataStores")
      private final @Nullable List<DataStoreResponse> dataStores;

    public List<DataStoreResponse> dataStores() {
        return this.dataStores == null ? List.of() : this.dataStores;
    }

    /**
     * Disk count of the master target.
     * 
     */
    @Import(name="diskCount")
      private final @Nullable Integer diskCount;

    public Optional<Integer> diskCount() {
        return this.diskCount == null ? Optional.empty() : Optional.ofNullable(this.diskCount);
    }

    /**
     * Health errors.
     * 
     */
    @Import(name="healthErrors")
      private final @Nullable List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }

    /**
     * The server Id.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The IP address of the server.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The last heartbeat received from the server.
     * 
     */
    @Import(name="lastHeartbeat")
      private final @Nullable String lastHeartbeat;

    public Optional<String> lastHeartbeat() {
        return this.lastHeartbeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * MARS agent expiry date.
     * 
     */
    @Import(name="marsAgentExpiryDate")
      private final @Nullable String marsAgentExpiryDate;

    public Optional<String> marsAgentExpiryDate() {
        return this.marsAgentExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.marsAgentExpiryDate);
    }

    /**
     * MARS agent version.
     * 
     */
    @Import(name="marsAgentVersion")
      private final @Nullable String marsAgentVersion;

    public Optional<String> marsAgentVersion() {
        return this.marsAgentVersion == null ? Optional.empty() : Optional.ofNullable(this.marsAgentVersion);
    }

    /**
     * Mars agent version details.
     * 
     */
    @Import(name="marsAgentVersionDetails")
      private final @Nullable VersionDetailsResponse marsAgentVersionDetails;

    public Optional<VersionDetailsResponse> marsAgentVersionDetails() {
        return this.marsAgentVersionDetails == null ? Optional.empty() : Optional.ofNullable(this.marsAgentVersionDetails);
    }

    /**
     * The server name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The OS type of the server.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> osType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * OS Version of the master target.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable String osVersion;

    public Optional<String> osVersion() {
        return this.osVersion == null ? Optional.empty() : Optional.ofNullable(this.osVersion);
    }

    /**
     * The retention volumes of Master target Server.
     * 
     */
    @Import(name="retentionVolumes")
      private final @Nullable List<RetentionVolumeResponse> retentionVolumes;

    public List<RetentionVolumeResponse> retentionVolumes() {
        return this.retentionVolumes == null ? List.of() : this.retentionVolumes;
    }

    /**
     * Validation errors.
     * 
     */
    @Import(name="validationErrors")
      private final @Nullable List<HealthErrorResponse> validationErrors;

    public List<HealthErrorResponse> validationErrors() {
        return this.validationErrors == null ? List.of() : this.validationErrors;
    }

    /**
     * Version status
     * 
     */
    @Import(name="versionStatus")
      private final @Nullable String versionStatus;

    public Optional<String> versionStatus() {
        return this.versionStatus == null ? Optional.empty() : Optional.ofNullable(this.versionStatus);
    }

    public MasterTargetServerResponse(
        @Nullable String agentExpiryDate,
        @Nullable String agentVersion,
        @Nullable VersionDetailsResponse agentVersionDetails,
        @Nullable List<DataStoreResponse> dataStores,
        @Nullable Integer diskCount,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String id,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable String marsAgentExpiryDate,
        @Nullable String marsAgentVersion,
        @Nullable VersionDetailsResponse marsAgentVersionDetails,
        @Nullable String name,
        @Nullable String osType,
        @Nullable String osVersion,
        @Nullable List<RetentionVolumeResponse> retentionVolumes,
        @Nullable List<HealthErrorResponse> validationErrors,
        @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.dataStores = dataStores;
        this.diskCount = diskCount;
        this.healthErrors = healthErrors;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.marsAgentExpiryDate = marsAgentExpiryDate;
        this.marsAgentVersion = marsAgentVersion;
        this.marsAgentVersionDetails = marsAgentVersionDetails;
        this.name = name;
        this.osType = osType;
        this.osVersion = osVersion;
        this.retentionVolumes = retentionVolumes;
        this.validationErrors = validationErrors;
        this.versionStatus = versionStatus;
    }

    private MasterTargetServerResponse() {
        this.agentExpiryDate = null;
        this.agentVersion = null;
        this.agentVersionDetails = null;
        this.dataStores = List.of();
        this.diskCount = null;
        this.healthErrors = List.of();
        this.id = null;
        this.ipAddress = null;
        this.lastHeartbeat = null;
        this.marsAgentExpiryDate = null;
        this.marsAgentVersion = null;
        this.marsAgentVersionDetails = null;
        this.name = null;
        this.osType = null;
        this.osVersion = null;
        this.retentionVolumes = List.of();
        this.validationErrors = List.of();
        this.versionStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterTargetServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable List<DataStoreResponse> dataStores;
        private @Nullable Integer diskCount;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String marsAgentExpiryDate;
        private @Nullable String marsAgentVersion;
        private @Nullable VersionDetailsResponse marsAgentVersionDetails;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable List<RetentionVolumeResponse> retentionVolumes;
        private @Nullable List<HealthErrorResponse> validationErrors;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterTargetServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.dataStores = defaults.dataStores;
    	      this.diskCount = defaults.diskCount;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.marsAgentExpiryDate = defaults.marsAgentExpiryDate;
    	      this.marsAgentVersion = defaults.marsAgentVersion;
    	      this.marsAgentVersionDetails = defaults.marsAgentVersionDetails;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.retentionVolumes = defaults.retentionVolumes;
    	      this.validationErrors = defaults.validationErrors;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder agentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }
        public Builder dataStores(@Nullable List<DataStoreResponse> dataStores) {
            this.dataStores = dataStores;
            return this;
        }
        public Builder dataStores(DataStoreResponse... dataStores) {
            return dataStores(List.of(dataStores));
        }
        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Builder healthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public Builder marsAgentExpiryDate(@Nullable String marsAgentExpiryDate) {
            this.marsAgentExpiryDate = marsAgentExpiryDate;
            return this;
        }
        public Builder marsAgentVersion(@Nullable String marsAgentVersion) {
            this.marsAgentVersion = marsAgentVersion;
            return this;
        }
        public Builder marsAgentVersionDetails(@Nullable VersionDetailsResponse marsAgentVersionDetails) {
            this.marsAgentVersionDetails = marsAgentVersionDetails;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder retentionVolumes(@Nullable List<RetentionVolumeResponse> retentionVolumes) {
            this.retentionVolumes = retentionVolumes;
            return this;
        }
        public Builder retentionVolumes(RetentionVolumeResponse... retentionVolumes) {
            return retentionVolumes(List.of(retentionVolumes));
        }
        public Builder validationErrors(@Nullable List<HealthErrorResponse> validationErrors) {
            this.validationErrors = validationErrors;
            return this;
        }
        public Builder validationErrors(HealthErrorResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }
        public Builder versionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }        public MasterTargetServerResponse build() {
            return new MasterTargetServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, dataStores, diskCount, healthErrors, id, ipAddress, lastHeartbeat, marsAgentExpiryDate, marsAgentVersion, marsAgentVersionDetails, name, osType, osVersion, retentionVolumes, validationErrors, versionStatus);
        }
    }
}
