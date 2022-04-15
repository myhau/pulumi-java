// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDedicatedCloudServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDedicatedCloudServiceArgs Empty = new GetDedicatedCloudServiceArgs();

    /**
     * dedicated cloud Service name
     * 
     */
    @Import(name="dedicatedCloudServiceName", required=true)
      private final String dedicatedCloudServiceName;

    public String dedicatedCloudServiceName() {
        return this.dedicatedCloudServiceName;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDedicatedCloudServiceArgs(
        String dedicatedCloudServiceName,
        String resourceGroupName) {
        this.dedicatedCloudServiceName = Objects.requireNonNull(dedicatedCloudServiceName, "expected parameter 'dedicatedCloudServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDedicatedCloudServiceArgs() {
        this.dedicatedCloudServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dedicatedCloudServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedCloudServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedCloudServiceName = defaults.dedicatedCloudServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder dedicatedCloudServiceName(String dedicatedCloudServiceName) {
            this.dedicatedCloudServiceName = Objects.requireNonNull(dedicatedCloudServiceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDedicatedCloudServiceArgs build() {
            return new GetDedicatedCloudServiceArgs(dedicatedCloudServiceName, resourceGroupName);
        }
    }
}
