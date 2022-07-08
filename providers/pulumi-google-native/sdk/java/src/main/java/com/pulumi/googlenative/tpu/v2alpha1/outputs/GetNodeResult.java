// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v2alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.AttachedDiskResponse;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.NetworkConfigResponse;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.NetworkEndpointResponse;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.SchedulingConfigResponse;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.ServiceAccountResponse;
import com.pulumi.googlenative.tpu.v2alpha1.outputs.SymptomResponse;
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
     * @return The additional data disks for the Node.
     * 
     */
    private final List<AttachedDiskResponse> dataDisks;
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
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Custom metadata to apply to the TPU Node. Can set startup-script and shutdown-script
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return Immutable. The name of the TPU.
     * 
     */
    private final String name;
    /**
     * @return Network configurations for the TPU node.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that runtime clients of the node reach out to the 0th entry in this map first.
     * 
     */
    private final List<NetworkEndpointResponse> networkEndpoints;
    /**
     * @return The runtime version running in the Node.
     * 
     */
    private final String runtimeVersion;
    /**
     * @return The scheduling options for this node.
     * 
     */
    private final SchedulingConfigResponse schedulingConfig;
    /**
     * @return The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is specified, the default compute service account will be used.
     * 
     */
    private final ServiceAccountResponse serviceAccount;
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
     * @return Tags to apply to the TPU Node. Tags are used to identify valid sources or targets for network firewalls.
     * 
     */
    private final List<String> tags;

    @CustomType.Constructor
    private GetNodeResult(
        @CustomType.Parameter("acceleratorType") String acceleratorType,
        @CustomType.Parameter("apiVersion") String apiVersion,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dataDisks") List<AttachedDiskResponse> dataDisks,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthDescription") String healthDescription,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkConfig") NetworkConfigResponse networkConfig,
        @CustomType.Parameter("networkEndpoints") List<NetworkEndpointResponse> networkEndpoints,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion,
        @CustomType.Parameter("schedulingConfig") SchedulingConfigResponse schedulingConfig,
        @CustomType.Parameter("serviceAccount") ServiceAccountResponse serviceAccount,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("symptoms") List<SymptomResponse> symptoms,
        @CustomType.Parameter("tags") List<String> tags) {
        this.acceleratorType = acceleratorType;
        this.apiVersion = apiVersion;
        this.cidrBlock = cidrBlock;
        this.createTime = createTime;
        this.dataDisks = dataDisks;
        this.description = description;
        this.health = health;
        this.healthDescription = healthDescription;
        this.labels = labels;
        this.metadata = metadata;
        this.name = name;
        this.networkConfig = networkConfig;
        this.networkEndpoints = networkEndpoints;
        this.runtimeVersion = runtimeVersion;
        this.schedulingConfig = schedulingConfig;
        this.serviceAccount = serviceAccount;
        this.state = state;
        this.symptoms = symptoms;
        this.tags = tags;
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
     * @return The additional data disks for the Node.
     * 
     */
    public List<AttachedDiskResponse> dataDisks() {
        return this.dataDisks;
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
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Custom metadata to apply to the TPU Node. Can set startup-script and shutdown-script
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return Immutable. The name of the TPU.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network configurations for the TPU node.
     * 
     */
    public NetworkConfigResponse networkConfig() {
        return this.networkConfig;
    }
    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that runtime clients of the node reach out to the 0th entry in this map first.
     * 
     */
    public List<NetworkEndpointResponse> networkEndpoints() {
        return this.networkEndpoints;
    }
    /**
     * @return The runtime version running in the Node.
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * @return The scheduling options for this node.
     * 
     */
    public SchedulingConfigResponse schedulingConfig() {
        return this.schedulingConfig;
    }
    /**
     * @return The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is specified, the default compute service account will be used.
     * 
     */
    public ServiceAccountResponse serviceAccount() {
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
     * @return Tags to apply to the TPU Node. Tags are used to identify valid sources or targets for network firewalls.
     * 
     */
    public List<String> tags() {
        return this.tags;
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
        private List<AttachedDiskResponse> dataDisks;
        private String description;
        private String health;
        private String healthDescription;
        private Map<String,String> labels;
        private Map<String,String> metadata;
        private String name;
        private NetworkConfigResponse networkConfig;
        private List<NetworkEndpointResponse> networkEndpoints;
        private String runtimeVersion;
        private SchedulingConfigResponse schedulingConfig;
        private ServiceAccountResponse serviceAccount;
        private String state;
        private List<SymptomResponse> symptoms;
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.createTime = defaults.createTime;
    	      this.dataDisks = defaults.dataDisks;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.healthDescription = defaults.healthDescription;
    	      this.labels = defaults.labels;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.networkEndpoints = defaults.networkEndpoints;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
    	      this.symptoms = defaults.symptoms;
    	      this.tags = defaults.tags;
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
        public Builder dataDisks(List<AttachedDiskResponse> dataDisks) {
            this.dataDisks = Objects.requireNonNull(dataDisks);
            return this;
        }
        public Builder dataDisks(AttachedDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
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
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }
        public Builder networkEndpoints(List<NetworkEndpointResponse> networkEndpoints) {
            this.networkEndpoints = Objects.requireNonNull(networkEndpoints);
            return this;
        }
        public Builder networkEndpoints(NetworkEndpointResponse... networkEndpoints) {
            return networkEndpoints(List.of(networkEndpoints));
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        public Builder schedulingConfig(SchedulingConfigResponse schedulingConfig) {
            this.schedulingConfig = Objects.requireNonNull(schedulingConfig);
            return this;
        }
        public Builder serviceAccount(ServiceAccountResponse serviceAccount) {
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
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public GetNodeResult build() {
            return new GetNodeResult(acceleratorType, apiVersion, cidrBlock, createTime, dataDisks, description, health, healthDescription, labels, metadata, name, networkConfig, networkEndpoints, runtimeVersion, schedulingConfig, serviceAccount, state, symptoms, tags);
        }
    }
}
