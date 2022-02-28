// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.CustomLayerCloudwatchConfigurationLogStreamGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomLayerCloudwatchConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLayerCloudwatchConfigurationGetArgs Empty = new CustomLayerCloudwatchConfigurationGetArgs();

    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * A block the specifies how an opsworks logs look like. See Log Streams.
     * 
     */
    @InputImport(name="logStreams")
      private final @Nullable Input<List<CustomLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

    public Input<List<CustomLayerCloudwatchConfigurationLogStreamGetArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public CustomLayerCloudwatchConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<CustomLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private CustomLayerCloudwatchConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLayerCloudwatchConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<CustomLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLayerCloudwatchConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogStreams(@Nullable Input<List<CustomLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder setLogStreams(@Nullable List<CustomLayerCloudwatchConfigurationLogStreamGetArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public CustomLayerCloudwatchConfigurationGetArgs build() {
            return new CustomLayerCloudwatchConfigurationGetArgs(enabled, logStreams);
        }
    }
}
