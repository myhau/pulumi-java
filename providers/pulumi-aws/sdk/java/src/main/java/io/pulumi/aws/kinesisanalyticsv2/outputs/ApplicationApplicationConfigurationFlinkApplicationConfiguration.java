// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationFlinkApplicationConfiguration {
    /**
     * Describes an application's checkpointing configuration.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration;
    /**
     * Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration;
    /**
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration;

    @OutputCustomType.Constructor({"checkpointConfiguration","monitoringConfiguration","parallelismConfiguration"})
    private ApplicationApplicationConfigurationFlinkApplicationConfiguration(
        @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration,
        @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration,
        @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
        this.monitoringConfiguration = monitoringConfiguration;
        this.parallelismConfiguration = parallelismConfiguration;
    }

    /**
     * Describes an application's checkpointing configuration.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration> getCheckpointConfiguration() {
        return Optional.ofNullable(this.checkpointConfiguration);
    }
    /**
     * Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration> getMonitoringConfiguration() {
        return Optional.ofNullable(this.monitoringConfiguration);
    }
    /**
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration> getParallelismConfiguration() {
        return Optional.ofNullable(this.parallelismConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration;
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration;
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointConfiguration = defaults.checkpointConfiguration;
    	      this.monitoringConfiguration = defaults.monitoringConfiguration;
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
        }

        public Builder setCheckpointConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration) {
            this.checkpointConfiguration = checkpointConfiguration;
            return this;
        }

        public Builder setMonitoringConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration) {
            this.monitoringConfiguration = monitoringConfiguration;
            return this;
        }

        public Builder setParallelismConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfiguration build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfiguration(checkpointConfiguration, monitoringConfiguration, parallelismConfiguration);
        }
    }
}
