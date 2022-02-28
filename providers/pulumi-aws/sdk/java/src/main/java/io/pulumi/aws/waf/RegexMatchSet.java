// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.RegexMatchSetArgs;
import io.pulumi.aws.waf.inputs.RegexMatchSetState;
import io.pulumi.aws.waf.outputs.RegexMatchSetRegexMatchTuple;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regex Match Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Regex Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/regexMatchSet:RegexMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/regexMatchSet:RegexMatchSet")
public class RegexMatchSet extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name or description of the Regex Match Set.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Regex Match Set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    @OutputExport(name="regexMatchTuples", type=List.class, parameters={RegexMatchSetRegexMatchTuple.class})
    private Output</* @Nullable */ List<RegexMatchSetRegexMatchTuple>> regexMatchTuples;

    /**
     * @return The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    public Output</* @Nullable */ List<RegexMatchSetRegexMatchTuple>> getRegexMatchTuples() {
        return this.regexMatchTuples;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexMatchSet(String name) {
        this(name, RegexMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/regexMatchSet:RegexMatchSet", name, args == null ? RegexMatchSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegexMatchSet(String name, Input<String> id, @Nullable RegexMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/regexMatchSet:RegexMatchSet", name, state, makeResourceOptions(options, id));
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
    public static RegexMatchSet get(String name, Input<String> id, @Nullable RegexMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegexMatchSet(name, id, state, options);
    }
}
