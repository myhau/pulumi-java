// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RetryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetryConfigResponse Empty = new RetryConfigResponse();

    @InputImport(name="maxBackoffDuration", required=true)
    private final String maxBackoffDuration;

    public String getMaxBackoffDuration() {
        return this.maxBackoffDuration;
    }

    @InputImport(name="maxDoublings", required=true)
    private final Integer maxDoublings;

    public Integer getMaxDoublings() {
        return this.maxDoublings;
    }

    @InputImport(name="maxRetryDuration", required=true)
    private final String maxRetryDuration;

    public String getMaxRetryDuration() {
        return this.maxRetryDuration;
    }

    @InputImport(name="minBackoffDuration", required=true)
    private final String minBackoffDuration;

    public String getMinBackoffDuration() {
        return this.minBackoffDuration;
    }

    @InputImport(name="retryCount", required=true)
    private final Integer retryCount;

    public Integer getRetryCount() {
        return this.retryCount;
    }

    public RetryConfigResponse(
        String maxBackoffDuration,
        Integer maxDoublings,
        String maxRetryDuration,
        String minBackoffDuration,
        Integer retryCount) {
        this.maxBackoffDuration = Objects.requireNonNull(maxBackoffDuration, "expected parameter 'maxBackoffDuration' to be non-null");
        this.maxDoublings = Objects.requireNonNull(maxDoublings, "expected parameter 'maxDoublings' to be non-null");
        this.maxRetryDuration = Objects.requireNonNull(maxRetryDuration, "expected parameter 'maxRetryDuration' to be non-null");
        this.minBackoffDuration = Objects.requireNonNull(minBackoffDuration, "expected parameter 'minBackoffDuration' to be non-null");
        this.retryCount = Objects.requireNonNull(retryCount, "expected parameter 'retryCount' to be non-null");
    }

    private RetryConfigResponse() {
        this.maxBackoffDuration = null;
        this.maxDoublings = null;
        this.maxRetryDuration = null;
        this.minBackoffDuration = null;
        this.retryCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxBackoffDuration;
        private Integer maxDoublings;
        private String maxRetryDuration;
        private String minBackoffDuration;
        private Integer retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder setMaxBackoffDuration(String maxBackoffDuration) {
            this.maxBackoffDuration = Objects.requireNonNull(maxBackoffDuration);
            return this;
        }

        public Builder setMaxDoublings(Integer maxDoublings) {
            this.maxDoublings = Objects.requireNonNull(maxDoublings);
            return this;
        }

        public Builder setMaxRetryDuration(String maxRetryDuration) {
            this.maxRetryDuration = Objects.requireNonNull(maxRetryDuration);
            return this;
        }

        public Builder setMinBackoffDuration(String minBackoffDuration) {
            this.minBackoffDuration = Objects.requireNonNull(minBackoffDuration);
            return this;
        }

        public Builder setRetryCount(Integer retryCount) {
            this.retryCount = Objects.requireNonNull(retryCount);
            return this;
        }

        public RetryConfigResponse build() {
            return new RetryConfigResponse(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}