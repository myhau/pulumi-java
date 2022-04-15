// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHybridRunbookWorkerResult {
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets the assigned machine IP address.
     * 
     */
    private final @Nullable String ip;
    /**
     * Last Heartbeat from the Worker
     * 
     */
    private final @Nullable String lastSeenDateTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the registration time of the worker machine.
     * 
     */
    private final @Nullable String registeredDateTime;
    /**
     * Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
     */
    private final @Nullable String vmResourceId;
    /**
     * Name of the HybridWorker.
     * 
     */
    private final @Nullable String workerName;
    /**
     * Type of the HybridWorker.
     * 
     */
    private final @Nullable String workerType;

    @CustomType.Constructor
    private GetHybridRunbookWorkerResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ip") @Nullable String ip,
        @CustomType.Parameter("lastSeenDateTime") @Nullable String lastSeenDateTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("registeredDateTime") @Nullable String registeredDateTime,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vmResourceId") @Nullable String vmResourceId,
        @CustomType.Parameter("workerName") @Nullable String workerName,
        @CustomType.Parameter("workerType") @Nullable String workerType) {
        this.id = id;
        this.ip = ip;
        this.lastSeenDateTime = lastSeenDateTime;
        this.name = name;
        this.registeredDateTime = registeredDateTime;
        this.systemData = systemData;
        this.type = type;
        this.vmResourceId = vmResourceId;
        this.workerName = workerName;
        this.workerType = workerType;
    }

    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Gets or sets the assigned machine IP address.
     * 
    */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * Last Heartbeat from the Worker
     * 
    */
    public Optional<String> lastSeenDateTime() {
        return Optional.ofNullable(this.lastSeenDateTime);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Gets or sets the registration time of the worker machine.
     * 
    */
    public Optional<String> registeredDateTime() {
        return Optional.ofNullable(this.registeredDateTime);
    }
    /**
     * Resource system metadata.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
    */
    public Optional<String> vmResourceId() {
        return Optional.ofNullable(this.vmResourceId);
    }
    /**
     * Name of the HybridWorker.
     * 
    */
    public Optional<String> workerName() {
        return Optional.ofNullable(this.workerName);
    }
    /**
     * Type of the HybridWorker.
     * 
    */
    public Optional<String> workerType() {
        return Optional.ofNullable(this.workerType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String ip;
        private @Nullable String lastSeenDateTime;
        private String name;
        private @Nullable String registeredDateTime;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String vmResourceId;
        private @Nullable String workerName;
        private @Nullable String workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.lastSeenDateTime = defaults.lastSeenDateTime;
    	      this.name = defaults.name;
    	      this.registeredDateTime = defaults.registeredDateTime;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.vmResourceId = defaults.vmResourceId;
    	      this.workerName = defaults.workerName;
    	      this.workerType = defaults.workerType;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder lastSeenDateTime(@Nullable String lastSeenDateTime) {
            this.lastSeenDateTime = lastSeenDateTime;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder registeredDateTime(@Nullable String registeredDateTime) {
            this.registeredDateTime = registeredDateTime;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }
        public Builder workerName(@Nullable String workerName) {
            this.workerName = workerName;
            return this;
        }
        public Builder workerType(@Nullable String workerType) {
            this.workerType = workerType;
            return this;
        }        public GetHybridRunbookWorkerResult build() {
            return new GetHybridRunbookWorkerResult(id, ip, lastSeenDateTime, name, registeredDateTime, systemData, type, vmResourceId, workerName, workerType);
        }
    }
}
