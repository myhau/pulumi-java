// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ram.PrincipalAssociationArgs;
import io.pulumi.aws.ram.inputs.PrincipalAssociationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Resource Access Manager (RAM) principal association. Depending if [RAM Sharing with AWS Organizations is enabled](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs), the RAM behavior with different principal types changes.
 * 
 * When RAM Sharing with AWS Organizations is enabled:
 * 
 * - For AWS Account ID, Organization, and Organizational Unit principals within the same AWS Organization, no resource share invitation is sent and resources become available automatically after creating the association.
 * - For AWS Account ID principals outside the AWS Organization, a resource share invitation is sent and must be accepted before resources become available. See the `aws.ram.ResourceShareAccepter` resource to accept these invitations.
 * 
 * When RAM Sharing with AWS Organizations is not enabled:
 * 
 * - Organization and Organizational Unit principals cannot be used.
 * - For AWS Account ID principals, a resource share invitation is sent and must be accepted before resources become available. See the `aws.ram.ResourceShareAccepter` resource to accept these invitations.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RAM Principal Associations can be imported using their Resource Share ARN and the `principal` separated by a comma, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ram/principalAssociation:PrincipalAssociation example arn:aws:ram:eu-west-1:123456789012:resource-share/73da1ab9-b94a-4ba3-8eb4-45917f7f4b12,123456789012
 * ```
 * 
 */
@ResourceType(type="aws:ram/principalAssociation:PrincipalAssociation")
public class PrincipalAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
     * 
     */
    @OutputExport(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
     * 
     */
    public Output<String> getPrincipal() {
        return this.principal;
    }
    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @OutputExport(name="resourceShareArn", type=String.class, parameters={})
    private Output<String> resourceShareArn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    public Output<String> getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrincipalAssociation(String name) {
        this(name, PrincipalAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrincipalAssociation(String name, PrincipalAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrincipalAssociation(String name, PrincipalAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/principalAssociation:PrincipalAssociation", name, args == null ? PrincipalAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrincipalAssociation(String name, Input<String> id, @Nullable PrincipalAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/principalAssociation:PrincipalAssociation", name, state, makeResourceOptions(options, id));
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
    public static PrincipalAssociation get(String name, Input<String> id, @Nullable PrincipalAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrincipalAssociation(name, id, state, options);
    }
}
