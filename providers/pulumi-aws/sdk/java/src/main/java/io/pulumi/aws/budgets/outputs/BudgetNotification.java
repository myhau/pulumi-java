// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetNotification {
    /**
     * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    private final String comparisonOperator;
    /**
     * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    private final String notificationType;
    /**
     * (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    private final @Nullable List<String> subscriberEmailAddresses;
    /**
     * (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    private final @Nullable List<String> subscriberSnsTopicArns;
    /**
     * (Required) Threshold when the notification should be sent.
     * 
     */
    private final Double threshold;
    /**
     * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    private final String thresholdType;

    @OutputCustomType.Constructor({"comparisonOperator","notificationType","subscriberEmailAddresses","subscriberSnsTopicArns","threshold","thresholdType"})
    private BudgetNotification(
        String comparisonOperator,
        String notificationType,
        @Nullable List<String> subscriberEmailAddresses,
        @Nullable List<String> subscriberSnsTopicArns,
        Double threshold,
        String thresholdType) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
        this.notificationType = Objects.requireNonNull(notificationType);
        this.subscriberEmailAddresses = subscriberEmailAddresses;
        this.subscriberSnsTopicArns = subscriberSnsTopicArns;
        this.threshold = Objects.requireNonNull(threshold);
        this.thresholdType = Objects.requireNonNull(thresholdType);
    }

    /**
     * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    public String getNotificationType() {
        return this.notificationType;
    }
    /**
     * (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    public List<String> getSubscriberEmailAddresses() {
        return this.subscriberEmailAddresses == null ? List.of() : this.subscriberEmailAddresses;
    }
    /**
     * (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    public List<String> getSubscriberSnsTopicArns() {
        return this.subscriberSnsTopicArns == null ? List.of() : this.subscriberSnsTopicArns;
    }
    /**
     * (Required) Threshold when the notification should be sent.
     * 
     */
    public Double getThreshold() {
        return this.threshold;
    }
    /**
     * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    public String getThresholdType() {
        return this.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private String notificationType;
        private @Nullable List<String> subscriberEmailAddresses;
        private @Nullable List<String> subscriberSnsTopicArns;
        private Double threshold;
        private String thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.notificationType = defaults.notificationType;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.subscriberSnsTopicArns = defaults.subscriberSnsTopicArns;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setNotificationType(String notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }

        public Builder setSubscriberEmailAddresses(@Nullable List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }

        public Builder setSubscriberSnsTopicArns(@Nullable List<String> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThresholdType(String thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }
        public BudgetNotification build() {
            return new BudgetNotification(comparisonOperator, notificationType, subscriberEmailAddresses, subscriberSnsTopicArns, threshold, thresholdType);
        }
    }
}
