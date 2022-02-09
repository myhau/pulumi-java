// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LabelDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelDescriptorResponse Empty = new LabelDescriptorResponse();

    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="key", required=true)
    private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="valueType", required=true)
    private final String valueType;

    public String getValueType() {
        return this.valueType;
    }

    public LabelDescriptorResponse(
        String description,
        String key,
        String valueType) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.valueType = Objects.requireNonNull(valueType, "expected parameter 'valueType' to be non-null");
    }

    private LabelDescriptorResponse() {
        this.description = null;
        this.key = null;
        this.valueType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String key;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }

        public LabelDescriptorResponse build() {
            return new LabelDescriptorResponse(description, key, valueType);
        }
    }
}