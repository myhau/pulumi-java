// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketPlainArgs Empty = new GetBucketPlainArgs();

    @Import(name="bucketId", required=true)
    private String bucketId;

    public String bucketId() {
        return this.bucketId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBucketPlainArgs() {}

    private GetBucketPlainArgs(GetBucketPlainArgs $) {
        this.bucketId = $.bucketId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketPlainArgs $;

        public Builder() {
            $ = new GetBucketPlainArgs();
        }

        public Builder(GetBucketPlainArgs defaults) {
            $ = new GetBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketId(String bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBucketPlainArgs build() {
            $.bucketId = Objects.requireNonNull($.bucketId, "expected parameter 'bucketId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
