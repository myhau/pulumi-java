// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualApplianceSkuPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkVirtualApplianceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkVirtualApplianceArgs Empty = new NetworkVirtualApplianceArgs();

    /**
     * BootStrapConfigurationBlobs storage URLs.
     * 
     */
    @Import(name="bootStrapConfigurationBlobs")
      private final @Nullable Output<List<String>> bootStrapConfigurationBlobs;

    public Output<List<String>> bootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs == null ? Codegen.empty() : this.bootStrapConfigurationBlobs;
    }

    /**
     * CloudInitConfiguration string in plain text.
     * 
     */
    @Import(name="cloudInitConfiguration")
      private final @Nullable Output<String> cloudInitConfiguration;

    public Output<String> cloudInitConfiguration() {
        return this.cloudInitConfiguration == null ? Codegen.empty() : this.cloudInitConfiguration;
    }

    /**
     * CloudInitConfigurationBlob storage URLs.
     * 
     */
    @Import(name="cloudInitConfigurationBlobs")
      private final @Nullable Output<List<String>> cloudInitConfigurationBlobs;

    public Output<List<String>> cloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs == null ? Codegen.empty() : this.cloudInitConfigurationBlobs;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The service principal that has read access to cloud-init and config blob.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of Network Virtual Appliance.
     * 
     */
    @Import(name="networkVirtualApplianceName")
      private final @Nullable Output<String> networkVirtualApplianceName;

    public Output<String> networkVirtualApplianceName() {
        return this.networkVirtualApplianceName == null ? Codegen.empty() : this.networkVirtualApplianceName;
    }

    /**
     * Network Virtual Appliance SKU.
     * 
     */
    @Import(name="nvaSku")
      private final @Nullable Output<VirtualApplianceSkuPropertiesArgs> nvaSku;

    public Output<VirtualApplianceSkuPropertiesArgs> nvaSku() {
        return this.nvaSku == null ? Codegen.empty() : this.nvaSku;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * VirtualAppliance ASN.
     * 
     */
    @Import(name="virtualApplianceAsn")
      private final @Nullable Output<Double> virtualApplianceAsn;

    public Output<Double> virtualApplianceAsn() {
        return this.virtualApplianceAsn == null ? Codegen.empty() : this.virtualApplianceAsn;
    }

    /**
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     * 
     */
    @Import(name="virtualHub")
      private final @Nullable Output<SubResourceArgs> virtualHub;

    public Output<SubResourceArgs> virtualHub() {
        return this.virtualHub == null ? Codegen.empty() : this.virtualHub;
    }

    public NetworkVirtualApplianceArgs(
        @Nullable Output<List<String>> bootStrapConfigurationBlobs,
        @Nullable Output<String> cloudInitConfiguration,
        @Nullable Output<List<String>> cloudInitConfigurationBlobs,
        @Nullable Output<String> id,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> networkVirtualApplianceName,
        @Nullable Output<VirtualApplianceSkuPropertiesArgs> nvaSku,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Double> virtualApplianceAsn,
        @Nullable Output<SubResourceArgs> virtualHub) {
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        this.cloudInitConfiguration = cloudInitConfiguration;
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.networkVirtualApplianceName = networkVirtualApplianceName;
        this.nvaSku = nvaSku;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualApplianceAsn = virtualApplianceAsn;
        this.virtualHub = virtualHub;
    }

    private NetworkVirtualApplianceArgs() {
        this.bootStrapConfigurationBlobs = Codegen.empty();
        this.cloudInitConfiguration = Codegen.empty();
        this.cloudInitConfigurationBlobs = Codegen.empty();
        this.id = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.networkVirtualApplianceName = Codegen.empty();
        this.nvaSku = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualApplianceAsn = Codegen.empty();
        this.virtualHub = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkVirtualApplianceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> bootStrapConfigurationBlobs;
        private @Nullable Output<String> cloudInitConfiguration;
        private @Nullable Output<List<String>> cloudInitConfigurationBlobs;
        private @Nullable Output<String> id;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> networkVirtualApplianceName;
        private @Nullable Output<VirtualApplianceSkuPropertiesArgs> nvaSku;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Double> virtualApplianceAsn;
        private @Nullable Output<SubResourceArgs> virtualHub;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkVirtualApplianceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootStrapConfigurationBlobs = defaults.bootStrapConfigurationBlobs;
    	      this.cloudInitConfiguration = defaults.cloudInitConfiguration;
    	      this.cloudInitConfigurationBlobs = defaults.cloudInitConfigurationBlobs;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.networkVirtualApplianceName = defaults.networkVirtualApplianceName;
    	      this.nvaSku = defaults.nvaSku;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualApplianceAsn = defaults.virtualApplianceAsn;
    	      this.virtualHub = defaults.virtualHub;
        }

        public Builder bootStrapConfigurationBlobs(@Nullable Output<List<String>> bootStrapConfigurationBlobs) {
            this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
            return this;
        }
        public Builder bootStrapConfigurationBlobs(@Nullable List<String> bootStrapConfigurationBlobs) {
            this.bootStrapConfigurationBlobs = Codegen.ofNullable(bootStrapConfigurationBlobs);
            return this;
        }
        public Builder bootStrapConfigurationBlobs(String... bootStrapConfigurationBlobs) {
            return bootStrapConfigurationBlobs(List.of(bootStrapConfigurationBlobs));
        }
        public Builder cloudInitConfiguration(@Nullable Output<String> cloudInitConfiguration) {
            this.cloudInitConfiguration = cloudInitConfiguration;
            return this;
        }
        public Builder cloudInitConfiguration(@Nullable String cloudInitConfiguration) {
            this.cloudInitConfiguration = Codegen.ofNullable(cloudInitConfiguration);
            return this;
        }
        public Builder cloudInitConfigurationBlobs(@Nullable Output<List<String>> cloudInitConfigurationBlobs) {
            this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
            return this;
        }
        public Builder cloudInitConfigurationBlobs(@Nullable List<String> cloudInitConfigurationBlobs) {
            this.cloudInitConfigurationBlobs = Codegen.ofNullable(cloudInitConfigurationBlobs);
            return this;
        }
        public Builder cloudInitConfigurationBlobs(String... cloudInitConfigurationBlobs) {
            return cloudInitConfigurationBlobs(List.of(cloudInitConfigurationBlobs));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder networkVirtualApplianceName(@Nullable Output<String> networkVirtualApplianceName) {
            this.networkVirtualApplianceName = networkVirtualApplianceName;
            return this;
        }
        public Builder networkVirtualApplianceName(@Nullable String networkVirtualApplianceName) {
            this.networkVirtualApplianceName = Codegen.ofNullable(networkVirtualApplianceName);
            return this;
        }
        public Builder nvaSku(@Nullable Output<VirtualApplianceSkuPropertiesArgs> nvaSku) {
            this.nvaSku = nvaSku;
            return this;
        }
        public Builder nvaSku(@Nullable VirtualApplianceSkuPropertiesArgs nvaSku) {
            this.nvaSku = Codegen.ofNullable(nvaSku);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualApplianceAsn(@Nullable Output<Double> virtualApplianceAsn) {
            this.virtualApplianceAsn = virtualApplianceAsn;
            return this;
        }
        public Builder virtualApplianceAsn(@Nullable Double virtualApplianceAsn) {
            this.virtualApplianceAsn = Codegen.ofNullable(virtualApplianceAsn);
            return this;
        }
        public Builder virtualHub(@Nullable Output<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }
        public Builder virtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Codegen.ofNullable(virtualHub);
            return this;
        }        public NetworkVirtualApplianceArgs build() {
            return new NetworkVirtualApplianceArgs(bootStrapConfigurationBlobs, cloudInitConfiguration, cloudInitConfigurationBlobs, id, identity, location, networkVirtualApplianceName, nvaSku, resourceGroupName, tags, virtualApplianceAsn, virtualHub);
        }
    }
}
