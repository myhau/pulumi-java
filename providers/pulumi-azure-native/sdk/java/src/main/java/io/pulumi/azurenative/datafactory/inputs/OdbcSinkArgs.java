// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity ODBC sink.
 * 
 */
public final class OdbcSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final OdbcSinkArgs Empty = new OdbcSinkArgs();

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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * A query to execute before starting the copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Output<Object> preCopyScript;

    public Output<Object> preCopyScript() {
        return this.preCopyScript == null ? Codegen.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Codegen.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Codegen.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'OdbcSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Codegen.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Codegen.empty() : this.writeBatchTimeout;
    }

    public OdbcSinkArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> preCopyScript,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private OdbcSinkArgs() {
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.preCopyScript = Codegen.empty();
        this.sinkRetryCount = Codegen.empty();
        this.sinkRetryWait = Codegen.empty();
        this.type = Codegen.empty();
        this.writeBatchSize = Codegen.empty();
        this.writeBatchTimeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OdbcSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> preCopyScript;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(OdbcSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
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
        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }
        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Codegen.ofNullable(preCopyScript);
            return this;
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Codegen.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Codegen.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Codegen.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Codegen.ofNullable(writeBatchTimeout);
            return this;
        }        public OdbcSinkArgs build() {
            return new OdbcSinkArgs(disableMetricsCollection, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
