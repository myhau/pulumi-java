// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    /**
     * Option to configure network egress for the workers.
     * 
     */
    private final String egressOption;
    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to `WorkerPool.project_id` on the service producer network. Must be in the format `projects/{project}/global/networks/{network}`, where `{project}` is a project number, such as `12345`, and `{network}` is the name of a VPC network in the project. See [Understanding network configuration options](https://cloud.google.com/build/docs/private-pools/set-up-private-pool-environment)
     * 
     */
    private final String peeredNetwork;

    @OutputCustomType.Constructor
    private NetworkConfigResponse(
        @OutputCustomType.Parameter("egressOption") String egressOption,
        @OutputCustomType.Parameter("peeredNetwork") String peeredNetwork) {
        this.egressOption = egressOption;
        this.peeredNetwork = peeredNetwork;
    }

    /**
     * Option to configure network egress for the workers.
     * 
    */
    public String getEgressOption() {
        return this.egressOption;
    }
    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to `WorkerPool.project_id` on the service producer network. Must be in the format `projects/{project}/global/networks/{network}`, where `{project}` is a project number, such as `12345`, and `{network}` is the name of a VPC network in the project. See [Understanding network configuration options](https://cloud.google.com/build/docs/private-pools/set-up-private-pool-environment)
     * 
    */
    public String getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String egressOption;
        private String peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressOption = defaults.egressOption;
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder setEgressOption(String egressOption) {
            this.egressOption = Objects.requireNonNull(egressOption);
            return this;
        }

        public Builder setPeeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }
        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(egressOption, peeredNetwork);
        }
    }
}
