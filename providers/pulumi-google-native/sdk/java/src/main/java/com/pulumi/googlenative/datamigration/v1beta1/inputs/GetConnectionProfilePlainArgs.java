// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionProfilePlainArgs Empty = new GetConnectionProfilePlainArgs();

    @Import(name="connectionProfileId", required=true)
    private String connectionProfileId;

    public String connectionProfileId() {
        return this.connectionProfileId;
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

    private GetConnectionProfilePlainArgs() {}

    private GetConnectionProfilePlainArgs(GetConnectionProfilePlainArgs $) {
        this.connectionProfileId = $.connectionProfileId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionProfilePlainArgs $;

        public Builder() {
            $ = new GetConnectionProfilePlainArgs();
        }

        public Builder(GetConnectionProfilePlainArgs defaults) {
            $ = new GetConnectionProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionProfileId(String connectionProfileId) {
            $.connectionProfileId = connectionProfileId;
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

        public GetConnectionProfilePlainArgs build() {
            $.connectionProfileId = Objects.requireNonNull($.connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
