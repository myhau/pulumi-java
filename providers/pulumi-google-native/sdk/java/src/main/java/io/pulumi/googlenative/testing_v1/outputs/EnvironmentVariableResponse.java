// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentVariableResponse {
    /**
     * Key for the environment variable.
     * 
     */
    private final String key;
    /**
     * Value for the environment variable.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private EnvironmentVariableResponse(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Key for the environment variable.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Value for the environment variable.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableResponse defaults) {
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
        public EnvironmentVariableResponse build() {
            return new EnvironmentVariableResponse(key, value);
        }
    }
}
