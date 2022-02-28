// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inspector.AssessmentTargetArgs;
import io.pulumi.aws.inspector.inputs.AssessmentTargetState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Inspector assessment target
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Inspector Assessment Targets can be imported via their Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:inspector/assessmentTarget:AssessmentTarget example arn:aws:inspector:us-east-1:123456789012:target/0-xxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:inspector/assessmentTarget:AssessmentTarget")
public class AssessmentTarget extends io.pulumi.resources.CustomResource {
    /**
     * The target assessment ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The target assessment ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the assessment target.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the assessment target.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    @OutputExport(name="resourceGroupArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupArn;

    /**
     * @return Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    public Output</* @Nullable */ String> getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AssessmentTarget(String name) {
        this(name, AssessmentTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AssessmentTarget(String name, @Nullable AssessmentTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AssessmentTarget(String name, @Nullable AssessmentTargetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector/assessmentTarget:AssessmentTarget", name, args == null ? AssessmentTargetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AssessmentTarget(String name, Input<String> id, @Nullable AssessmentTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector/assessmentTarget:AssessmentTarget", name, state, makeResourceOptions(options, id));
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
    public static AssessmentTarget get(String name, Input<String> id, @Nullable AssessmentTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AssessmentTarget(name, id, state, options);
    }
}
