// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.BlobStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.EventHubStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.IoTHubStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamInputPropertiesResponse {
    /**
     * Describes an input data source that contains stream data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object datasource;
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    private final DiagnosticsResponse diagnostics;
    /**
     * The current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object serialization;
    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Stream'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"datasource","diagnostics","etag","serialization","type"})
    private StreamInputPropertiesResponse(
        @Nullable Object datasource,
        DiagnosticsResponse diagnostics,
        String etag,
        @Nullable Object serialization,
        String type) {
        this.datasource = datasource;
        this.diagnostics = diagnostics;
        this.etag = etag;
        this.serialization = serialization;
        this.type = type;
    }

    /**
     * Describes an input data source that contains stream data. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Object> getDatasource() {
        return Optional.ofNullable(this.datasource);
    }
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
    */
    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }
    /**
     * The current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Object> getSerialization() {
        return Optional.ofNullable(this.serialization);
    }
    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Stream'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamInputPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamInputPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDiagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public StreamInputPropertiesResponse build() {
            return new StreamInputPropertiesResponse(datasource, diagnostics, etag, serialization, type);
        }
    }
}
