// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleWorkmailActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleWorkmailActionArgs Empty = new ReceiptRuleWorkmailActionArgs();

    /**
     * The ARN of the WorkMail organization
     * 
     */
    @InputImport(name="organizationArn", required=true)
      private final Input<String> organizationArn;

    public Input<String> getOrganizationArn() {
        return this.organizationArn;
    }

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
     * The ARN of an SNS topic to notify
     * 
     */
    @InputImport(name="topicArn")
      private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public ReceiptRuleWorkmailActionArgs(
        Input<String> organizationArn,
        Input<Integer> position,
        @Nullable Input<String> topicArn) {
        this.organizationArn = Objects.requireNonNull(organizationArn, "expected parameter 'organizationArn' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleWorkmailActionArgs() {
        this.organizationArn = Input.empty();
        this.position = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleWorkmailActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> organizationArn;
        private Input<Integer> position;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleWorkmailActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationArn = defaults.organizationArn;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setOrganizationArn(Input<String> organizationArn) {
            this.organizationArn = Objects.requireNonNull(organizationArn);
            return this;
        }

        public Builder setOrganizationArn(String organizationArn) {
            this.organizationArn = Input.of(Objects.requireNonNull(organizationArn));
            return this;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
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
        public ReceiptRuleWorkmailActionArgs build() {
            return new ReceiptRuleWorkmailActionArgs(organizationArn, position, topicArn);
        }
    }
}
