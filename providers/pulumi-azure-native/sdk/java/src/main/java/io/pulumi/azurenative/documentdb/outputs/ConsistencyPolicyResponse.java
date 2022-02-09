// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConsistencyPolicyResponse {
    private final String defaultConsistencyLevel;
    private final @Nullable Integer maxIntervalInSeconds;
    private final @Nullable Double maxStalenessPrefix;

    @OutputCustomType.Constructor({"defaultConsistencyLevel","maxIntervalInSeconds","maxStalenessPrefix"})
    private ConsistencyPolicyResponse(
        String defaultConsistencyLevel,
        @Nullable Integer maxIntervalInSeconds,
        @Nullable Double maxStalenessPrefix) {
        this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel);
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        this.maxStalenessPrefix = maxStalenessPrefix;
    }

    public String getDefaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }
    public Optional<Integer> getMaxIntervalInSeconds() {
        return Optional.ofNullable(this.maxIntervalInSeconds);
    }
    public Optional<Double> getMaxStalenessPrefix() {
        return Optional.ofNullable(this.maxStalenessPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistencyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultConsistencyLevel;
        private @Nullable Integer maxIntervalInSeconds;
        private @Nullable Double maxStalenessPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistencyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsistencyLevel = defaults.defaultConsistencyLevel;
    	      this.maxIntervalInSeconds = defaults.maxIntervalInSeconds;
    	      this.maxStalenessPrefix = defaults.maxStalenessPrefix;
        }

        public Builder setDefaultConsistencyLevel(String defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel);
            return this;
        }

        public Builder setMaxIntervalInSeconds(@Nullable Integer maxIntervalInSeconds) {
            this.maxIntervalInSeconds = maxIntervalInSeconds;
            return this;
        }

        public Builder setMaxStalenessPrefix(@Nullable Double maxStalenessPrefix) {
            this.maxStalenessPrefix = maxStalenessPrefix;
            return this;
        }

        public ConsistencyPolicyResponse build() {
            return new ConsistencyPolicyResponse(defaultConsistencyLevel, maxIntervalInSeconds, maxStalenessPrefix);
        }
    }
}