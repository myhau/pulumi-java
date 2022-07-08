// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LabelDescriptorResponse {
    /**
     * @return A human-readable description for the label.
     * 
     */
    private final String description;
    /**
     * @return The key for this label. The key must meet the following criteria: Does not exceed 100 characters. Matches the following regular expression: [a-zA-Z][a-zA-Z0-9_]* The first character must be an upper- or lower-case letter. The remaining characters must be letters, digits, or underscores.
     * 
     */
    private final String key;
    /**
     * @return The type of data that can be assigned to the label.
     * 
     */
    private final String valueType;

    @CustomType.Constructor
    private LabelDescriptorResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("valueType") String valueType) {
        this.description = description;
        this.key = key;
        this.valueType = valueType;
    }

    /**
     * @return A human-readable description for the label.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The key for this label. The key must meet the following criteria: Does not exceed 100 characters. Matches the following regular expression: [a-zA-Z][a-zA-Z0-9_]* The first character must be an upper- or lower-case letter. The remaining characters must be letters, digits, or underscores.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The type of data that can be assigned to the label.
     * 
     */
    public String valueType() {
        return this.valueType;
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

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }        public LabelDescriptorResponse build() {
            return new LabelDescriptorResponse(description, key, valueType);
        }
    }
}
