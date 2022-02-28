// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs Empty = new ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs();

    /**
     * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    @InputImport(name="snapshotsEnabled", required=true)
      private final Input<Boolean> snapshotsEnabled;

    public Input<Boolean> getSnapshotsEnabled() {
        return this.snapshotsEnabled;
    }

    public ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs(Input<Boolean> snapshotsEnabled) {
        this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled, "expected parameter 'snapshotsEnabled' to be non-null");
    }

    private ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs() {
        this.snapshotsEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> snapshotsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotsEnabled = defaults.snapshotsEnabled;
        }

        public Builder setSnapshotsEnabled(Input<Boolean> snapshotsEnabled) {
            this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled);
            return this;
        }

        public Builder setSnapshotsEnabled(Boolean snapshotsEnabled) {
            this.snapshotsEnabled = Input.of(Objects.requireNonNull(snapshotsEnabled));
            return this;
        }
        public ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs(snapshotsEnabled);
        }
    }
}
