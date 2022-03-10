// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.ServiceArgs;
import io.pulumi.aws.ecs.inputs.ServiceState;
import io.pulumi.aws.ecs.outputs.ServiceCapacityProviderStrategy;
import io.pulumi.aws.ecs.outputs.ServiceDeploymentCircuitBreaker;
import io.pulumi.aws.ecs.outputs.ServiceDeploymentController;
import io.pulumi.aws.ecs.outputs.ServiceLoadBalancer;
import io.pulumi.aws.ecs.outputs.ServiceNetworkConfiguration;
import io.pulumi.aws.ecs.outputs.ServiceOrderedPlacementStrategy;
import io.pulumi.aws.ecs.outputs.ServicePlacementConstraint;
import io.pulumi.aws.ecs.outputs.ServiceServiceRegistries;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * > **Note:** To prevent a race condition during service deletion, make sure to set `depends_on` to the related `aws.iam.RolePolicy`; otherwise, the policy may be destroyed too soon and the ECS service will then get stuck in the `DRAINING` state.
 * 
 * Provides an ECS service - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
 * 
 * See [ECS Services section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECS services can be imported using the `name` together with ecs cluster `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/service:Service imported cluster-name/service-name
 * ```
 * 
 */
@ResourceType(type="aws:ecs/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `force_new_deployment = true` and not changing from 0 `capacity_provider_strategy` blocks to greater than 0, or vice versa. See below.
     * 
     */
    @OutputExport(name="capacityProviderStrategies", type=List.class, parameters={ServiceCapacityProviderStrategy.class})
    private Output</* @Nullable */ List<ServiceCapacityProviderStrategy>> capacityProviderStrategies;

    /**
     * @return Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `force_new_deployment = true` and not changing from 0 `capacity_provider_strategy` blocks to greater than 0, or vice versa. See below.
     * 
     */
    public Output</* @Nullable */ List<ServiceCapacityProviderStrategy>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies;
    }
    /**
     * ARN of an ECS cluster.
     * 
     */
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return ARN of an ECS cluster.
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    /**
     * Configuration block for deployment circuit breaker. See below.
     * 
     */
    @OutputExport(name="deploymentCircuitBreaker", type=ServiceDeploymentCircuitBreaker.class, parameters={})
    private Output</* @Nullable */ ServiceDeploymentCircuitBreaker> deploymentCircuitBreaker;

    /**
     * @return Configuration block for deployment circuit breaker. See below.
     * 
     */
    public Output</* @Nullable */ ServiceDeploymentCircuitBreaker> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker;
    }
    /**
     * Configuration block for deployment controller configuration. See below.
     * 
     */
    @OutputExport(name="deploymentController", type=ServiceDeploymentController.class, parameters={})
    private Output</* @Nullable */ ServiceDeploymentController> deploymentController;

    /**
     * @return Configuration block for deployment controller configuration. See below.
     * 
     */
    public Output</* @Nullable */ ServiceDeploymentController> getDeploymentController() {
        return this.deploymentController;
    }
    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     * 
     */
    @OutputExport(name="deploymentMaximumPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deploymentMaximumPercent;

    /**
     * @return Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     * 
     */
    public Output</* @Nullable */ Integer> getDeploymentMaximumPercent() {
        return this.deploymentMaximumPercent;
    }
    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     * 
     */
    @OutputExport(name="deploymentMinimumHealthyPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deploymentMinimumHealthyPercent;

    /**
     * @return Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     * 
     */
    public Output</* @Nullable */ Integer> getDeploymentMinimumHealthyPercent() {
        return this.deploymentMinimumHealthyPercent;
    }
    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     * 
     */
    @OutputExport(name="desiredCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredCount;

    /**
     * @return Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     * 
     */
    public Output</* @Nullable */ Integer> getDesiredCount() {
        return this.desiredCount;
    }
    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     * 
     */
    @OutputExport(name="enableEcsManagedTags", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEcsManagedTags;

    /**
     * @return Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableEcsManagedTags() {
        return this.enableEcsManagedTags;
    }
    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     * 
     */
    @OutputExport(name="enableExecuteCommand", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableExecuteCommand;

    /**
     * @return Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }
    /**
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `ordered_placement_strategy` and `placement_constraints` updates.
     * 
     */
    @OutputExport(name="forceNewDeployment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceNewDeployment;

    /**
     * @return Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `ordered_placement_strategy` and `placement_constraints` updates.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceNewDeployment() {
        return this.forceNewDeployment;
    }
    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     * 
     */
    @OutputExport(name="healthCheckGracePeriodSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthCheckGracePeriodSeconds;

    /**
     * @return Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     * 
     */
    public Output</* @Nullable */ Integer> getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }
    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     * 
     */
    @OutputExport(name="iamRole", type=String.class, parameters={})
    private Output<String> iamRole;

    /**
     * @return ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     * 
     */
    public Output<String> getIamRole() {
        return this.iamRole;
    }
    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @OutputExport(name="launchType", type=String.class, parameters={})
    private Output<String> launchType;

    /**
     * @return Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    public Output<String> getLaunchType() {
        return this.launchType;
    }
    /**
     * Configuration block for load balancers. See below.
     * 
     */
    @OutputExport(name="loadBalancers", type=List.class, parameters={ServiceLoadBalancer.class})
    private Output</* @Nullable */ List<ServiceLoadBalancer>> loadBalancers;

    /**
     * @return Configuration block for load balancers. See below.
     * 
     */
    public Output</* @Nullable */ List<ServiceLoadBalancer>> getLoadBalancers() {
        return this.loadBalancers;
    }
    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * 
     */
    @OutputExport(name="networkConfiguration", type=ServiceNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceNetworkConfiguration> networkConfiguration;

    /**
     * @return Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * 
     */
    public Output</* @Nullable */ ServiceNetworkConfiguration> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. The maximum number of `ordered_placement_strategy` blocks is `5`. See below.
     * 
     */
    @OutputExport(name="orderedPlacementStrategies", type=List.class, parameters={ServiceOrderedPlacementStrategy.class})
    private Output</* @Nullable */ List<ServiceOrderedPlacementStrategy>> orderedPlacementStrategies;

    /**
     * @return Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. The maximum number of `ordered_placement_strategy` blocks is `5`. See below.
     * 
     */
    public Output</* @Nullable */ List<ServiceOrderedPlacementStrategy>> getOrderedPlacementStrategies() {
        return this.orderedPlacementStrategies;
    }
    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. Maximum number of `placement_constraints` is `10`. See below.
     * 
     */
    @OutputExport(name="placementConstraints", type=List.class, parameters={ServicePlacementConstraint.class})
    private Output</* @Nullable */ List<ServicePlacementConstraint>> placementConstraints;

    /**
     * @return Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. Maximum number of `placement_constraints` is `10`. See below.
     * 
     */
    public Output</* @Nullable */ List<ServicePlacementConstraint>> getPlacementConstraints() {
        return this.placementConstraints;
    }
    /**
     * Platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @OutputExport(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return Platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Output<String> getPlatformVersion() {
        return this.platformVersion;
    }
    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     * 
     */
    @OutputExport(name="propagateTags", type=String.class, parameters={})
    private Output</* @Nullable */ String> propagateTags;

    /**
     * @return Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     * 
     */
    public Output</* @Nullable */ String> getPropagateTags() {
        return this.propagateTags;
    }
    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     * 
     */
    @OutputExport(name="schedulingStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedulingStrategy;

    /**
     * @return Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     * 
     */
    public Output</* @Nullable */ String> getSchedulingStrategy() {
        return this.schedulingStrategy;
    }
    /**
     * Service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. See below.
     * 
     */
    @OutputExport(name="serviceRegistries", type=ServiceServiceRegistries.class, parameters={})
    private Output</* @Nullable */ ServiceServiceRegistries> serviceRegistries;

    /**
     * @return Service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. See below.
     * 
     */
    public Output</* @Nullable */ ServiceServiceRegistries> getServiceRegistries() {
        return this.serviceRegistries;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     * 
     */
    @OutputExport(name="taskDefinition", type=String.class, parameters={})
    private Output</* @Nullable */ String> taskDefinition;

    /**
     * @return Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     * 
     */
    public Output</* @Nullable */ String> getTaskDefinition() {
        return this.taskDefinition;
    }
    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     * 
     */
    @OutputExport(name="waitForSteadyState", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForSteadyState;

    /**
     * @return If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getWaitForSteadyState() {
        return this.waitForSteadyState;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ServiceArgs.Builder a);
    }
    private static io.pulumi.aws.ecs.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecs.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, @Nullable ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, @Nullable ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/service:Service", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(String name, Input<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}