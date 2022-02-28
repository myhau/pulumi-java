// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PresetAudioCodecOptions {
    /**
     * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
     * 
     */
    private final @Nullable String bitDepth;
    /**
     * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
     * 
     */
    private final @Nullable String bitOrder;
    /**
     * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
     * 
     */
    private final @Nullable String profile;
    /**
     * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
     * 
     */
    private final @Nullable String signed;

    @OutputCustomType.Constructor({"bitDepth","bitOrder","profile","signed"})
    private PresetAudioCodecOptions(
        @Nullable String bitDepth,
        @Nullable String bitOrder,
        @Nullable String profile,
        @Nullable String signed) {
        this.bitDepth = bitDepth;
        this.bitOrder = bitOrder;
        this.profile = profile;
        this.signed = signed;
    }

    /**
     * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
     * 
     */
    public Optional<String> getBitDepth() {
        return Optional.ofNullable(this.bitDepth);
    }
    /**
     * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
     * 
     */
    public Optional<String> getBitOrder() {
        return Optional.ofNullable(this.bitOrder);
    }
    /**
     * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
     * 
     */
    public Optional<String> getProfile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
     * 
     */
    public Optional<String> getSigned() {
        return Optional.ofNullable(this.signed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetAudioCodecOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitDepth;
        private @Nullable String bitOrder;
        private @Nullable String profile;
        private @Nullable String signed;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetAudioCodecOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitDepth = defaults.bitDepth;
    	      this.bitOrder = defaults.bitOrder;
    	      this.profile = defaults.profile;
    	      this.signed = defaults.signed;
        }

        public Builder setBitDepth(@Nullable String bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }

        public Builder setBitOrder(@Nullable String bitOrder) {
            this.bitOrder = bitOrder;
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }

        public Builder setSigned(@Nullable String signed) {
            this.signed = signed;
            return this;
        }
        public PresetAudioCodecOptions build() {
            return new PresetAudioCodecOptions(bitDepth, bitOrder, profile, signed);
        }
    }
}
