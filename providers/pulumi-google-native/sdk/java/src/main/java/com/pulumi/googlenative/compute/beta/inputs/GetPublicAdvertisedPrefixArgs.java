// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicAdvertisedPrefixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicAdvertisedPrefixArgs Empty = new GetPublicAdvertisedPrefixArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicAdvertisedPrefix", required=true)
    private Output<String> publicAdvertisedPrefix;

    public Output<String> publicAdvertisedPrefix() {
        return this.publicAdvertisedPrefix;
    }

    private GetPublicAdvertisedPrefixArgs() {}

    private GetPublicAdvertisedPrefixArgs(GetPublicAdvertisedPrefixArgs $) {
        this.project = $.project;
        this.publicAdvertisedPrefix = $.publicAdvertisedPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicAdvertisedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicAdvertisedPrefixArgs $;

        public Builder() {
            $ = new GetPublicAdvertisedPrefixArgs();
        }

        public Builder(GetPublicAdvertisedPrefixArgs defaults) {
            $ = new GetPublicAdvertisedPrefixArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder publicAdvertisedPrefix(Output<String> publicAdvertisedPrefix) {
            $.publicAdvertisedPrefix = publicAdvertisedPrefix;
            return this;
        }

        public Builder publicAdvertisedPrefix(String publicAdvertisedPrefix) {
            return publicAdvertisedPrefix(Output.of(publicAdvertisedPrefix));
        }

        public GetPublicAdvertisedPrefixArgs build() {
            $.publicAdvertisedPrefix = Objects.requireNonNull($.publicAdvertisedPrefix, "expected parameter 'publicAdvertisedPrefix' to be non-null");
            return $;
        }
    }

}
