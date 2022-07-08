// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DenoiseResponse {
    /**
     * @return Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0.
     * 
     */
    private final Double strength;
    /**
     * @return Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` - `grain`
     * 
     */
    private final String tune;

    @CustomType.Constructor
    private DenoiseResponse(
        @CustomType.Parameter("strength") Double strength,
        @CustomType.Parameter("tune") String tune) {
        this.strength = strength;
        this.tune = tune;
    }

    /**
     * @return Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0.
     * 
     */
    public Double strength() {
        return this.strength;
    }
    /**
     * @return Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` - `grain`
     * 
     */
    public String tune() {
        return this.tune;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenoiseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double strength;
        private String tune;

        public Builder() {
    	      // Empty
        }

        public Builder(DenoiseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strength = defaults.strength;
    	      this.tune = defaults.tune;
        }

        public Builder strength(Double strength) {
            this.strength = Objects.requireNonNull(strength);
            return this;
        }
        public Builder tune(String tune) {
            this.tune = Objects.requireNonNull(tune);
            return this;
        }        public DenoiseResponse build() {
            return new DenoiseResponse(strength, tune);
        }
    }
}
