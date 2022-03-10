// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LogConfigCounterOptionsCustomFieldResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String name;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private LogConfigCounterOptionsCustomFieldResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LogConfigCounterOptionsCustomFieldResponse build() {
            return new LogConfigCounterOptionsCustomFieldResponse(name, value);
        }
    }
}
