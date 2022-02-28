// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage.inputs;

import io.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelHlsIngestArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestArgs Empty = new ChannelHlsIngestArgs();

    /**
     * A list of the ingest endpoints
     * 
     */
    @InputImport(name="ingestEndpoints")
      private final @Nullable Input<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints;

    public Input<List<ChannelHlsIngestIngestEndpointArgs>> getIngestEndpoints() {
        return this.ingestEndpoints == null ? Input.empty() : this.ingestEndpoints;
    }

    public ChannelHlsIngestArgs(@Nullable Input<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints) {
        this.ingestEndpoints = ingestEndpoints;
    }

    private ChannelHlsIngestArgs() {
        this.ingestEndpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelHlsIngestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestEndpoints = defaults.ingestEndpoints;
        }

        public Builder setIngestEndpoints(@Nullable Input<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }

        public Builder setIngestEndpoints(@Nullable List<ChannelHlsIngestIngestEndpointArgs> ingestEndpoints) {
            this.ingestEndpoints = Input.ofNullable(ingestEndpoints);
            return this;
        }
        public ChannelHlsIngestArgs build() {
            return new ChannelHlsIngestArgs(ingestEndpoints);
        }
    }
}
