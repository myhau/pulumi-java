// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GkeClusterReferenceResponse {
    /**
     * @return The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{locationId}/clusters/{cluster}` * `locations/{locationId}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    private final String cluster;

    @CustomType.Constructor
    private GkeClusterReferenceResponse(@CustomType.Parameter("cluster") String cluster) {
        this.cluster = cluster;
    }

    /**
     * @return The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{locationId}/clusters/{cluster}` * `locations/{locationId}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    public String cluster() {
        return this.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }        public GkeClusterReferenceResponse build() {
            return new GkeClusterReferenceResponse(cluster);
        }
    }
}
