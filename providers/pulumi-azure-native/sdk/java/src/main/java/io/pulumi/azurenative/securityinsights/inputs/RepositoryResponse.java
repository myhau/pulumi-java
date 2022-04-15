// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.ContentPathMapResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * metadata of a repository.
 * 
 */
public final class RepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final RepositoryResponse Empty = new RepositoryResponse();

    /**
     * Branch name of repository.
     * 
     */
    @Import(name="branch")
      private final @Nullable String branch;

    public Optional<String> branch() {
        return this.branch == null ? Optional.empty() : Optional.ofNullable(this.branch);
    }

    /**
     * Url to access repository action logs.
     * 
     */
    @Import(name="deploymentLogsUrl")
      private final @Nullable String deploymentLogsUrl;

    public Optional<String> deploymentLogsUrl() {
        return this.deploymentLogsUrl == null ? Optional.empty() : Optional.ofNullable(this.deploymentLogsUrl);
    }

    /**
     * Display url of repository.
     * 
     */
    @Import(name="displayUrl")
      private final @Nullable String displayUrl;

    public Optional<String> displayUrl() {
        return this.displayUrl == null ? Optional.empty() : Optional.ofNullable(this.displayUrl);
    }

    /**
     * Dictionary of source control content type and path mapping.
     * 
     */
    @Import(name="pathMapping")
      private final @Nullable List<ContentPathMapResponse> pathMapping;

    public List<ContentPathMapResponse> pathMapping() {
        return this.pathMapping == null ? List.of() : this.pathMapping;
    }

    /**
     * Url of repository.
     * 
     */
    @Import(name="url")
      private final @Nullable String url;

    public Optional<String> url() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public RepositoryResponse(
        @Nullable String branch,
        @Nullable String deploymentLogsUrl,
        @Nullable String displayUrl,
        @Nullable List<ContentPathMapResponse> pathMapping,
        @Nullable String url) {
        this.branch = branch;
        this.deploymentLogsUrl = deploymentLogsUrl;
        this.displayUrl = displayUrl;
        this.pathMapping = pathMapping;
        this.url = url;
    }

    private RepositoryResponse() {
        this.branch = null;
        this.deploymentLogsUrl = null;
        this.displayUrl = null;
        this.pathMapping = List.of();
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String deploymentLogsUrl;
        private @Nullable String displayUrl;
        private @Nullable List<ContentPathMapResponse> pathMapping;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deploymentLogsUrl = defaults.deploymentLogsUrl;
    	      this.displayUrl = defaults.displayUrl;
    	      this.pathMapping = defaults.pathMapping;
    	      this.url = defaults.url;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder deploymentLogsUrl(@Nullable String deploymentLogsUrl) {
            this.deploymentLogsUrl = deploymentLogsUrl;
            return this;
        }
        public Builder displayUrl(@Nullable String displayUrl) {
            this.displayUrl = displayUrl;
            return this;
        }
        public Builder pathMapping(@Nullable List<ContentPathMapResponse> pathMapping) {
            this.pathMapping = pathMapping;
            return this;
        }
        public Builder pathMapping(ContentPathMapResponse... pathMapping) {
            return pathMapping(List.of(pathMapping));
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public RepositoryResponse build() {
            return new RepositoryResponse(branch, deploymentLogsUrl, displayUrl, pathMapping, url);
        }
    }
}
