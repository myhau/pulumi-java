// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleKinesis {
    /**
     * The partition key.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
     */
    private final String roleArn;
    /**
     * The name of the Amazon Kinesis stream.
     * 
     */
    private final String streamName;

    @OutputCustomType.Constructor({"partitionKey","roleArn","streamName"})
    private TopicRuleKinesis(
        @Nullable String partitionKey,
        String roleArn,
        String streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.streamName = Objects.requireNonNull(streamName);
    }

    /**
     * The partition key.
     * 
     */
    public Optional<String> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The name of the Amazon Kinesis stream.
     * 
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleKinesis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partitionKey;
        private String roleArn;
        private String streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleKinesis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStreamName(String streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }
        public TopicRuleKinesis build() {
            return new TopicRuleKinesis(partitionKey, roleArn, streamName);
        }
    }
}
