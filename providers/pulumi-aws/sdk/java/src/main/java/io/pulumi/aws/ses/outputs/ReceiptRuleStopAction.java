// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReceiptRuleStopAction {
    /**
     * The position of the action in the receipt rule
     * 
     */
    private final Integer position;
    /**
     * The scope to apply
     * 
     */
    private final String scope;
    /**
     * The ARN of an SNS topic to notify
     * 
     */
    private final @Nullable String topicArn;

    @OutputCustomType.Constructor({"position","scope","topicArn"})
    private ReceiptRuleStopAction(
        Integer position,
        String scope,
        @Nullable String topicArn) {
        this.position = position;
        this.scope = scope;
        this.topicArn = topicArn;
    }

    /**
     * The position of the action in the receipt rule
     * 
    */
    public Integer getPosition() {
        return this.position;
    }
    /**
     * The scope to apply
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * The ARN of an SNS topic to notify
     * 
    */
    public Optional<String> getTopicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleStopAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer position;
        private String scope;
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleStopAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.scope = defaults.scope;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setPosition(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleStopAction build() {
            return new ReceiptRuleStopAction(position, scope, topicArn);
        }
    }
}
