// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyActionResponse;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyFilterResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that defines the Lifecycle rule. Each definition is made up with a filters set and an actions set.
 * 
 */
public final class ManagementPolicyDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyDefinitionResponse Empty = new ManagementPolicyDefinitionResponse();

    /**
     * An object that defines the action set.
     * 
     */
    @Import(name="actions", required=true)
      private final ManagementPolicyActionResponse actions;

    public ManagementPolicyActionResponse actions() {
        return this.actions;
    }

    /**
     * An object that defines the filter set.
     * 
     */
    @Import(name="filters")
      private final @Nullable ManagementPolicyFilterResponse filters;

    public Optional<ManagementPolicyFilterResponse> filters() {
        return this.filters == null ? Optional.empty() : Optional.ofNullable(this.filters);
    }

    public ManagementPolicyDefinitionResponse(
        ManagementPolicyActionResponse actions,
        @Nullable ManagementPolicyFilterResponse filters) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.filters = filters;
    }

    private ManagementPolicyDefinitionResponse() {
        this.actions = null;
        this.filters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyActionResponse actions;
        private @Nullable ManagementPolicyFilterResponse filters;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.filters = defaults.filters;
        }

        public Builder actions(ManagementPolicyActionResponse actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder filters(@Nullable ManagementPolicyFilterResponse filters) {
            this.filters = filters;
            return this;
        }        public ManagementPolicyDefinitionResponse build() {
            return new ManagementPolicyDefinitionResponse(actions, filters);
        }
    }
}
