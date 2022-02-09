// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.VICredentialResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVCenterResult {
    private final String connectionStatus;
    private final @Nullable VICredentialResponse credentials;
    private final String customResourceName;
    private final @Nullable ExtendedLocationResponse extendedLocation;
    private final String fqdn;
    private final String id;
    private final String instanceUuid;
    private final @Nullable String kind;
    private final String location;
    private final String name;
    private final @Nullable Integer port;
    private final String provisioningState;
    private final List<ResourceStatusResponse> statuses;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String uuid;
    private final String version;

    @OutputCustomType.Constructor({"connectionStatus","credentials","customResourceName","extendedLocation","fqdn","id","instanceUuid","kind","location","name","port","provisioningState","statuses","systemData","tags","type","uuid","version"})
    private GetVCenterResult(
        String connectionStatus,
        @Nullable VICredentialResponse credentials,
        String customResourceName,
        @Nullable ExtendedLocationResponse extendedLocation,
        String fqdn,
        String id,
        String instanceUuid,
        @Nullable String kind,
        String location,
        String name,
        @Nullable Integer port,
        String provisioningState,
        List<ResourceStatusResponse> statuses,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        String uuid,
        String version) {
        this.connectionStatus = Objects.requireNonNull(connectionStatus);
        this.credentials = credentials;
        this.customResourceName = Objects.requireNonNull(customResourceName);
        this.extendedLocation = extendedLocation;
        this.fqdn = Objects.requireNonNull(fqdn);
        this.id = Objects.requireNonNull(id);
        this.instanceUuid = Objects.requireNonNull(instanceUuid);
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.port = port;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.statuses = Objects.requireNonNull(statuses);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uuid = Objects.requireNonNull(uuid);
        this.version = Objects.requireNonNull(version);
    }

    public String getConnectionStatus() {
        return this.connectionStatus;
    }
    public Optional<VICredentialResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    public String getFqdn() {
        return this.fqdn;
    }
    public String getId() {
        return this.id;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUuid() {
        return this.uuid;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVCenterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionStatus;
        private @Nullable VICredentialResponse credentials;
        private String customResourceName;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String fqdn;
        private String id;
        private String instanceUuid;
        private @Nullable String kind;
        private String location;
        private String name;
        private @Nullable Integer port;
        private String provisioningState;
        private List<ResourceStatusResponse> statuses;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uuid;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVCenterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.credentials = defaults.credentials;
    	      this.customResourceName = defaults.customResourceName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.instanceUuid = defaults.instanceUuid;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.provisioningState = defaults.provisioningState;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.version = defaults.version;
        }

        public Builder setConnectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }

        public Builder setCredentials(@Nullable VICredentialResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCustomResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceUuid(String instanceUuid) {
            this.instanceUuid = Objects.requireNonNull(instanceUuid);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetVCenterResult build() {
            return new GetVCenterResult(connectionStatus, credentials, customResourceName, extendedLocation, fqdn, id, instanceUuid, kind, location, name, port, provisioningState, statuses, systemData, tags, type, uuid, version);
        }
    }
}