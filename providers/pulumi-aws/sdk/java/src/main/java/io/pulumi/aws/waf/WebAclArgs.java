// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.WebAclDefaultActionArgs;
import io.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs;
import io.pulumi.aws.waf.inputs.WebAclRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclArgs Empty = new WebAclArgs();

    /**
     * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    @InputImport(name="defaultAction", required=true)
      private final Input<WebAclDefaultActionArgs> defaultAction;

    public Input<WebAclDefaultActionArgs> getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @InputImport(name="loggingConfiguration")
      private final @Nullable Input<WebAclLoggingConfigurationArgs> loggingConfiguration;

    public Input<WebAclLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The name or description of the web ACL.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<WebAclRuleArgs>> rules;

    public Input<List<WebAclRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public WebAclArgs(
        Input<WebAclDefaultActionArgs> defaultAction,
        @Nullable Input<WebAclLoggingConfigurationArgs> loggingConfiguration,
        Input<String> metricName,
        @Nullable Input<String> name,
        @Nullable Input<List<WebAclRuleArgs>> rules,
        @Nullable Input<Map<String,String>> tags) {
        this.defaultAction = Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.loggingConfiguration = loggingConfiguration;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.name = name;
        this.rules = rules;
        this.tags = tags;
    }

    private WebAclArgs() {
        this.defaultAction = Input.empty();
        this.loggingConfiguration = Input.empty();
        this.metricName = Input.empty();
        this.name = Input.empty();
        this.rules = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<WebAclDefaultActionArgs> defaultAction;
        private @Nullable Input<WebAclLoggingConfigurationArgs> loggingConfiguration;
        private Input<String> metricName;
        private @Nullable Input<String> name;
        private @Nullable Input<List<WebAclRuleArgs>> rules;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder setDefaultAction(Input<WebAclDefaultActionArgs> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder setDefaultAction(WebAclDefaultActionArgs defaultAction) {
            this.defaultAction = Input.of(Objects.requireNonNull(defaultAction));
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<WebAclLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable WebAclLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRules(@Nullable Input<List<WebAclRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<WebAclRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
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
        public WebAclArgs build() {
            return new WebAclArgs(defaultAction, loggingConfiguration, metricName, name, rules, tags);
        }
    }
}
