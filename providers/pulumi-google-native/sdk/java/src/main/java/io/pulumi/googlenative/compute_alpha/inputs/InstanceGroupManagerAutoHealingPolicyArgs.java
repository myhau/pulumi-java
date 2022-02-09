// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.InstanceGroupManagerAutoHealingPolicyUpdateInstances;
import io.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAutoHealingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPolicyArgs Empty = new InstanceGroupManagerAutoHealingPolicyArgs();

    @InputImport(name="autoHealingTriggers")
    private final @Nullable Input<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers;

    public Input<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> getAutoHealingTriggers() {
        return this.autoHealingTriggers == null ? Input.empty() : this.autoHealingTriggers;
    }

    @InputImport(name="healthCheck")
    private final @Nullable Input<String> healthCheck;

    public Input<String> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    @InputImport(name="initialDelaySec")
    private final @Nullable Input<Integer> initialDelaySec;

    public Input<Integer> getInitialDelaySec() {
        return this.initialDelaySec == null ? Input.empty() : this.initialDelaySec;
    }

    @InputImport(name="maxUnavailable")
    private final @Nullable Input<FixedOrPercentArgs> maxUnavailable;

    public Input<FixedOrPercentArgs> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    @InputImport(name="updateInstances")
    private final @Nullable Input<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances;

    public Input<InstanceGroupManagerAutoHealingPolicyUpdateInstances> getUpdateInstances() {
        return this.updateInstances == null ? Input.empty() : this.updateInstances;
    }

    public InstanceGroupManagerAutoHealingPolicyArgs(
        @Nullable Input<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers,
        @Nullable Input<String> healthCheck,
        @Nullable Input<Integer> initialDelaySec,
        @Nullable Input<FixedOrPercentArgs> maxUnavailable,
        @Nullable Input<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances) {
        this.autoHealingTriggers = autoHealingTriggers;
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
        this.maxUnavailable = maxUnavailable;
        this.updateInstances = updateInstances;
    }

    private InstanceGroupManagerAutoHealingPolicyArgs() {
        this.autoHealingTriggers = Input.empty();
        this.healthCheck = Input.empty();
        this.initialDelaySec = Input.empty();
        this.maxUnavailable = Input.empty();
        this.updateInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers;
        private @Nullable Input<String> healthCheck;
        private @Nullable Input<Integer> initialDelaySec;
        private @Nullable Input<FixedOrPercentArgs> maxUnavailable;
        private @Nullable Input<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingTriggers = defaults.autoHealingTriggers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.updateInstances = defaults.updateInstances;
        }

        public Builder setAutoHealingTriggers(@Nullable Input<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers) {
            this.autoHealingTriggers = autoHealingTriggers;
            return this;
        }

        public Builder setAutoHealingTriggers(@Nullable InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs autoHealingTriggers) {
            this.autoHealingTriggers = Input.ofNullable(autoHealingTriggers);
            return this;
        }

        public Builder setHealthCheck(@Nullable Input<String> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setHealthCheck(@Nullable String healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder setInitialDelaySec(@Nullable Input<Integer> initialDelaySec) {
            this.initialDelaySec = initialDelaySec;
            return this;
        }

        public Builder setInitialDelaySec(@Nullable Integer initialDelaySec) {
            this.initialDelaySec = Input.ofNullable(initialDelaySec);
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Input<FixedOrPercentArgs> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder setMaxUnavailable(@Nullable FixedOrPercentArgs maxUnavailable) {
            this.maxUnavailable = Input.ofNullable(maxUnavailable);
            return this;
        }

        public Builder setUpdateInstances(@Nullable Input<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances) {
            this.updateInstances = updateInstances;
            return this;
        }

        public Builder setUpdateInstances(@Nullable InstanceGroupManagerAutoHealingPolicyUpdateInstances updateInstances) {
            this.updateInstances = Input.ofNullable(updateInstances);
            return this;
        }

        public InstanceGroupManagerAutoHealingPolicyArgs build() {
            return new InstanceGroupManagerAutoHealingPolicyArgs(autoHealingTriggers, healthCheck, initialDelaySec, maxUnavailable, updateInstances);
        }
    }
}