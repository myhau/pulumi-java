// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    @InputImport(name="checkInterval")
    private final @Nullable Input<String> checkInterval;

    public Input<String> getCheckInterval() {
        return this.checkInterval == null ? Input.empty() : this.checkInterval;
    }

    @InputImport(name="disableHealthCheck")
    private final @Nullable Input<Boolean> disableHealthCheck;

    public Input<Boolean> getDisableHealthCheck() {
        return this.disableHealthCheck == null ? Input.empty() : this.disableHealthCheck;
    }

    @InputImport(name="healthyThreshold")
    private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    @InputImport(name="restartThreshold")
    private final @Nullable Input<Integer> restartThreshold;

    public Input<Integer> getRestartThreshold() {
        return this.restartThreshold == null ? Input.empty() : this.restartThreshold;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    @InputImport(name="unhealthyThreshold")
    private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public HealthCheckArgs(
        @Nullable Input<String> checkInterval,
        @Nullable Input<Boolean> disableHealthCheck,
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<String> host,
        @Nullable Input<Integer> restartThreshold,
        @Nullable Input<String> timeout,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.checkInterval = checkInterval;
        this.disableHealthCheck = disableHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.restartThreshold = restartThreshold;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HealthCheckArgs() {
        this.checkInterval = Input.empty();
        this.disableHealthCheck = Input.empty();
        this.healthyThreshold = Input.empty();
        this.host = Input.empty();
        this.restartThreshold = Input.empty();
        this.timeout = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> checkInterval;
        private @Nullable Input<Boolean> disableHealthCheck;
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<String> host;
        private @Nullable Input<Integer> restartThreshold;
        private @Nullable Input<String> timeout;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.disableHealthCheck = defaults.disableHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.restartThreshold = defaults.restartThreshold;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckInterval(@Nullable Input<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder setCheckInterval(@Nullable String checkInterval) {
            this.checkInterval = Input.ofNullable(checkInterval);
            return this;
        }

        public Builder setDisableHealthCheck(@Nullable Input<Boolean> disableHealthCheck) {
            this.disableHealthCheck = disableHealthCheck;
            return this;
        }

        public Builder setDisableHealthCheck(@Nullable Boolean disableHealthCheck) {
            this.disableHealthCheck = Input.ofNullable(disableHealthCheck);
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Input<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Input.ofNullable(healthyThreshold);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setRestartThreshold(@Nullable Input<Integer> restartThreshold) {
            this.restartThreshold = restartThreshold;
            return this;
        }

        public Builder setRestartThreshold(@Nullable Integer restartThreshold) {
            this.restartThreshold = Input.ofNullable(restartThreshold);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }

        public HealthCheckArgs build() {
            return new HealthCheckArgs(checkInterval, disableHealthCheck, healthyThreshold, host, restartThreshold, timeout, unhealthyThreshold);
        }
    }
}