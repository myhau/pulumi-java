// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EndpointResponse {
    /**
     * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
     * 
     */
    private final String cloudSqlInstance;
    /**
     * A cluster URI for [Google Kubernetes Engine master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
     * 
     */
    private final String gkeMasterCluster;
    /**
     * A Compute Engine instance URI.
     * 
     */
    private final String instance;
    /**
     * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs/load-balancing-overview).
     * 
     */
    private final String ipAddress;
    /**
     * A Compute Engine network URI.
     * 
     */
    private final String network;
    /**
     * Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source.
     * 
     */
    private final String networkType;
    /**
     * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
     * 
     */
    private final Integer port;
    /**
     * Project ID where the endpoint is located. The Project ID can be derived from the URI if you provide a VM instance or network URI. The following are two cases where you must provide the project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2. When you are using Shared VPC and the IP address that you provide is from the service project. In this case, the network that the IP address resides in is defined in the host project.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor
    private EndpointResponse(
        @OutputCustomType.Parameter("cloudSqlInstance") String cloudSqlInstance,
        @OutputCustomType.Parameter("gkeMasterCluster") String gkeMasterCluster,
        @OutputCustomType.Parameter("instance") String instance,
        @OutputCustomType.Parameter("ipAddress") String ipAddress,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("networkType") String networkType,
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("project") String project) {
        this.cloudSqlInstance = cloudSqlInstance;
        this.gkeMasterCluster = gkeMasterCluster;
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.network = network;
        this.networkType = networkType;
        this.port = port;
        this.project = project;
    }

    /**
     * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
     * 
    */
    public String getCloudSqlInstance() {
        return this.cloudSqlInstance;
    }
    /**
     * A cluster URI for [Google Kubernetes Engine master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
     * 
    */
    public String getGkeMasterCluster() {
        return this.gkeMasterCluster;
    }
    /**
     * A Compute Engine instance URI.
     * 
    */
    public String getInstance() {
        return this.instance;
    }
    /**
     * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs/load-balancing-overview).
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * A Compute Engine network URI.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source.
     * 
    */
    public String getNetworkType() {
        return this.networkType;
    }
    /**
     * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Project ID where the endpoint is located. The Project ID can be derived from the URI if you provide a VM instance or network URI. The following are two cases where you must provide the project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2. When you are using Shared VPC and the IP address that you provide is from the service project. In this case, the network that the IP address resides in is defined in the host project.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlInstance;
        private String gkeMasterCluster;
        private String instance;
        private String ipAddress;
        private String network;
        private String networkType;
        private Integer port;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.gkeMasterCluster = defaults.gkeMasterCluster;
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
        }

        public Builder setCloudSqlInstance(String cloudSqlInstance) {
            this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
            return this;
        }

        public Builder setGkeMasterCluster(String gkeMasterCluster) {
            this.gkeMasterCluster = Objects.requireNonNull(gkeMasterCluster);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public EndpointResponse build() {
            return new EndpointResponse(cloudSqlInstance, gkeMasterCluster, instance, ipAddress, network, networkType, port, project);
        }
    }
}
