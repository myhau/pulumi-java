// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoScaleConfigurationResponse {
    private final @Nullable Integer maxReplicas;
    private final @Nullable Integer minReplicas;
    private final @Nullable Integer refreshPeriodInSeconds;
    private final @Nullable String status;
    private final @Nullable Double targetUtilization;

    @OutputCustomType.Constructor({"maxReplicas","minReplicas","refreshPeriodInSeconds","status","targetUtilization"})
    private AutoScaleConfigurationResponse(
        @Nullable Integer maxReplicas,
        @Nullable Integer minReplicas,
        @Nullable Integer refreshPeriodInSeconds,
        @Nullable String status,
        @Nullable Double targetUtilization) {
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.status = status;
        this.targetUtilization = targetUtilization;
    }

    public Optional<Integer> getMaxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    public Optional<Integer> getRefreshPeriodInSeconds() {
        return Optional.ofNullable(this.refreshPeriodInSeconds);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<Double> getTargetUtilization() {
        return Optional.ofNullable(this.targetUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private @Nullable Integer refreshPeriodInSeconds;
        private @Nullable String status;
        private @Nullable Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.refreshPeriodInSeconds = defaults.refreshPeriodInSeconds;
    	      this.status = defaults.status;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setMaxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setRefreshPeriodInSeconds(@Nullable Integer refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTargetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }

        public AutoScaleConfigurationResponse build() {
            return new AutoScaleConfigurationResponse(maxReplicas, minReplicas, refreshPeriodInSeconds, status, targetUtilization);
        }
    }
}