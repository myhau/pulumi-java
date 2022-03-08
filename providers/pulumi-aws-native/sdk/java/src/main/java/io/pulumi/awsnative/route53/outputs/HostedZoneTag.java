// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HostedZoneTag {
    /**
     * The key name of the tag.
     * 
     */
    private final String key;
    /**
     * The value for the tag.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private HostedZoneTag(
        String key,
        String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key name of the tag.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value for the tag.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneTag defaults) {
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
        public HostedZoneTag build() {
            return new HostedZoneTag(key, value);
        }
    }
}
