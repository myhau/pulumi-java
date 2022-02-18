// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GlobalForwardingRuleMetadataFilterFilterLabel {
    /**
     * Name of the metadata label. The length must be between
     * 1 and 1024 characters, inclusive.
     * 
     */
    private final String name;
    /**
     * The value that the label must match. The value has a maximum
     * length of 1024 characters.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private GlobalForwardingRuleMetadataFilterFilterLabel(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Name of the metadata label. The length must be between
     * 1 and 1024 characters, inclusive.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The value that the label must match. The value has a maximum
     * length of 1024 characters.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalForwardingRuleMetadataFilterFilterLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalForwardingRuleMetadataFilterFilterLabel defaults) {
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

        public GlobalForwardingRuleMetadataFilterFilterLabel build() {
            return new GlobalForwardingRuleMetadataFilterFilterLabel(name, value);
        }
    }
}
