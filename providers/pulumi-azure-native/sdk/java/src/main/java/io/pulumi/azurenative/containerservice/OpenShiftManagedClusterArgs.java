// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAgentPoolProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAuthProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterMasterPoolProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftRouterProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.PurchasePlanArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenShiftManagedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterArgs Empty = new OpenShiftManagedClusterArgs();

    /**
     * Configuration of OpenShift cluster VMs.
     * 
     */
    @Import(name="agentPoolProfiles")
      private final @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;

    public Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles() {
        return this.agentPoolProfiles == null ? Codegen.empty() : this.agentPoolProfiles;
    }

    /**
     * Configures OpenShift authentication.
     * 
     */
    @Import(name="authProfile")
      private final @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile;

    public Output<OpenShiftManagedClusterAuthProfileArgs> authProfile() {
        return this.authProfile == null ? Codegen.empty() : this.authProfile;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Configuration for OpenShift master VMs.
     * 
     */
    @Import(name="masterPoolProfile")
      private final @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile;

    public Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile() {
        return this.masterPoolProfile == null ? Codegen.empty() : this.masterPoolProfile;
    }

    /**
     * Configuration for OpenShift networking.
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable Output<NetworkProfileArgs> networkProfile;

    public Output<NetworkProfileArgs> networkProfile() {
        return this.networkProfile == null ? Codegen.empty() : this.networkProfile;
    }

    /**
     * Version of OpenShift specified when creating the cluster.
     * 
     */
    @Import(name="openShiftVersion", required=true)
      private final Output<String> openShiftVersion;

    public Output<String> openShiftVersion() {
        return this.openShiftVersion;
    }

    /**
     * Define the resource plan as required by ARM for billing purposes
     * 
     */
    @Import(name="plan")
      private final @Nullable Output<PurchasePlanArgs> plan;

    public Output<PurchasePlanArgs> plan() {
        return this.plan == null ? Codegen.empty() : this.plan;
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
     * The name of the OpenShift managed cluster resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * Configuration for OpenShift router(s).
     * 
     */
    @Import(name="routerProfiles")
      private final @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles;

    public Output<List<OpenShiftRouterProfileArgs>> routerProfiles() {
        return this.routerProfiles == null ? Codegen.empty() : this.routerProfiles;
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

    public OpenShiftManagedClusterArgs(
        @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles,
        @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile,
        @Nullable Output<String> location,
        @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile,
        @Nullable Output<NetworkProfileArgs> networkProfile,
        Output<String> openShiftVersion,
        @Nullable Output<PurchasePlanArgs> plan,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles,
        @Nullable Output<Map<String,String>> tags) {
        this.agentPoolProfiles = agentPoolProfiles;
        this.authProfile = authProfile;
        this.location = location;
        this.masterPoolProfile = masterPoolProfile;
        this.networkProfile = networkProfile;
        this.openShiftVersion = Objects.requireNonNull(openShiftVersion, "expected parameter 'openShiftVersion' to be non-null");
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.routerProfiles = routerProfiles;
        this.tags = tags;
    }

    private OpenShiftManagedClusterArgs() {
        this.agentPoolProfiles = Codegen.empty();
        this.authProfile = Codegen.empty();
        this.location = Codegen.empty();
        this.masterPoolProfile = Codegen.empty();
        this.networkProfile = Codegen.empty();
        this.openShiftVersion = Codegen.empty();
        this.plan = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.routerProfiles = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;
        private @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile;
        private @Nullable Output<String> location;
        private @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile;
        private @Nullable Output<NetworkProfileArgs> networkProfile;
        private Output<String> openShiftVersion;
        private @Nullable Output<PurchasePlanArgs> plan;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.authProfile = defaults.authProfile;
    	      this.location = defaults.location;
    	      this.masterPoolProfile = defaults.masterPoolProfile;
    	      this.networkProfile = defaults.networkProfile;
    	      this.openShiftVersion = defaults.openShiftVersion;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.routerProfiles = defaults.routerProfiles;
    	      this.tags = defaults.tags;
        }

        public Builder agentPoolProfiles(@Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }
        public Builder agentPoolProfiles(@Nullable List<OpenShiftManagedClusterAgentPoolProfileArgs> agentPoolProfiles) {
            this.agentPoolProfiles = Codegen.ofNullable(agentPoolProfiles);
            return this;
        }
        public Builder agentPoolProfiles(OpenShiftManagedClusterAgentPoolProfileArgs... agentPoolProfiles) {
            return agentPoolProfiles(List.of(agentPoolProfiles));
        }
        public Builder authProfile(@Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile) {
            this.authProfile = authProfile;
            return this;
        }
        public Builder authProfile(@Nullable OpenShiftManagedClusterAuthProfileArgs authProfile) {
            this.authProfile = Codegen.ofNullable(authProfile);
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
        public Builder masterPoolProfile(@Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile) {
            this.masterPoolProfile = masterPoolProfile;
            return this;
        }
        public Builder masterPoolProfile(@Nullable OpenShiftManagedClusterMasterPoolProfileArgs masterPoolProfile) {
            this.masterPoolProfile = Codegen.ofNullable(masterPoolProfile);
            return this;
        }
        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder networkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Codegen.ofNullable(networkProfile);
            return this;
        }
        public Builder openShiftVersion(Output<String> openShiftVersion) {
            this.openShiftVersion = Objects.requireNonNull(openShiftVersion);
            return this;
        }
        public Builder openShiftVersion(String openShiftVersion) {
            this.openShiftVersion = Output.of(Objects.requireNonNull(openShiftVersion));
            return this;
        }
        public Builder plan(@Nullable Output<PurchasePlanArgs> plan) {
            this.plan = plan;
            return this;
        }
        public Builder plan(@Nullable PurchasePlanArgs plan) {
            this.plan = Codegen.ofNullable(plan);
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
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder routerProfiles(@Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles) {
            this.routerProfiles = routerProfiles;
            return this;
        }
        public Builder routerProfiles(@Nullable List<OpenShiftRouterProfileArgs> routerProfiles) {
            this.routerProfiles = Codegen.ofNullable(routerProfiles);
            return this;
        }
        public Builder routerProfiles(OpenShiftRouterProfileArgs... routerProfiles) {
            return routerProfiles(List.of(routerProfiles));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public OpenShiftManagedClusterArgs build() {
            return new OpenShiftManagedClusterArgs(agentPoolProfiles, authProfile, location, masterPoolProfile, networkProfile, openShiftVersion, plan, resourceGroupName, resourceName, routerProfiles, tags);
        }
    }
}
