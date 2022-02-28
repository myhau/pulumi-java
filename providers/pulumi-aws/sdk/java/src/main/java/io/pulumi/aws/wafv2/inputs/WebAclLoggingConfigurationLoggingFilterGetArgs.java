// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebAclLoggingConfigurationLoggingFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterGetArgs Empty = new WebAclLoggingConfigurationLoggingFilterGetArgs();

    /**
     * Default handling for logs that don't match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
     * 
     */
    @InputImport(name="defaultBehavior", required=true)
      private final Input<String> defaultBehavior;

    public Input<String> getDefaultBehavior() {
        return this.defaultBehavior;
    }

    /**
     * Filter(s) that you want to apply to the logs. See Filter below for more details.
     * 
     */
    @InputImport(name="filters", required=true)
      private final Input<List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs>> filters;

    public Input<List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs>> getFilters() {
        return this.filters;
    }

    public WebAclLoggingConfigurationLoggingFilterGetArgs(
        Input<String> defaultBehavior,
        Input<List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs>> filters) {
        this.defaultBehavior = Objects.requireNonNull(defaultBehavior, "expected parameter 'defaultBehavior' to be non-null");
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
    }

    private WebAclLoggingConfigurationLoggingFilterGetArgs() {
        this.defaultBehavior = Input.empty();
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultBehavior;
        private Input<List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBehavior = defaults.defaultBehavior;
    	      this.filters = defaults.filters;
        }

        public Builder setDefaultBehavior(Input<String> defaultBehavior) {
            this.defaultBehavior = Objects.requireNonNull(defaultBehavior);
            return this;
        }

        public Builder setDefaultBehavior(String defaultBehavior) {
            this.defaultBehavior = Input.of(Objects.requireNonNull(defaultBehavior));
            return this;
        }

        public Builder setFilters(Input<List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs>> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setFilters(List<WebAclLoggingConfigurationLoggingFilterFilterGetArgs> filters) {
            this.filters = Input.of(Objects.requireNonNull(filters));
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterGetArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterGetArgs(defaultBehavior, filters);
        }
    }
}
