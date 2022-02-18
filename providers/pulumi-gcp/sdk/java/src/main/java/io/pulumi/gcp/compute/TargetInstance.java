// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.TargetInstanceArgs;
import io.pulumi.gcp.compute.inputs.TargetInstanceState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a TargetInstance resource which defines an endpoint instance
 * that terminates traffic of certain protocols. In particular, they are used
 * in Protocol Forwarding, where forwarding rules can send packets to a
 * non-NAT'ed target instance. Each target instance contains a single
 * virtual machine instance that receives and handles traffic from the
 * corresponding forwarding rules.
 * 
 * To get more information about TargetInstance, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/targetInstances)
 * * How-to Guides
 *     * [Using Protocol Forwarding](https://cloud.google.com/compute/docs/protocol-forwarding)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TargetInstance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetInstance:TargetInstance default projects/{{project}}/zones/{{zone}}/targetInstances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetInstance:TargetInstance default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetInstance:TargetInstance default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetInstance:TargetInstance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/targetInstance:TargetInstance")
public class TargetInstance extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Compute instance VM handling traffic for this target instance.
     * Accepts the instance self-link, relative path
     * (e.g. `projects/project/zones/zone/instances/instance`) or name. If
     * name is given, the zone will default to the given zone or
     * the provider-default zone and the project will default to the
     * provider-level project.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The Compute instance VM handling traffic for this target instance.
     * Accepts the instance self-link, relative path
     * (e.g. `projects/project/zones/zone/instances/instance`) or name. If
     * name is given, the zone will default to the given zone or
     * the provider-default zone and the project will default to the
     * provider-level project.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * NAT option controlling how IPs are NAT'ed to the instance.
     * Currently only NO_NAT (default value) is supported.
     * Default value is `NO_NAT`.
     * Possible values are `NO_NAT`.
     * 
     */
    @OutputExport(name="natPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> natPolicy;

    /**
     * @return NAT option controlling how IPs are NAT'ed to the instance.
     * Currently only NO_NAT (default value) is supported.
     * Default value is `NO_NAT`.
     * Possible values are `NO_NAT`.
     * 
     */
    public Output</* @Nullable */ String> getNatPolicy() {
        return this.natPolicy;
    }
    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    public Output</* @Nullable */ String> getNetwork() {
        return this.network;
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
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * URL of the zone where the target instance resides.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the zone where the target instance resides.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetInstance(String name, TargetInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetInstance:TargetInstance", name, args == null ? TargetInstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TargetInstance(String name, Input<String> id, @Nullable TargetInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetInstance:TargetInstance", name, state, makeResourceOptions(options, id));
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
    public static TargetInstance get(String name, Input<String> id, @Nullable TargetInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TargetInstance(name, id, state, options);
    }
}
