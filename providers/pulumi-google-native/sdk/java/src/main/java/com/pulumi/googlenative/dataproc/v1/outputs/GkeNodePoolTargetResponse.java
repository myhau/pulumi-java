// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1.outputs.GkeNodePoolConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GkeNodePoolTargetResponse {
    /**
     * @return The target GKE node pool. Format: &#39;projects/{project}/locations/{location}/clusters/{cluster}/nodePools/{node_pool}&#39;
     * 
     */
    private final String nodePool;
    /**
     * @return Input only. The configuration for the GKE node pool.If specified, Dataproc attempts to create a node pool with the specified shape. If one with the same name already exists, it is verified against all specified fields. If a field differs, the virtual cluster creation will fail.If omitted, any node pool with the specified name is used. If a node pool with the specified name does not exist, Dataproc create a node pool with default values.This is an input only field. It will not be returned by the API.
     * 
     */
    private final GkeNodePoolConfigResponse nodePoolConfig;
    /**
     * @return The roles associated with the GKE node pool.
     * 
     */
    private final List<String> roles;

    @CustomType.Constructor
    private GkeNodePoolTargetResponse(
        @CustomType.Parameter("nodePool") String nodePool,
        @CustomType.Parameter("nodePoolConfig") GkeNodePoolConfigResponse nodePoolConfig,
        @CustomType.Parameter("roles") List<String> roles) {
        this.nodePool = nodePool;
        this.nodePoolConfig = nodePoolConfig;
        this.roles = roles;
    }

    /**
     * @return The target GKE node pool. Format: &#39;projects/{project}/locations/{location}/clusters/{cluster}/nodePools/{node_pool}&#39;
     * 
     */
    public String nodePool() {
        return this.nodePool;
    }
    /**
     * @return Input only. The configuration for the GKE node pool.If specified, Dataproc attempts to create a node pool with the specified shape. If one with the same name already exists, it is verified against all specified fields. If a field differs, the virtual cluster creation will fail.If omitted, any node pool with the specified name is used. If a node pool with the specified name does not exist, Dataproc create a node pool with default values.This is an input only field. It will not be returned by the API.
     * 
     */
    public GkeNodePoolConfigResponse nodePoolConfig() {
        return this.nodePoolConfig;
    }
    /**
     * @return The roles associated with the GKE node pool.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeNodePoolTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodePool;
        private GkeNodePoolConfigResponse nodePoolConfig;
        private List<String> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeNodePoolTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodePool = defaults.nodePool;
    	      this.nodePoolConfig = defaults.nodePoolConfig;
    	      this.roles = defaults.roles;
        }

        public Builder nodePool(String nodePool) {
            this.nodePool = Objects.requireNonNull(nodePool);
            return this;
        }
        public Builder nodePoolConfig(GkeNodePoolConfigResponse nodePoolConfig) {
            this.nodePoolConfig = Objects.requireNonNull(nodePoolConfig);
            return this;
        }
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }        public GkeNodePoolTargetResponse build() {
            return new GkeNodePoolTargetResponse(nodePool, nodePoolConfig, roles);
        }
    }
}
