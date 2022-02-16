// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AwsClusterNetworkingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterNetworkingArgs Empty = new AwsClusterNetworkingArgs();

    @InputImport(name="podAddressCidrBlocks", required=true)
    private final Input<List<String>> podAddressCidrBlocks;

    public Input<List<String>> getPodAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }

    @InputImport(name="serviceAddressCidrBlocks", required=true)
    private final Input<List<String>> serviceAddressCidrBlocks;

    public Input<List<String>> getServiceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }

    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public AwsClusterNetworkingArgs(
        Input<List<String>> podAddressCidrBlocks,
        Input<List<String>> serviceAddressCidrBlocks,
        Input<String> vpcId) {
        this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks, "expected parameter 'podAddressCidrBlocks' to be non-null");
        this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks, "expected parameter 'serviceAddressCidrBlocks' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private AwsClusterNetworkingArgs() {
        this.podAddressCidrBlocks = Input.empty();
        this.serviceAddressCidrBlocks = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterNetworkingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> podAddressCidrBlocks;
        private Input<List<String>> serviceAddressCidrBlocks;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterNetworkingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setPodAddressCidrBlocks(Input<List<String>> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }

        public Builder setPodAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Input.of(Objects.requireNonNull(podAddressCidrBlocks));
            return this;
        }

        public Builder setServiceAddressCidrBlocks(Input<List<String>> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }

        public Builder setServiceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Input.of(Objects.requireNonNull(serviceAddressCidrBlocks));
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }

        public AwsClusterNetworkingArgs build() {
            return new AwsClusterNetworkingArgs(podAddressCidrBlocks, serviceAddressCidrBlocks, vpcId);
        }
    }
}