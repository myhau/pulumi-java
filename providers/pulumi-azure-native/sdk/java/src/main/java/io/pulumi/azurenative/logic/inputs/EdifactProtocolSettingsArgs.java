// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.EdifactAcknowledgementSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactDelimiterOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactEnvelopeOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactEnvelopeSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactFramingSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactMessageFilterArgs;
import io.pulumi.azurenative.logic.inputs.EdifactMessageIdentifierArgs;
import io.pulumi.azurenative.logic.inputs.EdifactProcessingSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactSchemaReferenceArgs;
import io.pulumi.azurenative.logic.inputs.EdifactValidationOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactValidationSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact agreement protocol settings.
 * 
 */
public final class EdifactProtocolSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactProtocolSettingsArgs Empty = new EdifactProtocolSettingsArgs();

    /**
     * The EDIFACT acknowledgement settings.
     * 
     */
    @Import(name="acknowledgementSettings", required=true)
      private final Output<EdifactAcknowledgementSettingsArgs> acknowledgementSettings;

    public Output<EdifactAcknowledgementSettingsArgs> acknowledgementSettings() {
        return this.acknowledgementSettings;
    }

    /**
     * The EDIFACT delimiter override settings.
     * 
     */
    @Import(name="edifactDelimiterOverrides")
      private final @Nullable Output<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides;

    public Output<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides() {
        return this.edifactDelimiterOverrides == null ? Codegen.empty() : this.edifactDelimiterOverrides;
    }

    /**
     * The EDIFACT envelope override settings.
     * 
     */
    @Import(name="envelopeOverrides")
      private final @Nullable Output<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides;

    public Output<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides() {
        return this.envelopeOverrides == null ? Codegen.empty() : this.envelopeOverrides;
    }

    /**
     * The EDIFACT envelope settings.
     * 
     */
    @Import(name="envelopeSettings", required=true)
      private final Output<EdifactEnvelopeSettingsArgs> envelopeSettings;

    public Output<EdifactEnvelopeSettingsArgs> envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The EDIFACT framing settings.
     * 
     */
    @Import(name="framingSettings", required=true)
      private final Output<EdifactFramingSettingsArgs> framingSettings;

    public Output<EdifactFramingSettingsArgs> framingSettings() {
        return this.framingSettings;
    }

    /**
     * The EDIFACT message filter.
     * 
     */
    @Import(name="messageFilter", required=true)
      private final Output<EdifactMessageFilterArgs> messageFilter;

    public Output<EdifactMessageFilterArgs> messageFilter() {
        return this.messageFilter;
    }

    /**
     * The EDIFACT message filter list.
     * 
     */
    @Import(name="messageFilterList")
      private final @Nullable Output<List<EdifactMessageIdentifierArgs>> messageFilterList;

    public Output<List<EdifactMessageIdentifierArgs>> messageFilterList() {
        return this.messageFilterList == null ? Codegen.empty() : this.messageFilterList;
    }

    /**
     * The EDIFACT processing Settings.
     * 
     */
    @Import(name="processingSettings", required=true)
      private final Output<EdifactProcessingSettingsArgs> processingSettings;

    public Output<EdifactProcessingSettingsArgs> processingSettings() {
        return this.processingSettings;
    }

    /**
     * The EDIFACT schema references.
     * 
     */
    @Import(name="schemaReferences", required=true)
      private final Output<List<EdifactSchemaReferenceArgs>> schemaReferences;

    public Output<List<EdifactSchemaReferenceArgs>> schemaReferences() {
        return this.schemaReferences;
    }

    /**
     * The EDIFACT validation override settings.
     * 
     */
    @Import(name="validationOverrides")
      private final @Nullable Output<List<EdifactValidationOverrideArgs>> validationOverrides;

    public Output<List<EdifactValidationOverrideArgs>> validationOverrides() {
        return this.validationOverrides == null ? Codegen.empty() : this.validationOverrides;
    }

    /**
     * The EDIFACT validation settings.
     * 
     */
    @Import(name="validationSettings", required=true)
      private final Output<EdifactValidationSettingsArgs> validationSettings;

    public Output<EdifactValidationSettingsArgs> validationSettings() {
        return this.validationSettings;
    }

    public EdifactProtocolSettingsArgs(
        Output<EdifactAcknowledgementSettingsArgs> acknowledgementSettings,
        @Nullable Output<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides,
        @Nullable Output<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides,
        Output<EdifactEnvelopeSettingsArgs> envelopeSettings,
        Output<EdifactFramingSettingsArgs> framingSettings,
        Output<EdifactMessageFilterArgs> messageFilter,
        @Nullable Output<List<EdifactMessageIdentifierArgs>> messageFilterList,
        Output<EdifactProcessingSettingsArgs> processingSettings,
        Output<List<EdifactSchemaReferenceArgs>> schemaReferences,
        @Nullable Output<List<EdifactValidationOverrideArgs>> validationOverrides,
        Output<EdifactValidationSettingsArgs> validationSettings) {
        this.acknowledgementSettings = Objects.requireNonNull(acknowledgementSettings, "expected parameter 'acknowledgementSettings' to be non-null");
        this.edifactDelimiterOverrides = edifactDelimiterOverrides;
        this.envelopeOverrides = envelopeOverrides;
        this.envelopeSettings = Objects.requireNonNull(envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
        this.framingSettings = Objects.requireNonNull(framingSettings, "expected parameter 'framingSettings' to be non-null");
        this.messageFilter = Objects.requireNonNull(messageFilter, "expected parameter 'messageFilter' to be non-null");
        this.messageFilterList = messageFilterList;
        this.processingSettings = Objects.requireNonNull(processingSettings, "expected parameter 'processingSettings' to be non-null");
        this.schemaReferences = Objects.requireNonNull(schemaReferences, "expected parameter 'schemaReferences' to be non-null");
        this.validationOverrides = validationOverrides;
        this.validationSettings = Objects.requireNonNull(validationSettings, "expected parameter 'validationSettings' to be non-null");
    }

    private EdifactProtocolSettingsArgs() {
        this.acknowledgementSettings = Codegen.empty();
        this.edifactDelimiterOverrides = Codegen.empty();
        this.envelopeOverrides = Codegen.empty();
        this.envelopeSettings = Codegen.empty();
        this.framingSettings = Codegen.empty();
        this.messageFilter = Codegen.empty();
        this.messageFilterList = Codegen.empty();
        this.processingSettings = Codegen.empty();
        this.schemaReferences = Codegen.empty();
        this.validationOverrides = Codegen.empty();
        this.validationSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<EdifactAcknowledgementSettingsArgs> acknowledgementSettings;
        private @Nullable Output<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides;
        private @Nullable Output<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides;
        private Output<EdifactEnvelopeSettingsArgs> envelopeSettings;
        private Output<EdifactFramingSettingsArgs> framingSettings;
        private Output<EdifactMessageFilterArgs> messageFilter;
        private @Nullable Output<List<EdifactMessageIdentifierArgs>> messageFilterList;
        private Output<EdifactProcessingSettingsArgs> processingSettings;
        private Output<List<EdifactSchemaReferenceArgs>> schemaReferences;
        private @Nullable Output<List<EdifactValidationOverrideArgs>> validationOverrides;
        private Output<EdifactValidationSettingsArgs> validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactProtocolSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementSettings = defaults.acknowledgementSettings;
    	      this.edifactDelimiterOverrides = defaults.edifactDelimiterOverrides;
    	      this.envelopeOverrides = defaults.envelopeOverrides;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.framingSettings = defaults.framingSettings;
    	      this.messageFilter = defaults.messageFilter;
    	      this.messageFilterList = defaults.messageFilterList;
    	      this.processingSettings = defaults.processingSettings;
    	      this.schemaReferences = defaults.schemaReferences;
    	      this.validationOverrides = defaults.validationOverrides;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder acknowledgementSettings(Output<EdifactAcknowledgementSettingsArgs> acknowledgementSettings) {
            this.acknowledgementSettings = Objects.requireNonNull(acknowledgementSettings);
            return this;
        }
        public Builder acknowledgementSettings(EdifactAcknowledgementSettingsArgs acknowledgementSettings) {
            this.acknowledgementSettings = Output.of(Objects.requireNonNull(acknowledgementSettings));
            return this;
        }
        public Builder edifactDelimiterOverrides(@Nullable Output<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides) {
            this.edifactDelimiterOverrides = edifactDelimiterOverrides;
            return this;
        }
        public Builder edifactDelimiterOverrides(@Nullable List<EdifactDelimiterOverrideArgs> edifactDelimiterOverrides) {
            this.edifactDelimiterOverrides = Codegen.ofNullable(edifactDelimiterOverrides);
            return this;
        }
        public Builder edifactDelimiterOverrides(EdifactDelimiterOverrideArgs... edifactDelimiterOverrides) {
            return edifactDelimiterOverrides(List.of(edifactDelimiterOverrides));
        }
        public Builder envelopeOverrides(@Nullable Output<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides) {
            this.envelopeOverrides = envelopeOverrides;
            return this;
        }
        public Builder envelopeOverrides(@Nullable List<EdifactEnvelopeOverrideArgs> envelopeOverrides) {
            this.envelopeOverrides = Codegen.ofNullable(envelopeOverrides);
            return this;
        }
        public Builder envelopeOverrides(EdifactEnvelopeOverrideArgs... envelopeOverrides) {
            return envelopeOverrides(List.of(envelopeOverrides));
        }
        public Builder envelopeSettings(Output<EdifactEnvelopeSettingsArgs> envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }
        public Builder envelopeSettings(EdifactEnvelopeSettingsArgs envelopeSettings) {
            this.envelopeSettings = Output.of(Objects.requireNonNull(envelopeSettings));
            return this;
        }
        public Builder framingSettings(Output<EdifactFramingSettingsArgs> framingSettings) {
            this.framingSettings = Objects.requireNonNull(framingSettings);
            return this;
        }
        public Builder framingSettings(EdifactFramingSettingsArgs framingSettings) {
            this.framingSettings = Output.of(Objects.requireNonNull(framingSettings));
            return this;
        }
        public Builder messageFilter(Output<EdifactMessageFilterArgs> messageFilter) {
            this.messageFilter = Objects.requireNonNull(messageFilter);
            return this;
        }
        public Builder messageFilter(EdifactMessageFilterArgs messageFilter) {
            this.messageFilter = Output.of(Objects.requireNonNull(messageFilter));
            return this;
        }
        public Builder messageFilterList(@Nullable Output<List<EdifactMessageIdentifierArgs>> messageFilterList) {
            this.messageFilterList = messageFilterList;
            return this;
        }
        public Builder messageFilterList(@Nullable List<EdifactMessageIdentifierArgs> messageFilterList) {
            this.messageFilterList = Codegen.ofNullable(messageFilterList);
            return this;
        }
        public Builder messageFilterList(EdifactMessageIdentifierArgs... messageFilterList) {
            return messageFilterList(List.of(messageFilterList));
        }
        public Builder processingSettings(Output<EdifactProcessingSettingsArgs> processingSettings) {
            this.processingSettings = Objects.requireNonNull(processingSettings);
            return this;
        }
        public Builder processingSettings(EdifactProcessingSettingsArgs processingSettings) {
            this.processingSettings = Output.of(Objects.requireNonNull(processingSettings));
            return this;
        }
        public Builder schemaReferences(Output<List<EdifactSchemaReferenceArgs>> schemaReferences) {
            this.schemaReferences = Objects.requireNonNull(schemaReferences);
            return this;
        }
        public Builder schemaReferences(List<EdifactSchemaReferenceArgs> schemaReferences) {
            this.schemaReferences = Output.of(Objects.requireNonNull(schemaReferences));
            return this;
        }
        public Builder schemaReferences(EdifactSchemaReferenceArgs... schemaReferences) {
            return schemaReferences(List.of(schemaReferences));
        }
        public Builder validationOverrides(@Nullable Output<List<EdifactValidationOverrideArgs>> validationOverrides) {
            this.validationOverrides = validationOverrides;
            return this;
        }
        public Builder validationOverrides(@Nullable List<EdifactValidationOverrideArgs> validationOverrides) {
            this.validationOverrides = Codegen.ofNullable(validationOverrides);
            return this;
        }
        public Builder validationOverrides(EdifactValidationOverrideArgs... validationOverrides) {
            return validationOverrides(List.of(validationOverrides));
        }
        public Builder validationSettings(Output<EdifactValidationSettingsArgs> validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }
        public Builder validationSettings(EdifactValidationSettingsArgs validationSettings) {
            this.validationSettings = Output.of(Objects.requireNonNull(validationSettings));
            return this;
        }        public EdifactProtocolSettingsArgs build() {
            return new EdifactProtocolSettingsArgs(acknowledgementSettings, edifactDelimiterOverrides, envelopeOverrides, envelopeSettings, framingSettings, messageFilter, messageFilterList, processingSettings, schemaReferences, validationOverrides, validationSettings);
        }
    }
}
