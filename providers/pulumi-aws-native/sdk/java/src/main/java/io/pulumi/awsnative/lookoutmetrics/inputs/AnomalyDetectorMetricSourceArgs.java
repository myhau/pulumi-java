// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorAppFlowConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorCloudwatchConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorRDSSourceConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorRedshiftSourceConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorS3SourceConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorMetricSourceArgs Empty = new AnomalyDetectorMetricSourceArgs();

    @InputImport(name="appFlowConfig")
    private final @Nullable Input<AnomalyDetectorAppFlowConfigArgs> appFlowConfig;

    public Input<AnomalyDetectorAppFlowConfigArgs> getAppFlowConfig() {
        return this.appFlowConfig == null ? Input.empty() : this.appFlowConfig;
    }

    @InputImport(name="cloudwatchConfig")
    private final @Nullable Input<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig;

    public Input<AnomalyDetectorCloudwatchConfigArgs> getCloudwatchConfig() {
        return this.cloudwatchConfig == null ? Input.empty() : this.cloudwatchConfig;
    }

    @InputImport(name="rDSSourceConfig")
    private final @Nullable Input<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig;

    public Input<AnomalyDetectorRDSSourceConfigArgs> getRDSSourceConfig() {
        return this.rDSSourceConfig == null ? Input.empty() : this.rDSSourceConfig;
    }

    @InputImport(name="redshiftSourceConfig")
    private final @Nullable Input<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig;

    public Input<AnomalyDetectorRedshiftSourceConfigArgs> getRedshiftSourceConfig() {
        return this.redshiftSourceConfig == null ? Input.empty() : this.redshiftSourceConfig;
    }

    @InputImport(name="s3SourceConfig")
    private final @Nullable Input<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig;

    public Input<AnomalyDetectorS3SourceConfigArgs> getS3SourceConfig() {
        return this.s3SourceConfig == null ? Input.empty() : this.s3SourceConfig;
    }

    public AnomalyDetectorMetricSourceArgs(
        @Nullable Input<AnomalyDetectorAppFlowConfigArgs> appFlowConfig,
        @Nullable Input<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig,
        @Nullable Input<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig,
        @Nullable Input<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig,
        @Nullable Input<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig) {
        this.appFlowConfig = appFlowConfig;
        this.cloudwatchConfig = cloudwatchConfig;
        this.rDSSourceConfig = rDSSourceConfig;
        this.redshiftSourceConfig = redshiftSourceConfig;
        this.s3SourceConfig = s3SourceConfig;
    }

    private AnomalyDetectorMetricSourceArgs() {
        this.appFlowConfig = Input.empty();
        this.cloudwatchConfig = Input.empty();
        this.rDSSourceConfig = Input.empty();
        this.redshiftSourceConfig = Input.empty();
        this.s3SourceConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AnomalyDetectorAppFlowConfigArgs> appFlowConfig;
        private @Nullable Input<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig;
        private @Nullable Input<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig;
        private @Nullable Input<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig;
        private @Nullable Input<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appFlowConfig = defaults.appFlowConfig;
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.rDSSourceConfig = defaults.rDSSourceConfig;
    	      this.redshiftSourceConfig = defaults.redshiftSourceConfig;
    	      this.s3SourceConfig = defaults.s3SourceConfig;
        }

        public Builder setAppFlowConfig(@Nullable Input<AnomalyDetectorAppFlowConfigArgs> appFlowConfig) {
            this.appFlowConfig = appFlowConfig;
            return this;
        }

        public Builder setAppFlowConfig(@Nullable AnomalyDetectorAppFlowConfigArgs appFlowConfig) {
            this.appFlowConfig = Input.ofNullable(appFlowConfig);
            return this;
        }

        public Builder setCloudwatchConfig(@Nullable Input<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig) {
            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }

        public Builder setCloudwatchConfig(@Nullable AnomalyDetectorCloudwatchConfigArgs cloudwatchConfig) {
            this.cloudwatchConfig = Input.ofNullable(cloudwatchConfig);
            return this;
        }

        public Builder setRDSSourceConfig(@Nullable Input<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig) {
            this.rDSSourceConfig = rDSSourceConfig;
            return this;
        }

        public Builder setRDSSourceConfig(@Nullable AnomalyDetectorRDSSourceConfigArgs rDSSourceConfig) {
            this.rDSSourceConfig = Input.ofNullable(rDSSourceConfig);
            return this;
        }

        public Builder setRedshiftSourceConfig(@Nullable Input<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig) {
            this.redshiftSourceConfig = redshiftSourceConfig;
            return this;
        }

        public Builder setRedshiftSourceConfig(@Nullable AnomalyDetectorRedshiftSourceConfigArgs redshiftSourceConfig) {
            this.redshiftSourceConfig = Input.ofNullable(redshiftSourceConfig);
            return this;
        }

        public Builder setS3SourceConfig(@Nullable Input<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig) {
            this.s3SourceConfig = s3SourceConfig;
            return this;
        }

        public Builder setS3SourceConfig(@Nullable AnomalyDetectorS3SourceConfigArgs s3SourceConfig) {
            this.s3SourceConfig = Input.ofNullable(s3SourceConfig);
            return this;
        }

        public AnomalyDetectorMetricSourceArgs build() {
            return new AnomalyDetectorMetricSourceArgs(appFlowConfig, cloudwatchConfig, rDSSourceConfig, redshiftSourceConfig, s3SourceConfig);
        }
    }
}