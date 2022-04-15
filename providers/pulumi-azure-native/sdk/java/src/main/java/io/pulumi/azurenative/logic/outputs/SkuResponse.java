// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * The name.
     * 
     */
    private final String name;
    /**
     * The reference to plan.
     * 
     */
    private final @Nullable ResourceReferenceResponse plan;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") @Nullable ResourceReferenceResponse plan) {
        this.name = name;
        this.plan = plan;
    }

    /**
     * The name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The reference to plan.
     * 
    */
    public Optional<ResourceReferenceResponse> plan() {
        return Optional.ofNullable(this.plan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable ResourceReferenceResponse plan;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder plan(@Nullable ResourceReferenceResponse plan) {
            this.plan = plan;
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(name, plan);
        }
    }
}
