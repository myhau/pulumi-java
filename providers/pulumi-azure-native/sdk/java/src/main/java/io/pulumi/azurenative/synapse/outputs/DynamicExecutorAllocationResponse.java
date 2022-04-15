// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DynamicExecutorAllocationResponse {
    /**
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private DynamicExecutorAllocationResponse(@CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicExecutorAllocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicExecutorAllocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public DynamicExecutorAllocationResponse build() {
            return new DynamicExecutorAllocationResponse(enabled);
        }
    }
}
