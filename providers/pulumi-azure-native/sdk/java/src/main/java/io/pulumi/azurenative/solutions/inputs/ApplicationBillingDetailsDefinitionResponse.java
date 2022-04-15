// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed application billing details definition.
 * 
 */
public final class ApplicationBillingDetailsDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationBillingDetailsDefinitionResponse Empty = new ApplicationBillingDetailsDefinitionResponse();

    /**
     * The managed application resource usage Id.
     * 
     */
    @Import(name="resourceUsageId")
      private final @Nullable String resourceUsageId;

    public Optional<String> resourceUsageId() {
        return this.resourceUsageId == null ? Optional.empty() : Optional.ofNullable(this.resourceUsageId);
    }

    public ApplicationBillingDetailsDefinitionResponse(@Nullable String resourceUsageId) {
        this.resourceUsageId = resourceUsageId;
    }

    private ApplicationBillingDetailsDefinitionResponse() {
        this.resourceUsageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationBillingDetailsDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceUsageId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationBillingDetailsDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUsageId = defaults.resourceUsageId;
        }

        public Builder resourceUsageId(@Nullable String resourceUsageId) {
            this.resourceUsageId = resourceUsageId;
            return this;
        }        public ApplicationBillingDetailsDefinitionResponse build() {
            return new ApplicationBillingDetailsDefinitionResponse(resourceUsageId);
        }
    }
}
