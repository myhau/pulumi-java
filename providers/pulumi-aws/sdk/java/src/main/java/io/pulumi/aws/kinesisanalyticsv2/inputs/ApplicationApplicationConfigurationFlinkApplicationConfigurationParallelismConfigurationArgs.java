// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs();

    /**
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
     * 
     */
    @InputImport(name="autoScalingEnabled")
      private final @Nullable Input<Boolean> autoScalingEnabled;

    public Input<Boolean> getAutoScalingEnabled() {
        return this.autoScalingEnabled == null ? Input.empty() : this.autoScalingEnabled;
    }

    /**
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `auto_scaling_enabled`, `parallelism`, or `parallelism_per_kpu` attribute values to be effective.
     * 
     */
    @InputImport(name="configurationType", required=true)
      private final Input<String> configurationType;

    public Input<String> getConfigurationType() {
        return this.configurationType;
    }

    /**
     * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
     * 
     */
    @InputImport(name="parallelism")
      private final @Nullable Input<Integer> parallelism;

    public Input<Integer> getParallelism() {
        return this.parallelism == null ? Input.empty() : this.parallelism;
    }

    /**
     * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
     * 
     */
    @InputImport(name="parallelismPerKpu")
      private final @Nullable Input<Integer> parallelismPerKpu;

    public Input<Integer> getParallelismPerKpu() {
        return this.parallelismPerKpu == null ? Input.empty() : this.parallelismPerKpu;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs(
        @Nullable Input<Boolean> autoScalingEnabled,
        Input<String> configurationType,
        @Nullable Input<Integer> parallelism,
        @Nullable Input<Integer> parallelismPerKpu) {
        this.autoScalingEnabled = autoScalingEnabled;
        this.configurationType = Objects.requireNonNull(configurationType, "expected parameter 'configurationType' to be non-null");
        this.parallelism = parallelism;
        this.parallelismPerKpu = parallelismPerKpu;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs() {
        this.autoScalingEnabled = Input.empty();
        this.configurationType = Input.empty();
        this.parallelism = Input.empty();
        this.parallelismPerKpu = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoScalingEnabled;
        private Input<String> configurationType;
        private @Nullable Input<Integer> parallelism;
        private @Nullable Input<Integer> parallelismPerKpu;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingEnabled = defaults.autoScalingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.parallelism = defaults.parallelism;
    	      this.parallelismPerKpu = defaults.parallelismPerKpu;
        }

        public Builder setAutoScalingEnabled(@Nullable Input<Boolean> autoScalingEnabled) {
            this.autoScalingEnabled = autoScalingEnabled;
            return this;
        }

        public Builder setAutoScalingEnabled(@Nullable Boolean autoScalingEnabled) {
            this.autoScalingEnabled = Input.ofNullable(autoScalingEnabled);
            return this;
        }

        public Builder setConfigurationType(Input<String> configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }

        public Builder setConfigurationType(String configurationType) {
            this.configurationType = Input.of(Objects.requireNonNull(configurationType));
            return this;
        }

        public Builder setParallelism(@Nullable Input<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder setParallelism(@Nullable Integer parallelism) {
            this.parallelism = Input.ofNullable(parallelism);
            return this;
        }

        public Builder setParallelismPerKpu(@Nullable Input<Integer> parallelismPerKpu) {
            this.parallelismPerKpu = parallelismPerKpu;
            return this;
        }

        public Builder setParallelismPerKpu(@Nullable Integer parallelismPerKpu) {
            this.parallelismPerKpu = Input.ofNullable(parallelismPerKpu);
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs(autoScalingEnabled, configurationType, parallelism, parallelismPerKpu);
        }
    }
}
