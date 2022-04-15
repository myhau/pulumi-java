// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceRoleProfilePropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the role profile for the cloud service.
 * 
 */
public final class CloudServiceRoleProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudServiceRoleProfileResponse Empty = new CloudServiceRoleProfileResponse();

    /**
     * List of roles for the cloud service.
     * 
     */
    @Import(name="roles")
      private final @Nullable List<CloudServiceRoleProfilePropertiesResponse> roles;

    public List<CloudServiceRoleProfilePropertiesResponse> roles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public CloudServiceRoleProfileResponse(@Nullable List<CloudServiceRoleProfilePropertiesResponse> roles) {
        this.roles = roles;
    }

    private CloudServiceRoleProfileResponse() {
        this.roles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CloudServiceRoleProfilePropertiesResponse> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
        }

        public Builder roles(@Nullable List<CloudServiceRoleProfilePropertiesResponse> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(CloudServiceRoleProfilePropertiesResponse... roles) {
            return roles(List.of(roles));
        }        public CloudServiceRoleProfileResponse build() {
            return new CloudServiceRoleProfileResponse(roles);
        }
    }
}
