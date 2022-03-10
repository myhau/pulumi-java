// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cfg.RecorderArgs;
import io.pulumi.aws.cfg.inputs.RecorderState;
import io.pulumi.aws.cfg.outputs.RecorderRecordingGroup;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Config Configuration Recorder. Please note that this resource **does not start** the created recorder automatically.
 * 
 * > **Note:** _Starting_ the Configuration Recorder requires a `delivery channel` (while delivery channel creation requires Configuration Recorder). This is why `aws.cfg.RecorderStatus` is a separate resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Configuration Recorder can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cfg/recorder:Recorder foo example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/recorder:Recorder")
public class Recorder extends io.pulumi.resources.CustomResource {
    /**
     * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the recorder. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Recording group - see below.
     * 
     */
    @OutputExport(name="recordingGroup", type=RecorderRecordingGroup.class, parameters={})
    private Output<RecorderRecordingGroup> recordingGroup;

    /**
     * @return Recording group - see below.
     * 
     */
    public Output<RecorderRecordingGroup> getRecordingGroup() {
        return this.recordingGroup;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public interface BuilderApplicator {
        public void apply(RecorderArgs.Builder a);
    }
    private static io.pulumi.aws.cfg.RecorderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cfg.RecorderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Recorder(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Recorder(String name) {
        this(name, RecorderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Recorder(String name, RecorderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Recorder(String name, RecorderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorder:Recorder", name, args == null ? RecorderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Recorder(String name, Input<String> id, @Nullable RecorderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorder:Recorder", name, state, makeResourceOptions(options, id));
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
    public static Recorder get(String name, Input<String> id, @Nullable RecorderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Recorder(name, id, state, options);
    }
}