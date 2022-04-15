// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.enums.ActionRuleStatus;
import io.pulumi.azurenative.alertsmanagement.inputs.ConditionsArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.ScopeArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.SuppressionConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Action rule with suppression configuration
 * 
 */
public final class SuppressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuppressionArgs Empty = new SuppressionArgs();

    /**
     * conditions on which alerts will be filtered
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<ConditionsArgs> conditions;

    public Output<ConditionsArgs> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * Description of action rule
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * scope on which action rule will apply
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<ScopeArgs> scope;

    public Output<ScopeArgs> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,ActionRuleStatus>> status;

    public Output<Either<String,ActionRuleStatus>> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * suppression configuration for the action rule
     * 
     */
    @Import(name="suppressionConfig", required=true)
      private final Output<SuppressionConfigArgs> suppressionConfig;

    public Output<SuppressionConfigArgs> suppressionConfig() {
        return this.suppressionConfig;
    }

    /**
     * Indicates type of action rule
     * Expected value is 'Suppression'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public SuppressionArgs(
        @Nullable Output<ConditionsArgs> conditions,
        @Nullable Output<String> description,
        @Nullable Output<ScopeArgs> scope,
        @Nullable Output<Either<String,ActionRuleStatus>> status,
        Output<SuppressionConfigArgs> suppressionConfig,
        Output<String> type) {
        this.conditions = conditions;
        this.description = description;
        this.scope = scope;
        this.status = status;
        this.suppressionConfig = Objects.requireNonNull(suppressionConfig, "expected parameter 'suppressionConfig' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SuppressionArgs() {
        this.conditions = Codegen.empty();
        this.description = Codegen.empty();
        this.scope = Codegen.empty();
        this.status = Codegen.empty();
        this.suppressionConfig = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConditionsArgs> conditions;
        private @Nullable Output<String> description;
        private @Nullable Output<ScopeArgs> scope;
        private @Nullable Output<Either<String,ActionRuleStatus>> status;
        private Output<SuppressionConfigArgs> suppressionConfig;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.suppressionConfig = defaults.suppressionConfig;
    	      this.type = defaults.type;
        }

        public Builder conditions(@Nullable Output<ConditionsArgs> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable ConditionsArgs conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable ScopeArgs scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,ActionRuleStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,ActionRuleStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder suppressionConfig(Output<SuppressionConfigArgs> suppressionConfig) {
            this.suppressionConfig = Objects.requireNonNull(suppressionConfig);
            return this;
        }
        public Builder suppressionConfig(SuppressionConfigArgs suppressionConfig) {
            this.suppressionConfig = Output.of(Objects.requireNonNull(suppressionConfig));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SuppressionArgs build() {
            return new SuppressionArgs(conditions, description, scope, status, suppressionConfig, type);
        }
    }
}
