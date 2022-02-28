// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GetVirtualServiceSpecProviderVirtualNode;
import io.pulumi.aws.appmesh.inputs.GetVirtualServiceSpecProviderVirtualRouter;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetVirtualServiceSpecProvider extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualServiceSpecProvider Empty = new GetVirtualServiceSpecProvider();

    /**
     * The virtual node associated with the virtual service.
     * 
     */
    @InputImport(name="virtualNodes", required=true)
      private final List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes;

    public List<GetVirtualServiceSpecProviderVirtualNode> getVirtualNodes() {
        return this.virtualNodes;
    }

    /**
     * The virtual router associated with the virtual service.
     * 
     */
    @InputImport(name="virtualRouters", required=true)
      private final List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters;

    public List<GetVirtualServiceSpecProviderVirtualRouter> getVirtualRouters() {
        return this.virtualRouters;
    }

    public GetVirtualServiceSpecProvider(
        List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes,
        List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters) {
        this.virtualNodes = Objects.requireNonNull(virtualNodes, "expected parameter 'virtualNodes' to be non-null");
        this.virtualRouters = Objects.requireNonNull(virtualRouters, "expected parameter 'virtualRouters' to be non-null");
    }

    private GetVirtualServiceSpecProvider() {
        this.virtualNodes = List.of();
        this.virtualRouters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpecProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes;
        private List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpecProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodes = defaults.virtualNodes;
    	      this.virtualRouters = defaults.virtualRouters;
        }

        public Builder setVirtualNodes(List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes) {
            this.virtualNodes = Objects.requireNonNull(virtualNodes);
            return this;
        }

        public Builder setVirtualRouters(List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters) {
            this.virtualRouters = Objects.requireNonNull(virtualRouters);
            return this;
        }
        public GetVirtualServiceSpecProvider build() {
            return new GetVirtualServiceSpecProvider(virtualNodes, virtualRouters);
        }
    }
}
