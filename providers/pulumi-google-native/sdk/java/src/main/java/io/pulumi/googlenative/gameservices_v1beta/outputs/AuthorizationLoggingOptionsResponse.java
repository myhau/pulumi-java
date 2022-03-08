// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AuthorizationLoggingOptionsResponse {
    /**
     * The type of the permission that was checked.
     * 
     */
    private final String permissionType;

    @OutputCustomType.Constructor({"permissionType"})
    private AuthorizationLoggingOptionsResponse(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * The type of the permission that was checked.
     * 
    */
    public String getPermissionType() {
        return this.permissionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String permissionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationLoggingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        public Builder setPermissionType(String permissionType) {
            this.permissionType = Objects.requireNonNull(permissionType);
            return this;
        }
        public AuthorizationLoggingOptionsResponse build() {
            return new AuthorizationLoggingOptionsResponse(permissionType);
        }
    }
}
