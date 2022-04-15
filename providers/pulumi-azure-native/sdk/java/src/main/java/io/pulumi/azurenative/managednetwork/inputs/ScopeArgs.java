// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ResourceIdArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scope of a Managed Network
 * 
 */
public final class ScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Import(name="managementGroups")
      private final @Nullable Output<List<ResourceIdArgs>> managementGroups;

    public Output<List<ResourceIdArgs>> managementGroups() {
        return this.managementGroups == null ? Codegen.empty() : this.managementGroups;
    }

    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<ResourceIdArgs>> subnets;

    public Output<List<ResourceIdArgs>> subnets() {
        return this.subnets == null ? Codegen.empty() : this.subnets;
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Import(name="subscriptions")
      private final @Nullable Output<List<ResourceIdArgs>> subscriptions;

    public Output<List<ResourceIdArgs>> subscriptions() {
        return this.subscriptions == null ? Codegen.empty() : this.subscriptions;
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Import(name="virtualNetworks")
      private final @Nullable Output<List<ResourceIdArgs>> virtualNetworks;

    public Output<List<ResourceIdArgs>> virtualNetworks() {
        return this.virtualNetworks == null ? Codegen.empty() : this.virtualNetworks;
    }

    public ScopeArgs(
        @Nullable Output<List<ResourceIdArgs>> managementGroups,
        @Nullable Output<List<ResourceIdArgs>> subnets,
        @Nullable Output<List<ResourceIdArgs>> subscriptions,
        @Nullable Output<List<ResourceIdArgs>> virtualNetworks) {
        this.managementGroups = managementGroups;
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.virtualNetworks = virtualNetworks;
    }

    private ScopeArgs() {
        this.managementGroups = Codegen.empty();
        this.subnets = Codegen.empty();
        this.subscriptions = Codegen.empty();
        this.virtualNetworks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ResourceIdArgs>> managementGroups;
        private @Nullable Output<List<ResourceIdArgs>> subnets;
        private @Nullable Output<List<ResourceIdArgs>> subscriptions;
        private @Nullable Output<List<ResourceIdArgs>> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder managementGroups(@Nullable Output<List<ResourceIdArgs>> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }
        public Builder managementGroups(@Nullable List<ResourceIdArgs> managementGroups) {
            this.managementGroups = Codegen.ofNullable(managementGroups);
            return this;
        }
        public Builder managementGroups(ResourceIdArgs... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }
        public Builder subnets(@Nullable Output<List<ResourceIdArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<ResourceIdArgs> subnets) {
            this.subnets = Codegen.ofNullable(subnets);
            return this;
        }
        public Builder subnets(ResourceIdArgs... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder subscriptions(@Nullable Output<List<ResourceIdArgs>> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(@Nullable List<ResourceIdArgs> subscriptions) {
            this.subscriptions = Codegen.ofNullable(subscriptions);
            return this;
        }
        public Builder subscriptions(ResourceIdArgs... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public Builder virtualNetworks(@Nullable Output<List<ResourceIdArgs>> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }
        public Builder virtualNetworks(@Nullable List<ResourceIdArgs> virtualNetworks) {
            this.virtualNetworks = Codegen.ofNullable(virtualNetworks);
            return this;
        }
        public Builder virtualNetworks(ResourceIdArgs... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }        public ScopeArgs build() {
            return new ScopeArgs(managementGroups, subnets, subscriptions, virtualNetworks);
        }
    }
}
