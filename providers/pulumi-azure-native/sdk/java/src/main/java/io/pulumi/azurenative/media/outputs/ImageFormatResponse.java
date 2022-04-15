// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImageFormatResponse {
    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    private final String filenamePattern;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ImageFormat'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ImageFormatResponse(
        @CustomType.Parameter("filenamePattern") String filenamePattern,
        @CustomType.Parameter("odataType") String odataType) {
        this.filenamePattern = filenamePattern;
        this.odataType = odataType;
    }

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
    */
    public String filenamePattern() {
        return this.filenamePattern;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ImageFormat'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filenamePattern;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.odataType = defaults.odataType;
        }

        public Builder filenamePattern(String filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ImageFormatResponse build() {
            return new ImageFormatResponse(filenamePattern, odataType);
        }
    }
}
