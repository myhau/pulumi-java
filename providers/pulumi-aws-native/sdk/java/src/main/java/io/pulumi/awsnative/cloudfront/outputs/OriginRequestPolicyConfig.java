// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyCookiesConfig;
import io.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyHeadersConfig;
import io.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyQueryStringsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginRequestPolicyConfig {
    private final @Nullable String comment;
    private final OriginRequestPolicyCookiesConfig cookiesConfig;
    private final OriginRequestPolicyHeadersConfig headersConfig;
    private final String name;
    private final OriginRequestPolicyQueryStringsConfig queryStringsConfig;

    @OutputCustomType.Constructor({"comment","cookiesConfig","headersConfig","name","queryStringsConfig"})
    private OriginRequestPolicyConfig(
        @Nullable String comment,
        OriginRequestPolicyCookiesConfig cookiesConfig,
        OriginRequestPolicyHeadersConfig headersConfig,
        String name,
        OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
        this.comment = comment;
        this.cookiesConfig = cookiesConfig;
        this.headersConfig = headersConfig;
        this.name = name;
        this.queryStringsConfig = queryStringsConfig;
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public OriginRequestPolicyCookiesConfig getCookiesConfig() {
        return this.cookiesConfig;
    }
    public OriginRequestPolicyHeadersConfig getHeadersConfig() {
        return this.headersConfig;
    }
    public String getName() {
        return this.name;
    }
    public OriginRequestPolicyQueryStringsConfig getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private OriginRequestPolicyCookiesConfig cookiesConfig;
        private OriginRequestPolicyHeadersConfig headersConfig;
        private String name;
        private OriginRequestPolicyQueryStringsConfig queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.headersConfig = defaults.headersConfig;
    	      this.name = defaults.name;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCookiesConfig(OriginRequestPolicyCookiesConfig cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder setHeadersConfig(OriginRequestPolicyHeadersConfig headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQueryStringsConfig(OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }
        public OriginRequestPolicyConfig build() {
            return new OriginRequestPolicyConfig(comment, cookiesConfig, headersConfig, name, queryStringsConfig);
        }
    }
}
