// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.WorkbookUserAssignedIdentitiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer Managed Identity
 * 
 */
public final class WorkbookManagedIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkbookManagedIdentityResponse Empty = new WorkbookManagedIdentityResponse();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Customer Managed Identity
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable WorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

    public Optional<WorkbookUserAssignedIdentitiesResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentities);
    }

    public WorkbookManagedIdentityResponse(
        @Nullable String type,
        @Nullable WorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private WorkbookManagedIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable WorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable WorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public WorkbookManagedIdentityResponse build() {
            return new WorkbookManagedIdentityResponse(type, userAssignedIdentities);
        }
    }
}
