// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PhraseResponse {
    /**
     * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
     */
    private final Double boost;
    /**
     * The phrase itself.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"boost","value"})
    private PhraseResponse(
        Double boost,
        String value) {
        this.boost = boost;
        this.value = value;
    }

    /**
     * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
    */
    public Double getBoost() {
        return this.boost;
    }
    /**
     * The phrase itself.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double boost;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.value = defaults.value;
        }

        public Builder setBoost(Double boost) {
            this.boost = Objects.requireNonNull(boost);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public PhraseResponse build() {
            return new PhraseResponse(boost, value);
        }
    }
}
