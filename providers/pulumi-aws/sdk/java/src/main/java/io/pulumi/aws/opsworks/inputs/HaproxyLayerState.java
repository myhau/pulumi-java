// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.HaproxyLayerCloudwatchConfigurationGetArgs;
import io.pulumi.aws.opsworks.inputs.HaproxyLayerEbsVolumeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaproxyLayerState extends io.pulumi.resources.ResourceArgs {

    public static final HaproxyLayerState Empty = new HaproxyLayerState();

    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    @InputImport(name="autoAssignElasticIps")
      private final @Nullable Input<Boolean> autoAssignElasticIps;

    public Input<Boolean> getAutoAssignElasticIps() {
        return this.autoAssignElasticIps == null ? Input.empty() : this.autoAssignElasticIps;
    }

    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    @InputImport(name="autoAssignPublicIps")
      private final @Nullable Input<Boolean> autoAssignPublicIps;

    public Input<Boolean> getAutoAssignPublicIps() {
        return this.autoAssignPublicIps == null ? Input.empty() : this.autoAssignPublicIps;
    }

    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @InputImport(name="autoHealing")
      private final @Nullable Input<Boolean> autoHealing;

    public Input<Boolean> getAutoHealing() {
        return this.autoHealing == null ? Input.empty() : this.autoHealing;
    }

    @InputImport(name="cloudwatchConfiguration")
      private final @Nullable Input<HaproxyLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;

    public Input<HaproxyLayerCloudwatchConfigurationGetArgs> getCloudwatchConfiguration() {
        return this.cloudwatchConfiguration == null ? Input.empty() : this.cloudwatchConfiguration;
    }

    @InputImport(name="customConfigureRecipes")
      private final @Nullable Input<List<String>> customConfigureRecipes;

    public Input<List<String>> getCustomConfigureRecipes() {
        return this.customConfigureRecipes == null ? Input.empty() : this.customConfigureRecipes;
    }

    @InputImport(name="customDeployRecipes")
      private final @Nullable Input<List<String>> customDeployRecipes;

    public Input<List<String>> getCustomDeployRecipes() {
        return this.customDeployRecipes == null ? Input.empty() : this.customDeployRecipes;
    }

    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @InputImport(name="customInstanceProfileArn")
      private final @Nullable Input<String> customInstanceProfileArn;

    public Input<String> getCustomInstanceProfileArn() {
        return this.customInstanceProfileArn == null ? Input.empty() : this.customInstanceProfileArn;
    }

    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @InputImport(name="customJson")
      private final @Nullable Input<String> customJson;

    public Input<String> getCustomJson() {
        return this.customJson == null ? Input.empty() : this.customJson;
    }

    /**
     * Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    @InputImport(name="customSecurityGroupIds")
      private final @Nullable Input<List<String>> customSecurityGroupIds;

    public Input<List<String>> getCustomSecurityGroupIds() {
        return this.customSecurityGroupIds == null ? Input.empty() : this.customSecurityGroupIds;
    }

    @InputImport(name="customSetupRecipes")
      private final @Nullable Input<List<String>> customSetupRecipes;

    public Input<List<String>> getCustomSetupRecipes() {
        return this.customSetupRecipes == null ? Input.empty() : this.customSetupRecipes;
    }

    @InputImport(name="customShutdownRecipes")
      private final @Nullable Input<List<String>> customShutdownRecipes;

    public Input<List<String>> getCustomShutdownRecipes() {
        return this.customShutdownRecipes == null ? Input.empty() : this.customShutdownRecipes;
    }

    @InputImport(name="customUndeployRecipes")
      private final @Nullable Input<List<String>> customUndeployRecipes;

    public Input<List<String>> getCustomUndeployRecipes() {
        return this.customUndeployRecipes == null ? Input.empty() : this.customUndeployRecipes;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @InputImport(name="drainElbOnShutdown")
      private final @Nullable Input<Boolean> drainElbOnShutdown;

    public Input<Boolean> getDrainElbOnShutdown() {
        return this.drainElbOnShutdown == null ? Input.empty() : this.drainElbOnShutdown;
    }

    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    @InputImport(name="ebsVolumes")
      private final @Nullable Input<List<HaproxyLayerEbsVolumeGetArgs>> ebsVolumes;

    public Input<List<HaproxyLayerEbsVolumeGetArgs>> getEbsVolumes() {
        return this.ebsVolumes == null ? Input.empty() : this.ebsVolumes;
    }

    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @InputImport(name="elasticLoadBalancer")
      private final @Nullable Input<String> elasticLoadBalancer;

    public Input<String> getElasticLoadBalancer() {
        return this.elasticLoadBalancer == null ? Input.empty() : this.elasticLoadBalancer;
    }

    /**
     * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
     * 
     */
    @InputImport(name="healthcheckMethod")
      private final @Nullable Input<String> healthcheckMethod;

    public Input<String> getHealthcheckMethod() {
        return this.healthcheckMethod == null ? Input.empty() : this.healthcheckMethod;
    }

    /**
     * URL path to use for instance healthchecks. Defaults to "/".
     * 
     */
    @InputImport(name="healthcheckUrl")
      private final @Nullable Input<String> healthcheckUrl;

    public Input<String> getHealthcheckUrl() {
        return this.healthcheckUrl == null ? Input.empty() : this.healthcheckUrl;
    }

    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @InputImport(name="installUpdatesOnBoot")
      private final @Nullable Input<Boolean> installUpdatesOnBoot;

    public Input<Boolean> getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot == null ? Input.empty() : this.installUpdatesOnBoot;
    }

    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @InputImport(name="instanceShutdownTimeout")
      private final @Nullable Input<Integer> instanceShutdownTimeout;

    public Input<Integer> getInstanceShutdownTimeout() {
        return this.instanceShutdownTimeout == null ? Input.empty() : this.instanceShutdownTimeout;
    }

    /**
     * A human-readable name for the layer.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @InputImport(name="stackId")
      private final @Nullable Input<String> stackId;

    public Input<String> getStackId() {
        return this.stackId == null ? Input.empty() : this.stackId;
    }

    /**
     * Whether to enable HAProxy stats.
     * 
     */
    @InputImport(name="statsEnabled")
      private final @Nullable Input<Boolean> statsEnabled;

    public Input<Boolean> getStatsEnabled() {
        return this.statsEnabled == null ? Input.empty() : this.statsEnabled;
    }

    /**
     * The password to use for HAProxy stats.
     * 
     */
    @InputImport(name="statsPassword")
      private final @Nullable Input<String> statsPassword;

    public Input<String> getStatsPassword() {
        return this.statsPassword == null ? Input.empty() : this.statsPassword;
    }

    /**
     * The HAProxy stats URL. Defaults to "/haproxy?stats".
     * 
     */
    @InputImport(name="statsUrl")
      private final @Nullable Input<String> statsUrl;

    public Input<String> getStatsUrl() {
        return this.statsUrl == null ? Input.empty() : this.statsUrl;
    }

    /**
     * The username for HAProxy stats. Defaults to "opsworks".
     * 
     */
    @InputImport(name="statsUser")
      private final @Nullable Input<String> statsUser;

    public Input<String> getStatsUser() {
        return this.statsUser == null ? Input.empty() : this.statsUser;
    }

    /**
     * Names of a set of system packages to install on the layer's instances.
     * 
     */
    @InputImport(name="systemPackages")
      private final @Nullable Input<List<String>> systemPackages;

    public Input<List<String>> getSystemPackages() {
        return this.systemPackages == null ? Input.empty() : this.systemPackages;
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @InputImport(name="useEbsOptimizedInstances")
      private final @Nullable Input<Boolean> useEbsOptimizedInstances;

    public Input<Boolean> getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances == null ? Input.empty() : this.useEbsOptimizedInstances;
    }

    public HaproxyLayerState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoAssignElasticIps,
        @Nullable Input<Boolean> autoAssignPublicIps,
        @Nullable Input<Boolean> autoHealing,
        @Nullable Input<HaproxyLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration,
        @Nullable Input<List<String>> customConfigureRecipes,
        @Nullable Input<List<String>> customDeployRecipes,
        @Nullable Input<String> customInstanceProfileArn,
        @Nullable Input<String> customJson,
        @Nullable Input<List<String>> customSecurityGroupIds,
        @Nullable Input<List<String>> customSetupRecipes,
        @Nullable Input<List<String>> customShutdownRecipes,
        @Nullable Input<List<String>> customUndeployRecipes,
        @Nullable Input<Boolean> drainElbOnShutdown,
        @Nullable Input<List<HaproxyLayerEbsVolumeGetArgs>> ebsVolumes,
        @Nullable Input<String> elasticLoadBalancer,
        @Nullable Input<String> healthcheckMethod,
        @Nullable Input<String> healthcheckUrl,
        @Nullable Input<Boolean> installUpdatesOnBoot,
        @Nullable Input<Integer> instanceShutdownTimeout,
        @Nullable Input<String> name,
        @Nullable Input<String> stackId,
        @Nullable Input<Boolean> statsEnabled,
        @Nullable Input<String> statsPassword,
        @Nullable Input<String> statsUrl,
        @Nullable Input<String> statsUser,
        @Nullable Input<List<String>> systemPackages,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> useEbsOptimizedInstances) {
        this.arn = arn;
        this.autoAssignElasticIps = autoAssignElasticIps;
        this.autoAssignPublicIps = autoAssignPublicIps;
        this.autoHealing = autoHealing;
        this.cloudwatchConfiguration = cloudwatchConfiguration;
        this.customConfigureRecipes = customConfigureRecipes;
        this.customDeployRecipes = customDeployRecipes;
        this.customInstanceProfileArn = customInstanceProfileArn;
        this.customJson = customJson;
        this.customSecurityGroupIds = customSecurityGroupIds;
        this.customSetupRecipes = customSetupRecipes;
        this.customShutdownRecipes = customShutdownRecipes;
        this.customUndeployRecipes = customUndeployRecipes;
        this.drainElbOnShutdown = drainElbOnShutdown;
        this.ebsVolumes = ebsVolumes;
        this.elasticLoadBalancer = elasticLoadBalancer;
        this.healthcheckMethod = healthcheckMethod;
        this.healthcheckUrl = healthcheckUrl;
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        this.instanceShutdownTimeout = instanceShutdownTimeout;
        this.name = name;
        this.stackId = stackId;
        this.statsEnabled = statsEnabled;
        this.statsPassword = statsPassword;
        this.statsUrl = statsUrl;
        this.statsUser = statsUser;
        this.systemPackages = systemPackages;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    private HaproxyLayerState() {
        this.arn = Input.empty();
        this.autoAssignElasticIps = Input.empty();
        this.autoAssignPublicIps = Input.empty();
        this.autoHealing = Input.empty();
        this.cloudwatchConfiguration = Input.empty();
        this.customConfigureRecipes = Input.empty();
        this.customDeployRecipes = Input.empty();
        this.customInstanceProfileArn = Input.empty();
        this.customJson = Input.empty();
        this.customSecurityGroupIds = Input.empty();
        this.customSetupRecipes = Input.empty();
        this.customShutdownRecipes = Input.empty();
        this.customUndeployRecipes = Input.empty();
        this.drainElbOnShutdown = Input.empty();
        this.ebsVolumes = Input.empty();
        this.elasticLoadBalancer = Input.empty();
        this.healthcheckMethod = Input.empty();
        this.healthcheckUrl = Input.empty();
        this.installUpdatesOnBoot = Input.empty();
        this.instanceShutdownTimeout = Input.empty();
        this.name = Input.empty();
        this.stackId = Input.empty();
        this.statsEnabled = Input.empty();
        this.statsPassword = Input.empty();
        this.statsUrl = Input.empty();
        this.statsUser = Input.empty();
        this.systemPackages = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.useEbsOptimizedInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaproxyLayerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoAssignElasticIps;
        private @Nullable Input<Boolean> autoAssignPublicIps;
        private @Nullable Input<Boolean> autoHealing;
        private @Nullable Input<HaproxyLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;
        private @Nullable Input<List<String>> customConfigureRecipes;
        private @Nullable Input<List<String>> customDeployRecipes;
        private @Nullable Input<String> customInstanceProfileArn;
        private @Nullable Input<String> customJson;
        private @Nullable Input<List<String>> customSecurityGroupIds;
        private @Nullable Input<List<String>> customSetupRecipes;
        private @Nullable Input<List<String>> customShutdownRecipes;
        private @Nullable Input<List<String>> customUndeployRecipes;
        private @Nullable Input<Boolean> drainElbOnShutdown;
        private @Nullable Input<List<HaproxyLayerEbsVolumeGetArgs>> ebsVolumes;
        private @Nullable Input<String> elasticLoadBalancer;
        private @Nullable Input<String> healthcheckMethod;
        private @Nullable Input<String> healthcheckUrl;
        private @Nullable Input<Boolean> installUpdatesOnBoot;
        private @Nullable Input<Integer> instanceShutdownTimeout;
        private @Nullable Input<String> name;
        private @Nullable Input<String> stackId;
        private @Nullable Input<Boolean> statsEnabled;
        private @Nullable Input<String> statsPassword;
        private @Nullable Input<String> statsUrl;
        private @Nullable Input<String> statsUser;
        private @Nullable Input<List<String>> systemPackages;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> useEbsOptimizedInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(HaproxyLayerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoAssignElasticIps = defaults.autoAssignElasticIps;
    	      this.autoAssignPublicIps = defaults.autoAssignPublicIps;
    	      this.autoHealing = defaults.autoHealing;
    	      this.cloudwatchConfiguration = defaults.cloudwatchConfiguration;
    	      this.customConfigureRecipes = defaults.customConfigureRecipes;
    	      this.customDeployRecipes = defaults.customDeployRecipes;
    	      this.customInstanceProfileArn = defaults.customInstanceProfileArn;
    	      this.customJson = defaults.customJson;
    	      this.customSecurityGroupIds = defaults.customSecurityGroupIds;
    	      this.customSetupRecipes = defaults.customSetupRecipes;
    	      this.customShutdownRecipes = defaults.customShutdownRecipes;
    	      this.customUndeployRecipes = defaults.customUndeployRecipes;
    	      this.drainElbOnShutdown = defaults.drainElbOnShutdown;
    	      this.ebsVolumes = defaults.ebsVolumes;
    	      this.elasticLoadBalancer = defaults.elasticLoadBalancer;
    	      this.healthcheckMethod = defaults.healthcheckMethod;
    	      this.healthcheckUrl = defaults.healthcheckUrl;
    	      this.installUpdatesOnBoot = defaults.installUpdatesOnBoot;
    	      this.instanceShutdownTimeout = defaults.instanceShutdownTimeout;
    	      this.name = defaults.name;
    	      this.stackId = defaults.stackId;
    	      this.statsEnabled = defaults.statsEnabled;
    	      this.statsPassword = defaults.statsPassword;
    	      this.statsUrl = defaults.statsUrl;
    	      this.statsUser = defaults.statsUser;
    	      this.systemPackages = defaults.systemPackages;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.useEbsOptimizedInstances = defaults.useEbsOptimizedInstances;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoAssignElasticIps(@Nullable Input<Boolean> autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        public Builder setAutoAssignElasticIps(@Nullable Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = Input.ofNullable(autoAssignElasticIps);
            return this;
        }

        public Builder setAutoAssignPublicIps(@Nullable Input<Boolean> autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        public Builder setAutoAssignPublicIps(@Nullable Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = Input.ofNullable(autoAssignPublicIps);
            return this;
        }

        public Builder setAutoHealing(@Nullable Input<Boolean> autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        public Builder setAutoHealing(@Nullable Boolean autoHealing) {
            this.autoHealing = Input.ofNullable(autoHealing);
            return this;
        }

        public Builder setCloudwatchConfiguration(@Nullable Input<HaproxyLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }

        public Builder setCloudwatchConfiguration(@Nullable HaproxyLayerCloudwatchConfigurationGetArgs cloudwatchConfiguration) {
            this.cloudwatchConfiguration = Input.ofNullable(cloudwatchConfiguration);
            return this;
        }

        public Builder setCustomConfigureRecipes(@Nullable Input<List<String>> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        public Builder setCustomConfigureRecipes(@Nullable List<String> customConfigureRecipes) {
            this.customConfigureRecipes = Input.ofNullable(customConfigureRecipes);
            return this;
        }

        public Builder setCustomDeployRecipes(@Nullable Input<List<String>> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }

        public Builder setCustomDeployRecipes(@Nullable List<String> customDeployRecipes) {
            this.customDeployRecipes = Input.ofNullable(customDeployRecipes);
            return this;
        }

        public Builder setCustomInstanceProfileArn(@Nullable Input<String> customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        public Builder setCustomInstanceProfileArn(@Nullable String customInstanceProfileArn) {
            this.customInstanceProfileArn = Input.ofNullable(customInstanceProfileArn);
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

        public Builder setCustomSecurityGroupIds(@Nullable Input<List<String>> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        public Builder setCustomSecurityGroupIds(@Nullable List<String> customSecurityGroupIds) {
            this.customSecurityGroupIds = Input.ofNullable(customSecurityGroupIds);
            return this;
        }

        public Builder setCustomSetupRecipes(@Nullable Input<List<String>> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }

        public Builder setCustomSetupRecipes(@Nullable List<String> customSetupRecipes) {
            this.customSetupRecipes = Input.ofNullable(customSetupRecipes);
            return this;
        }

        public Builder setCustomShutdownRecipes(@Nullable Input<List<String>> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        public Builder setCustomShutdownRecipes(@Nullable List<String> customShutdownRecipes) {
            this.customShutdownRecipes = Input.ofNullable(customShutdownRecipes);
            return this;
        }

        public Builder setCustomUndeployRecipes(@Nullable Input<List<String>> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        public Builder setCustomUndeployRecipes(@Nullable List<String> customUndeployRecipes) {
            this.customUndeployRecipes = Input.ofNullable(customUndeployRecipes);
            return this;
        }

        public Builder setDrainElbOnShutdown(@Nullable Input<Boolean> drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        public Builder setDrainElbOnShutdown(@Nullable Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = Input.ofNullable(drainElbOnShutdown);
            return this;
        }

        public Builder setEbsVolumes(@Nullable Input<List<HaproxyLayerEbsVolumeGetArgs>> ebsVolumes) {
            this.ebsVolumes = ebsVolumes;
            return this;
        }

        public Builder setEbsVolumes(@Nullable List<HaproxyLayerEbsVolumeGetArgs> ebsVolumes) {
            this.ebsVolumes = Input.ofNullable(ebsVolumes);
            return this;
        }

        public Builder setElasticLoadBalancer(@Nullable Input<String> elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        public Builder setElasticLoadBalancer(@Nullable String elasticLoadBalancer) {
            this.elasticLoadBalancer = Input.ofNullable(elasticLoadBalancer);
            return this;
        }

        public Builder setHealthcheckMethod(@Nullable Input<String> healthcheckMethod) {
            this.healthcheckMethod = healthcheckMethod;
            return this;
        }

        public Builder setHealthcheckMethod(@Nullable String healthcheckMethod) {
            this.healthcheckMethod = Input.ofNullable(healthcheckMethod);
            return this;
        }

        public Builder setHealthcheckUrl(@Nullable Input<String> healthcheckUrl) {
            this.healthcheckUrl = healthcheckUrl;
            return this;
        }

        public Builder setHealthcheckUrl(@Nullable String healthcheckUrl) {
            this.healthcheckUrl = Input.ofNullable(healthcheckUrl);
            return this;
        }

        public Builder setInstallUpdatesOnBoot(@Nullable Input<Boolean> installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        public Builder setInstallUpdatesOnBoot(@Nullable Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = Input.ofNullable(installUpdatesOnBoot);
            return this;
        }

        public Builder setInstanceShutdownTimeout(@Nullable Input<Integer> instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        public Builder setInstanceShutdownTimeout(@Nullable Integer instanceShutdownTimeout) {
            this.instanceShutdownTimeout = Input.ofNullable(instanceShutdownTimeout);
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

        public Builder setStackId(@Nullable Input<String> stackId) {
            this.stackId = stackId;
            return this;
        }

        public Builder setStackId(@Nullable String stackId) {
            this.stackId = Input.ofNullable(stackId);
            return this;
        }

        public Builder setStatsEnabled(@Nullable Input<Boolean> statsEnabled) {
            this.statsEnabled = statsEnabled;
            return this;
        }

        public Builder setStatsEnabled(@Nullable Boolean statsEnabled) {
            this.statsEnabled = Input.ofNullable(statsEnabled);
            return this;
        }

        public Builder setStatsPassword(@Nullable Input<String> statsPassword) {
            this.statsPassword = statsPassword;
            return this;
        }

        public Builder setStatsPassword(@Nullable String statsPassword) {
            this.statsPassword = Input.ofNullable(statsPassword);
            return this;
        }

        public Builder setStatsUrl(@Nullable Input<String> statsUrl) {
            this.statsUrl = statsUrl;
            return this;
        }

        public Builder setStatsUrl(@Nullable String statsUrl) {
            this.statsUrl = Input.ofNullable(statsUrl);
            return this;
        }

        public Builder setStatsUser(@Nullable Input<String> statsUser) {
            this.statsUser = statsUser;
            return this;
        }

        public Builder setStatsUser(@Nullable String statsUser) {
            this.statsUser = Input.ofNullable(statsUser);
            return this;
        }

        public Builder setSystemPackages(@Nullable Input<List<String>> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }

        public Builder setSystemPackages(@Nullable List<String> systemPackages) {
            this.systemPackages = Input.ofNullable(systemPackages);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUseEbsOptimizedInstances(@Nullable Input<Boolean> useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        public Builder setUseEbsOptimizedInstances(@Nullable Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = Input.ofNullable(useEbsOptimizedInstances);
            return this;
        }
        public HaproxyLayerState build() {
            return new HaproxyLayerState(arn, autoAssignElasticIps, autoAssignPublicIps, autoHealing, cloudwatchConfiguration, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolumes, elasticLoadBalancer, healthcheckMethod, healthcheckUrl, installUpdatesOnBoot, instanceShutdownTimeout, name, stackId, statsEnabled, statsPassword, statsUrl, statsUser, systemPackages, tags, tagsAll, useEbsOptimizedInstances);
        }
    }
}
