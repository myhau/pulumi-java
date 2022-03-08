// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecommendedActionImpactRecordResponse {
    /**
     * Gets the absolute value of this dimension if applicable. e.g., Number of Queries affected
     * 
     */
    private final Double absoluteValue;
    /**
     * Gets the absolute change in the value of this dimension. e.g., Absolute Disk space change in Megabytes
     * 
     */
    private final Double changeValueAbsolute;
    /**
     * Gets the relative change in the value of this dimension. e.g., Relative Disk space change in Percentage
     * 
     */
    private final Double changeValueRelative;
    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    private final String dimensionName;
    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    private final String unit;

    @OutputCustomType.Constructor({"absoluteValue","changeValueAbsolute","changeValueRelative","dimensionName","unit"})
    private RecommendedActionImpactRecordResponse(
        Double absoluteValue,
        Double changeValueAbsolute,
        Double changeValueRelative,
        String dimensionName,
        String unit) {
        this.absoluteValue = absoluteValue;
        this.changeValueAbsolute = changeValueAbsolute;
        this.changeValueRelative = changeValueRelative;
        this.dimensionName = dimensionName;
        this.unit = unit;
    }

    /**
     * Gets the absolute value of this dimension if applicable. e.g., Number of Queries affected
     * 
    */
    public Double getAbsoluteValue() {
        return this.absoluteValue;
    }
    /**
     * Gets the absolute change in the value of this dimension. e.g., Absolute Disk space change in Megabytes
     * 
    */
    public Double getChangeValueAbsolute() {
        return this.changeValueAbsolute;
    }
    /**
     * Gets the relative change in the value of this dimension. e.g., Relative Disk space change in Percentage
     * 
    */
    public Double getChangeValueRelative() {
        return this.changeValueRelative;
    }
    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
    */
    public String getDimensionName() {
        return this.dimensionName;
    }
    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
    */
    public String getUnit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionImpactRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double absoluteValue;
        private Double changeValueAbsolute;
        private Double changeValueRelative;
        private String dimensionName;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionImpactRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteValue = defaults.absoluteValue;
    	      this.changeValueAbsolute = defaults.changeValueAbsolute;
    	      this.changeValueRelative = defaults.changeValueRelative;
    	      this.dimensionName = defaults.dimensionName;
    	      this.unit = defaults.unit;
        }

        public Builder setAbsoluteValue(Double absoluteValue) {
            this.absoluteValue = Objects.requireNonNull(absoluteValue);
            return this;
        }

        public Builder setChangeValueAbsolute(Double changeValueAbsolute) {
            this.changeValueAbsolute = Objects.requireNonNull(changeValueAbsolute);
            return this;
        }

        public Builder setChangeValueRelative(Double changeValueRelative) {
            this.changeValueRelative = Objects.requireNonNull(changeValueRelative);
            return this;
        }

        public Builder setDimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public RecommendedActionImpactRecordResponse build() {
            return new RecommendedActionImpactRecordResponse(absoluteValue, changeValueAbsolute, changeValueRelative, dimensionName, unit);
        }
    }
}
