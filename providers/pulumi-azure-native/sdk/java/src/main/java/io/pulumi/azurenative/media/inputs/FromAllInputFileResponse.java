// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An InputDefinition that looks across all of the files provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to allow selection of a single track across a set of input files.
 * 
 */
public final class FromAllInputFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final FromAllInputFileResponse Empty = new FromAllInputFileResponse();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
      private final @Nullable List<Object> includedTracks;

    public List<Object> includedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromAllInputFile'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public FromAllInputFileResponse(
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private FromAllInputFileResponse() {
        this.includedTracks = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromAllInputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromAllInputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder includedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }
        public Builder includedTracks(Object... includedTracks) {
            return includedTracks(List.of(includedTracks));
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public FromAllInputFileResponse build() {
            return new FromAllInputFileResponse(includedTracks, odataType);
        }
    }
}
