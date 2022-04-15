// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListStaticSiteBuildFunctionAppSettingsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStaticSiteBuildFunctionAppSettingsArgs Empty = new ListStaticSiteBuildFunctionAppSettingsArgs();

    /**
     * The stage site identifier.
     * 
     */
    @Import(name="environmentName", required=true)
      private final String environmentName;

    public String environmentName() {
        return this.environmentName;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public ListStaticSiteBuildFunctionAppSettingsArgs(
        String environmentName,
        String name,
        String resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListStaticSiteBuildFunctionAppSettingsArgs() {
        this.environmentName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStaticSiteBuildFunctionAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStaticSiteBuildFunctionAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public ListStaticSiteBuildFunctionAppSettingsArgs build() {
            return new ListStaticSiteBuildFunctionAppSettingsArgs(environmentName, name, resourceGroupName);
        }
    }
}
