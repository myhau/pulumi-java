// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnimationEndResponse {
    /**
     * The time to end overlay object, in seconds. Default: 0
     * 
     */
    private final String startTimeOffset;

    @OutputCustomType.Constructor
    private AnimationEndResponse(@OutputCustomType.Parameter("startTimeOffset") String startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * The time to end overlay object, in seconds. Default: 0
     * 
    */
    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationEndResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationEndResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder setStartTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }
        public AnimationEndResponse build() {
            return new AnimationEndResponse(startTimeOffset);
        }
    }
}
