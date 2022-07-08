// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SourceRepositoryResponse {
    /**
     * @return The URL pointing to the hosted repository where the function were defined at the time of deployment. It always points to a specific commit in the format described above.
     * 
     */
    private final String deployedUrl;
    /**
     * @return The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats: To refer to a specific commit: `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}revisions/*{@literal /}paths/*` To refer to a moveable alias (branch): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}moveable-aliases/*{@literal /}paths/*` In particular, to refer to HEAD use `master` moveable alias. To refer to a specific fixed alias (tag): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}fixed-aliases/*{@literal /}paths/*` You may omit `paths/*` if you want to use the main directory.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private SourceRepositoryResponse(
        @CustomType.Parameter("deployedUrl") String deployedUrl,
        @CustomType.Parameter("url") String url) {
        this.deployedUrl = deployedUrl;
        this.url = url;
    }

    /**
     * @return The URL pointing to the hosted repository where the function were defined at the time of deployment. It always points to a specific commit in the format described above.
     * 
     */
    public String deployedUrl() {
        return this.deployedUrl;
    }
    /**
     * @return The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats: To refer to a specific commit: `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}revisions/*{@literal /}paths/*` To refer to a moveable alias (branch): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}moveable-aliases/*{@literal /}paths/*` In particular, to refer to HEAD use `master` moveable alias. To refer to a specific fixed alias (tag): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}fixed-aliases/*{@literal /}paths/*` You may omit `paths/*` if you want to use the main directory.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployedUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        public Builder deployedUrl(String deployedUrl) {
            this.deployedUrl = Objects.requireNonNull(deployedUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public SourceRepositoryResponse build() {
            return new SourceRepositoryResponse(deployedUrl, url);
        }
    }
}
