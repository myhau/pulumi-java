// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.analyticshub.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BigQueryDatasetSourceResponse {
    /**
     * @return Resource name of the dataset source for this listing. e.g. `projects/myproject/datasets/123`
     * 
     */
    private final String dataset;

    @CustomType.Constructor
    private BigQueryDatasetSourceResponse(@CustomType.Parameter("dataset") String dataset) {
        this.dataset = dataset;
    }

    /**
     * @return Resource name of the dataset source for this listing. e.g. `projects/myproject/datasets/123`
     * 
     */
    public String dataset() {
        return this.dataset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryDatasetSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataset;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryDatasetSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
        }

        public Builder dataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }        public BigQueryDatasetSourceResponse build() {
            return new BigQueryDatasetSourceResponse(dataset);
        }
    }
}
