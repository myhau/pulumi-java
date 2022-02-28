// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs();

    /**
     * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
     * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
     * 
     */
    @InputImport(name="keyword", required=true)
      private final Input<String> keyword;

    public Input<String> getKeyword() {
        return this.keyword;
    }

    /**
     * Set of strings for additional settings to use in stateful rule inspection.
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<List<String>> settings;

    public Input<List<String>> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    public RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs(
        Input<String> keyword,
        @Nullable Input<List<String>> settings) {
        this.keyword = Objects.requireNonNull(keyword, "expected parameter 'keyword' to be non-null");
        this.settings = settings;
    }

    private RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs() {
        this.keyword = Input.empty();
        this.settings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyword;
        private @Nullable Input<List<String>> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyword = defaults.keyword;
    	      this.settings = defaults.settings;
        }

        public Builder setKeyword(Input<String> keyword) {
            this.keyword = Objects.requireNonNull(keyword);
            return this;
        }

        public Builder setKeyword(String keyword) {
            this.keyword = Input.of(Objects.requireNonNull(keyword));
            return this;
        }

        public Builder setSettings(@Nullable Input<List<String>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable List<String> settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs(keyword, settings);
        }
    }
}
