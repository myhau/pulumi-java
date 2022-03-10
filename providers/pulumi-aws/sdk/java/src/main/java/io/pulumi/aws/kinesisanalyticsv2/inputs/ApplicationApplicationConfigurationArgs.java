// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationArgs Empty = new ApplicationApplicationConfigurationArgs();

    /**
     * The code location and type parameters for the application.
     * 
     */
    @InputImport(name="applicationCodeConfiguration", required=true)
      private final Input<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration;

    public Input<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> getApplicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    @InputImport(name="applicationSnapshotConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration;

    public Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> getApplicationSnapshotConfiguration() {
        return this.applicationSnapshotConfiguration == null ? Input.empty() : this.applicationSnapshotConfiguration;
    }

    /**
     * Describes execution properties for a Flink-based application.
     * 
     */
    @InputImport(name="environmentProperties")
      private final @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties;

    public Input<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> getEnvironmentProperties() {
        return this.environmentProperties == null ? Input.empty() : this.environmentProperties;
    }

    /**
     * The configuration of a Flink-based application.
     * 
     */
    @InputImport(name="flinkApplicationConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration;

    public Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> getFlinkApplicationConfiguration() {
        return this.flinkApplicationConfiguration == null ? Input.empty() : this.flinkApplicationConfiguration;
    }

    /**
     * Describes the starting properties for a Flink-based application.
     * 
     */
    @InputImport(name="runConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration;

    public Input<ApplicationApplicationConfigurationRunConfigurationArgs> getRunConfiguration() {
        return this.runConfiguration == null ? Input.empty() : this.runConfiguration;
    }

    /**
     * The configuration of a SQL-based application.
     * 
     */
    @InputImport(name="sqlApplicationConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> getSqlApplicationConfiguration() {
        return this.sqlApplicationConfiguration == null ? Input.empty() : this.sqlApplicationConfiguration;
    }

    /**
     * The VPC configuration of a Flink-based application.
     * 
     */
    @InputImport(name="vpcConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration;

    public Input<ApplicationApplicationConfigurationVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Input.empty() : this.vpcConfiguration;
    }

    public ApplicationApplicationConfigurationArgs(
        Input<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties,
        @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration) {
        this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration, "expected parameter 'applicationCodeConfiguration' to be non-null");
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
        this.environmentProperties = environmentProperties;
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
        this.runConfiguration = runConfiguration;
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private ApplicationApplicationConfigurationArgs() {
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

    public static Builder builder(ApplicationApplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties;
        private @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCodeConfiguration = defaults.applicationCodeConfiguration;
    	      this.applicationSnapshotConfiguration = defaults.applicationSnapshotConfiguration;
    	      this.environmentProperties = defaults.environmentProperties;
    	      this.flinkApplicationConfiguration = defaults.flinkApplicationConfiguration;
    	      this.runConfiguration = defaults.runConfiguration;
    	      this.sqlApplicationConfiguration = defaults.sqlApplicationConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setApplicationCodeConfiguration(Input<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration);
            return this;
        }

        public Builder setApplicationCodeConfiguration(ApplicationApplicationConfigurationApplicationCodeConfigurationArgs applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Input.of(Objects.requireNonNull(applicationCodeConfiguration));
            return this;
        }

        public Builder setApplicationSnapshotConfiguration(@Nullable Input<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            return this;
        }

        public Builder setApplicationSnapshotConfiguration(@Nullable ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = Input.ofNullable(applicationSnapshotConfiguration);
            return this;
        }

        public Builder setEnvironmentProperties(@Nullable Input<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties) {
            this.environmentProperties = environmentProperties;
            return this;
        }

        public Builder setEnvironmentProperties(@Nullable ApplicationApplicationConfigurationEnvironmentPropertiesArgs environmentProperties) {
            this.environmentProperties = Input.ofNullable(environmentProperties);
            return this;
        }

        public Builder setFlinkApplicationConfiguration(@Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = flinkApplicationConfiguration;
            return this;
        }

        public Builder setFlinkApplicationConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = Input.ofNullable(flinkApplicationConfiguration);
            return this;
        }

        public Builder setRunConfiguration(@Nullable Input<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration) {
            this.runConfiguration = runConfiguration;
            return this;
        }

        public Builder setRunConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationArgs runConfiguration) {
            this.runConfiguration = Input.ofNullable(runConfiguration);
            return this;
        }

        public Builder setSqlApplicationConfiguration(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = sqlApplicationConfiguration;
            return this;
        }

        public Builder setSqlApplicationConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationArgs sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = Input.ofNullable(sqlApplicationConfiguration);
            return this;
        }

        public Builder setVpcConfiguration(@Nullable Input<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder setVpcConfiguration(@Nullable ApplicationApplicationConfigurationVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Input.ofNullable(vpcConfiguration);
            return this;
        }
        public ApplicationApplicationConfigurationArgs build() {
            return new ApplicationApplicationConfigurationArgs(applicationCodeConfiguration, applicationSnapshotConfiguration, environmentProperties, flinkApplicationConfiguration, runConfiguration, sqlApplicationConfiguration, vpcConfiguration);
        }
    }
}