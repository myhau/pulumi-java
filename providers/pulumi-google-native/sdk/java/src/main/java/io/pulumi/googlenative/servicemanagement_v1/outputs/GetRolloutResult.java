// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.DeleteServiceStrategyResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.TrafficPercentStrategyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRolloutResult {
    /**
     * Creation time of the rollout. Readonly.
     * 
     */
    private final String createTime;
    /**
     * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    private final DeleteServiceStrategyResponse deleteServiceStrategy;
    /**
     * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where "date" is the create date in ISO 8601 format. "revision number" is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is '2016-02-16r1'
     * 
     */
    private final String rolloutId;
    /**
     * The name of the service associated with this Rollout.
     * 
     */
    private final String serviceName;
    /**
     * The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    private final String status;
    /**
     * Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    private final TrafficPercentStrategyResponse trafficPercentStrategy;

    @OutputCustomType.Constructor
    private GetRolloutResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("deleteServiceStrategy") DeleteServiceStrategyResponse deleteServiceStrategy,
        @OutputCustomType.Parameter("rolloutId") String rolloutId,
        @OutputCustomType.Parameter("serviceName") String serviceName,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("trafficPercentStrategy") TrafficPercentStrategyResponse trafficPercentStrategy) {
        this.createTime = createTime;
        this.deleteServiceStrategy = deleteServiceStrategy;
        this.rolloutId = rolloutId;
        this.serviceName = serviceName;
        this.status = status;
        this.trafficPercentStrategy = trafficPercentStrategy;
    }

    /**
     * Creation time of the rollout. Readonly.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
    */
    public DeleteServiceStrategyResponse getDeleteServiceStrategy() {
        return this.deleteServiceStrategy;
    }
    /**
     * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where "date" is the create date in ISO 8601 format. "revision number" is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is '2016-02-16r1'
     * 
    */
    public String getRolloutId() {
        return this.rolloutId;
    }
    /**
     * The name of the service associated with this Rollout.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Google Service Control selects service configurations based on traffic percentage.
     * 
    */
    public TrafficPercentStrategyResponse getTrafficPercentStrategy() {
        return this.trafficPercentStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolloutResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DeleteServiceStrategyResponse deleteServiceStrategy;
        private String rolloutId;
        private String serviceName;
        private String status;
        private TrafficPercentStrategyResponse trafficPercentStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteServiceStrategy = defaults.deleteServiceStrategy;
    	      this.rolloutId = defaults.rolloutId;
    	      this.serviceName = defaults.serviceName;
    	      this.status = defaults.status;
    	      this.trafficPercentStrategy = defaults.trafficPercentStrategy;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeleteServiceStrategy(DeleteServiceStrategyResponse deleteServiceStrategy) {
            this.deleteServiceStrategy = Objects.requireNonNull(deleteServiceStrategy);
            return this;
        }

        public Builder setRolloutId(String rolloutId) {
            this.rolloutId = Objects.requireNonNull(rolloutId);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTrafficPercentStrategy(TrafficPercentStrategyResponse trafficPercentStrategy) {
            this.trafficPercentStrategy = Objects.requireNonNull(trafficPercentStrategy);
            return this;
        }
        public GetRolloutResult build() {
            return new GetRolloutResult(createTime, deleteServiceStrategy, rolloutId, serviceName, status, trafficPercentStrategy);
        }
    }
}
