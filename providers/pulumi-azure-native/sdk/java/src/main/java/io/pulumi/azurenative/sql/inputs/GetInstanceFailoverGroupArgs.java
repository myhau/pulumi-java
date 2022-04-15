// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceFailoverGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceFailoverGroupArgs Empty = new GetInstanceFailoverGroupArgs();

    /**
     * The name of the failover group.
     * 
     */
    @Import(name="failoverGroupName", required=true)
      private final String failoverGroupName;

    public String failoverGroupName() {
        return this.failoverGroupName;
    }

    /**
     * The name of the region where the resource is located.
     * 
     */
    @Import(name="locationName", required=true)
      private final String locationName;

    public String locationName() {
        return this.locationName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetInstanceFailoverGroupArgs(
        String failoverGroupName,
        String locationName,
        String resourceGroupName) {
        this.failoverGroupName = Objects.requireNonNull(failoverGroupName, "expected parameter 'failoverGroupName' to be non-null");
        this.locationName = Objects.requireNonNull(locationName, "expected parameter 'locationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetInstanceFailoverGroupArgs() {
        this.failoverGroupName = null;
        this.locationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceFailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failoverGroupName;
        private String locationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceFailoverGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverGroupName = defaults.failoverGroupName;
    	      this.locationName = defaults.locationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder failoverGroupName(String failoverGroupName) {
            this.failoverGroupName = Objects.requireNonNull(failoverGroupName);
            return this;
        }
        public Builder locationName(String locationName) {
            this.locationName = Objects.requireNonNull(locationName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetInstanceFailoverGroupArgs build() {
            return new GetInstanceFailoverGroupArgs(failoverGroupName, locationName, resourceGroupName);
        }
    }
}
