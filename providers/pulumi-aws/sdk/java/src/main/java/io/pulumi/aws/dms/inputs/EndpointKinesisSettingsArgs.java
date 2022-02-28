// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointKinesisSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointKinesisSettingsArgs Empty = new EndpointKinesisSettingsArgs();

    /**
     * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is `false`.
     * 
     */
    @InputImport(name="includeControlDetails")
      private final @Nullable Input<Boolean> includeControlDetails;

    public Input<Boolean> getIncludeControlDetails() {
        return this.includeControlDetails == null ? Input.empty() : this.includeControlDetails;
    }

    /**
     * Include NULL and empty columns in the target. The default is `false`.
     * 
     */
    @InputImport(name="includeNullAndEmpty")
      private final @Nullable Input<Boolean> includeNullAndEmpty;

    public Input<Boolean> getIncludeNullAndEmpty() {
        return this.includeNullAndEmpty == null ? Input.empty() : this.includeNullAndEmpty;
    }

    /**
     * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is `false`.
     * 
     */
    @InputImport(name="includePartitionValue")
      private final @Nullable Input<Boolean> includePartitionValue;

    public Input<Boolean> getIncludePartitionValue() {
        return this.includePartitionValue == null ? Input.empty() : this.includePartitionValue;
    }

    /**
     * Includes any data definition language (DDL) operations that change the table in the control data. The default is `false`.
     * 
     */
    @InputImport(name="includeTableAlterOperations")
      private final @Nullable Input<Boolean> includeTableAlterOperations;

    public Input<Boolean> getIncludeTableAlterOperations() {
        return this.includeTableAlterOperations == null ? Input.empty() : this.includeTableAlterOperations;
    }

    /**
     * Provides detailed transaction information from the source database. The default is `false`.
     * 
     */
    @InputImport(name="includeTransactionDetails")
      private final @Nullable Input<Boolean> includeTransactionDetails;

    public Input<Boolean> getIncludeTransactionDetails() {
        return this.includeTransactionDetails == null ? Input.empty() : this.includeTransactionDetails;
    }

    /**
     * Output format for the records created. Defaults to `json`. Valid values are `json` and `json_unformatted` (a single line with no tab).
     * 
     */
    @InputImport(name="messageFormat")
      private final @Nullable Input<String> messageFormat;

    public Input<String> getMessageFormat() {
        return this.messageFormat == null ? Input.empty() : this.messageFormat;
    }

    /**
     * Prefixes schema and table names to partition values, when the partition type is primary-key-type. The default is `false`.
     * 
     */
    @InputImport(name="partitionIncludeSchemaTable")
      private final @Nullable Input<Boolean> partitionIncludeSchemaTable;

    public Input<Boolean> getPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable == null ? Input.empty() : this.partitionIncludeSchemaTable;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
     * 
     */
    @InputImport(name="serviceAccessRoleArn")
      private final @Nullable Input<String> serviceAccessRoleArn;

    public Input<String> getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn == null ? Input.empty() : this.serviceAccessRoleArn;
    }

    /**
     * Amazon Resource Name (ARN) of the Kinesis data stream.
     * 
     */
    @InputImport(name="streamArn")
      private final @Nullable Input<String> streamArn;

    public Input<String> getStreamArn() {
        return this.streamArn == null ? Input.empty() : this.streamArn;
    }

    public EndpointKinesisSettingsArgs(
        @Nullable Input<Boolean> includeControlDetails,
        @Nullable Input<Boolean> includeNullAndEmpty,
        @Nullable Input<Boolean> includePartitionValue,
        @Nullable Input<Boolean> includeTableAlterOperations,
        @Nullable Input<Boolean> includeTransactionDetails,
        @Nullable Input<String> messageFormat,
        @Nullable Input<Boolean> partitionIncludeSchemaTable,
        @Nullable Input<String> serviceAccessRoleArn,
        @Nullable Input<String> streamArn) {
        this.includeControlDetails = includeControlDetails;
        this.includeNullAndEmpty = includeNullAndEmpty;
        this.includePartitionValue = includePartitionValue;
        this.includeTableAlterOperations = includeTableAlterOperations;
        this.includeTransactionDetails = includeTransactionDetails;
        this.messageFormat = messageFormat;
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        this.streamArn = streamArn;
    }

    private EndpointKinesisSettingsArgs() {
        this.includeControlDetails = Input.empty();
        this.includeNullAndEmpty = Input.empty();
        this.includePartitionValue = Input.empty();
        this.includeTableAlterOperations = Input.empty();
        this.includeTransactionDetails = Input.empty();
        this.messageFormat = Input.empty();
        this.partitionIncludeSchemaTable = Input.empty();
        this.serviceAccessRoleArn = Input.empty();
        this.streamArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointKinesisSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> includeControlDetails;
        private @Nullable Input<Boolean> includeNullAndEmpty;
        private @Nullable Input<Boolean> includePartitionValue;
        private @Nullable Input<Boolean> includeTableAlterOperations;
        private @Nullable Input<Boolean> includeTransactionDetails;
        private @Nullable Input<String> messageFormat;
        private @Nullable Input<Boolean> partitionIncludeSchemaTable;
        private @Nullable Input<String> serviceAccessRoleArn;
        private @Nullable Input<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointKinesisSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeControlDetails = defaults.includeControlDetails;
    	      this.includeNullAndEmpty = defaults.includeNullAndEmpty;
    	      this.includePartitionValue = defaults.includePartitionValue;
    	      this.includeTableAlterOperations = defaults.includeTableAlterOperations;
    	      this.includeTransactionDetails = defaults.includeTransactionDetails;
    	      this.messageFormat = defaults.messageFormat;
    	      this.partitionIncludeSchemaTable = defaults.partitionIncludeSchemaTable;
    	      this.serviceAccessRoleArn = defaults.serviceAccessRoleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder setIncludeControlDetails(@Nullable Input<Boolean> includeControlDetails) {
            this.includeControlDetails = includeControlDetails;
            return this;
        }

        public Builder setIncludeControlDetails(@Nullable Boolean includeControlDetails) {
            this.includeControlDetails = Input.ofNullable(includeControlDetails);
            return this;
        }

        public Builder setIncludeNullAndEmpty(@Nullable Input<Boolean> includeNullAndEmpty) {
            this.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }

        public Builder setIncludeNullAndEmpty(@Nullable Boolean includeNullAndEmpty) {
            this.includeNullAndEmpty = Input.ofNullable(includeNullAndEmpty);
            return this;
        }

        public Builder setIncludePartitionValue(@Nullable Input<Boolean> includePartitionValue) {
            this.includePartitionValue = includePartitionValue;
            return this;
        }

        public Builder setIncludePartitionValue(@Nullable Boolean includePartitionValue) {
            this.includePartitionValue = Input.ofNullable(includePartitionValue);
            return this;
        }

        public Builder setIncludeTableAlterOperations(@Nullable Input<Boolean> includeTableAlterOperations) {
            this.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }

        public Builder setIncludeTableAlterOperations(@Nullable Boolean includeTableAlterOperations) {
            this.includeTableAlterOperations = Input.ofNullable(includeTableAlterOperations);
            return this;
        }

        public Builder setIncludeTransactionDetails(@Nullable Input<Boolean> includeTransactionDetails) {
            this.includeTransactionDetails = includeTransactionDetails;
            return this;
        }

        public Builder setIncludeTransactionDetails(@Nullable Boolean includeTransactionDetails) {
            this.includeTransactionDetails = Input.ofNullable(includeTransactionDetails);
            return this;
        }

        public Builder setMessageFormat(@Nullable Input<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder setMessageFormat(@Nullable String messageFormat) {
            this.messageFormat = Input.ofNullable(messageFormat);
            return this;
        }

        public Builder setPartitionIncludeSchemaTable(@Nullable Input<Boolean> partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }

        public Builder setPartitionIncludeSchemaTable(@Nullable Boolean partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = Input.ofNullable(partitionIncludeSchemaTable);
            return this;
        }

        public Builder setServiceAccessRoleArn(@Nullable Input<String> serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        public Builder setServiceAccessRoleArn(@Nullable String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = Input.ofNullable(serviceAccessRoleArn);
            return this;
        }

        public Builder setStreamArn(@Nullable Input<String> streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        public Builder setStreamArn(@Nullable String streamArn) {
            this.streamArn = Input.ofNullable(streamArn);
            return this;
        }
        public EndpointKinesisSettingsArgs build() {
            return new EndpointKinesisSettingsArgs(includeControlDetails, includeNullAndEmpty, includePartitionValue, includeTableAlterOperations, includeTransactionDetails, messageFormat, partitionIncludeSchemaTable, serviceAccessRoleArn, streamArn);
        }
    }
}
