// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GkeClusterResponse {
    /**
     * @return Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    private final String cluster;
    /**
     * @return Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    private final Boolean internalIp;

    @CustomType.Constructor
    private GkeClusterResponse(
        @CustomType.Parameter("cluster") String cluster,
        @CustomType.Parameter("internalIp") Boolean internalIp) {
        this.cluster = cluster;
        this.internalIp = internalIp;
    }

    /**
     * @return Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    public Boolean internalIp() {
        return this.internalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private Boolean internalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.internalIp = defaults.internalIp;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder internalIp(Boolean internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }        public GkeClusterResponse build() {
            return new GkeClusterResponse(cluster, internalIp);
        }
    }
}
