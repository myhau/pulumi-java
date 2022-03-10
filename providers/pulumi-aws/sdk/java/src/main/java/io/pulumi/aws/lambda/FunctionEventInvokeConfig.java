// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lambda.FunctionEventInvokeConfigArgs;
import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState;
import io.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an asynchronous invocation configuration for a Lambda Function or Alias. More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Lambda Function Event Invoke Configs can be imported using the fully qualified Function name or Amazon Resource Name (ARN), e.g., ARN without qualifier (all versions and aliases)
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function
 * ```
 * 
 *  ARN with qualifier
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function:production
 * ```
 * 
 *  Name without qualifier (all versions and aliases)
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function
 * ```
 * 
 *  Name with qualifier
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function:production
 * ```
 * 
 */
@ResourceType(type="aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig")
public class FunctionEventInvokeConfig extends io.pulumi.resources.CustomResource {
    /**
     * Configuration block with destination configuration. See below for details.
     * 
     */
    @OutputExport(name="destinationConfig", type=FunctionEventInvokeConfigDestinationConfig.class, parameters={})
    private Output</* @Nullable */ FunctionEventInvokeConfigDestinationConfig> destinationConfig;

    /**
     * @return Configuration block with destination configuration. See below for details.
     * 
     */
    public Output</* @Nullable */ FunctionEventInvokeConfigDestinationConfig> getDestinationConfig() {
        return this.destinationConfig;
    }
    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @OutputExport(name="functionName", type=String.class, parameters={})
    private Output<String> functionName;

    /**
     * @return Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    public Output<String> getFunctionName() {
        return this.functionName;
    }
    /**
     * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    @OutputExport(name="maximumEventAgeInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumEventAgeInSeconds;

    /**
     * @return Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds;
    }
    /**
     * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    @OutputExport(name="maximumRetryAttempts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumRetryAttempts;

    /**
     * @return Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }
    /**
     * Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    @OutputExport(name="qualifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> qualifier;

    /**
     * @return Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    public Output</* @Nullable */ String> getQualifier() {
        return this.qualifier;
    }

    public interface BuilderApplicator {
        public void apply(FunctionEventInvokeConfigArgs.Builder a);
    }
    private static io.pulumi.aws.lambda.FunctionEventInvokeConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FunctionEventInvokeConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionEventInvokeConfig(String name) {
        this(name, FunctionEventInvokeConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionEventInvokeConfig(String name, FunctionEventInvokeConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionEventInvokeConfig(String name, FunctionEventInvokeConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, args == null ? FunctionEventInvokeConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FunctionEventInvokeConfig(String name, Input<String> id, @Nullable FunctionEventInvokeConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, state, makeResourceOptions(options, id));
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
    public static FunctionEventInvokeConfig get(String name, Input<String> id, @Nullable FunctionEventInvokeConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FunctionEventInvokeConfig(name, id, state, options);
    }
}