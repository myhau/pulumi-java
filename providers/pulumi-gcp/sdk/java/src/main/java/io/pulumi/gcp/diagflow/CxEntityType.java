// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxEntityTypeArgs;
import io.pulumi.gcp.diagflow.inputs.CxEntityTypeState;
import io.pulumi.gcp.diagflow.outputs.CxEntityTypeEntity;
import io.pulumi.gcp.diagflow.outputs.CxEntityTypeExcludedPhrase;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Entities are extracted from user input and represent parameters that are meaningful to your application.
 * For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
 * 
 * To get more information about EntityType, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.entityTypes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EntityType can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxEntityType:CxEntityType default {{parent}}/entityTypes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxEntityType:CxEntityType default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxEntityType:CxEntityType")
public class CxEntityType extends io.pulumi.resources.CustomResource {
    /**
     * Represents kinds of entities.
     * * AUTO_EXPANSION_MODE_UNSPECIFIED: Auto expansion disabled for the entity.
     * * AUTO_EXPANSION_MODE_DEFAULT: Allows an agent to recognize values that have not been explicitly listed in the entity.
     *   Possible values are `AUTO_EXPANSION_MODE_DEFAULT` and `AUTO_EXPANSION_MODE_UNSPECIFIED`.
     * 
     */
    @OutputExport(name="autoExpansionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoExpansionMode;

    /**
     * @return Represents kinds of entities.
     * * AUTO_EXPANSION_MODE_UNSPECIFIED: Auto expansion disabled for the entity.
     * * AUTO_EXPANSION_MODE_DEFAULT: Allows an agent to recognize values that have not been explicitly listed in the entity.
     *   Possible values are `AUTO_EXPANSION_MODE_DEFAULT` and `AUTO_EXPANSION_MODE_UNSPECIFIED`.
     * 
     */
    public Output</* @Nullable */ String> getAutoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the entity type, unique within the agent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @OutputExport(name="enableFuzzyExtraction", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFuzzyExtraction;

    /**
     * @return Enables fuzzy entity extraction during classification.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="entities", type=List.class, parameters={CxEntityTypeEntity.class})
    private Output<List<CxEntityTypeEntity>> entities;

    /**
     * @return The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    public Output<List<CxEntityTypeEntity>> getEntities() {
        return this.entities;
    }
    /**
     * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry giant(an adjective), you might consider adding giants(a noun) as an exclusion.
     * If the kind of entity type is KIND_MAP, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="excludedPhrases", type=List.class, parameters={CxEntityTypeExcludedPhrase.class})
    private Output</* @Nullable */ List<CxEntityTypeExcludedPhrase>> excludedPhrases;

    /**
     * @return Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry giant(an adjective), you might consider adding giants(a noun) as an exclusion.
     * If the kind of entity type is KIND_MAP, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<CxEntityTypeExcludedPhrase>> getExcludedPhrases() {
        return this.excludedPhrases;
    }
    /**
     * Indicates whether the entity type can be automatically expanded.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a canonical value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to canonical values. However, list entity types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Indicates whether the entity type can be automatically expanded.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a canonical value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to canonical values. However, list entity types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The language of the following fields in entityType:
     * EntityType.entities.value
     * EntityType.entities.synonyms
     * EntityType.excluded_phrases.value
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @OutputExport(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in entityType:
     * EntityType.entities.value
     * EntityType.entities.synonyms
     * EntityType.excluded_phrases.value
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output</* @Nullable */ String> getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The unique identifier of the entity type. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent
     * ID>/entityTypes/<Entity Type ID>.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the entity type. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent
     * ID>/entityTypes/<Entity Type ID>.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The agent to create a entity type for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The agent to create a entity type for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    public Output</* @Nullable */ String> getParent() {
        return this.parent;
    }
    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name when logging.
     * 
     */
    @OutputExport(name="redact", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> redact;

    /**
     * @return Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name when logging.
     * 
     */
    public Output</* @Nullable */ Boolean> getRedact() {
        return this.redact;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxEntityType(String name, CxEntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxEntityType:CxEntityType", name, args == null ? CxEntityTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CxEntityType(String name, Input<String> id, @Nullable CxEntityTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxEntityType:CxEntityType", name, state, makeResourceOptions(options, id));
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
    public static CxEntityType get(String name, Input<String> id, @Nullable CxEntityTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxEntityType(name, id, state, options);
    }
}
