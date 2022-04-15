// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Model that represents a delay action.
 * 
 */
public final class DelayActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelayActionArgs Empty = new DelayActionArgs();

    /**
     * ISO8601 formatted string that represents a duration.
     * 
     */
    @Import(name="duration", required=true)
      private final Output<String> duration;

    public Output<String> duration() {
        return this.duration;
    }

    /**
     * String that represents a Capability URN.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is 'delay'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public DelayActionArgs(
        Output<String> duration,
        Output<String> name,
        Output<String> type) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelayActionArgs() {
        this.duration = Codegen.empty();
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelayActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> duration;
        private Output<String> name;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelayActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder duration(Output<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Output.of(Objects.requireNonNull(duration));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DelayActionArgs build() {
            return new DelayActionArgs(duration, name, type);
        }
    }
}
