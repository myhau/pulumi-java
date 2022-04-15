// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.AutoscaleCapacityArgs;
import io.pulumi.azurenative.hdinsight.inputs.AutoscaleRecurrenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The autoscale request parameters
 * 
 */
public final class AutoscaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscaleArgs Empty = new AutoscaleArgs();

    /**
     * Parameters for load-based autoscale
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<AutoscaleCapacityArgs> capacity;

    public Output<AutoscaleCapacityArgs> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Parameters for schedule-based autoscale
     * 
     */
    @Import(name="recurrence")
      private final @Nullable Output<AutoscaleRecurrenceArgs> recurrence;

    public Output<AutoscaleRecurrenceArgs> recurrence() {
        return this.recurrence == null ? Codegen.empty() : this.recurrence;
    }

    public AutoscaleArgs(
        @Nullable Output<AutoscaleCapacityArgs> capacity,
        @Nullable Output<AutoscaleRecurrenceArgs> recurrence) {
        this.capacity = capacity;
        this.recurrence = recurrence;
    }

    private AutoscaleArgs() {
        this.capacity = Codegen.empty();
        this.recurrence = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscaleCapacityArgs> capacity;
        private @Nullable Output<AutoscaleRecurrenceArgs> recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder capacity(@Nullable Output<AutoscaleCapacityArgs> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable AutoscaleCapacityArgs capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder recurrence(@Nullable Output<AutoscaleRecurrenceArgs> recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public Builder recurrence(@Nullable AutoscaleRecurrenceArgs recurrence) {
            this.recurrence = Codegen.ofNullable(recurrence);
            return this;
        }        public AutoscaleArgs build() {
            return new AutoscaleArgs(capacity, recurrence);
        }
    }
}
