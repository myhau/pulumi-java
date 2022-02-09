// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedVirtualNetworkSettingsResponse {
    private final @Nullable List<String> allowedAadTenantIdsForLinking;
    private final @Nullable Boolean linkedAccessCheckOnTargetResource;
    private final @Nullable Boolean preventDataExfiltration;

    @OutputCustomType.Constructor({"allowedAadTenantIdsForLinking","linkedAccessCheckOnTargetResource","preventDataExfiltration"})
    private ManagedVirtualNetworkSettingsResponse(
        @Nullable List<String> allowedAadTenantIdsForLinking,
        @Nullable Boolean linkedAccessCheckOnTargetResource,
        @Nullable Boolean preventDataExfiltration) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        this.preventDataExfiltration = preventDataExfiltration;
    }

    public List<String> getAllowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking == null ? List.of() : this.allowedAadTenantIdsForLinking;
    }
    public Optional<Boolean> getLinkedAccessCheckOnTargetResource() {
        return Optional.ofNullable(this.linkedAccessCheckOnTargetResource);
    }
    public Optional<Boolean> getPreventDataExfiltration() {
        return Optional.ofNullable(this.preventDataExfiltration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAadTenantIdsForLinking;
        private @Nullable Boolean linkedAccessCheckOnTargetResource;
        private @Nullable Boolean preventDataExfiltration;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAadTenantIdsForLinking = defaults.allowedAadTenantIdsForLinking;
    	      this.linkedAccessCheckOnTargetResource = defaults.linkedAccessCheckOnTargetResource;
    	      this.preventDataExfiltration = defaults.preventDataExfiltration;
        }

        public Builder setAllowedAadTenantIdsForLinking(@Nullable List<String> allowedAadTenantIdsForLinking) {
            this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
            return this;
        }

        public Builder setLinkedAccessCheckOnTargetResource(@Nullable Boolean linkedAccessCheckOnTargetResource) {
            this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
            return this;
        }

        public Builder setPreventDataExfiltration(@Nullable Boolean preventDataExfiltration) {
            this.preventDataExfiltration = preventDataExfiltration;
            return this;
        }

        public ManagedVirtualNetworkSettingsResponse build() {
            return new ManagedVirtualNetworkSettingsResponse(allowedAadTenantIdsForLinking, linkedAccessCheckOnTargetResource, preventDataExfiltration);
        }
    }
}