// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MobilityServiceUpdateResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProcessServerResponse {
    /**
     * Agent expiry date.
     * 
     */
    private final @Nullable String agentExpiryDate;
    /**
     * The version of the scout component on the server.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * The agent version details.
     * 
     */
    private final @Nullable VersionDetailsResponse agentVersionDetails;
    /**
     * The available memory.
     * 
     */
    private final @Nullable Double availableMemoryInBytes;
    /**
     * The available space.
     * 
     */
    private final @Nullable Double availableSpaceInBytes;
    /**
     * The percentage of the CPU load.
     * 
     */
    private final @Nullable String cpuLoad;
    /**
     * The CPU load status.
     * 
     */
    private final @Nullable String cpuLoadStatus;
    /**
     * The Process Server's friendly name.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The health of Process Server.
     * 
     */
    private final String health;
    /**
     * Health errors.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrors;
    /**
     * The agent generated Id.
     * 
     */
    private final @Nullable String hostId;
    /**
     * The Process Server Id.
     * 
     */
    private final @Nullable String id;
    /**
     * The IP address of the server.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The last heartbeat received from the server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * The servers configured with this PS.
     * 
     */
    private final @Nullable String machineCount;
    /**
     * The MARS communication status.
     * 
     */
    private final String marsCommunicationStatus;
    /**
     * The MARS registration status.
     * 
     */
    private final String marsRegistrationStatus;
    /**
     * The memory usage status.
     * 
     */
    private final @Nullable String memoryUsageStatus;
    /**
     * The list of the mobility service updates available on the Process Server.
     * 
     */
    private final @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
    /**
     * The OS type of the server.
     * 
     */
    private final @Nullable String osType;
    /**
     * OS Version of the process server. Note: This will get populated if user has CS version greater than 9.12.0.0.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * The PS service status.
     * 
     */
    private final @Nullable String psServiceStatus;
    /**
     * The process server stats refresh time.
     * 
     */
    private final String psStatsRefreshTime;
    /**
     * The number of replication pairs configured in this PS.
     * 
     */
    private final @Nullable String replicationPairCount;
    /**
     * The space usage status.
     * 
     */
    private final @Nullable String spaceUsageStatus;
    /**
     * The PS SSL cert expiry date.
     * 
     */
    private final @Nullable String sslCertExpiryDate;
    /**
     * CS SSL cert expiry date.
     * 
     */
    private final @Nullable Integer sslCertExpiryRemainingDays;
    /**
     * The percentage of the system load.
     * 
     */
    private final @Nullable String systemLoad;
    /**
     * The system load status.
     * 
     */
    private final @Nullable String systemLoadStatus;
    /**
     * The throughput in bytes.
     * 
     */
    private final Double throughputInBytes;
    /**
     * The throughput in MBps.
     * 
     */
    private final Double throughputInMBps;
    /**
     * The throughput status.
     * 
     */
    private final String throughputStatus;
    /**
     * The uploading pending data in bytes.
     * 
     */
    private final Double throughputUploadPendingDataInBytes;
    /**
     * The total memory.
     * 
     */
    private final @Nullable Double totalMemoryInBytes;
    /**
     * The total space.
     * 
     */
    private final @Nullable Double totalSpaceInBytes;
    /**
     * Version status
     * 
     */
    private final @Nullable String versionStatus;

    @CustomType.Constructor
    private ProcessServerResponse(
        @CustomType.Parameter("agentExpiryDate") @Nullable String agentExpiryDate,
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("agentVersionDetails") @Nullable VersionDetailsResponse agentVersionDetails,
        @CustomType.Parameter("availableMemoryInBytes") @Nullable Double availableMemoryInBytes,
        @CustomType.Parameter("availableSpaceInBytes") @Nullable Double availableSpaceInBytes,
        @CustomType.Parameter("cpuLoad") @Nullable String cpuLoad,
        @CustomType.Parameter("cpuLoadStatus") @Nullable String cpuLoadStatus,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthErrors") @Nullable List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("hostId") @Nullable String hostId,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @CustomType.Parameter("machineCount") @Nullable String machineCount,
        @CustomType.Parameter("marsCommunicationStatus") String marsCommunicationStatus,
        @CustomType.Parameter("marsRegistrationStatus") String marsRegistrationStatus,
        @CustomType.Parameter("memoryUsageStatus") @Nullable String memoryUsageStatus,
        @CustomType.Parameter("mobilityServiceUpdates") @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("osVersion") @Nullable String osVersion,
        @CustomType.Parameter("psServiceStatus") @Nullable String psServiceStatus,
        @CustomType.Parameter("psStatsRefreshTime") String psStatsRefreshTime,
        @CustomType.Parameter("replicationPairCount") @Nullable String replicationPairCount,
        @CustomType.Parameter("spaceUsageStatus") @Nullable String spaceUsageStatus,
        @CustomType.Parameter("sslCertExpiryDate") @Nullable String sslCertExpiryDate,
        @CustomType.Parameter("sslCertExpiryRemainingDays") @Nullable Integer sslCertExpiryRemainingDays,
        @CustomType.Parameter("systemLoad") @Nullable String systemLoad,
        @CustomType.Parameter("systemLoadStatus") @Nullable String systemLoadStatus,
        @CustomType.Parameter("throughputInBytes") Double throughputInBytes,
        @CustomType.Parameter("throughputInMBps") Double throughputInMBps,
        @CustomType.Parameter("throughputStatus") String throughputStatus,
        @CustomType.Parameter("throughputUploadPendingDataInBytes") Double throughputUploadPendingDataInBytes,
        @CustomType.Parameter("totalMemoryInBytes") @Nullable Double totalMemoryInBytes,
        @CustomType.Parameter("totalSpaceInBytes") @Nullable Double totalSpaceInBytes,
        @CustomType.Parameter("versionStatus") @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.friendlyName = friendlyName;
        this.health = health;
        this.healthErrors = healthErrors;
        this.hostId = hostId;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.machineCount = machineCount;
        this.marsCommunicationStatus = marsCommunicationStatus;
        this.marsRegistrationStatus = marsRegistrationStatus;
        this.memoryUsageStatus = memoryUsageStatus;
        this.mobilityServiceUpdates = mobilityServiceUpdates;
        this.osType = osType;
        this.osVersion = osVersion;
        this.psServiceStatus = psServiceStatus;
        this.psStatsRefreshTime = psStatsRefreshTime;
        this.replicationPairCount = replicationPairCount;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.throughputInBytes = throughputInBytes;
        this.throughputInMBps = throughputInMBps;
        this.throughputStatus = throughputStatus;
        this.throughputUploadPendingDataInBytes = throughputUploadPendingDataInBytes;
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
    }

    /**
     * Agent expiry date.
     * 
    */
    public Optional<String> agentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    /**
     * The version of the scout component on the server.
     * 
    */
    public Optional<String> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * The agent version details.
     * 
    */
    public Optional<VersionDetailsResponse> agentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }
    /**
     * The available memory.
     * 
    */
    public Optional<Double> availableMemoryInBytes() {
        return Optional.ofNullable(this.availableMemoryInBytes);
    }
    /**
     * The available space.
     * 
    */
    public Optional<Double> availableSpaceInBytes() {
        return Optional.ofNullable(this.availableSpaceInBytes);
    }
    /**
     * The percentage of the CPU load.
     * 
    */
    public Optional<String> cpuLoad() {
        return Optional.ofNullable(this.cpuLoad);
    }
    /**
     * The CPU load status.
     * 
    */
    public Optional<String> cpuLoadStatus() {
        return Optional.ofNullable(this.cpuLoadStatus);
    }
    /**
     * The Process Server's friendly name.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The health of Process Server.
     * 
    */
    public String health() {
        return this.health;
    }
    /**
     * Health errors.
     * 
    */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    /**
     * The agent generated Id.
     * 
    */
    public Optional<String> hostId() {
        return Optional.ofNullable(this.hostId);
    }
    /**
     * The Process Server Id.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IP address of the server.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The last heartbeat received from the server.
     * 
    */
    public Optional<String> lastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * The servers configured with this PS.
     * 
    */
    public Optional<String> machineCount() {
        return Optional.ofNullable(this.machineCount);
    }
    /**
     * The MARS communication status.
     * 
    */
    public String marsCommunicationStatus() {
        return this.marsCommunicationStatus;
    }
    /**
     * The MARS registration status.
     * 
    */
    public String marsRegistrationStatus() {
        return this.marsRegistrationStatus;
    }
    /**
     * The memory usage status.
     * 
    */
    public Optional<String> memoryUsageStatus() {
        return Optional.ofNullable(this.memoryUsageStatus);
    }
    /**
     * The list of the mobility service updates available on the Process Server.
     * 
    */
    public List<MobilityServiceUpdateResponse> mobilityServiceUpdates() {
        return this.mobilityServiceUpdates == null ? List.of() : this.mobilityServiceUpdates;
    }
    /**
     * The OS type of the server.
     * 
    */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * OS Version of the process server. Note: This will get populated if user has CS version greater than 9.12.0.0.
     * 
    */
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * The PS service status.
     * 
    */
    public Optional<String> psServiceStatus() {
        return Optional.ofNullable(this.psServiceStatus);
    }
    /**
     * The process server stats refresh time.
     * 
    */
    public String psStatsRefreshTime() {
        return this.psStatsRefreshTime;
    }
    /**
     * The number of replication pairs configured in this PS.
     * 
    */
    public Optional<String> replicationPairCount() {
        return Optional.ofNullable(this.replicationPairCount);
    }
    /**
     * The space usage status.
     * 
    */
    public Optional<String> spaceUsageStatus() {
        return Optional.ofNullable(this.spaceUsageStatus);
    }
    /**
     * The PS SSL cert expiry date.
     * 
    */
    public Optional<String> sslCertExpiryDate() {
        return Optional.ofNullable(this.sslCertExpiryDate);
    }
    /**
     * CS SSL cert expiry date.
     * 
    */
    public Optional<Integer> sslCertExpiryRemainingDays() {
        return Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }
    /**
     * The percentage of the system load.
     * 
    */
    public Optional<String> systemLoad() {
        return Optional.ofNullable(this.systemLoad);
    }
    /**
     * The system load status.
     * 
    */
    public Optional<String> systemLoadStatus() {
        return Optional.ofNullable(this.systemLoadStatus);
    }
    /**
     * The throughput in bytes.
     * 
    */
    public Double throughputInBytes() {
        return this.throughputInBytes;
    }
    /**
     * The throughput in MBps.
     * 
    */
    public Double throughputInMBps() {
        return this.throughputInMBps;
    }
    /**
     * The throughput status.
     * 
    */
    public String throughputStatus() {
        return this.throughputStatus;
    }
    /**
     * The uploading pending data in bytes.
     * 
    */
    public Double throughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }
    /**
     * The total memory.
     * 
    */
    public Optional<Double> totalMemoryInBytes() {
        return Optional.ofNullable(this.totalMemoryInBytes);
    }
    /**
     * The total space.
     * 
    */
    public Optional<Double> totalSpaceInBytes() {
        return Optional.ofNullable(this.totalSpaceInBytes);
    }
    /**
     * Version status
     * 
    */
    public Optional<String> versionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String friendlyName;
        private String health;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String hostId;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String machineCount;
        private String marsCommunicationStatus;
        private String marsRegistrationStatus;
        private @Nullable String memoryUsageStatus;
        private @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable String psServiceStatus;
        private String psStatsRefreshTime;
        private @Nullable String replicationPairCount;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private Double throughputInBytes;
        private Double throughputInMBps;
        private String throughputStatus;
        private Double throughputUploadPendingDataInBytes;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.friendlyName = defaults.friendlyName;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.hostId = defaults.hostId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.machineCount = defaults.machineCount;
    	      this.marsCommunicationStatus = defaults.marsCommunicationStatus;
    	      this.marsRegistrationStatus = defaults.marsRegistrationStatus;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.mobilityServiceUpdates = defaults.mobilityServiceUpdates;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.psServiceStatus = defaults.psServiceStatus;
    	      this.psStatsRefreshTime = defaults.psStatsRefreshTime;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputInMBps = defaults.throughputInMBps;
    	      this.throughputStatus = defaults.throughputStatus;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
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
        public Builder availableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }
        public Builder availableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }
        public Builder cpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }
        public Builder cpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder hostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
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
        public Builder machineCount(@Nullable String machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Builder marsCommunicationStatus(String marsCommunicationStatus) {
            this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
            return this;
        }
        public Builder marsRegistrationStatus(String marsRegistrationStatus) {
            this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
            return this;
        }
        public Builder memoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }
        public Builder mobilityServiceUpdates(@Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates) {
            this.mobilityServiceUpdates = mobilityServiceUpdates;
            return this;
        }
        public Builder mobilityServiceUpdates(MobilityServiceUpdateResponse... mobilityServiceUpdates) {
            return mobilityServiceUpdates(List.of(mobilityServiceUpdates));
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder psServiceStatus(@Nullable String psServiceStatus) {
            this.psServiceStatus = psServiceStatus;
            return this;
        }
        public Builder psStatsRefreshTime(String psStatsRefreshTime) {
            this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
            return this;
        }
        public Builder replicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }
        public Builder spaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }
        public Builder sslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }
        public Builder sslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }
        public Builder systemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }
        public Builder systemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }
        public Builder throughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }
        public Builder throughputInMBps(Double throughputInMBps) {
            this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
            return this;
        }
        public Builder throughputStatus(String throughputStatus) {
            this.throughputStatus = Objects.requireNonNull(throughputStatus);
            return this;
        }
        public Builder throughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }
        public Builder totalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }
        public Builder totalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }
        public Builder versionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }        public ProcessServerResponse build() {
            return new ProcessServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, friendlyName, health, healthErrors, hostId, id, ipAddress, lastHeartbeat, machineCount, marsCommunicationStatus, marsRegistrationStatus, memoryUsageStatus, mobilityServiceUpdates, osType, osVersion, psServiceStatus, psStatsRefreshTime, replicationPairCount, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, throughputInBytes, throughputInMBps, throughputStatus, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, versionStatus);
        }
    }
}
