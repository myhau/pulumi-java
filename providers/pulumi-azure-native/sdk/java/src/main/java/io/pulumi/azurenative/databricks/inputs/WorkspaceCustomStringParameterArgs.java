// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The Value.
 * 
 */
public final class WorkspaceCustomStringParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomStringParameterArgs Empty = new WorkspaceCustomStringParameterArgs();

    /**
     * The value which should be used for this field.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public WorkspaceCustomStringParameterArgs(Output<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WorkspaceCustomStringParameterArgs() {
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomStringParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public WorkspaceCustomStringParameterArgs build() {
            return new WorkspaceCustomStringParameterArgs(value);
        }
    }
}
