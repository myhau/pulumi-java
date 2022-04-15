// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListNamedValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListNamedValueArgs Empty = new ListNamedValueArgs();

    /**
     * Identifier of the NamedValue.
     * 
     */
    @Import(name="namedValueId", required=true)
      private final String namedValueId;

    public String namedValueId() {
        return this.namedValueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public ListNamedValueArgs(
        String namedValueId,
        String resourceGroupName,
        String serviceName) {
        this.namedValueId = Objects.requireNonNull(namedValueId, "expected parameter 'namedValueId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ListNamedValueArgs() {
        this.namedValueId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNamedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namedValueId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNamedValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedValueId = defaults.namedValueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder namedValueId(String namedValueId) {
            this.namedValueId = Objects.requireNonNull(namedValueId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public ListNamedValueArgs build() {
            return new ListNamedValueArgs(namedValueId, resourceGroupName, serviceName);
        }
    }
}
