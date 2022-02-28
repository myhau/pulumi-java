// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryFilterArgs Empty = new InventoryFilterArgs();

    /**
     * The prefix that an object must have to be included in the inventory results.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public InventoryFilterArgs(@Nullable Input<String> prefix) {
        this.prefix = prefix;
    }

    private InventoryFilterArgs() {
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }
        public InventoryFilterArgs build() {
            return new InventoryFilterArgs(prefix);
        }
    }
}
