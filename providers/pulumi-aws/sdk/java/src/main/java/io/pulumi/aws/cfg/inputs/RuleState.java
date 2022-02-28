// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.RuleScopeGetArgs;
import io.pulumi.aws.cfg.inputs.RuleSourceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleState extends io.pulumi.resources.ResourceArgs {

    public static final RuleState Empty = new RuleState();

    /**
     * The ARN of the config rule
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Description of the rule
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda function.
     * 
     */
    @InputImport(name="inputParameters")
      private final @Nullable Input<String> inputParameters;

    public Input<String> getInputParameters() {
        return this.inputParameters == null ? Input.empty() : this.inputParameters;
    }

    /**
     * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    @InputImport(name="maximumExecutionFrequency")
      private final @Nullable Input<String> maximumExecutionFrequency;

    public Input<String> getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency == null ? Input.empty() : this.maximumExecutionFrequency;
    }

    /**
     * The name of the rule
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the config rule
     * 
     */
    @InputImport(name="ruleId")
      private final @Nullable Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId == null ? Input.empty() : this.ruleId;
    }

    /**
     * Scope defines which resources can trigger an evaluation for the rule as documented below.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<RuleScopeGetArgs> scope;

    public Input<RuleScopeGetArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<RuleSourceGetArgs> source;

    public Input<RuleSourceGetArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public RuleState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> inputParameters,
        @Nullable Input<String> maximumExecutionFrequency,
        @Nullable Input<String> name,
        @Nullable Input<String> ruleId,
        @Nullable Input<RuleScopeGetArgs> scope,
        @Nullable Input<RuleSourceGetArgs> source,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.inputParameters = inputParameters;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.name = name;
        this.ruleId = ruleId;
        this.scope = scope;
        this.source = source;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RuleState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.inputParameters = Input.empty();
        this.maximumExecutionFrequency = Input.empty();
        this.name = Input.empty();
        this.ruleId = Input.empty();
        this.scope = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> inputParameters;
        private @Nullable Input<String> maximumExecutionFrequency;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ruleId;
        private @Nullable Input<RuleScopeGetArgs> scope;
        private @Nullable Input<RuleSourceGetArgs> source;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.inputParameters = defaults.inputParameters;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.name = defaults.name;
    	      this.ruleId = defaults.ruleId;
    	      this.scope = defaults.scope;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInputParameters(@Nullable Input<String> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }

        public Builder setInputParameters(@Nullable String inputParameters) {
            this.inputParameters = Input.ofNullable(inputParameters);
            return this;
        }

        public Builder setMaximumExecutionFrequency(@Nullable Input<String> maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        public Builder setMaximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = Input.ofNullable(maximumExecutionFrequency);
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

        public Builder setRuleId(@Nullable Input<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public Builder setRuleId(@Nullable String ruleId) {
            this.ruleId = Input.ofNullable(ruleId);
            return this;
        }

        public Builder setScope(@Nullable Input<RuleScopeGetArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable RuleScopeGetArgs scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setSource(@Nullable Input<RuleSourceGetArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable RuleSourceGetArgs source) {
            this.source = Input.ofNullable(source);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public RuleState build() {
            return new RuleState(arn, description, inputParameters, maximumExecutionFrequency, name, ruleId, scope, source, tags, tagsAll);
        }
    }
}
