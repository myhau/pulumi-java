// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationGetArgs Empty = new ApplicationApplicationConfigurationGetArgs();

    /**
     * The code location and type parameters for the application.
     * 
     */
    @InputImport(name="applicationCodeConfiguration", required=true)
      private final Input<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration;

    public Input<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> getApplicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    @InputImport(name="applicationSnapshotConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration;

    public Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> getApplicationSnapshotConfiguration() {
        return this.applicationSnapshotConfiguration == null ? Input.empty() : this.applicationSnapshotConfiguration;
    }

    /**
     * Describes execution properties for a Flink-based application.
     * 
     */
    @InputImport(name="environmentProperties")
      private final @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties;

    public Input<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> getEnvironmentProperties() {
        return this.environmentProperties == null ? Input.empty() : this.environmentProperties;
    }

    /**
     * The configuration of a Flink-based application.
     * 
     */
    @InputImport(name="flinkApplicationConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration;

    public Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> getFlinkApplicationConfiguration() {
        return this.flinkApplicationConfiguration == null ? Input.empty() : this.flinkApplicationConfiguration;
    }

    /**
     * Describes the starting properties for a Flink-based application.
     * 
     */
    @InputImport(name="runConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration;

    public Input<ApplicationApplicationConfigurationRunConfigurationGetArgs> getRunConfiguration() {
        return this.runConfiguration == null ? Input.empty() : this.runConfiguration;
    }

    /**
     * The configuration of a SQL-based application.
     * 
     */
    @InputImport(name="sqlApplicationConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> getSqlApplicationConfiguration() {
        return this.sqlApplicationConfiguration == null ? Input.empty() : this.sqlApplicationConfiguration;
    }

    /**
     * The VPC configuration of a Flink-based application.
     * 
     */
    @InputImport(name="vpcConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration;

    public Input<ApplicationApplicationConfigurationVpcConfigurationGetArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Input.empty() : this.vpcConfiguration;
    }

    public ApplicationApplicationConfigurationGetArgs(
        Input<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties,
        @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration) {
        this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration, "expected parameter 'applicationCodeConfiguration' to be non-null");
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
        this.environmentProperties = environmentProperties;
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
        this.runConfiguration = runConfiguration;
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private ApplicationApplicationConfigurationGetArgs() {
        this.applicationCodeConfiguration = Input.empty();
        this.applicationSnapshotConfiguration = Input.empty();
        this.environmentProperties = Input.empty();
        this.flinkApplicationConfiguration = Input.empty();
        this.runConfiguration = Input.empty();
        this.sqlApplicationConfiguration = Input.empty();
        this.vpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties;
        private @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCodeConfiguration = defaults.applicationCodeConfiguration;
    	      this.applicationSnapshotConfiguration = defaults.applicationSnapshotConfiguration;
    	      this.environmentProperties = defaults.environmentProperties;
    	      this.flinkApplicationConfiguration = defaults.flinkApplicationConfiguration;
    	      this.runConfiguration = defaults.runConfiguration;
    	      this.sqlApplicationConfiguration = defaults.sqlApplicationConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setApplicationCodeConfiguration(Input<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration);
            return this;
        }

        public Builder setApplicationCodeConfiguration(ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Input.of(Objects.requireNonNull(applicationCodeConfiguration));
            return this;
        }

        public Builder setApplicationSnapshotConfiguration(@Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            return this;
        }

        public Builder setApplicationSnapshotConfiguration(@Nullable ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = Input.ofNullable(applicationSnapshotConfiguration);
            return this;
        }

        public Builder setEnvironmentProperties(@Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties) {
            this.environmentProperties = environmentProperties;
            return this;
        }

        public Builder setEnvironmentProperties(@Nullable ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs environmentProperties) {
            this.environmentProperties = Input.ofNullable(environmentProperties);
            return this;
        }

        public Builder setFlinkApplicationConfiguration(@Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = flinkApplicationConfiguration;
            return this;
        }

        public Builder setFlinkApplicationConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = Input.ofNullable(flinkApplicationConfiguration);
            return this;
        }

        public Builder setRunConfiguration(@Nullable Input<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration) {
            this.runConfiguration = runConfiguration;
            return this;
        }

        public Builder setRunConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationGetArgs runConfiguration) {
            this.runConfiguration = Input.ofNullable(runConfiguration);
            return this;
        }

        public Builder setSqlApplicationConfiguration(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = sqlApplicationConfiguration;
            return this;
        }

        public Builder setSqlApplicationConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = Input.ofNullable(sqlApplicationConfiguration);
            return this;
        }

        public Builder setVpcConfiguration(@Nullable Input<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder setVpcConfiguration(@Nullable ApplicationApplicationConfigurationVpcConfigurationGetArgs vpcConfiguration) {
            this.vpcConfiguration = Input.ofNullable(vpcConfiguration);
            return this;
        }
        public ApplicationApplicationConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationGetArgs(applicationCodeConfiguration, applicationSnapshotConfiguration, environmentProperties, flinkApplicationConfiguration, runConfiguration, sqlApplicationConfiguration, vpcConfiguration);
        }
    }
}
