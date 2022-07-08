// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3FormParameterFillBehaviorArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a form parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3FormParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FormParameterArgs Empty = new GoogleCloudDialogflowCxV3FormParameterArgs();

    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<Object> defaultValue;

    /**
     * @return The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
     */
    public Optional<Output<Object>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the parameter, unique within the form.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<String> entityType;

    /**
     * @return The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }

    /**
     * Defines fill behavior for the parameter.
     * 
     */
    @Import(name="fillBehavior", required=true)
    private Output<GoogleCloudDialogflowCxV3FormParameterFillBehaviorArgs> fillBehavior;

    /**
     * @return Defines fill behavior for the parameter.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3FormParameterFillBehaviorArgs> fillBehavior() {
        return this.fillBehavior;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @Import(name="isList")
    private @Nullable Output<Boolean> isList;

    /**
     * @return Indicates whether the parameter represents a list of values.
     * 
     */
    public Optional<Output<Boolean>> isList() {
        return Optional.ofNullable(this.isList);
    }

    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @Import(name="redact")
    private @Nullable Output<Boolean> redact;

    /**
     * @return Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    public Optional<Output<Boolean>> redact() {
        return Optional.ofNullable(this.redact);
    }

    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    private GoogleCloudDialogflowCxV3FormParameterArgs() {}

    private GoogleCloudDialogflowCxV3FormParameterArgs(GoogleCloudDialogflowCxV3FormParameterArgs $) {
        this.defaultValue = $.defaultValue;
        this.displayName = $.displayName;
        this.entityType = $.entityType;
        this.fillBehavior = $.fillBehavior;
        this.isList = $.isList;
        this.redact = $.redact;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3FormParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FormParameterArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3FormParameterArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3FormParameterArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3FormParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value of an optional parameter. If the parameter is required, the default value will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<Object> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value of an optional parameter. If the parameter is required, the default value will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(Object defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param displayName The human-readable name of the parameter, unique within the form.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the parameter, unique within the form.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param entityType The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
         * 
         * @return builder
         * 
         */
        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param fillBehavior Defines fill behavior for the parameter.
         * 
         * @return builder
         * 
         */
        public Builder fillBehavior(Output<GoogleCloudDialogflowCxV3FormParameterFillBehaviorArgs> fillBehavior) {
            $.fillBehavior = fillBehavior;
            return this;
        }

        /**
         * @param fillBehavior Defines fill behavior for the parameter.
         * 
         * @return builder
         * 
         */
        public Builder fillBehavior(GoogleCloudDialogflowCxV3FormParameterFillBehaviorArgs fillBehavior) {
            return fillBehavior(Output.of(fillBehavior));
        }

        /**
         * @param isList Indicates whether the parameter represents a list of values.
         * 
         * @return builder
         * 
         */
        public Builder isList(@Nullable Output<Boolean> isList) {
            $.isList = isList;
            return this;
        }

        /**
         * @param isList Indicates whether the parameter represents a list of values.
         * 
         * @return builder
         * 
         */
        public Builder isList(Boolean isList) {
            return isList(Output.of(isList));
        }

        /**
         * @param redact Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
         * 
         * @return builder
         * 
         */
        public Builder redact(@Nullable Output<Boolean> redact) {
            $.redact = redact;
            return this;
        }

        /**
         * @param redact Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
         * 
         * @return builder
         * 
         */
        public Builder redact(Boolean redact) {
            return redact(Output.of(redact));
        }

        /**
         * @param required Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public GoogleCloudDialogflowCxV3FormParameterArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            $.fillBehavior = Objects.requireNonNull($.fillBehavior, "expected parameter 'fillBehavior' to be non-null");
            return $;
        }
    }

}
