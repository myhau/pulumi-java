// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaRecordFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaRecordFormatArgs Empty = new AnalyticsApplicationInputsSchemaRecordFormatArgs();

    /**
     * The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    @InputImport(name="mappingParameters")
      private final @Nullable Input<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs> mappingParameters;

    public Input<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs> getMappingParameters() {
        return this.mappingParameters == null ? Input.empty() : this.mappingParameters;
    }

    /**
     * The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    @InputImport(name="recordFormatType")
      private final @Nullable Input<String> recordFormatType;

    public Input<String> getRecordFormatType() {
        return this.recordFormatType == null ? Input.empty() : this.recordFormatType;
    }

    public AnalyticsApplicationInputsSchemaRecordFormatArgs(
        @Nullable Input<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs> mappingParameters,
        @Nullable Input<String> recordFormatType) {
        this.mappingParameters = mappingParameters;
        this.recordFormatType = recordFormatType;
    }

    private AnalyticsApplicationInputsSchemaRecordFormatArgs() {
        this.mappingParameters = Input.empty();
        this.recordFormatType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs> mappingParameters;
        private @Nullable Input<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder setMappingParameters(@Nullable Input<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs> mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }

        public Builder setMappingParameters(@Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs mappingParameters) {
            this.mappingParameters = Input.ofNullable(mappingParameters);
            return this;
        }

        public Builder setRecordFormatType(@Nullable Input<String> recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }

        public Builder setRecordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = Input.ofNullable(recordFormatType);
            return this;
        }
        public AnalyticsApplicationInputsSchemaRecordFormatArgs build() {
            return new AnalyticsApplicationInputsSchemaRecordFormatArgs(mappingParameters, recordFormatType);
        }
    }
}
