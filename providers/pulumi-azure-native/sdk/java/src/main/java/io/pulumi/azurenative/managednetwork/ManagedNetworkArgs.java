// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.managednetwork.inputs.ScopeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkArgs Empty = new ManagedNetworkArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName")
      private final @Nullable Output<String> managedNetworkName;

    public Output<String> managedNetworkName() {
        return this.managedNetworkName == null ? Codegen.empty() : this.managedNetworkName;
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
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<ScopeArgs> scope;

    public Output<ScopeArgs> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ManagedNetworkArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> managedNetworkName,
        Output<String> resourceGroupName,
        @Nullable Output<ScopeArgs> scope,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.managedNetworkName = managedNetworkName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.tags = tags;
    }

    private ManagedNetworkArgs() {
        this.location = Codegen.empty();
        this.managedNetworkName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedNetworkName;
        private Output<String> resourceGroupName;
        private @Nullable Output<ScopeArgs> scope;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedNetworkName(@Nullable Output<String> managedNetworkName) {
            this.managedNetworkName = managedNetworkName;
            return this;
        }
        public Builder managedNetworkName(@Nullable String managedNetworkName) {
            this.managedNetworkName = Codegen.ofNullable(managedNetworkName);
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
        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable ScopeArgs scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ManagedNetworkArgs build() {
            return new ManagedNetworkArgs(location, managedNetworkName, resourceGroupName, scope, tags);
        }
    }
}
