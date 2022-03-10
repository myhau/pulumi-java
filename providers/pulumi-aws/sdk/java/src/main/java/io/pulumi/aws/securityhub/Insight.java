// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.InsightArgs;
import io.pulumi.aws.securityhub.inputs.InsightState;
import io.pulumi.aws.securityhub.outputs.InsightFilters;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Security Hub custom insight resource. See the [Managing custom insights section](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-insights.html) of the AWS User Guide for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub insights can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/insight:Insight example arn:aws:securityhub:us-west-2:1234567890:insight/1234567890/custom/91299ed7-abd0-4e44-a858-d0b15e37141a
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/insight:Insight")
public class Insight extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the insight.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the insight.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * 
     */
    @OutputExport(name="filters", type=InsightFilters.class, parameters={})
    private Output<InsightFilters> filters;

    /**
     * @return A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * 
     */
    public Output<InsightFilters> getFilters() {
        return this.filters;
    }
    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     * 
     */
    @OutputExport(name="groupByAttribute", type=String.class, parameters={})
    private Output<String> groupByAttribute;

    /**
     * @return The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     * 
     */
    public Output<String> getGroupByAttribute() {
        return this.groupByAttribute;
    }
    /**
     * The name of the custom insight.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the custom insight.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(InsightArgs.Builder a);
    }
    private static io.pulumi.aws.securityhub.InsightArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.securityhub.InsightArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Insight(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Insight(String name) {
        this(name, InsightArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Insight(String name, InsightArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Insight(String name, InsightArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/insight:Insight", name, args == null ? InsightArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Insight(String name, Input<String> id, @Nullable InsightState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/insight:Insight", name, state, makeResourceOptions(options, id));
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
    public static Insight get(String name, Input<String> id, @Nullable InsightState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Insight(name, id, state, options);
    }
}