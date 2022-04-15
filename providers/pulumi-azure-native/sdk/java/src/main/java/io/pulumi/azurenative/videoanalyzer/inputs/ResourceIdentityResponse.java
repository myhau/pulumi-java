// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The user assigned managed identity to use when accessing a resource.
 * 
 */
public final class ResourceIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceIdentityResponse Empty = new ResourceIdentityResponse();

    /**
     * The user assigned managed identity's resource identifier to use when accessing a resource.
     * 
     */
    @Import(name="userAssignedIdentity", required=true)
      private final String userAssignedIdentity;

    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public ResourceIdentityResponse(String userAssignedIdentity) {
        this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
    }

    private ResourceIdentityResponse() {
        this.userAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }        public ResourceIdentityResponse build() {
            return new ResourceIdentityResponse(userAssignedIdentity);
        }
    }
}
