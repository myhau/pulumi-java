// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.CircuitResponse;
import io.pulumi.azurenative.avs.outputs.EndpointsResponse;
import io.pulumi.azurenative.avs.outputs.IdentitySourceResponse;
import io.pulumi.azurenative.avs.outputs.ManagementClusterResponse;
import io.pulumi.azurenative.avs.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateCloudResult {
    /**
     * An ExpressRoute Circuit
     * 
     */
    private final @Nullable CircuitResponse circuit;
    /**
     * The endpoints
     * 
     */
    private final EndpointsResponse endpoints;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * vCenter Single Sign On Identity Sources
     * 
     */
    private final @Nullable List<IdentitySourceResponse> identitySources;
    /**
     * Connectivity to internet is enabled or disabled
     * 
     */
    private final @Nullable String internet;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * The default cluster used for management
     * 
     */
    private final ManagementClusterResponse managementCluster;
    /**
     * Network used to access vCenter Server and NSX-T Manager
     * 
     */
    private final String managementNetwork;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The block of addresses should be unique across VNet in your subscription as well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X is between 0 and 22
     * 
     */
    private final String networkBlock;
    /**
     * Thumbprint of the NSX-T Manager SSL certificate
     * 
     */
    private final String nsxtCertificateThumbprint;
    /**
     * Optionally, set the NSX-T Manager password when the private cloud is created
     * 
     */
    private final @Nullable String nsxtPassword;
    /**
     * Used for virtual machine cold migration, cloning, and snapshot migration
     * 
     */
    private final String provisioningNetwork;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * The private cloud SKU
     * 
     */
    private final SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Thumbprint of the vCenter Server SSL certificate
     * 
     */
    private final String vcenterCertificateThumbprint;
    /**
     * Optionally, set the vCenter admin password when the private cloud is created
     * 
     */
    private final @Nullable String vcenterPassword;
    /**
     * Used for live migration of virtual machines
     * 
     */
    private final String vmotionNetwork;

    @OutputCustomType.Constructor({"circuit","endpoints","id","identitySources","internet","location","managementCluster","managementNetwork","name","networkBlock","nsxtCertificateThumbprint","nsxtPassword","provisioningNetwork","provisioningState","sku","tags","type","vcenterCertificateThumbprint","vcenterPassword","vmotionNetwork"})
    private GetPrivateCloudResult(
        @Nullable CircuitResponse circuit,
        EndpointsResponse endpoints,
        String id,
        @Nullable List<IdentitySourceResponse> identitySources,
        @Nullable String internet,
        String location,
        ManagementClusterResponse managementCluster,
        String managementNetwork,
        String name,
        String networkBlock,
        String nsxtCertificateThumbprint,
        @Nullable String nsxtPassword,
        String provisioningNetwork,
        String provisioningState,
        SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        String vcenterCertificateThumbprint,
        @Nullable String vcenterPassword,
        String vmotionNetwork) {
        this.circuit = circuit;
        this.endpoints = endpoints;
        this.id = id;
        this.identitySources = identitySources;
        this.internet = internet;
        this.location = location;
        this.managementCluster = managementCluster;
        this.managementNetwork = managementNetwork;
        this.name = name;
        this.networkBlock = networkBlock;
        this.nsxtCertificateThumbprint = nsxtCertificateThumbprint;
        this.nsxtPassword = nsxtPassword;
        this.provisioningNetwork = provisioningNetwork;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.vcenterCertificateThumbprint = vcenterCertificateThumbprint;
        this.vcenterPassword = vcenterPassword;
        this.vmotionNetwork = vmotionNetwork;
    }

    /**
     * An ExpressRoute Circuit
     * 
    */
    public Optional<CircuitResponse> getCircuit() {
        return Optional.ofNullable(this.circuit);
    }
    /**
     * The endpoints
     * 
    */
    public EndpointsResponse getEndpoints() {
        return this.endpoints;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * vCenter Single Sign On Identity Sources
     * 
    */
    public List<IdentitySourceResponse> getIdentitySources() {
        return this.identitySources == null ? List.of() : this.identitySources;
    }
    /**
     * Connectivity to internet is enabled or disabled
     * 
    */
    public Optional<String> getInternet() {
        return Optional.ofNullable(this.internet);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The default cluster used for management
     * 
    */
    public ManagementClusterResponse getManagementCluster() {
        return this.managementCluster;
    }
    /**
     * Network used to access vCenter Server and NSX-T Manager
     * 
    */
    public String getManagementNetwork() {
        return this.managementNetwork;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The block of addresses should be unique across VNet in your subscription as well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X is between 0 and 22
     * 
    */
    public String getNetworkBlock() {
        return this.networkBlock;
    }
    /**
     * Thumbprint of the NSX-T Manager SSL certificate
     * 
    */
    public String getNsxtCertificateThumbprint() {
        return this.nsxtCertificateThumbprint;
    }
    /**
     * Optionally, set the NSX-T Manager password when the private cloud is created
     * 
    */
    public Optional<String> getNsxtPassword() {
        return Optional.ofNullable(this.nsxtPassword);
    }
    /**
     * Used for virtual machine cold migration, cloning, and snapshot migration
     * 
    */
    public String getProvisioningNetwork() {
        return this.provisioningNetwork;
    }
    /**
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The private cloud SKU
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Thumbprint of the vCenter Server SSL certificate
     * 
    */
    public String getVcenterCertificateThumbprint() {
        return this.vcenterCertificateThumbprint;
    }
    /**
     * Optionally, set the vCenter admin password when the private cloud is created
     * 
    */
    public Optional<String> getVcenterPassword() {
        return Optional.ofNullable(this.vcenterPassword);
    }
    /**
     * Used for live migration of virtual machines
     * 
    */
    public String getVmotionNetwork() {
        return this.vmotionNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateCloudResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CircuitResponse circuit;
        private EndpointsResponse endpoints;
        private String id;
        private @Nullable List<IdentitySourceResponse> identitySources;
        private @Nullable String internet;
        private String location;
        private ManagementClusterResponse managementCluster;
        private String managementNetwork;
        private String name;
        private String networkBlock;
        private String nsxtCertificateThumbprint;
        private @Nullable String nsxtPassword;
        private String provisioningNetwork;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String vcenterCertificateThumbprint;
        private @Nullable String vcenterPassword;
        private String vmotionNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateCloudResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.circuit = defaults.circuit;
    	      this.endpoints = defaults.endpoints;
    	      this.id = defaults.id;
    	      this.identitySources = defaults.identitySources;
    	      this.internet = defaults.internet;
    	      this.location = defaults.location;
    	      this.managementCluster = defaults.managementCluster;
    	      this.managementNetwork = defaults.managementNetwork;
    	      this.name = defaults.name;
    	      this.networkBlock = defaults.networkBlock;
    	      this.nsxtCertificateThumbprint = defaults.nsxtCertificateThumbprint;
    	      this.nsxtPassword = defaults.nsxtPassword;
    	      this.provisioningNetwork = defaults.provisioningNetwork;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vcenterCertificateThumbprint = defaults.vcenterCertificateThumbprint;
    	      this.vcenterPassword = defaults.vcenterPassword;
    	      this.vmotionNetwork = defaults.vmotionNetwork;
        }

        public Builder setCircuit(@Nullable CircuitResponse circuit) {
            this.circuit = circuit;
            return this;
        }

        public Builder setEndpoints(EndpointsResponse endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentitySources(@Nullable List<IdentitySourceResponse> identitySources) {
            this.identitySources = identitySources;
            return this;
        }

        public Builder setInternet(@Nullable String internet) {
            this.internet = internet;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagementCluster(ManagementClusterResponse managementCluster) {
            this.managementCluster = Objects.requireNonNull(managementCluster);
            return this;
        }

        public Builder setManagementNetwork(String managementNetwork) {
            this.managementNetwork = Objects.requireNonNull(managementNetwork);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkBlock(String networkBlock) {
            this.networkBlock = Objects.requireNonNull(networkBlock);
            return this;
        }

        public Builder setNsxtCertificateThumbprint(String nsxtCertificateThumbprint) {
            this.nsxtCertificateThumbprint = Objects.requireNonNull(nsxtCertificateThumbprint);
            return this;
        }

        public Builder setNsxtPassword(@Nullable String nsxtPassword) {
            this.nsxtPassword = nsxtPassword;
            return this;
        }

        public Builder setProvisioningNetwork(String provisioningNetwork) {
            this.provisioningNetwork = Objects.requireNonNull(provisioningNetwork);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVcenterCertificateThumbprint(String vcenterCertificateThumbprint) {
            this.vcenterCertificateThumbprint = Objects.requireNonNull(vcenterCertificateThumbprint);
            return this;
        }

        public Builder setVcenterPassword(@Nullable String vcenterPassword) {
            this.vcenterPassword = vcenterPassword;
            return this;
        }

        public Builder setVmotionNetwork(String vmotionNetwork) {
            this.vmotionNetwork = Objects.requireNonNull(vmotionNetwork);
            return this;
        }
        public GetPrivateCloudResult build() {
            return new GetPrivateCloudResult(circuit, endpoints, id, identitySources, internet, location, managementCluster, managementNetwork, name, networkBlock, nsxtCertificateThumbprint, nsxtPassword, provisioningNetwork, provisioningState, sku, tags, type, vcenterCertificateThumbprint, vcenterPassword, vmotionNetwork);
        }
    }
}
