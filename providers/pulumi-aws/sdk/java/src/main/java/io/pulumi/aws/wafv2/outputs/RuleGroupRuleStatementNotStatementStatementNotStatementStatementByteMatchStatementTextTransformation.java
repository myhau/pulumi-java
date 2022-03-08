// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation {
    /**
     * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    private final Integer priority;
    /**
     * The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"priority","type"})
    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation(
        Integer priority,
        String type) {
        this.priority = priority;
        this.type = type;
    }

    /**
     * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementTextTransformation(priority, type);
        }
    }
}
