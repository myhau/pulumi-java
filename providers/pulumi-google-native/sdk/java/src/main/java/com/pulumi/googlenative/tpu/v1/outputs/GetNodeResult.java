// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.tpu.v1.outputs.NetworkEndpointResponse;
import com.pulumi.googlenative.tpu.v1.outputs.SchedulingConfigResponse;
import com.pulumi.googlenative.tpu.v1.outputs.SymptomResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodeResult {
    /**
     * @return The type of hardware accelerators associated with this node.
     * 
     */
    private final String acceleratorType;
    /**
     * @return The API version that created this Node.
     * 
     */
    private final String apiVersion;
    /**
     * @return The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    private final String cidrBlock;
    /**
     * @return The time when the node was created.
     * 
     */
    private final String createTime;
    /**
     * @return The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    private final String description;
    /**
     * @return The health status of the TPU node.
     * 
     */
    private final String health;
    /**
     * @return If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
     */
    private final String healthDescription;
    /**
     * @return DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances.
     * 
     * @deprecated
     * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances.
     * 
     */
    @Deprecated /* Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances. */
    private final String ipAddress;
    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Immutable. The name of the TPU
     * 
     */
    private final String name;
    /**
     * @return The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
     * 
     */
    private final String network;
    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
     */
    private final List<NetworkEndpointResponse> networkEndpoints;
    /**
     * @return DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances.
     * 
     * @deprecated
     * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances.
     * 
     */
    @Deprecated /* Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances. */
    private final String port;
    /**
     * @return The scheduling options for this node.
     * 
     */
    private final SchedulingConfigResponse schedulingConfig;
    /**
     * @return The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    private final String serviceAccount;
    /**
     * @return The current state for the TPU Node.
     * 
     */
    private final String state;
    /**
     * @return The Symptoms that have occurred to the TPU Node.
     * 
     */
    private final List<SymptomResponse> symptoms;
    /**
     * @return The version of Tensorflow running in the Node.
     * 
     */
    private final String tensorflowVersion;
    /**
     * @return Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    private final Boolean useServiceNetworking;

    @CustomType.Constructor
    private GetNodeResult(
        @CustomType.Parameter("acceleratorType") String acceleratorType,
        @CustomType.Parameter("apiVersion") String apiVersion,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthDescription") String healthDescription,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkEndpoints") List<NetworkEndpointResponse> networkEndpoints,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("schedulingConfig") SchedulingConfigResponse schedulingConfig,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("symptoms") List<SymptomResponse> symptoms,
        @CustomType.Parameter("tensorflowVersion") String tensorflowVersion,
        @CustomType.Parameter("useServiceNetworking") Boolean useServiceNetworking) {
        this.acceleratorType = acceleratorType;
        this.apiVersion = apiVersion;
        this.cidrBlock = cidrBlock;
        this.createTime = createTime;
        this.description = description;
        this.health = health;
        this.healthDescription = healthDescription;
        this.ipAddress = ipAddress;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.networkEndpoints = networkEndpoints;
        this.port = port;
        this.schedulingConfig = schedulingConfig;
        this.serviceAccount = serviceAccount;
        this.state = state;
        this.symptoms = symptoms;
        this.tensorflowVersion = tensorflowVersion;
        this.useServiceNetworking = useServiceNetworking;
    }

    /**
     * @return The type of hardware accelerators associated with this node.
     * 
     */
    public String acceleratorType() {
        return this.acceleratorType;
    }
    /**
     * @return The API version that created this Node.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return The time when the node was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The health status of the TPU node.
     * 
     */
    public String health() {
        return this.health;
    }
    /**
     * @return If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
     */
    public String healthDescription() {
        return this.healthDescription;
    }
    /**
     * @return DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances.
     * 
     * @deprecated
     * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances.
     * 
     */
    @Deprecated /* Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances. */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Immutable. The name of the TPU
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
     */
    public List<NetworkEndpointResponse> networkEndpoints() {
        return this.networkEndpoints;
    }
    /**
     * @return DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances.
     * 
     * @deprecated
     * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances.
     * 
     */
    @Deprecated /* Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances. */
    public String port() {
        return this.port;
    }
    /**
     * @return The scheduling options for this node.
     * 
     */
    public SchedulingConfigResponse schedulingConfig() {
        return this.schedulingConfig;
    }
    /**
     * @return The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return The current state for the TPU Node.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The Symptoms that have occurred to the TPU Node.
     * 
     */
    public List<SymptomResponse> symptoms() {
        return this.symptoms;
    }
    /**
     * @return The version of Tensorflow running in the Node.
     * 
     */
    public String tensorflowVersion() {
        return this.tensorflowVersion;
    }
    /**
     * @return Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    public Boolean useServiceNetworking() {
        return this.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;
        private String apiVersion;
        private String cidrBlock;
        private String createTime;
        private String description;
        private String health;
        private String healthDescription;
        private String ipAddress;
        private Map<String,String> labels;
        private String name;
        private String network;
        private List<NetworkEndpointResponse> networkEndpoints;
        private String port;
        private SchedulingConfigResponse schedulingConfig;
        private String serviceAccount;
        private String state;
        private List<SymptomResponse> symptoms;
        private String tensorflowVersion;
        private Boolean useServiceNetworking;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.healthDescription = defaults.healthDescription;
    	      this.ipAddress = defaults.ipAddress;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpoints = defaults.networkEndpoints;
    	      this.port = defaults.port;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
    	      this.symptoms = defaults.symptoms;
    	      this.tensorflowVersion = defaults.tensorflowVersion;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthDescription(String healthDescription) {
            this.healthDescription = Objects.requireNonNull(healthDescription);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkEndpoints(List<NetworkEndpointResponse> networkEndpoints) {
            this.networkEndpoints = Objects.requireNonNull(networkEndpoints);
            return this;
        }
        public Builder networkEndpoints(NetworkEndpointResponse... networkEndpoints) {
            return networkEndpoints(List.of(networkEndpoints));
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder schedulingConfig(SchedulingConfigResponse schedulingConfig) {
            this.schedulingConfig = Objects.requireNonNull(schedulingConfig);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder symptoms(List<SymptomResponse> symptoms) {
            this.symptoms = Objects.requireNonNull(symptoms);
            return this;
        }
        public Builder symptoms(SymptomResponse... symptoms) {
            return symptoms(List.of(symptoms));
        }
        public Builder tensorflowVersion(String tensorflowVersion) {
            this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion);
            return this;
        }
        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            this.useServiceNetworking = Objects.requireNonNull(useServiceNetworking);
            return this;
        }        public GetNodeResult build() {
            return new GetNodeResult(acceleratorType, apiVersion, cidrBlock, createTime, description, health, healthDescription, ipAddress, labels, name, network, networkEndpoints, port, schedulingConfig, serviceAccount, state, symptoms, tensorflowVersion, useServiceNetworking);
        }
    }
}
