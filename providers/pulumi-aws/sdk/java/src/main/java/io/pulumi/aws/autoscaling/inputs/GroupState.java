// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.enums.MetricsGranularity;
import io.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupTagGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupWarmPoolGetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupState extends io.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The ARN for this Auto Scaling Group
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A list of one or more availability zones for the group. Used for EC2-Classic, attaching a network interface via id from a launch template and default subnets when not specified with `vpc_zone_identifier` argument. Conflicts with `vpc_zone_identifier`.
     * 
     */
    @InputImport(name="availabilityZones")
      private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * Indicates whether capacity rebalance is enabled. Otherwise, capacity rebalance is disabled.
     * 
     */
    @InputImport(name="capacityRebalance")
      private final @Nullable Input<Boolean> capacityRebalance;

    public Input<Boolean> getCapacityRebalance() {
        return this.capacityRebalance == null ? Input.empty() : this.capacityRebalance;
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * 
     */
    @InputImport(name="defaultCooldown")
      private final @Nullable Input<Integer> defaultCooldown;

    public Input<Integer> getDefaultCooldown() {
        return this.defaultCooldown == null ? Input.empty() : this.defaultCooldown;
    }

    /**
     * The number of Amazon EC2 instances that
     * should be running in the group. (See also Waiting for
     * Capacity below.)
     * 
     */
    @InputImport(name="desiredCapacity")
      private final @Nullable Input<Integer> desiredCapacity;

    public Input<Integer> getDesiredCapacity() {
        return this.desiredCapacity == null ? Input.empty() : this.desiredCapacity;
    }

    /**
     * A list of metrics to collect. The allowed values are defined by the [underlying AWS API](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html).
     * 
     */
    @InputImport(name="enabledMetrics")
      private final @Nullable Input<List<String>> enabledMetrics;

    public Input<List<String>> getEnabledMetrics() {
        return this.enabledMetrics == null ? Input.empty() : this.enabledMetrics;
    }

    /**
     * Allows deleting the Auto Scaling Group without waiting
     * for all instances in the pool to terminate.  You can force an Auto Scaling Group to delete
     * even if it's in the process of scaling a resource. Normally, this provider
     * drains all the instances before deleting the group.  This bypasses that
     * behavior and potentially leaves resources dangling.
     * 
     */
    @InputImport(name="forceDelete")
      private final @Nullable Input<Boolean> forceDelete;

    public Input<Boolean> getForceDelete() {
        return this.forceDelete == null ? Input.empty() : this.forceDelete;
    }

    @InputImport(name="forceDeleteWarmPool")
      private final @Nullable Input<Boolean> forceDeleteWarmPool;

    public Input<Boolean> getForceDeleteWarmPool() {
        return this.forceDeleteWarmPool == null ? Input.empty() : this.forceDeleteWarmPool;
    }

    /**
     * Time (in seconds) after instance comes into service before checking health.
     * 
     */
    @InputImport(name="healthCheckGracePeriod")
      private final @Nullable Input<Integer> healthCheckGracePeriod;

    public Input<Integer> getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod == null ? Input.empty() : this.healthCheckGracePeriod;
    }

    /**
     * "EC2" or "ELB". Controls how health checking is done.
     * 
     */
    @InputImport(name="healthCheckType")
      private final @Nullable Input<String> healthCheckType;

    public Input<String> getHealthCheckType() {
        return this.healthCheckType == null ? Input.empty() : this.healthCheckType;
    }

    /**
     * One or more
     * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     * to attach to the Auto Scaling Group **before** instances are launched. The
     * syntax is exactly the same as the separate
     * `aws.autoscaling.LifecycleHook`
     * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
     * a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * 
     */
    @InputImport(name="initialLifecycleHooks")
      private final @Nullable Input<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks;

    public Input<List<GroupInitialLifecycleHookGetArgs>> getInitialLifecycleHooks() {
        return this.initialLifecycleHooks == null ? Input.empty() : this.initialLifecycleHooks;
    }

    /**
     * If this block is configured, start an
     * [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     * when this Auto Scaling Group is updated. Defined below.
     * 
     */
    @InputImport(name="instanceRefresh")
      private final @Nullable Input<GroupInstanceRefreshGetArgs> instanceRefresh;

    public Input<GroupInstanceRefreshGetArgs> getInstanceRefresh() {
        return this.instanceRefresh == null ? Input.empty() : this.instanceRefresh;
    }

    /**
     * The name of the launch configuration to use.
     * 
     */
    @InputImport(name="launchConfiguration")
      private final @Nullable Input<String> launchConfiguration;

    public Input<String> getLaunchConfiguration() {
        return this.launchConfiguration == null ? Input.empty() : this.launchConfiguration;
    }

    /**
     * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * 
     */
    @InputImport(name="launchTemplate")
      private final @Nullable Input<GroupLaunchTemplateGetArgs> launchTemplate;

    public Input<GroupLaunchTemplateGetArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Input.empty() : this.launchTemplate;
    }

    /**
     * A list of elastic load balancer names to add to the autoscaling
     * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
     * 
     */
    @InputImport(name="loadBalancers")
      private final @Nullable Input<List<String>> loadBalancers;

    public Input<List<String>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    /**
     * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 86400 and 31536000 seconds.
     * 
     */
    @InputImport(name="maxInstanceLifetime")
      private final @Nullable Input<Integer> maxInstanceLifetime;

    public Input<Integer> getMaxInstanceLifetime() {
        return this.maxInstanceLifetime == null ? Input.empty() : this.maxInstanceLifetime;
    }

    /**
     * The maximum size of the Auto Scaling Group.
     * 
     */
    @InputImport(name="maxSize")
      private final @Nullable Input<Integer> maxSize;

    public Input<Integer> getMaxSize() {
        return this.maxSize == null ? Input.empty() : this.maxSize;
    }

    /**
     * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
     * 
     */
    @InputImport(name="metricsGranularity")
      private final @Nullable Input<Either<String,MetricsGranularity>> metricsGranularity;

    public Input<Either<String,MetricsGranularity>> getMetricsGranularity() {
        return this.metricsGranularity == null ? Input.empty() : this.metricsGranularity;
    }

    /**
     * Setting this causes the provider to wait for
     * this number of instances from this Auto Scaling Group to show up healthy in the
     * ELB only on creation. Updates will not wait on ELB instance number changes.
     * (See also Waiting for Capacity below.)
     * 
     */
    @InputImport(name="minElbCapacity")
      private final @Nullable Input<Integer> minElbCapacity;

    public Input<Integer> getMinElbCapacity() {
        return this.minElbCapacity == null ? Input.empty() : this.minElbCapacity;
    }

    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    @InputImport(name="minSize")
      private final @Nullable Input<Integer> minSize;

    public Input<Integer> getMinSize() {
        return this.minSize == null ? Input.empty() : this.minSize;
    }

    /**
     * Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * 
     */
    @InputImport(name="mixedInstancesPolicy")
      private final @Nullable Input<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy;

    public Input<GroupMixedInstancesPolicyGetArgs> getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy == null ? Input.empty() : this.mixedInstancesPolicy;
    }

    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The name of the placement group into which you'll launch your instances, if any.
     * 
     */
    @InputImport(name="placementGroup")
      private final @Nullable Input<String> placementGroup;

    public Input<String> getPlacementGroup() {
        return this.placementGroup == null ? Input.empty() : this.placementGroup;
    }

    /**
     * Allows setting instance protection. The
     * Auto Scaling Group will not select instances with this setting for termination
     * during scale in events.
     * 
     */
    @InputImport(name="protectFromScaleIn")
      private final @Nullable Input<Boolean> protectFromScaleIn;

    public Input<Boolean> getProtectFromScaleIn() {
        return this.protectFromScaleIn == null ? Input.empty() : this.protectFromScaleIn;
    }

    /**
     * The ARN of the service-linked role that the ASG will use to call other AWS services
     * 
     */
    @InputImport(name="serviceLinkedRoleArn")
      private final @Nullable Input<String> serviceLinkedRoleArn;

    public Input<String> getServiceLinkedRoleArn() {
        return this.serviceLinkedRoleArn == null ? Input.empty() : this.serviceLinkedRoleArn;
    }

    /**
     * A list of processes to suspend for the Auto Scaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
     * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your Auto Scaling Group from functioning properly.
     * 
     */
    @InputImport(name="suspendedProcesses")
      private final @Nullable Input<List<String>> suspendedProcesses;

    public Input<List<String>> getSuspendedProcesses() {
        return this.suspendedProcesses == null ? Input.empty() : this.suspendedProcesses;
    }

    /**
     * Configuration block(s) containing resource tags. Conflicts with `tags_collection`. Documented below.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<GroupTagGetArgs>> tags;

    public Input<List<GroupTagGetArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Set of maps containing resource tags. Conflicts with `tag`. Documented below.
     * 
     */
    @InputImport(name="tagsCollection")
      private final @Nullable Input<List<Map<String,String>>> tagsCollection;

    public Input<List<Map<String,String>>> getTagsCollection() {
        return this.tagsCollection == null ? Input.empty() : this.tagsCollection;
    }

    /**
     * A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
     * 
     */
    @InputImport(name="targetGroupArns")
      private final @Nullable Input<List<String>> targetGroupArns;

    public Input<List<String>> getTargetGroupArns() {
        return this.targetGroupArns == null ? Input.empty() : this.targetGroupArns;
    }

    /**
     * A list of policies to decide how the instances in the Auto Scaling Group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
     * 
     */
    @InputImport(name="terminationPolicies")
      private final @Nullable Input<List<String>> terminationPolicies;

    public Input<List<String>> getTerminationPolicies() {
        return this.terminationPolicies == null ? Input.empty() : this.terminationPolicies;
    }

    /**
     * A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availability_zones`.
     * 
     */
    @InputImport(name="vpcZoneIdentifiers")
      private final @Nullable Input<List<String>> vpcZoneIdentifiers;

    public Input<List<String>> getVpcZoneIdentifiers() {
        return this.vpcZoneIdentifiers == null ? Input.empty() : this.vpcZoneIdentifiers;
    }

    /**
     * A maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for ASG instances to be healthy before timing out.  (See also Waiting
     * for Capacity below.) Setting this to "0" causes
     * this provider to skip all Capacity Waiting behavior.
     * 
     */
    @InputImport(name="waitForCapacityTimeout")
      private final @Nullable Input<String> waitForCapacityTimeout;

    public Input<String> getWaitForCapacityTimeout() {
        return this.waitForCapacityTimeout == null ? Input.empty() : this.waitForCapacityTimeout;
    }

    /**
     * Setting this will cause the provider to wait
     * for exactly this number of healthy instances from this Auto Scaling Group in
     * all attached load balancers on both create and update operations. (Takes
     * precedence over `min_elb_capacity` behavior.)
     * (See also Waiting for Capacity below.)
     * 
     */
    @InputImport(name="waitForElbCapacity")
      private final @Nullable Input<Integer> waitForElbCapacity;

    public Input<Integer> getWaitForElbCapacity() {
        return this.waitForElbCapacity == null ? Input.empty() : this.waitForElbCapacity;
    }

    /**
     * If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * to the specified Auto Scaling group. Defined below
     * 
     */
    @InputImport(name="warmPool")
      private final @Nullable Input<GroupWarmPoolGetArgs> warmPool;

    public Input<GroupWarmPoolGetArgs> getWarmPool() {
        return this.warmPool == null ? Input.empty() : this.warmPool;
    }

    public GroupState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<Boolean> capacityRebalance,
        @Nullable Input<Integer> defaultCooldown,
        @Nullable Input<Integer> desiredCapacity,
        @Nullable Input<List<String>> enabledMetrics,
        @Nullable Input<Boolean> forceDelete,
        @Nullable Input<Boolean> forceDeleteWarmPool,
        @Nullable Input<Integer> healthCheckGracePeriod,
        @Nullable Input<String> healthCheckType,
        @Nullable Input<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks,
        @Nullable Input<GroupInstanceRefreshGetArgs> instanceRefresh,
        @Nullable Input<String> launchConfiguration,
        @Nullable Input<GroupLaunchTemplateGetArgs> launchTemplate,
        @Nullable Input<List<String>> loadBalancers,
        @Nullable Input<Integer> maxInstanceLifetime,
        @Nullable Input<Integer> maxSize,
        @Nullable Input<Either<String,MetricsGranularity>> metricsGranularity,
        @Nullable Input<Integer> minElbCapacity,
        @Nullable Input<Integer> minSize,
        @Nullable Input<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> placementGroup,
        @Nullable Input<Boolean> protectFromScaleIn,
        @Nullable Input<String> serviceLinkedRoleArn,
        @Nullable Input<List<String>> suspendedProcesses,
        @Nullable Input<List<GroupTagGetArgs>> tags,
        @Nullable Input<List<Map<String,String>>> tagsCollection,
        @Nullable Input<List<String>> targetGroupArns,
        @Nullable Input<List<String>> terminationPolicies,
        @Nullable Input<List<String>> vpcZoneIdentifiers,
        @Nullable Input<String> waitForCapacityTimeout,
        @Nullable Input<Integer> waitForElbCapacity,
        @Nullable Input<GroupWarmPoolGetArgs> warmPool) {
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.capacityRebalance = capacityRebalance;
        this.defaultCooldown = defaultCooldown;
        this.desiredCapacity = desiredCapacity;
        this.enabledMetrics = enabledMetrics;
        this.forceDelete = forceDelete;
        this.forceDeleteWarmPool = forceDeleteWarmPool;
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        this.healthCheckType = healthCheckType;
        this.initialLifecycleHooks = initialLifecycleHooks;
        this.instanceRefresh = instanceRefresh;
        this.launchConfiguration = launchConfiguration;
        this.launchTemplate = launchTemplate;
        this.loadBalancers = loadBalancers;
        this.maxInstanceLifetime = maxInstanceLifetime;
        this.maxSize = maxSize;
        this.metricsGranularity = metricsGranularity;
        this.minElbCapacity = minElbCapacity;
        this.minSize = minSize;
        this.mixedInstancesPolicy = mixedInstancesPolicy;
        this.name = name;
        this.namePrefix = namePrefix;
        this.placementGroup = placementGroup;
        this.protectFromScaleIn = protectFromScaleIn;
        this.serviceLinkedRoleArn = serviceLinkedRoleArn;
        this.suspendedProcesses = suspendedProcesses;
        this.tags = tags;
        this.tagsCollection = tagsCollection;
        this.targetGroupArns = targetGroupArns;
        this.terminationPolicies = terminationPolicies;
        this.vpcZoneIdentifiers = vpcZoneIdentifiers;
        this.waitForCapacityTimeout = waitForCapacityTimeout;
        this.waitForElbCapacity = waitForElbCapacity;
        this.warmPool = warmPool;
    }

    private GroupState() {
        this.arn = Input.empty();
        this.availabilityZones = Input.empty();
        this.capacityRebalance = Input.empty();
        this.defaultCooldown = Input.empty();
        this.desiredCapacity = Input.empty();
        this.enabledMetrics = Input.empty();
        this.forceDelete = Input.empty();
        this.forceDeleteWarmPool = Input.empty();
        this.healthCheckGracePeriod = Input.empty();
        this.healthCheckType = Input.empty();
        this.initialLifecycleHooks = Input.empty();
        this.instanceRefresh = Input.empty();
        this.launchConfiguration = Input.empty();
        this.launchTemplate = Input.empty();
        this.loadBalancers = Input.empty();
        this.maxInstanceLifetime = Input.empty();
        this.maxSize = Input.empty();
        this.metricsGranularity = Input.empty();
        this.minElbCapacity = Input.empty();
        this.minSize = Input.empty();
        this.mixedInstancesPolicy = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.placementGroup = Input.empty();
        this.protectFromScaleIn = Input.empty();
        this.serviceLinkedRoleArn = Input.empty();
        this.suspendedProcesses = Input.empty();
        this.tags = Input.empty();
        this.tagsCollection = Input.empty();
        this.targetGroupArns = Input.empty();
        this.terminationPolicies = Input.empty();
        this.vpcZoneIdentifiers = Input.empty();
        this.waitForCapacityTimeout = Input.empty();
        this.waitForElbCapacity = Input.empty();
        this.warmPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<Boolean> capacityRebalance;
        private @Nullable Input<Integer> defaultCooldown;
        private @Nullable Input<Integer> desiredCapacity;
        private @Nullable Input<List<String>> enabledMetrics;
        private @Nullable Input<Boolean> forceDelete;
        private @Nullable Input<Boolean> forceDeleteWarmPool;
        private @Nullable Input<Integer> healthCheckGracePeriod;
        private @Nullable Input<String> healthCheckType;
        private @Nullable Input<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks;
        private @Nullable Input<GroupInstanceRefreshGetArgs> instanceRefresh;
        private @Nullable Input<String> launchConfiguration;
        private @Nullable Input<GroupLaunchTemplateGetArgs> launchTemplate;
        private @Nullable Input<List<String>> loadBalancers;
        private @Nullable Input<Integer> maxInstanceLifetime;
        private @Nullable Input<Integer> maxSize;
        private @Nullable Input<Either<String,MetricsGranularity>> metricsGranularity;
        private @Nullable Input<Integer> minElbCapacity;
        private @Nullable Input<Integer> minSize;
        private @Nullable Input<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> placementGroup;
        private @Nullable Input<Boolean> protectFromScaleIn;
        private @Nullable Input<String> serviceLinkedRoleArn;
        private @Nullable Input<List<String>> suspendedProcesses;
        private @Nullable Input<List<GroupTagGetArgs>> tags;
        private @Nullable Input<List<Map<String,String>>> tagsCollection;
        private @Nullable Input<List<String>> targetGroupArns;
        private @Nullable Input<List<String>> terminationPolicies;
        private @Nullable Input<List<String>> vpcZoneIdentifiers;
        private @Nullable Input<String> waitForCapacityTimeout;
        private @Nullable Input<Integer> waitForElbCapacity;
        private @Nullable Input<GroupWarmPoolGetArgs> warmPool;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.capacityRebalance = defaults.capacityRebalance;
    	      this.defaultCooldown = defaults.defaultCooldown;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.enabledMetrics = defaults.enabledMetrics;
    	      this.forceDelete = defaults.forceDelete;
    	      this.forceDeleteWarmPool = defaults.forceDeleteWarmPool;
    	      this.healthCheckGracePeriod = defaults.healthCheckGracePeriod;
    	      this.healthCheckType = defaults.healthCheckType;
    	      this.initialLifecycleHooks = defaults.initialLifecycleHooks;
    	      this.instanceRefresh = defaults.instanceRefresh;
    	      this.launchConfiguration = defaults.launchConfiguration;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.maxInstanceLifetime = defaults.maxInstanceLifetime;
    	      this.maxSize = defaults.maxSize;
    	      this.metricsGranularity = defaults.metricsGranularity;
    	      this.minElbCapacity = defaults.minElbCapacity;
    	      this.minSize = defaults.minSize;
    	      this.mixedInstancesPolicy = defaults.mixedInstancesPolicy;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.placementGroup = defaults.placementGroup;
    	      this.protectFromScaleIn = defaults.protectFromScaleIn;
    	      this.serviceLinkedRoleArn = defaults.serviceLinkedRoleArn;
    	      this.suspendedProcesses = defaults.suspendedProcesses;
    	      this.tags = defaults.tags;
    	      this.tagsCollection = defaults.tagsCollection;
    	      this.targetGroupArns = defaults.targetGroupArns;
    	      this.terminationPolicies = defaults.terminationPolicies;
    	      this.vpcZoneIdentifiers = defaults.vpcZoneIdentifiers;
    	      this.waitForCapacityTimeout = defaults.waitForCapacityTimeout;
    	      this.waitForElbCapacity = defaults.waitForElbCapacity;
    	      this.warmPool = defaults.warmPool;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAvailabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder setCapacityRebalance(@Nullable Input<Boolean> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }

        public Builder setCapacityRebalance(@Nullable Boolean capacityRebalance) {
            this.capacityRebalance = Input.ofNullable(capacityRebalance);
            return this;
        }

        public Builder setDefaultCooldown(@Nullable Input<Integer> defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        public Builder setDefaultCooldown(@Nullable Integer defaultCooldown) {
            this.defaultCooldown = Input.ofNullable(defaultCooldown);
            return this;
        }

        public Builder setDesiredCapacity(@Nullable Input<Integer> desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        public Builder setDesiredCapacity(@Nullable Integer desiredCapacity) {
            this.desiredCapacity = Input.ofNullable(desiredCapacity);
            return this;
        }

        public Builder setEnabledMetrics(@Nullable Input<List<String>> enabledMetrics) {
            this.enabledMetrics = enabledMetrics;
            return this;
        }

        public Builder setEnabledMetrics(@Nullable List<String> enabledMetrics) {
            this.enabledMetrics = Input.ofNullable(enabledMetrics);
            return this;
        }

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
            return this;
        }

        public Builder setForceDeleteWarmPool(@Nullable Input<Boolean> forceDeleteWarmPool) {
            this.forceDeleteWarmPool = forceDeleteWarmPool;
            return this;
        }

        public Builder setForceDeleteWarmPool(@Nullable Boolean forceDeleteWarmPool) {
            this.forceDeleteWarmPool = Input.ofNullable(forceDeleteWarmPool);
            return this;
        }

        public Builder setHealthCheckGracePeriod(@Nullable Input<Integer> healthCheckGracePeriod) {
            this.healthCheckGracePeriod = healthCheckGracePeriod;
            return this;
        }

        public Builder setHealthCheckGracePeriod(@Nullable Integer healthCheckGracePeriod) {
            this.healthCheckGracePeriod = Input.ofNullable(healthCheckGracePeriod);
            return this;
        }

        public Builder setHealthCheckType(@Nullable Input<String> healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }

        public Builder setHealthCheckType(@Nullable String healthCheckType) {
            this.healthCheckType = Input.ofNullable(healthCheckType);
            return this;
        }

        public Builder setInitialLifecycleHooks(@Nullable Input<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks) {
            this.initialLifecycleHooks = initialLifecycleHooks;
            return this;
        }

        public Builder setInitialLifecycleHooks(@Nullable List<GroupInitialLifecycleHookGetArgs> initialLifecycleHooks) {
            this.initialLifecycleHooks = Input.ofNullable(initialLifecycleHooks);
            return this;
        }

        public Builder setInstanceRefresh(@Nullable Input<GroupInstanceRefreshGetArgs> instanceRefresh) {
            this.instanceRefresh = instanceRefresh;
            return this;
        }

        public Builder setInstanceRefresh(@Nullable GroupInstanceRefreshGetArgs instanceRefresh) {
            this.instanceRefresh = Input.ofNullable(instanceRefresh);
            return this;
        }

        public Builder setLaunchConfiguration(@Nullable Input<String> launchConfiguration) {
            this.launchConfiguration = launchConfiguration;
            return this;
        }

        public Builder setLaunchTemplate(@Nullable Input<GroupLaunchTemplateGetArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder setLaunchTemplate(@Nullable GroupLaunchTemplateGetArgs launchTemplate) {
            this.launchTemplate = Input.ofNullable(launchTemplate);
            return this;
        }

        public Builder setLoadBalancers(@Nullable Input<List<String>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder setLoadBalancers(@Nullable List<String> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
            return this;
        }

        public Builder setMaxInstanceLifetime(@Nullable Input<Integer> maxInstanceLifetime) {
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        public Builder setMaxInstanceLifetime(@Nullable Integer maxInstanceLifetime) {
            this.maxInstanceLifetime = Input.ofNullable(maxInstanceLifetime);
            return this;
        }

        public Builder setMaxSize(@Nullable Input<Integer> maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public Builder setMaxSize(@Nullable Integer maxSize) {
            this.maxSize = Input.ofNullable(maxSize);
            return this;
        }

        public Builder setMetricsGranularity(@Nullable Input<Either<String,MetricsGranularity>> metricsGranularity) {
            this.metricsGranularity = metricsGranularity;
            return this;
        }

        public Builder setMetricsGranularity(@Nullable Either<String,MetricsGranularity> metricsGranularity) {
            this.metricsGranularity = Input.ofNullable(metricsGranularity);
            return this;
        }

        public Builder setMinElbCapacity(@Nullable Input<Integer> minElbCapacity) {
            this.minElbCapacity = minElbCapacity;
            return this;
        }

        public Builder setMinElbCapacity(@Nullable Integer minElbCapacity) {
            this.minElbCapacity = Input.ofNullable(minElbCapacity);
            return this;
        }

        public Builder setMinSize(@Nullable Input<Integer> minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder setMinSize(@Nullable Integer minSize) {
            this.minSize = Input.ofNullable(minSize);
            return this;
        }

        public Builder setMixedInstancesPolicy(@Nullable Input<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy) {
            this.mixedInstancesPolicy = mixedInstancesPolicy;
            return this;
        }

        public Builder setMixedInstancesPolicy(@Nullable GroupMixedInstancesPolicyGetArgs mixedInstancesPolicy) {
            this.mixedInstancesPolicy = Input.ofNullable(mixedInstancesPolicy);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPlacementGroup(@Nullable Input<String> placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        public Builder setProtectFromScaleIn(@Nullable Input<Boolean> protectFromScaleIn) {
            this.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        public Builder setProtectFromScaleIn(@Nullable Boolean protectFromScaleIn) {
            this.protectFromScaleIn = Input.ofNullable(protectFromScaleIn);
            return this;
        }

        public Builder setServiceLinkedRoleArn(@Nullable Input<String> serviceLinkedRoleArn) {
            this.serviceLinkedRoleArn = serviceLinkedRoleArn;
            return this;
        }

        public Builder setServiceLinkedRoleArn(@Nullable String serviceLinkedRoleArn) {
            this.serviceLinkedRoleArn = Input.ofNullable(serviceLinkedRoleArn);
            return this;
        }

        public Builder setSuspendedProcesses(@Nullable Input<List<String>> suspendedProcesses) {
            this.suspendedProcesses = suspendedProcesses;
            return this;
        }

        public Builder setSuspendedProcesses(@Nullable List<String> suspendedProcesses) {
            this.suspendedProcesses = Input.ofNullable(suspendedProcesses);
            return this;
        }

        public Builder setTags(@Nullable Input<List<GroupTagGetArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<GroupTagGetArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsCollection(@Nullable Input<List<Map<String,String>>> tagsCollection) {
            this.tagsCollection = tagsCollection;
            return this;
        }

        public Builder setTagsCollection(@Nullable List<Map<String,String>> tagsCollection) {
            this.tagsCollection = Input.ofNullable(tagsCollection);
            return this;
        }

        public Builder setTargetGroupArns(@Nullable Input<List<String>> targetGroupArns) {
            this.targetGroupArns = targetGroupArns;
            return this;
        }

        public Builder setTargetGroupArns(@Nullable List<String> targetGroupArns) {
            this.targetGroupArns = Input.ofNullable(targetGroupArns);
            return this;
        }

        public Builder setTerminationPolicies(@Nullable Input<List<String>> terminationPolicies) {
            this.terminationPolicies = terminationPolicies;
            return this;
        }

        public Builder setTerminationPolicies(@Nullable List<String> terminationPolicies) {
            this.terminationPolicies = Input.ofNullable(terminationPolicies);
            return this;
        }

        public Builder setVpcZoneIdentifiers(@Nullable Input<List<String>> vpcZoneIdentifiers) {
            this.vpcZoneIdentifiers = vpcZoneIdentifiers;
            return this;
        }

        public Builder setVpcZoneIdentifiers(@Nullable List<String> vpcZoneIdentifiers) {
            this.vpcZoneIdentifiers = Input.ofNullable(vpcZoneIdentifiers);
            return this;
        }

        public Builder setWaitForCapacityTimeout(@Nullable Input<String> waitForCapacityTimeout) {
            this.waitForCapacityTimeout = waitForCapacityTimeout;
            return this;
        }

        public Builder setWaitForCapacityTimeout(@Nullable String waitForCapacityTimeout) {
            this.waitForCapacityTimeout = Input.ofNullable(waitForCapacityTimeout);
            return this;
        }

        public Builder setWaitForElbCapacity(@Nullable Input<Integer> waitForElbCapacity) {
            this.waitForElbCapacity = waitForElbCapacity;
            return this;
        }

        public Builder setWaitForElbCapacity(@Nullable Integer waitForElbCapacity) {
            this.waitForElbCapacity = Input.ofNullable(waitForElbCapacity);
            return this;
        }

        public Builder setWarmPool(@Nullable Input<GroupWarmPoolGetArgs> warmPool) {
            this.warmPool = warmPool;
            return this;
        }

        public Builder setWarmPool(@Nullable GroupWarmPoolGetArgs warmPool) {
            this.warmPool = Input.ofNullable(warmPool);
            return this;
        }
        public GroupState build() {
            return new GroupState(arn, availabilityZones, capacityRebalance, defaultCooldown, desiredCapacity, enabledMetrics, forceDelete, forceDeleteWarmPool, healthCheckGracePeriod, healthCheckType, initialLifecycleHooks, instanceRefresh, launchConfiguration, launchTemplate, loadBalancers, maxInstanceLifetime, maxSize, metricsGranularity, minElbCapacity, minSize, mixedInstancesPolicy, name, namePrefix, placementGroup, protectFromScaleIn, serviceLinkedRoleArn, suspendedProcesses, tags, tagsCollection, targetGroupArns, terminationPolicies, vpcZoneIdentifiers, waitForCapacityTimeout, waitForElbCapacity, warmPool);
        }
    }
}
