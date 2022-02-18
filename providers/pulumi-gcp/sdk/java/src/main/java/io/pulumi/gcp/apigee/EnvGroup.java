// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigee.EnvGroupArgs;
import io.pulumi.gcp.apigee.inputs.EnvGroupState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An `Environment group` in Apigee.
 * 
 * To get more information about Envgroup, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.envgroups/create)
 * * How-to Guides
 *     * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Envgroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/envGroup:EnvGroup default {{org_id}}/envgroups/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/envGroup:EnvGroup default {{org_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/envGroup:EnvGroup")
public class EnvGroup extends io.pulumi.resources.CustomResource {
    /**
     * Hostnames of the environment group.
     * 
     */
    @OutputExport(name="hostnames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> hostnames;

    /**
     * @return Hostnames of the environment group.
     * 
     */
    public Output</* @Nullable */ List<String>> getHostnames() {
        return this.hostnames;
    }
    /**
     * The resource ID of the environment group.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource ID of the environment group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Apigee Organization associated with the Apigee environment group,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @OutputExport(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the Apigee environment group,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    public Output<String> getOrgId() {
        return this.orgId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvGroup(String name, EnvGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/envGroup:EnvGroup", name, args == null ? EnvGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EnvGroup(String name, Input<String> id, @Nullable EnvGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/envGroup:EnvGroup", name, state, makeResourceOptions(options, id));
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
    public static EnvGroup get(String name, Input<String> id, @Nullable EnvGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvGroup(name, id, state, options);
    }
}
