// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastore.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIndexPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIndexPlainArgs Empty = new GetIndexPlainArgs();

    @Import(name="indexId", required=true)
    private String indexId;

    public String indexId() {
        return this.indexId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetIndexPlainArgs() {}

    private GetIndexPlainArgs(GetIndexPlainArgs $) {
        this.indexId = $.indexId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIndexPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIndexPlainArgs $;

        public Builder() {
            $ = new GetIndexPlainArgs();
        }

        public Builder(GetIndexPlainArgs defaults) {
            $ = new GetIndexPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder indexId(String indexId) {
            $.indexId = indexId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetIndexPlainArgs build() {
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            return $;
        }
    }

}
