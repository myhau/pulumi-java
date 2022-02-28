// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.DomainArgs;
import io.pulumi.aws.sagemaker.inputs.DomainState;
import io.pulumi.aws.sagemaker.outputs.DomainDefaultUserSettings;
import io.pulumi.aws.sagemaker.outputs.DomainRetentionPolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Domain resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code Domains can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/domain:Domain test_domain d-8jgsjtilstu8
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/domain:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    @OutputExport(name="appNetworkAccessType", type=String.class, parameters={})
    private Output</* @Nullable */ String> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    public Output</* @Nullable */ String> getAppNetworkAccessType() {
        return this.appNetworkAccessType;
    }
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    @OutputExport(name="authMode", type=String.class, parameters={})
    private Output<String> authMode;

    /**
     * @return The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    public Output<String> getAuthMode() {
        return this.authMode;
    }
    /**
     * The default user settings. See Default User Settings below.
     * 
     */
    @OutputExport(name="defaultUserSettings", type=DomainDefaultUserSettings.class, parameters={})
    private Output<DomainDefaultUserSettings> defaultUserSettings;

    /**
     * @return The default user settings. See Default User Settings below.
     * 
     */
    public Output<DomainDefaultUserSettings> getDefaultUserSettings() {
        return this.defaultUserSettings;
    }
    /**
     * The domain name.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @OutputExport(name="homeEfsFileSystemId", type=String.class, parameters={})
    private Output<String> homeEfsFileSystemId;

    /**
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    public Output<String> getHomeEfsFileSystemId() {
        return this.homeEfsFileSystemId;
    }
    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    @OutputExport(name="retentionPolicy", type=DomainRetentionPolicy.class, parameters={})
    private Output</* @Nullable */ DomainRetentionPolicy> retentionPolicy;

    /**
     * @return The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    public Output</* @Nullable */ DomainRetentionPolicy> getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The SSO managed application instance ID.
     * 
     */
    @OutputExport(name="singleSignOnManagedApplicationInstanceId", type=String.class, parameters={})
    private Output<String> singleSignOnManagedApplicationInstanceId;

    /**
     * @return The SSO managed application instance ID.
     * 
     */
    public Output<String> getSingleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId;
    }
    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
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
     * The domain's URL.
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The domain's URL.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Domain(String name, Input<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Input<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
