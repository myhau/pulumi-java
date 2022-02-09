// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CacheConfigurationResponse {
    private final @Nullable String cacheDuration;
    private final @Nullable String dynamicCompression;
    private final @Nullable String queryParameterStripDirective;
    private final @Nullable String queryParameters;

    @OutputCustomType.Constructor({"cacheDuration","dynamicCompression","queryParameterStripDirective","queryParameters"})
    private CacheConfigurationResponse(
        @Nullable String cacheDuration,
        @Nullable String dynamicCompression,
        @Nullable String queryParameterStripDirective,
        @Nullable String queryParameters) {
        this.cacheDuration = cacheDuration;
        this.dynamicCompression = dynamicCompression;
        this.queryParameterStripDirective = queryParameterStripDirective;
        this.queryParameters = queryParameters;
    }

    public Optional<String> getCacheDuration() {
        return Optional.ofNullable(this.cacheDuration);
    }
    public Optional<String> getDynamicCompression() {
        return Optional.ofNullable(this.dynamicCompression);
    }
    public Optional<String> getQueryParameterStripDirective() {
        return Optional.ofNullable(this.queryParameterStripDirective);
    }
    public Optional<String> getQueryParameters() {
        return Optional.ofNullable(this.queryParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cacheDuration;
        private @Nullable String dynamicCompression;
        private @Nullable String queryParameterStripDirective;
        private @Nullable String queryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.dynamicCompression = defaults.dynamicCompression;
    	      this.queryParameterStripDirective = defaults.queryParameterStripDirective;
    	      this.queryParameters = defaults.queryParameters;
        }

        public Builder setCacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }

        public Builder setDynamicCompression(@Nullable String dynamicCompression) {
            this.dynamicCompression = dynamicCompression;
            return this;
        }

        public Builder setQueryParameterStripDirective(@Nullable String queryParameterStripDirective) {
            this.queryParameterStripDirective = queryParameterStripDirective;
            return this;
        }

        public Builder setQueryParameters(@Nullable String queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public CacheConfigurationResponse build() {
            return new CacheConfigurationResponse(cacheDuration, dynamicCompression, queryParameterStripDirective, queryParameters);
        }
    }
}