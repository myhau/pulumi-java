// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.serverlessrepository;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.serverlessrepository.CloudFormationStackArgs;
import io.pulumi.aws.serverlessrepository.inputs.CloudFormationStackState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Deploys an Application CloudFormation Stack from the Serverless Application Repository.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Serverless Application Repository Stack can be imported using the CloudFormation Stack name (with or without the `serverlessrepo-` prefix) or the CloudFormation Stack ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:serverlessrepository/cloudFormationStack:CloudFormationStack example serverlessrepo-postgres-rotator
 * ```
 * 
 */
@ResourceType(type="aws:serverlessrepository/cloudFormationStack:CloudFormationStack")
public class CloudFormationStack extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the application from the Serverless Application Repository.
     * 
     */
    @OutputExport(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The ARN of the application from the Serverless Application Repository.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
     * 
     */
    @OutputExport(name="capabilities", type=List.class, parameters={String.class})
    private Output<List<String>> capabilities;

    /**
     * @return A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
     * 
     */
    public Output<List<String>> getCapabilities() {
        return this.capabilities;
    }
    /**
     * The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A map of outputs from the stack.
     * 
     */
    @OutputExport(name="outputs", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> outputs;

    /**
     * @return A map of outputs from the stack.
     * 
     */
    public Output<Map<String,String>> getOutputs() {
        return this.outputs;
    }
    /**
     * A map of Parameter structures that specify input parameters for the stack.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> parameters;

    /**
     * @return A map of Parameter structures that specify input parameters for the stack.
     * 
     */
    public Output<Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * The version of the application to deploy. If not supplied, deploys the latest version.
     * 
     */
    @OutputExport(name="semanticVersion", type=String.class, parameters={})
    private Output<String> semanticVersion;

    /**
     * @return The version of the application to deploy. If not supplied, deploys the latest version.
     * 
     */
    public Output<String> getSemanticVersion() {
        return this.semanticVersion;
    }
    /**
     * A list of tags to associate with this stack. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of tags to associate with this stack. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudFormationStack(String name) {
        this(name, CloudFormationStackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudFormationStack(String name, CloudFormationStackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudFormationStack(String name, CloudFormationStackArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:serverlessrepository/cloudFormationStack:CloudFormationStack", name, args == null ? CloudFormationStackArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CloudFormationStack(String name, Input<String> id, @Nullable CloudFormationStackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:serverlessrepository/cloudFormationStack:CloudFormationStack", name, state, makeResourceOptions(options, id));
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
    public static CloudFormationStack get(String name, Input<String> id, @Nullable CloudFormationStackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CloudFormationStack(name, id, state, options);
    }
}
