// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketAutoclassResponse {
    /**
     * Whether or not Autoclass is enabled on this bucket
     * 
     */
    private final Boolean enabled;
    /**
     * A date and time in RFC 3339 format representing the instant at which "enabled" was last toggled.
     * 
     */
    private final String toggleTime;

    @OutputCustomType.Constructor({"enabled","toggleTime"})
    private BucketAutoclassResponse(
        Boolean enabled,
        String toggleTime) {
        this.enabled = enabled;
        this.toggleTime = toggleTime;
    }

    /**
     * Whether or not Autoclass is enabled on this bucket
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * A date and time in RFC 3339 format representing the instant at which "enabled" was last toggled.
     * 
    */
    public String getToggleTime() {
        return this.toggleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAutoclassResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String toggleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAutoclassResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.toggleTime = defaults.toggleTime;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setToggleTime(String toggleTime) {
            this.toggleTime = Objects.requireNonNull(toggleTime);
            return this;
        }
        public BucketAutoclassResponse build() {
            return new BucketAutoclassResponse(enabled, toggleTime);
        }
    }
}
