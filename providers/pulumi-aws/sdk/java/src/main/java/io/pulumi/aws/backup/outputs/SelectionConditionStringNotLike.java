// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SelectionConditionStringNotLike {
    /**
     * The key in a key-value pair.
     * 
     */
    private final String key;
    /**
     * The value in a key-value pair.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private SelectionConditionStringNotLike(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The key in a key-value pair.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The value in a key-value pair.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionConditionStringNotLike defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionConditionStringNotLike defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SelectionConditionStringNotLike build() {
            return new SelectionConditionStringNotLike(key, value);
        }
    }
}
