// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1EntityTypeEntityResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEntityTypeResult {
    /**
     * Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    private final String autoExpansionMode;
    /**
     * The name of the entity type.
     * 
     */
    private final String displayName;
    /**
     * Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    private final Boolean enableFuzzyExtraction;
    /**
     * Optional. The collection of entity entries associated with the entity type.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
    /**
     * Indicates the kind of entity type.
     * 
     */
    private final String kind;
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"autoExpansionMode","displayName","enableFuzzyExtraction","entities","kind","name"})
    private GetEntityTypeResult(
        String autoExpansionMode,
        String displayName,
        Boolean enableFuzzyExtraction,
        List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities,
        String kind,
        String name) {
        this.autoExpansionMode = autoExpansionMode;
        this.displayName = displayName;
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.kind = kind;
        this.name = name;
    }

    /**
     * Optional. Indicates whether the entity type can be automatically expanded.
     * 
    */
    public String getAutoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The name of the entity type.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Enables fuzzy entity extraction during classification.
     * 
    */
    public Boolean getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * Optional. The collection of entity entries associated with the entity type.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> getEntities() {
        return this.entities;
    }
    /**
     * Indicates the kind of entity type.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoExpansionMode;
        private String displayName;
        private Boolean enableFuzzyExtraction;
        private List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExpansionMode = defaults.autoExpansionMode;
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setAutoExpansionMode(String autoExpansionMode) {
            this.autoExpansionMode = Objects.requireNonNull(autoExpansionMode);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEnableFuzzyExtraction(Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Objects.requireNonNull(enableFuzzyExtraction);
            return this;
        }

        public Builder setEntities(List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetEntityTypeResult build() {
            return new GetEntityTypeResult(autoExpansionMode, displayName, enableFuzzyExtraction, entities, kind, name);
        }
    }
}
