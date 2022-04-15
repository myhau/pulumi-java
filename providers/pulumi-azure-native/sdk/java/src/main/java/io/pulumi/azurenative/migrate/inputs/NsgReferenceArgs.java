// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines reference to NSG.
 * 
 */
public final class NsgReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NsgReferenceArgs Empty = new NsgReferenceArgs();

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @Import(name="sourceArmResourceId", required=true)
      private final Output<String> sourceArmResourceId;

    public Output<String> sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public NsgReferenceArgs(Output<String> sourceArmResourceId) {
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private NsgReferenceArgs() {
        this.sourceArmResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsgReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NsgReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder sourceArmResourceId(Output<String> sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }
        public Builder sourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Output.of(Objects.requireNonNull(sourceArmResourceId));
            return this;
        }        public NsgReferenceArgs build() {
            return new NsgReferenceArgs(sourceArmResourceId);
        }
    }
}
