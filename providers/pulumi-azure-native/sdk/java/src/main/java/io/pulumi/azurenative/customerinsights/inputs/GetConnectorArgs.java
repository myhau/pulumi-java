// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    /**
     * The name of the connector.
     * 
     */
    @Import(name="connectorName", required=true)
      private final String connectorName;

    public String connectorName() {
        return this.connectorName;
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final String hubName;

    public String hubName() {
        return this.hubName;
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

    public GetConnectorArgs(
        String connectorName,
        String hubName,
        String resourceGroupName) {
        this.connectorName = Objects.requireNonNull(connectorName, "expected parameter 'connectorName' to be non-null");
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConnectorArgs() {
        this.connectorName = null;
        this.hubName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorName;
        private String hubName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorName = defaults.connectorName;
    	      this.hubName = defaults.hubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder connectorName(String connectorName) {
            this.connectorName = Objects.requireNonNull(connectorName);
            return this;
        }
        public Builder hubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetConnectorArgs build() {
            return new GetConnectorArgs(connectorName, hubName, resourceGroupName);
        }
    }
}
