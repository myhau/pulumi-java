// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class PrestoJobResponse {
    private final List<String> clientTags;
    private final Boolean continueOnFailure;
    private final LoggingConfigResponse loggingConfig;
    private final String outputFormat;
    private final Map<String,String> properties;
    private final String queryFileUri;
    private final QueryListResponse queryList;

    @OutputCustomType.Constructor({"clientTags","continueOnFailure","loggingConfig","outputFormat","properties","queryFileUri","queryList"})
    private PrestoJobResponse(
        List<String> clientTags,
        Boolean continueOnFailure,
        LoggingConfigResponse loggingConfig,
        String outputFormat,
        Map<String,String> properties,
        String queryFileUri,
        QueryListResponse queryList) {
        this.clientTags = Objects.requireNonNull(clientTags);
        this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.outputFormat = Objects.requireNonNull(outputFormat);
        this.properties = Objects.requireNonNull(properties);
        this.queryFileUri = Objects.requireNonNull(queryFileUri);
        this.queryList = Objects.requireNonNull(queryList);
    }

    public List<String> getClientTags() {
        return this.clientTags;
    }
    public Boolean getContinueOnFailure() {
        return this.continueOnFailure;
    }
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }
    public Map<String,String> getProperties() {
        return this.properties;
    }
    public String getQueryFileUri() {
        return this.queryFileUri;
    }
    public QueryListResponse getQueryList() {
        return this.queryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> clientTags;
        private Boolean continueOnFailure;
        private LoggingConfigResponse loggingConfig;
        private String outputFormat;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder setClientTags(List<String> clientTags) {
            this.clientTags = Objects.requireNonNull(clientTags);
            return this;
        }

        public Builder setContinueOnFailure(Boolean continueOnFailure) {
            this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
            return this;
        }

        public Builder setLoggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setOutputFormat(String outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryList(QueryListResponse queryList) {
            this.queryList = Objects.requireNonNull(queryList);
            return this;
        }

        public PrestoJobResponse build() {
            return new PrestoJobResponse(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}