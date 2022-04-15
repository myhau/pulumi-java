// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.SecurityRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityGroupArgs Empty = new NetworkSecurityGroupArgs();

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
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the network security group.
     * 
     */
    @Import(name="networkSecurityGroupName")
      private final @Nullable Output<String> networkSecurityGroupName;

    public Output<String> networkSecurityGroupName() {
        return this.networkSecurityGroupName == null ? Codegen.empty() : this.networkSecurityGroupName;
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
     * A collection of security rules of the network security group.
     * 
     */
    @Import(name="securityRules")
      private final @Nullable Output<List<SecurityRuleArgs>> securityRules;

    public Output<List<SecurityRuleArgs>> securityRules() {
        return this.securityRules == null ? Codegen.empty() : this.securityRules;
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

    public NetworkSecurityGroupArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<String> networkSecurityGroupName,
        Output<String> resourceGroupName,
        @Nullable Output<List<SecurityRuleArgs>> securityRules,
        @Nullable Output<Map<String,String>> tags) {
        this.id = id;
        this.location = location;
        this.networkSecurityGroupName = networkSecurityGroupName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityRules = securityRules;
        this.tags = tags;
    }

    private NetworkSecurityGroupArgs() {
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.networkSecurityGroupName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.securityRules = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<String> networkSecurityGroupName;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<SecurityRuleArgs>> securityRules;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.networkSecurityGroupName = defaults.networkSecurityGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityRules = defaults.securityRules;
    	      this.tags = defaults.tags;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
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
        public Builder networkSecurityGroupName(@Nullable Output<String> networkSecurityGroupName) {
            this.networkSecurityGroupName = networkSecurityGroupName;
            return this;
        }
        public Builder networkSecurityGroupName(@Nullable String networkSecurityGroupName) {
            this.networkSecurityGroupName = Codegen.ofNullable(networkSecurityGroupName);
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
        public Builder securityRules(@Nullable Output<List<SecurityRuleArgs>> securityRules) {
            this.securityRules = securityRules;
            return this;
        }
        public Builder securityRules(@Nullable List<SecurityRuleArgs> securityRules) {
            this.securityRules = Codegen.ofNullable(securityRules);
            return this;
        }
        public Builder securityRules(SecurityRuleArgs... securityRules) {
            return securityRules(List.of(securityRules));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public NetworkSecurityGroupArgs build() {
            return new NetworkSecurityGroupArgs(id, location, networkSecurityGroupName, resourceGroupName, securityRules, tags);
        }
    }
}
