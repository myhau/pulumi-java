// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.RetentionPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricSettingsResponse {
    /**
     * Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    private final @Nullable String category;
    /**
     * a value indicating whether this category is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * the retention policy for this category.
     * 
     */
    private final @Nullable RetentionPolicyResponse retentionPolicy;
    /**
     * the timegrain of the metric in ISO8601 format.
     * 
     */
    private final @Nullable String timeGrain;

    @OutputCustomType.Constructor({"category","enabled","retentionPolicy","timeGrain"})
    private MetricSettingsResponse(
        @Nullable String category,
        Boolean enabled,
        @Nullable RetentionPolicyResponse retentionPolicy,
        @Nullable String timeGrain) {
        this.category = category;
        this.enabled = enabled;
        this.retentionPolicy = retentionPolicy;
        this.timeGrain = timeGrain;
    }

    /**
     * Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * a value indicating whether this category is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * the retention policy for this category.
     * 
    */
    public Optional<RetentionPolicyResponse> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * the timegrain of the metric in ISO8601 format.
     * 
    */
    public Optional<String> getTimeGrain() {
        return Optional.ofNullable(this.timeGrain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;
        private @Nullable RetentionPolicyResponse retentionPolicy;
        private @Nullable String timeGrain;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.timeGrain = defaults.timeGrain;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setTimeGrain(@Nullable String timeGrain) {
            this.timeGrain = timeGrain;
            return this;
        }
        public MetricSettingsResponse build() {
            return new MetricSettingsResponse(category, enabled, retentionPolicy, timeGrain);
        }
    }
}
