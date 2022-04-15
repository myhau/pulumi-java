// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDedicatedCloudServiceResult {
    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    private final String gatewaySubnet;
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/dedicatedCloudServices/{dedicatedCloudServiceName}
     * 
     */
    private final String id;
    /**
     * indicates whether account onboarded or not in a given region
     * 
     */
    private final String isAccountOnboarded;
    /**
     * Azure region
     * 
     */
    private final String location;
    /**
     * {dedicatedCloudServiceName}
     * 
     */
    private final String name;
    /**
     * total nodes purchased
     * 
     */
    private final Integer nodes;
    /**
     * link to a service management web portal
     * 
     */
    private final String serviceURL;
    /**
     * The list of tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDedicatedCloudServiceResult(
        @CustomType.Parameter("gatewaySubnet") String gatewaySubnet,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAccountOnboarded") String isAccountOnboarded,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodes") Integer nodes,
        @CustomType.Parameter("serviceURL") String serviceURL,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.gatewaySubnet = gatewaySubnet;
        this.id = id;
        this.isAccountOnboarded = isAccountOnboarded;
        this.location = location;
        this.name = name;
        this.nodes = nodes;
        this.serviceURL = serviceURL;
        this.tags = tags;
        this.type = type;
    }

    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
    */
    public String gatewaySubnet() {
        return this.gatewaySubnet;
    }
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/dedicatedCloudServices/{dedicatedCloudServiceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * indicates whether account onboarded or not in a given region
     * 
    */
    public String isAccountOnboarded() {
        return this.isAccountOnboarded;
    }
    /**
     * Azure region
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * {dedicatedCloudServiceName}
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * total nodes purchased
     * 
    */
    public Integer nodes() {
        return this.nodes;
    }
    /**
     * link to a service management web portal
     * 
    */
    public String serviceURL() {
        return this.serviceURL;
    }
    /**
     * The list of tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedCloudServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewaySubnet;
        private String id;
        private String isAccountOnboarded;
        private String location;
        private String name;
        private Integer nodes;
        private String serviceURL;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedCloudServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewaySubnet = defaults.gatewaySubnet;
    	      this.id = defaults.id;
    	      this.isAccountOnboarded = defaults.isAccountOnboarded;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.serviceURL = defaults.serviceURL;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder gatewaySubnet(String gatewaySubnet) {
            this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAccountOnboarded(String isAccountOnboarded) {
            this.isAccountOnboarded = Objects.requireNonNull(isAccountOnboarded);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodes(Integer nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder serviceURL(String serviceURL) {
            this.serviceURL = Objects.requireNonNull(serviceURL);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDedicatedCloudServiceResult build() {
            return new GetDedicatedCloudServiceResult(gatewaySubnet, id, isAccountOnboarded, location, name, nodes, serviceURL, tags, type);
        }
    }
}
