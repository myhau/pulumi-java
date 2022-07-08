// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ThresholdResponse {
    /**
     * @return The state color for this threshold. Color is not allowed in a XyChart.
     * 
     */
    private final String color;
    /**
     * @return The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    private final String direction;
    /**
     * @return A label for the threshold.
     * 
     */
    private final String label;
    /**
     * @return The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    private final String targetAxis;
    /**
     * @return The value of the threshold. The value should be defined in the native scale of the metric.
     * 
     */
    private final Double value;

    @CustomType.Constructor
    private ThresholdResponse(
        @CustomType.Parameter("color") String color,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("targetAxis") String targetAxis,
        @CustomType.Parameter("value") Double value) {
        this.color = color;
        this.direction = direction;
        this.label = label;
        this.targetAxis = targetAxis;
        this.value = value;
    }

    /**
     * @return The state color for this threshold. Color is not allowed in a XyChart.
     * 
     */
    public String color() {
        return this.color;
    }
    /**
     * @return The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return A label for the threshold.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    public String targetAxis() {
        return this.targetAxis;
    }
    /**
     * @return The value of the threshold. The value should be defined in the native scale of the metric.
     * 
     */
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String color;
        private String direction;
        private String label;
        private String targetAxis;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.direction = defaults.direction;
    	      this.label = defaults.label;
    	      this.targetAxis = defaults.targetAxis;
    	      this.value = defaults.value;
        }

        public Builder color(String color) {
            this.color = Objects.requireNonNull(color);
            return this;
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder targetAxis(String targetAxis) {
            this.targetAxis = Objects.requireNonNull(targetAxis);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ThresholdResponse build() {
            return new ThresholdResponse(color, direction, label, targetAxis, value);
        }
    }
}
