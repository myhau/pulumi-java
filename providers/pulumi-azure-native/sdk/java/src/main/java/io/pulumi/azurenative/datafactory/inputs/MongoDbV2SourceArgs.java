// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.MongoDbCursorMethodsPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for a MongoDB database.
 * 
 */
public final class MongoDbV2SourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbV2SourceArgs Empty = new MongoDbV2SourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> additionalColumns() {
        return this.additionalColumns == null ? Codegen.empty() : this.additionalColumns;
    }

    /**
     * Specifies the number of documents to return in each batch of the response from MongoDB instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="batchSize")
      private final @Nullable Output<Object> batchSize;

    public Output<Object> batchSize() {
        return this.batchSize == null ? Codegen.empty() : this.batchSize;
    }

    /**
     * Cursor methods for Mongodb query
     * 
     */
    @Import(name="cursorMethods")
      private final @Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods;

    public Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods() {
        return this.cursorMethods == null ? Codegen.empty() : this.cursorMethods;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<Object> filter;

    public Output<Object> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Object> queryTimeout;

    public Output<Object> queryTimeout() {
        return this.queryTimeout == null ? Codegen.empty() : this.queryTimeout;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Codegen.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Codegen.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'MongoDbV2Source'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public MongoDbV2SourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> batchSize,
        @Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> filter,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.cursorMethods = cursorMethods;
        this.disableMetricsCollection = disableMetricsCollection;
        this.filter = filter;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MongoDbV2SourceArgs() {
        this.additionalColumns = Codegen.empty();
        this.batchSize = Codegen.empty();
        this.cursorMethods = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.filter = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.queryTimeout = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbV2SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> batchSize;
        private @Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> filter;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbV2SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.cursorMethods = defaults.cursorMethods;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.filter = defaults.filter;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Codegen.ofNullable(additionalColumns);
            return this;
        }
        public Builder batchSize(@Nullable Output<Object> batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder batchSize(@Nullable Object batchSize) {
            this.batchSize = Codegen.ofNullable(batchSize);
            return this;
        }
        public Builder cursorMethods(@Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods) {
            this.cursorMethods = cursorMethods;
            return this;
        }
        public Builder cursorMethods(@Nullable MongoDbCursorMethodsPropertiesArgs cursorMethods) {
            this.cursorMethods = Codegen.ofNullable(cursorMethods);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder filter(@Nullable Output<Object> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable Object filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Codegen.ofNullable(queryTimeout);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Codegen.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Codegen.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MongoDbV2SourceArgs build() {
            return new MongoDbV2SourceArgs(additionalColumns, batchSize, cursorMethods, disableMetricsCollection, filter, maxConcurrentConnections, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
