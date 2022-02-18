// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxIntentArgs;
import io.pulumi.gcp.diagflow.inputs.CxIntentState;
import io.pulumi.gcp.diagflow.outputs.CxIntentParameter;
import io.pulumi.gcp.diagflow.outputs.CxIntentTrainingPhrase;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An intent represents a user's intent to interact with a conversational agent.
 * 
 * To get more information about Intent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Intent can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxIntent:CxIntent default {{parent}}/intents/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxIntent:CxIntent default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxIntent:CxIntent")
public class CxIntent extends io.pulumi.resources.CustomResource {
    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the intent, unique within the agent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @OutputExport(name="isFallback", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsFallback() {
        return this.isFallback;
    }
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @OutputExport(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output</* @Nullable */ String> getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The unique identifier of the intent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent
     * ID>/intents/<Intent ID>.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the intent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent
     * ID>/intents/<Intent ID>.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="parameters", type=List.class, parameters={CxIntentParameter.class})
    private Output</* @Nullable */ List<CxIntentParameter>> parameters;

    /**
     * @return The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<CxIntentParameter>> getParameters() {
        return this.parameters;
    }
    /**
     * The agent to create an intent for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The agent to create an intent for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    public Output</* @Nullable */ String> getParent() {
        return this.parent;
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Output</* @Nullable */ Integer> getPriority() {
        return this.priority;
    }
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="trainingPhrases", type=List.class, parameters={CxIntentTrainingPhrase.class})
    private Output</* @Nullable */ List<CxIntentTrainingPhrase>> trainingPhrases;

    /**
     * @return The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<CxIntentTrainingPhrase>> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxIntent(String name, CxIntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxIntent:CxIntent", name, args == null ? CxIntentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CxIntent(String name, Input<String> id, @Nullable CxIntentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxIntent:CxIntent", name, state, makeResourceOptions(options, id));
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
    public static CxIntent get(String name, Input<String> id, @Nullable CxIntentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxIntent(name, id, state, options);
    }
}
