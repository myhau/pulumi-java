// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TagTag {
    /**
     * Tag name.
     * 
     */
    private final String key;
    /**
     * Whether to propagate the tags to instances launched by the ASG.
     * 
     */
    private final Boolean propagateAtLaunch;
    /**
     * Tag value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","propagateAtLaunch","value"})
    private TagTag(
        String key,
        Boolean propagateAtLaunch,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.propagateAtLaunch = Objects.requireNonNull(propagateAtLaunch);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Tag name.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Whether to propagate the tags to instances launched by the ASG.
     * 
     */
    public Boolean getPropagateAtLaunch() {
        return this.propagateAtLaunch;
    }
    /**
     * Tag value.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Boolean propagateAtLaunch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.propagateAtLaunch = defaults.propagateAtLaunch;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setPropagateAtLaunch(Boolean propagateAtLaunch) {
            this.propagateAtLaunch = Objects.requireNonNull(propagateAtLaunch);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TagTag build() {
            return new TagTag(key, propagateAtLaunch, value);
        }
    }
}
