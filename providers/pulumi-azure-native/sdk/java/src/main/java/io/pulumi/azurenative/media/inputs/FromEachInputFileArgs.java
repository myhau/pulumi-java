// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An InputDefinition that looks at each input file provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to select tracks from each file given.
 * 
 */
public final class FromEachInputFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FromEachInputFileArgs Empty = new FromEachInputFileArgs();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
      private final @Nullable Output<List<Object>> includedTracks;

    public Output<List<Object>> includedTracks() {
        return this.includedTracks == null ? Codegen.empty() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromEachInputFile'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public FromEachInputFileArgs(
        @Nullable Output<List<Object>> includedTracks,
        Output<String> odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private FromEachInputFileArgs() {
        this.includedTracks = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromEachInputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> includedTracks;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromEachInputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder includedTracks(@Nullable Output<List<Object>> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }
        public Builder includedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = Codegen.ofNullable(includedTracks);
            return this;
        }
        public Builder includedTracks(Object... includedTracks) {
            return includedTracks(List.of(includedTracks));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public FromEachInputFileArgs build() {
            return new FromEachInputFileArgs(includedTracks, odataType);
        }
    }
}
