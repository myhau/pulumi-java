// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A TrackSelection to select video tracks.
 * 
 */
public final class VideoTrackDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoTrackDescriptorArgs Empty = new VideoTrackDescriptorArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.VideoTrackDescriptor'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public VideoTrackDescriptorArgs(Output<String> odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private VideoTrackDescriptorArgs() {
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoTrackDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoTrackDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public VideoTrackDescriptorArgs build() {
            return new VideoTrackDescriptorArgs(odataType);
        }
    }
}
