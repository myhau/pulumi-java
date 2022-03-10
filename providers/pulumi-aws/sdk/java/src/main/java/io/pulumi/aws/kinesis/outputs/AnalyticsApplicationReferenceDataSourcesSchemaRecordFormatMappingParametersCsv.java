// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv {
    /**
     * The Column Delimiter.
     * 
     */
    private final String recordColumnDelimiter;
    /**
     * The Row Delimiter.
     * 
     */
    private final String recordRowDelimiter;

    @OutputCustomType.Constructor({"recordColumnDelimiter","recordRowDelimiter"})
    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv(
        String recordColumnDelimiter,
        String recordRowDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
        this.recordRowDelimiter = recordRowDelimiter;
    }

    /**
     * The Column Delimiter.
     * 
    */
    public String getRecordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }
    /**
     * The Row Delimiter.
     * 
    */
    public String getRecordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordColumnDelimiter;
        private String recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder setRecordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }

        public Builder setRecordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}