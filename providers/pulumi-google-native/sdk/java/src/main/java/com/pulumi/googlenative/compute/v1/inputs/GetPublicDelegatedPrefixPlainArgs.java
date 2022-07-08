// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicDelegatedPrefixPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicDelegatedPrefixPlainArgs Empty = new GetPublicDelegatedPrefixPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicDelegatedPrefix", required=true)
    private String publicDelegatedPrefix;

    public String publicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetPublicDelegatedPrefixPlainArgs() {}

    private GetPublicDelegatedPrefixPlainArgs(GetPublicDelegatedPrefixPlainArgs $) {
        this.project = $.project;
        this.publicDelegatedPrefix = $.publicDelegatedPrefix;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicDelegatedPrefixPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicDelegatedPrefixPlainArgs $;

        public Builder() {
            $ = new GetPublicDelegatedPrefixPlainArgs();
        }

        public Builder(GetPublicDelegatedPrefixPlainArgs defaults) {
            $ = new GetPublicDelegatedPrefixPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicDelegatedPrefix(String publicDelegatedPrefix) {
            $.publicDelegatedPrefix = publicDelegatedPrefix;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetPublicDelegatedPrefixPlainArgs build() {
            $.publicDelegatedPrefix = Objects.requireNonNull($.publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
