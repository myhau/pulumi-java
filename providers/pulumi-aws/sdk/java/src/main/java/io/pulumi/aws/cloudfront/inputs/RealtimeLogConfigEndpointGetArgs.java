// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigEndpointGetArgs Empty = new RealtimeLogConfigEndpointGetArgs();

    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    @InputImport(name="kinesisStreamConfig", required=true)
      private final Input<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig;

    public Input<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    @InputImport(name="streamType", required=true)
      private final Input<String> streamType;

    public Input<String> getStreamType() {
        return this.streamType;
    }

    public RealtimeLogConfigEndpointGetArgs(
        Input<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig,
        Input<String> streamType) {
        this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
        this.streamType = Objects.requireNonNull(streamType, "expected parameter 'streamType' to be non-null");
    }

    private RealtimeLogConfigEndpointGetArgs() {
        this.kinesisStreamConfig = Input.empty();
        this.streamType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig;
        private Input<String> streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder setKinesisStreamConfig(Input<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }

        public Builder setKinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfigGetArgs kinesisStreamConfig) {
            this.kinesisStreamConfig = Input.of(Objects.requireNonNull(kinesisStreamConfig));
            return this;
        }

        public Builder setStreamType(Input<String> streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }

        public Builder setStreamType(String streamType) {
            this.streamType = Input.of(Objects.requireNonNull(streamType));
            return this;
        }
        public RealtimeLogConfigEndpointGetArgs build() {
            return new RealtimeLogConfigEndpointGetArgs(kinesisStreamConfig, streamType);
        }
    }
}