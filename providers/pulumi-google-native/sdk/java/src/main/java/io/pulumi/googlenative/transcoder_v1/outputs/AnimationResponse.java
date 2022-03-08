// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.AnimationEndResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.AnimationFadeResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.AnimationStaticResponse;
import java.util.Objects;

@OutputCustomType
public final class AnimationResponse {
    /**
     * End previous animation.
     * 
     */
    private final AnimationEndResponse animationEnd;
    /**
     * Display overlay object with fade animation.
     * 
     */
    private final AnimationFadeResponse animationFade;
    /**
     * Display static overlay object.
     * 
     */
    private final AnimationStaticResponse animationStatic;

    @OutputCustomType.Constructor({"animationEnd","animationFade","animationStatic"})
    private AnimationResponse(
        AnimationEndResponse animationEnd,
        AnimationFadeResponse animationFade,
        AnimationStaticResponse animationStatic) {
        this.animationEnd = animationEnd;
        this.animationFade = animationFade;
        this.animationStatic = animationStatic;
    }

    /**
     * End previous animation.
     * 
    */
    public AnimationEndResponse getAnimationEnd() {
        return this.animationEnd;
    }
    /**
     * Display overlay object with fade animation.
     * 
    */
    public AnimationFadeResponse getAnimationFade() {
        return this.animationFade;
    }
    /**
     * Display static overlay object.
     * 
    */
    public AnimationStaticResponse getAnimationStatic() {
        return this.animationStatic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationEndResponse animationEnd;
        private AnimationFadeResponse animationFade;
        private AnimationStaticResponse animationStatic;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animationEnd = defaults.animationEnd;
    	      this.animationFade = defaults.animationFade;
    	      this.animationStatic = defaults.animationStatic;
        }

        public Builder setAnimationEnd(AnimationEndResponse animationEnd) {
            this.animationEnd = Objects.requireNonNull(animationEnd);
            return this;
        }

        public Builder setAnimationFade(AnimationFadeResponse animationFade) {
            this.animationFade = Objects.requireNonNull(animationFade);
            return this;
        }

        public Builder setAnimationStatic(AnimationStaticResponse animationStatic) {
            this.animationStatic = Objects.requireNonNull(animationStatic);
            return this;
        }
        public AnimationResponse build() {
            return new AnimationResponse(animationEnd, animationFade, animationStatic);
        }
    }
}
