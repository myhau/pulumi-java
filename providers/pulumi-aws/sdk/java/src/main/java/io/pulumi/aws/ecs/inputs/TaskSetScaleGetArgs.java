// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetScaleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetScaleGetArgs Empty = new TaskSetScaleGetArgs();

    /**
     * The unit of measure for the scale value. Default: `PERCENT`.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    /**
     * The value, specified as a percent total of a service's `desiredCount`, to scale the task set. Defaults to `0` if not specified. Accepted values are numbers between 0.0 and 100.0.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<Double> value;

    public Input<Double> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TaskSetScaleGetArgs(
        @Nullable Input<String> unit,
        @Nullable Input<Double> value) {
        this.unit = unit;
        this.value = value;
    }

    private TaskSetScaleGetArgs() {
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScaleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> unit;
        private @Nullable Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScaleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public Builder setValue(@Nullable Input<Double> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public TaskSetScaleGetArgs build() {
            return new TaskSetScaleGetArgs(unit, value);
        }
    }
}
