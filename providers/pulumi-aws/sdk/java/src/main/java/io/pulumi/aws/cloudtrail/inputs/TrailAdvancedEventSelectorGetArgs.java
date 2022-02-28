// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailAdvancedEventSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailAdvancedEventSelectorGetArgs Empty = new TrailAdvancedEventSelectorGetArgs();

    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    @InputImport(name="fieldSelectors", required=true)
      private final Input<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors;

    public Input<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> getFieldSelectors() {
        return this.fieldSelectors;
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public TrailAdvancedEventSelectorGetArgs(
        Input<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors,
        @Nullable Input<String> name) {
        this.fieldSelectors = Objects.requireNonNull(fieldSelectors, "expected parameter 'fieldSelectors' to be non-null");
        this.name = name;
    }

    private TrailAdvancedEventSelectorGetArgs() {
        this.fieldSelectors = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailAdvancedEventSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailAdvancedEventSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        public Builder setFieldSelectors(Input<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors) {
            this.fieldSelectors = Objects.requireNonNull(fieldSelectors);
            return this;
        }

        public Builder setFieldSelectors(List<TrailAdvancedEventSelectorFieldSelectorGetArgs> fieldSelectors) {
            this.fieldSelectors = Input.of(Objects.requireNonNull(fieldSelectors));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public TrailAdvancedEventSelectorGetArgs build() {
            return new TrailAdvancedEventSelectorGetArgs(fieldSelectors, name);
        }
    }
}
