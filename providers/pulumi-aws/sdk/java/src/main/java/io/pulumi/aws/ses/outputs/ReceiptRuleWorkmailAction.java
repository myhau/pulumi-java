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
public final class ReceiptRuleWorkmailAction {
    /**
     * The ARN of the WorkMail organization
     * 
     */
    private final String organizationArn;
    /**
     * The position of the action in the receipt rule
     * 
     */
    private final Integer position;
    /**
     * The ARN of an SNS topic to notify
     * 
     */
    private final @Nullable String topicArn;

    @OutputCustomType.Constructor({"organizationArn","position","topicArn"})
    private ReceiptRuleWorkmailAction(
        String organizationArn,
        Integer position,
        @Nullable String topicArn) {
        this.organizationArn = Objects.requireNonNull(organizationArn);
        this.position = Objects.requireNonNull(position);
        this.topicArn = topicArn;
    }

    /**
     * The ARN of the WorkMail organization
     * 
     */
    public String getOrganizationArn() {
        return this.organizationArn;
    }
    /**
     * The position of the action in the receipt rule
     * 
     */
    public Integer getPosition() {
        return this.position;
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

    public static Builder builder(ReceiptRuleWorkmailAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationArn;
        private Integer position;
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleWorkmailAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationArn = defaults.organizationArn;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setOrganizationArn(String organizationArn) {
            this.organizationArn = Objects.requireNonNull(organizationArn);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleWorkmailAction build() {
            return new ReceiptRuleWorkmailAction(organizationArn, position, topicArn);
        }
    }
}
