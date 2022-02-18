// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceCdnPolicyCacheKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyCacheKeyPolicyArgs Empty = new BackendServiceCdnPolicyCacheKeyPolicyArgs();

    /**
     * If true requests to different hosts will be cached separately.
     * 
     */
    @InputImport(name="includeHost")
    private final @Nullable Input<Boolean> includeHost;

    public Input<Boolean> getIncludeHost() {
        return this.includeHost == null ? Input.empty() : this.includeHost;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @InputImport(name="includeProtocol")
    private final @Nullable Input<Boolean> includeProtocol;

    public Input<Boolean> getIncludeProtocol() {
        return this.includeProtocol == null ? Input.empty() : this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
     */
    @InputImport(name="includeQueryString")
    private final @Nullable Input<Boolean> includeQueryString;

    public Input<Boolean> getIncludeQueryString() {
        return this.includeQueryString == null ? Input.empty() : this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @InputImport(name="queryStringBlacklists")
    private final @Nullable Input<List<String>> queryStringBlacklists;

    public Input<List<String>> getQueryStringBlacklists() {
        return this.queryStringBlacklists == null ? Input.empty() : this.queryStringBlacklists;
    }

    /**
     * Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @InputImport(name="queryStringWhitelists")
    private final @Nullable Input<List<String>> queryStringWhitelists;

    public Input<List<String>> getQueryStringWhitelists() {
        return this.queryStringWhitelists == null ? Input.empty() : this.queryStringWhitelists;
    }

    public BackendServiceCdnPolicyCacheKeyPolicyArgs(
        @Nullable Input<Boolean> includeHost,
        @Nullable Input<Boolean> includeProtocol,
        @Nullable Input<Boolean> includeQueryString,
        @Nullable Input<List<String>> queryStringBlacklists,
        @Nullable Input<List<String>> queryStringWhitelists) {
        this.includeHost = includeHost;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklists = queryStringBlacklists;
        this.queryStringWhitelists = queryStringWhitelists;
    }

    private BackendServiceCdnPolicyCacheKeyPolicyArgs() {
        this.includeHost = Input.empty();
        this.includeProtocol = Input.empty();
        this.includeQueryString = Input.empty();
        this.queryStringBlacklists = Input.empty();
        this.queryStringWhitelists = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> includeHost;
        private @Nullable Input<Boolean> includeProtocol;
        private @Nullable Input<Boolean> includeQueryString;
        private @Nullable Input<List<String>> queryStringBlacklists;
        private @Nullable Input<List<String>> queryStringWhitelists;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyCacheKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklists = defaults.queryStringBlacklists;
    	      this.queryStringWhitelists = defaults.queryStringWhitelists;
        }

        public Builder setIncludeHost(@Nullable Input<Boolean> includeHost) {
            this.includeHost = includeHost;
            return this;
        }

        public Builder setIncludeHost(@Nullable Boolean includeHost) {
            this.includeHost = Input.ofNullable(includeHost);
            return this;
        }

        public Builder setIncludeProtocol(@Nullable Input<Boolean> includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }

        public Builder setIncludeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = Input.ofNullable(includeProtocol);
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Input<Boolean> includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = Input.ofNullable(includeQueryString);
            return this;
        }

        public Builder setQueryStringBlacklists(@Nullable Input<List<String>> queryStringBlacklists) {
            this.queryStringBlacklists = queryStringBlacklists;
            return this;
        }

        public Builder setQueryStringBlacklists(@Nullable List<String> queryStringBlacklists) {
            this.queryStringBlacklists = Input.ofNullable(queryStringBlacklists);
            return this;
        }

        public Builder setQueryStringWhitelists(@Nullable Input<List<String>> queryStringWhitelists) {
            this.queryStringWhitelists = queryStringWhitelists;
            return this;
        }

        public Builder setQueryStringWhitelists(@Nullable List<String> queryStringWhitelists) {
            this.queryStringWhitelists = Input.ofNullable(queryStringWhitelists);
            return this;
        }

        public BackendServiceCdnPolicyCacheKeyPolicyArgs build() {
            return new BackendServiceCdnPolicyCacheKeyPolicyArgs(includeHost, includeProtocol, includeQueryString, queryStringBlacklists, queryStringWhitelists);
        }
    }
}
