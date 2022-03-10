// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkResponse {
    /**
     * Network on which the workers are created. "default" network is used if empty.
     * 
     */
    private final String network;
    /**
     * Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
     * 
     */
    private final String project;
    /**
     * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor
    private NetworkResponse(
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("project") String project,
        @OutputCustomType.Parameter("subnetwork") String subnetwork) {
        this.network = network;
        this.project = project;
        this.subnetwork = subnetwork;
    }

    /**
     * Network on which the workers are created. "default" network is used if empty.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
     * 
    */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String network;
        private String project;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public NetworkResponse build() {
            return new NetworkResponse(network, project, subnetwork);
        }
    }
}
