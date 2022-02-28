// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.ProductArgs;
import io.pulumi.aws.servicecatalog.inputs.ProductState;
import io.pulumi.aws.servicecatalog.outputs.ProductProvisioningArtifactParameters;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Product.
 * 
 * > **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.
 * 
 * > A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_product` can be imported using the product ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/product:Product")
public class Product extends io.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @OutputExport(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output</* @Nullable */ String> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    /**
     * ARN of the product.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the product.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Time when the product was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Time when the product was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @OutputExport(name="distributor", type=String.class, parameters={})
    private Output<String> distributor;

    /**
     * @return Distributor (i.e., vendor) of the product.
     * 
     */
    public Output<String> getDistributor() {
        return this.distributor;
    }
    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    @OutputExport(name="hasDefaultPath", type=Boolean.class, parameters={})
    private Output<Boolean> hasDefaultPath;

    /**
     * @return Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    public Output<Boolean> getHasDefaultPath() {
        return this.hasDefaultPath;
    }
    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Owner of the product.
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Owner of the product.
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @OutputExport(name="provisioningArtifactParameters", type=ProductProvisioningArtifactParameters.class, parameters={})
    private Output<ProductProvisioningArtifactParameters> provisioningArtifactParameters;

    /**
     * @return Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    public Output<ProductProvisioningArtifactParameters> getProvisioningArtifactParameters() {
        return this.provisioningArtifactParameters;
    }
    /**
     * Status of the product.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the product.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Support information about the product.
     * 
     */
    @OutputExport(name="supportDescription", type=String.class, parameters={})
    private Output<String> supportDescription;

    /**
     * @return Support information about the product.
     * 
     */
    public Output<String> getSupportDescription() {
        return this.supportDescription;
    }
    /**
     * Contact email for product support.
     * 
     */
    @OutputExport(name="supportEmail", type=String.class, parameters={})
    private Output<String> supportEmail;

    /**
     * @return Contact email for product support.
     * 
     */
    public Output<String> getSupportEmail() {
        return this.supportEmail;
    }
    /**
     * Contact URL for product support.
     * 
     */
    @OutputExport(name="supportUrl", type=String.class, parameters={})
    private Output<String> supportUrl;

    /**
     * @return Contact URL for product support.
     * 
     */
    public Output<String> getSupportUrl() {
        return this.supportUrl;
    }
    /**
     * Tags to apply to the product. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the product. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Product(String name) {
        this(name, ProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Product(String name, ProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Product(String name, ProductArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/product:Product", name, args == null ? ProductArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Product(String name, Input<String> id, @Nullable ProductState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/product:Product", name, state, makeResourceOptions(options, id));
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
    public static Product get(String name, Input<String> id, @Nullable ProductState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Product(name, id, state, options);
    }
}
