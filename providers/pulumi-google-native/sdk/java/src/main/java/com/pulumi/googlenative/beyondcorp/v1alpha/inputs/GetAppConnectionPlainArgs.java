// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppConnectionPlainArgs Empty = new GetAppConnectionPlainArgs();

    @Import(name="appConnectionId", required=true)
    private String appConnectionId;

    public String appConnectionId() {
        return this.appConnectionId;
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

    private GetAppConnectionPlainArgs() {}

    private GetAppConnectionPlainArgs(GetAppConnectionPlainArgs $) {
        this.appConnectionId = $.appConnectionId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppConnectionPlainArgs $;

        public Builder() {
            $ = new GetAppConnectionPlainArgs();
        }

        public Builder(GetAppConnectionPlainArgs defaults) {
            $ = new GetAppConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appConnectionId(String appConnectionId) {
            $.appConnectionId = appConnectionId;
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

        public GetAppConnectionPlainArgs build() {
            $.appConnectionId = Objects.requireNonNull($.appConnectionId, "expected parameter 'appConnectionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
