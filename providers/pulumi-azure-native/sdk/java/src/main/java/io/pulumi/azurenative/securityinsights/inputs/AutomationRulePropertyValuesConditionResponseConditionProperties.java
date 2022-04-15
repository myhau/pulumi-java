// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the automation rule condition
 * 
 */
public final class AutomationRulePropertyValuesConditionResponseConditionProperties extends io.pulumi.resources.InvokeArgs {

    public static final AutomationRulePropertyValuesConditionResponseConditionProperties Empty = new AutomationRulePropertyValuesConditionResponseConditionProperties();

    /**
     * The operator to use for evaluation the condition
     * 
     */
    @Import(name="operator")
      private final @Nullable String operator;

    public Optional<String> operator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    /**
     * The property to evaluate
     * 
     */
    @Import(name="propertyName")
      private final @Nullable String propertyName;

    public Optional<String> propertyName() {
        return this.propertyName == null ? Optional.empty() : Optional.ofNullable(this.propertyName);
    }

    /**
     * The values to use for evaluating the condition
     * 
     */
    @Import(name="propertyValues")
      private final @Nullable List<String> propertyValues;

    public List<String> propertyValues() {
        return this.propertyValues == null ? List.of() : this.propertyValues;
    }

    public AutomationRulePropertyValuesConditionResponseConditionProperties(
        @Nullable String operator,
        @Nullable String propertyName,
        @Nullable List<String> propertyValues) {
        this.operator = operator;
        this.propertyName = propertyName;
        this.propertyValues = propertyValues;
    }

    private AutomationRulePropertyValuesConditionResponseConditionProperties() {
        this.operator = null;
        this.propertyName = null;
        this.propertyValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRulePropertyValuesConditionResponseConditionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operator;
        private @Nullable String propertyName;
        private @Nullable List<String> propertyValues;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRulePropertyValuesConditionResponseConditionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.propertyName = defaults.propertyName;
    	      this.propertyValues = defaults.propertyValues;
        }

        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder propertyName(@Nullable String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public Builder propertyValues(@Nullable List<String> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public Builder propertyValues(String... propertyValues) {
            return propertyValues(List.of(propertyValues));
        }        public AutomationRulePropertyValuesConditionResponseConditionProperties build() {
            return new AutomationRulePropertyValuesConditionResponseConditionProperties(operator, propertyName, propertyValues);
        }
    }
}
