// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ClusteringResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DestinationTablePropertiesResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.HivePartitioningOptionsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ParquetOptionsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RangePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TimePartitioningResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobConfigurationLoadResponse {
    private final Boolean allowJaggedRows;
    private final Boolean allowQuotedNewlines;
    private final Boolean autodetect;
    private final ClusteringResponse clustering;
    private final String createDisposition;
    private final List<String> decimalTargetTypes;
    private final EncryptionConfigurationResponse destinationEncryptionConfiguration;
    private final TableReferenceResponse destinationTable;
    private final DestinationTablePropertiesResponse destinationTableProperties;
    private final String encoding;
    private final String fieldDelimiter;
    private final HivePartitioningOptionsResponse hivePartitioningOptions;
    private final Boolean ignoreUnknownValues;
    private final String jsonExtension;
    private final Integer maxBadRecords;
    private final String nullMarker;
    private final ParquetOptionsResponse parquetOptions;
    private final List<String> projectionFields;
    private final String quote;
    private final RangePartitioningResponse rangePartitioning;
    private final TableSchemaResponse schema;
    private final List<String> schemaUpdateOptions;
    private final Integer skipLeadingRows;
    private final String sourceFormat;
    private final List<String> sourceUris;
    private final TimePartitioningResponse timePartitioning;
    private final Boolean useAvroLogicalTypes;
    private final String writeDisposition;

    @OutputCustomType.Constructor({"allowJaggedRows","allowQuotedNewlines","autodetect","clustering","createDisposition","decimalTargetTypes","destinationEncryptionConfiguration","destinationTable","destinationTableProperties","encoding","fieldDelimiter","hivePartitioningOptions","ignoreUnknownValues","jsonExtension","maxBadRecords","nullMarker","parquetOptions","projectionFields","quote","rangePartitioning","schema","schemaUpdateOptions","skipLeadingRows","sourceFormat","sourceUris","timePartitioning","useAvroLogicalTypes","writeDisposition"})
    private JobConfigurationLoadResponse(
        Boolean allowJaggedRows,
        Boolean allowQuotedNewlines,
        Boolean autodetect,
        ClusteringResponse clustering,
        String createDisposition,
        List<String> decimalTargetTypes,
        EncryptionConfigurationResponse destinationEncryptionConfiguration,
        TableReferenceResponse destinationTable,
        DestinationTablePropertiesResponse destinationTableProperties,
        String encoding,
        String fieldDelimiter,
        HivePartitioningOptionsResponse hivePartitioningOptions,
        Boolean ignoreUnknownValues,
        String jsonExtension,
        Integer maxBadRecords,
        String nullMarker,
        ParquetOptionsResponse parquetOptions,
        List<String> projectionFields,
        String quote,
        RangePartitioningResponse rangePartitioning,
        TableSchemaResponse schema,
        List<String> schemaUpdateOptions,
        Integer skipLeadingRows,
        String sourceFormat,
        List<String> sourceUris,
        TimePartitioningResponse timePartitioning,
        Boolean useAvroLogicalTypes,
        String writeDisposition) {
        this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
        this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
        this.autodetect = Objects.requireNonNull(autodetect);
        this.clustering = Objects.requireNonNull(clustering);
        this.createDisposition = Objects.requireNonNull(createDisposition);
        this.decimalTargetTypes = Objects.requireNonNull(decimalTargetTypes);
        this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
        this.destinationTable = Objects.requireNonNull(destinationTable);
        this.destinationTableProperties = Objects.requireNonNull(destinationTableProperties);
        this.encoding = Objects.requireNonNull(encoding);
        this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
        this.hivePartitioningOptions = Objects.requireNonNull(hivePartitioningOptions);
        this.ignoreUnknownValues = Objects.requireNonNull(ignoreUnknownValues);
        this.jsonExtension = Objects.requireNonNull(jsonExtension);
        this.maxBadRecords = Objects.requireNonNull(maxBadRecords);
        this.nullMarker = Objects.requireNonNull(nullMarker);
        this.parquetOptions = Objects.requireNonNull(parquetOptions);
        this.projectionFields = Objects.requireNonNull(projectionFields);
        this.quote = Objects.requireNonNull(quote);
        this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
        this.schema = Objects.requireNonNull(schema);
        this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions);
        this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
        this.sourceFormat = Objects.requireNonNull(sourceFormat);
        this.sourceUris = Objects.requireNonNull(sourceUris);
        this.timePartitioning = Objects.requireNonNull(timePartitioning);
        this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
        this.writeDisposition = Objects.requireNonNull(writeDisposition);
    }

    public Boolean getAllowJaggedRows() {
        return this.allowJaggedRows;
    }
    public Boolean getAllowQuotedNewlines() {
        return this.allowQuotedNewlines;
    }
    public Boolean getAutodetect() {
        return this.autodetect;
    }
    public ClusteringResponse getClustering() {
        return this.clustering;
    }
    public String getCreateDisposition() {
        return this.createDisposition;
    }
    public List<String> getDecimalTargetTypes() {
        return this.decimalTargetTypes;
    }
    public EncryptionConfigurationResponse getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }
    public TableReferenceResponse getDestinationTable() {
        return this.destinationTable;
    }
    public DestinationTablePropertiesResponse getDestinationTableProperties() {
        return this.destinationTableProperties;
    }
    public String getEncoding() {
        return this.encoding;
    }
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }
    public HivePartitioningOptionsResponse getHivePartitioningOptions() {
        return this.hivePartitioningOptions;
    }
    public Boolean getIgnoreUnknownValues() {
        return this.ignoreUnknownValues;
    }
    public String getJsonExtension() {
        return this.jsonExtension;
    }
    public Integer getMaxBadRecords() {
        return this.maxBadRecords;
    }
    public String getNullMarker() {
        return this.nullMarker;
    }
    public ParquetOptionsResponse getParquetOptions() {
        return this.parquetOptions;
    }
    public List<String> getProjectionFields() {
        return this.projectionFields;
    }
    public String getQuote() {
        return this.quote;
    }
    public RangePartitioningResponse getRangePartitioning() {
        return this.rangePartitioning;
    }
    public TableSchemaResponse getSchema() {
        return this.schema;
    }
    public List<String> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions;
    }
    public Integer getSkipLeadingRows() {
        return this.skipLeadingRows;
    }
    public String getSourceFormat() {
        return this.sourceFormat;
    }
    public List<String> getSourceUris() {
        return this.sourceUris;
    }
    public TimePartitioningResponse getTimePartitioning() {
        return this.timePartitioning;
    }
    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }
    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationLoadResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowJaggedRows;
        private Boolean allowQuotedNewlines;
        private Boolean autodetect;
        private ClusteringResponse clustering;
        private String createDisposition;
        private List<String> decimalTargetTypes;
        private EncryptionConfigurationResponse destinationEncryptionConfiguration;
        private TableReferenceResponse destinationTable;
        private DestinationTablePropertiesResponse destinationTableProperties;
        private String encoding;
        private String fieldDelimiter;
        private HivePartitioningOptionsResponse hivePartitioningOptions;
        private Boolean ignoreUnknownValues;
        private String jsonExtension;
        private Integer maxBadRecords;
        private String nullMarker;
        private ParquetOptionsResponse parquetOptions;
        private List<String> projectionFields;
        private String quote;
        private RangePartitioningResponse rangePartitioning;
        private TableSchemaResponse schema;
        private List<String> schemaUpdateOptions;
        private Integer skipLeadingRows;
        private String sourceFormat;
        private List<String> sourceUris;
        private TimePartitioningResponse timePartitioning;
        private Boolean useAvroLogicalTypes;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationLoadResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.autodetect = defaults.autodetect;
    	      this.clustering = defaults.clustering;
    	      this.createDisposition = defaults.createDisposition;
    	      this.decimalTargetTypes = defaults.decimalTargetTypes;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.destinationTableProperties = defaults.destinationTableProperties;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.jsonExtension = defaults.jsonExtension;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.nullMarker = defaults.nullMarker;
    	      this.parquetOptions = defaults.parquetOptions;
    	      this.projectionFields = defaults.projectionFields;
    	      this.quote = defaults.quote;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setAllowJaggedRows(Boolean allowJaggedRows) {
            this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
            return this;
        }

        public Builder setAllowQuotedNewlines(Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
            return this;
        }

        public Builder setAutodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }

        public Builder setClustering(ClusteringResponse clustering) {
            this.clustering = Objects.requireNonNull(clustering);
            return this;
        }

        public Builder setCreateDisposition(String createDisposition) {
            this.createDisposition = Objects.requireNonNull(createDisposition);
            return this;
        }

        public Builder setDecimalTargetTypes(List<String> decimalTargetTypes) {
            this.decimalTargetTypes = Objects.requireNonNull(decimalTargetTypes);
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
            return this;
        }

        public Builder setDestinationTable(TableReferenceResponse destinationTable) {
            this.destinationTable = Objects.requireNonNull(destinationTable);
            return this;
        }

        public Builder setDestinationTableProperties(DestinationTablePropertiesResponse destinationTableProperties) {
            this.destinationTableProperties = Objects.requireNonNull(destinationTableProperties);
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setFieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }

        public Builder setHivePartitioningOptions(HivePartitioningOptionsResponse hivePartitioningOptions) {
            this.hivePartitioningOptions = Objects.requireNonNull(hivePartitioningOptions);
            return this;
        }

        public Builder setIgnoreUnknownValues(Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Objects.requireNonNull(ignoreUnknownValues);
            return this;
        }

        public Builder setJsonExtension(String jsonExtension) {
            this.jsonExtension = Objects.requireNonNull(jsonExtension);
            return this;
        }

        public Builder setMaxBadRecords(Integer maxBadRecords) {
            this.maxBadRecords = Objects.requireNonNull(maxBadRecords);
            return this;
        }

        public Builder setNullMarker(String nullMarker) {
            this.nullMarker = Objects.requireNonNull(nullMarker);
            return this;
        }

        public Builder setParquetOptions(ParquetOptionsResponse parquetOptions) {
            this.parquetOptions = Objects.requireNonNull(parquetOptions);
            return this;
        }

        public Builder setProjectionFields(List<String> projectionFields) {
            this.projectionFields = Objects.requireNonNull(projectionFields);
            return this;
        }

        public Builder setQuote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder setRangePartitioning(RangePartitioningResponse rangePartitioning) {
            this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
            return this;
        }

        public Builder setSchema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchemaUpdateOptions(List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions);
            return this;
        }

        public Builder setSkipLeadingRows(Integer skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }

        public Builder setSourceFormat(String sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }

        public Builder setSourceUris(List<String> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }

        public Builder setTimePartitioning(TimePartitioningResponse timePartitioning) {
            this.timePartitioning = Objects.requireNonNull(timePartitioning);
            return this;
        }

        public Builder setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }

        public Builder setWriteDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }

        public JobConfigurationLoadResponse build() {
            return new JobConfigurationLoadResponse(allowJaggedRows, allowQuotedNewlines, autodetect, clustering, createDisposition, decimalTargetTypes, destinationEncryptionConfiguration, destinationTable, destinationTableProperties, encoding, fieldDelimiter, hivePartitioningOptions, ignoreUnknownValues, jsonExtension, maxBadRecords, nullMarker, parquetOptions, projectionFields, quote, rangePartitioning, schema, schemaUpdateOptions, skipLeadingRows, sourceFormat, sourceUris, timePartitioning, useAvroLogicalTypes, writeDisposition);
        }
    }
}