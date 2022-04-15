// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RetryPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetryPolicyResponse Empty = new RetryPolicyResponse();

    /**
     * Gets or sets the number of times a retry should be attempted.
     * 
     */
    @Import(name="retryCount")
      private final @Nullable Integer retryCount;

    public Optional<Integer> retryCount() {
        return this.retryCount == null ? Optional.empty() : Optional.ofNullable(this.retryCount);
    }

    /**
     * Gets or sets the retry interval between retries, specify duration in ISO 8601 format.
     * 
     */
    @Import(name="retryInterval")
      private final @Nullable String retryInterval;

    public Optional<String> retryInterval() {
        return this.retryInterval == null ? Optional.empty() : Optional.ofNullable(this.retryInterval);
    }

    /**
     * Gets or sets the retry strategy to be used.
     * 
     */
    @Import(name="retryType")
      private final @Nullable String retryType;

    public Optional<String> retryType() {
        return this.retryType == null ? Optional.empty() : Optional.ofNullable(this.retryType);
    }

    public RetryPolicyResponse(
        @Nullable Integer retryCount,
        @Nullable String retryInterval,
        @Nullable String retryType) {
        this.retryCount = retryCount;
        this.retryInterval = retryInterval;
        this.retryType = retryType;
    }

    private RetryPolicyResponse() {
        this.retryCount = null;
        this.retryInterval = null;
        this.retryType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer retryCount;
        private @Nullable String retryInterval;
        private @Nullable String retryType;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retryCount = defaults.retryCount;
    	      this.retryInterval = defaults.retryInterval;
    	      this.retryType = defaults.retryType;
        }

        public Builder retryCount(@Nullable Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Builder retryInterval(@Nullable String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Builder retryType(@Nullable String retryType) {
            this.retryType = retryType;
            return this;
        }        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(retryCount, retryInterval, retryType);
        }
    }
}
