// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the clip time as a Utc time position in the media file.  The Utc time can point to a different position depending on whether the media file starts from a timestamp of zero or not.
 * 
 */
public final class UtcClipTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final UtcClipTimeArgs Empty = new UtcClipTimeArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.UtcClipTime'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The time position on the timeline of the input media based on Utc time.
     * 
     */
    @Import(name="time", required=true)
      private final Output<String> time;

    public Output<String> time() {
        return this.time;
    }

    public UtcClipTimeArgs(
        Output<String> odataType,
        Output<String> time) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private UtcClipTimeArgs() {
        this.odataType = Codegen.empty();
        this.time = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UtcClipTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(UtcClipTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder time(Output<String> time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public Builder time(String time) {
            this.time = Output.of(Objects.requireNonNull(time));
            return this;
        }        public UtcClipTimeArgs build() {
            return new UtcClipTimeArgs(odataType, time);
        }
    }
}
