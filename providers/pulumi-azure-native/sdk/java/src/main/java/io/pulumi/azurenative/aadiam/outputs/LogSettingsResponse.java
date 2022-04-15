// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.outputs;

import io.pulumi.azurenative.aadiam.outputs.RetentionPolicyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogSettingsResponse {
    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    private final @Nullable String category;
    /**
     * A value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The retention policy for this log.
     * 
     */
    private final @Nullable RetentionPolicyResponse retentionPolicy;

    @CustomType.Constructor
    private LogSettingsResponse(
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("retentionPolicy") @Nullable RetentionPolicyResponse retentionPolicy) {
        this.category = category;
        this.enabled = enabled;
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
    */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * A value indicating whether this log is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * The retention policy for this log.
     * 
    */
    public Optional<RetentionPolicyResponse> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;
        private @Nullable RetentionPolicyResponse retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder retentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }        public LogSettingsResponse build() {
            return new LogSettingsResponse(category, enabled, retentionPolicy);
        }
    }
}
