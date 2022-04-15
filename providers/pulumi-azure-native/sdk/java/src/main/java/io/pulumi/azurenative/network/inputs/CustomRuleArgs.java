// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ActionType;
import io.pulumi.azurenative.network.enums.CustomRuleEnabledState;
import io.pulumi.azurenative.network.enums.RuleType;
import io.pulumi.azurenative.network.inputs.FrontDoorMatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines contents of a web application rule
 * 
 */
public final class CustomRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRuleArgs Empty = new CustomRuleArgs();

    /**
     * Describes what action to be applied when rule matches.
     * 
     */
    @Import(name="action", required=true)
      private final Output<Either<String,ActionType>> action;

    public Output<Either<String,ActionType>> action() {
        return this.action;
    }

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;

    public Output<Either<String,CustomRuleEnabledState>> enabledState() {
        return this.enabledState == null ? Codegen.empty() : this.enabledState;
    }

    /**
     * List of match conditions.
     * 
     */
    @Import(name="matchConditions", required=true)
      private final Output<List<FrontDoorMatchConditionArgs>> matchConditions;

    public Output<List<FrontDoorMatchConditionArgs>> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Describes the name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Time window for resetting the rate limit count. Default is 1 minute.
     * 
     */
    @Import(name="rateLimitDurationInMinutes")
      private final @Nullable Output<Integer> rateLimitDurationInMinutes;

    public Output<Integer> rateLimitDurationInMinutes() {
        return this.rateLimitDurationInMinutes == null ? Codegen.empty() : this.rateLimitDurationInMinutes;
    }

    /**
     * Number of allowed requests per client within the time window.
     * 
     */
    @Import(name="rateLimitThreshold")
      private final @Nullable Output<Integer> rateLimitThreshold;

    public Output<Integer> rateLimitThreshold() {
        return this.rateLimitThreshold == null ? Codegen.empty() : this.rateLimitThreshold;
    }

    /**
     * Describes type of rule.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<Either<String,RuleType>> ruleType;

    public Output<Either<String,RuleType>> ruleType() {
        return this.ruleType;
    }

    public CustomRuleArgs(
        Output<Either<String,ActionType>> action,
        @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState,
        Output<List<FrontDoorMatchConditionArgs>> matchConditions,
        @Nullable Output<String> name,
        Output<Integer> priority,
        @Nullable Output<Integer> rateLimitDurationInMinutes,
        @Nullable Output<Integer> rateLimitThreshold,
        Output<Either<String,RuleType>> ruleType) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
        this.rateLimitThreshold = rateLimitThreshold;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private CustomRuleArgs() {
        this.action = Codegen.empty();
        this.enabledState = Codegen.empty();
        this.matchConditions = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.rateLimitDurationInMinutes = Codegen.empty();
        this.rateLimitThreshold = Codegen.empty();
        this.ruleType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ActionType>> action;
        private @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;
        private Output<List<FrontDoorMatchConditionArgs>> matchConditions;
        private @Nullable Output<String> name;
        private Output<Integer> priority;
        private @Nullable Output<Integer> rateLimitDurationInMinutes;
        private @Nullable Output<Integer> rateLimitThreshold;
        private Output<Either<String,RuleType>> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rateLimitDurationInMinutes = defaults.rateLimitDurationInMinutes;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder action(Output<Either<String,ActionType>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(Either<String,ActionType> action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,CustomRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,CustomRuleEnabledState> enabledState) {
            this.enabledState = Codegen.ofNullable(enabledState);
            return this;
        }
        public Builder matchConditions(Output<List<FrontDoorMatchConditionArgs>> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }
        public Builder matchConditions(List<FrontDoorMatchConditionArgs> matchConditions) {
            this.matchConditions = Output.of(Objects.requireNonNull(matchConditions));
            return this;
        }
        public Builder matchConditions(FrontDoorMatchConditionArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder rateLimitDurationInMinutes(@Nullable Output<Integer> rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
            return this;
        }
        public Builder rateLimitDurationInMinutes(@Nullable Integer rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = Codegen.ofNullable(rateLimitDurationInMinutes);
            return this;
        }
        public Builder rateLimitThreshold(@Nullable Output<Integer> rateLimitThreshold) {
            this.rateLimitThreshold = rateLimitThreshold;
            return this;
        }
        public Builder rateLimitThreshold(@Nullable Integer rateLimitThreshold) {
            this.rateLimitThreshold = Codegen.ofNullable(rateLimitThreshold);
            return this;
        }
        public Builder ruleType(Output<Either<String,RuleType>> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder ruleType(Either<String,RuleType> ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }        public CustomRuleArgs build() {
            return new CustomRuleArgs(action, enabledState, matchConditions, name, priority, rateLimitDurationInMinutes, rateLimitThreshold, ruleType);
        }
    }
}
