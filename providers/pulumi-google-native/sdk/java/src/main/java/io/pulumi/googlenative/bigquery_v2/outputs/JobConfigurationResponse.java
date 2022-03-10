// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationExtractResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationLoadResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationQueryResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationTableCopyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class JobConfigurationResponse {
    /**
     * [Pick one] Copies a table.
     * 
     */
    private final JobConfigurationTableCopyResponse copy;
    /**
     * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
     * 
     */
    private final Boolean dryRun;
    /**
     * [Pick one] Configures an extract job.
     * 
     */
    private final JobConfigurationExtractResponse extract;
    /**
     * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    private final String jobTimeoutMs;
    /**
     * The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.
     * 
     */
    private final String jobType;
    /**
     * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    private final Map<String,String> labels;
    /**
     * [Pick one] Configures a load job.
     * 
     */
    private final JobConfigurationLoadResponse load;
    /**
     * [Pick one] Configures a query job.
     * 
     */
    private final JobConfigurationQueryResponse query;

    @OutputCustomType.Constructor
    private JobConfigurationResponse(
        @OutputCustomType.Parameter("copy") JobConfigurationTableCopyResponse copy,
        @OutputCustomType.Parameter("dryRun") Boolean dryRun,
        @OutputCustomType.Parameter("extract") JobConfigurationExtractResponse extract,
        @OutputCustomType.Parameter("jobTimeoutMs") String jobTimeoutMs,
        @OutputCustomType.Parameter("jobType") String jobType,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("load") JobConfigurationLoadResponse load,
        @OutputCustomType.Parameter("query") JobConfigurationQueryResponse query) {
        this.copy = copy;
        this.dryRun = dryRun;
        this.extract = extract;
        this.jobTimeoutMs = jobTimeoutMs;
        this.jobType = jobType;
        this.labels = labels;
        this.load = load;
        this.query = query;
    }

    /**
     * [Pick one] Copies a table.
     * 
    */
    public JobConfigurationTableCopyResponse getCopy() {
        return this.copy;
    }
    /**
     * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
     * 
    */
    public Boolean getDryRun() {
        return this.dryRun;
    }
    /**
     * [Pick one] Configures an extract job.
     * 
    */
    public JobConfigurationExtractResponse getExtract() {
        return this.extract;
    }
    /**
     * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
    */
    public String getJobTimeoutMs() {
        return this.jobTimeoutMs;
    }
    /**
     * The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.
     * 
    */
    public String getJobType() {
        return this.jobType;
    }
    /**
     * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * [Pick one] Configures a load job.
     * 
    */
    public JobConfigurationLoadResponse getLoad() {
        return this.load;
    }
    /**
     * [Pick one] Configures a query job.
     * 
    */
    public JobConfigurationQueryResponse getQuery() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationTableCopyResponse copy;
        private Boolean dryRun;
        private JobConfigurationExtractResponse extract;
        private String jobTimeoutMs;
        private String jobType;
        private Map<String,String> labels;
        private JobConfigurationLoadResponse load;
        private JobConfigurationQueryResponse query;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.dryRun = defaults.dryRun;
    	      this.extract = defaults.extract;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.jobType = defaults.jobType;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.query = defaults.query;
        }

        public Builder setCopy(JobConfigurationTableCopyResponse copy) {
            this.copy = Objects.requireNonNull(copy);
            return this;
        }

        public Builder setDryRun(Boolean dryRun) {
            this.dryRun = Objects.requireNonNull(dryRun);
            return this;
        }

        public Builder setExtract(JobConfigurationExtractResponse extract) {
            this.extract = Objects.requireNonNull(extract);
            return this;
        }

        public Builder setJobTimeoutMs(String jobTimeoutMs) {
            this.jobTimeoutMs = Objects.requireNonNull(jobTimeoutMs);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLoad(JobConfigurationLoadResponse load) {
            this.load = Objects.requireNonNull(load);
            return this;
        }

        public Builder setQuery(JobConfigurationQueryResponse query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public JobConfigurationResponse build() {
            return new JobConfigurationResponse(copy, dryRun, extract, jobTimeoutMs, jobType, labels, load, query);
        }
    }
}
