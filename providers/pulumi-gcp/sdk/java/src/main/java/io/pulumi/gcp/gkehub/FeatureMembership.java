// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gkehub.FeatureMembershipArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipState;
import io.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagement;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * FeatureMembership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default projects/{{project}}/locations/{{location}}/features/{{feature}}/membershipId/{{membership}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default {{project}}/{{location}}/{{feature}}/{{membership}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default {{location}}/{{feature}}/{{membership}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/featureMembership:FeatureMembership")
public class FeatureMembership extends io.pulumi.resources.CustomResource {
    /**
     * Config Management-specific spec. Structure is documented below.
     * 
     */
    @OutputExport(name="configmanagement", type=FeatureMembershipConfigmanagement.class, parameters={})
    private Output<FeatureMembershipConfigmanagement> configmanagement;

    /**
     * @return Config Management-specific spec. Structure is documented below.
     * 
     */
    public Output<FeatureMembershipConfigmanagement> getConfigmanagement() {
        return this.configmanagement;
    }
    /**
     * The name of the feature
     * 
     */
    @OutputExport(name="feature", type=String.class, parameters={})
    private Output<String> feature;

    /**
     * @return The name of the feature
     * 
     */
    public Output<String> getFeature() {
        return this.feature;
    }
    /**
     * The location of the feature
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the feature
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the membership
     * 
     */
    @OutputExport(name="membership", type=String.class, parameters={})
    private Output<String> membership;

    /**
     * @return The name of the membership
     * 
     */
    public Output<String> getMembership() {
        return this.membership;
    }
    /**
     * The project of the feature
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project of the feature
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
    public FeatureMembership(String name, FeatureMembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/featureMembership:FeatureMembership", name, args == null ? FeatureMembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FeatureMembership(String name, Input<String> id, @Nullable FeatureMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/featureMembership:FeatureMembership", name, state, makeResourceOptions(options, id));
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
    public static FeatureMembership get(String name, Input<String> id, @Nullable FeatureMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FeatureMembership(name, id, state, options);
    }
}
