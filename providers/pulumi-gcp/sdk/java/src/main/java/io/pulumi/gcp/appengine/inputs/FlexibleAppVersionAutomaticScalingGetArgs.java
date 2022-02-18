// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionAutomaticScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionAutomaticScalingGetArgs Empty = new FlexibleAppVersionAutomaticScalingGetArgs();

    /**
     * The time period that the Autoscaler should wait before it starts collecting information from a new instance.
     * This prevents the autoscaler from collecting information when the instance is initializing,
     * during which the collected usage would not be reliable. Default: 120s
     * 
     */
    @InputImport(name="coolDownPeriod")
    private final @Nullable Input<String> coolDownPeriod;

    public Input<String> getCoolDownPeriod() {
        return this.coolDownPeriod == null ? Input.empty() : this.coolDownPeriod;
    }

    /**
     * Target scaling by CPU usage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cpuUtilization", required=true)
    private final Input<FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs> cpuUtilization;

    public Input<FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs> getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Target scaling by disk usage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="diskUtilization")
    private final @Nullable Input<FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs> diskUtilization;

    public Input<FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs> getDiskUtilization() {
        return this.diskUtilization == null ? Input.empty() : this.diskUtilization;
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.
     * Defaults to a runtime-specific value.
     * 
     */
    @InputImport(name="maxConcurrentRequests")
    private final @Nullable Input<Integer> maxConcurrentRequests;

    public Input<Integer> getMaxConcurrentRequests() {
        return this.maxConcurrentRequests == null ? Input.empty() : this.maxConcurrentRequests;
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @InputImport(name="maxIdleInstances")
    private final @Nullable Input<Integer> maxIdleInstances;

    public Input<Integer> getMaxIdleInstances() {
        return this.maxIdleInstances == null ? Input.empty() : this.maxIdleInstances;
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="maxPendingLatency")
    private final @Nullable Input<String> maxPendingLatency;

    public Input<String> getMaxPendingLatency() {
        return this.maxPendingLatency == null ? Input.empty() : this.maxPendingLatency;
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version. Default: 20
     * 
     */
    @InputImport(name="maxTotalInstances")
    private final @Nullable Input<Integer> maxTotalInstances;

    public Input<Integer> getMaxTotalInstances() {
        return this.maxTotalInstances == null ? Input.empty() : this.maxTotalInstances;
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @InputImport(name="minIdleInstances")
    private final @Nullable Input<Integer> minIdleInstances;

    public Input<Integer> getMinIdleInstances() {
        return this.minIdleInstances == null ? Input.empty() : this.minIdleInstances;
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="minPendingLatency")
    private final @Nullable Input<String> minPendingLatency;

    public Input<String> getMinPendingLatency() {
        return this.minPendingLatency == null ? Input.empty() : this.minPendingLatency;
    }

    /**
     * Minimum number of running instances that should be maintained for this version. Default: 2
     * 
     */
    @InputImport(name="minTotalInstances")
    private final @Nullable Input<Integer> minTotalInstances;

    public Input<Integer> getMinTotalInstances() {
        return this.minTotalInstances == null ? Input.empty() : this.minTotalInstances;
    }

    /**
     * Target scaling by network usage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="networkUtilization")
    private final @Nullable Input<FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs> networkUtilization;

    public Input<FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs> getNetworkUtilization() {
        return this.networkUtilization == null ? Input.empty() : this.networkUtilization;
    }

    /**
     * Target scaling by request utilization.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestUtilization")
    private final @Nullable Input<FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs> requestUtilization;

    public Input<FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs> getRequestUtilization() {
        return this.requestUtilization == null ? Input.empty() : this.requestUtilization;
    }

    public FlexibleAppVersionAutomaticScalingGetArgs(
        @Nullable Input<String> coolDownPeriod,
        Input<FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs> cpuUtilization,
        @Nullable Input<FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs> diskUtilization,
        @Nullable Input<Integer> maxConcurrentRequests,
        @Nullable Input<Integer> maxIdleInstances,
        @Nullable Input<String> maxPendingLatency,
        @Nullable Input<Integer> maxTotalInstances,
        @Nullable Input<Integer> minIdleInstances,
        @Nullable Input<String> minPendingLatency,
        @Nullable Input<Integer> minTotalInstances,
        @Nullable Input<FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs> networkUtilization,
        @Nullable Input<FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs> requestUtilization) {
        this.coolDownPeriod = coolDownPeriod;
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
        this.diskUtilization = diskUtilization;
        this.maxConcurrentRequests = maxConcurrentRequests;
        this.maxIdleInstances = maxIdleInstances;
        this.maxPendingLatency = maxPendingLatency;
        this.maxTotalInstances = maxTotalInstances;
        this.minIdleInstances = minIdleInstances;
        this.minPendingLatency = minPendingLatency;
        this.minTotalInstances = minTotalInstances;
        this.networkUtilization = networkUtilization;
        this.requestUtilization = requestUtilization;
    }

    private FlexibleAppVersionAutomaticScalingGetArgs() {
        this.coolDownPeriod = Input.empty();
        this.cpuUtilization = Input.empty();
        this.diskUtilization = Input.empty();
        this.maxConcurrentRequests = Input.empty();
        this.maxIdleInstances = Input.empty();
        this.maxPendingLatency = Input.empty();
        this.maxTotalInstances = Input.empty();
        this.minIdleInstances = Input.empty();
        this.minPendingLatency = Input.empty();
        this.minTotalInstances = Input.empty();
        this.networkUtilization = Input.empty();
        this.requestUtilization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> coolDownPeriod;
        private Input<FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs> cpuUtilization;
        private @Nullable Input<FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs> diskUtilization;
        private @Nullable Input<Integer> maxConcurrentRequests;
        private @Nullable Input<Integer> maxIdleInstances;
        private @Nullable Input<String> maxPendingLatency;
        private @Nullable Input<Integer> maxTotalInstances;
        private @Nullable Input<Integer> minIdleInstances;
        private @Nullable Input<String> minPendingLatency;
        private @Nullable Input<Integer> minTotalInstances;
        private @Nullable Input<FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs> networkUtilization;
        private @Nullable Input<FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs> requestUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriod = defaults.coolDownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.diskUtilization = defaults.diskUtilization;
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.maxTotalInstances = defaults.maxTotalInstances;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.minTotalInstances = defaults.minTotalInstances;
    	      this.networkUtilization = defaults.networkUtilization;
    	      this.requestUtilization = defaults.requestUtilization;
        }

        public Builder setCoolDownPeriod(@Nullable Input<String> coolDownPeriod) {
            this.coolDownPeriod = coolDownPeriod;
            return this;
        }

        public Builder setCoolDownPeriod(@Nullable String coolDownPeriod) {
            this.coolDownPeriod = Input.ofNullable(coolDownPeriod);
            return this;
        }

        public Builder setCpuUtilization(Input<FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs> cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setCpuUtilization(FlexibleAppVersionAutomaticScalingCpuUtilizationGetArgs cpuUtilization) {
            this.cpuUtilization = Input.of(Objects.requireNonNull(cpuUtilization));
            return this;
        }

        public Builder setDiskUtilization(@Nullable Input<FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs> diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }

        public Builder setDiskUtilization(@Nullable FlexibleAppVersionAutomaticScalingDiskUtilizationGetArgs diskUtilization) {
            this.diskUtilization = Input.ofNullable(diskUtilization);
            return this;
        }

        public Builder setMaxConcurrentRequests(@Nullable Input<Integer> maxConcurrentRequests) {
            this.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        public Builder setMaxConcurrentRequests(@Nullable Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = Input.ofNullable(maxConcurrentRequests);
            return this;
        }

        public Builder setMaxIdleInstances(@Nullable Input<Integer> maxIdleInstances) {
            this.maxIdleInstances = maxIdleInstances;
            return this;
        }

        public Builder setMaxIdleInstances(@Nullable Integer maxIdleInstances) {
            this.maxIdleInstances = Input.ofNullable(maxIdleInstances);
            return this;
        }

        public Builder setMaxPendingLatency(@Nullable Input<String> maxPendingLatency) {
            this.maxPendingLatency = maxPendingLatency;
            return this;
        }

        public Builder setMaxPendingLatency(@Nullable String maxPendingLatency) {
            this.maxPendingLatency = Input.ofNullable(maxPendingLatency);
            return this;
        }

        public Builder setMaxTotalInstances(@Nullable Input<Integer> maxTotalInstances) {
            this.maxTotalInstances = maxTotalInstances;
            return this;
        }

        public Builder setMaxTotalInstances(@Nullable Integer maxTotalInstances) {
            this.maxTotalInstances = Input.ofNullable(maxTotalInstances);
            return this;
        }

        public Builder setMinIdleInstances(@Nullable Input<Integer> minIdleInstances) {
            this.minIdleInstances = minIdleInstances;
            return this;
        }

        public Builder setMinIdleInstances(@Nullable Integer minIdleInstances) {
            this.minIdleInstances = Input.ofNullable(minIdleInstances);
            return this;
        }

        public Builder setMinPendingLatency(@Nullable Input<String> minPendingLatency) {
            this.minPendingLatency = minPendingLatency;
            return this;
        }

        public Builder setMinPendingLatency(@Nullable String minPendingLatency) {
            this.minPendingLatency = Input.ofNullable(minPendingLatency);
            return this;
        }

        public Builder setMinTotalInstances(@Nullable Input<Integer> minTotalInstances) {
            this.minTotalInstances = minTotalInstances;
            return this;
        }

        public Builder setMinTotalInstances(@Nullable Integer minTotalInstances) {
            this.minTotalInstances = Input.ofNullable(minTotalInstances);
            return this;
        }

        public Builder setNetworkUtilization(@Nullable Input<FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs> networkUtilization) {
            this.networkUtilization = networkUtilization;
            return this;
        }

        public Builder setNetworkUtilization(@Nullable FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs networkUtilization) {
            this.networkUtilization = Input.ofNullable(networkUtilization);
            return this;
        }

        public Builder setRequestUtilization(@Nullable Input<FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs> requestUtilization) {
            this.requestUtilization = requestUtilization;
            return this;
        }

        public Builder setRequestUtilization(@Nullable FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs requestUtilization) {
            this.requestUtilization = Input.ofNullable(requestUtilization);
            return this;
        }

        public FlexibleAppVersionAutomaticScalingGetArgs build() {
            return new FlexibleAppVersionAutomaticScalingGetArgs(coolDownPeriod, cpuUtilization, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization);
        }
    }
}
