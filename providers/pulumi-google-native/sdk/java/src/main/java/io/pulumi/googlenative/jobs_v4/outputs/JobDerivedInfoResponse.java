// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v4.outputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobDerivedInfoResponse {
    /**
     * Job categories derived from Job.title and Job.description.
     * 
     */
    private final List<String> jobCategories;
    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
     */
    private final List<LocationResponse> locations;

    @OutputCustomType.Constructor
    private JobDerivedInfoResponse(
        @OutputCustomType.Parameter("jobCategories") List<String> jobCategories,
        @OutputCustomType.Parameter("locations") List<LocationResponse> locations) {
        this.jobCategories = jobCategories;
        this.locations = locations;
    }

    /**
     * Job categories derived from Job.title and Job.description.
     * 
    */
    public List<String> getJobCategories() {
        return this.jobCategories;
    }
    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
    */
    public List<LocationResponse> getLocations() {
        return this.locations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jobCategories;
        private List<LocationResponse> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDerivedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCategories = defaults.jobCategories;
    	      this.locations = defaults.locations;
        }

        public Builder setJobCategories(List<String> jobCategories) {
            this.jobCategories = Objects.requireNonNull(jobCategories);
            return this;
        }

        public Builder setLocations(List<LocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public JobDerivedInfoResponse build() {
            return new JobDerivedInfoResponse(jobCategories, locations);
        }
    }
}
