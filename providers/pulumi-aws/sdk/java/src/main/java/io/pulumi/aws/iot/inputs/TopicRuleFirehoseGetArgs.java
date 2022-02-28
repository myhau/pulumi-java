// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleFirehoseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleFirehoseGetArgs Empty = new TopicRuleFirehoseGetArgs();

    /**
     * The delivery stream name.
     * 
     */
    @InputImport(name="deliveryStreamName", required=true)
      private final Input<String> deliveryStreamName;

    public Input<String> getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * 
     */
    @InputImport(name="separator")
      private final @Nullable Input<String> separator;

    public Input<String> getSeparator() {
        return this.separator == null ? Input.empty() : this.separator;
    }

    public TopicRuleFirehoseGetArgs(
        Input<String> deliveryStreamName,
        Input<String> roleArn,
        @Nullable Input<String> separator) {
        this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.separator = separator;
    }

    private TopicRuleFirehoseGetArgs() {
        this.deliveryStreamName = Input.empty();
        this.roleArn = Input.empty();
        this.separator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleFirehoseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deliveryStreamName;
        private Input<String> roleArn;
        private @Nullable Input<String> separator;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleFirehoseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.roleArn = defaults.roleArn;
    	      this.separator = defaults.separator;
        }

        public Builder setDeliveryStreamName(Input<String> deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }

        public Builder setDeliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Input.of(Objects.requireNonNull(deliveryStreamName));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setSeparator(@Nullable Input<String> separator) {
            this.separator = separator;
            return this;
        }

        public Builder setSeparator(@Nullable String separator) {
            this.separator = Input.ofNullable(separator);
            return this;
        }
        public TopicRuleFirehoseGetArgs build() {
            return new TopicRuleFirehoseGetArgs(deliveryStreamName, roleArn, separator);
        }
    }
}
