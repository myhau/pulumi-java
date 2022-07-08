// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AccessSelectorResponse {
    /**
     * @return Optional. The permissions to appear in result.
     * 
     */
    private final List<String> permissions;
    /**
     * @return Optional. The roles to appear in result.
     * 
     */
    private final List<String> roles;

    @CustomType.Constructor
    private AccessSelectorResponse(
        @CustomType.Parameter("permissions") List<String> permissions,
        @CustomType.Parameter("roles") List<String> roles) {
        this.permissions = permissions;
        this.roles = roles;
    }

    /**
     * @return Optional. The permissions to appear in result.
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @return Optional. The roles to appear in result.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> permissions;
        private List<String> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.roles = defaults.roles;
        }

        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }        public AccessSelectorResponse build() {
            return new AccessSelectorResponse(permissions, roles);
        }
    }
}
