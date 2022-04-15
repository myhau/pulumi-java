// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkSegmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkSegmentArgs Empty = new GetWorkloadNetworkSegmentArgs();

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final String privateCloudName;

    public String privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX Segment identifier. Generally the same as the Segment's display name
     * 
     */
    @Import(name="segmentId", required=true)
      private final String segmentId;

    public String segmentId() {
        return this.segmentId;
    }

    public GetWorkloadNetworkSegmentArgs(
        String privateCloudName,
        String resourceGroupName,
        String segmentId) {
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.segmentId = Objects.requireNonNull(segmentId, "expected parameter 'segmentId' to be non-null");
    }

    private GetWorkloadNetworkSegmentArgs() {
        this.privateCloudName = null;
        this.resourceGroupName = null;
        this.segmentId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkSegmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateCloudName;
        private String resourceGroupName;
        private String segmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkSegmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.segmentId = defaults.segmentId;
        }

        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder segmentId(String segmentId) {
            this.segmentId = Objects.requireNonNull(segmentId);
            return this;
        }        public GetWorkloadNetworkSegmentArgs build() {
            return new GetWorkloadNetworkSegmentArgs(privateCloudName, resourceGroupName, segmentId);
        }
    }
}
