// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * The cluster size
     * 
     */
    @Import(name="clusterSize", required=true)
      private final Output<Integer> clusterSize;

    public Output<Integer> clusterSize() {
        return this.clusterSize;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final Output<String> privateCloudName;

    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The cluster SKU
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    public ClusterArgs(
        @Nullable Output<String> clusterName,
        Output<Integer> clusterSize,
        Output<String> privateCloudName,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku) {
        this.clusterName = clusterName;
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private ClusterArgs() {
        this.clusterName = Codegen.empty();
        this.clusterSize = Codegen.empty();
        this.privateCloudName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterName;
        private Output<Integer> clusterSize;
        private Output<String> privateCloudName;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterSize = defaults.clusterSize;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder clusterSize(Output<Integer> clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = Output.of(Objects.requireNonNull(clusterSize));
            return this;
        }
        public Builder privateCloudName(Output<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Output.of(Objects.requireNonNull(privateCloudName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(clusterName, clusterSize, privateCloudName, resourceGroupName, sku);
        }
    }
}
