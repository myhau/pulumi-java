// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitSourceContextResponse {
    /**
     * @return Git commit hash.
     * 
     */
    private final String revisionId;
    /**
     * @return Git repository URL.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GitSourceContextResponse(
        @CustomType.Parameter("revisionId") String revisionId,
        @CustomType.Parameter("url") String url) {
        this.revisionId = revisionId;
        this.url = url;
    }

    /**
     * @return Git commit hash.
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }
    /**
     * @return Git repository URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revisionId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GitSourceContextResponse build() {
            return new GitSourceContextResponse(revisionId, url);
        }
    }
}
