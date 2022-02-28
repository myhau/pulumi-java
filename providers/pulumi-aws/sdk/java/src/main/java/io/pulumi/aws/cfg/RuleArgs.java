// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.cfg.inputs.RuleScopeArgs;
import io.pulumi.aws.cfg.inputs.RuleSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

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
     * Scope defines which resources can trigger an evaluation for the rule as documented below.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<RuleScopeArgs> scope;

    public Input<RuleScopeArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<RuleSourceArgs> source;

    public Input<RuleSourceArgs> getSource() {
        return this.source;
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

    public RuleArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> inputParameters,
        @Nullable Input<String> maximumExecutionFrequency,
        @Nullable Input<String> name,
        @Nullable Input<RuleScopeArgs> scope,
        Input<RuleSourceArgs> source,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.inputParameters = inputParameters;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.name = name;
        this.scope = scope;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private RuleArgs() {
        this.description = Input.empty();
        this.inputParameters = Input.empty();
        this.maximumExecutionFrequency = Input.empty();
        this.name = Input.empty();
        this.scope = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> inputParameters;
        private @Nullable Input<String> maximumExecutionFrequency;
        private @Nullable Input<String> name;
        private @Nullable Input<RuleScopeArgs> scope;
        private Input<RuleSourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.inputParameters = defaults.inputParameters;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
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

        public Builder setScope(@Nullable Input<RuleScopeArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable RuleScopeArgs scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setSource(Input<RuleSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(RuleSourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
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
        public RuleArgs build() {
            return new RuleArgs(description, inputParameters, maximumExecutionFrequency, name, scope, source, tags);
        }
    }
}
