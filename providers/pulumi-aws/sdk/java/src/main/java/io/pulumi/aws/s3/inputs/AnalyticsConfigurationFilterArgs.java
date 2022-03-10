// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationFilterArgs Empty = new AnalyticsConfigurationFilterArgs();

    /**
     * Object prefix for filtering.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * Set of object tags for filtering.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AnalyticsConfigurationFilterArgs(
        @Nullable Input<String> prefix,
        @Nullable Input<Map<String,String>> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    private AnalyticsConfigurationFilterArgs() {
        this.prefix = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> prefix;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AnalyticsConfigurationFilterArgs build() {
            return new AnalyticsConfigurationFilterArgs(prefix, tags);
        }
    }
}