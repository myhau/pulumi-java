// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueResponseMetadata;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ParameterDefinitionsValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParameterDefinitionsValueResponse Empty = new ParameterDefinitionsValueResponse();

    @InputImport(name="allowedValues")
    private final @Nullable List<Object> allowedValues;

    public List<Object> getAllowedValues() {
        return this.allowedValues == null ? List.of() : this.allowedValues;
    }

    @InputImport(name="defaultValue")
    private final @Nullable Object defaultValue;

    public Optional<Object> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    @InputImport(name="metadata")
    private final @Nullable ParameterDefinitionsValueResponseMetadata metadata;

    public Optional<ParameterDefinitionsValueResponseMetadata> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ParameterDefinitionsValueResponse(
        @Nullable List<Object> allowedValues,
        @Nullable Object defaultValue,
        @Nullable ParameterDefinitionsValueResponseMetadata metadata,
        @Nullable String type) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.metadata = metadata;
        this.type = type;
    }

    private ParameterDefinitionsValueResponse() {
        this.allowedValues = List.of();
        this.defaultValue = null;
        this.metadata = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> allowedValues;
        private @Nullable Object defaultValue;
        private @Nullable ParameterDefinitionsValueResponseMetadata metadata;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.defaultValue = defaults.defaultValue;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder setAllowedValues(@Nullable List<Object> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setMetadata(@Nullable ParameterDefinitionsValueResponseMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ParameterDefinitionsValueResponse build() {
            return new ParameterDefinitionsValueResponse(allowedValues, defaultValue, metadata, type);
        }
    }
}