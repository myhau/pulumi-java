// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleDynamodb {
    /**
     * The hash key name.
     * 
     */
    private final String hashKeyField;
    /**
     * The hash key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    private final @Nullable String hashKeyType;
    /**
     * The hash key value.
     * 
     */
    private final String hashKeyValue;
    /**
     * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
     * 
     */
    private final @Nullable String operation;
    /**
     * The action payload.
     * 
     */
    private final @Nullable String payloadField;
    /**
     * The range key name.
     * 
     */
    private final @Nullable String rangeKeyField;
    /**
     * The range key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    private final @Nullable String rangeKeyType;
    /**
     * The range key value.
     * 
     */
    private final @Nullable String rangeKeyValue;
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    private final String roleArn;
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String tableName;

    @OutputCustomType.Constructor({"hashKeyField","hashKeyType","hashKeyValue","operation","payloadField","rangeKeyField","rangeKeyType","rangeKeyValue","roleArn","tableName"})
    private TopicRuleDynamodb(
        String hashKeyField,
        @Nullable String hashKeyType,
        String hashKeyValue,
        @Nullable String operation,
        @Nullable String payloadField,
        @Nullable String rangeKeyField,
        @Nullable String rangeKeyType,
        @Nullable String rangeKeyValue,
        String roleArn,
        String tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField);
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
        this.operation = operation;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.tableName = Objects.requireNonNull(tableName);
    }

    /**
     * The hash key name.
     * 
     */
    public String getHashKeyField() {
        return this.hashKeyField;
    }
    /**
     * The hash key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    public Optional<String> getHashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    /**
     * The hash key value.
     * 
     */
    public String getHashKeyValue() {
        return this.hashKeyValue;
    }
    /**
     * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
     * 
     */
    public Optional<String> getOperation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * The action payload.
     * 
     */
    public Optional<String> getPayloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    /**
     * The range key name.
     * 
     */
    public Optional<String> getRangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    /**
     * The range key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    public Optional<String> getRangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    /**
     * The range key value.
     * 
     */
    public Optional<String> getRangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The name of the DynamoDB table.
     * 
     */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String roleArn;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder setHashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder setHashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder setHashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }

        public Builder setPayloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder setRangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder setRangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder setRangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public TopicRuleDynamodb build() {
            return new TopicRuleDynamodb(hashKeyField, hashKeyType, hashKeyValue, operation, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}
