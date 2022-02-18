// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionAutomaticScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionAutomaticScalingGetArgs Empty = new StandardAppVersionAutomaticScalingGetArgs();

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
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="maxPendingLatency")
    private final @Nullable Input<String> maxPendingLatency;

    public Input<String> getMaxPendingLatency() {
        return this.maxPendingLatency == null ? Input.empty() : this.maxPendingLatency;
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
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="minPendingLatency")
    private final @Nullable Input<String> minPendingLatency;

    public Input<String> getMinPendingLatency() {
        return this.minPendingLatency == null ? Input.empty() : this.minPendingLatency;
    }

    /**
     * Scheduler settings for standard environment.
     * Structure is documented below.
     * 
     */
    @InputImport(name="standardSchedulerSettings")
    private final @Nullable Input<StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs> standardSchedulerSettings;

    public Input<StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs> getStandardSchedulerSettings() {
        return this.standardSchedulerSettings == null ? Input.empty() : this.standardSchedulerSettings;
    }

    public StandardAppVersionAutomaticScalingGetArgs(
        @Nullable Input<Integer> maxConcurrentRequests,
        @Nullable Input<Integer> maxIdleInstances,
        @Nullable Input<String> maxPendingLatency,
        @Nullable Input<Integer> minIdleInstances,
        @Nullable Input<String> minPendingLatency,
        @Nullable Input<StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs> standardSchedulerSettings) {
        this.maxConcurrentRequests = maxConcurrentRequests;
        this.maxIdleInstances = maxIdleInstances;
        this.maxPendingLatency = maxPendingLatency;
        this.minIdleInstances = minIdleInstances;
        this.minPendingLatency = minPendingLatency;
        this.standardSchedulerSettings = standardSchedulerSettings;
    }

    private StandardAppVersionAutomaticScalingGetArgs() {
        this.maxConcurrentRequests = Input.empty();
        this.maxIdleInstances = Input.empty();
        this.maxPendingLatency = Input.empty();
        this.minIdleInstances = Input.empty();
        this.minPendingLatency = Input.empty();
        this.standardSchedulerSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionAutomaticScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxConcurrentRequests;
        private @Nullable Input<Integer> maxIdleInstances;
        private @Nullable Input<String> maxPendingLatency;
        private @Nullable Input<Integer> minIdleInstances;
        private @Nullable Input<String> minPendingLatency;
        private @Nullable Input<StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs> standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionAutomaticScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.standardSchedulerSettings = defaults.standardSchedulerSettings;
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

        public Builder setStandardSchedulerSettings(@Nullable Input<StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs> standardSchedulerSettings) {
            this.standardSchedulerSettings = standardSchedulerSettings;
            return this;
        }

        public Builder setStandardSchedulerSettings(@Nullable StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs standardSchedulerSettings) {
            this.standardSchedulerSettings = Input.ofNullable(standardSchedulerSettings);
            return this;
        }

        public StandardAppVersionAutomaticScalingGetArgs build() {
            return new StandardAppVersionAutomaticScalingGetArgs(maxConcurrentRequests, maxIdleInstances, maxPendingLatency, minIdleInstances, minPendingLatency, standardSchedulerSettings);
        }
    }
}
