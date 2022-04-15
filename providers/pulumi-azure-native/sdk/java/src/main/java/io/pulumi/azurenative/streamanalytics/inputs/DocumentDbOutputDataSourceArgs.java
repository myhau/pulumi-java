// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a DocumentDB output data source.
 * 
 */
public final class DocumentDbOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentDbOutputDataSourceArgs Empty = new DocumentDbOutputDataSourceArgs();

    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountKey")
      private final @Nullable Output<String> accountKey;

    public Output<String> accountKey() {
        return this.accountKey == null ? Codegen.empty() : this.accountKey;
    }

    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="collectionNamePattern")
      private final @Nullable Output<String> collectionNamePattern;

    public Output<String> collectionNamePattern() {
        return this.collectionNamePattern == null ? Codegen.empty() : this.collectionNamePattern;
    }

    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    @Import(name="documentId")
      private final @Nullable Output<String> documentId;

    public Output<String> documentId() {
        return this.documentId == null ? Codegen.empty() : this.documentId;
    }

    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable Output<String> partitionKey;

    public Output<String> partitionKey() {
        return this.partitionKey == null ? Codegen.empty() : this.partitionKey;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/DocumentDB'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public DocumentDbOutputDataSourceArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<String> accountKey,
        @Nullable Output<String> collectionNamePattern,
        @Nullable Output<String> database,
        @Nullable Output<String> documentId,
        @Nullable Output<String> partitionKey,
        Output<String> type) {
        this.accountId = accountId;
        this.accountKey = accountKey;
        this.collectionNamePattern = collectionNamePattern;
        this.database = database;
        this.documentId = documentId;
        this.partitionKey = partitionKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DocumentDbOutputDataSourceArgs() {
        this.accountId = Codegen.empty();
        this.accountKey = Codegen.empty();
        this.collectionNamePattern = Codegen.empty();
        this.database = Codegen.empty();
        this.documentId = Codegen.empty();
        this.partitionKey = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentDbOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> accountKey;
        private @Nullable Output<String> collectionNamePattern;
        private @Nullable Output<String> database;
        private @Nullable Output<String> documentId;
        private @Nullable Output<String> partitionKey;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentDbOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountKey = defaults.accountKey;
    	      this.collectionNamePattern = defaults.collectionNamePattern;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.type = defaults.type;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder accountKey(@Nullable Output<String> accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = Codegen.ofNullable(accountKey);
            return this;
        }
        public Builder collectionNamePattern(@Nullable Output<String> collectionNamePattern) {
            this.collectionNamePattern = collectionNamePattern;
            return this;
        }
        public Builder collectionNamePattern(@Nullable String collectionNamePattern) {
            this.collectionNamePattern = Codegen.ofNullable(collectionNamePattern);
            return this;
        }
        public Builder database(@Nullable Output<String> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder documentId(@Nullable Output<String> documentId) {
            this.documentId = documentId;
            return this;
        }
        public Builder documentId(@Nullable String documentId) {
            this.documentId = Codegen.ofNullable(documentId);
            return this;
        }
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Codegen.ofNullable(partitionKey);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DocumentDbOutputDataSourceArgs build() {
            return new DocumentDbOutputDataSourceArgs(accountId, accountKey, collectionNamePattern, database, documentId, partitionKey, type);
        }
    }
}
