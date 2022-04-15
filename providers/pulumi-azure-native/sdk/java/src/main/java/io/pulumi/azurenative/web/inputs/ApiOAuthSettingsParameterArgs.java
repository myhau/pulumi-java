// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OAuth settings for the API
 * 
 */
public final class ApiOAuthSettingsParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiOAuthSettingsParameterArgs Empty = new ApiOAuthSettingsParameterArgs();

    /**
     * Options available to this parameter
     * 
     */
    @Import(name="options")
      private final @Nullable Output<Object> options;

    public Output<Object> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * UI definitions per culture as caller can specify the culture
     * 
     */
    @Import(name="uiDefinition")
      private final @Nullable Output<Object> uiDefinition;

    public Output<Object> uiDefinition() {
        return this.uiDefinition == null ? Codegen.empty() : this.uiDefinition;
    }

    /**
     * Value of the setting
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ApiOAuthSettingsParameterArgs(
        @Nullable Output<Object> options,
        @Nullable Output<Object> uiDefinition,
        @Nullable Output<String> value) {
        this.options = options;
        this.uiDefinition = uiDefinition;
        this.value = value;
    }

    private ApiOAuthSettingsParameterArgs() {
        this.options = Codegen.empty();
        this.uiDefinition = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> options;
        private @Nullable Output<Object> uiDefinition;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOAuthSettingsParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.uiDefinition = defaults.uiDefinition;
    	      this.value = defaults.value;
        }

        public Builder options(@Nullable Output<Object> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable Object options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder uiDefinition(@Nullable Output<Object> uiDefinition) {
            this.uiDefinition = uiDefinition;
            return this;
        }
        public Builder uiDefinition(@Nullable Object uiDefinition) {
            this.uiDefinition = Codegen.ofNullable(uiDefinition);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ApiOAuthSettingsParameterArgs build() {
            return new ApiOAuthSettingsParameterArgs(options, uiDefinition, value);
        }
    }
}
