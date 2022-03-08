// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryDimensionValueType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduledQueryDimensionMapping {
    private final ScheduledQueryDimensionValueType dimensionValueType;
    private final String name;

    @OutputCustomType.Constructor({"dimensionValueType","name"})
    private ScheduledQueryDimensionMapping(
        ScheduledQueryDimensionValueType dimensionValueType,
        String name) {
        this.dimensionValueType = dimensionValueType;
        this.name = name;
    }

    public ScheduledQueryDimensionValueType getDimensionValueType() {
        return this.dimensionValueType;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryDimensionMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryDimensionValueType dimensionValueType;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryDimensionMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionValueType = defaults.dimensionValueType;
    	      this.name = defaults.name;
        }

        public Builder setDimensionValueType(ScheduledQueryDimensionValueType dimensionValueType) {
            this.dimensionValueType = Objects.requireNonNull(dimensionValueType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ScheduledQueryDimensionMapping build() {
            return new ScheduledQueryDimensionMapping(dimensionValueType, name);
        }
    }
}
