// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery.v2.outputs.JobConfigurationResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.JobReferenceResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.JobStatisticsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.JobStatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return [Required] Describes the job configuration.
     * 
     */
    private final JobConfigurationResponse configuration;
    /**
     * @return A hash of this resource.
     * 
     */
    private final String etag;
    /**
     * @return [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    private final JobReferenceResponse jobReference;
    /**
     * @return The type of the resource.
     * 
     */
    private final String kind;
    /**
     * @return A URL that can be used to access this resource again.
     * 
     */
    private final String selfLink;
    /**
     * @return Information about the job, including starting time and ending time of the job.
     * 
     */
    private final JobStatisticsResponse statistics;
    /**
     * @return The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    private final JobStatusResponse status;
    /**
     * @return Email address of the user who ran the job.
     * 
     */
    private final String userEmail;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("configuration") JobConfigurationResponse configuration,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("jobReference") JobReferenceResponse jobReference,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("statistics") JobStatisticsResponse statistics,
        @CustomType.Parameter("status") JobStatusResponse status,
        @CustomType.Parameter("userEmail") String userEmail) {
        this.configuration = configuration;
        this.etag = etag;
        this.jobReference = jobReference;
        this.kind = kind;
        this.selfLink = selfLink;
        this.statistics = statistics;
        this.status = status;
        this.userEmail = userEmail;
    }

    /**
     * @return [Required] Describes the job configuration.
     * 
     */
    public JobConfigurationResponse configuration() {
        return this.configuration;
    }
    /**
     * @return A hash of this resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    public JobReferenceResponse jobReference() {
        return this.jobReference;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A URL that can be used to access this resource again.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Information about the job, including starting time and ending time of the job.
     * 
     */
    public JobStatisticsResponse statistics() {
        return this.statistics;
    }
    /**
     * @return The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    public JobStatusResponse status() {
        return this.status;
    }
    /**
     * @return Email address of the user who ran the job.
     * 
     */
    public String userEmail() {
        return this.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationResponse configuration;
        private String etag;
        private JobReferenceResponse jobReference;
        private String kind;
        private String selfLink;
        private JobStatisticsResponse statistics;
        private JobStatusResponse status;
        private String userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.etag = defaults.etag;
    	      this.jobReference = defaults.jobReference;
    	      this.kind = defaults.kind;
    	      this.selfLink = defaults.selfLink;
    	      this.statistics = defaults.statistics;
    	      this.status = defaults.status;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder configuration(JobConfigurationResponse configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder jobReference(JobReferenceResponse jobReference) {
            this.jobReference = Objects.requireNonNull(jobReference);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder statistics(JobStatisticsResponse statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        public Builder status(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder userEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(configuration, etag, jobReference, kind, selfLink, statistics, status, userEmail);
        }
    }
}
