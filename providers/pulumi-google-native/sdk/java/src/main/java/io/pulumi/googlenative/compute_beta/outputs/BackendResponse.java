// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackendResponse {
    /**
     * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    private final String balancingMode;
    /**
     * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    private final Double capacityScaler;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    private final Boolean failover;
    /**
     * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    private final String group;
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    private final Integer maxConnections;
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    private final Integer maxConnectionsPerEndpoint;
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    private final Integer maxConnectionsPerInstance;
    /**
     * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    private final Integer maxRate;
    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    private final Double maxRatePerEndpoint;
    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    private final Double maxRatePerInstance;
    /**
     * Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    private final Double maxUtilization;

    @OutputCustomType.Constructor
    private BackendResponse(
        @OutputCustomType.Parameter("balancingMode") String balancingMode,
        @OutputCustomType.Parameter("capacityScaler") Double capacityScaler,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("failover") Boolean failover,
        @OutputCustomType.Parameter("group") String group,
        @OutputCustomType.Parameter("maxConnections") Integer maxConnections,
        @OutputCustomType.Parameter("maxConnectionsPerEndpoint") Integer maxConnectionsPerEndpoint,
        @OutputCustomType.Parameter("maxConnectionsPerInstance") Integer maxConnectionsPerInstance,
        @OutputCustomType.Parameter("maxRate") Integer maxRate,
        @OutputCustomType.Parameter("maxRatePerEndpoint") Double maxRatePerEndpoint,
        @OutputCustomType.Parameter("maxRatePerInstance") Double maxRatePerInstance,
        @OutputCustomType.Parameter("maxUtilization") Double maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.failover = failover;
        this.group = group;
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    /**
     * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
    */
    public String getBalancingMode() {
        return this.balancingMode;
    }
    /**
     * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
    */
    public Double getCapacityScaler() {
        return this.capacityScaler;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
    */
    public Boolean getFailover() {
        return this.failover;
    }
    /**
     * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
    */
    public String getGroup() {
        return this.group;
    }
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
    */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
    */
    public Integer getMaxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint;
    }
    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
    */
    public Integer getMaxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance;
    }
    /**
     * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
    */
    public Integer getMaxRate() {
        return this.maxRate;
    }
    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
    */
    public Double getMaxRatePerEndpoint() {
        return this.maxRatePerEndpoint;
    }
    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
    */
    public Double getMaxRatePerInstance() {
        return this.maxRatePerInstance;
    }
    /**
     * Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
    */
    public Double getMaxUtilization() {
        return this.maxUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String balancingMode;
        private Double capacityScaler;
        private String description;
        private Boolean failover;
        private String group;
        private Integer maxConnections;
        private Integer maxConnectionsPerEndpoint;
        private Integer maxConnectionsPerInstance;
        private Integer maxRate;
        private Double maxRatePerEndpoint;
        private Double maxRatePerInstance;
        private Double maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
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

        public Builder setBalancingMode(String balancingMode) {
            this.balancingMode = Objects.requireNonNull(balancingMode);
            return this;
        }

        public Builder setCapacityScaler(Double capacityScaler) {
            this.capacityScaler = Objects.requireNonNull(capacityScaler);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFailover(Boolean failover) {
            this.failover = Objects.requireNonNull(failover);
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxConnectionsPerEndpoint(Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Objects.requireNonNull(maxConnectionsPerEndpoint);
            return this;
        }

        public Builder setMaxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Objects.requireNonNull(maxConnectionsPerInstance);
            return this;
        }

        public Builder setMaxRate(Integer maxRate) {
            this.maxRate = Objects.requireNonNull(maxRate);
            return this;
        }

        public Builder setMaxRatePerEndpoint(Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Objects.requireNonNull(maxRatePerEndpoint);
            return this;
        }

        public Builder setMaxRatePerInstance(Double maxRatePerInstance) {
            this.maxRatePerInstance = Objects.requireNonNull(maxRatePerInstance);
            return this;
        }

        public Builder setMaxUtilization(Double maxUtilization) {
            this.maxUtilization = Objects.requireNonNull(maxUtilization);
            return this;
        }
        public BackendResponse build() {
            return new BackendResponse(balancingMode, capacityScaler, description, failover, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
