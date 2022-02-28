// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appmesh.RouteArgs;
import io.pulumi.aws.appmesh.inputs.RouteState;
import io.pulumi.aws.appmesh.outputs.RouteSpec;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh route resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Mesh virtual routes can be imported using `mesh_name` and `virtual_router_name` together with the route's `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/route:Route serviceb simpleapp/serviceB/serviceB-route
 * ```
 * 
 *  [1]/docs/providers/aws/index.html
 * 
 */
@ResourceType(type="aws:appmesh/route:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the route.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the route.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The creation date of the route.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the route.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The last update date of the route.
     * 
     */
    @OutputExport(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The last update date of the route.
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @OutputExport(name="meshName", type=String.class, parameters={})
    private Output<String> meshName;

    /**
     * @return The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getMeshName() {
        return this.meshName;
    }
    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @OutputExport(name="meshOwner", type=String.class, parameters={})
    private Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    public Output<String> getMeshOwner() {
        return this.meshOwner;
    }
    /**
     * The name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
     */
    @OutputExport(name="resourceOwner", type=String.class, parameters={})
    private Output<String> resourceOwner;

    /**
     * @return The resource owner's AWS account ID.
     * 
     */
    public Output<String> getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The route specification to apply.
     * 
     */
    @OutputExport(name="spec", type=RouteSpec.class, parameters={})
    private Output<RouteSpec> spec;

    /**
     * @return The route specification to apply.
     * 
     */
    public Output<RouteSpec> getSpec() {
        return this.spec;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @OutputExport(name="virtualRouterName", type=String.class, parameters={})
    private Output<String> virtualRouterName;

    /**
     * @return The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getVirtualRouterName() {
        return this.virtualRouterName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Route(String name, Input<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Input<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
