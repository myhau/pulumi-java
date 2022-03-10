// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters {
    /**
     * The path to the top-level parent that contains the records.
     * 
     */
    private final String recordRowPath;

    @OutputCustomType.Constructor({"recordRowPath"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters(String recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    /**
     * The path to the top-level parent that contains the records.
     * 
    */
    public String getRecordRowPath() {
        return this.recordRowPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder setRecordRowPath(String recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters(recordRowPath);
        }
    }
}