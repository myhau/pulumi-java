// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.composer.v1beta1.outputs.IPAllocationPolicyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodeConfigResponse {
    /**
     * @return Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * @return Optional. Deploys &#39;ip-masq-agent&#39; daemon set in the GKE cluster and defines nonMasqueradeCIDRs equals to pod IP range so IP masquerading is used for all destination addresses, except between pods traffic. See: https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent
     * 
     */
    private final Boolean enableIpMasqAgent;
    /**
     * @return Optional. The IPAllocationPolicy fields for the GKE cluster.
     * 
     */
    private final IPAllocationPolicyResponse ipAllocationPolicy;
    /**
     * @return Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String location;
    /**
     * @return Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String machineType;
    /**
     * @return Optional. The maximum number of pods per node in the Cloud Composer GKE cluster. The value must be between 8 and 110 and it can be set only if the environment is VPC-native. The default value is 32. Values of this field will be propagated both to the `default-pool` node pool of the newly created GKE cluster, and to the default &#34;Maximum Pods per Node&#34; value which is used for newly created node pools if their value is not explicitly set during node pool creation. For more information, see [Optimizing IP address allocation] (https://cloud.google.com/kubernetes-engine/docs/how-to/flexible-pod-cidr). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final Integer maxPodsPerNode;
    /**
     * @return Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the default network in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
     * 
     */
    private final String network;
    /**
     * @return Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final List<String> oauthScopes;
    /**
     * @return Optional. The Google Cloud Platform Service Account to be used by the workloads. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
     * 
     */
    private final String subnetwork;
    /**
     * @return Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final List<String> tags;

    @CustomType.Constructor
    private NodeConfigResponse(
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("enableIpMasqAgent") Boolean enableIpMasqAgent,
        @CustomType.Parameter("ipAllocationPolicy") IPAllocationPolicyResponse ipAllocationPolicy,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("maxPodsPerNode") Integer maxPodsPerNode,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("tags") List<String> tags) {
        this.diskSizeGb = diskSizeGb;
        this.enableIpMasqAgent = enableIpMasqAgent;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.location = location;
        this.machineType = machineType;
        this.maxPodsPerNode = maxPodsPerNode;
        this.network = network;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
        this.subnetwork = subnetwork;
        this.tags = tags;
    }

    /**
     * @return Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Optional. Deploys &#39;ip-masq-agent&#39; daemon set in the GKE cluster and defines nonMasqueradeCIDRs equals to pod IP range so IP masquerading is used for all destination addresses, except between pods traffic. See: https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent
     * 
     */
    public Boolean enableIpMasqAgent() {
        return this.enableIpMasqAgent;
    }
    /**
     * @return Optional. The IPAllocationPolicy fields for the GKE cluster.
     * 
     */
    public IPAllocationPolicyResponse ipAllocationPolicy() {
        return this.ipAllocationPolicy;
    }
    /**
     * @return Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Optional. The maximum number of pods per node in the Cloud Composer GKE cluster. The value must be between 8 and 110 and it can be set only if the environment is VPC-native. The default value is 32. Values of this field will be propagated both to the `default-pool` node pool of the newly created GKE cluster, and to the default &#34;Maximum Pods per Node&#34; value which is used for newly created node pools if their value is not explicitly set during node pool creation. For more information, see [Optimizing IP address allocation] (https://cloud.google.com/kubernetes-engine/docs/how-to/flexible-pod-cidr). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Integer maxPodsPerNode() {
        return this.maxPodsPerNode;
    }
    /**
     * @return Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the default network in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes;
    }
    /**
     * @return Optional. The Google Cloud Platform Service Account to be used by the workloads. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * @return Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private Boolean enableIpMasqAgent;
        private IPAllocationPolicyResponse ipAllocationPolicy;
        private String location;
        private String machineType;
        private Integer maxPodsPerNode;
        private String network;
        private List<String> oauthScopes;
        private String serviceAccount;
        private String subnetwork;
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicy = defaults.ipAllocationPolicy;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder enableIpMasqAgent(Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
            return this;
        }
        public Builder ipAllocationPolicy(IPAllocationPolicyResponse ipAllocationPolicy) {
            this.ipAllocationPolicy = Objects.requireNonNull(ipAllocationPolicy);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public NodeConfigResponse build() {
            return new NodeConfigResponse(diskSizeGb, enableIpMasqAgent, ipAllocationPolicy, location, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags);
        }
    }
}
