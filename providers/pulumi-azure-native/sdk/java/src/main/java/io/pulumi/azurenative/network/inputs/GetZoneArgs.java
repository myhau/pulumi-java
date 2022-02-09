// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetZoneArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetZoneArgs Empty = new GetZoneArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="zoneName", required=true)
    private final String zoneName;

    public String getZoneName() {
        return this.zoneName;
    }

    public GetZoneArgs(
        String resourceGroupName,
        String zoneName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.zoneName = Objects.requireNonNull(zoneName, "expected parameter 'zoneName' to be non-null");
    }

    private GetZoneArgs() {
        this.resourceGroupName = null;
        this.zoneName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String zoneName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.zoneName = defaults.zoneName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setZoneName(String zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }

        public GetZoneArgs build() {
            return new GetZoneArgs(resourceGroupName, zoneName);
        }
    }
}