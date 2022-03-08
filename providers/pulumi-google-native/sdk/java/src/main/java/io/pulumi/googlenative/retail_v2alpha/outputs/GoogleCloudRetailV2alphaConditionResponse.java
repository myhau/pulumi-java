// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaConditionQueryTermResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaConditionTimeRangeResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaConditionResponse {
    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    private final List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange;
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    private final List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms;

    @OutputCustomType.Constructor({"activeTimeRange","queryTerms"})
    private GoogleCloudRetailV2alphaConditionResponse(
        List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange,
        List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms) {
        this.activeTimeRange = activeTimeRange;
        this.queryTerms = queryTerms;
    }

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
    */
    public List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> getActiveTimeRange() {
        return this.activeTimeRange;
    }
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
    */
    public List<GoogleCloudRetailV2alphaConditionQueryTermResponse> getQueryTerms() {
        return this.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange;
        private List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeRange = defaults.activeTimeRange;
    	      this.queryTerms = defaults.queryTerms;
        }

        public Builder setActiveTimeRange(List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange) {
            this.activeTimeRange = Objects.requireNonNull(activeTimeRange);
            return this;
        }

        public Builder setQueryTerms(List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }
        public GoogleCloudRetailV2alphaConditionResponse build() {
            return new GoogleCloudRetailV2alphaConditionResponse(activeTimeRange, queryTerms);
        }
    }
}
