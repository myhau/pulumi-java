// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53recoveryreadiness.CellArgs;
import io.pulumi.aws.route53recoveryreadiness.inputs.CellState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Readiness Cell.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Recovery Readiness cells can be imported via the cell name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoveryreadiness/cell:Cell us-west-2-failover-cell us-west-2-failover-cell
 * ```
 * 
 */
@ResourceType(type="aws:route53recoveryreadiness/cell:Cell")
public class Cell extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the cell
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the cell
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Unique name describing the cell.
     * 
     */
    @OutputExport(name="cellName", type=String.class, parameters={})
    private Output<String> cellName;

    /**
     * @return Unique name describing the cell.
     * 
     */
    public Output<String> getCellName() {
        return this.cellName;
    }
    /**
     * List of cell arns to add as nested fault domains within this cell.
     * 
     */
    @OutputExport(name="cells", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cells;

    /**
     * @return List of cell arns to add as nested fault domains within this cell.
     * 
     */
    public Output</* @Nullable */ List<String>> getCells() {
        return this.cells;
    }
    /**
     * List of readiness scopes (recovery groups or cells) that contain this cell.
     * 
     */
    @OutputExport(name="parentReadinessScopes", type=List.class, parameters={String.class})
    private Output<List<String>> parentReadinessScopes;

    /**
     * @return List of readiness scopes (recovery groups or cells) that contain this cell.
     * 
     */
    public Output<List<String>> getParentReadinessScopes() {
        return this.parentReadinessScopes;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(CellArgs.Builder a);
    }
    private static io.pulumi.aws.route53recoveryreadiness.CellArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53recoveryreadiness.CellArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cell(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cell(String name) {
        this(name, CellArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cell(String name, CellArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cell(String name, CellArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoveryreadiness/cell:Cell", name, args == null ? CellArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cell(String name, Input<String> id, @Nullable CellState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoveryreadiness/cell:Cell", name, state, makeResourceOptions(options, id));
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
    public static Cell get(String name, Input<String> id, @Nullable CellState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cell(name, id, state, options);
    }
}