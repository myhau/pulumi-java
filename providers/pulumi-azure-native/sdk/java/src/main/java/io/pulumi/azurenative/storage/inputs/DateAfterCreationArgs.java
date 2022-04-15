// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;


/**
 * Object to define the number of days after creation.
 * 
 */
public final class DateAfterCreationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DateAfterCreationArgs Empty = new DateAfterCreationArgs();

    /**
     * Value indicating the age in days after creation
     * 
     */
    @Import(name="daysAfterCreationGreaterThan", required=true)
      private final Output<Double> daysAfterCreationGreaterThan;

    public Output<Double> daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public DateAfterCreationArgs(Output<Double> daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan, "expected parameter 'daysAfterCreationGreaterThan' to be non-null");
    }

    private DateAfterCreationArgs() {
        this.daysAfterCreationGreaterThan = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterCreationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> daysAfterCreationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterCreationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterCreationGreaterThan = defaults.daysAfterCreationGreaterThan;
        }

        public Builder daysAfterCreationGreaterThan(Output<Double> daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan);
            return this;
        }
        public Builder daysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Output.of(Objects.requireNonNull(daysAfterCreationGreaterThan));
            return this;
        }        public DateAfterCreationArgs build() {
            return new DateAfterCreationArgs(daysAfterCreationGreaterThan);
        }
    }
}
