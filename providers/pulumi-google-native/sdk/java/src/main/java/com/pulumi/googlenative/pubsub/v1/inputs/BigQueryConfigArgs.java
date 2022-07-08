// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a BigQuery subscription.
 * 
 */
public final class BigQueryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BigQueryConfigArgs Empty = new BigQueryConfigArgs();

    /**
     * When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery. Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription&#39;s backlog.
     * 
     */
    @Import(name="dropUnknownFields")
    private @Nullable Output<Boolean> dropUnknownFields;

    /**
     * @return When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery. Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription&#39;s backlog.
     * 
     */
    public Optional<Output<Boolean>> dropUnknownFields() {
        return Optional.ofNullable(this.dropUnknownFields);
    }

    /**
     * The name of the table to which to write data, of the form {projectId}.{datasetId}.{tableId}
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return The name of the table to which to write data, of the form {projectId}.{datasetId}.{tableId}
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * When true, use the topic&#39;s schema as the columns to write to in BigQuery, if it exists.
     * 
     */
    @Import(name="useTopicSchema")
    private @Nullable Output<Boolean> useTopicSchema;

    /**
     * @return When true, use the topic&#39;s schema as the columns to write to in BigQuery, if it exists.
     * 
     */
    public Optional<Output<Boolean>> useTopicSchema() {
        return Optional.ofNullable(this.useTopicSchema);
    }

    /**
     * When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
     * 
     */
    @Import(name="writeMetadata")
    private @Nullable Output<Boolean> writeMetadata;

    /**
     * @return When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
     * 
     */
    public Optional<Output<Boolean>> writeMetadata() {
        return Optional.ofNullable(this.writeMetadata);
    }

    private BigQueryConfigArgs() {}

    private BigQueryConfigArgs(BigQueryConfigArgs $) {
        this.dropUnknownFields = $.dropUnknownFields;
        this.table = $.table;
        this.useTopicSchema = $.useTopicSchema;
        this.writeMetadata = $.writeMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BigQueryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigQueryConfigArgs $;

        public Builder() {
            $ = new BigQueryConfigArgs();
        }

        public Builder(BigQueryConfigArgs defaults) {
            $ = new BigQueryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropUnknownFields When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery. Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription&#39;s backlog.
         * 
         * @return builder
         * 
         */
        public Builder dropUnknownFields(@Nullable Output<Boolean> dropUnknownFields) {
            $.dropUnknownFields = dropUnknownFields;
            return this;
        }

        /**
         * @param dropUnknownFields When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery. Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription&#39;s backlog.
         * 
         * @return builder
         * 
         */
        public Builder dropUnknownFields(Boolean dropUnknownFields) {
            return dropUnknownFields(Output.of(dropUnknownFields));
        }

        /**
         * @param table The name of the table to which to write data, of the form {projectId}.{datasetId}.{tableId}
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table The name of the table to which to write data, of the form {projectId}.{datasetId}.{tableId}
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        /**
         * @param useTopicSchema When true, use the topic&#39;s schema as the columns to write to in BigQuery, if it exists.
         * 
         * @return builder
         * 
         */
        public Builder useTopicSchema(@Nullable Output<Boolean> useTopicSchema) {
            $.useTopicSchema = useTopicSchema;
            return this;
        }

        /**
         * @param useTopicSchema When true, use the topic&#39;s schema as the columns to write to in BigQuery, if it exists.
         * 
         * @return builder
         * 
         */
        public Builder useTopicSchema(Boolean useTopicSchema) {
            return useTopicSchema(Output.of(useTopicSchema));
        }

        /**
         * @param writeMetadata When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
         * 
         * @return builder
         * 
         */
        public Builder writeMetadata(@Nullable Output<Boolean> writeMetadata) {
            $.writeMetadata = writeMetadata;
            return this;
        }

        /**
         * @param writeMetadata When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
         * 
         * @return builder
         * 
         */
        public Builder writeMetadata(Boolean writeMetadata) {
            return writeMetadata(Output.of(writeMetadata));
        }

        public BigQueryConfigArgs build() {
            return $;
        }
    }

}
