// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv csv;
    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson json;

    @OutputCustomType.Constructor({"csv","json"})
    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters(
        @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv csv,
        @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson json) {
        this.csv = csv;
        this.json = json;
    }

    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
     */
    public Optional<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> getCsv() {
        return Optional.ofNullable(this.csv);
    }
    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
     */
    public Optional<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> getJson() {
        return Optional.ofNullable(this.json);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv csv;
        private @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson json;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.json = defaults.json;
        }

        public Builder setCsv(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv csv) {
            this.csv = csv;
            return this;
        }

        public Builder setJson(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson json) {
            this.json = json;
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters(csv, json);
        }
    }
}
