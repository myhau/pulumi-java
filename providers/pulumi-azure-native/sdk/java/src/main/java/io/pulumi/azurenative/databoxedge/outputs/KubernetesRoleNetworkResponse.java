// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.CniConfigResponse;
import io.pulumi.azurenative.databoxedge.outputs.LoadBalancerConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class KubernetesRoleNetworkResponse {
    /**
     * Cni configuration
     * 
     */
    private final CniConfigResponse cniConfig;
    /**
     * Load balancer configuration
     * 
     */
    private final LoadBalancerConfigResponse loadBalancerConfig;

    @OutputCustomType.Constructor({"cniConfig","loadBalancerConfig"})
    private KubernetesRoleNetworkResponse(
        CniConfigResponse cniConfig,
        LoadBalancerConfigResponse loadBalancerConfig) {
        this.cniConfig = cniConfig;
        this.loadBalancerConfig = loadBalancerConfig;
    }

    /**
     * Cni configuration
     * 
    */
    public CniConfigResponse getCniConfig() {
        return this.cniConfig;
    }
    /**
     * Load balancer configuration
     * 
    */
    public LoadBalancerConfigResponse getLoadBalancerConfig() {
        return this.loadBalancerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CniConfigResponse cniConfig;
        private LoadBalancerConfigResponse loadBalancerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cniConfig = defaults.cniConfig;
    	      this.loadBalancerConfig = defaults.loadBalancerConfig;
        }

        public Builder setCniConfig(CniConfigResponse cniConfig) {
            this.cniConfig = Objects.requireNonNull(cniConfig);
            return this;
        }

        public Builder setLoadBalancerConfig(LoadBalancerConfigResponse loadBalancerConfig) {
            this.loadBalancerConfig = Objects.requireNonNull(loadBalancerConfig);
            return this;
        }
        public KubernetesRoleNetworkResponse build() {
            return new KubernetesRoleNetworkResponse(cniConfig, loadBalancerConfig);
        }
    }
}
