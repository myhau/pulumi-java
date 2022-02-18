// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceBackendGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceBackendGetArgs Empty = new RegionBackendServiceBackendGetArgs();

    /**
     * Specifies the balancing mode for this backend.
     * Default value is `CONNECTION`.
     * Possible values are `UTILIZATION`, `RATE`, and `CONNECTION`.
     * 
     */
    @InputImport(name="balancingMode")
    private final @Nullable Input<String> balancingMode;

    public Input<String> getBalancingMode() {
        return this.balancingMode == null ? Input.empty() : this.balancingMode;
    }

    /**
     * A multiplier applied to the group's maximum servicing capacity
     * (based on UTILIZATION, RATE or CONNECTION).
     * ~>**NOTE**: This field cannot be set for
     * INTERNAL region backend services (default loadBalancingScheme),
     * but is required for non-INTERNAL backend service. The total
     * capacity_scaler for all backends must be non-zero.
     * A setting of 0 means the group is completely drained, offering
     * 0% of its available Capacity. Valid range is [0.0,1.0].
     * 
     */
    @InputImport(name="capacityScaler")
    private final @Nullable Input<Double> capacityScaler;

    public Input<Double> getCapacityScaler() {
        return this.capacityScaler == null ? Input.empty() : this.capacityScaler;
    }

    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * This field designates whether this is a failover backend. More
     * than one failover backend can be configured for a given RegionBackendService.
     * 
     */
    @InputImport(name="failover")
    private final @Nullable Input<Boolean> failover;

    public Input<Boolean> getFailover() {
        return this.failover == null ? Input.empty() : this.failover;
    }

    /**
     * The fully-qualified URL of an Instance Group or Network Endpoint
     * Group resource. In case of instance group this defines the list
     * of instances that serve traffic. Member virtual machine
     * instances from each instance group must live in the same zone as
     * the instance group itself. No two backends in a backend service
     * are allowed to use same Instance Group resource.
     * For Network Endpoint Groups this defines list of endpoints. All
     * endpoints of Network Endpoint Group must be hosted on instances
     * located in the same zone as the Network Endpoint Group.
     * Backend services cannot mix Instance Group and
     * Network Endpoint Group backends.
     * When the `load_balancing_scheme` is INTERNAL, only instance groups
     * are supported.
     * Note that you must specify an Instance Group or Network Endpoint
     * Group resource using the fully-qualified URL, rather than a
     * partial URL.
     * 
     */
    @InputImport(name="group", required=true)
    private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @InputImport(name="maxConnections")
    private final @Nullable Input<Integer> maxConnections;

    public Input<Integer> getMaxConnections() {
        return this.maxConnections == null ? Input.empty() : this.maxConnections;
    }

    /**
     * The max number of simultaneous connections that a single backend
     * network endpoint can handle. Cannot be set
     * for INTERNAL backend services.
     * This is used to calculate the capacity of the group. Can be
     * used in either CONNECTION or UTILIZATION balancing modes. For
     * CONNECTION mode, either maxConnections or
     * maxConnectionsPerEndpoint must be set.
     * 
     */
    @InputImport(name="maxConnectionsPerEndpoint")
    private final @Nullable Input<Integer> maxConnectionsPerEndpoint;

    public Input<Integer> getMaxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint == null ? Input.empty() : this.maxConnectionsPerEndpoint;
    }

    /**
     * The max number of simultaneous connections that a single
     * backend instance can handle. Cannot be set for INTERNAL backend
     * services.
     * This is used to calculate the capacity of the group.
     * Can be used in either CONNECTION or UTILIZATION balancing modes.
     * For CONNECTION mode, either maxConnections or
     * maxConnectionsPerInstance must be set.
     * 
     */
    @InputImport(name="maxConnectionsPerInstance")
    private final @Nullable Input<Integer> maxConnectionsPerInstance;

    public Input<Integer> getMaxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance == null ? Input.empty() : this.maxConnectionsPerInstance;
    }

    /**
     * The max requests per second (RPS) of the group. Cannot be set
     * for INTERNAL backend services.
     * Can be used with either RATE or UTILIZATION balancing modes,
     * but required if RATE mode. Either maxRate or one
     * of maxRatePerInstance or maxRatePerEndpoint, as appropriate for
     * group type, must be set.
     * 
     */
    @InputImport(name="maxRate")
    private final @Nullable Input<Integer> maxRate;

    public Input<Integer> getMaxRate() {
        return this.maxRate == null ? Input.empty() : this.maxRate;
    }

    /**
     * The max requests per second (RPS) that a single backend network
     * endpoint can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerEndpoint must be set. Cannot be set
     * for INTERNAL backend services.
     * 
     */
    @InputImport(name="maxRatePerEndpoint")
    private final @Nullable Input<Double> maxRatePerEndpoint;

    public Input<Double> getMaxRatePerEndpoint() {
        return this.maxRatePerEndpoint == null ? Input.empty() : this.maxRatePerEndpoint;
    }

    /**
     * The max requests per second (RPS) that a single backend
     * instance can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerInstance must be set. Cannot be set
     * for INTERNAL backend services.
     * 
     */
    @InputImport(name="maxRatePerInstance")
    private final @Nullable Input<Double> maxRatePerInstance;

    public Input<Double> getMaxRatePerInstance() {
        return this.maxRatePerInstance == null ? Input.empty() : this.maxRatePerInstance;
    }

    /**
     * Used when balancingMode is UTILIZATION. This ratio defines the
     * CPU utilization target for the group. Valid range is [0.0, 1.0].
     * Cannot be set for INTERNAL backend services.
     * 
     */
    @InputImport(name="maxUtilization")
    private final @Nullable Input<Double> maxUtilization;

    public Input<Double> getMaxUtilization() {
        return this.maxUtilization == null ? Input.empty() : this.maxUtilization;
    }

    public RegionBackendServiceBackendGetArgs(
        @Nullable Input<String> balancingMode,
        @Nullable Input<Double> capacityScaler,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> failover,
        Input<String> group,
        @Nullable Input<Integer> maxConnections,
        @Nullable Input<Integer> maxConnectionsPerEndpoint,
        @Nullable Input<Integer> maxConnectionsPerInstance,
        @Nullable Input<Integer> maxRate,
        @Nullable Input<Double> maxRatePerEndpoint,
        @Nullable Input<Double> maxRatePerInstance,
        @Nullable Input<Double> maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.failover = failover;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    private RegionBackendServiceBackendGetArgs() {
        this.balancingMode = Input.empty();
        this.capacityScaler = Input.empty();
        this.description = Input.empty();
        this.failover = Input.empty();
        this.group = Input.empty();
        this.maxConnections = Input.empty();
        this.maxConnectionsPerEndpoint = Input.empty();
        this.maxConnectionsPerInstance = Input.empty();
        this.maxRate = Input.empty();
        this.maxRatePerEndpoint = Input.empty();
        this.maxRatePerInstance = Input.empty();
        this.maxUtilization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceBackendGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> balancingMode;
        private @Nullable Input<Double> capacityScaler;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> failover;
        private Input<String> group;
        private @Nullable Input<Integer> maxConnections;
        private @Nullable Input<Integer> maxConnectionsPerEndpoint;
        private @Nullable Input<Integer> maxConnectionsPerInstance;
        private @Nullable Input<Integer> maxRate;
        private @Nullable Input<Double> maxRatePerEndpoint;
        private @Nullable Input<Double> maxRatePerInstance;
        private @Nullable Input<Double> maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceBackendGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.failover = defaults.failover;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder setBalancingMode(@Nullable Input<String> balancingMode) {
            this.balancingMode = balancingMode;
            return this;
        }

        public Builder setBalancingMode(@Nullable String balancingMode) {
            this.balancingMode = Input.ofNullable(balancingMode);
            return this;
        }

        public Builder setCapacityScaler(@Nullable Input<Double> capacityScaler) {
            this.capacityScaler = capacityScaler;
            return this;
        }

        public Builder setCapacityScaler(@Nullable Double capacityScaler) {
            this.capacityScaler = Input.ofNullable(capacityScaler);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFailover(@Nullable Input<Boolean> failover) {
            this.failover = failover;
            return this;
        }

        public Builder setFailover(@Nullable Boolean failover) {
            this.failover = Input.ofNullable(failover);
            return this;
        }

        public Builder setGroup(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Input.of(Objects.requireNonNull(group));
            return this;
        }

        public Builder setMaxConnections(@Nullable Input<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setMaxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Input.ofNullable(maxConnections);
            return this;
        }

        public Builder setMaxConnectionsPerEndpoint(@Nullable Input<Integer> maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
            return this;
        }

        public Builder setMaxConnectionsPerEndpoint(@Nullable Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Input.ofNullable(maxConnectionsPerEndpoint);
            return this;
        }

        public Builder setMaxConnectionsPerInstance(@Nullable Input<Integer> maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = maxConnectionsPerInstance;
            return this;
        }

        public Builder setMaxConnectionsPerInstance(@Nullable Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Input.ofNullable(maxConnectionsPerInstance);
            return this;
        }

        public Builder setMaxRate(@Nullable Input<Integer> maxRate) {
            this.maxRate = maxRate;
            return this;
        }

        public Builder setMaxRate(@Nullable Integer maxRate) {
            this.maxRate = Input.ofNullable(maxRate);
            return this;
        }

        public Builder setMaxRatePerEndpoint(@Nullable Input<Double> maxRatePerEndpoint) {
            this.maxRatePerEndpoint = maxRatePerEndpoint;
            return this;
        }

        public Builder setMaxRatePerEndpoint(@Nullable Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Input.ofNullable(maxRatePerEndpoint);
            return this;
        }

        public Builder setMaxRatePerInstance(@Nullable Input<Double> maxRatePerInstance) {
            this.maxRatePerInstance = maxRatePerInstance;
            return this;
        }

        public Builder setMaxRatePerInstance(@Nullable Double maxRatePerInstance) {
            this.maxRatePerInstance = Input.ofNullable(maxRatePerInstance);
            return this;
        }

        public Builder setMaxUtilization(@Nullable Input<Double> maxUtilization) {
            this.maxUtilization = maxUtilization;
            return this;
        }

        public Builder setMaxUtilization(@Nullable Double maxUtilization) {
            this.maxUtilization = Input.ofNullable(maxUtilization);
            return this;
        }

        public RegionBackendServiceBackendGetArgs build() {
            return new RegionBackendServiceBackendGetArgs(balancingMode, capacityScaler, description, failover, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
