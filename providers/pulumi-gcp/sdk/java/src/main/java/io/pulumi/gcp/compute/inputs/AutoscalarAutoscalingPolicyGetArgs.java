// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyCpuUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyMetricGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleDownControlGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleInControlGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScalingScheduleGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyGetArgs Empty = new AutoscalarAutoscalingPolicyGetArgs();

    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    @InputImport(name="cooldownPeriod")
    private final @Nullable Input<Integer> cooldownPeriod;

    public Input<Integer> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Input.empty() : this.cooldownPeriod;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cpuUtilization")
    private final @Nullable Input<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;

    public Input<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Input.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @InputImport(name="loadBalancingUtilization")
    private final @Nullable Input<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;

    public Input<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Input.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    @InputImport(name="maxReplicas", required=true)
    private final Input<Integer> maxReplicas;

    public Input<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metrics")
    private final @Nullable Input<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics;

    public Input<List<AutoscalarAutoscalingPolicyMetricGetArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    @InputImport(name="minReplicas", required=true)
    private final Input<Integer> minReplicas;

    public Input<Integer> getMinReplicas() {
        return this.minReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @InputImport(name="scaleDownControl")
    private final @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;

    public Input<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Input.empty() : this.scaleDownControl;
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @InputImport(name="scaleInControl")
    private final @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl;

    public Input<AutoscalarAutoscalingPolicyScaleInControlGetArgs> getScaleInControl() {
        return this.scaleInControl == null ? Input.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scalingSchedules")
    private final @Nullable Input<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

    public Input<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> getScalingSchedules() {
        return this.scalingSchedules == null ? Input.empty() : this.scalingSchedules;
    }

    public AutoscalarAutoscalingPolicyGetArgs(
        @Nullable Input<Integer> cooldownPeriod,
        @Nullable Input<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization,
        @Nullable Input<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization,
        Input<Integer> maxReplicas,
        @Nullable Input<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics,
        Input<Integer> minReplicas,
        @Nullable Input<String> mode,
        @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl,
        @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl,
        @Nullable Input<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
        this.cooldownPeriod = cooldownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = Objects.requireNonNull(minReplicas, "expected parameter 'minReplicas' to be non-null");
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private AutoscalarAutoscalingPolicyGetArgs() {
        this.cooldownPeriod = Input.empty();
        this.cpuUtilization = Input.empty();
        this.loadBalancingUtilization = Input.empty();
        this.maxReplicas = Input.empty();
        this.metrics = Input.empty();
        this.minReplicas = Input.empty();
        this.mode = Input.empty();
        this.scaleDownControl = Input.empty();
        this.scaleInControl = Input.empty();
        this.scalingSchedules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cooldownPeriod;
        private @Nullable Input<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;
        private @Nullable Input<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;
        private Input<Integer> maxReplicas;
        private @Nullable Input<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics;
        private Input<Integer> minReplicas;
        private @Nullable Input<String> mode;
        private @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;
        private @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl;
        private @Nullable Input<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder setCooldownPeriod(@Nullable Input<Integer> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder setCooldownPeriod(@Nullable Integer cooldownPeriod) {
            this.cooldownPeriod = Input.ofNullable(cooldownPeriod);
            return this;
        }

        public Builder setCpuUtilization(@Nullable Input<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder setCpuUtilization(@Nullable AutoscalarAutoscalingPolicyCpuUtilizationGetArgs cpuUtilization) {
            this.cpuUtilization = Input.ofNullable(cpuUtilization);
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable Input<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Input.ofNullable(loadBalancingUtilization);
            return this;
        }

        public Builder setMaxReplicas(Input<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Input.of(Objects.requireNonNull(maxReplicas));
            return this;
        }

        public Builder setMetrics(@Nullable Input<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<AutoscalarAutoscalingPolicyMetricGetArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setMinReplicas(Input<Integer> minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }

        public Builder setMinReplicas(Integer minReplicas) {
            this.minReplicas = Input.of(Objects.requireNonNull(minReplicas));
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setScaleDownControl(@Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }

        public Builder setScaleDownControl(@Nullable AutoscalarAutoscalingPolicyScaleDownControlGetArgs scaleDownControl) {
            this.scaleDownControl = Input.ofNullable(scaleDownControl);
            return this;
        }

        public Builder setScaleInControl(@Nullable Input<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }

        public Builder setScaleInControl(@Nullable AutoscalarAutoscalingPolicyScaleInControlGetArgs scaleInControl) {
            this.scaleInControl = Input.ofNullable(scaleInControl);
            return this;
        }

        public Builder setScalingSchedules(@Nullable Input<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }

        public Builder setScalingSchedules(@Nullable List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs> scalingSchedules) {
            this.scalingSchedules = Input.ofNullable(scalingSchedules);
            return this;
        }

        public AutoscalarAutoscalingPolicyGetArgs build() {
            return new AutoscalarAutoscalingPolicyGetArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
