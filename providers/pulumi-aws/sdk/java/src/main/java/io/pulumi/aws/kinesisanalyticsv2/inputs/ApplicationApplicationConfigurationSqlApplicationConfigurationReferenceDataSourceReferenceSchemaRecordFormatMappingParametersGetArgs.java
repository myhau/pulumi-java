// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs();

    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
     */
    @InputImport(name="csvMappingParameters")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> getCsvMappingParameters() {
        return this.csvMappingParameters == null ? Input.empty() : this.csvMappingParameters;
    }

    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
     */
    @InputImport(name="jsonMappingParameters")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> getJsonMappingParameters() {
        return this.jsonMappingParameters == null ? Input.empty() : this.jsonMappingParameters;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs(
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters) {
        this.csvMappingParameters = csvMappingParameters;
        this.jsonMappingParameters = jsonMappingParameters;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs() {
        this.csvMappingParameters = Input.empty();
        this.jsonMappingParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvMappingParameters = defaults.csvMappingParameters;
    	      this.jsonMappingParameters = defaults.jsonMappingParameters;
        }

        public Builder setCsvMappingParameters(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters) {
            this.csvMappingParameters = csvMappingParameters;
            return this;
        }

        public Builder setCsvMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs csvMappingParameters) {
            this.csvMappingParameters = Input.ofNullable(csvMappingParameters);
            return this;
        }

        public Builder setJsonMappingParameters(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters) {
            this.jsonMappingParameters = jsonMappingParameters;
            return this;
        }

        public Builder setJsonMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs jsonMappingParameters) {
            this.jsonMappingParameters = Input.ofNullable(jsonMappingParameters);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs(csvMappingParameters, jsonMappingParameters);
        }
    }
}
