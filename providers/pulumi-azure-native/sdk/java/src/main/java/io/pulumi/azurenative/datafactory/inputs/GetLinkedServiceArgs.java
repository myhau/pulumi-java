// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkedServiceArgs Empty = new GetLinkedServiceArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
      private final String factoryName;

    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The linked service name.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final String linkedServiceName;

    public String linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLinkedServiceArgs(
        String factoryName,
        String linkedServiceName,
        String resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLinkedServiceArgs() {
        this.factoryName = null;
        this.linkedServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String linkedServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder factoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }
        public Builder linkedServiceName(String linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetLinkedServiceArgs build() {
            return new GetLinkedServiceArgs(factoryName, linkedServiceName, resourceGroupName);
        }
    }
}
