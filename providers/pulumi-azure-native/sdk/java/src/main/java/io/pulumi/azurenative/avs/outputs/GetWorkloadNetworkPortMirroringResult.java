// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkPortMirroringResult {
    /**
     * Destination VM Group.
     * 
     */
    private final @Nullable String destination;
    /**
     * Direction of port mirroring profile.
     * 
     */
    private final @Nullable String direction;
    /**
     * Display name of the port mirroring profile.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * Source VM Group.
     * 
     */
    private final @Nullable String source;
    /**
     * Port Mirroring Status.
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"destination","direction","displayName","id","name","provisioningState","revision","source","status","type"})
    private GetWorkloadNetworkPortMirroringResult(
        @Nullable String destination,
        @Nullable String direction,
        @Nullable String displayName,
        String id,
        String name,
        String provisioningState,
        @Nullable Double revision,
        @Nullable String source,
        String status,
        String type) {
        this.destination = destination;
        this.direction = direction;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.source = source;
        this.status = status;
        this.type = type;
    }

    /**
     * Destination VM Group.
     * 
    */
    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * Direction of port mirroring profile.
     * 
    */
    public Optional<String> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * Display name of the port mirroring profile.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
    */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * Source VM Group.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * Port Mirroring Status.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkPortMirroringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable String direction;
        private @Nullable String displayName;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private @Nullable String source;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkPortMirroringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRevision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkPortMirroringResult build() {
            return new GetWorkloadNetworkPortMirroringResult(destination, direction, displayName, id, name, provisioningState, revision, source, status, type);
        }
    }
}
