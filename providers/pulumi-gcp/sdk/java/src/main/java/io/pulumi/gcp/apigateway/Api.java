// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.ApiArgs;
import io.pulumi.gcp.apigateway.inputs.ApiState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A consumable API that can be used by multiple Gateways.
 * 
 * To get more information about Api, see:
 * 
 * * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/api-gateway/docs/quickstart)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Api can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/api:Api default projects/{{project}}/locations/global/apis/{{api_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/api:Api default {{project}}/{{api_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/api:Api default {{api_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigateway/api:Api")
public class Api extends io.pulumi.resources.CustomResource {
    /**
     * Identifier to assign to the API. Must be unique within scope of the parent resource(project)
     * 
     */
    @OutputExport(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return Identifier to assign to the API. Must be unique within scope of the parent resource(project)
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A user-visible name for the API.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-visible name for the API.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed).
     * If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    @OutputExport(name="managedService", type=String.class, parameters={})
    private Output<String> managedService;

    /**
     * @return Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed).
     * If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    public Output<String> getManagedService() {
        return this.managedService;
    }
    /**
     * The resource name of the API. Format 'projects/{{project}}/locations/global/apis/{{apiId}}'
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the API. Format 'projects/{{project}}/locations/global/apis/{{apiId}}'
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Api(String name, ApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/api:Api", name, args == null ? ApiArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Api(String name, Input<String> id, @Nullable ApiState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/api:Api", name, state, makeResourceOptions(options, id));
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
    public static Api get(String name, Input<String> id, @Nullable ApiState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Api(name, id, state, options);
    }
}
