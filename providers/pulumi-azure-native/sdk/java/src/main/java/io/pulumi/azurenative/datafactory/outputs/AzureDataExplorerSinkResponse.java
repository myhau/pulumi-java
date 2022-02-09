// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureDataExplorerSinkResponse {
    private final @Nullable Object disableMetricsCollection;
    private final @Nullable Object flushImmediately;
    private final @Nullable Object ingestionMappingAsJson;
    private final @Nullable Object ingestionMappingName;
    private final @Nullable Object maxConcurrentConnections;
    private final @Nullable Object sinkRetryCount;
    private final @Nullable Object sinkRetryWait;
    private final String type;
    private final @Nullable Object writeBatchSize;
    private final @Nullable Object writeBatchTimeout;

    @OutputCustomType.Constructor({"disableMetricsCollection","flushImmediately","ingestionMappingAsJson","ingestionMappingName","maxConcurrentConnections","sinkRetryCount","sinkRetryWait","type","writeBatchSize","writeBatchTimeout"})
    private AzureDataExplorerSinkResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable Object flushImmediately,
        @Nullable Object ingestionMappingAsJson,
        @Nullable Object ingestionMappingName,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.flushImmediately = flushImmediately;
        this.ingestionMappingAsJson = ingestionMappingAsJson;
        this.ingestionMappingName = ingestionMappingName;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type);
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    public Optional<Object> getFlushImmediately() {
        return Optional.ofNullable(this.flushImmediately);
    }
    public Optional<Object> getIngestionMappingAsJson() {
        return Optional.ofNullable(this.ingestionMappingAsJson);
    }
    public Optional<Object> getIngestionMappingName() {
        return Optional.ofNullable(this.ingestionMappingName);
    }
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object flushImmediately;
        private @Nullable Object ingestionMappingAsJson;
        private @Nullable Object ingestionMappingName;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.flushImmediately = defaults.flushImmediately;
    	      this.ingestionMappingAsJson = defaults.ingestionMappingAsJson;
    	      this.ingestionMappingName = defaults.ingestionMappingName;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setFlushImmediately(@Nullable Object flushImmediately) {
            this.flushImmediately = flushImmediately;
            return this;
        }

        public Builder setIngestionMappingAsJson(@Nullable Object ingestionMappingAsJson) {
            this.ingestionMappingAsJson = ingestionMappingAsJson;
            return this;
        }

        public Builder setIngestionMappingName(@Nullable Object ingestionMappingName) {
            this.ingestionMappingName = ingestionMappingName;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public AzureDataExplorerSinkResponse build() {
            return new AzureDataExplorerSinkResponse(disableMetricsCollection, flushImmediately, ingestionMappingAsJson, ingestionMappingName, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}