// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.TriggersOn;
import io.pulumi.azurenative.securityinsights.enums.TriggersWhen;
import io.pulumi.azurenative.securityinsights.inputs.AutomationRulePropertyValuesConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes automation rule triggering logic
 * 
 */
public final class AutomationRuleTriggeringLogicArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleTriggeringLogicArgs Empty = new AutomationRuleTriggeringLogicArgs();

    /**
     * The conditions to evaluate to determine if the automation rule should be triggered on a given object
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions;

    public Output<List<AutomationRulePropertyValuesConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * Determines when the automation rule should automatically expire and be disabled.
     * 
     */
    @Import(name="expirationTimeUtc")
      private final @Nullable Output<String> expirationTimeUtc;

    public Output<String> expirationTimeUtc() {
        return this.expirationTimeUtc == null ? Codegen.empty() : this.expirationTimeUtc;
    }

    /**
     * Determines whether the automation rule is enabled or disabled.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of object the automation rule triggers on
     * 
     */
    @Import(name="triggersOn", required=true)
      private final Output<Either<String,TriggersOn>> triggersOn;

    public Output<Either<String,TriggersOn>> triggersOn() {
        return this.triggersOn;
    }

    /**
     * The type of event the automation rule triggers on
     * 
     */
    @Import(name="triggersWhen", required=true)
      private final Output<Either<String,TriggersWhen>> triggersWhen;

    public Output<Either<String,TriggersWhen>> triggersWhen() {
        return this.triggersWhen;
    }

    public AutomationRuleTriggeringLogicArgs(
        @Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions,
        @Nullable Output<String> expirationTimeUtc,
        Output<Boolean> isEnabled,
        Output<Either<String,TriggersOn>> triggersOn,
        Output<Either<String,TriggersWhen>> triggersWhen) {
        this.conditions = conditions;
        this.expirationTimeUtc = expirationTimeUtc;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.triggersOn = Objects.requireNonNull(triggersOn, "expected parameter 'triggersOn' to be non-null");
        this.triggersWhen = Objects.requireNonNull(triggersWhen, "expected parameter 'triggersWhen' to be non-null");
    }

    private AutomationRuleTriggeringLogicArgs() {
        this.conditions = Codegen.empty();
        this.expirationTimeUtc = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.triggersOn = Codegen.empty();
        this.triggersWhen = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleTriggeringLogicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions;
        private @Nullable Output<String> expirationTimeUtc;
        private Output<Boolean> isEnabled;
        private Output<Either<String,TriggersOn>> triggersOn;
        private Output<Either<String,TriggersWhen>> triggersWhen;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleTriggeringLogicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.isEnabled = defaults.isEnabled;
    	      this.triggersOn = defaults.triggersOn;
    	      this.triggersWhen = defaults.triggersWhen;
        }

        public Builder conditions(@Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<AutomationRulePropertyValuesConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(AutomationRulePropertyValuesConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }
        public Builder expirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = Codegen.ofNullable(expirationTimeUtc);
            return this;
        }
        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public Builder triggersOn(Output<Either<String,TriggersOn>> triggersOn) {
            this.triggersOn = Objects.requireNonNull(triggersOn);
            return this;
        }
        public Builder triggersOn(Either<String,TriggersOn> triggersOn) {
            this.triggersOn = Output.of(Objects.requireNonNull(triggersOn));
            return this;
        }
        public Builder triggersWhen(Output<Either<String,TriggersWhen>> triggersWhen) {
            this.triggersWhen = Objects.requireNonNull(triggersWhen);
            return this;
        }
        public Builder triggersWhen(Either<String,TriggersWhen> triggersWhen) {
            this.triggersWhen = Output.of(Objects.requireNonNull(triggersWhen));
            return this;
        }        public AutomationRuleTriggeringLogicArgs build() {
            return new AutomationRuleTriggeringLogicArgs(conditions, expirationTimeUtc, isEnabled, triggersOn, triggersWhen);
        }
    }
}
