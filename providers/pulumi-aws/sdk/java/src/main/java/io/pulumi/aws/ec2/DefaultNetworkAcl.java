// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DefaultNetworkAclArgs;
import io.pulumi.aws.ec2.inputs.DefaultNetworkAclState;
import io.pulumi.aws.ec2.outputs.DefaultNetworkAclEgress;
import io.pulumi.aws.ec2.outputs.DefaultNetworkAclIngress;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a VPC's default network ACL. This resource can manage the default network ACL of the default or a non-default VPC.
 * 
 * > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultNetworkAcl` behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management.
 * 
 * Every VPC has a default network ACL that can be managed but not destroyed. When the provider first adopts the Default Network ACL, it **immediately removes all rules in the ACL**. It then proceeds to create any rules specified in the configuration. This step is required so that only the rules specified in the configuration are created.
 * 
 * This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diffs being shown. For these reasons, this resource is incompatible with the `aws.ec2.NetworkAclRule` resource.
 * 
 * For more information about Network ACLs, see the AWS Documentation on [Network ACLs][aws-network-acls].
 * 
 * ## Example Usage
 * ### Removing `aws.ec2.DefaultNetworkAcl` From Your Configuration
 * 
 * Each AWS VPC comes with a Default Network ACL that cannot be deleted. The `aws.ec2.DefaultNetworkAcl` allows you to manage this Network ACL, but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile and management, **but will not destroy the Network ACL.** All Subnets associations and ingress or egress rules will be left as they are at the time of removal. You can resume managing them via the AWS Console.
 * 
 * ## Import
 * 
 * Default Network ACLs can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultNetworkAcl:DefaultNetworkAcl sample acl-7aaabd18
 * ```
 * 
 */
@ResourceType(type="aws:ec2/defaultNetworkAcl:DefaultNetworkAcl")
public class DefaultNetworkAcl extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the Default Network ACL
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Default Network ACL
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Network ACL ID to manage. This attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
     * 
     */
    @OutputExport(name="defaultNetworkAclId", type=String.class, parameters={})
    private Output<String> defaultNetworkAclId;

    /**
     * @return Network ACL ID to manage. This attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
     * 
     */
    public Output<String> getDefaultNetworkAclId() {
        return this.defaultNetworkAclId;
    }
    /**
     * Configuration block for an egress rule. Detailed below.
     * 
     */
    @OutputExport(name="egress", type=List.class, parameters={DefaultNetworkAclEgress.class})
    private Output</* @Nullable */ List<DefaultNetworkAclEgress>> egress;

    /**
     * @return Configuration block for an egress rule. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<DefaultNetworkAclEgress>> getEgress() {
        return this.egress;
    }
    /**
     * Configuration block for an ingress rule. Detailed below.
     * 
     */
    @OutputExport(name="ingress", type=List.class, parameters={DefaultNetworkAclIngress.class})
    private Output</* @Nullable */ List<DefaultNetworkAclIngress>> ingress;

    /**
     * @return Configuration block for an ingress rule. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<DefaultNetworkAclIngress>> getIngress() {
        return this.ingress;
    }
    /**
     * ID of the AWS account that owns the Default Network ACL
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns the Default Network ACL
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
     * 
     */
    public Output</* @Nullable */ List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * ID of the associated VPC
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return ID of the associated VPC
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultNetworkAcl(String name) {
        this(name, DefaultNetworkAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultNetworkAcl(String name, DefaultNetworkAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultNetworkAcl(String name, DefaultNetworkAclArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultNetworkAcl:DefaultNetworkAcl", name, args == null ? DefaultNetworkAclArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefaultNetworkAcl(String name, Input<String> id, @Nullable DefaultNetworkAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultNetworkAcl:DefaultNetworkAcl", name, state, makeResourceOptions(options, id));
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
    public static DefaultNetworkAcl get(String name, Input<String> id, @Nullable DefaultNetworkAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultNetworkAcl(name, id, state, options);
    }
}
