// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationTokenArgs Empty = new GetAuthorizationTokenArgs();

    /**
     * The name of the domain that is in scope for the generated authorization token.
     * 
     */
    @InputImport(name="domain", required=true)
      private final String domain;

    public String getDomain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @InputImport(name="domainOwner")
      private final @Nullable String domainOwner;

    public Optional<String> getDomainOwner() {
        return this.domainOwner == null ? Optional.empty() : Optional.ofNullable(this.domainOwner);
    }

    /**
     * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     * 
     */
    @InputImport(name="durationSeconds")
      private final @Nullable Integer durationSeconds;

    public Optional<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationSeconds);
    }

    public GetAuthorizationTokenArgs(
        String domain,
        @Nullable String domainOwner,
        @Nullable Integer durationSeconds) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.domainOwner = domainOwner;
        this.durationSeconds = durationSeconds;
    }

    private GetAuthorizationTokenArgs() {
        this.domain = null;
        this.domainOwner = null;
        this.durationSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private @Nullable String domainOwner;
        private @Nullable Integer durationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.durationSeconds = defaults.durationSeconds;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomainOwner(@Nullable String domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }

        public Builder setDurationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public GetAuthorizationTokenArgs build() {
            return new GetAuthorizationTokenArgs(domain, domainOwner, durationSeconds);
        }
    }
}
