// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TimePartitioningResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimePartitioningResponse Empty = new TimePartitioningResponse();

    @InputImport(name="expirationMs", required=true)
    private final String expirationMs;

    public String getExpirationMs() {
        return this.expirationMs;
    }

    @InputImport(name="field", required=true)
    private final String field;

    public String getField() {
        return this.field;
    }

    @InputImport(name="requirePartitionFilter", required=true)
    private final Boolean requirePartitionFilter;

    public Boolean getRequirePartitionFilter() {
        return this.requirePartitionFilter;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TimePartitioningResponse(
        String expirationMs,
        String field,
        Boolean requirePartitionFilter,
        String type) {
        this.expirationMs = Objects.requireNonNull(expirationMs, "expected parameter 'expirationMs' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter, "expected parameter 'requirePartitionFilter' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TimePartitioningResponse() {
        this.expirationMs = null;
        this.field = null;
        this.requirePartitionFilter = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimePartitioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationMs;
        private String field;
        private Boolean requirePartitionFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimePartitioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(String expirationMs) {
            this.expirationMs = Objects.requireNonNull(expirationMs);
            return this;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setRequirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TimePartitioningResponse build() {
            return new TimePartitioningResponse(expirationMs, field, requirePartitionFilter, type);
        }
    }
}