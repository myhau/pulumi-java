// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetJobResult {
    private final JobConfigurationResponse configuration;
    private final String etag;
    private final JobReferenceResponse jobReference;
    private final String kind;
    private final String selfLink;
    private final JobStatisticsResponse statistics;
    private final JobStatusResponse status;
    private final String userEmail;

    @OutputCustomType.Constructor({"configuration","etag","jobReference","kind","selfLink","statistics","status","userEmail"})
    private GetJobResult(
        JobConfigurationResponse configuration,
        String etag,
        JobReferenceResponse jobReference,
        String kind,
        String selfLink,
        JobStatisticsResponse statistics,
        JobStatusResponse status,
        String userEmail) {
        this.configuration = Objects.requireNonNull(configuration);
        this.etag = Objects.requireNonNull(etag);
        this.jobReference = Objects.requireNonNull(jobReference);
        this.kind = Objects.requireNonNull(kind);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.statistics = Objects.requireNonNull(statistics);
        this.status = Objects.requireNonNull(status);
        this.userEmail = Objects.requireNonNull(userEmail);
    }

    public JobConfigurationResponse getConfiguration() {
        return this.configuration;
    }
    public String getEtag() {
        return this.etag;
    }
    public JobReferenceResponse getJobReference() {
        return this.jobReference;
    }
    public String getKind() {
        return this.kind;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public JobStatisticsResponse getStatistics() {
        return this.statistics;
    }
    public JobStatusResponse getStatus() {
        return this.status;
    }
    public String getUserEmail() {
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

        public Builder setConfiguration(JobConfigurationResponse configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setJobReference(JobReferenceResponse jobReference) {
            this.jobReference = Objects.requireNonNull(jobReference);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStatistics(JobStatisticsResponse statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }

        public Builder setStatus(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public GetJobResult build() {
            return new GetJobResult(configuration, etag, jobReference, kind, selfLink, statistics, status, userEmail);
        }
    }
}