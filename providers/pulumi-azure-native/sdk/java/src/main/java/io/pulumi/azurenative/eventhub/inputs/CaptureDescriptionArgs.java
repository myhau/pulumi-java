// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.azurenative.eventhub.enums.EncodingCaptureDescription;
import io.pulumi.azurenative.eventhub.inputs.DestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties to configure capture description for eventhub
 * 
 */
public final class CaptureDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaptureDescriptionArgs Empty = new CaptureDescriptionArgs();

    /**
     * Properties of Destination where capture will be stored. (Storage Account, Blob Names)
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<DestinationArgs> destination;

    public Output<DestinationArgs> destination() {
        return this.destination == null ? Codegen.empty() : this.destination;
    }

    /**
     * A value that indicates whether capture description is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Enumerates the possible values for the encoding format of capture description. Note: 'AvroDeflate' will be deprecated in New API Version
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<EncodingCaptureDescription> encoding;

    public Output<EncodingCaptureDescription> encoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    /**
     * The time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds
     * 
     */
    @Import(name="intervalInSeconds")
      private final @Nullable Output<Integer> intervalInSeconds;

    public Output<Integer> intervalInSeconds() {
        return this.intervalInSeconds == null ? Codegen.empty() : this.intervalInSeconds;
    }

    /**
     * The size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 to 524288000 bytes
     * 
     */
    @Import(name="sizeLimitInBytes")
      private final @Nullable Output<Integer> sizeLimitInBytes;

    public Output<Integer> sizeLimitInBytes() {
        return this.sizeLimitInBytes == null ? Codegen.empty() : this.sizeLimitInBytes;
    }

    /**
     * A value that indicates whether to Skip Empty Archives
     * 
     */
    @Import(name="skipEmptyArchives")
      private final @Nullable Output<Boolean> skipEmptyArchives;

    public Output<Boolean> skipEmptyArchives() {
        return this.skipEmptyArchives == null ? Codegen.empty() : this.skipEmptyArchives;
    }

    public CaptureDescriptionArgs(
        @Nullable Output<DestinationArgs> destination,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<EncodingCaptureDescription> encoding,
        @Nullable Output<Integer> intervalInSeconds,
        @Nullable Output<Integer> sizeLimitInBytes,
        @Nullable Output<Boolean> skipEmptyArchives) {
        this.destination = destination;
        this.enabled = enabled;
        this.encoding = encoding;
        this.intervalInSeconds = intervalInSeconds;
        this.sizeLimitInBytes = sizeLimitInBytes;
        this.skipEmptyArchives = skipEmptyArchives;
    }

    private CaptureDescriptionArgs() {
        this.destination = Codegen.empty();
        this.enabled = Codegen.empty();
        this.encoding = Codegen.empty();
        this.intervalInSeconds = Codegen.empty();
        this.sizeLimitInBytes = Codegen.empty();
        this.skipEmptyArchives = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaptureDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DestinationArgs> destination;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<EncodingCaptureDescription> encoding;
        private @Nullable Output<Integer> intervalInSeconds;
        private @Nullable Output<Integer> sizeLimitInBytes;
        private @Nullable Output<Boolean> skipEmptyArchives;

        public Builder() {
    	      // Empty
        }

        public Builder(CaptureDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.encoding = defaults.encoding;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeLimitInBytes = defaults.sizeLimitInBytes;
    	      this.skipEmptyArchives = defaults.skipEmptyArchives;
        }

        public Builder destination(@Nullable Output<DestinationArgs> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable DestinationArgs destination) {
            this.destination = Codegen.ofNullable(destination);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder encoding(@Nullable Output<EncodingCaptureDescription> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable EncodingCaptureDescription encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = Codegen.ofNullable(intervalInSeconds);
            return this;
        }
        public Builder sizeLimitInBytes(@Nullable Output<Integer> sizeLimitInBytes) {
            this.sizeLimitInBytes = sizeLimitInBytes;
            return this;
        }
        public Builder sizeLimitInBytes(@Nullable Integer sizeLimitInBytes) {
            this.sizeLimitInBytes = Codegen.ofNullable(sizeLimitInBytes);
            return this;
        }
        public Builder skipEmptyArchives(@Nullable Output<Boolean> skipEmptyArchives) {
            this.skipEmptyArchives = skipEmptyArchives;
            return this;
        }
        public Builder skipEmptyArchives(@Nullable Boolean skipEmptyArchives) {
            this.skipEmptyArchives = Codegen.ofNullable(skipEmptyArchives);
            return this;
        }        public CaptureDescriptionArgs build() {
            return new CaptureDescriptionArgs(destination, enabled, encoding, intervalInSeconds, sizeLimitInBytes, skipEmptyArchives);
        }
    }
}
