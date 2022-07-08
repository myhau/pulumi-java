// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery.v2.inputs.ModelReferenceArgs;
import com.pulumi.googlenative.bigquery.v2.inputs.TableReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobConfigurationExtractArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConfigurationExtractArgs Empty = new JobConfigurationExtractArgs();

    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<String> compression;

    /**
     * @return [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    public Optional<Output<String>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    @Import(name="destinationFormat")
    private @Nullable Output<String> destinationFormat;

    /**
     * @return [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    public Optional<Output<String>> destinationFormat() {
        return Optional.ofNullable(this.destinationFormat);
    }

    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    @Import(name="destinationUri")
    private @Nullable Output<String> destinationUri;

    /**
     * @return [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    public Optional<Output<String>> destinationUri() {
        return Optional.ofNullable(this.destinationUri);
    }

    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @Import(name="destinationUris")
    private @Nullable Output<List<String>> destinationUris;

    /**
     * @return [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    public Optional<Output<List<String>>> destinationUris() {
        return Optional.ofNullable(this.destinationUris);
    }

    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is &#39;,&#39;. Not applicable when extracting models.
     * 
     */
    @Import(name="fieldDelimiter")
    private @Nullable Output<String> fieldDelimiter;

    /**
     * @return [Optional] Delimiter to use between fields in the exported data. Default is &#39;,&#39;. Not applicable when extracting models.
     * 
     */
    public Optional<Output<String>> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    @Import(name="printHeader")
    private @Nullable Output<Boolean> printHeader;

    /**
     * @return [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    public Optional<Output<Boolean>> printHeader() {
        return Optional.ofNullable(this.printHeader);
    }

    /**
     * A reference to the model being exported.
     * 
     */
    @Import(name="sourceModel")
    private @Nullable Output<ModelReferenceArgs> sourceModel;

    /**
     * @return A reference to the model being exported.
     * 
     */
    public Optional<Output<ModelReferenceArgs>> sourceModel() {
        return Optional.ofNullable(this.sourceModel);
    }

    /**
     * A reference to the table being exported.
     * 
     */
    @Import(name="sourceTable")
    private @Nullable Output<TableReferenceArgs> sourceTable;

    /**
     * @return A reference to the table being exported.
     * 
     */
    public Optional<Output<TableReferenceArgs>> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }

    /**
     * [Optional] If destinationFormat is set to &#34;AVRO&#34;, this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    @Import(name="useAvroLogicalTypes")
    private @Nullable Output<Boolean> useAvroLogicalTypes;

    /**
     * @return [Optional] If destinationFormat is set to &#34;AVRO&#34;, this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    public Optional<Output<Boolean>> useAvroLogicalTypes() {
        return Optional.ofNullable(this.useAvroLogicalTypes);
    }

    private JobConfigurationExtractArgs() {}

    private JobConfigurationExtractArgs(JobConfigurationExtractArgs $) {
        this.compression = $.compression;
        this.destinationFormat = $.destinationFormat;
        this.destinationUri = $.destinationUri;
        this.destinationUris = $.destinationUris;
        this.fieldDelimiter = $.fieldDelimiter;
        this.printHeader = $.printHeader;
        this.sourceModel = $.sourceModel;
        this.sourceTable = $.sourceTable;
        this.useAvroLogicalTypes = $.useAvroLogicalTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigurationExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationExtractArgs $;

        public Builder() {
            $ = new JobConfigurationExtractArgs();
        }

        public Builder(JobConfigurationExtractArgs defaults) {
            $ = new JobConfigurationExtractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compression [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<String> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param destinationFormat [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
         * 
         * @return builder
         * 
         */
        public Builder destinationFormat(@Nullable Output<String> destinationFormat) {
            $.destinationFormat = destinationFormat;
            return this;
        }

        /**
         * @param destinationFormat [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
         * 
         * @return builder
         * 
         */
        public Builder destinationFormat(String destinationFormat) {
            return destinationFormat(Output.of(destinationFormat));
        }

        /**
         * @param destinationUri [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
         * 
         * @return builder
         * 
         */
        public Builder destinationUri(@Nullable Output<String> destinationUri) {
            $.destinationUri = destinationUri;
            return this;
        }

        /**
         * @param destinationUri [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
         * 
         * @return builder
         * 
         */
        public Builder destinationUri(String destinationUri) {
            return destinationUri(Output.of(destinationUri));
        }

        /**
         * @param destinationUris [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
         * 
         * @return builder
         * 
         */
        public Builder destinationUris(@Nullable Output<List<String>> destinationUris) {
            $.destinationUris = destinationUris;
            return this;
        }

        /**
         * @param destinationUris [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
         * 
         * @return builder
         * 
         */
        public Builder destinationUris(List<String> destinationUris) {
            return destinationUris(Output.of(destinationUris));
        }

        /**
         * @param destinationUris [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
         * 
         * @return builder
         * 
         */
        public Builder destinationUris(String... destinationUris) {
            return destinationUris(List.of(destinationUris));
        }

        /**
         * @param fieldDelimiter [Optional] Delimiter to use between fields in the exported data. Default is &#39;,&#39;. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            $.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * @param fieldDelimiter [Optional] Delimiter to use between fields in the exported data. Default is &#39;,&#39;. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            return fieldDelimiter(Output.of(fieldDelimiter));
        }

        /**
         * @param printHeader [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder printHeader(@Nullable Output<Boolean> printHeader) {
            $.printHeader = printHeader;
            return this;
        }

        /**
         * @param printHeader [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder printHeader(Boolean printHeader) {
            return printHeader(Output.of(printHeader));
        }

        /**
         * @param sourceModel A reference to the model being exported.
         * 
         * @return builder
         * 
         */
        public Builder sourceModel(@Nullable Output<ModelReferenceArgs> sourceModel) {
            $.sourceModel = sourceModel;
            return this;
        }

        /**
         * @param sourceModel A reference to the model being exported.
         * 
         * @return builder
         * 
         */
        public Builder sourceModel(ModelReferenceArgs sourceModel) {
            return sourceModel(Output.of(sourceModel));
        }

        /**
         * @param sourceTable A reference to the table being exported.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(@Nullable Output<TableReferenceArgs> sourceTable) {
            $.sourceTable = sourceTable;
            return this;
        }

        /**
         * @param sourceTable A reference to the table being exported.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(TableReferenceArgs sourceTable) {
            return sourceTable(Output.of(sourceTable));
        }

        /**
         * @param useAvroLogicalTypes [Optional] If destinationFormat is set to &#34;AVRO&#34;, this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder useAvroLogicalTypes(@Nullable Output<Boolean> useAvroLogicalTypes) {
            $.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }

        /**
         * @param useAvroLogicalTypes [Optional] If destinationFormat is set to &#34;AVRO&#34;, this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
         * 
         * @return builder
         * 
         */
        public Builder useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            return useAvroLogicalTypes(Output.of(useAvroLogicalTypes));
        }

        public JobConfigurationExtractArgs build() {
            return $;
        }
    }

}
