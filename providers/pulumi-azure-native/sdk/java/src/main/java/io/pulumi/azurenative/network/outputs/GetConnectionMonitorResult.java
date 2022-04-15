// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorDestinationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorOutputResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorSourceResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorTestConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorTestGroupResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionMonitorResult {
    /**
     * Determines if the connection monitor will start automatically once created.
     * 
     */
    private final @Nullable Boolean autoStart;
    /**
     * Type of connection monitor.
     * 
     */
    private final String connectionMonitorType;
    /**
     * Describes the destination of connection monitor.
     * 
     */
    private final @Nullable ConnectionMonitorDestinationResponse destination;
    /**
     * List of connection monitor endpoints.
     * 
     */
    private final @Nullable List<ConnectionMonitorEndpointResponse> endpoints;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * ID of the connection monitor.
     * 
     */
    private final String id;
    /**
     * Connection monitor location.
     * 
     */
    private final @Nullable String location;
    /**
     * Monitoring interval in seconds.
     * 
     */
    private final @Nullable Integer monitoringIntervalInSeconds;
    /**
     * The monitoring status of the connection monitor.
     * 
     */
    private final String monitoringStatus;
    /**
     * Name of the connection monitor.
     * 
     */
    private final String name;
    /**
     * Optional notes to be associated with the connection monitor.
     * 
     */
    private final @Nullable String notes;
    /**
     * List of connection monitor outputs.
     * 
     */
    private final @Nullable List<ConnectionMonitorOutputResponse> outputs;
    /**
     * The provisioning state of the connection monitor.
     * 
     */
    private final String provisioningState;
    /**
     * Describes the source of connection monitor.
     * 
     */
    private final @Nullable ConnectionMonitorSourceResponse source;
    /**
     * The date and time when the connection monitor was started.
     * 
     */
    private final String startTime;
    /**
     * Connection monitor tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * List of connection monitor test configurations.
     * 
     */
    private final @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations;
    /**
     * List of connection monitor test groups.
     * 
     */
    private final @Nullable List<ConnectionMonitorTestGroupResponse> testGroups;
    /**
     * Connection monitor type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetConnectionMonitorResult(
        @CustomType.Parameter("autoStart") @Nullable Boolean autoStart,
        @CustomType.Parameter("connectionMonitorType") String connectionMonitorType,
        @CustomType.Parameter("destination") @Nullable ConnectionMonitorDestinationResponse destination,
        @CustomType.Parameter("endpoints") @Nullable List<ConnectionMonitorEndpointResponse> endpoints,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("monitoringIntervalInSeconds") @Nullable Integer monitoringIntervalInSeconds,
        @CustomType.Parameter("monitoringStatus") String monitoringStatus,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notes") @Nullable String notes,
        @CustomType.Parameter("outputs") @Nullable List<ConnectionMonitorOutputResponse> outputs,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") @Nullable ConnectionMonitorSourceResponse source,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("testConfigurations") @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations,
        @CustomType.Parameter("testGroups") @Nullable List<ConnectionMonitorTestGroupResponse> testGroups,
        @CustomType.Parameter("type") String type) {
        this.autoStart = autoStart;
        this.connectionMonitorType = connectionMonitorType;
        this.destination = destination;
        this.endpoints = endpoints;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        this.monitoringStatus = monitoringStatus;
        this.name = name;
        this.notes = notes;
        this.outputs = outputs;
        this.provisioningState = provisioningState;
        this.source = source;
        this.startTime = startTime;
        this.tags = tags;
        this.testConfigurations = testConfigurations;
        this.testGroups = testGroups;
        this.type = type;
    }

    /**
     * Determines if the connection monitor will start automatically once created.
     * 
    */
    public Optional<Boolean> autoStart() {
        return Optional.ofNullable(this.autoStart);
    }
    /**
     * Type of connection monitor.
     * 
    */
    public String connectionMonitorType() {
        return this.connectionMonitorType;
    }
    /**
     * Describes the destination of connection monitor.
     * 
    */
    public Optional<ConnectionMonitorDestinationResponse> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * List of connection monitor endpoints.
     * 
    */
    public List<ConnectionMonitorEndpointResponse> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * ID of the connection monitor.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Connection monitor location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Monitoring interval in seconds.
     * 
    */
    public Optional<Integer> monitoringIntervalInSeconds() {
        return Optional.ofNullable(this.monitoringIntervalInSeconds);
    }
    /**
     * The monitoring status of the connection monitor.
     * 
    */
    public String monitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * Name of the connection monitor.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional notes to be associated with the connection monitor.
     * 
    */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * List of connection monitor outputs.
     * 
    */
    public List<ConnectionMonitorOutputResponse> outputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * The provisioning state of the connection monitor.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the source of connection monitor.
     * 
    */
    public Optional<ConnectionMonitorSourceResponse> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The date and time when the connection monitor was started.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * Connection monitor tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * List of connection monitor test configurations.
     * 
    */
    public List<ConnectionMonitorTestConfigurationResponse> testConfigurations() {
        return this.testConfigurations == null ? List.of() : this.testConfigurations;
    }
    /**
     * List of connection monitor test groups.
     * 
    */
    public List<ConnectionMonitorTestGroupResponse> testGroups() {
        return this.testGroups == null ? List.of() : this.testGroups;
    }
    /**
     * Connection monitor type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoStart;
        private String connectionMonitorType;
        private @Nullable ConnectionMonitorDestinationResponse destination;
        private @Nullable List<ConnectionMonitorEndpointResponse> endpoints;
        private String etag;
        private String id;
        private @Nullable String location;
        private @Nullable Integer monitoringIntervalInSeconds;
        private String monitoringStatus;
        private String name;
        private @Nullable String notes;
        private @Nullable List<ConnectionMonitorOutputResponse> outputs;
        private String provisioningState;
        private @Nullable ConnectionMonitorSourceResponse source;
        private String startTime;
        private @Nullable Map<String,String> tags;
        private @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations;
        private @Nullable List<ConnectionMonitorTestGroupResponse> testGroups;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoStart = defaults.autoStart;
    	      this.connectionMonitorType = defaults.connectionMonitorType;
    	      this.destination = defaults.destination;
    	      this.endpoints = defaults.endpoints;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monitoringIntervalInSeconds = defaults.monitoringIntervalInSeconds;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.outputs = defaults.outputs;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.tags = defaults.tags;
    	      this.testConfigurations = defaults.testConfigurations;
    	      this.testGroups = defaults.testGroups;
    	      this.type = defaults.type;
        }

        public Builder autoStart(@Nullable Boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public Builder connectionMonitorType(String connectionMonitorType) {
            this.connectionMonitorType = Objects.requireNonNull(connectionMonitorType);
            return this;
        }
        public Builder destination(@Nullable ConnectionMonitorDestinationResponse destination) {
            this.destination = destination;
            return this;
        }
        public Builder endpoints(@Nullable List<ConnectionMonitorEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(ConnectionMonitorEndpointResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder monitoringIntervalInSeconds(@Nullable Integer monitoringIntervalInSeconds) {
            this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
            return this;
        }
        public Builder monitoringStatus(String monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }
        public Builder outputs(@Nullable List<ConnectionMonitorOutputResponse> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(ConnectionMonitorOutputResponse... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder source(@Nullable ConnectionMonitorSourceResponse source) {
            this.source = source;
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder testConfigurations(@Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations) {
            this.testConfigurations = testConfigurations;
            return this;
        }
        public Builder testConfigurations(ConnectionMonitorTestConfigurationResponse... testConfigurations) {
            return testConfigurations(List.of(testConfigurations));
        }
        public Builder testGroups(@Nullable List<ConnectionMonitorTestGroupResponse> testGroups) {
            this.testGroups = testGroups;
            return this;
        }
        public Builder testGroups(ConnectionMonitorTestGroupResponse... testGroups) {
            return testGroups(List.of(testGroups));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetConnectionMonitorResult build() {
            return new GetConnectionMonitorResult(autoStart, connectionMonitorType, destination, endpoints, etag, id, location, monitoringIntervalInSeconds, monitoringStatus, name, notes, outputs, provisioningState, source, startTime, tags, testConfigurations, testGroups, type);
        }
    }
}
