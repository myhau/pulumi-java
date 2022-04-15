// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExtensionArgs Empty = new GetExtensionArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
      private final String clusterResourceName;

    public String clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
      private final String clusterRp;

    public String clusterRp() {
        return this.clusterRp;
    }

    /**
     * Name of an instance of the Extension.
     * 
     */
    @Import(name="extensionInstanceName", required=true)
      private final String extensionInstanceName;

    public String extensionInstanceName() {
        return this.extensionInstanceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExtensionArgs(
        String clusterName,
        String clusterResourceName,
        String clusterRp,
        String extensionInstanceName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.extensionInstanceName = Objects.requireNonNull(extensionInstanceName, "expected parameter 'extensionInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExtensionArgs() {
        this.clusterName = null;
        this.clusterResourceName = null;
        this.clusterRp = null;
        this.extensionInstanceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String clusterResourceName;
        private String clusterRp;
        private String extensionInstanceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.extensionInstanceName = defaults.extensionInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }
        public Builder clusterRp(String clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }
        public Builder extensionInstanceName(String extensionInstanceName) {
            this.extensionInstanceName = Objects.requireNonNull(extensionInstanceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetExtensionArgs build() {
            return new GetExtensionArgs(clusterName, clusterResourceName, clusterRp, extensionInstanceName, resourceGroupName);
        }
    }
}
