// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.opsworks.inputs.StackCustomCookbooksSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackArgs Empty = new StackArgs();

    /**
     * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
     * 
     */
    @InputImport(name="agentVersion")
      private final @Nullable Input<String> agentVersion;

    public Input<String> getAgentVersion() {
        return this.agentVersion == null ? Input.empty() : this.agentVersion;
    }

    /**
     * If `manage_berkshelf` is enabled, the version of Berkshelf to use.
     * 
     */
    @InputImport(name="berkshelfVersion")
      private final @Nullable Input<String> berkshelfVersion;

    public Input<String> getBerkshelfVersion() {
        return this.berkshelfVersion == null ? Input.empty() : this.berkshelfVersion;
    }

    /**
     * Color to paint next to the stack's resources in the OpsWorks console.
     * 
     */
    @InputImport(name="color")
      private final @Nullable Input<String> color;

    public Input<String> getColor() {
        return this.color == null ? Input.empty() : this.color;
    }

    /**
     * Name of the configuration manager to use. Defaults to "Chef".
     * 
     */
    @InputImport(name="configurationManagerName")
      private final @Nullable Input<String> configurationManagerName;

    public Input<String> getConfigurationManagerName() {
        return this.configurationManagerName == null ? Input.empty() : this.configurationManagerName;
    }

    /**
     * Version of the configuration manager to use. Defaults to "11.4".
     * 
     */
    @InputImport(name="configurationManagerVersion")
      private final @Nullable Input<String> configurationManagerVersion;

    public Input<String> getConfigurationManagerVersion() {
        return this.configurationManagerVersion == null ? Input.empty() : this.configurationManagerVersion;
    }

    /**
     * When `use_custom_cookbooks` is set, provide this sub-object as
     * described below.
     * 
     */
    @InputImport(name="customCookbooksSources")
      private final @Nullable Input<List<StackCustomCookbooksSourceArgs>> customCookbooksSources;

    public Input<List<StackCustomCookbooksSourceArgs>> getCustomCookbooksSources() {
        return this.customCookbooksSources == null ? Input.empty() : this.customCookbooksSources;
    }

    /**
     * Custom JSON attributes to apply to the entire stack.
     * 
     */
    @InputImport(name="customJson")
      private final @Nullable Input<String> customJson;

    public Input<String> getCustomJson() {
        return this.customJson == null ? Input.empty() : this.customJson;
    }

    /**
     * Name of the availability zone where instances will be created
     * by default. This is required unless you set `vpc_id`.
     * 
     */
    @InputImport(name="defaultAvailabilityZone")
      private final @Nullable Input<String> defaultAvailabilityZone;

    public Input<String> getDefaultAvailabilityZone() {
        return this.defaultAvailabilityZone == null ? Input.empty() : this.defaultAvailabilityZone;
    }

    /**
     * The ARN of an IAM Instance Profile that created instances
     * will have by default.
     * 
     */
    @InputImport(name="defaultInstanceProfileArn", required=true)
      private final Input<String> defaultInstanceProfileArn;

    public Input<String> getDefaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn;
    }

    /**
     * Name of OS that will be installed on instances by default.
     * 
     */
    @InputImport(name="defaultOs")
      private final @Nullable Input<String> defaultOs;

    public Input<String> getDefaultOs() {
        return this.defaultOs == null ? Input.empty() : this.defaultOs;
    }

    /**
     * Name of the type of root device instances will have by default.
     * 
     */
    @InputImport(name="defaultRootDeviceType")
      private final @Nullable Input<String> defaultRootDeviceType;

    public Input<String> getDefaultRootDeviceType() {
        return this.defaultRootDeviceType == null ? Input.empty() : this.defaultRootDeviceType;
    }

    /**
     * Name of the SSH keypair that instances will have by default.
     * 
     */
    @InputImport(name="defaultSshKeyName")
      private final @Nullable Input<String> defaultSshKeyName;

    public Input<String> getDefaultSshKeyName() {
        return this.defaultSshKeyName == null ? Input.empty() : this.defaultSshKeyName;
    }

    /**
     * Id of the subnet in which instances will be created by default. Mandatory
     * if `vpc_id` is set, and forbidden if it isn't.
     * 
     */
    @InputImport(name="defaultSubnetId")
      private final @Nullable Input<String> defaultSubnetId;

    public Input<String> getDefaultSubnetId() {
        return this.defaultSubnetId == null ? Input.empty() : this.defaultSubnetId;
    }

    /**
     * Keyword representing the naming scheme that will be used for instance hostnames
     * within this stack.
     * 
     */
    @InputImport(name="hostnameTheme")
      private final @Nullable Input<String> hostnameTheme;

    public Input<String> getHostnameTheme() {
        return this.hostnameTheme == null ? Input.empty() : this.hostnameTheme;
    }

    /**
     * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
     * 
     */
    @InputImport(name="manageBerkshelf")
      private final @Nullable Input<Boolean> manageBerkshelf;

    public Input<Boolean> getManageBerkshelf() {
        return this.manageBerkshelf == null ? Input.empty() : this.manageBerkshelf;
    }

    /**
     * The name of the stack.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the region where the stack will exist.
     * 
     */
    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * The ARN of an IAM role that the OpsWorks service will act as.
     * 
     */
    @InputImport(name="serviceRoleArn", required=true)
      private final Input<String> serviceRoleArn;

    public Input<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Boolean value controlling whether the custom cookbook settings are
     * enabled.
     * 
     */
    @InputImport(name="useCustomCookbooks")
      private final @Nullable Input<Boolean> useCustomCookbooks;

    public Input<Boolean> getUseCustomCookbooks() {
        return this.useCustomCookbooks == null ? Input.empty() : this.useCustomCookbooks;
    }

    /**
     * Boolean value controlling whether the standard OpsWorks
     * security groups apply to created instances.
     * 
     */
    @InputImport(name="useOpsworksSecurityGroups")
      private final @Nullable Input<Boolean> useOpsworksSecurityGroups;

    public Input<Boolean> getUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups == null ? Input.empty() : this.useOpsworksSecurityGroups;
    }

    /**
     * The id of the VPC that this stack belongs to.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public StackArgs(
        @Nullable Input<String> agentVersion,
        @Nullable Input<String> berkshelfVersion,
        @Nullable Input<String> color,
        @Nullable Input<String> configurationManagerName,
        @Nullable Input<String> configurationManagerVersion,
        @Nullable Input<List<StackCustomCookbooksSourceArgs>> customCookbooksSources,
        @Nullable Input<String> customJson,
        @Nullable Input<String> defaultAvailabilityZone,
        Input<String> defaultInstanceProfileArn,
        @Nullable Input<String> defaultOs,
        @Nullable Input<String> defaultRootDeviceType,
        @Nullable Input<String> defaultSshKeyName,
        @Nullable Input<String> defaultSubnetId,
        @Nullable Input<String> hostnameTheme,
        @Nullable Input<Boolean> manageBerkshelf,
        @Nullable Input<String> name,
        Input<String> region,
        Input<String> serviceRoleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Boolean> useCustomCookbooks,
        @Nullable Input<Boolean> useOpsworksSecurityGroups,
        @Nullable Input<String> vpcId) {
        this.agentVersion = agentVersion;
        this.berkshelfVersion = berkshelfVersion;
        this.color = color;
        this.configurationManagerName = configurationManagerName;
        this.configurationManagerVersion = configurationManagerVersion;
        this.customCookbooksSources = customCookbooksSources;
        this.customJson = customJson;
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        this.defaultInstanceProfileArn = Objects.requireNonNull(defaultInstanceProfileArn, "expected parameter 'defaultInstanceProfileArn' to be non-null");
        this.defaultOs = defaultOs;
        this.defaultRootDeviceType = defaultRootDeviceType;
        this.defaultSshKeyName = defaultSshKeyName;
        this.defaultSubnetId = defaultSubnetId;
        this.hostnameTheme = hostnameTheme;
        this.manageBerkshelf = manageBerkshelf;
        this.name = name;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn, "expected parameter 'serviceRoleArn' to be non-null");
        this.tags = tags;
        this.useCustomCookbooks = useCustomCookbooks;
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
        this.vpcId = vpcId;
    }

    private StackArgs() {
        this.agentVersion = Input.empty();
        this.berkshelfVersion = Input.empty();
        this.color = Input.empty();
        this.configurationManagerName = Input.empty();
        this.configurationManagerVersion = Input.empty();
        this.customCookbooksSources = Input.empty();
        this.customJson = Input.empty();
        this.defaultAvailabilityZone = Input.empty();
        this.defaultInstanceProfileArn = Input.empty();
        this.defaultOs = Input.empty();
        this.defaultRootDeviceType = Input.empty();
        this.defaultSshKeyName = Input.empty();
        this.defaultSubnetId = Input.empty();
        this.hostnameTheme = Input.empty();
        this.manageBerkshelf = Input.empty();
        this.name = Input.empty();
        this.region = Input.empty();
        this.serviceRoleArn = Input.empty();
        this.tags = Input.empty();
        this.useCustomCookbooks = Input.empty();
        this.useOpsworksSecurityGroups = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agentVersion;
        private @Nullable Input<String> berkshelfVersion;
        private @Nullable Input<String> color;
        private @Nullable Input<String> configurationManagerName;
        private @Nullable Input<String> configurationManagerVersion;
        private @Nullable Input<List<StackCustomCookbooksSourceArgs>> customCookbooksSources;
        private @Nullable Input<String> customJson;
        private @Nullable Input<String> defaultAvailabilityZone;
        private Input<String> defaultInstanceProfileArn;
        private @Nullable Input<String> defaultOs;
        private @Nullable Input<String> defaultRootDeviceType;
        private @Nullable Input<String> defaultSshKeyName;
        private @Nullable Input<String> defaultSubnetId;
        private @Nullable Input<String> hostnameTheme;
        private @Nullable Input<Boolean> manageBerkshelf;
        private @Nullable Input<String> name;
        private Input<String> region;
        private Input<String> serviceRoleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Boolean> useCustomCookbooks;
        private @Nullable Input<Boolean> useOpsworksSecurityGroups;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(StackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.berkshelfVersion = defaults.berkshelfVersion;
    	      this.color = defaults.color;
    	      this.configurationManagerName = defaults.configurationManagerName;
    	      this.configurationManagerVersion = defaults.configurationManagerVersion;
    	      this.customCookbooksSources = defaults.customCookbooksSources;
    	      this.customJson = defaults.customJson;
    	      this.defaultAvailabilityZone = defaults.defaultAvailabilityZone;
    	      this.defaultInstanceProfileArn = defaults.defaultInstanceProfileArn;
    	      this.defaultOs = defaults.defaultOs;
    	      this.defaultRootDeviceType = defaults.defaultRootDeviceType;
    	      this.defaultSshKeyName = defaults.defaultSshKeyName;
    	      this.defaultSubnetId = defaults.defaultSubnetId;
    	      this.hostnameTheme = defaults.hostnameTheme;
    	      this.manageBerkshelf = defaults.manageBerkshelf;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.tags = defaults.tags;
    	      this.useCustomCookbooks = defaults.useCustomCookbooks;
    	      this.useOpsworksSecurityGroups = defaults.useOpsworksSecurityGroups;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAgentVersion(@Nullable Input<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = Input.ofNullable(agentVersion);
            return this;
        }

        public Builder setBerkshelfVersion(@Nullable Input<String> berkshelfVersion) {
            this.berkshelfVersion = berkshelfVersion;
            return this;
        }

        public Builder setBerkshelfVersion(@Nullable String berkshelfVersion) {
            this.berkshelfVersion = Input.ofNullable(berkshelfVersion);
            return this;
        }

        public Builder setColor(@Nullable Input<String> color) {
            this.color = color;
            return this;
        }

        public Builder setColor(@Nullable String color) {
            this.color = Input.ofNullable(color);
            return this;
        }

        public Builder setConfigurationManagerName(@Nullable Input<String> configurationManagerName) {
            this.configurationManagerName = configurationManagerName;
            return this;
        }

        public Builder setConfigurationManagerName(@Nullable String configurationManagerName) {
            this.configurationManagerName = Input.ofNullable(configurationManagerName);
            return this;
        }

        public Builder setConfigurationManagerVersion(@Nullable Input<String> configurationManagerVersion) {
            this.configurationManagerVersion = configurationManagerVersion;
            return this;
        }

        public Builder setConfigurationManagerVersion(@Nullable String configurationManagerVersion) {
            this.configurationManagerVersion = Input.ofNullable(configurationManagerVersion);
            return this;
        }

        public Builder setCustomCookbooksSources(@Nullable Input<List<StackCustomCookbooksSourceArgs>> customCookbooksSources) {
            this.customCookbooksSources = customCookbooksSources;
            return this;
        }

        public Builder setCustomCookbooksSources(@Nullable List<StackCustomCookbooksSourceArgs> customCookbooksSources) {
            this.customCookbooksSources = Input.ofNullable(customCookbooksSources);
            return this;
        }

        public Builder setCustomJson(@Nullable Input<String> customJson) {
            this.customJson = customJson;
            return this;
        }

        public Builder setCustomJson(@Nullable String customJson) {
            this.customJson = Input.ofNullable(customJson);
            return this;
        }

        public Builder setDefaultAvailabilityZone(@Nullable Input<String> defaultAvailabilityZone) {
            this.defaultAvailabilityZone = defaultAvailabilityZone;
            return this;
        }

        public Builder setDefaultAvailabilityZone(@Nullable String defaultAvailabilityZone) {
            this.defaultAvailabilityZone = Input.ofNullable(defaultAvailabilityZone);
            return this;
        }

        public Builder setDefaultInstanceProfileArn(Input<String> defaultInstanceProfileArn) {
            this.defaultInstanceProfileArn = Objects.requireNonNull(defaultInstanceProfileArn);
            return this;
        }

        public Builder setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
            this.defaultInstanceProfileArn = Input.of(Objects.requireNonNull(defaultInstanceProfileArn));
            return this;
        }

        public Builder setDefaultOs(@Nullable Input<String> defaultOs) {
            this.defaultOs = defaultOs;
            return this;
        }

        public Builder setDefaultOs(@Nullable String defaultOs) {
            this.defaultOs = Input.ofNullable(defaultOs);
            return this;
        }

        public Builder setDefaultRootDeviceType(@Nullable Input<String> defaultRootDeviceType) {
            this.defaultRootDeviceType = defaultRootDeviceType;
            return this;
        }

        public Builder setDefaultRootDeviceType(@Nullable String defaultRootDeviceType) {
            this.defaultRootDeviceType = Input.ofNullable(defaultRootDeviceType);
            return this;
        }

        public Builder setDefaultSshKeyName(@Nullable Input<String> defaultSshKeyName) {
            this.defaultSshKeyName = defaultSshKeyName;
            return this;
        }

        public Builder setDefaultSshKeyName(@Nullable String defaultSshKeyName) {
            this.defaultSshKeyName = Input.ofNullable(defaultSshKeyName);
            return this;
        }

        public Builder setDefaultSubnetId(@Nullable Input<String> defaultSubnetId) {
            this.defaultSubnetId = defaultSubnetId;
            return this;
        }

        public Builder setDefaultSubnetId(@Nullable String defaultSubnetId) {
            this.defaultSubnetId = Input.ofNullable(defaultSubnetId);
            return this;
        }

        public Builder setHostnameTheme(@Nullable Input<String> hostnameTheme) {
            this.hostnameTheme = hostnameTheme;
            return this;
        }

        public Builder setHostnameTheme(@Nullable String hostnameTheme) {
            this.hostnameTheme = Input.ofNullable(hostnameTheme);
            return this;
        }

        public Builder setManageBerkshelf(@Nullable Input<Boolean> manageBerkshelf) {
            this.manageBerkshelf = manageBerkshelf;
            return this;
        }

        public Builder setManageBerkshelf(@Nullable Boolean manageBerkshelf) {
            this.manageBerkshelf = Input.ofNullable(manageBerkshelf);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setServiceRoleArn(Input<String> serviceRoleArn) {
            this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn);
            return this;
        }

        public Builder setServiceRoleArn(String serviceRoleArn) {
            this.serviceRoleArn = Input.of(Objects.requireNonNull(serviceRoleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUseCustomCookbooks(@Nullable Input<Boolean> useCustomCookbooks) {
            this.useCustomCookbooks = useCustomCookbooks;
            return this;
        }

        public Builder setUseCustomCookbooks(@Nullable Boolean useCustomCookbooks) {
            this.useCustomCookbooks = Input.ofNullable(useCustomCookbooks);
            return this;
        }

        public Builder setUseOpsworksSecurityGroups(@Nullable Input<Boolean> useOpsworksSecurityGroups) {
            this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
            return this;
        }

        public Builder setUseOpsworksSecurityGroups(@Nullable Boolean useOpsworksSecurityGroups) {
            this.useOpsworksSecurityGroups = Input.ofNullable(useOpsworksSecurityGroups);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public StackArgs build() {
            return new StackArgs(agentVersion, berkshelfVersion, color, configurationManagerName, configurationManagerVersion, customCookbooksSources, customJson, defaultAvailabilityZone, defaultInstanceProfileArn, defaultOs, defaultRootDeviceType, defaultSshKeyName, defaultSubnetId, hostnameTheme, manageBerkshelf, name, region, serviceRoleArn, tags, useCustomCookbooks, useOpsworksSecurityGroups, vpcId);
        }
    }
}
