// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.ProjectSinkArgs;
import io.pulumi.gcp.logging.inputs.ProjectSinkState;
import io.pulumi.gcp.logging.outputs.ProjectSinkBigqueryOptions;
import io.pulumi.gcp.logging.outputs.ProjectSinkExclusion;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Project-level logging sinks can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:logging/projectSink:ProjectSink my_sink projects/my-project/sinks/my-sink
 * ```
 * 
 */
@ResourceType(type="gcp:logging/projectSink:ProjectSink")
public class ProjectSink extends io.pulumi.resources.CustomResource {
    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @OutputExport(name="bigqueryOptions", type=ProjectSinkBigqueryOptions.class, parameters={})
    private Output<ProjectSinkBigqueryOptions> bigqueryOptions;

    /**
     * @return Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    public Output<ProjectSinkBigqueryOptions> getBigqueryOptions() {
        return this.bigqueryOptions;
    }
    /**
     * A description of this exclusion.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this exclusion.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket . Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @OutputExport(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket . Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    public Output<String> getDestination() {
        return this.destination;
    }
    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @OutputExport(name="exclusions", type=List.class, parameters={ProjectSinkExclusion.class})
    private Output</* @Nullable */ List<ProjectSinkExclusion>> exclusions;

    /**
     * @return Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<ProjectSinkExclusion>> getExclusions() {
        return this.exclusions;
    }
    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output</* @Nullable */ String> filter;

    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public Output</* @Nullable */ String> getFilter() {
        return this.filter;
    }
    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
     * `bigquery_options`, you must set `unique_writer_identity` to true.
     * 
     */
    @OutputExport(name="uniqueWriterIdentity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> uniqueWriterIdentity;

    /**
     * @return Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
     * `bigquery_options`, you must set `unique_writer_identity` to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getUniqueWriterIdentity() {
        return this.uniqueWriterIdentity;
    }
    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @OutputExport(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    public Output<String> getWriterIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectSink(String name, ProjectSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/projectSink:ProjectSink", name, args == null ? ProjectSinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProjectSink(String name, Input<String> id, @Nullable ProjectSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/projectSink:ProjectSink", name, state, makeResourceOptions(options, id));
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
    public static ProjectSink get(String name, Input<String> id, @Nullable ProjectSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProjectSink(name, id, state, options);
    }
}
