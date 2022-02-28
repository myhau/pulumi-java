// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleStopActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleStopActionGetArgs Empty = new ReceiptRuleStopActionGetArgs();

    /**
     * The position of the action in the receipt rule
     * 
     */
    @InputImport(name="position", required=true)
      private final Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position;
    }

    /**
     * The scope to apply
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @InputImport(name="topicArn")
      private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public ReceiptRuleStopActionGetArgs(
        Input<Integer> position,
        Input<String> scope,
        @Nullable Input<String> topicArn) {
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleStopActionGetArgs() {
        this.position = Input.empty();
        this.scope = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleStopActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> position;
        private Input<String> scope;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleStopActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.scope = defaults.scope;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setTopicArn(@Nullable Input<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = Input.ofNullable(topicArn);
            return this;
        }
        public ReceiptRuleStopActionGetArgs build() {
            return new ReceiptRuleStopActionGetArgs(position, scope, topicArn);
        }
    }
}
