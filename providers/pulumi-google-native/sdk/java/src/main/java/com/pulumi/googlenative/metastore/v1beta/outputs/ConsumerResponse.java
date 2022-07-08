// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConsumerResponse {
    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    private final String endpointUri;
    /**
     * @return The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    private final String subnetwork;

    @CustomType.Constructor
    private ConsumerResponse(
        @CustomType.Parameter("endpointUri") String endpointUri,
        @CustomType.Parameter("subnetwork") String subnetwork) {
        this.endpointUri = endpointUri;
        this.subnetwork = subnetwork;
    }

    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    public String endpointUri() {
        return this.endpointUri;
    }
    /**
     * @return The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointUri;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUri = defaults.endpointUri;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }        public ConsumerResponse build() {
            return new ConsumerResponse(endpointUri, subnetwork);
        }
    }
}
